package vx1;

@j95.b(m140513x1e06fd29 = {com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.m1.class, c42.i.class})
/* loaded from: classes7.dex */
public class i extends i95.w {

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f522762d;

    @Override // i95.w
    /* renamed from: onCreate */
    public void mo8845x3e5a77bb(android.content.Context context) {
        android.os.Handler handler = new android.os.Handler(android.os.Looper.myLooper());
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.j()) {
            wi(handler);
            return;
        }
        ((ku5.t0) ku5.t0.f394148d).g(new vx1.g(this, handler));
    }

    public final void wi(android.os.Handler handler) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SystemCrashFixPatch", "api level :" + android.os.Build.VERSION.SDK_INT);
        if (this.f522762d == null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            this.f522762d = arrayList;
            arrayList.add(new yx1.f());
            ((java.util.ArrayList) this.f522762d).add(new zx1.a());
            ((java.util.ArrayList) this.f522762d).add(new com.p314xaae8f345.mm.p1006xc5476f33.p1345x66a6330e.p1346x6582048.p1347xdbff2baa.b());
            ((java.util.ArrayList) this.f522762d).add(new com.p314xaae8f345.mm.p1006xc5476f33.p1345x66a6330e.p1346x6582048.p1348xa7b7dce5.e());
            ((java.util.ArrayList) this.f522762d).add(new xx1.c());
            ((java.util.ArrayList) this.f522762d).add(new wx1.b());
        }
        java.util.Iterator it = ((java.util.ArrayList) this.f522762d).iterator();
        while (it.hasNext()) {
            vx1.f fVar = (vx1.f) it.next();
            if (fVar.a(android.os.Build.VERSION.SDK_INT)) {
                if (fVar instanceof vx1.e) {
                    handler.postDelayed(new vx1.h(this, (vx1.e) fVar, fVar), 0L);
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SystemCrashFixPatch", fVar.getClass().getCanonicalName() + " : " + fVar.b());
                }
            }
        }
    }
}
