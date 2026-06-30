package ch5;

/* loaded from: classes3.dex */
public final class j extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f41587d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f41588e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f41589f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.halfscreen.custom.CircleToSearchDraggableLayout f41590g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.l f41591h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yz5.a f41592i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(int i17, int i18, long j17, com.tencent.mm.ui.halfscreen.custom.CircleToSearchDraggableLayout circleToSearchDraggableLayout, yz5.l lVar, yz5.a aVar) {
        super(0);
        this.f41587d = i17;
        this.f41588e = i18;
        this.f41589f = j17;
        this.f41590g = circleToSearchDraggableLayout;
        this.f41591h = lVar;
        this.f41592i = aVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.animation.ValueAnimator ofInt = android.animation.ValueAnimator.ofInt(this.f41587d, this.f41588e);
        ofInt.setDuration(this.f41589f);
        ch5.i iVar = new ch5.i(this.f41590g, this.f41591h);
        ch5.h hVar = new ch5.h(this.f41592i, ofInt, iVar);
        ofInt.addUpdateListener(iVar);
        ofInt.addListener(hVar);
        ofInt.start();
        return jz5.f0.f302826a;
    }
}
