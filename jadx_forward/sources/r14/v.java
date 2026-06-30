package r14;

/* loaded from: classes9.dex */
public final class v implements com.p314xaae8f345.mm.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r14.y f450162d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f450163e;

    public v(r14.y yVar, java.lang.String str) {
        this.f450162d = yVar;
        this.f450163e = str;
    }

    @Override // com.p314xaae8f345.mm.ui.xc
    /* renamed from: mmOnActivityResult */
    public final void mo9729x757c998b(int i17, int i18, android.content.Intent intent) {
        if (i18 == -1 && intent != null && i17 == 1) {
            r14.y yVar = this.f450162d;
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = yVar.f450166a;
            java.lang.String str = this.f450163e;
            yVar.getClass();
            java.lang.String stringExtra = intent.getStringExtra("Select_Conv_User");
            if (stringExtra == null) {
                stringExtra = "";
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 Q = db5.e1.Q(abstractActivityC21394xb3d2c0cf, "", abstractActivityC21394xb3d2c0cf.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574235hi3), true, false, null);
            java.lang.String stringExtra2 = intent.getStringExtra("custom_send_text");
            for (java.lang.String str2 : r26.n0.f0(stringExtra, new java.lang.String[]{","}, false, 0, 6, null)) {
                k70.i0 i0Var = new k70.i0();
                i0Var.f386175a = 4;
                java.lang.String r17 = c01.z1.r();
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                r70.g gVar = new r70.g(str, 0, r17 == null ? "" : r17, str2 == null ? "" : str2, i0Var);
                gVar.f474641j = "qrcode_send_img";
                ((v70.w) ((xs.d1) i95.n0.c(xs.d1.class))).nj(gVar);
                ((dk5.s5) tg3.t1.a()).Ui(stringExtra2, str2);
            }
            if (Q != null) {
                Q.dismiss();
            }
        }
    }
}
