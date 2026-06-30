package com.tencent.mm.modelcdntran;

/* loaded from: classes10.dex */
public class f3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f70941d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object[] f70942e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelcdntran.l3 f70943f;

    public f3(com.tencent.mm.modelcdntran.l3 l3Var, java.lang.String str, java.lang.Object[] objArr) {
        this.f70943f = l3Var;
        this.f70941d = str;
        this.f70942e = objArr;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.modelcdntran.l3 l3Var = this.f70943f;
        java.util.HashMap hashMap = (java.util.HashMap) l3Var.f71063f;
        java.lang.String str = this.f70941d;
        dn.o oVar = (dn.o) hashMap.remove(str);
        java.lang.Object[] objArr = this.f70942e;
        if (oVar != null) {
            dn.h hVar = new dn.h();
            int aj6 = ((rx.a) ((sx.a0) i95.n0.c(sx.a0.class))).aj(oVar.field_mediaId, hVar);
            if (aj6 == 0) {
                l3Var.r(objArr, hVar, oVar, false);
            } else {
                com.tencent.mars.xlog.Log.w("MicroMsg.OnlineVideoService", "stop video stream download error. ret %d, mediaId %s", java.lang.Integer.valueOf(aj6), oVar.field_mediaId);
            }
        } else {
            dn.o oVar2 = (dn.o) ((java.util.HashMap) l3Var.f71064g).remove(str);
            dn.h hVar2 = (dn.h) ((java.util.HashMap) l3Var.f71065h).remove(str);
            if (oVar2 != null && hVar2 != null) {
                l3Var.r(objArr, hVar2, oVar2, true);
            }
        }
        ((java.util.HashMap) l3Var.f71062e).remove(str);
    }
}
