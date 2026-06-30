package im3;

/* loaded from: classes10.dex */
public final class k extends ym3.a {

    /* renamed from: d, reason: collision with root package name */
    public final r45.oc5 f374238d;

    public k(r45.oc5 previewItemObj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(previewItemObj, "previewItemObj");
        this.f374238d = previewItemObj;
    }

    @Override // ym3.a, ym3.f
    /* renamed from: c */
    public p3325xe03a0797.p3326xc267989b.p3328x30012e.j a(v65.i scope, ym3.c request) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scope, "scope");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(request, "request");
        ym3.d dVar = new ym3.d(request);
        u26.k0 k0Var = new u26.k0();
        r45.oc5 oc5Var = this.f374238d;
        int size = oc5Var.f463683e.size();
        for (int i17 = 0; i17 < size; i17++) {
            r45.ny5 ny5Var = (r45.ny5) oc5Var.f463683e.get(i17);
            r45.mc5 mc5Var = ny5Var.f463298d;
            if (mc5Var != null) {
                boolean z17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(oc5Var.f463684f, ny5Var.f463299e) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(oc5Var.f463685g, mc5Var.f461896d);
                java.util.ArrayList arrayList = dVar.f544682c;
                java.lang.String str = mc5Var.f461896d;
                if (str == null) {
                    str = "";
                }
                java.lang.String str2 = ny5Var.f463299e;
                im3.j jVar = new im3.j(str, 0, mc5Var, str2 != null ? str2 : "");
                jVar.f374235h = true;
                jVar.f374236i = z17;
                arrayList.add(jVar);
            }
        }
        k0Var.e(dVar);
        return new p3325xe03a0797.p3326xc267989b.p3328x30012e.r(k0Var);
    }
}
