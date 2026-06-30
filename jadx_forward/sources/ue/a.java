package ue;

/* loaded from: classes7.dex */
public final class a extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ue.e f508295d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ue.e eVar) {
        super(0);
        this.f508295d = eVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.util.ArrayList arrayList;
        ue.e eVar = this.f508295d;
        synchronized (eVar) {
            arrayList = new java.util.ArrayList(eVar.f508306i);
            arrayList.addAll(eVar.f508307m);
            eVar.f508306i.clear();
            eVar.f508307m.clear();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WorkerNativeJsRuntimeWrapper", "postCleanupJob count:" + arrayList.size());
        int size = arrayList.size();
        for (int i17 = 0; i17 < size; i17++) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.x xVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.x) arrayList.get(i17);
            if (xVar != null) {
                xVar.mo32099xac79a11b();
            }
        }
        return jz5.f0.f384359a;
    }
}
