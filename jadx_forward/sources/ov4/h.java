package ov4;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final int f430769a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f430770b;

    /* renamed from: c, reason: collision with root package name */
    public final int f430771c;

    public h(int i17, java.lang.String title, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(title, "title");
        this.f430769a = i17;
        this.f430770b = title;
        this.f430771c = i18;
    }

    public final java.lang.String a() {
        return this.f430769a + '|' + this.f430771c + '|' + fp.s0.b(this.f430770b, com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6);
    }

    /* renamed from: equals */
    public boolean m157231xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ov4.h)) {
            return false;
        }
        ov4.h hVar = (ov4.h) obj;
        return this.f430769a == hVar.f430769a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f430770b, hVar.f430770b) && this.f430771c == hVar.f430771c;
    }

    /* renamed from: hashCode */
    public int m157232x8cdac1b() {
        return (((java.lang.Integer.hashCode(this.f430769a) * 31) + this.f430770b.hashCode()) * 31) + java.lang.Integer.hashCode(this.f430771c);
    }

    /* renamed from: toString */
    public java.lang.String m157233x9616526c() {
        return "FTSTeachReportItemInfo(pos=" + this.f430769a + ", title=" + this.f430770b + ", type=" + this.f430771c + ')';
    }
}
