package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/ui/FinderSayHiConvFragment;", "Lcom/tencent/mm/plugin/finder/ui/FinderBaseConversationFragment;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.ui.FinderSayHiConvFragment */
/* loaded from: classes10.dex */
public final class C15058xfdf46a6a extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.C15012x2d1e2eca {
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.C15012x2d1e2eca
    public void L0() {
        if (w0().x().size() == 1 && ((qb2.t) w0().x().get(0)).f65869x2262335f != 1) {
            p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f mo7430x19263085 = mo7430x19263085();
            if (mo7430x19263085 != null) {
                mo7430x19263085.setResult(1);
            }
            p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f mo7430x192630852 = mo7430x19263085();
            if (mo7430x192630852 != null) {
                mo7430x192630852.finish();
            }
            p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f mo7430x192630853 = mo7430x19263085();
            if (mo7430x192630853 != null) {
                mo7430x192630853.overridePendingTransition(0, 0);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.C15012x2d1e2eca, com.p314xaae8f345.mm.p653x55bb7a46.AbstractC10387x3396a951, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22277x94c24639, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onViewCreated */
    public void mo7518x594b1124(android.view.View view, android.os.Bundle bundle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        super.mo7518x594b1124(view, bundle);
        if (w0() instanceof qb2.i0) {
            android.content.Context context = view.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            m92.b j37 = g92.a.j3(g92.b.f351302e, xy2.c.e(context), false, 2, null);
            int m75939xb282bd08 = j37 != null ? j37.u0().m75939xb282bd08(49) : 0;
            if (m75939xb282bd08 == 2 || m75939xb282bd08 == 3) {
                return;
            }
            wn.a w07 = w0();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(w07, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.conv.FinderConversationFirstFixAdapter");
            java.util.ArrayList arrayList = ((qb2.i0) w07).f442755t;
            qb2.t a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t80.f209599e.a();
            a17.f65869x2262335f = 10000;
            a17.G1 = view.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.cqh);
            arrayList.add(a17);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.C15012x2d1e2eca, com.p314xaae8f345.mm.p653x55bb7a46.AbstractC10387x3396a951
    public wn.a t0() {
        qb2.i0 i0Var = new qb2.i0(this);
        i0Var.f442710s = new qb2.l0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.hd.f210858d);
        i0Var.f442709r = new qb2.g0(this, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.id(this), null, 4, null);
        android.os.Bundle m7436x8619eaa0 = m7436x8619eaa0();
        i0Var.f442708q = m7436x8619eaa0 != null ? m7436x8619eaa0.getInt("KEY_TALKER_SCENE", -1) : -1;
        android.os.Bundle m7436x8619eaa02 = m7436x8619eaa0();
        i0Var.f442707p = m7436x8619eaa02 != null ? m7436x8619eaa02.getInt("KEY_TALKER_TYPE", -1) : -1;
        return i0Var;
    }
}
