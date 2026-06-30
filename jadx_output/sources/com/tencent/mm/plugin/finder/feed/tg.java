package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes3.dex */
public final class tg implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zy2.i5 f109059d;

    public tg(zy2.i5 i5Var) {
        this.f109059d = i5Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.finder.feed.jh jhVar = com.tencent.mm.plugin.finder.feed.jh.f107101a;
        tx2.i0 i0Var = com.tencent.mm.plugin.finder.feed.jh.f107102b;
        com.tencent.mm.plugin.finder.feed.jh.f107102b = null;
        if (i0Var != null) {
            i0Var.a();
        }
        this.f109059d.a(java.lang.Integer.valueOf(com.tencent.mm.plugin.finder.feed.jh.f107104d));
    }
}
