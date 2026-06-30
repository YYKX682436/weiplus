package com.tencent.mm.modelcdntran;

/* loaded from: classes12.dex */
public class e3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dn.o f70934d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelcdntran.l3 f70935e;

    public e3(com.tencent.mm.modelcdntran.l3 l3Var, dn.o oVar) {
        this.f70935e = l3Var;
        this.f70934d = oVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.modelcdntran.l3 l3Var = this.f70935e;
        com.tencent.mm.sdk.platformtools.n3 n3Var = l3Var.f71067m;
        dn.o oVar = this.f70934d;
        n3Var.removeCallbacksAndMessages(oVar.field_mediaId);
        ((java.util.LinkedList) l3Var.f71061d).add(oVar.field_mediaId);
        ((java.util.HashMap) l3Var.f71062e).put(oVar.field_mediaId, oVar);
        l3Var.s(false);
    }
}
