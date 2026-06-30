package hj4;

/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final hj4.a f363193a;

    /* renamed from: b, reason: collision with root package name */
    public int f363194b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f363195c;

    public b(hj4.a aVar, int i17, java.lang.String str, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        aVar = (i18 & 1) != 0 ? null : aVar;
        i17 = (i18 & 2) != 0 ? 0 : i17;
        str = (i18 & 4) != 0 ? "" : str;
        this.f363193a = aVar;
        this.f363194b = i17;
        this.f363195c = str;
    }

    public final int a() {
        if (this.f363194b > 0) {
            return 1;
        }
        return this.f363193a != null ? 2 : 0;
    }

    /* renamed from: equals */
    public boolean m133594xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hj4.b)) {
            return false;
        }
        hj4.b bVar = (hj4.b) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f363193a, bVar.f363193a) && this.f363194b == bVar.f363194b && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f363195c, bVar.f363195c);
    }

    /* renamed from: hashCode */
    public int m133595x8cdac1b() {
        hj4.a aVar = this.f363193a;
        int m133592x8cdac1b = (((aVar == null ? 0 : aVar.m133592x8cdac1b()) * 31) + java.lang.Integer.hashCode(this.f363194b)) * 31;
        java.lang.String str = this.f363195c;
        return m133592x8cdac1b + (str != null ? str.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m133596x9616526c() {
        return "TextStatusNotifyShowInfo(latestNewMsgInfo=" + this.f363193a + ", notifyUnreadCount=" + this.f363194b + ", notifyUnreadCountUser=" + this.f363195c + ')';
    }
}
