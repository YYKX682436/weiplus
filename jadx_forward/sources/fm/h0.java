package fm;

/* loaded from: classes7.dex */
public final class h0 extends ea5.l {
    @Override // ea5.l, com.p314xaae8f345.p3133xd0ce8b26.aff.udr.i
    /* renamed from: getProjectId */
    public java.lang.String mo472xca17635e() {
        return "ilinkres_9f0a6b36";
    }

    @Override // ea5.l, com.p314xaae8f345.p3133xd0ce8b26.aff.udr.i
    /* renamed from: postProcessAsync */
    public void mo473xaee99e0d(long j17, com.p314xaae8f345.p3133xd0ce8b26.aff.udr.x resource) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resource, "resource");
        super.mo473xaee99e0d(j17, resource);
        java.lang.String m117639xfb83cc9b = resource.m117639xfb83cc9b();
        if (m117639xfb83cc9b == null) {
            m117639xfb83cc9b = "";
        }
        java.lang.String c17 = resource.c();
        if (c17 == null) {
            c17 = "";
        }
        j65.b.h(m117639xfb83cc9b, c17, "");
        k65.l lVar = k65.l.f386150a;
        java.lang.String m117638xfb82e301 = resource.m117638xfb82e301();
        java.lang.String str = (java.lang.String) kz5.n0.i0(r26.n0.f0(m117638xfb82e301 == null ? "" : m117638xfb82e301, new java.lang.String[]{"_"}, false, 0, 6, null));
        if (str.length() > 0) {
            java.lang.String c18 = resource.c();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getPostPath(...)");
            if (c18.length() > 0) {
                com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(j65.b.f379451g, str);
                android.util.Pair c19 = j65.b.c(resource.c(), r6Var.o());
                java.lang.String o17 = r6Var.o();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(o17, "getAbsolutePath(...)");
                k65.l.f(o17, false);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("UDRBaseStringResPreloadService", "postProcess: moveRes: " + c19 + " downloadResourceVersion: " + str);
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("UDRBaseStringResPreloadService", "postProcess: " + resource.c() + " path: " + resource.m117639xfb83cc9b() + " resourceName: " + resource.m117638xfb82e301() + " currentVersion: 96b2c56e4056b923191227d71602c0ce");
    }
}
