package ej4;

/* loaded from: classes10.dex */
public final class k implements in5.c {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f334902d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f334903e;

    public k(java.lang.String iconId, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(iconId, "iconId");
        this.f334902d = iconId;
        this.f334903e = str;
    }

    /* renamed from: equals */
    public boolean m127769xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ej4.k)) {
            return false;
        }
        ej4.k kVar = (ej4.k) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f334902d, kVar.f334902d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f334903e, kVar.f334903e);
    }

    @Override // in5.c
    /* renamed from: getItemId */
    public long mo2128x1ed62e84() {
        return m127770x8cdac1b();
    }

    @Override // in5.c
    public int h() {
        return 0;
    }

    /* renamed from: hashCode */
    public int m127770x8cdac1b() {
        int hashCode = this.f334902d.hashCode() * 31;
        java.lang.String str = this.f334903e;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    /* renamed from: toString */
    public java.lang.String m127771x9616526c() {
        return "RecentStatusInfo(iconId=" + this.f334902d + ", statusDesc=" + this.f334903e + ')';
    }
}
