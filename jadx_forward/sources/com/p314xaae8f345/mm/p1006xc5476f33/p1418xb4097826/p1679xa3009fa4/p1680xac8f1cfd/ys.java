package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class ys extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.pt f218145d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 f218146e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ys(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.pt ptVar, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112) {
        super(2);
        this.f218145d = ptVar;
        this.f218146e = activityC0065xcd7aa112;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        int ordinal;
        qd2.h0 lastOrientation = (qd2.h0) obj;
        qd2.h0 newOrientation = (qd2.h0) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lastOrientation, "lastOrientation");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newOrientation, "newOrientation");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.pt ptVar = this.f218145d;
        if (ptVar.getIsUserVisibleFocused()) {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = this.f218146e;
            if (!hc2.f0.j(activityC0065xcd7aa112) && !hc2.f0.l(activityC0065xcd7aa112)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("FinderVideoOrientationUIC", "onFourOrientationsChange return for isSupportAutoRotateActivity.");
            } else if (ptVar.f217154v && lastOrientation != newOrientation) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ps O6 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.pt.O6(ptVar, ptVar.f217148p);
                int i17 = 0;
                boolean z17 = newOrientation == qd2.h0.f443303f || newOrientation == qd2.h0.f443305h || newOrientation == qd2.h0.f443302e;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onFourOrientationsChange activity=");
                sb6.append(activityC0065xcd7aa112.getClass().getSimpleName());
                sb6.append(", isLandscapeByClick=");
                sb6.append(ptVar.A);
                sb6.append(", isDrawerOpen=");
                sb6.append(O6.f217128a);
                sb6.append(" isLikeDrawerOpen=");
                sb6.append(O6.f217129b);
                sb6.append(" isAllLikeDrawerOpen=");
                sb6.append(O6.f217130c);
                sb6.append(" isProfileDrawerOpen=");
                sb6.append(O6.f217131d);
                sb6.append(" isBizProfileDrawerOpen=");
                sb6.append(O6.f217132e);
                sb6.append(" isShowBulletInputUI=");
                sb6.append(O6.f217133f);
                sb6.append(" newOrientation=");
                sb6.append(newOrientation);
                sb6.append(", isLongVideoEndLayoutShown=");
                sb6.append(O6.f217134g);
                sb6.append(", isRecommendDrawerShown=");
                sb6.append(O6.f217135h);
                sb6.append(", isProjectionPanelShown=");
                sb6.append(O6.f217136i);
                sb6.append(", isLandscapeVideo=");
                sb6.append(ptVar.f217148p != null);
                sb6.append(" isInScaleMode:");
                sb6.append(O6.f217137j);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderVideoOrientationUIC", sb6.toString());
                if (O6.a(ptVar.A, ptVar.f217158z) && z17) {
                    if (ptVar.f217148p == null && ptVar.f217155w) {
                        ptVar.R6("OrientationEvent");
                    }
                    if (ptVar.f217148p == null || !ptVar.Y6() || (ordinal = newOrientation.ordinal()) == 1) {
                        i17 = 1;
                    } else if (ordinal != 2) {
                        i17 = ordinal != 4 ? 2 : 8;
                    }
                    if (i17 != ptVar.m80379x76847179().getRequestedOrientation()) {
                        ptVar.m80379x76847179().setRequestedOrientation(i17);
                    }
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
