package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz;

/* loaded from: classes8.dex */
public class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz.a f280331d;

    public m(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz.a aVar) {
        this.f280331d = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz.a aVar = this.f280331d;
        qk.o oVar = aVar.f280279h;
        if (oVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUI.BizComponent", "bizInfo is null");
            return;
        }
        if (!oVar.Q0()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUI.BizComponent", "bizInfo is not serviceType: %d", java.lang.Integer.valueOf(aVar.f280279h.f66746x2262335f));
            return;
        }
        if (aVar.f280113d.u() == null || aVar.f280113d.u().d1() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUI.BizComponent", "talker or username is null");
            return;
        }
        java.lang.String d17 = aVar.f280113d.u().d1();
        if (!d17.equals(aVar.f280279h.f66748xdec927b)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUI.BizComponent", "biz username is not equal chatting talker: %s", d17);
            return;
        }
        if (c01.e2.d(d17)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUI.BizComponent", "in whitelist, talker: %s", d17);
            return;
        }
        com.p314xaae8f345.mm.ui.ActivityC21387x976b8e54 m78443x9cf0d20b = com.p314xaae8f345.mm.ui.ActivityC21387x976b8e54.m78443x9cf0d20b();
        if (m78443x9cf0d20b == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUI.BizComponent", "launcherUI is null");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUI.BizComponent", "showBottomSheet");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("biz_mute_guide_config_" + c01.z1.r()).putLong("biz_mute_guide_show_time", c01.id.a());
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz.m0 m0Var = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz.m0(m78443x9cf0d20b);
        android.view.LayoutInflater.from(m0Var.f280334f.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569760nl, (android.view.ViewGroup) m0Var.f280334f.findViewById(com.p314xaae8f345.mm.R.id.av6), true);
        android.widget.ImageView imageView = (android.widget.ImageView) m0Var.f280334f.findViewById(com.p314xaae8f345.mm.R.id.aj_);
        android.widget.ImageView imageView2 = (android.widget.ImageView) m0Var.f280334f.findViewById(com.p314xaae8f345.mm.R.id.f564924aj5);
        android.widget.ImageView imageView3 = (android.widget.ImageView) m0Var.f280334f.findViewById(com.p314xaae8f345.mm.R.id.aj9);
        android.widget.TextView textView = (android.widget.TextView) m0Var.f280334f.findViewById(com.p314xaae8f345.mm.R.id.o_u);
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) m0Var.f280334f.findViewById(com.p314xaae8f345.mm.R.id.aj6);
        frameLayout.setClipToOutline(true);
        frameLayout.setOutlineProvider(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz.p(aVar));
        imageView.setClickable(false);
        imageView.setLongClickable(false);
        imageView2.setClickable(false);
        imageView2.setLongClickable(false);
        ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(imageView, d17, null);
        ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(imageView2, d17, null);
        oa5.b.b(imageView3).j(1000L).g(450L).e(0.625f).f(0.625f).k(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz.q(aVar, textView)).l();
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5596xf29ef930 c5596xf29ef930 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5596xf29ef930();
        am.pf pfVar = c5596xf29ef930.f135921g;
        pfVar.f89151c = 1;
        pfVar.f89149a = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz.s(aVar, d17, m0Var);
        c5596xf29ef930.e();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(d17);
        m0Var.f280334f.findViewById(com.p314xaae8f345.mm.R.id.aj8).setOnClickListener(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz.x(aVar, m78443x9cf0d20b, arrayList, m0Var));
        m0Var.f280335g = m0Var.a();
        m0Var.f280336h = m78443x9cf0d20b instanceof android.app.Activity ? m78443x9cf0d20b.getWindow().getWindowManager().getDefaultDisplay().getRotation() : 0;
        if (m0Var.f280332d != null) {
            ((android.view.ViewGroup) m0Var.f280334f.getParent()).setVisibility(0);
            android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) m0Var.f280334f.getLayoutParams();
            boolean z17 = m0Var.f280335g;
            android.view.View view = m0Var.f280337i;
            if (z17 && view != null) {
                android.graphics.Rect rect = new android.graphics.Rect();
                view.getWindowVisibleDisplayFrame(rect);
                layoutParams.width = rect.right;
            }
            m0Var.f280334f.setLayoutParams(layoutParams);
            m0Var.f280332d.getWindow().addFlags(Integer.MIN_VALUE);
            m0Var.f280332d.getWindow().clearFlags(8);
            m0Var.f280332d.getWindow().clearFlags(131072);
            m0Var.f280332d.getWindow().clearFlags(128);
            m0Var.f280332d.getWindow().getDecorView().setSystemUiVisibility(0);
            if (view != null) {
                boolean z18 = m0Var.f280338m == null;
                android.view.ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                m0Var.f280338m = viewTreeObserver;
                if (z18) {
                    viewTreeObserver.addOnGlobalLayoutListener(m0Var);
                }
            }
            if (!m78443x9cf0d20b.isFinishing()) {
                m0Var.f280332d.show();
            }
            com.p176xb6135e39.p177xcca8366f.p244x11d36527.p249xdcc86614.C2690x46972046 c2690x46972046 = m0Var.f280339n;
            if (c2690x46972046 != null) {
                c2690x46972046.f125976p = false;
            }
        }
    }
}
