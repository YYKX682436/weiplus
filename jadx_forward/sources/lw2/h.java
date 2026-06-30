package lw2;

/* loaded from: classes2.dex */
public final class h implements nn0.a0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lw2.m f403104d;

    public h(lw2.m mVar) {
        this.f403104d = mVar;
    }

    @Override // nn0.a0
    public void I(boolean z17, float f17, float f18, float f19, java.lang.String str) {
        java.lang.String sessionBuffer;
        if (z17) {
            java.lang.String str2 = "";
            if (str == null) {
                str = "";
            }
            lw2.m mVar = this.f403104d;
            mVar.getClass();
            dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
            jz5.l[] lVarArr = new jz5.l[9];
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14989xf862ae88 c14989xf862ae88 = mVar.f403114f;
            lVarArr[0] = new jz5.l("feed_id", pm0.v.u(c14989xf862ae88 != null ? c14989xf862ae88.getFeedId() : 0L));
            r45.qt2 d17 = mVar.d();
            lVarArr[1] = new jz5.l("finder_context_id", d17 != null ? d17.m75945x2fec8307(1) : null);
            r45.qt2 d18 = mVar.d();
            lVarArr[2] = new jz5.l("finder_tab_context_id", d18 != null ? d18.m75945x2fec8307(2) : null);
            r45.qt2 d19 = mVar.d();
            lVarArr[3] = new jz5.l("comment_scene", d19 != null ? java.lang.Integer.valueOf(d19.m75939xb282bd08(5)) : null);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14989xf862ae88 c14989xf862ae882 = mVar.f403114f;
            if (c14989xf862ae882 != null && (sessionBuffer = c14989xf862ae882.getSessionBuffer()) != null) {
                str2 = sessionBuffer;
            }
            lVarArr[4] = new jz5.l("session_buffer", str2);
            lVarArr[5] = new jz5.l("before_multiple", java.lang.Float.valueOf(f17));
            lVarArr[6] = new jz5.l("after_multiple", java.lang.Float.valueOf(f18));
            lVarArr[7] = new jz5.l("after_auto_multiple", java.lang.Float.valueOf(f19));
            lVarArr[8] = new jz5.l("finder_2finger_sid", str);
            ((cy1.a) rVar).yj("finder_2finger_operation", null, kz5.c1.k(lVarArr), 1, true);
        }
    }

    @Override // nn0.a0
    public void P() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22649x858f5ab m78735x28280f95;
        lw2.m mVar = this.f403104d;
        lw2.o oVar = mVar.f403110b;
        if (!(oVar != null ? oVar.f403128e : false) || mVar.f403111c) {
            return;
        }
        mVar.f403111c = true;
        android.view.View view = (android.view.View) ((jz5.n) mVar.f403117i).mo141623x754a37bb();
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/video/scaleclean/FinderVideoScaleCleanHelper", "onZoomIn", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/video/scaleclean/FinderVideoScaleCleanHelper", "onZoomIn", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setOnClickListener(new lw2.i(mVar));
        }
        mVar.a(true, false);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15285xe7032952 e17 = mVar.e();
        if (e17 != null) {
            hc2.f1.x(e17);
        }
        android.content.Context context = mVar.f403109a.getContext();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa abstractActivityC15087xee12defa = context instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa) context : null;
        if (abstractActivityC15087xee12defa == null || (m78735x28280f95 = abstractActivityC15087xee12defa.m78735x28280f95()) == null) {
            return;
        }
        m78735x28280f95.m81450x8e764904(false);
    }

    @Override // nn0.a0
    public void g0(android.view.MotionEvent motionEvent, int i17, boolean z17) {
        lw2.m mVar = this.f403104d;
        mVar.i();
        mVar.h(i17, z17);
    }

    @Override // nn0.a0
    public void h0(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15324x3354d808 c15324x3354d808;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderVideoScaleCleanUIC", "notifyClipChildren clip: " + z17);
        lw2.m mVar = this.f403104d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15285xe7032952 e17 = mVar.e();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15357x7481f361 c15357x7481f361 = null;
        android.view.ViewGroup viewGroup = e17 != null ? (android.view.ViewGroup) e17.findViewById(com.p314xaae8f345.mm.R.id.jdk) : null;
        if (viewGroup != null) {
            viewGroup.setClipChildren(z17);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15285xe7032952 e18 = mVar.e();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15324x3354d808 c15324x3354d8082 = e18 != null ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15324x3354d808) e18.findViewById(com.p314xaae8f345.mm.R.id.fs6) : null;
        if (c15324x3354d8082 != null) {
            c15324x3354d8082.setClipChildren(z17);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15285xe7032952 e19 = mVar.e();
        if (e19 != null && (c15324x3354d808 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15324x3354d808) e19.findViewById(com.p314xaae8f345.mm.R.id.fs6)) != null) {
            c15357x7481f361 = c15324x3354d808.m62206xf9f03e51();
        }
        if (c15357x7481f361 == null) {
            return;
        }
        c15357x7481f361.setClipChildren(z17);
    }
}
