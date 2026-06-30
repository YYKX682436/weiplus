package qd4;

/* loaded from: classes15.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2209x60b7c31.ActivityC18357x320c26e1 f443393d;

    public a(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2209x60b7c31.ActivityC18357x320c26e1 activityC18357x320c26e1) {
        this.f443393d = activityC18357x320c26e1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0069, code lost:
    
        if (r5.length() == 0) goto L10;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            r6 = this;
            java.lang.String r0 = "run"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI$10"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r0, r1)
            c93.b r2 = c93.a.a()
            b93.b r2 = (b93.b) r2
            r2.getClass()
            com.tencent.mm.storage.h4 r2 = b93.r.wi()
            r2.D0()
            c93.b r2 = c93.a.a()
            b93.b r2 = (b93.b) r2
            java.util.List r2 = r2.d()
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI r3 = r6.f443393d
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2209x60b7c31.ActivityC18357x320c26e1.Y6(r3, r2)
            qd4.r r2 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2209x60b7c31.ActivityC18357x320c26e1.T6(r3)
            java.util.ArrayList r4 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2209x60b7c31.ActivityC18357x320c26e1.X6(r3)
            r2.h(r4)
            java.lang.String r2 = "access$1600"
            java.lang.String r4 = "com.tencent.mm.plugin.sns.ui.jsapi.JsapiSnsLabelUI"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r2, r4)
            r3.d7()
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r2, r4)
            java.util.ArrayList r2 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2209x60b7c31.ActivityC18357x320c26e1.X6(r3)
            if (r2 == 0) goto L51
            java.util.ArrayList r2 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2209x60b7c31.ActivityC18357x320c26e1.X6(r3)
            int r2 = r2.size()
            if (r2 != 0) goto L87
        L51:
            java.lang.String r2 = "access$2000"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r2, r4)
            java.lang.String r5 = r3.f251081o
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r2, r4)
            if (r5 == 0) goto L6b
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r2, r4)
            java.lang.String r5 = r3.f251081o
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r2, r4)
            int r2 = r5.length()
            if (r2 != 0) goto L87
        L6b:
            qd4.r r2 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2209x60b7c31.ActivityC18357x320c26e1.T6(r3)
            int r2 = r2.f443428p
            int r5 = r3.f251073d
            if (r2 == r5) goto L87
            qd4.r r2 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2209x60b7c31.ActivityC18357x320c26e1.T6(r3)
            int r2 = r2.f443428p
            int r5 = r3.f251074e
            if (r2 == r5) goto L87
            qd4.r r2 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2209x60b7c31.ActivityC18357x320c26e1.T6(r3)
            int r5 = r3.f251073d
            r2.f443428p = r5
        L87:
            qd4.r r2 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2209x60b7c31.ActivityC18357x320c26e1.T6(r3)
            r2.notifyDataSetChanged()
            java.lang.String r2 = "access$1702"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r2, r4)
            r5 = 0
            r3.f251089w = r5
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r2, r4)
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qd4.a.run():void");
    }
}
