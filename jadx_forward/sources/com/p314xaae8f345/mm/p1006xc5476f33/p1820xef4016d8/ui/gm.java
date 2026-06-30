package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public class gm extends p012xc85e97e9.p103xe821e364.p104xd1075a44.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final int f228496d = sp5.c.a(4);

    /* renamed from: e, reason: collision with root package name */
    public final int f228497e = sp5.c.a(8);

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16390x60cac25d f228498f;

    public gm(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16390x60cac25d activityC16390x60cac25d) {
        this.f228498f = activityC16390x60cac25d;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.p2
    /* renamed from: getItemOffsets */
    public void mo7902x5db88677(android.graphics.Rect rect, android.view.View view, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var) {
        int ceil = (int) java.lang.Math.ceil(((java.util.ArrayList) this.f228498f.f228065t).size() / 3.0f);
        int u07 = c1163xf1deaba4.u0(view);
        int ceil2 = (int) java.lang.Math.ceil((u07 + 1) / 3.0f);
        int i17 = this.f228496d;
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
        int i18 = u07 % 3;
        int i19 = this.f228497e;
        if (i18 == 0) {
            rect.left = i19;
            rect.right = i19 / 3;
        } else if (i18 == 1) {
            rect.left = (i19 * 2) / 3;
            rect.right = (i19 * 2) / 3;
        } else {
            rect.left = i19 / 3;
            rect.right = i19;
        }
    }
}
