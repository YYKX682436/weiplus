package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes11.dex */
public class q1 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gd0.f f281266d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.q2 f281267e;

    public q1(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.q2 q2Var, gd0.f fVar) {
        this.f281267e = q2Var;
        this.f281266d = fVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        gd0.f fVar = this.f281266d;
        if (fVar != null) {
            ((com.p314xaae8f345.mm.p2590x523fc97f.p2591x633fb29.p2592xbeeb310a.h) fVar).a();
        }
        com.p314xaae8f345.mm.p2590x523fc97f.p2591x633fb29.p2592xbeeb310a.a aVar = this.f281267e.f281278q;
        if (aVar != null) {
            aVar.a();
        }
    }
}
