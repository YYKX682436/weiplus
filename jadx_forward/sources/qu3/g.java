package qu3;

/* loaded from: classes.dex */
public final class g extends ea5.l {
    @Override // ea5.l, com.p314xaae8f345.p3133xd0ce8b26.aff.udr.i
    /* renamed from: addToPeriod */
    public boolean mo40417x561213dd() {
        return true;
    }

    @Override // ea5.l, com.p314xaae8f345.p3133xd0ce8b26.aff.udr.i
    /* renamed from: getProjectId */
    public java.lang.String mo472xca17635e() {
        return "ilinkres_806b4baf";
    }

    @Override // ea5.l, com.p314xaae8f345.p3133xd0ce8b26.aff.udr.i
    /* renamed from: postProcessAsync */
    public void mo473xaee99e0d(long j17, com.p314xaae8f345.p3133xd0ce8b26.aff.udr.x resource) {
        java.lang.String c17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resource, "resource");
        super.mo473xaee99e0d(j17, resource);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("UDRSecondCutPromotionItems", "resource info: %s", resource.toString());
        com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(resource.m117639xfb83cc9b());
        java.lang.String str = a17.f294812f;
        if (str != null) {
            java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str, false, false);
            if (!str.equals(l17)) {
                a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
            }
        }
        if (((com.p314xaae8f345.mm.udr.e0) i95.n0.c(com.p314xaae8f345.mm.udr.e0.class)) == null || (c17 = resource.c()) == null) {
            return;
        }
        if (com.p314xaae8f345.mm.vfs.w6.Q(com.p314xaae8f345.mm.vfs.w6.i(a17.m82499x9616526c(), false), c17) < 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("UDRSecondCutPromotionItems", "postProcess unzip resource failed, projectId: %s, resourcePath: %s, outputPath: %s", resource.d(), resource.m117639xfb83cc9b(), c17);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("UDRSecondCutPromotionItems", "unzip success, resource original path: %s, outputPath: %s", resource.m117639xfb83cc9b(), c17);
        }
    }
}
