package xn2;

/* loaded from: classes2.dex */
public final class s0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.mj {

    /* renamed from: e, reason: collision with root package name */
    public boolean f537107e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ xn2.f1 f537108f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(xn2.f1 f1Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15343x638a173f c15343x638a173f) {
        super(c15343x638a173f);
        this.f537108f = f1Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c15343x638a173f);
        this.f537107e = true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.mj
    public void b() {
        xn2.f1 f1Var = this.f537108f;
        int e17 = ((xn2.p0) f1Var.f537026e).e();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.MegaVideoViewCallback", "updateState data size = " + e17);
        jz5.g gVar = f1Var.f537031m;
        if (e17 <= 0) {
            android.view.View view = (android.view.View) ((jz5.n) gVar).mo141623x754a37bb();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/megavideo/topstory/flow/contract/MegaVideoViewCallback$getIViewCallback$1", "updateState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/megavideo/topstory/flow/contract/MegaVideoViewCallback$getIViewCallback$1", "updateState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View view2 = (android.view.View) ((jz5.n) gVar).mo141623x754a37bb();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/megavideo/topstory/flow/contract/MegaVideoViewCallback$getIViewCallback$1", "updateState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/megavideo/topstory/flow/contract/MegaVideoViewCallback$getIViewCallback$1", "updateState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        f1Var.g().setVisibility(8);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.mj, ym5.m1
    /* renamed from: onItemRangeChanged */
    public void mo56049xa44dd169(int i17, int i18) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m62367x4905e9fa;
        super.mo56049xa44dd169(i17, i18);
        if (!this.f537107e || i18 <= 0) {
            return;
        }
        this.f537107e = false;
        xn2.f1 f1Var = this.f537108f;
        android.app.Activity context = f1Var.f537025d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        p012xc85e97e9.p093xedfae76a.c1 a17 = zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        fc2.o Z6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) a17).Z6(-1);
        if (Z6 == null || (m62367x4905e9fa = f1Var.j().m62367x4905e9fa()) == null) {
            return;
        }
        new fc2.i(Z6).mo481x4d79408f(m62367x4905e9fa, 5);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.MegaVideoViewCallback", "first item change,positionStart=" + i17 + ",itemCount=" + i18);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.mj, ym5.p1
    /* renamed from: onPreFinishLoadMore */
    public void mo15403x2053b072(ym5.s3 reason) {
        android.view.View view;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reason, "reason");
        super.mo15403x2053b072(reason);
        if (reason.f545056h <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.MegaVideoViewCallback", "no more loadMore data!");
            on5.c m82923x19404fcc = this.f537108f.j().m82923x19404fcc();
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22627xa933f8e4 c22627xa933f8e4 = (m82923x19404fcc == null || (view = m82923x19404fcc.getView()) == null) ? null : (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22627xa933f8e4) view.findViewById(com.p314xaae8f345.mm.R.id.ilh);
            if (c22627xa933f8e4 == null) {
                return;
            }
            c22627xa933f8e4.setVisibility(8);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.mj, ym5.p1
    /* renamed from: onPreFinishRefresh */
    public void mo15404x8041b4e4(ym5.s3 reason) {
        android.view.View view;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reason, "reason");
        super.mo15404x8041b4e4(reason);
        if (reason.f545056h <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.MegaVideoViewCallback", "no more refresh data!");
            on5.d m82929x3feb4d92 = this.f537108f.j().m82929x3feb4d92();
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22627xa933f8e4 c22627xa933f8e4 = (m82929x3feb4d92 == null || (view = m82929x3feb4d92.getView()) == null) ? null : (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22627xa933f8e4) view.findViewById(com.p314xaae8f345.mm.R.id.f568121lr5);
            if (c22627xa933f8e4 == null) {
                return;
            }
            c22627xa933f8e4.setVisibility(8);
        }
    }
}
