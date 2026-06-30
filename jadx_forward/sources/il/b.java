package il;

/* loaded from: classes13.dex */
public class b implements jl.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f373511a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ il.e f373512b;

    public b(il.e eVar, java.lang.String str) {
        this.f373512b = eVar;
        this.f373511a = str;
    }

    @Override // jl.e
    public void a() {
        java.lang.String c17 = rl.a.c(this.f373511a, "audio_cache_path_file.txt");
        il.e eVar = this.f373512b;
        eVar.f373518c = c17;
        int i17 = rl.b.f478676a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mix.AudioCachePathMgr", "readData", null);
        jl.d dVar = new jl.d(new il.d(eVar), "readData", 5);
        ll.m.a();
        ll.m.b(dVar);
    }

    @Override // jl.e
    public void end() {
    }
}
