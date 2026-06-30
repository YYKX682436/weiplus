package ms;

@j95.b
/* loaded from: classes5.dex */
public class a extends i95.w implements ns.k {
    public void Ai(android.content.Context context, final ns.j jVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4 T6 = ((ms.j) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(ms.j.class)).T6();
        ((ku5.t0) ku5.t0.f394148d).g(new java.lang.Runnable() { // from class: ms.a$$a
            /* JADX WARN: Code restructure failed: missing block: B:12:0x0089, code lost:
            
                if ((r3.h(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2535xb5e903a3.C20309x7493ccfb()) == 1) != false) goto L17;
             */
            /* JADX WARN: Code restructure failed: missing block: B:13:0x00ae, code lost:
            
                r5 = false;
             */
            /* JADX WARN: Code restructure failed: missing block: B:14:0x00af, code lost:
            
                ((ku5.t0) ku5.t0.f394148d).B(new ms.RunnableC29162x2ca3e1(r0, r1, r5));
             */
            /* JADX WARN: Code restructure failed: missing block: B:15:0x00bb, code lost:
            
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:22:0x00ab, code lost:
            
                if (r2 != false) goto L25;
             */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void run() {
                /*
                    r10 = this;
                    com.tencent.mm.ui.widget.dialog.f4 r0 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.this
                    ns.j r1 = r2
                    java.util.Set r2 = c01.e2.f118650a
                    java.lang.Class<vg3.x3> r2 = vg3.x3.class
                    lm0.a r2 = gm0.j1.s(r2)
                    vg3.x3 r2 = (vg3.x3) r2
                    com.tencent.mm.plugin.messenger.foundation.h2 r2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) r2
                    com.tencent.mm.storage.k4 r2 = r2.Bi()
                    java.lang.String r3 = c01.z1.r()
                    java.lang.String r4 = "helper_entry"
                    java.lang.String r5 = "filehelper"
                    java.lang.String r6 = "weixin"
                    java.lang.String[] r3 = new java.lang.String[]{r3, r6, r4, r5}
                    java.lang.String[] r4 = c01.e2.f118665p
                    r5 = 1
                    int r2 = r2.O(r5, r4, r3)
                    java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
                    java.lang.Object[] r3 = new java.lang.Object[]{r3}
                    java.lang.String r4 = "getNormalContactIncludeBlackCnt: count:%s"
                    java.lang.String r6 = "MicroMsg.ContactStorageLogic"
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r6, r4, r3)
                    bm5.o1 r3 = bm5.o1.f104252a
                    com.tencent.mm.repairer.config.friend.RepairerConfigDelContactNumLimit r4 = new com.tencent.mm.repairer.config.friend.RepairerConfigDelContactNumLimit
                    r4.<init>()
                    int r4 = r3.h(r4)
                    r7 = 0
                    if (r2 < r4) goto L49
                    r8 = r5
                    goto L4a
                L49:
                    r8 = r7
                L4a:
                    r9 = 4
                    java.lang.Object[] r9 = new java.lang.Object[r9]
                    java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                    r9[r7] = r2
                    java.lang.Boolean r2 = java.lang.Boolean.valueOf(r8)
                    r9[r5] = r2
                    r2 = 2
                    java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                    r9[r2] = r4
                    boolean r2 = com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40539x7a994349()
                    if (r2 == 0) goto L6c
                    com.tencent.mm.sdk.platformtools.z3 r2 = new com.tencent.mm.sdk.platformtools.z3
                    r2.<init>()
                    goto L6e
                L6c:
                    java.lang.String r2 = ""
                L6e:
                    r4 = 3
                    r9[r4] = r2
                    java.lang.String r2 = "AddContactFeatureServic"
                    java.lang.String r4 = "neendVerifyUserPreCheckRequest normalContactIncludeBlackCnt:%s, isContactNumExceedLimit:%s limitCount:%s stack:%s"
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r4, r9)
                    if (r8 != 0) goto L8b
                    com.tencent.mm.repairer.config.global.RepairerConfigRecommendDeleteContactTestSwitch r2 = new com.tencent.mm.repairer.config.global.RepairerConfigRecommendDeleteContactTestSwitch
                    r2.<init>()
                    int r2 = r3.h(r2)
                    if (r2 != r5) goto L88
                    r2 = r5
                    goto L89
                L88:
                    r2 = r7
                L89:
                    if (r2 == 0) goto Lae
                L8b:
                    j62.e r2 = j62.e.g()
                    com.tencent.mm.repairer.config.global.RepairerConfigRecommendDeleteContactFeatureSwitch r3 = new com.tencent.mm.repairer.config.global.RepairerConfigRecommendDeleteContactFeatureSwitch
                    r3.<init>()
                    int r2 = r2.c(r3)
                    if (r2 != r5) goto L9c
                    r2 = r5
                    goto L9d
                L9c:
                    r2 = r7
                L9d:
                    java.lang.Boolean r3 = java.lang.Boolean.valueOf(r2)
                    java.lang.Object[] r3 = new java.lang.Object[]{r3}
                    java.lang.String r4 = "recommendDeleteContactFeatureSwitch() called result:%s"
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r6, r4, r3)
                    if (r2 == 0) goto Lae
                    goto Laf
                Lae:
                    r5 = r7
                Laf:
                    ku5.u0 r2 = ku5.t0.f394148d
                    ms.a$$b r3 = new ms.a$$b
                    r3.<init>()
                    ku5.t0 r2 = (ku5.t0) r2
                    r2.B(r3)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: ms.RunnableC29161x2ca3e0.run():void");
            }
        });
    }

    public void Bi(android.content.Context context, int i17, java.lang.String str, ns.i iVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        ms.n nVar = (ms.n) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(ms.n.class);
        ms.b bVar = new ms.b(this, iVar);
        nVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VerifyUserPreCheckUIC", "verifyUserPreCheckRequest() called");
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = nVar.m158354x19263085();
        int i18 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(m158354x19263085);
        e4Var.f293309c = nVar.m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.ggc);
        e4Var.f293313g = 2;
        e4Var.f293311e = true;
        nVar.f412469d = e4Var.c();
        boolean z17 = bm5.o1.f104252a.h(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2535xb5e903a3.C20309x7493ccfb()) == 1;
        r45.jy6 jy6Var = new r45.jy6();
        jy6Var.f459754d = i17;
        if (z17) {
            str = "test";
        } else if (str == null) {
            str = "";
        }
        jy6Var.f459755e = str;
        java.lang.String str2 = "contacts_max_limit_sort_sessionid_" + c01.id.c();
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152200d = 11568;
        lVar.f152199c = "/cgi-bin/micromsg-bin/verifyuserprecheck";
        lVar.f152197a = jy6Var;
        lVar.f152198b = new r45.ky6();
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        com.p314xaae8f345.mm.p944x882e457a.i iVar2 = new com.p314xaae8f345.mm.p944x882e457a.i();
        iVar2.p(a17);
        iVar2.l().K(new ms.m(nVar, bVar, str2));
    }

    public ns.l wi(int i17, java.util.List list, java.util.List list2, java.lang.String str, java.lang.String str2) {
        return new com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.m3(i17, list, list2, str, str2);
    }
}
