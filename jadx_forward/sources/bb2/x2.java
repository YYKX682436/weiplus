package bb2;

/* loaded from: classes5.dex */
public final class x2 extends yp.p {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f100606a;

    /* renamed from: b, reason: collision with root package name */
    public yz5.p f100607b;

    /* renamed from: c, reason: collision with root package name */
    public yz5.l f100608c;

    public x2(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f100606a = context;
    }

    @Override // yp.p, yp.a
    public boolean a(wp.a aVar) {
        return aVar instanceof bb2.v2;
    }

    @Override // yp.p
    public int j(java.lang.Object obj) {
        return 0;
    }

    @Override // yp.p
    public void l(int i17, yp.o viewHolder, wp.i danmaku) {
        android.text.SpannableString i18;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewHolder, "viewHolder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(danmaku, "danmaku");
        java.lang.Object obj = danmaku.f529887y;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.bullet.FinderBulletInfo");
        bb2.o oVar = (bb2.o) obj;
        bb2.b bVar = (bb2.b) viewHolder;
        i95.m c17 = i95.n0.c(cq.k.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        int intValue = ((java.lang.Number) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.R().r()).intValue();
        android.content.Context context = this.f100606a;
        int color = intValue != 1 ? intValue != 2 ? intValue != 3 ? context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560779ty) : context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560778tx) : context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560777al4) : context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560776tv);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15217xc42aa699 c15217xc42aa699 = bVar.f100339f;
        c15217xc42aa699.m62513xe1d3a649(color);
        int intValue2 = ((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209205e5).mo141623x754a37bb()).r()).intValue();
        if (intValue2 <= 0) {
            intValue2 = 17;
        }
        c15217xc42aa699.setTextSize(0, ym5.x.a(context, intValue2));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TextDanmakuRender", "onBindViewHolder: bulletTextSize=" + intValue2);
        java.lang.String m75945x2fec8307 = oVar.f100459a.m75945x2fec8307(2);
        int m75939xb282bd08 = oVar.f100459a.m75939xb282bd08(6);
        android.widget.ImageView imageView = bVar.f100338e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15217xc42aa699 c15217xc42aa6992 = bVar.f100339f;
        if (m75939xb282bd08 == 1) {
            imageView.setVisibility(8);
            c15217xc42aa6992.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560035m));
            c15217xc42aa6992.m61617xccf3a870(false);
        } else if (m75939xb282bd08 != 2) {
            imageView.setVisibility(8);
            c15217xc42aa6992.setTextColor(-1);
            c15217xc42aa6992.m61617xccf3a870(true);
        } else {
            imageView.setVisibility(0);
            imageView.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.c3x);
            imageView.getLayoutParams().width = context.getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561239d1);
            c15217xc42aa6992.setTextColor(-1);
            c15217xc42aa6992.m61617xccf3a870(true);
        }
        bb2.v2 v2Var = danmaku instanceof bb2.v2 ? (bb2.v2) danmaku : null;
        if (v2Var == null || (i18 = v2Var.f100557J) == null) {
            ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).getClass();
            i18 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context, m75945x2fec8307);
        }
        c15217xc42aa699.setText(i18);
        bVar.g(oVar);
        bVar.f100342i.setOnClickListener(new bb2.w2(this, danmaku));
    }

    @Override // yp.p
    public yp.o m(int i17) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        android.view.View inflate = android.view.LayoutInflater.from(this.f100606a).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bxe, (android.view.ViewGroup) null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        bb2.b bVar = new bb2.b(inflate);
        com.p314xaae8f345.mm.ui.bk.r0(bVar.f100339f.getPaint(), 0.8f);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TextDanmakuRender", "onCreateViewHolder: cost = " + (java.lang.System.currentTimeMillis() - currentTimeMillis));
        return bVar;
    }

    @Override // yp.p, yp.a
    /* renamed from: n */
    public void g(wp.i iVar, xp.d dVar, float f17, float f18, android.view.View view) {
        super.g(iVar, dVar, f17, f18, view);
        if (iVar instanceof bb2.c) {
            bb2.c cVar = (bb2.c) iVar;
            if (cVar.K) {
                int h17 = cVar.h();
                cq.k1.a();
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
                if (cVar.D < h17 * (((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209515v6).mo141623x754a37bb()).r()).floatValue() + 0.02f)) {
                    yp.o oVar = cVar.H;
                    bb2.b bVar = oVar instanceof bb2.b ? (bb2.b) oVar : null;
                    if (bVar != null) {
                        hc2.f1.e(bVar.f100337d);
                        cVar.K = false;
                    }
                }
            }
        }
    }

    @Override // yp.p
    public void o(wp.i iVar, xp.d dVar) {
        yz5.p pVar;
        java.lang.Object obj = iVar != null ? iVar.f529887y : null;
        bb2.o oVar = obj instanceof bb2.o ? (bb2.o) obj : null;
        if (oVar == null || (pVar = this.f100607b) == null) {
            return;
        }
        pVar.mo149xb9724478(java.lang.Long.valueOf(oVar.a()), oVar.f100459a.m75945x2fec8307(11));
    }
}
