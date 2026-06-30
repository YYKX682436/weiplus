package bv0;

/* loaded from: classes5.dex */
public final class c extends bv0.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ bv0.e f24685a;

    public c(bv0.e eVar) {
        this.f24685a = eVar;
    }

    @Override // bv0.f
    public void a(bv0.h detector) {
        kotlin.jvm.internal.o.g(detector, "detector");
        bv0.d dVar = bv0.d.f24688f;
        bv0.e eVar = this.f24685a;
        eVar.f24693d = dVar;
        java.util.Iterator it = eVar.f24694e.iterator();
        while (it.hasNext()) {
            ((bv0.a) it.next()).b();
        }
    }

    @Override // bv0.f
    public void b(bv0.h detector) {
        kotlin.jvm.internal.o.g(detector, "detector");
        float a17 = detector.a();
        float f17 = -(detector.f24702h - detector.f24703i);
        bv0.e eVar = this.f24685a;
        boolean z17 = eVar.f24693d == bv0.d.f24686d;
        java.util.Iterator it = eVar.f24694e.iterator();
        while (it.hasNext()) {
            ((bv0.a) it.next()).c(a17, f17, z17);
        }
        eVar.f24693d = bv0.d.f24687e;
    }

    @Override // bv0.f
    public boolean d(bv0.h detector) {
        kotlin.jvm.internal.o.g(detector, "detector");
        bv0.d dVar = bv0.d.f24686d;
        bv0.e eVar = this.f24685a;
        eVar.f24693d = dVar;
        return eVar.f24692c;
    }
}
