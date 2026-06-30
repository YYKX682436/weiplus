package com.tencent.mm.plugin.finder.assist;

/* loaded from: classes2.dex */
public final class q5 implements com.tencent.mm.ui.widget.dialog.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f102483a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.a f102484b;

    public q5(android.app.Activity activity, yz5.a aVar) {
        this.f102483a = activity;
        this.f102484b = aVar;
    }

    @Override // com.tencent.mm.ui.widget.dialog.w1
    public final void a(boolean z17, java.lang.String str) {
        i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        ((com.tencent.mm.plugin.finder.assist.i0) c17).bl(this.f102483a, null);
        yz5.a aVar = this.f102484b;
        if (aVar != null) {
            aVar.invoke();
        }
    }
}
