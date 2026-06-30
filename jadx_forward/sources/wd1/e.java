package wd1;

/* loaded from: classes7.dex */
public final class e extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f526335d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wd1.k f526336e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(java.lang.String str, wd1.k kVar) {
        super(0);
        this.f526335d = str;
        this.f526336e = kVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        wl1.h hVar;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f526335d) && (hVar = this.f526336e.f526357f) != null) {
            java.lang.String script = this.f526335d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(script, "script");
            wl1.d dVar = new wl1.d(hVar, script);
            if (hVar.f528574a.get()) {
                dVar.mo152xb9724478();
            } else {
                synchronized (hVar) {
                    hVar.f528575b.add(new wl1.b(dVar));
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
