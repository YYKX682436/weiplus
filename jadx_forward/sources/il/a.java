package il;

/* loaded from: classes13.dex */
public class a implements jl.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f373508a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f373509b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ il.e f373510c;

    public a(il.e eVar, java.lang.String str, java.lang.String str2) {
        this.f373510c = eVar;
        this.f373508a = str;
        this.f373509b = str2;
    }

    @Override // jl.e
    public void a() {
        java.lang.String c17 = rl.a.c(this.f373508a, "audio_cache_path_file.txt");
        il.e eVar = this.f373510c;
        eVar.f373518c = c17;
        int i17 = rl.b.f478676a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mix.AudioCachePathMgr", "saveData", null);
        jl.d dVar = new jl.d(new il.c(eVar), "saveData", 5);
        ll.m.a();
        ll.m.b(dVar);
        eVar.f373518c = rl.a.c(this.f373509b, "audio_cache_path_file.txt");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mix.AudioCachePathMgr", "readData", null);
        jl.d dVar2 = new jl.d(new il.d(eVar), "readData", 5);
        ll.m.a();
        ll.m.b(dVar2);
    }

    @Override // jl.e
    public void end() {
    }
}
