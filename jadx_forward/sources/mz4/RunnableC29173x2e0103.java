package mz4;

/* renamed from: mz4.d$$g */
/* loaded from: classes12.dex */
public final /* synthetic */ class RunnableC29173x2e0103 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mz4.d f414783d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f414784e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f414785f;

    public /* synthetic */ RunnableC29173x2e0103(mz4.d dVar, int i17, boolean z17) {
        this.f414783d = dVar;
        this.f414784e = i17;
        this.f414785f = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        lz4.a aVar;
        mz4.d dVar = this.f414783d;
        java.util.List list = dVar.f414762a;
        int i17 = this.f414784e;
        if (list != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Note.NoteDataManager", "[removeWithOutSync] , mDataList = " + dVar.f414762a + ", position = " + i17 + ", mDataList size = " + dVar.f414762a.size());
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Note.NoteDataManager", "[removeWithOutSync] , mDataList = " + dVar.f414762a + ", position = " + i17);
        }
        java.util.List list2 = dVar.f414762a;
        boolean z17 = false;
        if (list2 != null && i17 >= 0 && i17 < list2.size()) {
            dVar.E((iz4.c) dVar.f414762a.get(i17), false);
            dVar.f414762a.remove(i17);
            z17 = true;
        }
        if (z17 && this.f414785f && (aVar = dVar.f414763b) != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3) aVar).x1(i17);
            if (i17 <= 0) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3) dVar.f414763b).u7(i17, dVar.f414762a.size() - i17);
            } else {
                int i18 = i17 - 1;
                ((com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3) dVar.f414763b).u7(i18, dVar.f414762a.size() - i18);
            }
        }
    }
}
