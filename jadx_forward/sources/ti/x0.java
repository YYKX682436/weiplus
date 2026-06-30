package ti;

/* loaded from: classes16.dex */
public class x0 {

    /* renamed from: a, reason: collision with root package name */
    public final dc.m f501056a;

    public x0(java.io.File file) {
        java.lang.Object obj;
        vi.b.a(file, "hprofFile");
        dc.i iVar = new dc.i(new ec.b(file));
        ec.a aVar = iVar.f310159a;
        dc.m mVar = new dc.m(aVar);
        iVar.f310161c = mVar;
        do {
        } while (((ec.b) aVar).c() != 0);
        int d17 = ((ec.b) aVar).d();
        iVar.f310160b = d17;
        iVar.f310161c.k(d17);
        ((ec.b) aVar).e();
        while (true) {
            ec.b bVar = (ec.b) aVar;
            if (!(bVar.f332461d < bVar.f332460c)) {
                break;
            }
            int i17 = iVar.i();
            ((ec.b) aVar).d();
            long d18 = ((ec.b) aVar).d() & io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28565x745483d5.f70718x647d53d2;
            if (i17 == 1) {
                iVar.g(((int) d18) - iVar.f310160b);
            } else if (i17 == 2) {
                iVar.b();
            } else if (i17 == 4) {
                iVar.e();
            } else if (i17 == 5) {
                iVar.f();
            } else if (i17 == 12) {
                iVar.c(d18);
                iVar.f310161c.j(0, "default");
            } else if (i17 != 28) {
                iVar.k(d18);
            } else {
                iVar.c(d18);
                iVar.f310161c.j(0, "default");
            }
        }
        iVar.f310161c.h();
        iVar.f310161c.i();
        iVar.f310163e.clear();
        iVar.f310162d.clear();
        fc.k kVar = new fc.k();
        java.util.ArrayList arrayList = ((dc.h) mVar.f310188b.get(0)).f310153d;
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            dc.k kVar2 = (dc.k) it.next();
            java.lang.String format = java.lang.String.format("%s@0x%08x", kVar2.f310168h.f310186d, java.lang.Long.valueOf(kVar2.f310164d));
            if (!kVar.m129326xde2d761f(format)) {
                kVar.put(format, kVar2);
            }
        }
        arrayList.clear();
        java.lang.Object[] objArr = kVar.f342461i;
        int length = objArr.length;
        while (true) {
            int i18 = length - 1;
            if (length <= 0 || !((obj = objArr[i18]) == null || obj == fc.s.f342459n || arrayList.add(kVar.get((java.lang.String) obj)))) {
                break;
            } else {
                length = i18;
            }
        }
        this.f501056a = mVar;
    }
}
