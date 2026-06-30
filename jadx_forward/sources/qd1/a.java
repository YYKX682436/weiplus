package qd1;

/* loaded from: classes7.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 f443134d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f443135e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ qd1.b f443136f;

    public a(qd1.b bVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var, int i17) {
        this.f443136f = bVar;
        this.f443134d = e9Var;
        this.f443135e = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.i3 i3Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var = this.f443134d;
        qd1.b bVar = this.f443136f;
        bVar.getClass();
        try {
            i3Var = e9Var.t3().x0();
        } catch (java.lang.Throwable unused) {
            i3Var = null;
        }
        int i17 = this.f443135e;
        if (i3Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiHideToast", "hideToast uiThread NULL page");
            e9Var.a(i17, bVar.o("fail:page don't exist"));
            return;
        }
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 t37 = e9Var.t3();
            boolean z17 = false;
            if (t37 != null) {
                if (!com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.d5.a()) {
                    throw new java.lang.RuntimeException("Should be called on main-thread");
                }
                ul1.h hVar = (ul1.h) t37.k(ul1.h.class);
                if (hVar != null) {
                    boolean z18 = false;
                    while (true) {
                        java.util.LinkedList linkedList = hVar.f510114d;
                        if (linkedList.isEmpty()) {
                            break;
                        } else {
                            z18 |= ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5) linkedList.poll()).P1().b(false);
                        }
                    }
                    z17 = z18;
                }
            }
            if (z17) {
                e9Var.a(i17, bVar.o("ok"));
            } else {
                e9Var.a(i17, bVar.o("fail:toast can't be found"));
            }
        } catch (java.lang.Throwable unused2) {
            e9Var.a(i17, bVar.o("fail:internal error"));
        }
    }
}
