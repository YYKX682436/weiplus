package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes3.dex */
public class w5 implements k70.w {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f281684d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.HashSet f281685e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.c6 f281686f;

    public w5(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.c6 c6Var, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, java.util.HashSet hashSet) {
        this.f281686f = c6Var;
        this.f281684d = f9Var;
        this.f281685e = hashSet;
    }

    @Override // k70.w
    public void f(long j17, long j18, java.lang.String str, int i17, int i18, java.lang.Object obj, int i19, int i27, java.lang.String str2, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(i19 == 0 && i27 == 0);
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f281684d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingMoreBtnBarHelper", "oreh downloadImgAndFav taskEnd image succed: %s, msgID:%d, errType: %s, errCode:%s", valueOf, java.lang.Long.valueOf(f9Var.m124847x74d37ac6()), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27));
        java.lang.Long valueOf2 = java.lang.Long.valueOf(f9Var.m124847x74d37ac6());
        java.util.HashSet hashSet = this.f281685e;
        hashSet.remove(valueOf2);
        this.f281686f.a(hashSet);
    }

    @Override // k70.w
    public void l(long j17, long j18, java.lang.String str, int i17, int i18, java.lang.Object obj) {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f281684d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingMoreBtnBarHelper", "oreh downloadImgAndFav download image taskcancel: msgID:%d", java.lang.Long.valueOf(f9Var.m124847x74d37ac6()));
        java.lang.Long valueOf = java.lang.Long.valueOf(f9Var.m124847x74d37ac6());
        java.util.HashSet hashSet = this.f281685e;
        hashSet.remove(valueOf);
        this.f281686f.a(hashSet);
    }

    @Override // k70.w
    public void o(long j17, long j18, java.lang.String str, int i17, int i18, java.lang.Object obj, int i19, int i27, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
    }
}
