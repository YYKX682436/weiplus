package ev0;

/* loaded from: classes5.dex */
public final class p0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p888x636ee25.C10935x45f3d5c8 f338402d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p888x636ee25.C10935x45f3d5c8 c10935x45f3d5c8) {
        super(0);
        this.f338402d = c10935x45f3d5c8;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        int i17 = com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p888x636ee25.C10935x45f3d5c8.f150725q;
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p888x636ee25.C10935x45f3d5c8 c10935x45f3d5c8 = this.f338402d;
        c10935x45f3d5c8.getClass();
        android.widget.ViewFlipper viewFlipper = new android.widget.ViewFlipper(c10935x45f3d5c8.getContext());
        android.view.View inflate = android.view.LayoutInflater.from(c10935x45f3d5c8.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.ej_, (android.view.ViewGroup) null);
        inflate.findViewById(com.p314xaae8f345.mm.R.id.v_0).setOnClickListener(new ev0.k0(c10935x45f3d5c8));
        inflate.findViewById(com.p314xaae8f345.mm.R.id.v9r).setOnClickListener(new ev0.l0(c10935x45f3d5c8));
        android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.v9z);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        c10935x45f3d5c8.f150734o = (android.widget.TextView) findViewById;
        android.view.View findViewById2 = inflate.findViewById(com.p314xaae8f345.mm.R.id.v9y);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        c10935x45f3d5c8.f150735p = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) findViewById2;
        inflate.findViewById(com.p314xaae8f345.mm.R.id.v9x).setOnClickListener(new ev0.m0(c10935x45f3d5c8));
        viewFlipper.addView(inflate, new android.widget.FrameLayout.LayoutParams(-1, -1));
        android.view.View inflate2 = android.view.LayoutInflater.from(c10935x45f3d5c8.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.ej8, (android.view.ViewGroup) null);
        inflate2.findViewById(com.p314xaae8f345.mm.R.id.v9s).setOnClickListener(new ev0.e0(c10935x45f3d5c8));
        android.view.View findViewById3 = inflate2.findViewById(com.p314xaae8f345.mm.R.id.sbp);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        com.p314xaae8f345.mm.ui.fk.a((android.widget.TextView) findViewById3);
        android.view.View findViewById4 = inflate2.findViewById(com.p314xaae8f345.mm.R.id.sbr);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        com.p314xaae8f345.mm.ui.fk.a((android.widget.TextView) findViewById4);
        android.view.View findViewById5 = inflate2.findViewById(com.p314xaae8f345.mm.R.id.shv);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById5, "findViewById(...)");
        ((com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p902x4fe3eeaf.C10963x9da302b1) findViewById5).m47237xf00f287e(new ev0.f0(c10935x45f3d5c8));
        android.view.View findViewById6 = inflate2.findViewById(com.p314xaae8f345.mm.R.id.unq);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById6, "findViewById(...)");
        ((com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p902x4fe3eeaf.C10963x9da302b1) findViewById6).m47237xf00f287e(new ev0.g0(c10935x45f3d5c8));
        if (c10935x45f3d5c8.f150726d) {
            p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a787 = (p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787) inflate2.findViewById(com.p314xaae8f345.mm.R.id.sbs);
            android.view.View findViewById7 = c1073x7e08a787.findViewById(com.p314xaae8f345.mm.R.id.sbq);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById7, arrayList.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/music/SoundTrackPanel", "createAdjustVolumeView", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById7.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById7, "com/tencent/mm/mj_publisher/finder/movie_composing/music/SoundTrackPanel", "createAdjustVolumeView", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View findViewById8 = c1073x7e08a787.findViewById(com.p314xaae8f345.mm.R.id.sbo);
            p012xc85e97e9.p071xe6df7747.p072xd1075a44.c cVar = new p012xc85e97e9.p071xe6df7747.p072xd1075a44.c();
            cVar.d(c1073x7e08a787);
            cVar.c(findViewById8.getId(), 4);
            cVar.e(findViewById8.getId(), 4, 0, 4);
            cVar.b(c1073x7e08a787);
            c1073x7e08a787.m7179xd020a803(null);
        }
        viewFlipper.addView(inflate2, new android.widget.FrameLayout.LayoutParams(-1, -1));
        android.view.View inflate3 = android.view.LayoutInflater.from(c10935x45f3d5c8.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.ej9, (android.view.ViewGroup) null);
        inflate3.findViewById(com.p314xaae8f345.mm.R.id.v9v).setOnClickListener(new ev0.h0(c10935x45f3d5c8));
        inflate3.findViewById(com.p314xaae8f345.mm.R.id.v9w).setOnClickListener(new ev0.i0(c10935x45f3d5c8));
        viewFlipper.addView(inflate3, new android.widget.FrameLayout.LayoutParams(-1, -1));
        return viewFlipper;
    }
}
