package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes2.dex */
public final class fo extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI25 f110029d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fo(com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI25 occupyFinderUI25) {
        super(0);
        this.f110029d = occupyFinderUI25;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return java.lang.Integer.valueOf(this.f110029d.getIntent().getIntExtra("KEY_COMMENT_SCENE", 0));
    }
}
