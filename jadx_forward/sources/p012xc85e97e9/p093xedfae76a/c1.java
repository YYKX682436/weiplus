package p012xc85e97e9.p093xedfae76a;

/* loaded from: classes4.dex */
public abstract class c1 {

    /* renamed from: mBagOfTags */
    private final java.util.Map<java.lang.String, java.lang.Object> f3536x6e717ecb = new java.util.HashMap();

    /* renamed from: mCleared */
    private volatile boolean f3537xd12a167f = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: clear */
    public final void m7790x5a5b64d() {
        this.f3537xd12a167f = true;
        java.util.Map<java.lang.String, java.lang.Object> map = this.f3536x6e717ecb;
        if (map != null) {
            synchronized (map) {
                for (java.lang.Object obj : this.f3536x6e717ecb.values()) {
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
        mo528x82b764cd();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: getTag */
    public <T> T m7791xb5887064(java.lang.String str) {
        T t17;
        java.util.Map<java.lang.String, java.lang.Object> map = this.f3536x6e717ecb;
        if (map == null) {
            return null;
        }
        synchronized (map) {
            t17 = (T) this.f3536x6e717ecb.get(str);
        }
        return t17;
    }

    /* renamed from: onCleared */
    public void mo528x82b764cd() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: setTagIfAbsent */
    public <T> T m7792x46b076ae(java.lang.String str, T t17) {
        java.lang.Object obj;
        synchronized (this.f3536x6e717ecb) {
            obj = this.f3536x6e717ecb.get(str);
            if (obj == 0) {
                this.f3536x6e717ecb.put(str, t17);
            }
        }
        if (obj != 0) {
            t17 = obj;
        }
        if (this.f3537xd12a167f && (t17 instanceof java.io.Closeable)) {
            try {
                ((java.io.Closeable) t17).close();
            } catch (java.io.IOException e17) {
                throw new java.lang.RuntimeException(e17);
            }
        }
        return t17;
    }
}
