package w;

/* loaded from: classes13.dex */
public class b implements w.d {
    public final w.e a(w.c cVar) {
        return (w.e) ((w.a) cVar).f523342a;
    }

    public void b(w.c cVar, float f17) {
        w.e a17 = a(cVar);
        w.a aVar = (w.a) cVar;
        boolean m6989xb4864f5e = aVar.f523343b.m6989xb4864f5e();
        boolean m6987x34d165b0 = aVar.f523343b.m6987x34d165b0();
        if (f17 != a17.f523348e || a17.f523349f != m6989xb4864f5e || a17.f523350g != m6987x34d165b0) {
            a17.f523348e = f17;
            a17.f523349f = m6989xb4864f5e;
            a17.f523350g = m6987x34d165b0;
            a17.c(null);
            a17.invalidateSelf();
        }
        c(aVar);
    }

    public void c(w.c cVar) {
        float f17;
        w.a aVar = (w.a) cVar;
        if (!aVar.f523343b.m6989xb4864f5e()) {
            aVar.a(0, 0, 0, 0);
            return;
        }
        float f18 = a(aVar).f523348e;
        float f19 = a(aVar).f523344a;
        if (aVar.f523343b.m6987x34d165b0()) {
            f17 = (float) (f18 + ((1.0d - w.f.f523355a) * f19));
        } else {
            int i17 = w.f.f523356b;
            f17 = f18;
        }
        int ceil = (int) java.lang.Math.ceil(f17);
        int ceil2 = (int) java.lang.Math.ceil(w.f.a(f18, f19, r2.m6987x34d165b0()));
        aVar.a(ceil, ceil2, ceil, ceil2);
    }
}
