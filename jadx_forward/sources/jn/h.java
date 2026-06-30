package jn;

/* loaded from: classes11.dex */
public class h extends com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ jn.j f382000a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(jn.j jVar, java.lang.String str) {
        super(str);
        this.f382000a = jVar;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.n3
    /* renamed from: handleMessage */
    public void mo1038x5b586cbf(android.os.Message message) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.openIm.OpenImMigrateService", "handleMessage running, %s", java.lang.Integer.valueOf(this.f382000a.f382003b.size()));
        if (this.f382000a.f382003b.isEmpty()) {
            return;
        }
        this.f382000a.f382002a = ((ku5.t0) ku5.t0.f394148d).h(this.f382000a.f382007f, "migrate_tag");
    }
}
