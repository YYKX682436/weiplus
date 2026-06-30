package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class g6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.a7 f106828d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f106829e;

    public g6(com.tencent.mm.plugin.finder.feed.a7 a7Var, android.widget.TextView textView) {
        this.f106828d = a7Var;
        this.f106829e = textView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.view.rm rmVar = new com.tencent.mm.plugin.finder.view.rm(this.f106828d.f106207d, null, 2, null);
        android.content.Context context = rmVar.f132965d;
        rmVar.setContentView(com.tencent.mm.ui.id.b(context).inflate(com.tencent.mm.R.layout.e6a, (android.view.ViewGroup) null, false));
        rmVar.f132967f = true;
        rmVar.f132974m = 5000L;
        rmVar.f132972k = -context.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479738dv);
        rmVar.f132975n = context.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479688cn);
        rmVar.d(this.f106829e);
    }
}
