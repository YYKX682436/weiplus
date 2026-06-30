package sk4;

/* loaded from: classes14.dex */
public final class a implements f25.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f25.f0 f490495d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sk4.b f490496e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f490497f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ byte[] f490498g;

    public a(f25.f0 f0Var, sk4.b bVar, int i17, byte[] bArr) {
        this.f490495d = f0Var;
        this.f490496e = bVar;
        this.f490497f = i17;
        this.f490498g = bArr;
    }

    @Override // f25.f
    public void c(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AudioModuleImpl", "scene: " + this.f490495d + ", onResume, lose audio focus");
        sk4.b.a(this.f490496e, this.f490497f, this.f490498g);
    }

    @Override // f25.f
    /* renamed from: onResume */
    public void mo44161x57429eec() {
    }

    @Override // f25.f
    /* renamed from: onStop */
    public void mo44162xc39f8281() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AudioModuleImpl", "scene: " + this.f490495d + ", onStop, lose audio focus");
        sk4.b.a(this.f490496e, this.f490497f, this.f490498g);
    }
}
