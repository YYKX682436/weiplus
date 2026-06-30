package co0;

/* loaded from: classes10.dex */
public final class x implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ co0.y f43742d;

    public x(co0.y yVar) {
        this.f43742d = yVar;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public final boolean onTimerExpired() {
        pm0.v.X(new co0.w(this.f43742d));
        return false;
    }
}
