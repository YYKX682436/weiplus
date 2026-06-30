package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

/* loaded from: classes10.dex */
public final class rq extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f192047d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14125xe2977688 f192048e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rq(java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14125xe2977688 activityC14125xe2977688) {
        super(0);
        this.f192047d = str;
        this.f192048e = activityC14125xe2977688;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.String str = this.f192047d;
        java.lang.String str2 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.e9.f183676l + c01.id.c() + '_' + com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.Y(8);
        try {
            com.p314xaae8f345.mm.vfs.w6.c(str, str2);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("FinderSelectLocalFileUI", th6, "uploadAudioTrack: copy error", new java.lang.Object[0]);
        }
        java.lang.String str3 = com.p314xaae8f345.mm.vfs.w6.j(str2) ? str2 : str;
        dn.m mVar = new dn.m();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14125xe2977688 activityC14125xe2977688 = this.f192048e;
        mVar.f323320f = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.fq) ((jz5.n) activityC14125xe2977688.f191168m).mo141623x754a37bb();
        java.lang.String str4 = "upload_" + com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a(str3);
        activityC14125xe2977688.f191169n = str4;
        mVar.f69601xaca5bdda = str4;
        mVar.f69595x6d25b0d9 = str3;
        mVar.f69606xccdbf540 = true;
        mVar.f69592xf1ebe47b = 20305;
        mVar.f69580x454032b6 = 251;
        mVar.Z = 8;
        mVar.f69584x89a4c0cf = 2;
        mVar.A = 60;
        mVar.B = 600;
        mVar.f69609xd84b8349 = 2;
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str2, str3)) {
            str2 = "";
        }
        activityC14125xe2977688.f191170o = str2;
        ((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).Bi(mVar);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderSelectLocalFileUI", "uploadAudioTrack: start upload, curMediaId=" + activityC14125xe2977688.f191169n + ", uploadPath=" + str3 + ", originPath=" + str);
        return jz5.f0.f384359a;
    }
}
