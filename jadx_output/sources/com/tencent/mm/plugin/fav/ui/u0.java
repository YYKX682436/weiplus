package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes12.dex */
public class u0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f101461d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.app.Dialog f101462e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.v0 f101463f;

    public u0(com.tencent.mm.plugin.fav.ui.v0 v0Var, java.util.List list, android.app.Dialog dialog) {
        this.f101463f = v0Var;
        this.f101461d = list;
        this.f101462e = dialog;
    }

    @Override // java.lang.Runnable
    public void run() {
        o72.x1.n(this.f101461d, 29, null);
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.fav.ui.t0(this));
    }
}
