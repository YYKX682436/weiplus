package a7;

/* loaded from: classes13.dex */
public final class t implements a7.p0 {

    /* renamed from: a, reason: collision with root package name */
    public final a7.p f83392a;

    public t(a7.p pVar) {
        this.f83392a = pVar;
    }

    @Override // a7.p0
    public boolean a(java.lang.Object obj) {
        return obj.toString().startsWith("data:image");
    }

    @Override // a7.p0
    public a7.o0 b(java.lang.Object obj, int i17, int i18, t6.l lVar) {
        return new a7.o0(new p7.b(obj), new a7.q(obj.toString(), this.f83392a));
    }
}
