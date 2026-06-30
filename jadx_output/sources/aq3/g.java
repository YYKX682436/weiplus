package aq3;

/* loaded from: classes12.dex */
public final class g implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ aq3.l f13176d;

    public g(aq3.l lVar) {
        this.f13176d = lVar;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public final boolean onTimerExpired() {
        this.f13176d.d();
        return true;
    }
}
