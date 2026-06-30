package oi1;

/* loaded from: classes7.dex */
public abstract class f implements oi1.j {
    @Override // oi1.j
    public oi1.n a() {
        return oi1.n.f427140d;
    }

    @Override // oi1.j
    public boolean b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 runtime, java.lang.String scene, java.lang.Runnable runnable) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(runtime, "runtime");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scene, "scene");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w2 m52169xfdaa7672 = runtime.x0().m52169xfdaa7672();
        oi1.l w17 = m52169xfdaa7672 != null ? m52169xfdaa7672.w(oi1.n.f427140d) : null;
        if (w17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandPageNavigateBackSilentInterceptor", "navigateBackInterceptionInfo is null");
            return false;
        }
        if (!w17.a(scene)) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandPageNavigateBackSilentInterceptor", "scene:[" + scene + "] intercept!!");
        ze.n nVar = (ze.n) runtime;
        int hashCode = scene.hashCode();
        nd1.a aVar = nd1.b.f417793i;
        switch (hashCode) {
            case -1128437284:
                if (scene.equals("scene_actionbar_back")) {
                    aVar.a(nVar, 3);
                    break;
                }
                break;
            case 13653565:
                if (scene.equals("scene_back_key_pressed")) {
                    aVar.a(nVar, 2);
                    break;
                }
                break;
            case 298295391:
                if (scene.equals("scene_swipe_back")) {
                    aVar.a(nVar, 1);
                    break;
                }
                break;
            case 560038708:
                if (scene.equals("scene_jsapi_navigate_back")) {
                    aVar.a(nVar, 4);
                    break;
                }
                break;
        }
        return true;
    }

    @Override // oi1.j
    /* renamed from: priority */
    public oi1.i mo151428xba8879a4() {
        return oi1.g.f427133b;
    }
}
