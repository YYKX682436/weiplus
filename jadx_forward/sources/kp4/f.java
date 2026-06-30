package kp4;

/* loaded from: classes10.dex */
public final class f extends kp4.c {

    /* renamed from: d, reason: collision with root package name */
    public final int f392635d;

    /* renamed from: e, reason: collision with root package name */
    public final int f392636e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2333x693b1d6.C18806xf42dd2e6 f392637f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16531xba313450 f392638g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ kp4.h f392639h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(kp4.h hVar, android.view.View itemView, int i17) {
        super(itemView);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemView, "itemView");
        this.f392639h = hVar;
        this.f392635d = i17;
        this.f392636e = i65.a.b(itemView.getContext(), 8);
        android.view.View findViewById = itemView.findViewById(com.p314xaae8f345.mm.R.id.gdt);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f392637f = (com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2333x693b1d6.C18806xf42dd2e6) findViewById;
        android.view.View findViewById2 = itemView.findViewById(com.p314xaae8f345.mm.R.id.f568921oi1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f392638g = (com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16531xba313450) findViewById2;
    }

    @Override // kp4.c
    public void i(kp4.c1 trackInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(trackInfo, "trackInfo");
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2333x693b1d6.C18806xf42dd2e6 c18806xf42dd2e6 = this.f392637f;
        c18806xf42dd2e6.f257521n = true;
        c18806xf42dd2e6.f257522o = true;
        c18806xf42dd2e6.f257523p = false;
        c18806xf42dd2e6.f257524q = false;
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16531xba313450 c16531xba313450 = this.f392638g;
        c16531xba313450.m66833x571ddd95(1999383596);
        c16531xba313450.m66832x4c2ebf2c(true);
        c18806xf42dd2e6.a(trackInfo, this.f392635d, true, true);
        c16531xba313450.m66834x5e352211(new kp4.e(trackInfo, this, true, true, this.f392639h));
        if (trackInfo.f392612i == this.f392639h.f392644f) {
            int showWidth = c18806xf42dd2e6.getShowWidth();
            int i17 = this.f392636e;
            c16531xba313450.d(showWidth - (i17 * 2), c18806xf42dd2e6.getMinWidth(), i17);
        } else {
            c16531xba313450.f230370e = false;
            c16531xba313450.f230371f = 0;
            c16531xba313450.f230372g = 0;
            c16531xba313450.f230375m.setBounds(0, 0, 0, 0);
            c16531xba313450.f230376n.setBounds(0, 0, 0, 0);
            c16531xba313450.invalidate();
        }
        android.view.View view = this.f3639x46306858;
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = c18806xf42dd2e6.m72626xeb160320();
        view.setLayoutParams(layoutParams);
        android.view.ViewGroup.LayoutParams layoutParams2 = c16531xba313450.getLayoutParams();
        layoutParams2.width = c18806xf42dd2e6.m72626xeb160320();
        c16531xba313450.setLayoutParams(layoutParams2);
        android.view.ViewGroup.LayoutParams layoutParams3 = c18806xf42dd2e6.getLayoutParams();
        layoutParams3.width = c18806xf42dd2e6.m72626xeb160320();
        c18806xf42dd2e6.setLayoutParams(layoutParams3);
    }

    @Override // kp4.c
    public void j() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2333x693b1d6.C18806xf42dd2e6 c18806xf42dd2e6 = this.f392637f;
        rm5.k kVar = c18806xf42dd2e6.f257529v;
        if (kVar != null) {
            kVar.mo122875x5cd39ffa();
        }
        c18806xf42dd2e6.f257529v = null;
    }

    @Override // kp4.c
    public void k(kp4.c1 trackInfo, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(trackInfo, "trackInfo");
        int i17 = trackInfo.f392612i;
        int i18 = this.f392639h.f392644f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16531xba313450 c16531xba313450 = this.f392638g;
        if (i17 == i18) {
            int b17 = i65.a.b(this.f3639x46306858.getContext(), 8);
            com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2333x693b1d6.C18806xf42dd2e6 c18806xf42dd2e6 = this.f392637f;
            if (c18806xf42dd2e6.getShowWidth() > 0) {
                c16531xba313450.d(c18806xf42dd2e6.getShowWidth() - (b17 * 2), c18806xf42dd2e6.getMinWidth(), b17);
                return;
            }
            return;
        }
        c16531xba313450.f230370e = false;
        c16531xba313450.f230371f = 0;
        c16531xba313450.f230372g = 0;
        c16531xba313450.f230375m.setBounds(0, 0, 0, 0);
        c16531xba313450.f230376n.setBounds(0, 0, 0, 0);
        c16531xba313450.invalidate();
    }
}
