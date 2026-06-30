package k91;

/* loaded from: classes.dex */
public final class i3 {
    public i3(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final void a(com.p314xaae8f345.p3133xd0ce8b26.aff.udr.x resource) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resource, "resource");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("UDRBizWAGameIconInfoFeatureService", "unzipResource, resource info: %s", resource.toString());
        com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(resource.m117639xfb83cc9b());
        java.lang.String str = a17.f294812f;
        if (str != null) {
            java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str, false, false);
            if (!str.equals(l17)) {
                a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
            }
        }
        java.lang.String c17 = resource.c();
        if (c17 == null) {
            return;
        }
        int Q = com.p314xaae8f345.mm.vfs.w6.Q(com.p314xaae8f345.mm.vfs.w6.i(a17.m82499x9616526c(), false), c17);
        if (Q < 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("UDRBizWAGameIconInfoFeatureService", "postProcess unzip resource failed, projectId: %s, resourcePath: %s, outputPath: %s", resource.d(), resource.m117639xfb83cc9b(), c17);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("UDRBizWAGameIconInfoFeatureService", "unzip success, resource original path: %s, outputPath: %s", resource.m117639xfb83cc9b(), c17);
        }
        boolean z17 = Q >= 0;
        java.lang.String m117639xfb83cc9b = resource.m117639xfb83cc9b();
        if (m117639xfb83cc9b.length() == 0) {
            return;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(m117639xfb83cc9b).putBoolean("ready", z17);
    }
}
