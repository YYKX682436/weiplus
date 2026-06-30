package re;

/* loaded from: classes7.dex */
public final class g extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ re.n f475803d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(re.n nVar) {
        super(1);
        this.f475803d = nVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        cf.m lifecycle = (cf.m) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lifecycle, "$this$lifecycle");
        re.n nVar = this.f475803d;
        lifecycle.a(new re.c(nVar));
        re.d dVar = new re.d(nVar);
        u81.b bVar = u81.b.SUSPEND;
        android.util.ArrayMap arrayMap = lifecycle.f122361e;
        arrayMap.put(bVar, dVar);
        arrayMap.put(u81.b.FOREGROUND, new re.e(nVar));
        lifecycle.b(new re.f(nVar));
        return jz5.f0.f384359a;
    }
}
