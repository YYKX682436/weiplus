package h14;

/* loaded from: classes5.dex */
public final class m0 implements com.p314xaae8f345.mm.p2621x8fb0427b.p3 {
    @Override // com.p314xaae8f345.mm.p2621x8fb0427b.p3
    public void g(int i17, l75.a1 a1Var, java.lang.Object obj) {
        i95.m c17 = i95.n0.c(vd0.o3.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        jm0.o oVar = (jm0.o) c17;
        if (!jm0.g.class.isAssignableFrom(xd0.a.class)) {
            throw new java.lang.IllegalArgumentException(oVar.getClass().getName().concat(" must extends FeatureServiceComponent"));
        }
        p012xc85e97e9.p093xedfae76a.c1 a17 = new p012xc85e97e9.p093xedfae76a.j1(oVar.getViewModel(), new jm0.e(oVar)).a(xd0.a.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        xd0.a aVar = (xd0.a) ((jm0.g) a17);
        if (gm0.j1.a()) {
            java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = aVar.f535146f;
            if (copyOnWriteArrayList.isEmpty()) {
                return;
            }
            java.lang.Object l17 = gm0.j1.u().c().l(7, null);
            java.lang.Integer num = l17 instanceof java.lang.Integer ? (java.lang.Integer) l17 : null;
            boolean z17 = !(num != null && (num.intValue() & 2) == 0);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsEmailFSC", "notifyUserInfoStatusChanged verified : " + z17);
            if (z17 && com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
                java.util.Iterator it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    v14.x xVar = (v14.x) ((xd0.d) it.next());
                    if (z17) {
                        v14.y yVar = xVar.f514123a;
                        if (!yVar.f514124d) {
                            yVar.f514124d = true;
                            yVar.T6();
                            d75.b.g(new v14.w(yVar));
                        }
                    } else {
                        xVar.getClass();
                    }
                }
            }
        }
    }
}
