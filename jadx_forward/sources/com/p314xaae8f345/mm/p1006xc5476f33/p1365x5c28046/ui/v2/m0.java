package com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v2;

/* loaded from: classes11.dex */
public class m0 extends p012xc85e97e9.p087x9da2e250.app.e2 implements p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener, com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v2.h0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2723x63406df.C22458x34f98a1d f179906d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f179907e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v2.ActivityC13354x79b4d90b f179908f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v2.ActivityC13354x79b4d90b activityC13354x79b4d90b, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f activityC1102x9ee2d9f, com.p314xaae8f345.mm.ui.p2723x63406df.C22458x34f98a1d c22458x34f98a1d, boolean z17) {
        super(activityC1102x9ee2d9f.mo7595x9cdc264(), 0);
        this.f179908f = activityC13354x79b4d90b;
        this.f179907e = false;
        this.f179907e = z17;
        this.f179906d = c22458x34f98a1d;
        c22458x34f98a1d.mo79164x6cab2c8d(this);
        c22458x34f98a1d.mo79170x2d3430b4(this);
        c22458x34f98a1d.m80844x940d026a(activityC13354x79b4d90b.f179868h);
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v2.C13353xcecbd7a3 c13353xcecbd7a3 = activityC13354x79b4d90b.f179865e;
        if (c13353xcecbd7a3 != null) {
            c13353xcecbd7a3.m54838x97cfa8c8(this);
        }
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.a
    /* renamed from: getCount */
    public int mo8338x7444f759() {
        return this.f179907e ? 2 : 1;
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.e2
    /* renamed from: getItem */
    public p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 mo7743xfb80e389(int i17) {
        return this.f179908f.T6(i17);
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener
    /* renamed from: onPageScrollStateChanged */
    public void mo8331xcb2941fe(int i17) {
        if (i17 == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v2.ActivityC13354x79b4d90b activityC13354x79b4d90b = this.f179908f;
            if (activityC13354x79b4d90b.T6(activityC13354x79b4d90b.f179868h) != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v2.AbstractC13342x6ac9a618 T6 = activityC13354x79b4d90b.T6(activityC13354x79b4d90b.f179868h);
                if (T6.f179775q == null || T6.f179779u == null || !T6.q0()) {
                    return;
                }
                T6.f179779u.m();
            }
        }
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener
    /* renamed from: onPageScrolled */
    public void mo8332xf210c75a(int i17, float f17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v2.C13353xcecbd7a3 c13353xcecbd7a3 = this.f179908f.f179865e;
        if (c13353xcecbd7a3 != null) {
            float f18 = c13353xcecbd7a3.f179851d * (i17 + f17);
            android.graphics.Matrix matrix = c13353xcecbd7a3.f179856i;
            matrix.setTranslate(f18, 0.0f);
            c13353xcecbd7a3.f179855h.setImageMatrix(matrix);
        }
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener
    /* renamed from: onPageSelected */
    public void mo8333x510f45c9(int i17) {
        com.p314xaae8f345.mm.ui.C21407xddef161a c21407xddef161a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v2.ActivityC13354x79b4d90b activityC13354x79b4d90b = this.f179908f;
        activityC13354x79b4d90b.f179868h = i17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v2.C13353xcecbd7a3 c13353xcecbd7a3 = activityC13354x79b4d90b.f179865e;
        if (c13353xcecbd7a3 != null) {
            c13353xcecbd7a3.m54840x684367d(i17);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v2.AbstractC13342x6ac9a618 T6 = activityC13354x79b4d90b.T6(activityC13354x79b4d90b.f179868h);
        if (T6 != null) {
            h22.c cVar = T6.f179770i;
            cVar.f359819i = i17;
            cVar.z();
        }
        if (activityC13354x79b4d90b.f179868h != 1 || activityC13354x79b4d90b.f179870m) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(12090, new java.lang.Object[0]);
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_EMOJI_STORE_NEW_ORIGINAL_BOOLEAN, java.lang.Boolean.FALSE);
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v2.C13353xcecbd7a3 c13353xcecbd7a32 = activityC13354x79b4d90b.f179865e;
        if (c13353xcecbd7a32 != null && (c21407xddef161a = c13353xcecbd7a32.f179858n) != null) {
            c21407xddef161a.f278447e.setVisibility(4);
        }
        activityC13354x79b4d90b.f179870m = true;
    }
}
