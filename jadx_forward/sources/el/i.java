package el;

/* loaded from: classes9.dex */
public final class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ el.k f335249d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ el.g f335250e;

    public i(el.k kVar, el.g gVar) {
        this.f335249d = kVar;
        this.f335250e = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        el.k kVar = this.f335249d;
        kVar.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[handleAddFavorite] title = ");
        el.g gVar = this.f335250e;
        sb6.append(gVar.f335231b);
        sb6.append(", desc = ");
        sb6.append(gVar.f335232c);
        sb6.append(", appId = ");
        sb6.append(gVar.f335230a);
        sb6.append(", identifier = ");
        sb6.append(gVar.f335233d);
        sb6.append(", jumpType = ");
        sb6.append(gVar.f335238i);
        sb6.append(", page = ");
        sb6.append(gVar.f335239j);
        sb6.append(", query = ");
        sb6.append(gVar.f335240k);
        sb6.append(", bizId(subType) = ");
        sb6.append(gVar.f335234e);
        sb6.append(", mediaType = ");
        sb6.append(gVar.f335235f);
        sb6.append(", url = ");
        sb6.append(gVar.f335236g);
        sb6.append(", nickName = ");
        sb6.append(gVar.f335237h);
        sb6.append(", thumbUrl = ");
        sb6.append(gVar.f335241l);
        sb6.append(", transferCtx = ");
        sb6.append(gVar.f335242m);
        sb6.append(", excerptListSize = ");
        sb6.append(gVar.f335245p.size());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppJsApiFavoriteAction", sb6.toString());
        android.content.Context c17 = kVar.c();
        android.app.Activity activity = c17 instanceof android.app.Activity ? (android.app.Activity) c17 : null;
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73 c5303xc75d2f73 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73();
        kVar.B(gVar, activity, c5303xc75d2f73, new r45.bq0(), new r45.jq0(), new r45.op0());
        gm0.j1.d().a(401, kVar);
        c5303xc75d2f73.e();
    }
}
