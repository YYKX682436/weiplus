package mz4;

/* loaded from: classes12.dex */
public class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f414805d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f414806e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ mz4.d f414807f;

    public e(mz4.d dVar, java.lang.String str, java.util.ArrayList arrayList) {
        this.f414807f = dVar;
        this.f414805d = str;
        this.f414806e = arrayList;
    }

    @Override // java.lang.Runnable
    public void run() {
        mz4.d dVar = this.f414807f;
        hz4.r b17 = hz4.s.b(dVar.f414762a, this.f414805d, this.f414806e, false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Note.NoteDataManager", "updateDataByHtml, mDataList size = " + dVar.f414762a.size() + ", dataListEmpty = " + (dVar.f414762a == null));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Note.NoteDataManager", "updateDataByHtml, start mNotifyListener.setUpNoteData(dataItems, true)");
        lz4.a aVar = dVar.f414763b;
        if (aVar != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3) aVar).B7(b17, true);
        }
    }
}
