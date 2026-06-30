package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class zg extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.bh f105115d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.FinderEnhanceActionEvent f105116e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zg(com.tencent.mm.plugin.finder.convert.bh bhVar, com.tencent.mm.autogen.events.FinderEnhanceActionEvent finderEnhanceActionEvent) {
        super(0);
        this.f105115d = bhVar;
        this.f105116e = finderEnhanceActionEvent;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.widget.TextView textView;
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f105115d.f104357J;
        androidx.recyclerview.widget.f2 adapter = recyclerView != null ? recyclerView.getAdapter() : null;
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = adapter instanceof com.tencent.mm.view.recyclerview.WxRecyclerAdapter ? (com.tencent.mm.view.recyclerview.WxRecyclerAdapter) adapter : null;
        com.tencent.mm.autogen.events.FinderEnhanceActionEvent finderEnhanceActionEvent = this.f105116e;
        in5.s0 s0Var = wxRecyclerAdapter != null ? (in5.s0) in5.n0.Y(wxRecyclerAdapter, finderEnhanceActionEvent.f54271g.f6228a, false, 2, null) : null;
        if (s0Var != null) {
            java.lang.Object obj = s0Var.f293125i;
            kotlin.jvm.internal.o.f(obj, "getAssociatedObject(...)");
            int i17 = com.tencent.mm.plugin.finder.convert.bh.f102973y1;
            com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
            if (((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.U6).getValue()).r()).intValue() == 1 && (textView = (android.widget.TextView) s0Var.p(com.tencent.mm.R.id.o2w)) != null) {
                int i18 = finderEnhanceActionEvent.f54271g.f6229b;
                if (i18 == -100) {
                    textView.setText("disable");
                    textView.setBackgroundResource(com.tencent.mm.R.drawable.b5s);
                } else if (i18 == 4) {
                    textView.setText("preload...");
                } else if (i18 == 6) {
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder(com.tencent.matrix.battery.accumulate.persist.FlattProperty.PROC_ALL);
                    am.bb bbVar = finderEnhanceActionEvent.f54271g;
                    sb6.append(bbVar.f6230c);
                    sb6.append("ms\ncgi");
                    sb6.append(bbVar.f6231d);
                    sb6.append("ms\npld");
                    sb6.append(bbVar.f6232e);
                    sb6.append("ms\ncnt");
                    sb6.append(bbVar.f6233f);
                    textView.setText(sb6.toString());
                } else if (i18 == -3 || i18 == -2 || i18 == -1) {
                    textView.setText(java.lang.String.valueOf(i18));
                    textView.setBackgroundResource(com.tencent.mm.R.drawable.b5t);
                } else if (i18 == 1) {
                    textView.setBackgroundResource(com.tencent.mm.R.drawable.b5r);
                    textView.animate().cancel();
                    textView.setAlpha(0.0f);
                    textView.setVisibility(0);
                    textView.animate().setDuration(500L).setListener(null).alpha(1.0f).start();
                    textView.setText("...");
                } else if (i18 == 2) {
                    textView.setText("cgi...");
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
