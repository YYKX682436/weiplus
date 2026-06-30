package com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48;

/* loaded from: classes5.dex */
public class l2 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f293452d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.C22684x1bd928a0 f293453e;

    public l2(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.C22684x1bd928a0 c22684x1bd928a0, int i17) {
        this.f293453e = c22684x1bd928a0;
        this.f293452d = i17;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.p2
    /* renamed from: getItemOffsets */
    public void mo7902x5db88677(android.graphics.Rect rect, android.view.View view, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var) {
        super.mo7902x5db88677(rect, view, c1163xf1deaba4, h3Var);
        if (c1163xf1deaba4.v0(view) != 0) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y2 y2Var = this.f293453e.f293232o;
            if (y2Var == com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y2.Border || y2Var == com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y2.Grey) {
                rect.left = this.f293452d;
            }
        }
    }
}
