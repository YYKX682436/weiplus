package a85;

/* loaded from: classes15.dex */
public final class b extends p012xc85e97e9.p016x746ad0e3.app.i0 {

    /* renamed from: f, reason: collision with root package name */
    public final android.content.Context f83920f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2608xc9fa65a8.p2609x2eefaa.C21007x2f4a06dc f83921g;

    /* renamed from: h, reason: collision with root package name */
    public final yz5.a f83922h;

    /* renamed from: i, reason: collision with root package name */
    public final oj5.a0 f83923i;

    /* renamed from: m, reason: collision with root package name */
    public final a85.g f83924m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f83925n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(android.content.Context mContext, com.p314xaae8f345.mm.p2608xc9fa65a8.p2609x2eefaa.C21007x2f4a06dc model, yz5.a dismiss) {
        super(mContext, com.p314xaae8f345.mm.R.C30868x68b1db1.f575676fd);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mContext, "mContext");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(model, "model");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dismiss, "dismiss");
        this.f83920f = mContext;
        this.f83921g = model;
        this.f83922h = dismiss;
        a85.g gVar = new a85.g(new com.p314xaae8f345.mm.ui.xb(mContext, com.p314xaae8f345.mm.R.C30868x68b1db1.f575688fn), this);
        this.f83924m = gVar;
        C(1);
        android.content.Context context = getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        this.f83923i = new oj5.a0(context);
        boolean a17 = model.a();
        a85.a aVar = gVar.f83935f;
        if (a17) {
            com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 N = ((y12.h) ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi()).N(model.f274683e);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(N);
            aVar.I(N);
        } else {
            aVar.getClass();
            aVar.J(new com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4());
        }
        aVar.f83917o = false;
        aVar.x(aVar.mo1894x7e414b06(), new ir.z0(105));
        aVar.m8146xced61ae5();
        lr.k0 k0Var = aVar.f402153g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(k0Var, "null cannot be cast to non-null type com.tencent.mm.search.logic.SimilarEmojiPanelClickListener");
        ((y75.c) k0Var).f541322i = model;
        lr.k0 k0Var2 = aVar.f402153g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(k0Var2, "null cannot be cast to non-null type com.tencent.mm.emoji.panel.adapter.EmojiPanelClickListener");
        ((lr.p) k0Var2).f402101d = model.f274691p;
        ((x75.b) gVar.f83934e).a(model, new a85.d(gVar, model));
        gVar.f83936g.m43696xd6abe7db(new a85.e(gVar, model));
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SimilarEmoji", "dialog dismiss");
        super.dismiss();
        this.f83922h.mo152xb9724478();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchTouchEvent(android.view.MotionEvent ev6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ev6, "ev");
        boolean z17 = false;
        if (ev6.getActionMasked() == 0) {
            this.f83925n = false;
        }
        oj5.a0 a0Var = this.f83923i;
        a0Var.b(ev6);
        int i17 = a0Var.f427364h;
        if (i17 != 1 && i17 != 2) {
            z17 = a0Var.a(ev6);
        }
        if (!z17) {
            return super.dispatchTouchEvent(ev6);
        }
        if (!this.f83925n) {
            android.view.MotionEvent obtain = android.view.MotionEvent.obtain(ev6);
            obtain.setAction(3);
            super.dispatchTouchEvent(obtain);
            obtain.recycle();
            this.f83925n = true;
        }
        return true;
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.i0, android.app.Dialog
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setContentView(this.f83924m);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("dialog onCreate ");
        com.p314xaae8f345.mm.p2608xc9fa65a8.p2609x2eefaa.C21007x2f4a06dc c21007x2f4a06dc = this.f83921g;
        sb6.append(c21007x2f4a06dc);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SimilarEmoji", sb6.toString());
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.v9 v9Var = c21007x2f4a06dc.f274691p;
        if (v9Var != null) {
            y75.a.f541319a = null;
            int i17 = com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291.f271298e;
            y75.d dVar = new y75.d(1);
            y75.a.f541319a = dVar;
            dVar.f402101d = v9Var;
        }
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.i0, android.app.Dialog
    public void onStop() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SimilarEmoji", "dialog onStop");
        super.onStop();
        x75.b bVar = (x75.b) this.f83924m.f83934e;
        bVar.f533991d = null;
        gm0.j1.n().f354821b.q(3793, bVar);
        gm0.j1.n().f354821b.c(3793);
        y75.d dVar = y75.a.f541319a;
        if (dVar != null) {
            dVar.f402101d = null;
        }
        y75.a.f541319a = null;
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.i0, android.app.Dialog
    public void setContentView(android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        android.view.Window window = getWindow();
        android.content.Context context = this.f83920f;
        if (context.getResources().getConfiguration().orientation == 2) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(window);
            window.setGravity(5);
            window.setWindowAnimations(com.p314xaae8f345.mm.R.C30868x68b1db1.f576037ot);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(window);
            window.setGravity(80);
            window.setWindowAnimations(com.p314xaae8f345.mm.R.C30868x68b1db1.f575608dq);
        }
        window.getDecorView().setPadding(0, 0, 0, 0);
        android.view.WindowManager.LayoutParams attributes = window.getAttributes();
        if (context.getResources().getConfiguration().orientation == 2) {
            attributes.width = -2;
            attributes.height = -1;
        } else {
            attributes.width = -1;
            attributes.height = -2;
        }
        window.setAttributes(attributes);
        setContentView(view, new android.view.ViewGroup.LayoutParams(-1, qk.w9.a(getContext()) + (getContext().getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561260dj) * 1)));
        android.view.Window window2 = getWindow();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(window2);
        window2.setLayout(-1, -2);
    }
}
