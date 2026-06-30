package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

/* renamed from: com.tencent.mm.plugin.finder.feed.ui.do, reason: invalid class name */
/* loaded from: classes2.dex */
public final class Cdo extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14114xff3e44c f191486d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Cdo(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14114xff3e44c activityC14114xff3e44c) {
        super(0);
        this.f191486d = activityC14114xff3e44c;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        return java.lang.Boolean.valueOf(this.f191486d.getIntent().getBooleanExtra("KEY_IS_GLOBAL_FAV", false));
    }
}
