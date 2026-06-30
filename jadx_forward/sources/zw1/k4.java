package zw1;

/* loaded from: classes15.dex */
public class k4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ww1.a3 f558222d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f558223e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ww1.b3 f558224f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13149x63b02cb3 f558225g;

    public k4(com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13149x63b02cb3 activityC13149x63b02cb3, ww1.a3 a3Var, int i17, ww1.b3 b3Var) {
        this.f558225g = activityC13149x63b02cb3;
        this.f558222d = a3Var;
        this.f558223e = i17;
        this.f558224f = b3Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13149x63b02cb3 activityC13149x63b02cb3 = this.f558225g;
        ww1.a3 collectMchDataModel = this.f558222d;
        double d17 = collectMchDataModel.f531634k;
        java.lang.String str = collectMchDataModel.f531636m;
        boolean z17 = collectMchDataModel.f531638o;
        java.lang.String str2 = collectMchDataModel.f531637n;
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13149x63b02cb3.Q;
        boolean w76 = activityC13149x63b02cb3.w7(d17, str, z17, str2);
        java.util.LinkedList linkedList = collectMchDataModel.V;
        java.lang.Long valueOf = java.lang.Long.valueOf(collectMchDataModel.U);
        com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13149x63b02cb3 activityC13149x63b02cb32 = this.f558225g;
        r45.bj4 t76 = activityC13149x63b02cb32.t7(linkedList, valueOf);
        java.lang.String shop_name = "";
        java.lang.String str3 = t76 != null ? t76.f452339f : "";
        boolean z18 = collectMchDataModel.T;
        int i18 = this.f558223e;
        if (!z18 || i18 != 2) {
            str3 = collectMchDataModel.R;
        }
        if (w76) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(collectMchDataModel.f531632i)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WalletCollectQrCodeUI", "func[refreshQRCodeArea] : mFixedPayUrl null");
                return;
            }
            collectMchDataModel.f531644u = activityC13149x63b02cb32.d7(i18, collectMchDataModel.f531632i, str3, collectMchDataModel.f531639p);
        } else {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(collectMchDataModel.f531621a)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WalletCollectQrCodeUI", "func[refreshQRCodeArea] : qrcode_url null");
                return;
            }
            collectMchDataModel.f531644u = activityC13149x63b02cb32.d7(i18, collectMchDataModel.f531621a, str3, collectMchDataModel.f531627d);
        }
        android.graphics.Bitmap bitmap = collectMchDataModel.f531644u;
        ww1.b3 collectMchViewModel = this.f558224f;
        if (bitmap != null && !bitmap.isRecycled()) {
            collectMchViewModel.f531682u.setImageBitmap(null);
            collectMchViewModel.f531682u.setImageBitmap(collectMchDataModel.f531644u);
        }
        collectMchViewModel.f531682u.setOnLongClickListener(new zw1.j4(this));
        android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) collectMchViewModel.f531679r.getLayoutParams();
        int i19 = 0;
        if (collectMchDataModel.f531634k > 0.0d) {
            collectMchViewModel.f531677p.setVisibility(0);
            collectMchViewModel.f531678q.m83144x1de10994(activityC13149x63b02cb32.n7(i18));
            collectMchViewModel.f531678q.setText(com.p314xaae8f345.mm.p2802xd031a825.ui.r1.o(collectMchDataModel.f531634k));
            layoutParams.topMargin = i65.a.b(activityC13149x63b02cb32.mo55332x76847179(), 8);
        } else {
            collectMchViewModel.f531677p.setVisibility(8);
            layoutParams.topMargin = i65.a.b(activityC13149x63b02cb32.mo55332x76847179(), 16);
        }
        collectMchViewModel.f531679r.setLayoutParams(layoutParams);
        activityC13149x63b02cb32.E7(i18, collectMchViewModel.f531679r);
        activityC13149x63b02cb32.F7(i18, collectMchViewModel.f531680s);
        if (i18 != 2 || !collectMchDataModel.T) {
            collectMchViewModel.f531674m.setVisibility(8);
            collectMchViewModel.f531673l.setVisibility(0);
            collectMchViewModel.f531673l.setText(activityC13149x63b02cb32.u7(i18));
            return;
        }
        collectMchViewModel.f531673l.setVisibility(8);
        collectMchViewModel.f531674m.setVisibility(0);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = activityC13149x63b02cb32.mo55332x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        zw1.t2 t2Var = (zw1.t2) pf5.z.f435481a.a(activity).a(zw1.t2.class);
        t2Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(collectMchDataModel, "collectMchDataModel");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(collectMchViewModel, "collectMchViewModel");
        ot5.g.c("MicroMsg.WalletCollectQrCodeMultiShopUIC", "refreshMultiShopChangeBtn");
        java.util.LinkedList linkedList2 = collectMchDataModel.V;
        if (linkedList2 == null || linkedList2.isEmpty()) {
            ot5.g.a("MicroMsg.WalletCollectQrCodeMultiShopUIC", "collectMchDataModel.shop_list is empty!");
            return;
        }
        android.widget.TextView textView = collectMchViewModel.f531676o;
        java.util.LinkedList shop_list = collectMchDataModel.V;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(shop_list, "shop_list");
        long j17 = collectMchDataModel.U;
        int size = shop_list.size();
        while (true) {
            if (i19 >= size) {
                break;
            }
            if (j17 == ((r45.bj4) shop_list.get(i19)).f452337d) {
                shop_name = ((r45.bj4) shop_list.get(i19)).f452338e;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(shop_name, "shop_name");
                break;
            }
            i19++;
        }
        textView.setText(shop_name);
        collectMchViewModel.f531675n.setOnClickListener(new zw1.s2(t2Var, collectMchDataModel, collectMchViewModel));
    }
}
