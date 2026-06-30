package fe1;

/* loaded from: classes15.dex */
public final class u extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.v0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fe1.v f343033d;

    public u(fe1.v vVar) {
        this.f343033d = vVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.v0
    public void c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onDestroy, appId=");
        fe1.v vVar = this.f343033d;
        sb6.append(vVar.f343035a);
        sb6.append(", removing manager");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.TransitCard.Manager", sb6.toString());
        ((java.util.concurrent.ConcurrentHashMap) fe1.v.f343034b).remove(vVar.f343035a);
    }
}
