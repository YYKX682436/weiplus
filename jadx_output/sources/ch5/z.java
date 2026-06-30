package ch5;

/* loaded from: classes11.dex */
public final class z extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ am.bu f41639d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.halfscreen.custom.CircleToSearchHalfScreen f41640e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(am.bu buVar, com.tencent.mm.ui.halfscreen.custom.CircleToSearchHalfScreen circleToSearchHalfScreen) {
        super(0);
        this.f41639d = buVar;
        this.f41640e = circleToSearchHalfScreen;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.ui.vas.VASActivity vASActivity;
        if (this.f41639d.f6286b < 0.05d && (vASActivity = this.f41640e.P) != null) {
            vASActivity.finish();
        }
        return jz5.f0.f302826a;
    }
}
