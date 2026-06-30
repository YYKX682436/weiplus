package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes.dex */
public final class y6 implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.MMSwitchBtn f110755a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f110756b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderLikePrivacyUI f110757c;

    public y6(com.tencent.mm.ui.widget.MMSwitchBtn mMSwitchBtn, java.lang.String str, com.tencent.mm.plugin.finder.feed.ui.FinderLikePrivacyUI finderLikePrivacyUI) {
        this.f110755a = mMSwitchBtn;
        this.f110756b = str;
        this.f110757c = finderLikePrivacyUI;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        return kz5.c1.k(new jz5.l("switch_status_after", java.lang.Integer.valueOf(this.f110755a.f211363x ? 1 : 0)), new jz5.l("thx_to_uin", this.f110756b), new jz5.l("friend_like_privilege_source_page", java.lang.Integer.valueOf(this.f110757c.f109321h)));
    }
}
