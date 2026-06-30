package yh2;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final r45.xn1 f543900a;

    /* renamed from: b, reason: collision with root package name */
    public final int f543901b;

    /* renamed from: c, reason: collision with root package name */
    public final int f543902c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f543903d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f543904e;

    public b(r45.xn1 xn1Var, int i17, int i18, int i19, boolean z17, java.util.LinkedList linkedList, int i27, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        z17 = (i27 & 16) != 0 ? false : z17;
        linkedList = (i27 & 32) != 0 ? null : linkedList;
        this.f543900a = xn1Var;
        this.f543901b = i17;
        this.f543902c = i18;
        this.f543903d = z17;
        this.f543904e = linkedList;
    }

    /* renamed from: equals */
    public boolean m177173xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yh2.b)) {
            return false;
        }
        yh2.b bVar = (yh2.b) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f543900a, bVar.f543900a) && this.f543901b == bVar.f543901b && this.f543902c == bVar.f543902c && this.f543903d == bVar.f543903d && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f543904e, bVar.f543904e);
    }

    /* renamed from: hashCode */
    public int m177174x8cdac1b() {
        r45.xn1 xn1Var = this.f543900a;
        int hashCode = (((((((((xn1Var == null ? 0 : xn1Var.hashCode()) * 31) + java.lang.Integer.hashCode(this.f543901b)) * 31) + java.lang.Integer.hashCode(this.f543902c)) * 31) + java.lang.Integer.hashCode(0)) * 31) + java.lang.Boolean.hashCode(this.f543903d)) * 31;
        java.util.LinkedList linkedList = this.f543904e;
        return hashCode + (linkedList != null ? linkedList.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m177175x9616526c() {
        return "FinderLiveContactInfo(contact=" + this.f543900a + ", type=" + this.f543901b + ", onlineCnt=" + this.f543902c + ", offlineCnt=0, isMySelf=" + this.f543903d + ", giftItems=" + this.f543904e + ')';
    }
}
