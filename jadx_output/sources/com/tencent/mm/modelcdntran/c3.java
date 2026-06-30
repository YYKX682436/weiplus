package com.tencent.mm.modelcdntran;

/* loaded from: classes12.dex */
public class c3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dn.o f70899d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelcdntran.l3 f70900e;

    public c3(com.tencent.mm.modelcdntran.l3 l3Var, dn.o oVar) {
        this.f70900e = l3Var;
        this.f70899d = oVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.modelcdntran.l3 l3Var = this.f70900e;
        java.util.Queue queue = l3Var.f71061d;
        dn.o oVar = this.f70899d;
        ((java.util.LinkedList) queue).add(oVar.field_mediaId);
        ((java.util.HashMap) l3Var.f71062e).put(oVar.field_mediaId, oVar);
        l3Var.s(false);
    }
}
