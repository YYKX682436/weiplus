package d22;

/* loaded from: classes9.dex */
public final class a0 implements com.p314xaae8f345.mm.p944x882e457a.u0, h45.l {

    /* renamed from: d, reason: collision with root package name */
    public final d22.a f307357d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f307358e;

    /* renamed from: f, reason: collision with root package name */
    public android.app.ProgressDialog f307359f;

    /* renamed from: g, reason: collision with root package name */
    public z12.f f307360g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f307361h;

    public a0(d22.a rewardInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rewardInfo, "rewardInfo");
        this.f307357d = rewardInfo;
        this.f307358e = "MicroMsg.MMEmoticonRewardLiteAppLogic";
    }

    public final void a(boolean z17, int i17) {
        yz5.p pVar = this.f307357d.f307356g;
        if (pVar != null) {
            pVar.mo149xb9724478(java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(i17));
        }
    }

    public final void b(java.lang.String str) {
        android.content.Context context = this.f307357d.f307355f;
        db5.e1.y(context, str, null, context != null ? context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.by_) : null, d22.y.f307411d);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 scene) {
        java.lang.String string;
        java.lang.String string2;
        java.lang.String string3;
        android.app.ProgressDialog progressDialog;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scene, "scene");
        android.app.ProgressDialog progressDialog2 = this.f307359f;
        if ((progressDialog2 != null && progressDialog2.isShowing()) && (progressDialog = this.f307359f) != null) {
            progressDialog.dismiss();
        }
        int mo808xfb85f7b0 = scene.mo808xfb85f7b0();
        java.lang.String str2 = this.f307358e;
        if (mo808xfb85f7b0 != 830) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "unknown scene. type:%d", java.lang.Integer.valueOf(mo808xfb85f7b0));
            a(false, -1);
            return;
        }
        z12.f fVar = (z12.f) scene;
        d22.a aVar = this.f307357d;
        if (i17 == 0 && i18 == 0) {
            boolean mo24778x3c5fbb61 = ((h45.q) i95.n0.c(h45.q.class)).mo24778x3c5fbb61(((r45.fb) fVar.f550819d.f152244b.f152233a).f455695d);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "doEmojiReward, isSwitch2InWxAppPay:%b", java.lang.Boolean.valueOf(mo24778x3c5fbb61));
            if (mo24778x3c5fbb61) {
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putString("prepayId", ((r45.fb) fVar.f550819d.f152244b.f152233a).f455695d);
                bundle.putInt("payScene", 5);
                bundle.putInt("payChannel", 0);
                android.content.Context context = aVar.f307355f;
                bundle.putString("customSucTip", context != null ? context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.dtj) : null);
                ((h45.q) i95.n0.c(h45.q.class)).mo24807xf00c9308(this, bundle);
            } else {
                android.content.Context context2 = aVar.f307355f;
                dp.a.m125854x26a183b(context2, context2 != null ? context2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.byf) : null, 0).show();
                a(false, -1);
            }
        } else if (i17 == 4) {
            if (!this.f307361h) {
                this.f307361h = true;
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(12738, aVar.f307350a, java.lang.Integer.valueOf(aVar.f307353d), java.lang.Integer.valueOf(aVar.f307354e), 2);
            }
            if (i18 == 6) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(408L, 6L, 1L, false);
                if (str != null) {
                    b(str);
                } else {
                    android.content.Context context3 = aVar.f307355f;
                    if (context3 != null && (string3 = context3.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bzb)) != null) {
                        b(string3);
                    }
                }
            } else if (i18 == 7) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(408L, 7L, 1L, false);
                if (str != null) {
                    b(str);
                } else {
                    android.content.Context context4 = aVar.f307355f;
                    if (context4 != null && (string2 = context4.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bzd)) != null) {
                        b(string2);
                    }
                }
            } else if (i18 == 10) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(408L, 5L, 1L, false);
                if (str != null) {
                    b(str);
                } else {
                    android.content.Context context5 = aVar.f307355f;
                    if (context5 != null && (string = context5.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bzc)) != null) {
                        b(string);
                    }
                }
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(408L, 8L, 1L, false);
                android.content.Context context6 = aVar.f307355f;
                dp.a.m125854x26a183b(context6, context6 != null ? context6.getString(com.p314xaae8f345.mm.R.C30867xcad56011.byf) : null, 0).show();
            }
            a(false, -1);
        } else {
            if (!this.f307361h) {
                this.f307361h = true;
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(12738, aVar.f307350a, java.lang.Integer.valueOf(aVar.f307353d), java.lang.Integer.valueOf(aVar.f307354e), 2);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(408L, 8L, 1L, false);
            android.content.Context context7 = aVar.f307355f;
            dp.a.m125854x26a183b(context7, context7 != null ? context7.getString(com.p314xaae8f345.mm.R.C30867xcad56011.byf) : null, 0).show();
            a(false, -1);
        }
        gm0.j1.n().f354821b.q(830, this);
    }
}
