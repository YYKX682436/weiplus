package jk3;

/* loaded from: classes8.dex */
public final class j implements kk3.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ jk3.v f381622a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f381623b;

    public j(jk3.v vVar, boolean z17) {
        this.f381622a = vVar;
        this.f381623b = z17;
    }

    @Override // kk3.d
    public void b(android.graphics.Bitmap bitmap, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PageMultiTaskHelper", "transform to float ball animation end ,way:" + i17);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(new jk3.i(this.f381622a, this.f381623b, bitmap), 150L);
    }

    @Override // kk3.d
    public void d(android.graphics.Bitmap bitmap, boolean z17, int i17) {
        jk3.v vVar = this.f381622a;
        jk3.f fVar = vVar.f381658r;
        if (fVar != null) {
            kk3.c.h(fVar, vVar.f381610a, null, 2, null);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PageMultiTaskHelper", "transform to float ball animation start, isSwipeBack:" + z17 + ", way:" + i17);
        kk3.d dVar = vVar.f381650j;
        if (dVar != null) {
            kk3.d.c(dVar, bitmap, z17, 0, 4, null);
        }
        vVar.f381657q = vVar.f();
    }

    @Override // kk3.d
    public void e(int i17) {
        android.app.Activity mo2157x19263085;
        android.content.res.Resources resources;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PageMultiTaskHelper", "transform to float ball animation cancel, way:" + i17);
        jk3.v vVar = this.f381622a;
        ak3.c cVar = vVar.f381644d;
        java.lang.String str = null;
        vVar.l(vVar.P(cVar != null ? cVar.mo2158x12501425() : null, vVar.f()), true);
        jk3.f fVar = vVar.f381658r;
        if (fVar != null) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new pk3.j((pk3.l) fVar, false, false, null));
        }
        boolean z17 = this.f381623b;
        ak3.c cVar2 = vVar.f381644d;
        if (!z17 && vVar.f381661u) {
            if (cVar2 != null) {
                cVar2.j(true, vVar);
                return;
            }
            return;
        }
        if (vVar.f381661u || !vVar.T()) {
            return;
        }
        if ((cVar2 != null ? cVar2.mo2157x19263085() : null) != null) {
            android.app.Activity mo2157x192630852 = cVar2 != null ? cVar2.mo2157x19263085() : null;
            int i18 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(mo2157x192630852);
            if (cVar2 != null && (mo2157x19263085 = cVar2.mo2157x19263085()) != null && (resources = mo2157x19263085.getResources()) != null) {
                str = resources.getString(com.p314xaae8f345.mm.R.C30867xcad56011.oa7);
            }
            e4Var.f293309c = str;
            e4Var.b(com.p314xaae8f345.mm.R.raw.f78821xb211a201);
            e4Var.c();
        }
    }
}
