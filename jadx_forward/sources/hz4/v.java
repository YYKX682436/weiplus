package hz4;

/* loaded from: classes12.dex */
public class v implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o72.r2 f368000d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hz4.u f368001e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ hz4.w f368002f;

    public v(hz4.w wVar, o72.r2 r2Var, hz4.u uVar) {
        this.f368002f = wVar;
        this.f368000d = r2Var;
        this.f368001e = uVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17 = this.f368001e.f367988a;
        hz4.w wVar = this.f368002f;
        wVar.getClass();
        java.lang.Object[] objArr = new java.lang.Object[2];
        o72.r2 r2Var = this.f368000d;
        objArr[0] = java.lang.Boolean.valueOf(r2Var == null);
        objArr[1] = java.lang.Integer.valueOf(i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WNNoteMsgProcess", "processNoteData: start, originalNoteFavItemInfo null=%b, dealScene=%d", objArr);
        if (i17 == 10) {
            r45.bq0 bq0Var = r2Var == null ? new r45.bq0() : r2Var.f67640x5ab01132;
            o72.r2 r2Var2 = new o72.r2();
            r2Var2.f67645x88be67a1 = wVar.f368007x;
            r2Var2.f67640x5ab01132 = bq0Var;
            wVar.f367954o = bq0Var;
            wVar.f367947e = r2Var2;
        }
        if (wVar.q()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WNNoteMsgProcess", "processNoteData: skip");
            return;
        }
        java.util.HashMap hashMap = hz4.w.M;
        if (hashMap.containsKey(wVar.f368004u)) {
            iz4.m mVar = (iz4.m) hashMap.get(wVar.f368004u);
            wVar.f367946d = mVar;
            mVar.f377659d = wVar.f368006w.longValue();
        } else {
            iz4.m mVar2 = new iz4.m();
            wVar.f367946d = mVar2;
            mVar2.f377659d = wVar.f368006w.longValue();
            wVar.f367946d.getClass();
            r45.ul5 ul5Var = wVar.C;
            if (ul5Var != null && ul5Var.f468998f != null) {
                if (ul5Var.f469000h != null) {
                    wVar.f367946d.getClass();
                    iz4.m mVar3 = wVar.f367946d;
                    java.lang.String str = wVar.C.f469000h.f467424d;
                    mVar3.getClass();
                    wVar.f367946d.f377660e = wVar.C.f469001i;
                }
                iz4.m mVar4 = wVar.f367946d;
                mVar4.f377656a = wVar.C.f468998f;
                hashMap.put(wVar.f368004u, mVar4);
            }
        }
        wVar.b(wVar.f367946d.f377656a, true, 4);
        mz4.j0 j0Var = mz4.j0.f414823v;
        if (j0Var == null || j0Var == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3 activityC19519x7af4daf3 = (com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3) j0Var.f414833h;
        activityC19519x7af4daf3.getClass();
        activityC19519x7af4daf3.q7(true, false);
    }

    /* renamed from: toString */
    public java.lang.String m134304x9616526c() {
        return super.toString() + "|dealWNoteInfo";
    }
}
