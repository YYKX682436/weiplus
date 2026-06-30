package com.tencent.mm.modelcdntran;

/* loaded from: classes12.dex */
public class d3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dn.o f70925d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelcdntran.l3 f70926e;

    public d3(com.tencent.mm.modelcdntran.l3 l3Var, dn.o oVar) {
        this.f70926e = l3Var;
        this.f70925d = oVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.modelcdntran.l3 l3Var = this.f70926e;
        java.util.Queue queue = l3Var.f71061d;
        dn.o oVar = this.f70925d;
        ((java.util.LinkedList) queue).add(oVar.field_mediaId);
        ((java.util.HashMap) l3Var.f71062e).put(oVar.field_mediaId, oVar);
        l3Var.s(false);
    }
}
