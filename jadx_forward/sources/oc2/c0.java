package oc2;

/* loaded from: classes8.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f425692a;

    /* renamed from: b, reason: collision with root package name */
    public int f425693b;

    /* renamed from: c, reason: collision with root package name */
    public final int f425694c;

    public c0(boolean z17, int i17, int i18, int i19, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        z17 = (i19 & 1) != 0 ? false : z17;
        i17 = (i19 & 2) != 0 ? 0 : i17;
        i18 = (i19 & 4) != 0 ? 2 : i18;
        this.f425692a = z17;
        this.f425693b = i17;
        this.f425694c = i18;
    }

    /* renamed from: equals */
    public boolean m150980xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oc2.c0)) {
            return false;
        }
        oc2.c0 c0Var = (oc2.c0) obj;
        return this.f425692a == c0Var.f425692a && this.f425693b == c0Var.f425693b && this.f425694c == c0Var.f425694c;
    }

    /* renamed from: hashCode */
    public int m150981x8cdac1b() {
        return (((java.lang.Boolean.hashCode(this.f425692a) * 31) + java.lang.Integer.hashCode(this.f425693b)) * 31) + java.lang.Integer.hashCode(this.f425694c);
    }

    /* renamed from: toString */
    public java.lang.String m150982x9616526c() {
        return "ClientThumbnailReq(enable=" + this.f425692a + ", exceedWidth=" + this.f425693b + ", clientThumbnailNum=" + this.f425694c + ')';
    }
}
