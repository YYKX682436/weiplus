package g16;

/* loaded from: classes15.dex */
public final class k implements g16.o0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g16.l f349166a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f349167b;

    public k(g16.l lVar, java.util.ArrayList arrayList) {
        this.f349166a = lVar;
        this.f349167b = arrayList;
    }

    @Override // g16.o0
    public void a() {
    }

    @Override // g16.o0
    public g16.m0 b(n16.b classId, o06.x1 source) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(classId, "classId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        return this.f349166a.r(classId, source, this.f349167b);
    }
}
