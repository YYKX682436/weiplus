package com.p314xaae8f345.mm.ui.p2737x849b4ee1;

/* renamed from: com.tencent.mm.ui.statusbar.DrawStatusBarActivity */
/* loaded from: classes7.dex */
public abstract class AbstractActivityC22485x9ef8efec extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {

    /* renamed from: d, reason: collision with root package name */
    public vj5.h f291395d = null;

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getStatusBarColor */
    public int mo78523xb48e4618() {
        return mo78508x85b50c3c();
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
        this.f291395d = hVar;
        hVar.addView(childAt, new android.widget.FrameLayout.LayoutParams(-1, -1));
        m78735x28280f95().addView(this.f291395d);
        m78735x28280f95().m81446x590ab8fc(this.f291395d);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: setActionbarColor */
    public void mo64405x4dab7448(int i17) {
        super.mo64405x4dab7448(i17);
        if (getWindow() != null) {
            vj5.a.a(m78513xc2a54588(), getWindow().getStatusBarColor(), vj5.o.h(getWindow()));
        }
    }
}
