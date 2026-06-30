package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d;

@db5.a(m123858x6ac9171 = 19)
@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/wallet_core/id_verify/RealnameVerifySelectGuardianUI;", "Lcom/tencent/mm/ui/contact/MMBaseSelectContactUI;", "<init>", "()V", "com/tencent/mm/plugin/wallet_core/id_verify/x", "com/tencent/mm/plugin/wallet_core/id_verify/c0", "plugin-wxpay_release"}, k = 1, mv = {1, 9, 0})
@ul5.d(m168215x6ac9171 = 0)
/* renamed from: com.tencent.mm.plugin.wallet_core.id_verify.RealnameVerifySelectGuardianUI */
/* loaded from: classes9.dex */
public final class ActivityC19073xb523d43 extends com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47 {
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.x E = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.x(null);
    public final java.util.ArrayList C;
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.c0 D;

    public ActivityC19073xb523d43() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.C = arrayList;
        this.D = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.c0();
        java.util.HashSet hashSet = new java.util.HashSet();
        hashSet.addAll(com.p314xaae8f345.mm.ui.p2690x38b72420.i5.b());
        hashSet.addAll(c01.e2.i());
        hashSet.add(c01.z1.r());
        arrayList.addAll(hashSet);
    }

    public static final void w7(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.ActivityC19073xb523d43 activityC19073xb523d43, r45.yt5 yt5Var) {
        r45.nm6 nm6Var;
        java.lang.String str;
        activityC19073xb523d43.getClass();
        if (yt5Var != null && (str = yt5Var.f472888e) != null) {
            com.p314xaae8f345.mm.p2802xd031a825.ui.r1.V(activityC19073xb523d43.mo55332x76847179(), str, true);
        }
        if (yt5Var == null || (nm6Var = yt5Var.f472889f) == null) {
            return;
        }
        com.p314xaae8f345.mm.p2802xd031a825.ui.r1.b0(nm6Var.f463051d, nm6Var.f463052e, nm6Var.f463053f, com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46406xaf4081cb);
    }

    public static final java.lang.Boolean x7(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.ActivityC19073xb523d43 activityC19073xb523d43, java.lang.String str, java.lang.String str2) {
        activityC19073xb523d43.getClass();
        if (str == null) {
            return null;
        }
        if (!(str.length() > 0)) {
            str = null;
        }
        if (str == null) {
            return null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RealnameVerifySelectGuardianUI", "will send text message");
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5990xd50ae361 c5990xd50ae361 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5990xd50ae361();
        am.mt mtVar = c5990xd50ae361.f136285g;
        mtVar.f88895a = str2;
        mtVar.f88896b = str;
        mtVar.f88897c = 1;
        mtVar.f88898d = 0;
        return java.lang.Boolean.valueOf(c5990xd50ae361.e());
    }

    public static final void y7(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.ActivityC19073xb523d43 activityC19073xb523d43, r45.f7 f7Var) {
        activityC19073xb523d43.getClass();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(f7Var.f455603d)) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RealnameVerifySelectGuardianUI", "show alert: " + f7Var.f455603d);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC19073xb523d43.mo55332x76847179();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a aVar = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a();
        aVar.f293262s = f7Var.f455603d;
        r45.gq gqVar = f7Var.f455604e;
        if (gqVar != null) {
            aVar.f293266w = gqVar.f456999h;
            aVar.F = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.m0(activityC19073xb523d43, gqVar);
        }
        r45.gq gqVar2 = f7Var.f455605f;
        if (gqVar2 != null) {
            aVar.f293265v = gqVar2.f456999h;
            aVar.E = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.n0(activityC19073xb523d43, gqVar2);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0(mo55332x76847179, com.p314xaae8f345.mm.R.C30868x68b1db1.f576324wd);
        j0Var.e(aVar);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.d0 d0Var = aVar.f293256m;
        if (d0Var != null) {
            d0Var.a(j0Var.f293370r);
        }
        j0Var.show();
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        if (r4 == null) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void z7(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.ActivityC19073xb523d43 r3, java.lang.String r4) {
        /*
            androidx.appcompat.app.AppCompatActivity r0 = r3.mo55332x76847179()
            com.tencent.mm.ui.widget.dialog.a r1 = new com.tencent.mm.ui.widget.dialog.a
            r1.<init>()
            if (r4 == 0) goto L1a
            int r2 = r4.length()
            if (r2 <= 0) goto L13
            r2 = 1
            goto L14
        L13:
            r2 = 0
        L14:
            if (r2 == 0) goto L17
            goto L18
        L17:
            r4 = 0
        L18:
            if (r4 != 0) goto L26
        L1a:
            r4 = 2131779069(0x7f105dfd, float:1.9189685E38)
            java.lang.String r4 = r3.getString(r4)
            java.lang.String r3 = "getString(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r4, r3)
        L26:
            r1.f293262s = r4
            android.content.res.Resources r3 = of5.b.a(r0)
            r4 = 2131756213(0x7f1004b5, float:1.9143327E38)
            java.lang.String r3 = r3.getString(r4)
            r1.f293266w = r3
            com.tencent.mm.ui.widget.dialog.j0 r3 = new com.tencent.mm.ui.widget.dialog.j0
            r4 = 2131821911(0x7f110557, float:1.9276579E38)
            r3.<init>(r0, r4)
            r3.e(r1)
            com.tencent.mm.ui.widget.dialog.d0 r4 = r1.f293256m
            if (r4 == 0) goto L49
            android.widget.EditText r0 = r3.f293370r
            r4.a(r0)
        L49:
            r3.show()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.ActivityC19073xb523d43.z7(com.tencent.mm.plugin.wallet_core.id_verify.RealnameVerifySelectGuardianUI, java.lang.String):void");
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public void W6() {
        if (getIntent().getBooleanExtra("under_age_verify_from_liteapp", false)) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5873x7f10cbaa c5873x7f10cbaa = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5873x7f10cbaa();
            c5873x7f10cbaa.f136181g.f89177a = 0;
            c5873x7f10cbaa.e();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public com.p314xaae8f345.mm.ui.p2690x38b72420.a5 Z6() {
        rd0.j1 j1Var = (rd0.j1) i95.n0.c(rd0.j1.class);
        java.util.ArrayList arrayList = this.C;
        com.p314xaae8f345.mm.ui.p2690x38b72420.i0 i0Var = new com.p314xaae8f345.mm.ui.p2690x38b72420.i0();
        ((qd0.y0) j1Var).getClass();
        return new com.p314xaae8f345.mm.ui.p2690x38b72420.h0(this, arrayList, true, false, i0Var);
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public com.p314xaae8f345.mm.ui.p2690x38b72420.o4 a7() {
        return new com.p314xaae8f345.mm.ui.p2690x38b72420.f5(this, this.C, false, this.A);
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public int[] d7() {
        return new int[]{131072};
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public java.lang.String g7() {
        java.lang.String string = getString(com.p314xaae8f345.mm.R.C30867xcad56011.l4i);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        return string;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0051, code lost:
    
        if (r3 == null) goto L25;
     */
    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void h7(android.widget.AdapterView r2, android.view.View r3, int r4, long r5) {
        /*
            r1 = this;
            android.widget.ListView r2 = r1.f287979d
            int r2 = r2.getHeaderViewsCount()
            int r4 = r4 - r2
            if (r4 >= 0) goto La
            return
        La:
            com.tencent.mm.ui.contact.p4 r2 = r1.b7()
            com.tencent.mm.ui.contact.item.d r2 = r2.getItem(r4)
            if (r2 != 0) goto L15
            return
        L15:
            r3 = 2
            int r5 = r2.f288365a
            if (r5 == r3) goto L1b
            return
        L1b:
            java.lang.String r2 = r2.f288383s
            boolean r3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r2)
            if (r3 == 0) goto L37
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "empty username selected at "
            r2.<init>(r3)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "MicroMsg.RealnameVerifySelectGuardianUI"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r3, r2)
            return
        L37:
            android.content.Intent r3 = r1.getIntent()
            java.lang.String r4 = "under_age_msg_preview_text"
            java.lang.String r3 = r3.getStringExtra(r4)
            if (r3 == 0) goto L53
            int r4 = r3.length()
            if (r4 <= 0) goto L4c
            r4 = 1
            goto L4d
        L4c:
            r4 = 0
        L4d:
            if (r4 == 0) goto L50
            goto L51
        L50:
            r3 = 0
        L51:
            if (r3 != 0) goto L76
        L53:
            androidx.appcompat.app.AppCompatActivity r3 = r1.mo55332x76847179()
            java.lang.String r4 = "getContext(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r3, r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "["
            r4.<init>(r5)
            r5 = 2131780546(0x7f1063c2, float:1.919268E38)
            java.lang.String r3 = r3.getString(r5)
            r4.append(r3)
            r3 = 93
            r4.append(r3)
            java.lang.String r3 = r4.toString()
        L76:
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r3)
            java.lang.Class<o25.q1> r4 = o25.q1.class
            i95.m r4 = i95.n0.c(r4)
            o25.q1 r4 = (o25.q1) r4
            androidx.appcompat.app.AppCompatActivity r5 = r1.mo55332x76847179()
            r6 = 2131756280(0x7f1004f8, float:1.9143463E38)
            java.lang.String r6 = r1.getString(r6)
            com.tencent.mm.plugin.wallet_core.id_verify.e0 r0 = new com.tencent.mm.plugin.wallet_core.id_verify.e0
            r0.<init>(r1, r2)
            r35.k1 r4 = (r35.k1) r4
            r4.getClass()
            r35.i1 r4 = new r35.i1
            r4.<init>(r5)
            r4.l(r2)
            r4.i(r3)
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            r4.g(r2)
            r4.f450670d = r6
            r4.a(r0)
            com.tencent.mm.ui.widget.dialog.j0 r2 = r4.f450669c
            r2.show()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.ActivityC19073xb523d43.h7(android.widget.AdapterView, android.view.View, int, long):void");
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public boolean l7() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public boolean m7() {
        return true;
    }
}
