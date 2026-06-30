package xs2;

/* loaded from: classes3.dex */
public final class i extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xs2.m f537868d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f537869e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(xs2.m mVar, float f17) {
        super(0);
        this.f537868d = mVar;
        this.f537869e = f17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        xs2.m mVar = this.f537868d;
        xs2.o oVar = mVar.f537884f;
        if (oVar != null) {
            oVar.e(this.f537869e, mVar.f537882d.getResources().getConfiguration().orientation == 2);
        }
        return jz5.f0.f384359a;
    }
}
