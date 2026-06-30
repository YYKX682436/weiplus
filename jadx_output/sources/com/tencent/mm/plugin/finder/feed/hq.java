package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class hq implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f106944d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f106945e;

    public hq(android.app.Activity activity, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed) {
        this.f106944d = activity;
        this.f106945e = baseFinderFeed;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.finder.assist.y4.f102714a.J(this.f106944d, this.f106945e.getFeedObject(), true);
    }
}
