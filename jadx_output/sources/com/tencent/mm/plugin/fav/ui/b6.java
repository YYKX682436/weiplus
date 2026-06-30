package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes9.dex */
public class b6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f100514d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o72.r2 f100515e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.gp0 f100516f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f100517g;

    public b6(java.lang.String str, o72.r2 r2Var, r45.gp0 gp0Var, java.lang.Runnable runnable) {
        this.f100514d = str;
        this.f100515e = r2Var;
        this.f100516f = gp0Var;
        this.f100517g = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.fav.ui.x5.c(this.f100514d, this.f100515e, this.f100516f);
        com.tencent.mm.sdk.platformtools.u3.h(this.f100517g);
    }

    public java.lang.String toString() {
        return super.toString() + "|sendFavFile";
    }
}
