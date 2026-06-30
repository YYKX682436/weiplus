package com.p314xaae8f345.mm.ui.p2646xfa354eeb;

@db5.a(m123858x6ac9171 = 19)
/* renamed from: com.tencent.mm.ui.bizchat.BizChatSelectConversationUI */
/* loaded from: classes11.dex */
public class ActivityC21588xa00d55fe extends com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47 implements r01.w2 {
    public static final /* synthetic */ int H = 0;
    public android.widget.TextView E;
    public s01.a0 F;
    public java.lang.String C = null;
    public int D = 0;
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 G = null;

    @Override // r01.w2
    public void K1(int i17, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.G;
        if (u3Var != null && u3Var.isShowing()) {
            this.G.dismiss();
            this.G = null;
        }
        if (m1Var.mo808xfb85f7b0() == 1355) {
            s01.h D0 = r01.q3.Ui().D0(((s01.g0) m1Var).H().f469533e.f459125d.f464618d);
            if (D0 == null) {
                dp.a.m125854x26a183b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, getString(com.p314xaae8f345.mm.R.C30867xcad56011.i3x), 0).show();
            } else {
                w7(this.C, D0.f69168x92559640, D0.f69171x736d1fa8);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public com.p314xaae8f345.mm.ui.p2690x38b72420.a5 Z6() {
        x7();
        return new hb5.c1(this, null, false, this.C);
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public com.p314xaae8f345.mm.ui.p2690x38b72420.o4 a7() {
        x7();
        return new com.p314xaae8f345.mm.ui.p2690x38b72420.b5(this, null, false, this.C);
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public java.lang.String g7() {
        tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
        java.lang.String str = this.C;
        ((sg3.a) v0Var).getClass();
        return c01.a2.e(str);
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public void h7(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        if (i17 < this.f287979d.getHeaderViewsCount()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizChatSelectConversationUI", "Click HeaderView position=%d", java.lang.Integer.valueOf(i17));
            return;
        }
        if (!(this.f287979d.getAdapter().getItem(i17) instanceof hb5.i)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BizChatSelectConversationUI", "Click HeaderView not BizChatConvDataItem");
            return;
        }
        hb5.i iVar = (hb5.i) this.f287979d.getAdapter().getItem(i17);
        if (iVar == null) {
            return;
        }
        java.lang.String str = iVar.f288352z;
        long j18 = iVar.D;
        if (str == null || j18 == -1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizChatSelectConversationUI", "onclick err userName:%s,bizChatId:%s", str, java.lang.Long.valueOf(j18));
        } else {
            w7(str, j18, iVar.f288351y);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public boolean l7() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public boolean m7() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onActivityResult(int r8, int r9, android.content.Intent r10) {
        /*
            r7 = this;
            super.onActivityResult(r8, r9, r10)
            r0 = -1
            if (r9 == r0) goto L7
            return
        L7:
            r9 = 1
            if (r8 == r9) goto Lb
            return
        Lb:
            java.lang.String r8 = "result_data"
            android.os.Bundle r8 = r10.getBundleExtra(r8)
            r10 = 0
            if (r8 == 0) goto L77
            java.lang.String r0 = "MicroMsg.BizChatSelectConversationUI"
            java.lang.String r1 = "bundle != null"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r1)
            java.lang.String r0 = "enterprise_members"
            java.lang.String r8 = r8.getString(r0)
            r45.j53 r0 = new r45.j53
            r0.<init>()
            s01.h r1 = new s01.h
            r1.<init>()
            s01.a0 r2 = r7.F
            r3 = 0
            if (r2 == 0) goto L33
            java.lang.String r2 = r2.f65834x53f3fff9
            goto L34
        L33:
            r2 = r3
        L34:
            r1.f69166x53f3fff9 = r2
            java.lang.String r2 = r7.C
            r1.f69170x75756b18 = r2
            boolean r8 = s01.r.a(r1, r8, r3, r0)
            if (r8 == 0) goto L77
            long r2 = r1.f69168x92559640
            r4 = -1
            int r8 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r8 == 0) goto L50
            java.lang.String r8 = r7.C
            java.lang.String r0 = r1.f69171x736d1fa8
            r7.w7(r8, r2, r0)
            goto L78
        L50:
            s01.y r8 = r01.q3.Ni()
            java.lang.String r1 = r7.C
            s01.g0 r8 = r8.e(r1, r0, r7)
            r0 = 2131756315(0x7f10051b, float:1.9143534E38)
            java.lang.String r2 = r7.getString(r0)
            r0 = 2131755233(0x7f1000e1, float:1.914134E38)
            java.lang.String r3 = r7.getString(r0)
            r4 = 1
            r5 = 1
            hb5.p0 r6 = new hb5.p0
            r6.<init>(r7, r8)
            r1 = r7
            com.tencent.mm.ui.widget.dialog.u3 r8 = db5.e1.Q(r1, r2, r3, r4, r5, r6)
            r7.G = r8
            goto L78
        L77:
            r9 = r10
        L78:
            if (r9 != 0) goto L88
            r8 = 2131774416(0x7f104bd0, float:1.9180247E38)
            java.lang.String r8 = r7.getString(r8)
            android.widget.Toast r8 = dp.a.m125854x26a183b(r7, r8, r10)
            r8.show()
        L88:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2646xfa354eeb.ActivityC21588xa00d55fe.onActivityResult(int, int, android.content.Intent):void");
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        s01.a0 a0Var;
        super.onCreate(bundle);
        this.D = getIntent().getIntExtra("biz_chat_scene", 1);
        x7();
        java.lang.String z07 = r01.q3.Vi().z0(this.C);
        s01.a0 y07 = r01.q3.Vi().y0(z07);
        this.F = y07;
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = this.C;
        objArr[1] = z07;
        objArr[2] = java.lang.Boolean.valueOf(y07 == null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizChatSelectConversationUI", "updateBizChatMyUserInfo: %s:%s,myBizChatUserInfo is null:%s", objArr);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(z07) || (a0Var = this.F) == null || a0Var.u0() || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.F.f65834x53f3fff9)) {
            r01.q3.Ni().h(this.C, this);
            this.G = db5.e1.Q(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572137zq), true, true, new hb5.q0(this));
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public void p7() {
        super.p7();
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public void r7(android.widget.ListView listView, int i17) {
        if (this.E == null) {
            hb5.l0 l0Var = new hb5.l0(this);
            java.lang.String string = getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574495ig4);
            android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(this).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bik, (android.view.ViewGroup) null);
            inflate.setOnClickListener(l0Var);
            android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f565464ci2);
            textView.setText(string);
            listView.addHeaderView(inflate);
            this.E = textView;
        }
        this.E.setVisibility(i17);
    }

    public final void w7(java.lang.String str, long j17, java.lang.CharSequence charSequence) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizChatSelectConversationUI", "doClickUser=%s", str);
        int i17 = this.D;
        if (i17 != 2) {
            if (i17 == 1) {
                java.util.HashMap hashMap = (java.util.HashMap) getIntent().getSerializableExtra("enterprise_extra_params");
                r35.j1.j(mo78514x143f1b92(), (java.lang.String) hashMap.get(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28), (java.lang.String) hashMap.get("img_url"), (java.lang.String) hashMap.get("desc"), null, true, getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572084ya), new hb5.o0(this, str, j17));
                return;
            }
            return;
        }
        if (getIntent().getBooleanExtra("enterprise_extra_params", true)) {
            r35.j1.s(this.f39322x2305be9, j17, getString(com.p314xaae8f345.mm.R.C30867xcad56011.i28), ((java.lang.Object) charSequence) + "", null, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572084ya), new hb5.m0(this, str, j17));
            return;
        }
        r35.j1.s(this.f39322x2305be9, j17, getString(com.p314xaae8f345.mm.R.C30867xcad56011.i28), ((java.lang.Object) charSequence) + "", null, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572084ya), new hb5.n0(this, str, j17));
    }

    public final void x7() {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.C)) {
            java.lang.String stringExtra = getIntent().getStringExtra("enterprise_biz_name");
            this.C = stringExtra;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BizChatSelectConversationUI", "brandUserName is null");
                finish();
            }
        }
    }
}
