package a85;

/* loaded from: classes15.dex */
public final class b extends androidx.appcompat.app.i0 {

    /* renamed from: f, reason: collision with root package name */
    public final android.content.Context f2387f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.search.data.SimilarEmojiQueryModel f2388g;

    /* renamed from: h, reason: collision with root package name */
    public final yz5.a f2389h;

    /* renamed from: i, reason: collision with root package name */
    public final oj5.a0 f2390i;

    /* renamed from: m, reason: collision with root package name */
    public final a85.g f2391m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f2392n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(android.content.Context mContext, com.tencent.mm.search.data.SimilarEmojiQueryModel model, yz5.a dismiss) {
        super(mContext, com.tencent.mm.R.style.f494143fd);
        kotlin.jvm.internal.o.g(mContext, "mContext");
        kotlin.jvm.internal.o.g(model, "model");
        kotlin.jvm.internal.o.g(dismiss, "dismiss");
        this.f2387f = mContext;
        this.f2388g = model;
        this.f2389h = dismiss;
        a85.g gVar = new a85.g(new com.tencent.mm.ui.xb(mContext, com.tencent.mm.R.style.f494155fn), this);
        this.f2391m = gVar;
        C(1);
        android.content.Context context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        this.f2390i = new oj5.a0(context);
        boolean a17 = model.a();
        a85.a aVar = gVar.f2402f;
        if (a17) {
            com.tencent.mm.storage.emotion.EmojiInfo N = ((y12.h) ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi()).N(model.f193150e);
            kotlin.jvm.internal.o.d(N);
            aVar.I(N);
        } else {
            aVar.getClass();
            aVar.J(new com.tencent.mm.storage.emotion.EmojiInfo());
        }
        aVar.f2384o = false;
        aVar.x(aVar.getItemCount(), new ir.z0(105));
        aVar.notifyDataSetChanged();
        lr.k0 k0Var = aVar.f320620g;
        kotlin.jvm.internal.o.e(k0Var, "null cannot be cast to non-null type com.tencent.mm.search.logic.SimilarEmojiPanelClickListener");
        ((y75.c) k0Var).f459789i = model;
        lr.k0 k0Var2 = aVar.f320620g;
        kotlin.jvm.internal.o.e(k0Var2, "null cannot be cast to non-null type com.tencent.mm.emoji.panel.adapter.EmojiPanelClickListener");
        ((lr.p) k0Var2).f320568d = model.f193158p;
        ((x75.b) gVar.f2401e).a(model, new a85.d(gVar, model));
        gVar.f2403g.setLoadMoreCall(new a85.e(gVar, model));
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        com.tencent.mars.xlog.Log.i("MicroMsg.SimilarEmoji", "dialog dismiss");
        super.dismiss();
        this.f2389h.invoke();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchTouchEvent(android.view.MotionEvent ev6) {
        kotlin.jvm.internal.o.g(ev6, "ev");
        boolean z17 = false;
        if (ev6.getActionMasked() == 0) {
            this.f2392n = false;
        }
        oj5.a0 a0Var = this.f2390i;
        a0Var.b(ev6);
        int i17 = a0Var.f345831h;
        if (i17 != 1 && i17 != 2) {
            z17 = a0Var.a(ev6);
        }
        if (!z17) {
            return super.dispatchTouchEvent(ev6);
        }
        if (!this.f2392n) {
            android.view.MotionEvent obtain = android.view.MotionEvent.obtain(ev6);
            obtain.setAction(3);
            super.dispatchTouchEvent(obtain);
            obtain.recycle();
            this.f2392n = true;
        }
        return true;
    }

    @Override // androidx.appcompat.app.i0, android.app.Dialog
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setContentView(this.f2391m);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("dialog onCreate ");
        com.tencent.mm.search.data.SimilarEmojiQueryModel similarEmojiQueryModel = this.f2388g;
        sb6.append(similarEmojiQueryModel);
        com.tencent.mars.xlog.Log.i("MicroMsg.SimilarEmoji", sb6.toString());
        com.tencent.mm.pluginsdk.ui.chat.v9 v9Var = similarEmojiQueryModel.f193158p;
        if (v9Var != null) {
            y75.a.f459786a = null;
            int i17 = com.tencent.mm.pluginsdk.ui.ChatFooterPanel.f189765e;
            y75.d dVar = new y75.d(1);
            y75.a.f459786a = dVar;
            dVar.f320568d = v9Var;
        }
    }

    @Override // androidx.appcompat.app.i0, android.app.Dialog
    public void onStop() {
        com.tencent.mars.xlog.Log.i("MicroMsg.SimilarEmoji", "dialog onStop");
        super.onStop();
        x75.b bVar = (x75.b) this.f2391m.f2401e;
        bVar.f452458d = null;
        gm0.j1.n().f273288b.q(3793, bVar);
        gm0.j1.n().f273288b.c(3793);
        y75.d dVar = y75.a.f459786a;
        if (dVar != null) {
            dVar.f320568d = null;
        }
        y75.a.f459786a = null;
    }

    @Override // androidx.appcompat.app.i0, android.app.Dialog
    public void setContentView(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "view");
        android.view.Window window = getWindow();
        android.content.Context context = this.f2387f;
        if (context.getResources().getConfiguration().orientation == 2) {
            kotlin.jvm.internal.o.d(window);
            window.setGravity(5);
            window.setWindowAnimations(com.tencent.mm.R.style.f494504ot);
        } else {
            kotlin.jvm.internal.o.d(window);
            window.setGravity(80);
            window.setWindowAnimations(com.tencent.mm.R.style.f494075dq);
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
        setContentView(view, new android.view.ViewGroup.LayoutParams(-1, qk.w9.a(getContext()) + (getContext().getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479727dj) * 1)));
        android.view.Window window2 = getWindow();
        kotlin.jvm.internal.o.d(window2);
        window2.setLayout(-1, -2);
    }
}
