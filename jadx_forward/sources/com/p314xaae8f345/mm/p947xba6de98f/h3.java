package com.p314xaae8f345.mm.p947xba6de98f;

/* loaded from: classes10.dex */
public class h3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f152531d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object[] f152532e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ wf0.i1 f152533f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p947xba6de98f.l3 f152534g;

    public h3(com.p314xaae8f345.mm.p947xba6de98f.l3 l3Var, java.lang.String str, java.lang.Object[] objArr, wf0.i1 i1Var) {
        this.f152534g = l3Var;
        this.f152531d = str;
        this.f152532e = objArr;
        this.f152533f = i1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        dn.h hVar;
        com.p314xaae8f345.mm.p947xba6de98f.l3 l3Var = this.f152534g;
        java.util.HashMap hashMap = (java.util.HashMap) l3Var.f152596f;
        java.lang.String str = this.f152531d;
        dn.o oVar = (dn.o) hashMap.remove(str);
        java.lang.Object[] objArr = this.f152532e;
        if (oVar != null) {
            hVar = new dn.h();
            int aj6 = ((rx.a) ((sx.a0) i95.n0.c(sx.a0.class))).aj(oVar.f69601xaca5bdda, hVar);
            if (aj6 == 0) {
                l3Var.r(objArr, hVar, oVar, false);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.OnlineVideoService", "stop video stream download error. ret %d, mediaId %s", java.lang.Integer.valueOf(aj6), oVar.f69601xaca5bdda);
            }
        } else {
            oVar = (dn.o) ((java.util.HashMap) l3Var.f152597g).remove(str);
            hVar = (dn.h) ((java.util.HashMap) l3Var.f152598h).remove(str);
            if (oVar != null && hVar != null) {
                l3Var.r(objArr, hVar, oVar, true);
            }
        }
        ((java.util.HashMap) l3Var.f152595e).remove(str);
        wf0.i1 i1Var = this.f152533f;
        if (i1Var != null) {
            mn2.b4 b4Var = (mn2.b4) i1Var;
            b4Var.f411451a.a(new mn2.a4(b4Var.f411452b, oVar, hVar));
        }
    }
}
