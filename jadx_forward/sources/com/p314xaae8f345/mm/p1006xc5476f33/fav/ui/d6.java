package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui;

/* loaded from: classes3.dex */
public class d6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f182099d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f182100e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f182101f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f182102g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f182103h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f182104i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f182105m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f182106n;

    public d6(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, java.lang.String str4, java.lang.String str5, java.lang.Runnable runnable) {
        this.f182099d = context;
        this.f182100e = str;
        this.f182101f = str2;
        this.f182102g = str3;
        this.f182103h = i17;
        this.f182104i = str4;
        this.f182105m = str5;
        this.f182106n = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.content.Context context = this.f182099d;
        java.lang.String str = this.f182100e;
        int i17 = this.f182103h;
        java.lang.String str2 = this.f182104i;
        java.lang.String str3 = this.f182105m;
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a(this.f182101f));
        if (r6Var.m()) {
            java.lang.String str4 = this.f182102g;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavSendLogic", "sendVideo::data path[%s] thumb path[%s]", r6Var.o(), new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a(str4)).o());
            tg3.a1 a17 = tg3.t1.a();
            ((dk5.s5) a17).nj(context, str, r6Var.o(), str4, 1, i17, false, false, str2, str3);
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(this.f182106n);
    }

    /* renamed from: toString */
    public java.lang.String m55330x9616526c() {
        return super.toString() + "|sendFavVideo";
    }
}
