package rx2;

/* loaded from: classes2.dex */
public final class j extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rx2.p f482509d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(rx2.p pVar) {
        super(0);
        this.f482509d = pVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        rx2.p pVar = this.f482509d;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf activity = pVar.f482516d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p012xc85e97e9.p093xedfae76a.c1 a17 = pf5.z.f435481a.a(activity).a(dv2.a1.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        dv2.a1 a1Var = (dv2.a1) a17;
        if (a1Var.f325339d && (a1Var.f325340e.isEmpty() ^ true)) {
            rx2.l lVar = new rx2.l(pVar);
            rx2.m mVar = new rx2.m(pVar);
            java.util.ArrayList arrayList = a1Var.f325340e;
            if (!arrayList.isEmpty()) {
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1(a1Var.m158354x19263085());
                android.view.View inflate = android.view.LayoutInflater.from(a1Var.m158354x19263085()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570600b61, (android.view.ViewGroup) null);
                android.widget.Button button = (android.widget.Button) inflate.findViewById(com.p314xaae8f345.mm.R.id.f564225lf);
                com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25 = (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25) inflate.findViewById(com.p314xaae8f345.mm.R.id.r2h);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1616x70e39459.C14928x5c34302c c14928x5c34302c = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1616x70e39459.C14928x5c34302c(a1Var.m80379x76847179(), 0, false);
                c22849x81a93d25.mo7967x900dcbe1(c14928x5c34302c);
                c22849x81a93d25.N(new dv2.u0(a1Var.m158354x19263085()));
                new p012xc85e97e9.p103xe821e364.p104xd1075a44.y1().b(c22849x81a93d25);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new vs2.a((r45.m66) it.next()));
                }
                vs2.a aVar = (vs2.a) kz5.n0.Z(arrayList2);
                if (aVar != null) {
                    aVar.f521405e = true;
                }
                com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = new com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf(new in5.s() { // from class: com.tencent.mm.plugin.finder.uic.FinderPostRedPackCoverUIC$buildItemCoverts$1
                    @Override // in5.s
                    /* renamed from: getItemConvert */
                    public in5.r mo43555xf2bb75ea(int type) {
                        return new vs2.b();
                    }
                }, arrayList2, false);
                a1Var.f325344i = c22848x6ddd90cf;
                c22849x81a93d25.mo7960x6cab2c8d(c22848x6ddd90cf);
                c22849x81a93d25.i(new dv2.w0(a1Var, c14928x5c34302c, button));
                android.widget.ImageView imageView = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.bzh);
                android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.odf);
                android.widget.TextView textView2 = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f568867ob5);
                if (imageView != null) {
                    imageView.setOnClickListener(new dv2.x0(lVar, y1Var));
                }
                com.p314xaae8f345.mm.ui.bk.s0(textView.getPaint());
                if (button != null) {
                    button.setOnClickListener(new dv2.y0(a1Var, c14928x5c34302c, y1Var));
                }
                button.setEnabled(((r45.m66) kz5.n0.X(arrayList)).m75939xb282bd08(2) > 0);
                java.lang.String string = a1Var.m158354x19263085().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.m5s);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
                android.text.SpannableString spannableString = new android.text.SpannableString(string);
                spannableString.setSpan(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.yl(string, a1Var.m158354x19263085().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560057a5), a1Var.m158354x19263085().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e), false, false, new dv2.z0(y1Var, mVar)), 0, string.length(), 17);
                if (textView2 != null) {
                    textView2.setOnTouchListener(new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.y0(a1Var.m158354x19263085()));
                }
                if (textView2 != null) {
                    textView2.setText(spannableString);
                }
                y1Var.k(inflate);
                y1Var.s();
            }
        } else {
            pVar.b();
        }
        return jz5.f0.f384359a;
    }
}
