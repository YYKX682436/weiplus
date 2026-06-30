package androidx.lifecycle;

/* loaded from: classes4.dex */
public abstract class c1 {
    private final java.util.Map<java.lang.String, java.lang.Object> mBagOfTags = new java.util.HashMap();
    private volatile boolean mCleared = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void clear() {
        this.mCleared = true;
        java.util.Map<java.lang.String, java.lang.Object> map = this.mBagOfTags;
        if (map != null) {
            synchronized (map) {
                for (java.lang.Object obj : this.mBagOfTags.values()) {
                    if (obj instanceof java.io.Closeable) {
                        try {
                            ((java.io.Closeable) obj).close();
                        } catch (java.io.IOException e17) {
                            throw new java.lang.RuntimeException(e17);
                        }
                    }
                }
            }
        }
        onCleared();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public <T> T getTag(java.lang.String str) {
        T t17;
        java.util.Map<java.lang.String, java.lang.Object> map = this.mBagOfTags;
        if (map == null) {
            return null;
        }
        synchronized (map) {
            t17 = (T) this.mBagOfTags.get(str);
        }
        return t17;
    }

    public void onCleared() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> T setTagIfAbsent(java.lang.String str, T t17) {
        java.lang.Object obj;
        synchronized (this.mBagOfTags) {
            obj = this.mBagOfTags.get(str);
            if (obj == 0) {
                this.mBagOfTags.put(str, t17);
            }
        }
        if (obj != 0) {
            t17 = obj;
        }
        if (this.mCleared && (t17 instanceof java.io.Closeable)) {
            try {
                ((java.io.Closeable) t17).close();
            } catch (java.io.IOException e17) {
                throw new java.lang.RuntimeException(e17);
            }
        }
        return t17;
    }
}
