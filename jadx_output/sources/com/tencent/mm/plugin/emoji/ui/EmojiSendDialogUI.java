package com.tencent.mm.plugin.emoji.ui;

/* loaded from: classes9.dex */
public class EmojiSendDialogUI extends com.tencent.mm.ui.MMBaseActivity {

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.storage.emotion.EmojiInfo f97825e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f97826f = false;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f97827g;

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        overridePendingTransition(-1, -1);
        super.finish();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (i17 == 1001) {
            if (i18 == -1) {
                com.tencent.mars.xlog.Log.i("MicroMsg.EmojiSendDialogUI", "select contact result");
                java.lang.String stringExtra = intent.getStringExtra("Select_Conv_User");
                java.lang.String stringExtra2 = intent.getStringExtra("custom_send_text");
                ((com.tencent.mm.feature.emoji.b0) i95.n0.c(com.tencent.mm.feature.emoji.b0.class)).getClass();
                com.tencent.mm.storage.emotion.EmojiInfo u17 = com.tencent.mm.storage.n5.f().c().u1(this.f97825e.getMd5());
                if (u17 == null) {
                    java.lang.String g17 = n22.m.g();
                    com.tencent.mm.storage.emotion.EmojiInfo emojiInfo = this.f97825e;
                    java.lang.String p17 = com.tencent.mm.plugin.emoji.model.EmojiLogic.p(g17, emojiInfo.field_groupId, emojiInfo.getMd5());
                    if (com.tencent.mm.vfs.w6.j(p17)) {
                        int i19 = com.tencent.mm.sdk.platformtools.y1.c(p17) ? 2 : 1;
                        com.tencent.mm.storage.emotion.EmojiInfo emojiInfo2 = this.f97825e;
                        l75.e0 e0Var = com.tencent.mm.storage.emotion.EmojiInfo.L2;
                        emojiInfo2.field_catalog = 65;
                        emojiInfo2.field_type = i19;
                        emojiInfo2.field_size = (int) com.tencent.mm.vfs.w6.k(p17);
                        emojiInfo2.field_temp = 1;
                        ((com.tencent.mm.feature.emoji.b0) i95.n0.c(com.tencent.mm.feature.emoji.b0.class)).getClass();
                        u17 = com.tencent.mm.storage.n5.f().c().L0(emojiInfo2, true);
                    }
                }
                if (stringExtra == null) {
                    stringExtra = "";
                }
                java.util.Iterator it = com.tencent.mm.sdk.platformtools.t8.P1(stringExtra.split(",")).iterator();
                while (it.hasNext()) {
                    java.lang.String str = (java.lang.String) it.next();
                    if (u17 != null) {
                        ((com.tencent.mm.feature.emoji.b0) i95.n0.c(com.tencent.mm.feature.emoji.b0.class)).Ni().Y(str, u17, null, null, u17.K2.ordinal());
                        if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra2)) {
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
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
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
            com.tencent.mm.storage.emotion.EmojiInfo r0 = (com.tencent.mm.storage.emotion.EmojiInfo) r0
            r4.f97825e = r0
            android.content.Intent r0 = r4.getIntent()
            java.lang.String r1 = "ad_uxInfo"
            r0.getStringExtra(r1)
            java.lang.Class<k12.s> r0 = k12.s.class
            i95.m r0 = i95.n0.c(r0)
            k12.s r0 = (k12.s) r0
            g30.h r0 = (g30.h) r0
            s25.b r0 = r0.Bi()
            com.tencent.mm.storage.emotion.EmojiInfo r1 = r4.f97825e
            java.lang.String r1 = r1.field_md5
            com.tencent.mm.storage.emotion.EmojiInfo r0 = r0.y(r1)
            if (r0 == 0) goto L46
            r4.f97825e = r0
            r4.f97826f = r5
        L46:
            java.lang.String r5 = n22.m.g()
            com.tencent.mm.storage.emotion.EmojiInfo r0 = r4.f97825e
            java.lang.String r1 = r0.field_groupId
            java.lang.String r0 = r0.getMd5()
            java.lang.String r5 = com.tencent.mm.plugin.emoji.model.EmojiLogic.p(r5, r1, r0)
            r4.f97827g = r5
            java.lang.String r5 = "MicroMsg.EmojiSendDialogUI"
            java.lang.String r0 = "select contact"
            com.tencent.mars.xlog.Log.i(r5, r0)
            java.lang.Class<n13.b0> r5 = n13.b0.class
            i95.m r0 = i95.n0.c(r5)
            n13.b0 r0 = (n13.b0) r0
            r0.getClass()
            lb5.a r0 = new lb5.a
            r0.<init>()
            boolean r1 = r4.f97826f
            if (r1 == 0) goto L7d
            com.tencent.mm.storage.emotion.EmojiInfo r1 = r4.f97825e
            java.lang.String r1 = r1.field_md5
            boolean r2 = com.tencent.mm.sdk.platformtools.t8.f192989a
            if (r1 != 0) goto L85
            goto L83
        L7d:
            java.lang.String r1 = r4.f97827g
            boolean r2 = com.tencent.mm.sdk.platformtools.t8.f192989a
            if (r1 != 0) goto L85
        L83:
            java.lang.String r1 = ""
        L85:
            r0.n(r1)
            i95.m r5 = i95.n0.c(r5)
            n13.b0 r5 = (n13.b0) r5
            r1 = 1001(0x3e9, float:1.403E-42)
            n13.r r1 = n13.r.a(r1)
            n13.u r2 = r1.f334120d
            r3 = 5
            r2.f334139a = r3
            dk5.b0 r5 = (dk5.b0) r5
            r5.Bi(r4, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.emoji.ui.EmojiSendDialogUI.onCreate(android.os.Bundle):void");
    }

    @Override // com.tencent.mm.ui.MMBaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }
}
