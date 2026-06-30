package wh;

/* loaded from: classes8.dex */
public final class d1 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f527292a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f527293b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f527294c;

    /* renamed from: d, reason: collision with root package name */
    public final int f527295d;

    public d1(java.lang.String manufacture, java.lang.String action, java.lang.String settingName, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(manufacture, "manufacture");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(action, "action");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(settingName, "settingName");
        this.f527292a = manufacture;
        this.f527293b = action;
        this.f527294c = settingName;
        this.f527295d = i17;
    }

    /* renamed from: equals */
    public boolean m173767xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wh.d1)) {
            return false;
        }
        wh.d1 d1Var = (wh.d1) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f527292a, d1Var.f527292a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f527293b, d1Var.f527293b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f527294c, d1Var.f527294c) && this.f527295d == d1Var.f527295d;
    }

    /* renamed from: hashCode */
    public int m173768x8cdac1b() {
        java.lang.String str = this.f527292a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        java.lang.String str2 = this.f527293b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        java.lang.String str3 = this.f527294c;
        return ((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.f527295d;
    }

    /* renamed from: toString */
    public java.lang.String m173769x9616526c() {
        return "PowerSaveModeEntry(manufacture=" + this.f527292a + ", action=" + this.f527293b + ", settingName=" + this.f527294c + ", positive=" + this.f527295d + ")";
    }
}
