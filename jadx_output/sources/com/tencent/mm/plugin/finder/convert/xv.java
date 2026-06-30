package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class xv implements zy2.u6 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f104971a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.ew f104972b;

    public xv(in5.s0 s0Var, com.tencent.mm.plugin.finder.convert.ew ewVar) {
        this.f104971a = s0Var;
        this.f104972b = ewVar;
    }

    @Override // zy2.u6
    public void a(int i17, android.view.View view) {
        kotlin.jvm.internal.o.g(view, "view");
        in5.s0 s0Var = this.f104971a;
        com.tencent.mm.plugin.finder.feed.ys ysVar = (com.tencent.mm.plugin.finder.feed.ys) s0Var.f293125i;
        if (ysVar != null) {
            com.tencent.mars.xlog.Log.i("Finder.FinderStreamCardAlbumConvert", "[onClick] position=" + i17 + ' ' + ysVar.f111192d.getLong(14));
            android.content.Context context = view.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            com.tencent.mm.plugin.finder.convert.ew.o(this.f104972b, context, 1, s0Var);
        }
    }
}
