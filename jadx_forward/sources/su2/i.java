package su2;

/* loaded from: classes5.dex */
public final class i extends ea5.l {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f494283d = "FinderUdrResourceFeatureService";

    @Override // ea5.l, com.p314xaae8f345.p3133xd0ce8b26.aff.udr.i
    /* renamed from: getParameter */
    public java.util.ArrayList mo14972x73ec24f3() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        su2.p pVar = su2.p.f494300a;
        java.util.Iterator it = ((java.util.LinkedHashMap) su2.p.f494301b).values().iterator();
        while (it.hasNext()) {
            ((su2.f) it.next()).getClass();
        }
        return arrayList;
    }

    @Override // ea5.l, com.p314xaae8f345.p3133xd0ce8b26.aff.udr.i
    /* renamed from: getProjectId */
    public java.lang.String mo472xca17635e() {
        return "ilinkres_6c359432";
    }

    @Override // ea5.l, com.p314xaae8f345.p3133xd0ce8b26.aff.udr.i
    /* renamed from: postProcessAsync */
    public void mo473xaee99e0d(long j17, com.p314xaae8f345.p3133xd0ce8b26.aff.udr.x resource) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resource, "resource");
        super.mo473xaee99e0d(j17, resource);
        su2.p pVar = su2.p.f494300a;
        su2.f fVar = (su2.f) ((java.util.LinkedHashMap) su2.p.f494301b).get(resource.m117638xfb82e301());
        if (fVar != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f494283d, "postProcess " + fVar + " resourcePostPath: " + resource.c());
        }
    }
}
