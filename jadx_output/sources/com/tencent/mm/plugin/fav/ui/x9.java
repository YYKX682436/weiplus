package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes12.dex */
public final class x9 implements com.tencent.mm.ui.widget.dialog.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.da f101603a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.view.View f101604b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f101605c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o72.r2 f101606d;

    public x9(com.tencent.mm.plugin.fav.ui.da daVar, android.view.View view, int i17, o72.r2 r2Var) {
        this.f101603a = daVar;
        this.f101604b = view;
        this.f101605c = i17;
        this.f101606d = r2Var;
    }

    @Override // com.tencent.mm.ui.widget.dialog.w1
    public final void a(boolean z17, java.lang.String str) {
        com.tencent.mm.plugin.fav.ui.adapter.c cVar = this.f101603a.f100583n;
        if (cVar == null) {
            kotlin.jvm.internal.o.o("mResultAdapter");
            throw null;
        }
        cVar.n(this.f101604b, this.f101605c, this.f101606d);
    }
}
