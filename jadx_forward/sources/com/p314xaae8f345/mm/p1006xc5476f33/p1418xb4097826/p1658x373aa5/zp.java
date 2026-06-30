package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes3.dex */
public final class zp {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f215017a;

    /* renamed from: b, reason: collision with root package name */
    public final yz5.l f215018b;

    /* renamed from: c, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 f215019c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f215020d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf f215021e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.gq f215022f;

    public zp(android.content.Context context, yz5.l selectListener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(selectListener, "selectListener");
        this.f215017a = context;
        this.f215018b = selectListener;
        this.f215020d = new java.util.ArrayList();
        this.f215022f = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.gq(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.yp(this));
    }

    public final void a(java.util.List dataList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dataList, "dataList");
        android.content.Context context = this.f215017a;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1(context);
        boolean z17 = false;
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.ap9, (android.view.ViewGroup) new android.widget.FrameLayout(context), false);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f567114i83);
        if (textView != null) {
            com.p314xaae8f345.mm.ui.bk.r0(textView.getPaint(), 0.8f);
        }
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25 = (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25) inflate.findViewById(com.p314xaae8f345.mm.R.id.f567112i81);
        in5.s sVar = new in5.s() { // from class: com.tencent.mm.plugin.finder.view.LiveChargeBottomSheet$createSelectView$2$1
            @Override // in5.s
            /* renamed from: getItemConvert */
            public in5.r mo43555xf2bb75ea(int type) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.zp zpVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.zp.this;
                return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.up(zpVar, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.vp(zpVar));
            }
        };
        java.util.ArrayList arrayList = this.f215020d;
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = new com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf(sVar, arrayList, false);
        c22848x6ddd90cf.f374638o = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.wp(this);
        this.f215021e = c22848x6ddd90cf;
        c22849x81a93d25.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(c22849x81a93d25.getContext()));
        c22849x81a93d25.mo7960x6cab2c8d(this.f215021e);
        ((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) inflate.findViewById(com.p314xaae8f345.mm.R.id.f567111i80)).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.xp(this));
        y1Var.k(inflate);
        y1Var.B.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.b8l);
        y1Var.s();
        arrayList.clear();
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(dataList, 10));
        java.util.Iterator it = dataList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.tp(((java.lang.Number) it.next()).intValue()));
        }
        arrayList.addAll(arrayList2);
        arrayList.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.tp(0));
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf2 = this.f215021e;
        if (c22848x6ddd90cf2 != null) {
            c22848x6ddd90cf2.m8146xced61ae5();
        }
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = context instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf ? (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context : null;
        if (abstractActivityC21394xb3d2c0cf != null && lk5.s.b(abstractActivityC21394xb3d2c0cf)) {
            z17 = true;
        }
        if (z17) {
            android.app.Dialog dialog = y1Var.f293558d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(dialog, "getDialog(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.x7.a(dialog, context);
        }
        this.f215019c = y1Var;
    }
}
