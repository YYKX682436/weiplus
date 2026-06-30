package sj3;

/* loaded from: classes11.dex */
public final class x0 implements android.view.View.OnCreateContextMenuListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f490327d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f490328e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ sj3.a1 f490329f;

    public x0(p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, android.view.View view, sj3.a1 a1Var) {
        this.f490327d = h0Var;
        this.f490328e = view;
        this.f490329f = a1Var;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        java.lang.Iterable<cv.v0> iterable = (java.lang.Iterable) this.f490327d.f391656d;
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(iterable, 10));
        for (cv.v0 v0Var : iterable) {
            android.view.MenuItem add = contextMenu.add(0, v0Var.f304049a, 0, v0Var.f304050b);
            android.content.Context context = this.f490328e.getContext();
            this.f490329f.getClass();
            int i17 = v0Var.f304049a;
            add.setIcon(com.p314xaae8f345.mm.ui.uk.e(context, i17 != 1 ? i17 != 2 ? i17 != 3 ? i17 != 4 ? com.p314xaae8f345.mm.R.raw.f79820xd0b1fa11 : com.p314xaae8f345.mm.R.raw.f79650x9f0fe96 : com.p314xaae8f345.mm.R.raw.f80093xfc40c530 : com.p314xaae8f345.mm.R.raw.f79714x614cd13e : com.p314xaae8f345.mm.R.raw.f79536xe023c2a8, -1));
            arrayList.add(jz5.f0.f384359a);
        }
    }
}
