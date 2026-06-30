package pe5;

/* loaded from: classes12.dex */
public final class d implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ pe5.f f435266a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o70.k f435267b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f435268c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f435269d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f435270e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f435271f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ t15.a f435272g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ pe5.h f435273h;

    public d(pe5.f fVar, o70.k kVar, int i17, java.lang.String str, int i18, long j17, t15.a aVar, pe5.h hVar) {
        this.f435266a = fVar;
        this.f435267b = kVar;
        this.f435268c = i17;
        this.f435269d = str;
        this.f435270e = i18;
        this.f435271f = j17;
        this.f435272g = aVar;
        this.f435273h = hVar;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1
    public final void a(boolean z17, java.lang.String str) {
        pe5.h hVar = this.f435273h;
        if (z17) {
            pe5.f.a(this.f435266a, this.f435267b, this.f435268c, this.f435269d, this.f435270e, this.f435271f, this.f435272g);
            ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.sc) hVar).a();
            return;
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21639xb2c1ee07 activityC21639xb2c1ee07 = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.sc) hVar).f284204a;
        if (!activityC21639xb2c1ee07.isFinishing()) {
            activityC21639xb2c1ee07.f279849e.dismiss();
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21639xb2c1ee07.f279848g = false;
        activityC21639xb2c1ee07.setResult(0, activityC21639xb2c1ee07.getIntent());
        if (activityC21639xb2c1ee07.isFinishing()) {
            return;
        }
        activityC21639xb2c1ee07.finish();
    }
}
