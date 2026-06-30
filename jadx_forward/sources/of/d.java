package of;

/* loaded from: classes3.dex */
public final class d extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ of.h f426358d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(of.h hVar) {
        super(0);
        this.f426358d = hVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.List<of.t> list = this.f426358d.f426361a;
        of.t tVar = new of.t("", 0L, 0L, "");
        long j17 = 0;
        for (of.t tVar2 : list) {
            long j18 = tVar2.f426392b;
            long j19 = tVar.f426393c;
            long j27 = j18 - j19;
            j17 += j27;
            arrayList.add(new of.c(j27, j19, j18));
            tVar = tVar2;
        }
        return new of.a(j17, kz5.n0.E0(arrayList));
    }
}
