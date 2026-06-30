package dr0;

/* loaded from: classes12.dex */
public final class x2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dr0.a3 f324107d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f324108e;

    public x2(dr0.a3 a3Var, boolean z17) {
        this.f324107d = a3Var;
        this.f324108e = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (dr0.j2.f323977f.a()) {
            dr0.a3 a3Var = this.f324107d;
            if (a3Var.f323942b < 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.proc.Recycler", "abort: periodical, loop=" + a3Var.f323942b);
                return;
            }
            dr0.t2 t2Var = a3Var.f323941a;
            int i17 = 0;
            if (t2Var != null && t2Var.f324086b) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.proc.Recycler", "abort: periodical, has task with higher priority");
                return;
            }
            if (this.f324108e) {
                a3Var.f323942b = 0;
            }
            int i18 = a3Var.f323942b + 1;
            a3Var.f323942b = i18;
            int i19 = 1;
            int i27 = 0;
            while (i17 < i18) {
                int i28 = i27 + i19;
                i17++;
                i27 = i19;
                i19 = i28;
            }
            long j17 = i19;
            long l17 = mm.k.l(mm.k.H, null, 1, null);
            if (l17 <= j17) {
                j17 = l17;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.proc.Recycler", "recycle schedule: periodical, loop=" + a3Var.f323942b + ", delayMin=" + j17);
            long longValue = j17 * (dr0.a3.f323936d.a().g() ? java.lang.Long.valueOf(com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d) : java.lang.Integer.valueOf(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54062xde855ea8)).longValue();
            a3Var.d("post-40");
            dr0.q3.j(dr0.q3.f324040n, longValue, null, 2, null);
        }
    }
}
