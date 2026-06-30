package jk2;

/* loaded from: classes3.dex */
public final class g extends jk2.j {

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f381599e;

    /* renamed from: f, reason: collision with root package name */
    public kk2.p f381600f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(jk2.a plugin, r45.zd2 guideData) {
        super(plugin, guideData);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(plugin, "plugin");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(guideData, "guideData");
        this.f381599e = jz5.h.b(jk2.f.f381598d);
    }

    @Override // jk2.j
    public boolean a() {
        boolean z17 = ((com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) ((jz5.n) this.f381599e).mo141623x754a37bb()).getInt("live_close_square_guide_forbid_tips", 0) == 1;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f381605d, "checkGuideShow hadForbid: " + z17);
        return !z17;
    }

    @Override // jk2.j
    public java.lang.String e() {
        return "GoSquareGuide";
    }

    @Override // jk2.j
    public boolean f() {
        kk2.p pVar = this.f381600f;
        return (pVar == null || pVar.z()) ? false : true;
    }

    @Override // jk2.j
    public void h() {
        this.f381600f = new kk2.p(this.f381602a, this.f381603b);
    }

    @Override // jk2.j
    public void i() {
        kk2.p pVar = this.f381600f;
        if (pVar != null) {
            pVar.w();
        }
    }

    @Override // jk2.j
    public void k() {
        super.k();
        kk2.p pVar = this.f381600f;
        if (pVar != null) {
            pVar.A(true);
        }
    }

    @Override // jk2.j
    public void l() {
        this.f381600f = null;
    }
}
