package com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5;

/* loaded from: classes10.dex */
public final class v3 implements in5.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.AbstractC16697x9da72997 f233503d;

    public v3(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.AbstractC16697x9da72997 abstractC16697x9da72997) {
        this.f233503d = abstractC16697x9da72997;
    }

    @Override // in5.x
    public void s2(p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 adapter, android.view.View view, int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.t3 t3Var;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd01666;
        java.util.LinkedList<com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e> m76962x74cd162e;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e c19788xd7cfd73e;
        in5.s0 holder = (in5.s0) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adapter, "adapter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf) adapter;
        if (i17 < 0 && i17 >= c22848x6ddd90cf.mo1894x7e414b06()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Music.MusicMvTabFragment", "invalid position:" + i17);
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.q3 q3Var = (com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.q3) kz5.n0.a0(c22848x6ddd90cf.m82898xfb7e5820(), i17);
        if (q3Var == null || (t3Var = q3Var.f233460d) == null || (c19792x256d2725 = t3Var.f233485b) == null || (m76802x2dd01666 = c19792x256d2725.m76802x2dd01666()) == null || (m76962x74cd162e = m76802x2dd01666.m76962x74cd162e()) == null || (c19788xd7cfd73e = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e) kz5.n0.Z(m76962x74cd162e)) == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.AbstractC16697x9da72997 abstractC16697x9da72997 = this.f233503d;
        android.content.Context context = abstractC16697x9da72997.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        boolean P6 = ((com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.c3) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.c3.class)).P6();
        bm3.e eVar = abstractC16697x9da72997.f233259v;
        if (P6) {
            adapter.m8147xed6e4d18(i17);
            com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.o3 o3Var = abstractC16697x9da72997.getCom.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER java.lang.String();
            if (o3Var != null) {
                com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 musicFeedsRecyclerView = eVar.f104045b;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(musicFeedsRecyclerView, "musicFeedsRecyclerView");
                ((com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.g0) o3Var).a(0, t3Var, i17, view, musicFeedsRecyclerView, abstractC16697x9da72997.mo67358xfb85f7b0());
                return;
            }
            return;
        }
        if (c19788xd7cfd73e.m76629x36bbd779() < lm3.d0.c(abstractC16697x9da72997.f233256s)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Music.MusicMvTabFragment", "post fail, duration:" + c19788xd7cfd73e.m76629x36bbd779());
            db5.t7.m(abstractC16697x9da72997.getContext(), abstractC16697x9da72997.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.h5b, java.lang.Integer.valueOf(lm3.d0.c(abstractC16697x9da72997.f233256s))));
            return;
        }
        int m76629x36bbd779 = c19788xd7cfd73e.m76629x36bbd779();
        int i18 = abstractC16697x9da72997.f233255r;
        if (m76629x36bbd779 > lm3.d0.b(i18)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Music.MusicMvTabFragment", "post fail, duration:" + c19788xd7cfd73e.m76629x36bbd779());
            db5.t7.m(abstractC16697x9da72997.getContext(), abstractC16697x9da72997.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.h5c, java.lang.Integer.valueOf(lm3.d0.b(i18))));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Music.MusicMvTabFragment", "post feedId:".concat(pm0.v.u(t3Var.f233484a)));
        fm3.g0.f345606d = i17;
        fm3.g0.f345605c = abstractC16697x9da72997.mo67347x7063afde();
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.o3 o3Var2 = abstractC16697x9da72997.getCom.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER java.lang.String();
        if (o3Var2 != null) {
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 musicFeedsRecyclerView2 = eVar.f104045b;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(musicFeedsRecyclerView2, "musicFeedsRecyclerView");
            ((com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.g0) o3Var2).a(0, t3Var, i17, view, musicFeedsRecyclerView2, abstractC16697x9da72997.mo67358xfb85f7b0());
        }
    }
}
