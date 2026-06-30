package bj5;

/* loaded from: classes.dex */
public final class r extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bj5.y f21219d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(bj5.y yVar) {
        super(0);
        this.f21219d = yVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        bj5.y yVar = this.f21219d;
        ym3.f fVar = (pi5.d) ((jz5.n) yVar.f21252n).getValue();
        if (!com.tencent.mm.sdk.platformtools.t8.K0(yVar.f21245d)) {
            fVar = ((pi5.u) ((jz5.n) yVar.f21250i).getValue()).b((pi5.d) ((jz5.n) yVar.f21252n).getValue());
        }
        return ((pi5.f) ((jz5.n) yVar.f21253o).getValue()).b(fVar);
    }
}
