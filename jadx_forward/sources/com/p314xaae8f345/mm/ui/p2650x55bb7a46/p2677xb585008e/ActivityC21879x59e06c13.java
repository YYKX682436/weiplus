package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2677xb585008e;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/ui/chatting/variants/ChattingMainUI;", "Lcom/tencent/mm/ui/chatting/ChattingUI;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.ui.chatting.variants.ChattingMainUI */
/* loaded from: classes11.dex */
public final class ActivityC21879x59e06c13 extends com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21624x4b97e77a {

    /* renamed from: u, reason: collision with root package name */
    public final jz5.g f284334u = jz5.h.b(ue5.b.f508482d);

    /* renamed from: v, reason: collision with root package name */
    public boolean f284335v;

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21624x4b97e77a
    /* renamed from: d7, reason: from getter */
    public boolean getF284335v() {
        return this.f284335v;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21624x4b97e77a, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        java.lang.String stringExtra = getIntent().getStringExtra("Chat_User");
        if (stringExtra == null) {
            stringExtra = "";
        }
        com.p314xaae8f345.mm.ui.ActivityC21387x976b8e54 m78443x9cf0d20b = com.p314xaae8f345.mm.ui.ActivityC21387x976b8e54.m78443x9cf0d20b();
        java.lang.String e76 = m78443x9cf0d20b != null ? m78443x9cf0d20b.e7() : null;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(e76 != null ? e76 : "", stringExtra)) {
            com.p314xaae8f345.mm.ui.ActivityC21387x976b8e54 m78443x9cf0d20b2 = com.p314xaae8f345.mm.ui.ActivityC21387x976b8e54.m78443x9cf0d20b();
            boolean z17 = false;
            if (m78443x9cf0d20b2 != null ? m78443x9cf0d20b2.i7() : false) {
                java.util.ArrayList arrayList = (java.util.ArrayList) bm5.m.f104234a.e();
                if (!arrayList.isEmpty()) {
                    java.util.Iterator it = arrayList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        } else if (r26.n0.D((java.lang.CharSequence) ((jz5.l) it.next()).f384366d, "LauncherUI", false, 2, null)) {
                            z17 = true;
                            break;
                        }
                    }
                }
                if (z17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingMainUI", "[onCreate]: same talker, finish: ".concat(stringExtra));
                    finish();
                }
            }
        }
        super.onCreate(bundle);
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z17, android.content.res.Configuration configuration) {
        super.onMultiWindowModeChanged(z17, configuration);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingMainUI", "[onMultiWindowModeChanged]: " + z17);
        if (this.f284335v) {
            ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2659x30c033.C21808xf12b2fdf) pf5.z.f435481a.a(this).a(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2659x30c033.C21808xf12b2fdf.class)).A7();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.vas.p2744xac1f0fa0.ActivityC22590xcda336c8, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingMainUI", "[onNewIntent]...?");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingMainUI", "[reportOnNewIntent]");
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("chat_on_new_intent", kz5.q0.f395534d, 36085);
        finish();
        ((ku5.t0) ku5.t0.f394148d).B(new ue5.a(intent));
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00ab, code lost:
    
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r0, r5) == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00e2, code lost:
    
        if (r0 != false) goto L38;
     */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2050x75681b7b.ui.AbstractActivityC17354xafef217a, com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16712xf1541050, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: superImportUIComponents */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo43518x5e67c7ca(java.util.HashSet r9) {
        /*
            r8 = this;
            java.lang.String r0 = "set"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r9, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "[superImportUIComponents]: "
            r0.<init>(r1)
            jz5.g r1 = r8.f284334u
            r2 = r1
            jz5.n r2 = (jz5.n) r2
            java.lang.Object r2 = r2.mo141623x754a37bb()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            r0.append(r2)
            r2 = 32
            r0.append(r2)
            boolean r2 = r8.isFinishing()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "MicroMsg.ChattingMainUI"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r0)
            jz5.n r1 = (jz5.n) r1
            java.lang.Object r0 = r1.mo141623x754a37bb()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto Lf5
            c01.m8 r0 = c01.d9.f()
            com.tencent.mm.booter.notification.x r0 = (com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.x) r0
            java.lang.String r0 = r0.f145050c
            int r1 = com.p314xaae8f345.mm.ui.ActivityC21387x976b8e54.m78442x336b58a0()
            com.tencent.mm.ui.LauncherUI r3 = com.p314xaae8f345.mm.ui.ActivityC21387x976b8e54.m78443x9cf0d20b()
            r4 = 0
            if (r3 == 0) goto L59
            boolean r3 = r3.i7()
            goto L5a
        L59:
            r3 = r4
        L5a:
            android.content.Intent r5 = r8.getIntent()
            java.lang.String r6 = "Chat_User"
            java.lang.String r5 = r5.getStringExtra(r6)
            if (r5 != 0) goto L68
            java.lang.String r5 = ""
        L68:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "[checkLauncherStatus]: "
            r6.<init>(r7)
            r6.append(r0)
            java.lang.String r7 = ", "
            r6.append(r7)
            r6.append(r5)
            r6.append(r7)
            r6.append(r1)
            r6.append(r7)
            r6.append(r3)
            r6.append(r7)
            boolean r7 = r8.f284335v
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r6)
            r2 = 1
            if (r0 == 0) goto Lae
            int r6 = r5.length()
            if (r6 <= 0) goto La0
            r6 = r2
            goto La1
        La0:
            r6 = r4
        La1:
            if (r6 == 0) goto Lae
            if (r1 != 0) goto Lae
            if (r3 == 0) goto Lae
            boolean r0 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r0, r5)
            if (r0 != 0) goto Le6
            goto Le5
        Lae:
            if (r1 != 0) goto Le5
            if (r3 != 0) goto Le5
            bm5.m r0 = bm5.m.f104234a
            java.util.List r0 = r0.e()
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto Lc1
            goto Le1
        Lc1:
            java.util.Iterator r0 = r0.iterator()
        Lc5:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Le1
            java.lang.Object r1 = r0.next()
            jz5.l r1 = (jz5.l) r1
            java.lang.Object r1 = r1.f384366d
            java.lang.Class<com.tencent.mm.ui.LauncherUI> r3 = com.p314xaae8f345.mm.ui.ActivityC21387x976b8e54.class
            java.lang.String r3 = r3.getName()
            boolean r1 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r1, r3)
            if (r1 == 0) goto Lc5
            r0 = r2
            goto Le2
        Le1:
            r0 = r4
        Le2:
            if (r0 == 0) goto Le5
            goto Le6
        Le5:
            r4 = r2
        Le6:
            if (r4 == 0) goto Lf5
            boolean r0 = r8.isFinishing()
            if (r0 != 0) goto Lf5
            java.lang.Class<com.tencent.mm.ui.chatting.half.NotificationHalfScreenChattingUIC> r0 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2659x30c033.C21808xf12b2fdf.class
            r9.add(r0)
            r8.f284335v = r2
        Lf5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2677xb585008e.ActivityC21879x59e06c13.mo43518x5e67c7ca(java.util.HashSet):void");
    }
}
