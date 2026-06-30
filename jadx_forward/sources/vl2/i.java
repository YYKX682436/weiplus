package vl2;

/* loaded from: classes5.dex */
public final class i extends ea5.l {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f519374d = "LiveUdrResourceFeatureService";

    @Override // ea5.l, com.p314xaae8f345.p3133xd0ce8b26.aff.udr.i
    /* renamed from: getParameter */
    public java.util.ArrayList mo14972x73ec24f3() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        vl2.s sVar = vl2.s.f519401a;
        java.util.Iterator it = vl2.s.f519402b.iterator();
        while (it.hasNext()) {
            ((vl2.f) it.next()).getClass();
        }
        return arrayList;
    }

    @Override // ea5.l, com.p314xaae8f345.p3133xd0ce8b26.aff.udr.i
    /* renamed from: getProjectId */
    public java.lang.String mo472xca17635e() {
        return "ilinkres_b980a9e4";
    }

    @Override // ea5.l, com.p314xaae8f345.p3133xd0ce8b26.aff.udr.i
    /* renamed from: postProcessAsync */
    public void mo473xaee99e0d(long j17, com.p314xaae8f345.p3133xd0ce8b26.aff.udr.x resource) {
        java.lang.Object obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resource, "resource");
        super.mo473xaee99e0d(j17, resource);
        vl2.s sVar = vl2.s.f519401a;
        java.util.Iterator it = vl2.s.f519402b.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((vl2.f) obj).f519347a, resource.m117638xfb82e301())) {
                    break;
                }
            }
        }
        vl2.f fVar = (vl2.f) obj;
        if (fVar != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f519374d, "postProcess " + fVar + " resourcePostPaht: " + resource.c());
            if (fVar.f519348b) {
                java.lang.String c17 = resource.c();
                if (c17 == null || c17.length() == 0) {
                    return;
                }
                java.lang.String m117639xfb83cc9b = resource.m117639xfb83cc9b();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m117639xfb83cc9b, "getPath(...)");
                java.lang.String c18 = resource.c();
                if (c18 == null) {
                    c18 = "";
                }
                wl2.e.a(m117639xfb83cc9b, c18);
            }
        }
    }
}
