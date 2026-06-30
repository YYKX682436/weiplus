package uy3;

/* loaded from: classes8.dex */
public final class o0 {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504 f513519a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f513520b;

    public o0(com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504 c11286x34a5504, java.lang.String str) {
        this.f513519a = c11286x34a5504;
        this.f513520b = str;
    }

    /* renamed from: equals */
    public boolean m170711xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uy3.o0)) {
            return false;
        }
        uy3.o0 o0Var = (uy3.o0) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f513519a, o0Var.f513519a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f513520b, o0Var.f513520b);
    }

    /* renamed from: hashCode */
    public int m170712x8cdac1b() {
        com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504 c11286x34a5504 = this.f513519a;
        int hashCode = (c11286x34a5504 == null ? 0 : c11286x34a5504.hashCode()) * 31;
        java.lang.String str = this.f513520b;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m170713x9616526c() {
        return "ScanBoxShareInfo(appMsg=" + this.f513519a + ", imageUrl=" + this.f513520b + ')';
    }
}
