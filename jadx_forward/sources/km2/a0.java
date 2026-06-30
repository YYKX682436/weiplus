package km2;

/* loaded from: classes3.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.LinkedList f390582a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f390583b;

    public a0(java.util.LinkedList chatroomList, java.lang.String str, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        chatroomList = (i17 & 1) != 0 ? new java.util.LinkedList() : chatroomList;
        str = (i17 & 2) != 0 ? null : str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(chatroomList, "chatroomList");
        this.f390582a = chatroomList;
        this.f390583b = str;
    }

    /* renamed from: equals */
    public boolean m143641xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof km2.a0)) {
            return false;
        }
        km2.a0 a0Var = (km2.a0) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f390582a, a0Var.f390582a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f390583b, a0Var.f390583b);
    }

    /* renamed from: hashCode */
    public int m143642x8cdac1b() {
        int hashCode = this.f390582a.hashCode() * 31;
        java.lang.String str = this.f390583b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    /* renamed from: toString */
    public java.lang.String m143643x9616526c() {
        return "LuckyMoneyLiveData(chatroomList=" + this.f390582a + ", clientBuff=" + this.f390583b + ')';
    }
}
