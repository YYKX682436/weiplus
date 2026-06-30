package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes10.dex */
public final class g3 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.a7 f106818d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ so2.y0 f106819e;

    public g3(com.tencent.mm.plugin.finder.feed.a7 a7Var, so2.y0 y0Var) {
        this.f106818d = a7Var;
        this.f106819e = y0Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.finder.feed.a7.m(this.f106818d, this.f106819e, true);
    }
}
