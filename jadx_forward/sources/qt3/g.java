package qt3;

/* loaded from: classes10.dex */
public class g implements ut3.d, ut3.b {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f448174d;

    public g(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f448174d = "";
    }

    @Override // ut3.b
    public void a(android.content.Context context, android.content.Intent intent) {
        boolean z17;
        if (context == null || intent == null) {
            return;
        }
        java.lang.String stringExtra = intent.getStringExtra("Select_Conv_User");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMRecordUI", "select %s for sending imagePath:%s", stringExtra, this.f448174d);
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        int i17 = 0;
        java.util.ArrayList P1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P1((java.lang.String[]) r26.n0.f0(stringExtra == null ? "" : stringExtra, new java.lang.String[]{","}, false, 0, 6, null).toArray(new java.lang.String[0]));
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 Q = db5.e1.Q(context, "", context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574235hi3), true, false, null);
        java.lang.String stringExtra2 = intent.getStringExtra("custom_send_text");
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_clear_c2c_tmp_file, true);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(P1);
        java.util.Iterator it = P1.iterator();
        while (true) {
            if (!it.hasNext()) {
                ((dk5.s5) tg3.t1.a()).Ui(stringExtra2, stringExtra);
                if (Q != null) {
                    Q.dismiss();
                }
                android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
                if (activity != null) {
                    activity.finish();
                    return;
                }
                return;
            }
            java.lang.Object next = it.next();
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            java.lang.String str = (java.lang.String) next;
            k70.i0 i0Var = new k70.i0();
            i0Var.f386175a = 4;
            java.lang.String str2 = this.f448174d;
            java.lang.String r17 = c01.z1.r();
            if (r17 == null) {
                r17 = "";
            }
            r70.g gVar = new r70.g(str2, 0, r17, str == null ? "" : str, i0Var);
            gVar.f474641j = "media_generate_send_img";
            ((v70.w) ((xs.d1) i95.n0.c(xs.d1.class))).nj(gVar);
            if (fj6) {
                z17 = true;
                if (i17 == P1.size() - 1) {
                    dw3.c0.f325715a.x(gVar.f474637f, this.f448174d);
                }
            } else {
                z17 = true;
            }
            i17 = i18;
        }
    }

    @Override // ut3.d
    public boolean c5(android.content.Context context, android.os.Bundle bundle, ut3.c cVar) {
        return false;
    }

    @Override // ut3.d
    public void k3(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16991x15ced046 c16991x15ced046, android.os.Bundle bundle) {
        if (context == null || c16991x15ced046 == null) {
            return;
        }
        android.view.LayoutInflater.from(context);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0(context, 1, false);
        db5.g4 g4Var = new db5.g4(context);
        new db5.g4(context);
        qt3.c cVar = new qt3.c(context);
        qt3.d dVar = new qt3.d(this, context, c16991x15ced046, bundle);
        g4Var.clear();
        db5.g4 g4Var2 = new db5.g4(context);
        cVar.mo887xc459429a(g4Var2);
        if (g4Var2.z()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MMSubMenuHelper", "show, menu empty");
        } else {
            k0Var.f293405n = cVar;
            k0Var.f293414s = dVar;
            k0Var.f293387d = null;
            k0Var.G = null;
            k0Var.v();
        }
        db5.e1.a(context, null);
    }

    @Override // ut3.b
    /* renamed from: onRestoreInstanceState */
    public void mo160885xb949e58d(android.os.Bundle bundle) {
        if (bundle != null) {
            java.lang.String string = bundle.getString("key_media_share_image_path");
            if (string == null) {
                string = "";
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string)) {
                return;
            }
            this.f448174d = string;
        }
    }

    @Override // ut3.b
    /* renamed from: onSaveInstanceState */
    public void mo160886xa71a2260(android.os.Bundle bundle) {
        if (bundle != null) {
            bundle.putString("key_media_share_image_path", this.f448174d);
        }
    }

    @Override // ut3.d
    public void r3(boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16994x3ba8255 c16994x3ba8255, android.os.Bundle bundle) {
    }
}
