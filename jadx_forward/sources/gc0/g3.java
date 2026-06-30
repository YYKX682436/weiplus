package gc0;

/* loaded from: classes5.dex */
public final class g3 extends ea5.l {
    public final java.lang.String b(java.lang.String postPath, java.lang.String name) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(postPath, "postPath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(postPath, name);
        if (r6Var.m()) {
            return r6Var.o();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemarkUdrConfig", name + " does not exist at " + r6Var.o());
        return null;
    }

    @Override // ea5.l, com.p314xaae8f345.p3133xd0ce8b26.aff.udr.i
    /* renamed from: getParameter */
    public java.util.ArrayList mo14972x73ec24f3() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.p314xaae8f345.p3133xd0ce8b26.aff.udr.v vVar = new com.p314xaae8f345.p3133xd0ce8b26.aff.udr.v();
        vVar.d("RecommendRemarkEnable");
        vVar.c(1);
        vVar.e(1);
        arrayList.add(vVar);
        com.p314xaae8f345.p3133xd0ce8b26.aff.udr.v vVar2 = new com.p314xaae8f345.p3133xd0ce8b26.aff.udr.v();
        vVar2.d("sdkversion");
        vVar2.c(2);
        vVar2.e(1);
        arrayList.add(vVar2);
        return arrayList;
    }

    @Override // ea5.l, com.p314xaae8f345.p3133xd0ce8b26.aff.udr.i
    /* renamed from: getProjectId */
    public java.lang.String mo472xca17635e() {
        return "ilinkres_0f34f0cc";
    }

    @Override // ea5.l, com.p314xaae8f345.p3133xd0ce8b26.aff.udr.i
    /* renamed from: postProcessAsync */
    public void mo473xaee99e0d(long j17, com.p314xaae8f345.p3133xd0ce8b26.aff.udr.x resource) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resource, "resource");
        super.mo473xaee99e0d(j17, resource);
        java.lang.String c17 = resource.c();
        if (c17 != null) {
            java.lang.String m117639xfb83cc9b = resource.m117639xfb83cc9b();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m117639xfb83cc9b, "getPath(...)");
            if (!(m117639xfb83cc9b.length() == 0)) {
                if (!(c17.length() == 0)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemarkUdrConfig", "checkAndUnzip zipFilePath:" + m117639xfb83cc9b + " unzipFolder: " + c17);
                    if ((m117639xfb83cc9b.length() == 0) || !com.p314xaae8f345.mm.vfs.w6.j(m117639xfb83cc9b)) {
                        return;
                    }
                    java.lang.String concat = c17.concat("_temp");
                    com.p314xaae8f345.mm.vfs.w6.f(concat);
                    com.p314xaae8f345.mm.vfs.w6.f(c17);
                    com.p314xaae8f345.mm.vfs.w6.u(concat);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemarkUdrConfig", "unZip result unzipStatus: " + com.p314xaae8f345.mm.vfs.w6.Q(m117639xfb83cc9b, concat) + " moveDirStatus: " + com.p314xaae8f345.mm.vfs.w6.v(concat, c17));
                    return;
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RemarkUdrConfig", "unZip fail path empty, zipFilePath: " + m117639xfb83cc9b + " unzipFolder: " + c17);
        }
    }
}
