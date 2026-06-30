package qp5;

/* loaded from: classes9.dex */
public abstract class y {
    public static void a(com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359 c28001xdd2bb359, int i17, boolean z17) {
        if (c28001xdd2bb359 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FormatViewUtil", "hy: param error: no edit text view");
            return;
        }
        if (i17 == 1) {
            c28001xdd2bb359.m121628xbc8182be(true, z17);
            return;
        }
        if (i17 == 2) {
            c28001xdd2bb359.m121629x930fe401(true);
            return;
        }
        if (i17 == 3) {
            c28001xdd2bb359.m121625x85af8146(true);
            return;
        }
        if (i17 == 4) {
            c28001xdd2bb359.m121624x1f38bf20(true);
            return;
        }
        if (i17 == 5) {
            c28001xdd2bb359.m121630x744cf207(true);
            return;
        }
        if (i17 == 6) {
            c28001xdd2bb359.m121622x6347c2af(true);
            return;
        }
        if (i17 == 7) {
            c28001xdd2bb359.m121627xf65f6f83(true);
        } else if (i17 == 8) {
            c28001xdd2bb359.m121626xc6654ede(true);
        } else {
            c28001xdd2bb359.m121624x1f38bf20(false);
        }
    }

    public static void b(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, int i17, int i18) {
        if (i17 == -1) {
            return;
        }
        abstractActivityC21394xb3d2c0cf.mo53058xe5d1a549(db5.e1.w(abstractActivityC21394xb3d2c0cf, abstractActivityC21394xb3d2c0cf.getResources().getString(i18), abstractActivityC21394xb3d2c0cf.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.kmf), ((android.view.LayoutInflater) abstractActivityC21394xb3d2c0cf.getSystemService("layout_inflater")).inflate(i17, (android.view.ViewGroup) null), new qp5.w()));
    }
}
