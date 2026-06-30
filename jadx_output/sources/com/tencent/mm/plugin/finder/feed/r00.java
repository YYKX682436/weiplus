package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class r00 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.v00 f108863d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r00(com.tencent.mm.plugin.finder.feed.v00 v00Var) {
        super(0);
        this.f108863d = v00Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return java.lang.Boolean.valueOf(this.f108863d.f110846d.getIntent().getIntExtra("FROM_SCENE_KEY", 2) == 6);
    }
}
