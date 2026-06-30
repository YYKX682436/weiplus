package androidx.camera.core.impl;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes14.dex */
public final class AutoValue_Config_Option<T> extends androidx.camera.core.impl.Config.Option<T> {

    /* renamed from: id, reason: collision with root package name */
    private final java.lang.String f10188id;
    private final java.lang.Object token;
    private final java.lang.Class<T> valueClass;

    public AutoValue_Config_Option(java.lang.String str, java.lang.Class<T> cls, java.lang.Object obj) {
        if (str == null) {
            throw new java.lang.NullPointerException("Null id");
        }
        this.f10188id = str;
        if (cls == null) {
            throw new java.lang.NullPointerException("Null valueClass");
        }
        this.valueClass = cls;
        this.token = obj;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof androidx.camera.core.impl.Config.Option)) {
            return false;
        }
        androidx.camera.core.impl.Config.Option option = (androidx.camera.core.impl.Config.Option) obj;
        if (this.f10188id.equals(option.getId()) && this.valueClass.equals(option.getValueClass())) {
            java.lang.Object obj2 = this.token;
            if (obj2 == null) {
                if (option.getToken() == null) {
                    return true;
                }
            } else if (obj2.equals(option.getToken())) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.core.impl.Config.Option
    public java.lang.String getId() {
        return this.f10188id;
    }

    @Override // androidx.camera.core.impl.Config.Option
    public java.lang.Object getToken() {
        return this.token;
    }

    @Override // androidx.camera.core.impl.Config.Option
    public java.lang.Class<T> getValueClass() {
        return this.valueClass;
    }

    public int hashCode() {
        int hashCode = (((this.f10188id.hashCode() ^ 1000003) * 1000003) ^ this.valueClass.hashCode()) * 1000003;
        java.lang.Object obj = this.token;
        return hashCode ^ (obj == null ? 0 : obj.hashCode());
    }

    public java.lang.String toString() {
        return "Option{id=" + this.f10188id + ", valueClass=" + this.valueClass + ", token=" + this.token + "}";
    }
}
