package mn2;

/* loaded from: classes15.dex */
public final class b implements ki.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f411446d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mn2.d f411447e;

    public b(int i17, mn2.d dVar) {
        this.f411446d = i17;
        this.f411447e = dVar;
    }

    @Override // ki.a
    public void a(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.DefaultBitmapMemoryCache", "[systemTrim] level(" + i17 + ") trim to " + this.f411446d);
        this.f411447e.f411469a.mo143584x5a5b64d();
    }

    @Override // ki.a
    public void b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.DefaultBitmapMemoryCache", "[backgroundTrim] trim to " + this.f411446d);
        this.f411447e.f411469a.mo143584x5a5b64d();
    }
}
