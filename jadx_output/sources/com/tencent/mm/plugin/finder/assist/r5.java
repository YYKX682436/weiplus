package com.tencent.mm.plugin.finder.assist;

/* loaded from: classes2.dex */
public final class r5 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f102506d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f102507e;

    public r5(android.app.Activity activity, yz5.a aVar) {
        this.f102506d = activity;
        this.f102507e = aVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        ((com.tencent.mm.plugin.finder.assist.i0) c17).bl(this.f102506d, null);
        yz5.a aVar = this.f102507e;
        if (aVar != null) {
            aVar.invoke();
        }
    }
}
