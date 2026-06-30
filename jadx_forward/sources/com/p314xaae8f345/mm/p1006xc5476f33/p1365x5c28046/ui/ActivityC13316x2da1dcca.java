package com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui;

/* renamed from: com.tencent.mm.plugin.emoji.ui.EmojiSendDialogUI */
/* loaded from: classes9.dex */
public class ActivityC13316x2da1dcca extends com.p314xaae8f345.mm.ui.ActivityC21397xf0b6eac0 {

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 f179358e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f179359f = false;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f179360g;

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void finish() {
        overridePendingTransition(-1, -1);
        super.finish();
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (i17 == 1001) {
            if (i18 == -1) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiSendDialogUI", "select contact result");
                java.lang.String stringExtra = intent.getStringExtra("Select_Conv_User");
                java.lang.String stringExtra2 = intent.getStringExtra("custom_send_text");
                ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0.class)).getClass();
                com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 u17 = com.p314xaae8f345.mm.p2621x8fb0427b.n5.f().c().u1(this.f179358e.mo42933xb5885648());
                if (u17 == null) {
                    java.lang.String g17 = n22.m.g();
                    com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 c21053xdbf1e5f4 = this.f179358e;
                    java.lang.String p17 = com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.C13262xa27596d8.p(g17, c21053xdbf1e5f4.f68663x861009b5, c21053xdbf1e5f4.mo42933xb5885648());
                    if (com.p314xaae8f345.mm.vfs.w6.j(p17)) {
                        int i19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.y1.c(p17) ? 2 : 1;
                        com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 c21053xdbf1e5f42 = this.f179358e;
                        l75.e0 e0Var = com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4.L2;
                        c21053xdbf1e5f42.f68653x95b20dd4 = 65;
                        c21053xdbf1e5f42.f68689x2262335f = i19;
                        c21053xdbf1e5f42.f68679x22618426 = (int) com.p314xaae8f345.mm.vfs.w6.k(p17);
                        c21053xdbf1e5f42.f68685x2261e7f9 = 1;
                        ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0.class)).getClass();
                        u17 = com.p314xaae8f345.mm.p2621x8fb0427b.n5.f().c().L0(c21053xdbf1e5f42, true);
                    }
                }
                if (stringExtra == null) {
                    stringExtra = "";
                }
                java.util.Iterator it = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P1(stringExtra.split(",")).iterator();
                while (it.hasNext()) {
                    java.lang.String str = (java.lang.String) it.next();
                    if (u17 != null) {
                        ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0.class)).Ni().Y(str, u17, null, null, u17.K2.ordinal());
                        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra2)) {
                            ((dk5.s5) tg3.t1.a()).Ui(stringExtra2, str);
                        }
                    }
                }
                setResult(-1);
            } else {
                setResult(0);
            }
            finish();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0083, code lost:
    
        r1 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0081, code lost:
    
        if (r1 == null) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x007a, code lost:
    
        if (r1 == null) goto L12;
     */
    @Override // p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r5) {
        /*
            r4 = this;
            r0 = -1
            r4.overridePendingTransition(r0, r0)
            super.onCreate(r5)
            r5 = 1
            r4.requestWindowFeature(r5)
            android.view.Window r0 = r4.getWindow()
            r1 = 0
            r0.setStatusBarColor(r1)
            android.content.Intent r0 = r4.getIntent()
            java.lang.String r1 = "emoji_info"
            android.os.Parcelable r0 = r0.getParcelableExtra(r1)
            com.tencent.mm.storage.emotion.EmojiInfo r0 = (com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4) r0
            r4.f179358e = r0
            android.content.Intent r0 = r4.getIntent()
            java.lang.String r1 = "ad_uxInfo"
            r0.getStringExtra(r1)
            java.lang.Class<k12.s> r0 = k12.s.class
            i95.m r0 = i95.n0.c(r0)
            k12.s r0 = (k12.s) r0
            g30.h r0 = (g30.h) r0
            s25.b r0 = r0.Bi()
            com.tencent.mm.storage.emotion.EmojiInfo r1 = r4.f179358e
            java.lang.String r1 = r1.f68671x4b6e68b9
            com.tencent.mm.storage.emotion.EmojiInfo r0 = r0.y(r1)
            if (r0 == 0) goto L46
            r4.f179358e = r0
            r4.f179359f = r5
        L46:
            java.lang.String r5 = n22.m.g()
            com.tencent.mm.storage.emotion.EmojiInfo r0 = r4.f179358e
            java.lang.String r1 = r0.f68663x861009b5
            java.lang.String r0 = r0.mo42933xb5885648()
            java.lang.String r5 = com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.C13262xa27596d8.p(r5, r1, r0)
            r4.f179360g = r5
            java.lang.String r5 = "MicroMsg.EmojiSendDialogUI"
            java.lang.String r0 = "select contact"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r5, r0)
            java.lang.Class<n13.b0> r5 = n13.b0.class
            i95.m r0 = i95.n0.c(r5)
            n13.b0 r0 = (n13.b0) r0
            r0.getClass()
            lb5.a r0 = new lb5.a
            r0.<init>()
            boolean r1 = r4.f179359f
            if (r1 == 0) goto L7d
            com.tencent.mm.storage.emotion.EmojiInfo r1 = r4.f179358e
            java.lang.String r1 = r1.f68671x4b6e68b9
            boolean r2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a
            if (r1 != 0) goto L85
            goto L83
        L7d:
            java.lang.String r1 = r4.f179360g
            boolean r2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a
            if (r1 != 0) goto L85
        L83:
            java.lang.String r1 = ""
        L85:
            r0.n(r1)
            i95.m r5 = i95.n0.c(r5)
            n13.b0 r5 = (n13.b0) r5
            r1 = 1001(0x3e9, float:1.403E-42)
            n13.r r1 = n13.r.a(r1)
            n13.u r2 = r1.f415653d
            r3 = 5
            r2.f415672a = r3
            dk5.b0 r5 = (dk5.b0) r5
            r5.Bi(r4, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13316x2da1dcca.onCreate(android.os.Bundle):void");
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21397xf0b6eac0, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }
}
