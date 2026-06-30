package com.p314xaae8f345.mm.ui.p2650x55bb7a46;

/* loaded from: classes9.dex */
public class pe implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504 f283631a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m f283632b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.qe f283633c;

    public pe(com.p314xaae8f345.mm.ui.p2650x55bb7a46.qe qeVar, com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504 c11286x34a5504, com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m mVar) {
        this.f283633c = qeVar;
        this.f283631a = c11286x34a5504;
        this.f283632b = mVar;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j
    public void a(boolean z17, java.lang.String str, int i17) {
        java.lang.String str2;
        if (z17) {
            com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504 c11286x34a5504 = this.f283631a;
            int m48467xfb85f7b0 = c11286x34a5504.m48467xfb85f7b0();
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.qe qeVar = this.f283633c;
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m mVar = this.f283632b;
            if (m48467xfb85f7b0 != 8) {
                str2 = null;
            } else {
                if (c11286x34a5504.f33128x4f3b3aa0 == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WXAppMessageReceiver", "code should not reach here due to WXMediaMessage::checkArgs, sendEmoji Fail cause thumbData is null");
                    return;
                }
                str2 = ((y12.h) ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi()).J(qeVar.f284162a.mo7438x76847179(), c11286x34a5504, mVar.f67370x28d45f97);
                if (str2 == null) {
                    return;
                }
            }
            java.lang.String str3 = str2;
            c01.sc.d().a(27, 1);
            com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504 c11286x34a55042 = this.f283631a;
            java.lang.String str4 = c11286x34a55042.f33124x838b091d;
            java.lang.String str5 = c11286x34a55042.f33125x9b39409a;
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.k0.D(c11286x34a55042, mVar.f67370x28d45f97, mVar.f67372x453d1e07, qeVar.f284163b.x(), 1, str3);
        }
    }
}
