package ea2;

/* loaded from: classes2.dex */
public final class l implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.p1425x636ee25.uic.C13650x1bf60d72 f332100d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f332101e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f332102f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f332103g;

    public l(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.p1425x636ee25.uic.C13650x1bf60d72 c13650x1bf60d72, java.util.List list, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var) {
        this.f332100d = c13650x1bf60d72;
        this.f332101e = list;
        this.f332102f = i17;
        this.f332103g = h0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        r45.hj2 hj2Var;
        java.util.LinkedList m75941xfb821914;
        android.view.Window window;
        android.view.View decorView;
        android.view.Window window2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/activity/music/uic/FinderMusicTopicHeaderUIC$initArtist$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.p1425x636ee25.uic.C13650x1bf60d72 c13650x1bf60d72 = this.f332100d;
        if (c13650x1bf60d72.f183292g == null) {
            android.view.View inflate = android.view.LayoutInflater.from(c13650x1bf60d72.m80379x76847179()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.adr, (android.view.ViewGroup) null, false);
            y9.i iVar = new y9.i(c13650x1bf60d72.m80379x76847179(), com.p314xaae8f345.mm.R.C30868x68b1db1.f81563do);
            c13650x1bf60d72.f183292g = iVar;
            iVar.setContentView(inflate);
            y9.i iVar2 = c13650x1bf60d72.f183292g;
            if (iVar2 != null && (window2 = iVar2.getWindow()) != null) {
                window2.setDimAmount(0.4f);
            }
            y9.i iVar3 = c13650x1bf60d72.f183292g;
            if (iVar3 != null && (window = iVar3.getWindow()) != null && (decorView = window.getDecorView()) != null) {
                decorView.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.ayr);
            }
            y9.i iVar4 = c13650x1bf60d72.f183292g;
            if (iVar4 != null) {
                iVar4.setOnDismissListener(new ea2.f0(c13650x1bf60d72));
            }
            android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.e8x);
            if (textView != null) {
                com.p314xaae8f345.mm.ui.bk.r0(textView.getPaint(), 0.8f);
                r45.r03 r03Var = (r45.r03) c13650x1bf60d72.f534252d;
                textView.setText(textView.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.eqh, java.lang.Integer.valueOf((r03Var == null || (hj2Var = (r45.hj2) r03Var.m75936x14adae67(19)) == null || (m75941xfb821914 = hj2Var.m75941xfb821914(2)) == null) ? 0 : m75941xfb821914.size())));
            }
            android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.e8u);
            if (findViewById != null) {
                findViewById.setOnClickListener(new ea2.g0(c13650x1bf60d72));
            }
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25 = (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25) inflate.findViewById(com.p314xaae8f345.mm.R.id.e8w);
            c22849x81a93d25.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(c13650x1bf60d72.m158354x19263085(), 1, false));
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.Iterator it = this.f332101e.iterator();
            while (it.hasNext()) {
                arrayList2.add(new z92.a((r45.iw2) it.next()));
            }
            c22849x81a93d25.mo7960x6cab2c8d(new com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf(new in5.s() { // from class: com.tencent.mm.plugin.finder.activity.music.uic.FinderMusicTopicHeaderUIC$buildItemCoverts$1
                @Override // in5.s
                /* renamed from: getItemConvert */
                public in5.r mo43555xf2bb75ea(int type) {
                    return new ca2.c();
                }
            }, arrayList2, false));
        }
        y9.i iVar5 = c13650x1bf60d72.f183292g;
        if (iVar5 != null) {
            iVar5.show();
        }
        fa2.a aVar = fa2.a.f342239a;
        android.app.Activity m80379x76847179 = c13650x1bf60d72.m80379x76847179();
        r45.r03 r03Var2 = (r45.r03) c13650x1bf60d72.f534252d;
        aVar.b(m80379x76847179, 1, r03Var2 != null ? (r45.hj2) r03Var2.m75936x14adae67(19) : null, this.f332102f, (java.lang.String) this.f332103g.f391656d);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/activity/music/uic/FinderMusicTopicHeaderUIC$initArtist$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
