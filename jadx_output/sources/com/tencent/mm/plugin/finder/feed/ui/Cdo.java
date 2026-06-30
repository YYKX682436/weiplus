package com.tencent.mm.plugin.finder.feed.ui;

/* renamed from: com.tencent.mm.plugin.finder.feed.ui.do, reason: invalid class name */
/* loaded from: classes2.dex */
public final class Cdo extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI25 f109953d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Cdo(com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI25 occupyFinderUI25) {
        super(0);
        this.f109953d = occupyFinderUI25;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return java.lang.Boolean.valueOf(this.f109953d.getIntent().getBooleanExtra("KEY_IS_GLOBAL_FAV", false));
    }
}
