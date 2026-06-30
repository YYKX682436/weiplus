package hr3;

/* loaded from: classes9.dex */
public class h7 extends hr3.d8 {
    public h7(android.content.Context context) {
        super(context, new hr3.d9(context));
        new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5620x496bfda4().e();
    }

    public static void c() {
        ((com.p314xaae8f345.mm.p2621x8fb0427b.g9) c01.d9.b().u()).J0("feedsapp");
        ((com.p314xaae8f345.mm.p2621x8fb0427b.m4) c01.d9.b().r()).k("feedsapp");
    }

    @Override // t25.a
    public boolean R(java.lang.String str) {
        boolean equals = "contact_info_plugin_view".equals(str);
        android.content.Context context = this.f365009d;
        if (equals) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("sns_timeline_NeedFirstLoadint", true);
            ((ee0.n4) ((fe0.k4) i95.n0.c(fe0.k4.class))).Vi(context, intent);
            return true;
        }
        if ("contact_info_plugin_outsize".equals(str)) {
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("k_sns_tag_id", 4L);
            j45.l.j(context, "sns", ".ui.SnsBlackDetailUI", intent2, null);
        }
        if ("contact_info_plugin_black".equals(str)) {
            android.content.Intent intent3 = new android.content.Intent();
            intent3.putExtra("k_sns_tag_id", 5L);
            j45.l.j(context, "sns", ".ui.SnsTagDetailUI", intent3, null);
        }
        if (str.equals("contact_info_plugin_uninstall")) {
            android.content.Context context2 = this.f365009d;
            db5.e1.A(context2, context2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.iwt), "", context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572100yp), context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), new hr3.g7(this), null);
            return true;
        }
        if ("contact_info_plugin_clear_data".equals(str)) {
            db5.e1.A(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bcu), "", context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571886sl), context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), new hr3.b8(this), null);
            return true;
        }
        if (str.equals("contact_info_plugin_install")) {
            a(true);
            return true;
        }
        if (str.equals("contact_info_plugin_uninstall")) {
            db5.e1.A(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.iws), "", context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571886sl), context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), new hr3.c8(this), null);
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ContactWidgetPlugin", "handleEvent : unexpected key = ".concat(str));
        return false;
    }

    @Override // hr3.d8
    public void a(boolean z17) {
        int i17 = z17 ? com.p314xaae8f345.mm.R.C30867xcad56011.iwq : com.p314xaae8f345.mm.R.C30867xcad56011.iww;
        android.content.Context context = this.f365009d;
        new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(new hr3.f7(z17, null, db5.e1.Q(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), context.getString(i17), true, true, null)), false).c(1500L, 1500L);
    }
}
