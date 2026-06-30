package vc1;

/* loaded from: classes13.dex */
public class f3 implements java.lang.Runnable {
    @Override // java.lang.Runnable
    public void run() {
        java.util.Set set = vc1.h3.f516509b;
        java.util.HashSet hashSet = new java.util.HashSet(set);
        ((java.util.concurrent.CopyOnWriteArraySet) set).clear();
        java.util.Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            vc1.p1 p1Var = (vc1.p1) ((vc1.a3) it.next());
            p1Var.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Map.DefaultTencentMapView", "map:%s onDestroy", p1Var);
            p1Var.f516606g0.set(true);
            com.p314xaae8f345.mm.p1006xc5476f33.p1818x94e99802.api.C16320xe3e95109 c16320xe3e95109 = p1Var.f516601e;
            c16320xe3e95109.mo98897xb5885626().mo99007x16135f64(null);
            p1Var.M();
            p1Var.L();
            p1Var.L();
            ik1.h0.b(new vc1.l(p1Var));
            p1Var.K();
            p1Var.N();
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = (java.util.concurrent.ConcurrentHashMap) p1Var.O;
            java.util.Iterator it6 = concurrentHashMap.values().iterator();
            while (it6.hasNext()) {
                ((com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.InterfaceC4397xf8628040) it6.next()).mo37162xc84af884();
            }
            concurrentHashMap.clear();
            c16320xe3e95109.mo98897xb5885626().mo99011x15447a0d(null);
            c16320xe3e95109.mo996x5a5b649();
            c16320xe3e95109.mo98903xac79a11b();
            vc1.c3 c3Var = p1Var.f516598c0;
            if (c3Var != null) {
                com.p314xaae8f345.p519xbf8bc95e.p534xc815657d.p535x633fb29.InterfaceC4409x88f1805a interfaceC4409x88f1805a = c3Var.f516475d;
                if (interfaceC4409x88f1805a != null) {
                    interfaceC4409x88f1805a.mo37126xc84af884();
                    c3Var.f516475d = null;
                }
                p1Var.f516598c0 = null;
            }
            if (p1Var.f516596b0) {
                ((lk1.c) nd.f.a(lk1.c.class)).ia("gcj02", p1Var.f516600d0, p1Var.u());
                vc1.h3.g(p1Var);
            } else if (p1Var.A) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Map.DefaultTencentMapView", "unregisterLocation from needGetMyLocation when onDestroy");
                p1Var.g0();
            }
        }
    }
}
