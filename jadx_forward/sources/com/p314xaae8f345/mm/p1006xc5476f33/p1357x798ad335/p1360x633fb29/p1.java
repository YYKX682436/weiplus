package com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29;

/* loaded from: classes8.dex */
public class p1 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2493x1bc889d6.C19762x487075a f178644d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h02.a f178645e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f178646f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ vz.z1 f178647g;

    public p1(com.p314xaae8f345.mm.p2493x1bc889d6.C19762x487075a c19762x487075a, h02.a aVar, boolean z17, vz.z1 z1Var) {
        this.f178644d = c19762x487075a;
        this.f178645e = aVar;
        this.f178646f = z17;
        this.f178647g = z1Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        this.f178644d.f38859x6ac9171 = true;
        h02.a aVar = this.f178645e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.j1.g(aVar, true, this.f178646f, false, this.f178647g);
        g02.b.c(11, new g02.c(aVar.f68404x28d45f97, aVar.f68432x29cbf907, aVar.f68408x32b20428, "", null, 1));
    }
}
