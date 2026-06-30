package cw1;

/* loaded from: classes12.dex */
public final class m2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.os.CancellationSignal f304670d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13111x890e232d f304671e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f304672f;

    public m2(android.os.CancellationSignal cancellationSignal, com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13111x890e232d activityC13111x890e232d, long j17) {
        this.f304670d = cancellationSignal;
        this.f304671e = activityC13111x890e232d;
        this.f304672f = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j17;
        long j18;
        try {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            android.os.CancellationSignal cancellationSignal = this.f304670d;
            if (cancellationSignal != null) {
                cancellationSignal.throwIfCanceled();
            }
            java.util.List<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.m0> Sa = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f5) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f5.class)).Sa();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(Sa, "calculateAppBrandFileStorageLogic(...)");
            android.os.CancellationSignal cancellationSignal2 = this.f304670d;
            if (cancellationSignal2 != null) {
                cancellationSignal2.throwIfCanceled();
            }
            java.util.ArrayList arrayList = new java.util.ArrayList(16);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            if (Sa.size() <= 15) {
                long j19 = 0;
                for (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.m0 m0Var : Sa) {
                    arrayList.add(new cw1.j(cw1.t2.a(m0Var), m0Var.f157800c, m0Var.f157801d, m0Var));
                    j19 += m0Var.f157801d;
                }
                j18 = j19;
                j17 = 0;
            } else {
                int i17 = 0;
                j17 = 0;
                j18 = 0;
                for (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.m0 m0Var2 : Sa) {
                    int i18 = i17 + 1;
                    if (i17 >= 8) {
                        arrayList2.add(m0Var2.f157798a);
                        j17 += m0Var2.f157801d;
                        i17 = i18;
                    } else {
                        arrayList.add(new cw1.j(cw1.t2.a(m0Var2), m0Var2.f157800c, m0Var2.f157801d, m0Var2));
                        j18 += m0Var2.f157801d;
                        i17 = i18;
                        j17 = j17;
                    }
                }
            }
            if (!arrayList2.isEmpty()) {
                java.lang.String string = this.f304671e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.b7l, java.lang.Integer.valueOf(arrayList2.size()));
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
                arrayList.add(new cw1.j(-1L, string, j17, null));
            }
            long j27 = j18 + j17;
            if (this.f304672f > j27) {
                java.lang.String string2 = this.f304671e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.b7m);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
                arrayList.add(new cw1.j(-2L, string2, (this.f304672f - j18) - j17, null));
            }
            android.os.CancellationSignal cancellationSignal3 = this.f304670d;
            if (cancellationSignal3 != null) {
                cancellationSignal3.throwIfCanceled();
            }
            yv1.h1.g(0, null, 2, null);
            this.f304671e.f177228m = java.lang.System.currentTimeMillis() - currentTimeMillis;
            this.f304671e.f177229n = Sa.size();
            this.f304671e.f177230o = j27;
            ((ku5.t0) ku5.t0.f394148d).B(new cw1.l2(this.f304671e, arrayList2, arrayList));
        } catch (android.os.OperationCanceledException unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CleanCacheUI", "Loading appbrand list cancelled.");
        }
    }
}
