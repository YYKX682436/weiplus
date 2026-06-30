package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1672xc20796d8;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0004H\u0016¨\u0006\u000f"}, d2 = {"Lcom/tencent/mm/plugin/finder/view/notice/BigGreenNoticeStatusView;", "Lcom/tencent/mm/plugin/finder/view/notice/NoticeStatusView;", "", "getPayText", "", "getLayoutId", "getBgRes", "getNormalTextColorRes", "getGreyTextColorRes", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-finder-base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.view.notice.BigGreenNoticeStatusView */
/* loaded from: classes15.dex */
public final class C15418xa028bed2 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1672xc20796d8.C15422x1a5a3ecf {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15418xa028bed2(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        android.view.ViewGroup.LayoutParams layoutParams = getTvPrice().getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.topMargin = i65.a.b(context, 1);
        getTvPrice().setLayoutParams(marginLayoutParams);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1672xc20796d8.C15422x1a5a3ecf
    public void f(java.lang.String str, boolean z17, yz5.a getNoticeInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(getNoticeInfo, "getNoticeInfo");
        super.f(str, z17, getNoticeInfo);
        r45.h32 h32Var = (r45.h32) getNoticeInfo.mo152xb9724478();
        boolean z18 = h32Var.m75939xb282bd08(1) == 0;
        r45.q65 q65Var = (r45.q65) h32Var.m75936x14adae67(10);
        boolean m75933x41a8a7f2 = q65Var != null ? q65Var.m75933x41a8a7f2(0) : false;
        boolean m75933x41a8a7f22 = q65Var != null ? q65Var.m75933x41a8a7f2(2) : false;
        if (m75933x41a8a7f2) {
            z18 = m75933x41a8a7f22;
        }
        if (z18) {
            getBgView().setBackground(getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.a96));
            getIvTicket().m82040x7541828(getResources().getColor(mo62836x19ffce7f()));
            getTvBigText().setTextColor(getResources().getColor(mo62836x19ffce7f()));
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1672xc20796d8.C15422x1a5a3ecf
    /* renamed from: getBgRes */
    public int mo62835x7432b865() {
        return com.p314xaae8f345.mm.R.C30861xcebc809e.a0u;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1672xc20796d8.C15422x1a5a3ecf
    /* renamed from: getGreyTextColorRes */
    public int mo62836x19ffce7f() {
        return com.p314xaae8f345.mm.R.C30859x5a72f63.f77650xad7ef2e;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1672xc20796d8.C15422x1a5a3ecf
    /* renamed from: getLayoutId */
    public int mo62837x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.aol;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1672xc20796d8.C15422x1a5a3ecf
    /* renamed from: getNormalTextColorRes */
    public int mo62838x41b72f07() {
        return com.p314xaae8f345.mm.R.C30859x5a72f63.f561082ab0;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1672xc20796d8.C15422x1a5a3ecf
    /* renamed from: getPayText */
    public java.lang.String mo62839xede11bf() {
        java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.eyo);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        return string;
    }
}
