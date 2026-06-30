package h42;

/* loaded from: classes15.dex */
public abstract class a implements h42.c {

    /* renamed from: a, reason: collision with root package name */
    public j42.f f360439a;

    /* renamed from: b, reason: collision with root package name */
    public int f360440b = 0;

    public void a(java.lang.String str) {
        j42.f fVar;
        if (u46.l.e(str) || (fVar = this.f360439a) == null) {
            return;
        }
        fVar.mo140334xc84af884(str);
    }

    public void b() {
        this.f360440b = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_edge_computing_cache_storage_mode, 0);
        j42.f fVar = this.f360439a;
        if (fVar != null) {
            fVar.mo140333x5a5ddf8();
        }
        this.f360439a = null;
        int i17 = this.f360440b;
        if (i17 == 0) {
            this.f360439a = new j42.e(mo132856x368f3a());
        } else if (i17 == 1) {
            this.f360439a = new j42.a(mo132856x368f3a());
        }
        j42.f fVar2 = this.f360439a;
        if (fVar2 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("EdgeComputingDataCacheBase", "[EdgeComputingDataCacheBase] reset illegal storageMode : " + this.f360440b);
        } else {
            fVar2.mo140335x6761d4f();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("EdgeComputingDataCacheBase", "[EdgeComputingDataCacheBase] reset storageMode : " + this.f360440b);
        }
    }
}
