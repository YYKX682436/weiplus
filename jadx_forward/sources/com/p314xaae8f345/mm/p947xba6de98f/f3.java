package com.p314xaae8f345.mm.p947xba6de98f;

/* loaded from: classes10.dex */
public class f3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f152474d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object[] f152475e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p947xba6de98f.l3 f152476f;

    public f3(com.p314xaae8f345.mm.p947xba6de98f.l3 l3Var, java.lang.String str, java.lang.Object[] objArr) {
        this.f152476f = l3Var;
        this.f152474d = str;
        this.f152475e = objArr;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p947xba6de98f.l3 l3Var = this.f152476f;
        java.util.HashMap hashMap = (java.util.HashMap) l3Var.f152596f;
        java.lang.String str = this.f152474d;
        dn.o oVar = (dn.o) hashMap.remove(str);
        java.lang.Object[] objArr = this.f152475e;
        if (oVar != null) {
            dn.h hVar = new dn.h();
            int aj6 = ((rx.a) ((sx.a0) i95.n0.c(sx.a0.class))).aj(oVar.f69601xaca5bdda, hVar);
            if (aj6 == 0) {
                l3Var.r(objArr, hVar, oVar, false);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.OnlineVideoService", "stop video stream download error. ret %d, mediaId %s", java.lang.Integer.valueOf(aj6), oVar.f69601xaca5bdda);
            }
        } else {
            dn.o oVar2 = (dn.o) ((java.util.HashMap) l3Var.f152597g).remove(str);
            dn.h hVar2 = (dn.h) ((java.util.HashMap) l3Var.f152598h).remove(str);
            if (oVar2 != null && hVar2 != null) {
                l3Var.r(objArr, hVar2, oVar2, true);
            }
        }
        ((java.util.HashMap) l3Var.f152595e).remove(str);
    }
}
