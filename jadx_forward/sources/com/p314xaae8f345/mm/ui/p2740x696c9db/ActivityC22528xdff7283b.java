package com.p314xaae8f345.mm.ui.p2740x696c9db;

@db5.a(m123858x6ac9171 = 3)
/* renamed from: com.tencent.mm.ui.tools.ShareScreenToTimeLineUI */
/* loaded from: classes11.dex */
public class ActivityC22528xdff7283b extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f291709d = null;

    /* renamed from: e, reason: collision with root package name */
    public android.net.Uri f291710e = null;

    public final void T6() {
        dp.a.m125853x26a183b(this, com.p314xaae8f345.mm.R.C30867xcad56011.j4d, 1).show();
    }

    public final void U6(java.lang.String str, java.lang.String str2) {
        android.content.Intent intent = new android.content.Intent();
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            intent.putExtra("sns_kemdia_path", str);
            intent.putExtra("KFilterId", -1);
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            intent.putExtra("Kdescription", str2);
        }
        if (c01.d9.h() && !gm0.m.r()) {
            intent.putExtra("K_go_to_SnsTimeLineUI", true);
            j45.l.j(this, "sns", ".ui.SnsUploadUI", intent, null);
        } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            T6();
        } else {
            android.content.Intent intent2 = new android.content.Intent(this, (java.lang.Class<?>) com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22531x33ed18ef.class);
            intent2.putExtra("android.intent.extra.STREAM", com.p314xaae8f345.mm.sdk.p2603x2137b148.i1.b(mo55332x76847179(), new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a(str))));
            intent2.addFlags(32768).addFlags(268435456);
            intent2.setType("image/*");
            intent2.setAction("android.intent.action.SEND");
            com.p314xaae8f345.mm.ui.AbstractActivityC21409xdfe27f5a.Y6(this, new android.content.Intent(this, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11470xc22f6d8b.class).addFlags(32768).addFlags(268435456), intent2);
        }
        finish();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00e9, code lost:
    
        if ((!r2.a() ? false : r2.f294799a.F(r2.f294800b)) == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0188, code lost:
    
        if (r1 == false) goto L72;
     */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01cb  */
    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo43517x10010bd5() {
        /*
            Method dump skipped, instructions count: 478
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22528xdff7283b.mo43517x10010bd5():void");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo54450xbf7c1df6("");
        int g17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.g(getIntent(), "wizard_activity_result_code", 0);
        if (g17 == -1 || g17 == 0) {
            com.p314xaae8f345.mm.p642xad8b531f.C10296x7f15878.d();
            c01.d9.e().g(new c01.ra(new com.p314xaae8f345.mm.ui.p2740x696c9db.ca(this), null));
            mo43517x10010bd5();
        } else {
            if (g17 == 1) {
                finish();
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ShareScreenToTimeLineUI", "onCreate, should not reach here, resultCode = " + g17);
            finish();
        }
    }
}
