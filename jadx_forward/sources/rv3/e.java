package rv3;

/* loaded from: classes5.dex */
public abstract class e extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final yz5.p f481917e;

    /* renamed from: f, reason: collision with root package name */
    public final ev3.b f481918f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f481919g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f481920h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f481921i = "MicroMsg.AbsMusicPickerListItemConvert";

    public e(yz5.p pVar, ev3.b bVar, boolean z17, boolean z18) {
        this.f481917e = pVar;
        this.f481918f = bVar;
        this.f481919g = z17;
        this.f481920h = z18;
    }

    public static void n(rv3.e eVar, android.view.View view, rv3.v musicState, java.util.List list, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: makeItemContentDescription");
        }
        if ((i17 & 4) != 0) {
            list = kz5.p0.f395529d;
        }
        eVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(musicState, "musicState");
        if (view != null) {
            view.setContentDescription((p3321xbce91901.jvm.p3324x21ffc6bd.o.b(musicState, rv3.y.f481952a) ? i65.a.r(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30867xcad56011.g6m) : "") + com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(list, ","));
        }
    }

    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.dbs;
    }

    @Override // in5.r
    public void i(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, in5.s0 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0151  */
    @Override // in5.r
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void h(in5.s0 r21, rv3.h r22, int r23, int r24, boolean r25, java.util.List r26) {
        /*
            Method dump skipped, instructions count: 560
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rv3.e.h(in5.s0, rv3.h, int, int, boolean, java.util.List):void");
    }

    public void p(android.widget.TextView textView, java.util.ArrayList singers) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(textView, "textView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(singers, "singers");
        textView.setText(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(singers, ","));
    }

    public void q(android.widget.TextView textView, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(textView, "textView");
        textView.setTextColor(i65.a.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30859x5a72f63.f77762x20e833));
    }

    public void r(android.widget.TextView textView, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(textView, "textView");
        textView.setTextColor(i65.a.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30859x5a72f63.f77762x20e833));
    }

    public final void s(java.lang.String str, android.widget.ImageView imageView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imageView, "imageView");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            imageView.setImageDrawable(i65.a.i(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30861xcebc809e.cld));
            return;
        }
        mn2.g1 g1Var = mn2.g1.f411508a;
        vo0.d e17 = g1Var.e();
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
        e17.c(ya2.l.f542035a.e(str, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209889f), imageView, g1Var.h(mn2.f1.f411496q));
    }

    public final void t(int i17, android.view.View backgroundView, com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b pagView, rv3.v musicState) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(backgroundView, "backgroundView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pagView, "pagView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(musicState, "musicState");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f481921i, "setPagViewState listenId:" + i17 + " state:" + musicState);
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(musicState, rv3.w.f481950a) ? true : p3321xbce91901.jvm.p3324x21ffc6bd.o.b(musicState, rv3.x.f481951a) ? true : musicState instanceof rv3.u) {
            if (pagView.f()) {
                pagView.n();
            }
            if (pagView.getVisibility() == 0) {
                pagView.setVisibility(8);
            }
            backgroundView.setBackground(backgroundView.getContext().getResources().getDrawable(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e));
            return;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(musicState, rv3.y.f481952a)) {
            if (!pagView.f()) {
                pagView.g();
            }
            if (pagView.getVisibility() == 8) {
                pagView.setVisibility(0);
            }
            backgroundView.setBackground(backgroundView.getContext().getResources().getDrawable(com.p314xaae8f345.mm.R.C30859x5a72f63.f77911xe61cad92));
        }
    }

    public void u(android.widget.TextView textView, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(textView, "textView");
        textView.setText(str);
    }

    public void v(android.widget.TextView textView, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(textView, "textView");
        textView.setTextColor(i65.a.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832));
    }

    public final void w(android.widget.TextView textView, boolean z17) {
        if (textView == null) {
            return;
        }
        if (z17) {
            textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.p4w);
        } else {
            textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.p4v);
        }
    }
}
