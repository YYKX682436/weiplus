package yg1;

/* loaded from: classes7.dex */
public class a extends com.p314xaae8f345.p425x1ea3c036.p426xadb2a389.p427x316220.c {

    /* renamed from: b, reason: collision with root package name */
    public static final z81.k f543848b = new zg1.d();

    @Override // pd.c
    public void a(pd.b bVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuggageInitDelegateWxImpl", "onInitComponent %s", bm5.f1.a());
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.n) bVar).b(o91.d.class, this.f128735a);
    }

    @Override // pd.c
    public void b(pd.d dVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuggageInitDelegateWxImpl", "onInitialize %s", bm5.f1.a());
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        android.content.Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        com.p314xaae8f345.mm.vfs.b3.E = context;
        dVar.b(o91.d.class, this.f128735a);
        dVar.b(z81.k.class, f543848b);
    }
}
