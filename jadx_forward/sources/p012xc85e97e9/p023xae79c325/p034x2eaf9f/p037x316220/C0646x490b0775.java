package p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.camera.core.impl.AutoValue_Config_Option */
/* loaded from: classes14.dex */
public final class C0646x490b0775<T> extends p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option<T> {

    /* renamed from: id, reason: collision with root package name */
    private final java.lang.String f91721id;

    /* renamed from: token */
    private final java.lang.Object f1428x696b9f9;

    /* renamed from: valueClass */
    private final java.lang.Class<T> f1429x783c6687;

    public C0646x490b0775(java.lang.String str, java.lang.Class<T> cls, java.lang.Object obj) {
        if (str == null) {
            throw new java.lang.NullPointerException("Null id");
        }
        this.f91721id = str;
        if (cls == null) {
            throw new java.lang.NullPointerException("Null valueClass");
        }
        this.f1429x783c6687 = cls;
        this.f1428x696b9f9 = obj;
    }

    /* renamed from: equals */
    public boolean m5109xb2c87fbf(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option)) {
            return false;
        }
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option option = (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option) obj;
        if (this.f91721id.equals(option.mo5110x5db1b11()) && this.f1429x783c6687.equals(option.mo5112x667d1e7d())) {
            java.lang.Object obj2 = this.f1428x696b9f9;
            if (obj2 == null) {
                if (option.mo5111x75346043() == null) {
                    return true;
                }
            } else if (obj2.equals(option.mo5111x75346043())) {
                return true;
            }
        }
        return false;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option
    /* renamed from: getId */
    public java.lang.String mo5110x5db1b11() {
        return this.f91721id;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option
    /* renamed from: getToken */
    public java.lang.Object mo5111x75346043() {
        return this.f1428x696b9f9;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option
    /* renamed from: getValueClass */
    public java.lang.Class<T> mo5112x667d1e7d() {
        return this.f1429x783c6687;
    }

    /* renamed from: hashCode */
    public int m5113x8cdac1b() {
        int hashCode = (((this.f91721id.hashCode() ^ 1000003) * 1000003) ^ this.f1429x783c6687.hashCode()) * 1000003;
        java.lang.Object obj = this.f1428x696b9f9;
        return hashCode ^ (obj == null ? 0 : obj.hashCode());
    }

    /* renamed from: toString */
    public java.lang.String m5114x9616526c() {
        return "Option{id=" + this.f91721id + ", valueClass=" + this.f1429x783c6687 + ", token=" + this.f1428x696b9f9 + "}";
    }
}
