package lx;

/* loaded from: classes7.dex */
public final class u5 implements zq1.g0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.l f403506a;

    public u5(yz5.l lVar) {
        this.f403506a = lVar;
    }

    @Override // zq1.g0
    public boolean a(com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.api.C12965xc9712d2 c12965xc9712d2) {
        return false;
    }

    @Override // zq1.g0
    public void b(com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.api.C12966xaa8af0d6 result) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.LinkedList<r45.cw3> header = result.f175461f.f473170g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(header, "header");
        for (r45.cw3 cw3Var : header) {
            hashMap.put(cw3Var.f453393d, cw3Var.f453394e);
        }
        boolean z17 = result.f175459d == 0 && result.f175461f.f473167d == 0;
        java.lang.String str = result.f175461f.f473168e;
        if (str == null) {
            str = result.f175460e;
        }
        this.f403506a.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(new com.p314xaae8f345.p2845xc516c4b6.biz.C23258x4e90185f(z17, result.f175459d, str, result.f175461f.f473169f, hashMap))));
    }
}
