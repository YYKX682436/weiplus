package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes10.dex */
public final class t4 implements vh0.i1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.a7 f109033a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f109034b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.util.List f109035c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.CharSequence f109036d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f109037e;

    public t4(com.tencent.mm.plugin.finder.feed.a7 a7Var, int i17, java.util.List list, java.lang.CharSequence charSequence, java.lang.String str) {
        this.f109033a = a7Var;
        this.f109034b = i17;
        this.f109035c = list;
        this.f109036d = charSequence;
        this.f109037e = str;
    }

    @Override // vh0.i1
    public void onResult(java.lang.Object obj) {
        java.lang.Boolean bool = (java.lang.Boolean) obj;
        com.tencent.mars.xlog.Log.i("Finder.DrawerPresenter", "onReply privacy result " + bool);
        com.tencent.mm.plugin.finder.feed.a7 a7Var = this.f109033a;
        yw2.a0 a0Var = a7Var.f106216o;
        com.tencent.mm.plugin.finder.view.FinderCommentFooter n17 = a0Var != null ? a0Var.n() : null;
        if (n17 != null) {
            n17.setFrozen(false);
        }
        kotlin.jvm.internal.o.d(bool);
        if (bool.booleanValue()) {
            java.lang.String str = this.f109037e;
            com.tencent.mm.plugin.finder.feed.a7.v(a7Var, this.f109034b, this.f109035c, this.f109036d, true ^ (str == null || str.length() == 0));
        } else {
            yw2.a0 a0Var2 = a7Var.f106216o;
            if (a0Var2 != null) {
                a0Var2.n().postDelayed(new com.tencent.mm.plugin.finder.feed.s4(a7Var), 300L);
            }
        }
    }
}
