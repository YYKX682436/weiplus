package kw0;

/* loaded from: classes5.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f394334a;

    /* renamed from: b, reason: collision with root package name */
    public final int f394335b;

    /* renamed from: c, reason: collision with root package name */
    public final kw0.k f394336c;

    public e(java.util.List infoList, int i17, kw0.k updateState) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(infoList, "infoList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(updateState, "updateState");
        this.f394334a = infoList;
        this.f394335b = i17;
        this.f394336c = updateState;
    }

    /* renamed from: equals */
    public boolean m144476xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kw0.e)) {
            return false;
        }
        kw0.e eVar = (kw0.e) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f394334a, eVar.f394334a) && this.f394335b == eVar.f394335b && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f394336c, eVar.f394336c);
    }

    /* renamed from: hashCode */
    public int m144477x8cdac1b() {
        return (((this.f394334a.hashCode() * 31) + java.lang.Integer.hashCode(this.f394335b)) * 31) + this.f394336c.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m144478x9616526c() {
        return "StickerUiState(infoList=" + this.f394334a + ", selectedIndex=" + this.f394335b + ", updateState=" + this.f394336c + ')';
    }

    public /* synthetic */ e(java.util.List list, int i17, kw0.k kVar, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this((i18 & 1) != 0 ? kz5.p0.f395529d : list, (i18 & 2) != 0 ? -1 : i17, (i18 & 4) != 0 ? kw0.f.f394337a : kVar);
    }
}
