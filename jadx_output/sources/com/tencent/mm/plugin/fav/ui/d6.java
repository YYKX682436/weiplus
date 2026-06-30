package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes3.dex */
public class d6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f100566d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f100567e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f100568f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f100569g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f100570h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f100571i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f100572m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f100573n;

    public d6(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, java.lang.String str4, java.lang.String str5, java.lang.Runnable runnable) {
        this.f100566d = context;
        this.f100567e = str;
        this.f100568f = str2;
        this.f100569g = str3;
        this.f100570h = i17;
        this.f100571i = str4;
        this.f100572m = str5;
        this.f100573n = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.content.Context context = this.f100566d;
        java.lang.String str = this.f100567e;
        int i17 = this.f100570h;
        java.lang.String str2 = this.f100571i;
        java.lang.String str3 = this.f100572m;
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(this.f100568f));
        if (r6Var.m()) {
            java.lang.String str4 = this.f100569g;
            com.tencent.mars.xlog.Log.i("MicroMsg.FavSendLogic", "sendVideo::data path[%s] thumb path[%s]", r6Var.o(), new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(str4)).o());
            tg3.a1 a17 = tg3.t1.a();
            ((dk5.s5) a17).nj(context, str, r6Var.o(), str4, 1, i17, false, false, str2, str3);
        }
        com.tencent.mm.sdk.platformtools.u3.h(this.f100573n);
    }

    public java.lang.String toString() {
        return super.toString() + "|sendFavVideo";
    }
}
