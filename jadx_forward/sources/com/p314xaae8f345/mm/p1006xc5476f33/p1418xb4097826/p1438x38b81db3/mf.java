package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class mf extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 f185528a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.zf f185529b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f185530c;

    public mf(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.zf zfVar, android.content.Context context) {
        this.f185528a = c14994x9b99c079;
        this.f185529b = zfVar;
        this.f185530c = context;
    }

    @Override // ym5.n0
    /* renamed from: onViewExposed */
    public void mo976xcdf5f75c(android.view.View view, long j17, long j18, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("feedLiveExpose isExposed ");
        sb6.append(z17);
        sb6.append(" feedId: ");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079 = this.f185528a;
        sb6.append(c14994x9b99c079.m59251x5db1b11());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FeedFullLiveConvert", sb6.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.zf zfVar = this.f185529b;
        if (!z17) {
            zfVar.f186647z1.mo48814x2efc64();
            return;
        }
        zfVar.f186647z1.mo48813x58998cd();
        zfVar.Z1(c14994x9b99c079, 68, this.f185530c);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(zfVar.f186643p1, "feedLiveExpose true curScrollFeedId:" + zfVar.f186646y1 + " exposeFeedId: " + c14994x9b99c079.m59251x5db1b11());
        if (zfVar.f186646y1 == c14994x9b99c079.m59251x5db1b11()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.zf zfVar2 = this.f185529b;
            long j19 = zfVar2.f186646y1;
            r45.nw1 m76794xd0557130 = c14994x9b99c079.getFeedObject().m76794xd0557130();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.zf.Q1(zfVar2, j19, true, m76794xd0557130 != null ? java.lang.Integer.valueOf(m76794xd0557130.m75939xb282bd08(2)) : null, null, 8, null);
        }
    }
}
