package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui;

/* loaded from: classes3.dex */
public class y0 extends com.p314xaae8f345.mm.p2802xd031a825.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.ActivityC19000x9000bdbe f260064d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.ActivityC19000x9000bdbe activityC19000x9000bdbe) {
        super(false);
        this.f260064d = activityC19000x9000bdbe;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.z1
    /* renamed from: onRealClick */
    public void mo27114xc7e50b6b(android.view.View view) {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", "https://payapp.weixin.qq.com/kfweb/helpcenter/dispatch?scene_code=CommIssueChange");
        intent.putExtra("showShare", false);
        intent.putExtra("geta8key_username", c01.z1.r());
        intent.putExtra(com.p314xaae8f345.mm.ui.w2.f292738r, true);
        com.p314xaae8f345.mm.p2802xd031a825.ui.r1.T(this.f260064d.mo55332x76847179(), intent);
        com.p314xaae8f345.mm.p2802xd031a825.ui.r1.q0(17, 1);
    }
}
