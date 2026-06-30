package la1;

/* loaded from: classes7.dex */
public final class j extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1123xd0ce3e8d.n {

    /* renamed from: g, reason: collision with root package name */
    public final android.util.SparseArray f399032g;

    public j(android.util.SparseArray captureDelegateContainer) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(captureDelegateContainer, "captureDelegateContainer");
        this.f399032g = captureDelegateContainer;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1123xd0ce3e8d.n, gb1.f
    public /* bridge */ /* synthetic */ boolean J(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t tVar, int i17, android.view.View view, org.json.JSONObject jSONObject) {
        J((com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b) tVar, i17, view, jSONObject);
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1123xd0ce3e8d.n
    /* renamed from: K */
    public boolean J(com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b bVar, int i17, android.view.View view, org.json.JSONObject jSONObject) {
        ce.g gVar;
        android.util.SparseArray sparseArray = this.f399032g;
        de.a aVar = (de.a) sparseArray.get(i17);
        if (aVar != null) {
            if (bVar != null && (gVar = (ce.g) bVar.B1(ce.g.class)) != null) {
                ((ce.o) gVar).f122229t.remove(aVar);
            }
            sparseArray.remove(i17);
        }
        super.J(bVar, i17, view, jSONObject);
        return true;
    }
}
