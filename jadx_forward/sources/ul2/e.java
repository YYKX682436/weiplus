package ul2;

/* loaded from: classes5.dex */
public final class e extends ea5.l {
    @Override // ea5.l, com.p314xaae8f345.p3133xd0ce8b26.aff.udr.i
    /* renamed from: getParameter */
    public java.util.ArrayList mo14972x73ec24f3() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.p314xaae8f345.p3133xd0ce8b26.aff.udr.v vVar = new com.p314xaae8f345.p3133xd0ce8b26.aff.udr.v();
        vVar.d("InnerVersion");
        vVar.c(3);
        vVar.e(1);
        arrayList.add(vVar);
        com.p314xaae8f345.p3133xd0ce8b26.aff.udr.v vVar2 = new com.p314xaae8f345.p3133xd0ce8b26.aff.udr.v();
        vVar2.d("InnerVersion_Karaoke");
        vVar2.c(5);
        vVar2.e(1);
        arrayList.add(vVar2);
        return arrayList;
    }

    @Override // ea5.l, com.p314xaae8f345.p3133xd0ce8b26.aff.udr.i
    /* renamed from: getProjectId */
    public java.lang.String mo472xca17635e() {
        return "ilinkres_68d95938";
    }

    @Override // ea5.l, com.p314xaae8f345.p3133xd0ce8b26.aff.udr.i
    /* renamed from: postProcessAsync */
    public void mo473xaee99e0d(long j17, com.p314xaae8f345.p3133xd0ce8b26.aff.udr.x resource) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resource, "resource");
        super.mo473xaee99e0d(j17, resource);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("URDLiveKTVSoFeatureServ", "project rsp: " + resource.m117639xfb83cc9b() + " postPath: " + resource.c());
        java.lang.String o17 = new com.p314xaae8f345.mm.vfs.r6(resource.c(), "lib_ktv_so").o();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(o17, "getAbsolutePath(...)");
        java.lang.String m117639xfb83cc9b = resource.m117639xfb83cc9b();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m117639xfb83cc9b, "getPath(...)");
        wl2.e.a(m117639xfb83cc9b, o17);
    }
}
