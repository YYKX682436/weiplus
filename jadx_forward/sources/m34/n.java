package m34;

/* loaded from: classes4.dex */
public class n extends com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k2 implements c01.i {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4 f404892d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f404893e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f404894f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f404895g;

    /* renamed from: h, reason: collision with root package name */
    public int f404896h;

    /* renamed from: i, reason: collision with root package name */
    public int f404897i;

    /* renamed from: m, reason: collision with root package name */
    public int f404898m;

    /* renamed from: n, reason: collision with root package name */
    public final c01.k f404899n;

    public n(android.content.Context context) {
        super(context, com.p314xaae8f345.mm.R.C30868x68b1db1.x_);
        this.f404892d = null;
        this.f404893e = null;
        this.f404896h = 0;
        this.f404897i = 0;
        this.f404898m = 0;
        this.f404899n = new c01.k();
    }

    @Override // c01.i
    public void P0() {
    }

    @Override // c01.i
    public void U5() {
    }

    @Override // c01.i
    public void V3() {
    }

    public final void c() {
        if (this.f404892d.mo69311xc00617a4()) {
            this.f404892d.mo69313x65825f6();
            this.f404899n.a();
        }
        new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3().mo50293x3498a0(new m34.m(this));
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k2, android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        if (com.p314xaae8f345.mm.p642xad8b531f.b.d() != null) {
            com.p314xaae8f345.mm.p642xad8b531f.b.d().b();
        }
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4 f4Var = this.f404892d;
        if (f4Var != null) {
            f4Var.mo69326x360a109e(null);
            this.f404892d.mo69303x360802();
            this.f404892d.mo69312x3f5eee52();
            findViewById(com.p314xaae8f345.mm.R.id.oy7).setOnClickListener(null);
        }
        if (isShowing()) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6182x843a430c c6182x843a430c = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6182x843a430c();
            am.mz mzVar = c6182x843a430c.f136440g;
            mzVar.f88911a = 0;
            mzVar.f88912b = this.f404897i;
            mzVar.f88913c = this.f404898m;
            mzVar.f88914d = this.f404896h;
            c6182x843a430c.e();
        }
        super.dismiss();
        this.f404899n.b(true);
    }

    @Override // c01.i
    public void g3() {
    }

    @Override // android.app.Dialog
    public void onCreate(android.os.Bundle bundle) {
        java.lang.System.currentTimeMillis();
        super.onCreate(bundle);
        getWindow().setFlags(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26306x4f373ca9.f52070xe96767bb, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26306x4f373ca9.f52070xe96767bb);
        setContentView(com.p314xaae8f345.mm.R.C30864xbddafb2a.cn8);
        if (com.p314xaae8f345.mm.p642xad8b531f.b.d() != null) {
            com.p314xaae8f345.mm.p642xad8b531f.b.d().a();
        }
        fp.k.b();
        this.f404893e = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f568867ob5);
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.mva);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/sight/decode/ui/SightPopupHelper", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/sight/decode/ui/SightPopupHelper", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) findViewById(com.p314xaae8f345.mm.R.id.oy7);
        viewGroup.setBackgroundResource(com.p314xaae8f345.mm.R.C30859x5a72f63.f560245f3);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoPopupHelper", "getVideoView, is normal video");
        if (fp.h.c(14)) {
            this.f404892d = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19749xff44b05(getContext(), null);
        } else {
            this.f404892d = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19748x5c264997(getContext(), null);
        }
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        viewGroup.addView((android.view.View) this.f404892d, layoutParams);
        this.f404892d.mo69326x360a109e(new m34.j(this));
        findViewById(com.p314xaae8f345.mm.R.id.oy7).setOnClickListener(new m34.k(this));
        ((android.view.View) this.f404892d).setOnClickListener(new m34.l(this));
        if (this.f404894f != null) {
            this.f404892d.mo69303x360802();
            this.f404892d.mo69327xab3268fe(this.f404894f);
        }
        java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6182x843a430c c6182x843a430c = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6182x843a430c();
        c6182x843a430c.f136440g.f88911a = 1;
        c6182x843a430c.e();
    }
}
