package my;

/* loaded from: classes.dex */
public final class a extends ea5.l {
    @Override // ea5.l, com.p314xaae8f345.p3133xd0ce8b26.aff.udr.i
    /* renamed from: getProjectId */
    public java.lang.String mo472xca17635e() {
        return "ilinkres_51db20b7";
    }

    @Override // ea5.l, com.p314xaae8f345.p3133xd0ce8b26.aff.udr.i
    /* renamed from: postProcessAsync */
    public void mo473xaee99e0d(long j17, com.p314xaae8f345.p3133xd0ce8b26.aff.udr.x resource) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resource, "resource");
        super.mo473xaee99e0d(j17, resource);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ChatBotWeAppLocalModelFeatureService", "resource info: " + resource.d() + ' ' + resource.m117638xfb82e301());
        java.lang.String m117639xfb83cc9b = resource.m117639xfb83cc9b();
        java.lang.String c17 = resource.c();
        com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(c17);
        java.lang.String str = a17.f294812f;
        if (str != null) {
            java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str, false, false);
            if (!str.equals(l17)) {
                a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
            }
        }
        com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null);
        if (!(m17.a() ? m17.f294799a.F(m17.f294800b) : false)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ChatBotWeAppLocalModelFeatureService", "dir not exist, path: ".concat(c17));
        } else if (com.p314xaae8f345.mm.vfs.w6.Q(m117639xfb83cc9b, c17) != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ChatBotWeAppLocalModelFeatureService", "unpack resource error");
        }
    }
}
