package com.p314xaae8f345.mm.p947xba6de98f;

/* loaded from: classes12.dex */
public class d3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dn.o f152458d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p947xba6de98f.l3 f152459e;

    public d3(com.p314xaae8f345.mm.p947xba6de98f.l3 l3Var, dn.o oVar) {
        this.f152459e = l3Var;
        this.f152458d = oVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p947xba6de98f.l3 l3Var = this.f152459e;
        java.util.Queue queue = l3Var.f152594d;
        dn.o oVar = this.f152458d;
        ((java.util.LinkedList) queue).add(oVar.f69601xaca5bdda);
        ((java.util.HashMap) l3Var.f152595e).put(oVar.f69601xaca5bdda, oVar);
        l3Var.s(false);
    }
}
