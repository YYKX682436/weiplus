package mz4;

/* renamed from: mz4.d$$k */
/* loaded from: classes12.dex */
public final /* synthetic */ class RunnableC29177x2e0107 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mz4.d f414796d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f414797e;

    public /* synthetic */ RunnableC29177x2e0107(mz4.d dVar, boolean z17) {
        this.f414796d = dVar;
        this.f414797e = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        lz4.a aVar;
        mz4.d dVar = this.f414796d;
        boolean z17 = this.f414797e;
        boolean z18 = true;
        java.lang.Object[] objArr = new java.lang.Object[1];
        java.util.List list = dVar.f414762a;
        objArr[0] = java.lang.Integer.valueOf(list != null ? list.size() : 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Note.NoteDataManager", "clear mDataList, size:%d", objArr);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[clear] stack = ");
        boolean z19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.b(true));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Note.NoteDataManager", sb6.toString());
        synchronized (dVar) {
            java.util.List list2 = dVar.f414762a;
            if (list2 != null) {
                list2.clear();
            } else {
                z18 = false;
            }
        }
        dVar.f414767f = 0;
        dVar.f414766e = 0;
        if (z18 && z17 && (aVar = dVar.f414763b) != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3) aVar).t7();
        }
    }
}
