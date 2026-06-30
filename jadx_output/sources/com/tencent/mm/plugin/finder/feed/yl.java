package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class yl implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.em f111176d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f111177e;

    public yl(com.tencent.mm.plugin.finder.feed.em emVar, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed) {
        this.f111176d = emVar;
        this.f111177e = baseFinderFeed;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.finder.assist.y4.f102714a.J(this.f111176d.f106421d, this.f111177e.getFeedObject(), true);
    }
}
