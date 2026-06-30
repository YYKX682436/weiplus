package com.p314xaae8f345.mm.ui.p2737x849b4ee1;

/* renamed from: com.tencent.mm.ui.statusbar.DrawStatusBarPreference */
/* loaded from: classes8.dex */
public class ActivityC22486xf35df678 extends com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b {

    /* renamed from: d, reason: collision with root package name */
    public vj5.h f291396d = null;

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: getResourceId */
    public int mo43516x9e0bb9bf() {
        return 0;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getStatusBarColor */
    public int mo78523xb48e4618() {
        return com.p314xaae8f345.mm.ui.uk.b(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.amv), mo78508x85b50c3c());
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f
    /* renamed from: initSwipeBack */
    public void mo64511xb83ef811() {
        super.mo64511xb83ef811();
        if (m78735x28280f95() == null || m78735x28280f95().getChildCount() <= 0) {
            return;
        }
        android.view.View childAt = m78735x28280f95().getChildAt(0);
        m78735x28280f95().removeView(childAt);
        vj5.h hVar = new vj5.h(this);
        this.f291396d = hVar;
        hVar.addView(childAt, new android.widget.FrameLayout.LayoutParams(-1, -1));
        m78735x28280f95().addView(this.f291396d);
        m78735x28280f95().m81446x590ab8fc(this.f291396d);
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: onPreferenceTreeClick */
    public boolean mo26755x5cc6f590(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb) {
        return false;
    }
}
