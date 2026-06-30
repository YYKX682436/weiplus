package com.p314xaae8f345.mm.ui.p2642x2e06d1;

/* renamed from: com.tencent.mm.ui.base.DrawedCallBackFrameLayout */
/* loaded from: classes10.dex */
public class C21472x6fc4234f extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public db5.m f278776d;

    public C21472x6fc4234f(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(android.graphics.Canvas canvas) {
        try {
            super.dispatchDraw(canvas);
        } catch (java.lang.Throwable unused) {
        }
        db5.m mVar = this.f278776d;
        if (mVar != null) {
            e33.m0 m0Var = (e33.m0) mVar;
            m0Var.getClass();
            java.lang.String[] strArr = j33.d0.f378961a;
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.f0.b(19);
            com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15653x403456cd activityC15653x403456cd = m0Var.f328886a;
            if (activityC15653x403456cd.R) {
                activityC15653x403456cd.R = false;
            }
            this.f278776d = null;
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        super.onLayout(z17, i17, i18, i19, i27);
    }

    /* renamed from: setListener */
    public void m78880xc6cf6336(db5.m mVar) {
        this.f278776d = mVar;
    }
}
