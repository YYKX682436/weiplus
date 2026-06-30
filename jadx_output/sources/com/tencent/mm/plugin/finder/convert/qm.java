package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes3.dex */
public final class qm extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.notice.NoticeStatusView f104405d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f104406e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.h32 f104407f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qm(com.tencent.mm.plugin.finder.view.notice.NoticeStatusView noticeStatusView, java.lang.String str, r45.h32 h32Var) {
        super(1);
        this.f104405d = noticeStatusView;
        this.f104406e = str;
        this.f104407f = h32Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        ((java.lang.Boolean) obj).booleanValue();
        com.tencent.mm.plugin.finder.view.notice.NoticeStatusView noticeStatusView = this.f104405d;
        if (noticeStatusView != null) {
            com.tencent.mm.plugin.finder.view.notice.NoticeStatusView.g(noticeStatusView, this.f104406e, false, new com.tencent.mm.plugin.finder.convert.pm(this.f104407f), 2, null);
        }
        return jz5.f0.f302826a;
    }
}
