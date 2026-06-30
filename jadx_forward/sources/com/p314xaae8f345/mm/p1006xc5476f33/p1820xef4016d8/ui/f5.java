package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public class f5 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final int f228429d = sp5.c.a(4);

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16367x1189c620 f228430e;

    public f5(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16367x1189c620 activityC16367x1189c620) {
        this.f228430e = activityC16367x1189c620;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.p2
    /* renamed from: getItemOffsets */
    public void mo7902x5db88677(android.graphics.Rect rect, android.view.View view, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var) {
        int ceil = (int) java.lang.Math.ceil(this.f228430e.f227669w.size() / 2.0f);
        int u07 = c1163xf1deaba4.u0(view);
        int ceil2 = (int) java.lang.Math.ceil((u07 + 1) / 2.0f);
        int i17 = this.f228429d;
        if (ceil2 == 0) {
            rect.top = i17 * 2;
            rect.bottom = i17 * 2;
        } else if (ceil2 == ceil) {
            rect.top = i17;
            rect.bottom = i17 * 2;
        } else {
            rect.top = i17;
            rect.bottom = i17;
        }
        if (u07 % 2 == 0) {
            rect.left = i17 * 2;
            rect.right = i17;
        } else {
            rect.left = i17;
            rect.right = i17 * 2;
        }
    }
}
