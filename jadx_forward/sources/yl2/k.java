package yl2;

/* loaded from: classes3.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final int f544567a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f544568b;

    /* renamed from: c, reason: collision with root package name */
    public final r45.j01 f544569c;

    public k(int i17, java.lang.String str, r45.j01 j01Var) {
        this.f544567a = i17;
        this.f544568b = str;
        this.f544569c = j01Var;
    }

    /* renamed from: equals */
    public boolean m177260xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yl2.k)) {
            return false;
        }
        yl2.k kVar = (yl2.k) obj;
        return this.f544567a == kVar.f544567a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f544568b, kVar.f544568b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f544569c, kVar.f544569c);
    }

    /* renamed from: hashCode */
    public int m177261x8cdac1b() {
        int hashCode = java.lang.Integer.hashCode(this.f544567a) * 31;
        java.lang.String str = this.f544568b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        r45.j01 j01Var = this.f544569c;
        return hashCode2 + (j01Var != null ? j01Var.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m177262x9616526c() {
        return "LivePrepareInfo(errCode=" + this.f544567a + ", errMsg=" + this.f544568b + ", resp=" + this.f544569c + ')';
    }
}
