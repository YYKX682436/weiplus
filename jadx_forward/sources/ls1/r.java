package ls1;

/* loaded from: classes8.dex */
public final class r implements nw4.o2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ls1.e0 f402541a;

    public r(ls1.e0 e0Var) {
        this.f402541a = e0Var;
    }

    @Override // nw4.o2
    public final boolean a(nw4.y2 y2Var, com.p314xaae8f345.mm.p2496xc50a8ce6.C19775x58fd37b3 c19775x58fd37b3) {
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(y2Var.f422552i, "notifyPageInfo");
        ls1.e0 e0Var = this.f402541a;
        if (b17) {
            e0Var.B1();
            e0Var.getClass();
            try {
                e0Var.F1(ls1.e0.G1(y2Var));
                e0Var.g0().e(y2Var.f422546c, "notifyPageInfo:ok", null);
                ax4.a.a(90);
                p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.i2.f392010d, null, null, new ls1.s(e0Var, null), 3, null);
                return true;
            } catch (android.os.RemoteException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(e0Var.B1(), e17, "", new java.lang.Object[0]);
                e0Var.g0().e(y2Var.f422546c, "notifyPageInfo:fail", null);
                ax4.a.a(91);
                return true;
            } catch (org.json.JSONException e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(e0Var.B1(), e18, "", new java.lang.Object[0]);
                e0Var.g0().e(y2Var.f422546c, "notifyPageInfo:fail", null);
                ax4.a.a(91);
                return true;
            }
        }
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(y2Var.f422552i, "updatePageAuth")) {
            return false;
        }
        e0Var.B1();
        e0Var.getClass();
        ax4.a.a(80);
        java.lang.String i17 = e0Var.i();
        java.util.HashSet hashSet = e0Var.f402512e2;
        if (!hashSet.contains(i17)) {
            hashSet.add(i17);
            e0Var.O().r(i17, 8, new ls1.d0(e0Var, i17, y2Var));
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(e0Var.B1(), "updatePageAuth fail, url:%s already run");
        nw4.n g07 = e0Var.g0();
        if (g07 != null) {
            g07.e(y2Var.f422546c, y2Var.f422552i + ":fail updating", null);
        }
        ax4.a.a(82);
        return true;
    }
}
