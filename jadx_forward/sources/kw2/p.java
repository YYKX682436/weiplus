package kw2;

/* loaded from: classes15.dex */
public final class p extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kw2.y f394608d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f394609e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f394610f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(kw2.y yVar, java.lang.String str, long j17) {
        super(0);
        this.f394608d = yVar;
        this.f394609e = str;
        this.f394610f = j17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        kw2.h hVar = (kw2.h) this.f394608d.f394650c.get(this.f394609e);
        if (hVar != null && !hVar.f394552c) {
            java.util.ArrayList arrayList = hVar.f394555f;
            if (!arrayList.isEmpty()) {
                kw2.e eVar = (kw2.e) kz5.n0.i0(arrayList);
                if (!eVar.A) {
                    long j17 = this.f394610f;
                    if (j17 > 50) {
                        eVar.R.add(java.lang.Integer.valueOf((int) (j17 / 100)));
                    }
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
