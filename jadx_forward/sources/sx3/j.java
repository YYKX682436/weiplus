package sx3;

/* loaded from: classes10.dex */
public final class j implements in5.y {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sx3.m f495093d;

    public j(sx3.m mVar) {
        this.f495093d = mVar;
    }

    @Override // in5.y
    public boolean c(p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 adapter, android.view.View view, int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        java.util.List m82898xfb7e5820;
        in5.s0 holder = (in5.s0) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adapter, "adapter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf) adapter;
        int a07 = i17 - ((in5.n0) adapter).a0();
        if (a07 >= 0) {
            sx3.m mVar = this.f495093d;
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf2 = mVar.f495101g;
            if (a07 < ((c22848x6ddd90cf2 == null || (m82898xfb7e5820 = c22848x6ddd90cf2.m82898xfb7e5820()) == null) ? 0 : m82898xfb7e5820.size())) {
                java.util.List m82898xfb7e58202 = c22848x6ddd90cf.m82898xfb7e5820();
                android.app.Activity context = mVar.m80379x76847179();
                sx3.i iVar = new sx3.i(mVar, i17);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
                rl5.r rVar = new rl5.r(context, view);
                rVar.f478884u = new by3.b(context);
                rVar.f478887x = new by3.c(iVar);
                int[] iArr = new int[2];
                view.getLocationOnScreen(iArr);
                int width = iArr[0] + (view.getWidth() / 2);
                int i18 = iArr[1];
                int height = view.getHeight() + i18;
                int i19 = i18 >= 0 ? i18 : 0;
                if (height > com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDisplayMetrics().heightPixels) {
                    height = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDisplayMetrics().heightPixels;
                }
                android.graphics.Point point = new android.graphics.Point(width, (i19 + height) / 2);
                rVar.n(point.x, point.y);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(pf5.o.TAG, "onLongClick " + a07 + " id:" + ((ox3.g) m82898xfb7e58202.get(a07)).f431282d.mo12245xcc313de3());
            }
        }
        return true;
    }
}
