package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes9.dex */
public class a6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.gp0 f100459d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f100460e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f100461f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f100462g;

    public a6(r45.gp0 gp0Var, android.content.Context context, java.lang.String str, java.lang.Runnable runnable) {
        this.f100459d = gp0Var;
        this.f100460e = context;
        this.f100461f = str;
        this.f100462g = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        r45.gp0 gp0Var = this.f100459d;
        int i17 = gp0Var.I;
        java.lang.String str = this.f100461f;
        android.content.Context context = this.f100460e;
        if (i17 == 15) {
            com.tencent.mm.plugin.fav.ui.x5.a(context, str, gp0Var);
        } else {
            com.tencent.mm.plugin.fav.ui.x5.b(context, str, gp0Var);
        }
        com.tencent.mm.sdk.platformtools.u3.h(this.f100462g);
    }

    public java.lang.String toString() {
        return super.toString() + "|sendFavVideo";
    }
}
