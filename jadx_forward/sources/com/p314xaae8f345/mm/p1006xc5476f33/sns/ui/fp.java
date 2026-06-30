package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes.dex */
public class fp implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsSettingUI f249888d;

    public fp(com.tencent.mm.plugin.sns.ui.SnsSettingUI snsSettingUI) {
        this.f249888d = snsSettingUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClick", "com.tencent.mm.plugin.sns.ui.SnsSettingUI$7");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/SnsSettingUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(this.f249888d.mo55332x76847179());
        u1Var.u("清除见面有礼广告彩蛋页MMKV（重启生效）");
        u1Var.f(java.lang.Boolean.TRUE);
        u1Var.b(new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1() { // from class: com.tencent.mm.plugin.sns.ui.fp$$a
            /* JADX WARN: Removed duplicated region for block: B:7:0x002f A[Catch: all -> 0x002a, TryCatch #0 {all -> 0x002a, blocks: (B:11:0x0021, B:7:0x002f, B:8:0x0038), top: B:10:0x0021 }] */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0038 A[Catch: all -> 0x002a, TRY_LEAVE, TryCatch #0 {all -> 0x002a, blocks: (B:11:0x0021, B:7:0x002f, B:8:0x0038), top: B:10:0x0021 }] */
            @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void a(boolean r7, java.lang.String r8) {
                /*
                    r6 = this;
                    com.tencent.mm.plugin.sns.ui.fp r0 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.fp.this
                    r0.getClass()
                    java.lang.String r1 = "lambda$onClick$0"
                    java.lang.String r2 = "com.tencent.mm.plugin.sns.ui.SnsSettingUI$7"
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r1, r2)
                    com.tencent.mm.plugin.sns.ui.SnsSettingUI r0 = r0.f249888d
                    r0.mo48674x36654fab()
                    if (r7 == 0) goto L59
                    java.lang.String r7 = "clearSelectCardList, key is "
                    java.lang.String r0 = "clearSelectCardList"
                    java.lang.String r3 = "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.RandomSelectCardStorage"
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r0, r3)
                    java.lang.String r4 = "RandomSelectCardStorage"
                    if (r8 == 0) goto L2c
                    int r5 = r8.length()     // Catch: java.lang.Throwable -> L2a
                    if (r5 != 0) goto L28
                    goto L2c
                L28:
                    r5 = 0
                    goto L2d
                L2a:
                    r7 = move-exception
                    goto L53
                L2c:
                    r5 = 1
                L2d:
                    if (r5 == 0) goto L38
                    java.lang.String r7 = "clearSelectCardList, vangoghId is null or empty"
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(r4, r7)     // Catch: java.lang.Throwable -> L2a
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r3)     // Catch: java.lang.Throwable -> L2a
                    goto L59
                L38:
                    y84.p3 r5 = y84.p3.f541725a     // Catch: java.lang.Throwable -> L2a
                    java.lang.String r8 = r5.a(r8)     // Catch: java.lang.Throwable -> L2a
                    java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2a
                    r5.<init>(r7)     // Catch: java.lang.Throwable -> L2a
                    r5.append(r8)     // Catch: java.lang.Throwable -> L2a
                    java.lang.String r7 = r5.toString()     // Catch: java.lang.Throwable -> L2a
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r4, r7)     // Catch: java.lang.Throwable -> L2a
                    java.lang.String r7 = ""
                    p34.o.i(r8, r7)     // Catch: java.lang.Throwable -> L2a
                    goto L56
                L53:
                    ca4.q.c(r4, r7)
                L56:
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r3)
                L59:
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r1, r2)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18195x5d0d2d7.a(boolean, java.lang.String):void");
            }
        });
        u1Var.q(false);
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/SnsSettingUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ui.SnsSettingUI$7");
    }
}
