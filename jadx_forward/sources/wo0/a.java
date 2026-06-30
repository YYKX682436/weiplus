package wo0;

/* loaded from: classes15.dex */
public final class a extends cp0.d {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yz5.p f529402c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(yz5.p pVar, cp0.n nVar) {
        super(nVar);
        this.f529402c = pVar;
    }

    @Override // cp0.d, cp0.f
    public /* bridge */ /* synthetic */ boolean b(java.lang.Object obj, cp0.n nVar) {
        b((android.graphics.Bitmap) obj, nVar);
        return true;
    }

    @Override // cp0.d
    /* renamed from: e */
    public boolean b(android.graphics.Bitmap bitmap, cp0.n viewWeakHolder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewWeakHolder, "viewWeakHolder");
        super.b(bitmap, viewWeakHolder);
        yz5.p pVar = this.f529402c;
        if (pVar == null) {
            return true;
        }
        pVar.mo149xb9724478(viewWeakHolder, bitmap);
        return true;
    }
}
