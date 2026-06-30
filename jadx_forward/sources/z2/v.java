package z2;

/* loaded from: classes13.dex */
public final class v implements z2.w {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Intent f551057a;

    /* renamed from: b, reason: collision with root package name */
    public final int f551058b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p075x2eaf9f.app.AbstractServiceC1084x6c6d53dc f551059c;

    public v(p012xc85e97e9.p075x2eaf9f.app.AbstractServiceC1084x6c6d53dc abstractServiceC1084x6c6d53dc, android.content.Intent intent, int i17) {
        this.f551059c = abstractServiceC1084x6c6d53dc;
        this.f551057a = intent;
        this.f551058b = i17;
    }

    @Override // z2.w
    /* renamed from: complete */
    public void mo178324xdc453139() {
        this.f551059c.stopSelf(this.f551058b);
    }

    @Override // z2.w
    /* renamed from: getIntent */
    public android.content.Intent mo178325x1e885992() {
        return this.f551057a;
    }
}
