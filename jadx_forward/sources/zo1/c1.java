package zo1;

/* loaded from: classes5.dex */
public final class c1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12868xd8a7d79e f556101d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12868xd8a7d79e activityC12868xd8a7d79e) {
        super(1);
        this.f556101d = activityC12868xd8a7d79e;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.util.List devices = (java.util.List) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(devices, "devices");
        boolean isEmpty = devices.isEmpty();
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12868xd8a7d79e activityC12868xd8a7d79e = this.f556101d;
        if (isEmpty) {
            ((com.p314xaae8f345.mm.ui.bd) activityC12868xd8a7d79e.m78751x5dc77fb5(new android.content.Intent(activityC12868xd8a7d79e.mo55332x76847179(), (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.p1266xb06b1e56.ActivityC12861xaa9090a7.class))).f279410a = new zo1.b1(activityC12868xd8a7d79e);
        } else {
            java.util.Iterator it = devices.iterator();
            while (it.hasNext()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CreatePackageUI", ((po1.d) it.next()).m158784x9616526c());
            }
            java.lang.ref.WeakReference weakReference = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12868xd8a7d79e.f174347u;
            activityC12868xd8a7d79e.getClass();
            android.graphics.Point b17 = com.p314xaae8f345.mm.ui.bl.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
            double d17 = b17.y;
            int i17 = (int) (0.45d * d17);
            int i18 = (int) (d17 * 0.75d);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1(activityC12868xd8a7d79e.mo55332x76847179());
            y1Var.B.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.cw_);
            activityC12868xd8a7d79e.f174361t = y1Var;
            android.view.View inflate = android.view.LayoutInflater.from(activityC12868xd8a7d79e.mo55332x76847179()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.dwf, (android.view.ViewGroup) null, false);
            com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.p1265xac8f1cfd.C12858x7cd09d75 c12858x7cd09d75 = (com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.p1265xac8f1cfd.C12858x7cd09d75) inflate.findViewById(com.p314xaae8f345.mm.R.id.rie);
            c12858x7cd09d75.m53996x53bfe316(com.p314xaae8f345.mm.R.C30867xcad56011.f574384mx0);
            c12858x7cd09d75.m53992x110075dc(new zo1.y1(y1Var));
            android.widget.ListView listView = (android.widget.ListView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f568344s53);
            zo1.y0 y0Var = new zo1.y0(activityC12868xd8a7d79e, activityC12868xd8a7d79e.f174360s);
            listView.setAdapter((android.widget.ListAdapter) y0Var);
            y0Var.f556360e = devices;
            y0Var.notifyDataSetChanged();
            y0Var.notifyDataSetChanged();
            y0Var.f556362g = new zo1.z1(activityC12868xd8a7d79e, y1Var);
            y0Var.f556361f = new zo1.b2(activityC12868xd8a7d79e, y1Var);
            inflate.measure(android.view.View.MeasureSpec.makeMeasureSpec(b17.x, 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(i18, Integer.MIN_VALUE));
            int measuredHeight = inflate.getMeasuredHeight();
            if (i17 >= measuredHeight) {
                measuredHeight = i17;
            }
            y1Var.f293560f.getLayoutParams().height = measuredHeight;
            com.p176xb6135e39.p177xcca8366f.p244x11d36527.p249xdcc86614.C2690x46972046 c2690x46972046 = y1Var.f293569r;
            if (c2690x46972046 != null) {
                c2690x46972046.C(measuredHeight);
                c2690x46972046.D(4);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CreatePackageUI", "measuredHeight=" + inflate.getMeasuredHeight() + ", minHeight=" + i17 + ", maxHeight=" + i18 + ", realHeight=" + measuredHeight);
            y1Var.k(inflate);
            y1Var.s();
        }
        return jz5.f0.f384359a;
    }
}
