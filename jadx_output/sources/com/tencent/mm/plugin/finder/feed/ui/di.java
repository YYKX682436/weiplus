package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes2.dex */
public final class di extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderPostPlayTimelineUI f109948d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public di(com.tencent.mm.plugin.finder.feed.ui.FinderPostPlayTimelineUI finderPostPlayTimelineUI) {
        super(0);
        this.f109948d = finderPostPlayTimelineUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return java.lang.Integer.valueOf(this.f109948d.getIntent().getIntExtra("single_comment_scene", 0));
    }
}
