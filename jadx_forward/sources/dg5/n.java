package dg5;

/* loaded from: classes11.dex */
public class n implements android.view.MenuItem.OnMenuItemClickListener, com.p314xaae8f345.mm.ui.da, r01.w2 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f f313913d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2740x696c9db.w6 f313914e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f313915f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f313916g;

    /* renamed from: h, reason: collision with root package name */
    public final r01.m f313917h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f313918i;

    /* renamed from: m, reason: collision with root package name */
    public s01.a0 f313919m;

    /* renamed from: n, reason: collision with root package name */
    public final w01.c f313920n = new w01.c();

    public n(com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f activityC21401x6ce6f73f, java.lang.String str) {
        this.f313913d = activityC21401x6ce6f73f;
        this.f313916g = str;
        r01.m y07 = r01.q3.bj().y0(str);
        this.f313917h = y07;
        if (y07 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("EnterpriseConversationDropMenuPresenter", "init fatherAttr is null, username=%s", str);
        }
        this.f313918i = r01.q3.cj().d1(str);
    }

    @Override // r01.w2
    public void K1(int i17, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f313915f;
        if (u3Var != null) {
            u3Var.dismiss();
            this.f313915f = null;
        }
        if (m1Var.mo808xfb85f7b0() == 1355) {
            r45.v90 H = ((s01.g0) m1Var).H();
            if (H.f469533e == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("EnterpriseConversationDropMenuPresenter", "onBizChatSceneEnd full_chat is null");
                dp.a.m125854x26a183b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, b(com.p314xaae8f345.mm.R.C30867xcad56011.i48), 0).show();
                return;
            }
            s01.h D0 = r01.q3.Ui().D0(H.f469533e.f459125d.f464618d);
            if (D0 == null) {
                dp.a.m125854x26a183b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, b(com.p314xaae8f345.mm.R.C30867xcad56011.i48), 0).show();
            } else {
                c(D0.f69168x92559640);
            }
        }
    }

    public final boolean a() {
        s01.a0 y07 = r01.q3.Vi().y0(r01.q3.Vi().z0(this.f313918i));
        this.f313919m = y07;
        return (y07 == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(y07.f65834x53f3fff9)) ? false : true;
    }

    public final java.lang.String b(int i17) {
        return this.f313913d.getString(i17);
    }

    public final void c(long j17) {
        com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f activityC21401x6ce6f73f = this.f313913d;
        if (activityC21401x6ce6f73f instanceof com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2698xc90c42a8.AbstractActivityC22393x78692359) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putLong("key_biz_chat_id", j17);
            bundle.putBoolean("finish_direct", false);
            bundle.putBoolean("key_need_send_video", false);
            bundle.putBoolean("key_is_biz_chat", true);
            ((com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2698xc90c42a8.AbstractActivityC22393x78692359) activityC21401x6ce6f73f).m80491x5d4f20c8(this.f313918i, bundle, true);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    @Override // com.p314xaae8f345.mm.ui.xc
    /* renamed from: mmOnActivityResult */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo9729x757c998b(int r8, int r9, android.content.Intent r10) {
        /*
            r7 = this;
            r0 = -1
            if (r9 != r0) goto L85
            if (r10 != 0) goto L7
            goto L85
        L7:
            r9 = 1
            if (r8 == r9) goto Lb
            return
        Lb:
            java.lang.String r8 = "result_data"
            android.os.Bundle r8 = r10.getBundleExtra(r8)
            r10 = 0
            if (r8 == 0) goto L72
            java.lang.String r0 = "EnterpriseConversationDropMenuPresenter"
            java.lang.String r1 = "bundle != null"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r1)
            java.lang.String r0 = "enterprise_members"
            java.lang.String r8 = r8.getString(r0)
            r45.j53 r0 = new r45.j53
            r0.<init>()
            s01.h r1 = new s01.h
            r1.<init>()
            s01.a0 r2 = r7.f313919m
            r3 = 0
            if (r2 == 0) goto L33
            java.lang.String r2 = r2.f65834x53f3fff9
            goto L34
        L33:
            r2 = r3
        L34:
            r1.f69166x53f3fff9 = r2
            java.lang.String r2 = r7.f313918i
            r1.f69170x75756b18 = r2
            boolean r8 = s01.r.a(r1, r8, r3, r0)
            if (r8 == 0) goto L72
            long r3 = r1.f69168x92559640
            r5 = -1
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 == 0) goto L4c
            r7.c(r3)
            goto L73
        L4c:
            s01.y r8 = r01.q3.Ni()
            s01.g0 r8 = r8.e(r2, r0, r7)
            com.tencent.mm.ui.MMFragmentActivity r0 = r7.f313913d
            r1 = 2131756315(0x7f10051b, float:1.9143534E38)
            java.lang.String r1 = r7.b(r1)
            r2 = 2131756354(0x7f100542, float:1.9143613E38)
            java.lang.String r2 = r7.b(r2)
            r3 = 1
            r4 = 1
            dg5.m r5 = new dg5.m
            r5.<init>(r7, r8)
            com.tencent.mm.ui.widget.dialog.u3 r8 = db5.e1.Q(r0, r1, r2, r3, r4, r5)
            r7.f313915f = r8
            goto L73
        L72:
            r9 = r10
        L73:
            if (r9 != 0) goto L85
            r8 = 2131774428(0x7f104bdc, float:1.9180272E38)
            java.lang.String r8 = r7.b(r8)
            com.tencent.mm.ui.MMFragmentActivity r9 = r7.f313913d
            android.widget.Toast r8 = dp.a.m125854x26a183b(r9, r8, r10)
            r8.show()
        L85:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dg5.n.mo9729x757c998b(int, int, android.content.Intent):void");
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        java.lang.String str;
        java.lang.String str2 = this.f313916g;
        try {
            r01.m y07 = r01.q3.bj().y0(str2);
            r45.ik ikVar = new r45.ik();
            ikVar.mo11468x92b714fd(y07.f66039x3c18ecc6);
            str = ikVar.f458638g;
        } catch (java.lang.Throwable unused) {
            str = "";
        }
        boolean z17 = !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str);
        if (!z17) {
            this.f313920n.a(str2);
        }
        com.p314xaae8f345.mm.ui.p2740x696c9db.w6 w6Var = this.f313914e;
        if (w6Var != null) {
            w6Var.a();
            this.f313914e = null;
        }
        com.p314xaae8f345.mm.ui.p2740x696c9db.w6 w6Var2 = new com.p314xaae8f345.mm.ui.p2740x696c9db.w6(this.f313913d);
        this.f313914e = w6Var2;
        w6Var2.f292413u = new dg5.j(this);
        w6Var2.f292414v = new dg5.k(this, z17, str);
        w6Var2.e();
        return false;
    }
}
