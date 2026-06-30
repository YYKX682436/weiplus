package com.tencent.mm.feature.emoji;

/* loaded from: classes9.dex */
public final class z3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f66582d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.emoji.c4 f66583e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.qj0 f66584f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f66585g;

    public z3(android.content.Context context, com.tencent.mm.feature.emoji.c4 c4Var, r45.qj0 qj0Var, java.lang.String str) {
        this.f66582d = context;
        this.f66583e = c4Var;
        this.f66584f = qj0Var;
        this.f66585g = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.content.Context context = this.f66582d;
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0(context, 1, false);
        k0Var.f211872n = com.tencent.mm.feature.emoji.x3.f66548d;
        k0Var.f211881s = new com.tencent.mm.feature.emoji.y3(this.f66583e, this.f66584f, this.f66585g, context);
        k0Var.v();
    }
}
