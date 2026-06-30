package bm2;

/* loaded from: classes3.dex */
public final class m4 {

    /* renamed from: a, reason: collision with root package name */
    public final r45.xn1 f22101a;

    /* renamed from: b, reason: collision with root package name */
    public final int f22102b;

    /* renamed from: c, reason: collision with root package name */
    public final int f22103c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f22104d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f22105e;

    /* renamed from: f, reason: collision with root package name */
    public final int f22106f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.List f22107g;

    public m4(r45.xn1 xn1Var, int i17, int i18, int i19, boolean z17, java.util.LinkedList linkedList, int i27, java.util.List list, int i28, kotlin.jvm.internal.i iVar) {
        z17 = (i28 & 16) != 0 ? false : z17;
        linkedList = (i28 & 32) != 0 ? null : linkedList;
        i27 = (i28 & 64) != 0 ? -1 : i27;
        list = (i28 & 128) != 0 ? null : list;
        this.f22101a = xn1Var;
        this.f22102b = i17;
        this.f22103c = i18;
        this.f22104d = z17;
        this.f22105e = linkedList;
        this.f22106f = i27;
        this.f22107g = list;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bm2.m4)) {
            return false;
        }
        bm2.m4 m4Var = (bm2.m4) obj;
        return kotlin.jvm.internal.o.b(this.f22101a, m4Var.f22101a) && this.f22102b == m4Var.f22102b && this.f22103c == m4Var.f22103c && this.f22104d == m4Var.f22104d && kotlin.jvm.internal.o.b(this.f22105e, m4Var.f22105e) && this.f22106f == m4Var.f22106f && kotlin.jvm.internal.o.b(this.f22107g, m4Var.f22107g);
    }

    public int hashCode() {
        r45.xn1 xn1Var = this.f22101a;
        int hashCode = (((((((((xn1Var == null ? 0 : xn1Var.hashCode()) * 31) + java.lang.Integer.hashCode(this.f22102b)) * 31) + java.lang.Integer.hashCode(this.f22103c)) * 31) + java.lang.Integer.hashCode(0)) * 31) + java.lang.Boolean.hashCode(this.f22104d)) * 31;
        java.util.LinkedList linkedList = this.f22105e;
        int hashCode2 = (((hashCode + (linkedList == null ? 0 : linkedList.hashCode())) * 31) + java.lang.Integer.hashCode(this.f22106f)) * 31;
        java.util.List list = this.f22107g;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "FinderLiveContactInfo(contact=" + this.f22101a + ", type=" + this.f22102b + ", onlineCnt=" + this.f22103c + ", offlineCnt=0, isMySelf=" + this.f22104d + ", giftItems=" + this.f22105e + ", honorRank=" + this.f22106f + ", honorContacts=" + this.f22107g + ')';
    }
}
