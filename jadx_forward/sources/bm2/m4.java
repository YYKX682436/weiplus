package bm2;

/* loaded from: classes3.dex */
public final class m4 {

    /* renamed from: a, reason: collision with root package name */
    public final r45.xn1 f103634a;

    /* renamed from: b, reason: collision with root package name */
    public final int f103635b;

    /* renamed from: c, reason: collision with root package name */
    public final int f103636c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f103637d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f103638e;

    /* renamed from: f, reason: collision with root package name */
    public final int f103639f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.List f103640g;

    public m4(r45.xn1 xn1Var, int i17, int i18, int i19, boolean z17, java.util.LinkedList linkedList, int i27, java.util.List list, int i28, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        z17 = (i28 & 16) != 0 ? false : z17;
        linkedList = (i28 & 32) != 0 ? null : linkedList;
        i27 = (i28 & 64) != 0 ? -1 : i27;
        list = (i28 & 128) != 0 ? null : list;
        this.f103634a = xn1Var;
        this.f103635b = i17;
        this.f103636c = i18;
        this.f103637d = z17;
        this.f103638e = linkedList;
        this.f103639f = i27;
        this.f103640g = list;
    }

    /* renamed from: equals */
    public boolean m10757xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bm2.m4)) {
            return false;
        }
        bm2.m4 m4Var = (bm2.m4) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f103634a, m4Var.f103634a) && this.f103635b == m4Var.f103635b && this.f103636c == m4Var.f103636c && this.f103637d == m4Var.f103637d && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f103638e, m4Var.f103638e) && this.f103639f == m4Var.f103639f && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f103640g, m4Var.f103640g);
    }

    /* renamed from: hashCode */
    public int m10758x8cdac1b() {
        r45.xn1 xn1Var = this.f103634a;
        int hashCode = (((((((((xn1Var == null ? 0 : xn1Var.hashCode()) * 31) + java.lang.Integer.hashCode(this.f103635b)) * 31) + java.lang.Integer.hashCode(this.f103636c)) * 31) + java.lang.Integer.hashCode(0)) * 31) + java.lang.Boolean.hashCode(this.f103637d)) * 31;
        java.util.LinkedList linkedList = this.f103638e;
        int hashCode2 = (((hashCode + (linkedList == null ? 0 : linkedList.hashCode())) * 31) + java.lang.Integer.hashCode(this.f103639f)) * 31;
        java.util.List list = this.f103640g;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m10759x9616526c() {
        return "FinderLiveContactInfo(contact=" + this.f103634a + ", type=" + this.f103635b + ", onlineCnt=" + this.f103636c + ", offlineCnt=0, isMySelf=" + this.f103637d + ", giftItems=" + this.f103638e + ", honorRank=" + this.f103639f + ", honorContacts=" + this.f103640g + ')';
    }
}
