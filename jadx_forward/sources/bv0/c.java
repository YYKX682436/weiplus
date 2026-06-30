package bv0;

/* loaded from: classes5.dex */
public final class c extends bv0.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ bv0.e f106218a;

    public c(bv0.e eVar) {
        this.f106218a = eVar;
    }

    @Override // bv0.f
    public void a(bv0.h detector) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(detector, "detector");
        bv0.d dVar = bv0.d.f106221f;
        bv0.e eVar = this.f106218a;
        eVar.f106226d = dVar;
        java.util.Iterator it = eVar.f106227e.iterator();
        while (it.hasNext()) {
            ((bv0.a) it.next()).b();
        }
    }

    @Override // bv0.f
    public void b(bv0.h detector) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(detector, "detector");
        float a17 = detector.a();
        float f17 = -(detector.f106235h - detector.f106236i);
        bv0.e eVar = this.f106218a;
        boolean z17 = eVar.f106226d == bv0.d.f106219d;
        java.util.Iterator it = eVar.f106227e.iterator();
        while (it.hasNext()) {
            ((bv0.a) it.next()).c(a17, f17, z17);
        }
        eVar.f106226d = bv0.d.f106220e;
    }

    @Override // bv0.f
    public boolean d(bv0.h detector) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(detector, "detector");
        bv0.d dVar = bv0.d.f106219d;
        bv0.e eVar = this.f106218a;
        eVar.f106226d = dVar;
        return eVar.f106225c;
    }
}
