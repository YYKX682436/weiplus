package com.tencent.mm.modelcdntran;

/* loaded from: classes10.dex */
public class h3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f70998d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object[] f70999e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ wf0.i1 f71000f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelcdntran.l3 f71001g;

    public h3(com.tencent.mm.modelcdntran.l3 l3Var, java.lang.String str, java.lang.Object[] objArr, wf0.i1 i1Var) {
        this.f71001g = l3Var;
        this.f70998d = str;
        this.f70999e = objArr;
        this.f71000f = i1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        dn.h hVar;
        com.tencent.mm.modelcdntran.l3 l3Var = this.f71001g;
        java.util.HashMap hashMap = (java.util.HashMap) l3Var.f71063f;
        java.lang.String str = this.f70998d;
        dn.o oVar = (dn.o) hashMap.remove(str);
        java.lang.Object[] objArr = this.f70999e;
        if (oVar != null) {
            hVar = new dn.h();
            int aj6 = ((rx.a) ((sx.a0) i95.n0.c(sx.a0.class))).aj(oVar.field_mediaId, hVar);
            if (aj6 == 0) {
                l3Var.r(objArr, hVar, oVar, false);
            } else {
                com.tencent.mars.xlog.Log.w("MicroMsg.OnlineVideoService", "stop video stream download error. ret %d, mediaId %s", java.lang.Integer.valueOf(aj6), oVar.field_mediaId);
            }
        } else {
            oVar = (dn.o) ((java.util.HashMap) l3Var.f71064g).remove(str);
            hVar = (dn.h) ((java.util.HashMap) l3Var.f71065h).remove(str);
            if (oVar != null && hVar != null) {
                l3Var.r(objArr, hVar, oVar, true);
            }
        }
        ((java.util.HashMap) l3Var.f71062e).remove(str);
        wf0.i1 i1Var = this.f71000f;
        if (i1Var != null) {
            mn2.b4 b4Var = (mn2.b4) i1Var;
            b4Var.f329918a.a(new mn2.a4(b4Var.f329919b, oVar, hVar));
        }
    }
}
