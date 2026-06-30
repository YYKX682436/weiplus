package os3;

/* loaded from: classes8.dex */
public class h4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f429633d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f429634e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ os3.j4 f429635f;

    public h4(os3.j4 j4Var, android.os.Bundle bundle, java.lang.String str) {
        this.f429635f = j4Var;
        this.f429633d = bundle;
        this.f429634e = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v5 */
    @Override // java.lang.Runnable
    public void run() {
        os3.j4 j4Var = this.f429635f;
        j4Var.f429661d.f236462h.setVisibility(8);
        android.os.Bundle bundle = this.f429633d;
        int i17 = bundle.getInt("err_type");
        int i18 = bundle.getInt("err_code");
        java.lang.String string = bundle.getString("err_msg");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ReadMailUI", "mailId %s, errType %d, errCode %d, errMsg %s", this.f429634e, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), string);
        ?? r76 = 0;
        if (i17 != 0 || i18 != 0) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string)) {
                string = j4Var.f429661d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hke);
            }
            dp.a.m125854x26a183b(j4Var.f429661d, string, 1).show();
            j4Var.f429661d.f236463i.setVisibility(0);
            return;
        }
        ks3.b0 b0Var = j4Var.f429661d.f236460f;
        b0Var.getClass();
        b0Var.f393167i = bundle.getString("mail_content");
        b0Var.f393165g = bundle.getParcelableArrayList("mail_normal_attach");
        b0Var.f393166h = bundle.getParcelableArrayList("mail_big_attach");
        b0Var.f393168j = (android.os.Bundle) bundle.getParcelable("mail_cookie");
        java.lang.String str = j4Var.f429661d.f236460f.f393167i;
        java.lang.String str2 = "<html style=\"margin-top:" + com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.ViewOnCreateContextMenuListenerC16941x4db497e1.S + "px\">" + j4Var.f429661d.f236460f.f393167i + "</html>";
        j4Var.f429661d.f236461g.mo64581x9b341568(ks3.k0.c() + "?pageWidth=" + com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.ViewOnCreateContextMenuListenerC16941x4db497e1.R, str2, "text/html", com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6, null);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = j4Var.f429661d.f236460f.f393165g;
        if (arrayList2 != null) {
            arrayList.addAll(arrayList2);
        }
        java.util.ArrayList arrayList3 = j4Var.f429661d.f236460f.f393166h;
        if (arrayList3 != null) {
            arrayList3.forEach(new os3.C29938x5d1bb95());
            arrayList.addAll(j4Var.f429661d.f236460f.f393166h);
        }
        if (arrayList.isEmpty()) {
            j4Var.f429661d.f236472u.setVisibility(8);
        } else {
            j4Var.f429661d.f236472u.setVisibility(0);
            ((android.widget.TextView) j4Var.f429661d.findViewById(com.p314xaae8f345.mm.R.id.ljv)).setText(j4Var.f429661d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hro, java.lang.Integer.valueOf(arrayList.size())));
            j4Var.f429661d.f236473v.removeAllViews();
            com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.C16937x774df189 c16937x774df189 = j4Var.f429661d.f236473v;
            c16937x774df189.getClass();
            int i19 = 0;
            while (i19 < arrayList.size()) {
                android.view.View inflate = android.view.View.inflate(c16937x774df189.f236424d, com.p314xaae8f345.mm.R.C30864xbddafb2a.ccb, null);
                android.os.Bundle bundle2 = (android.os.Bundle) arrayList.get(i19);
                if (i19 == arrayList.size() - 1) {
                    inflate.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.ana);
                } else {
                    inflate.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.an_);
                }
                c16937x774df189.addView(inflate);
                java.lang.String string2 = bundle2.getString("attach_name", "");
                ((java.util.ArrayList) c16937x774df189.f236425e).add(string2);
                int i27 = bundle2.getInt("attach_size", r76);
                ((android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.ljx)).setText(string2);
                ((android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.ljz)).setText(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f0(i27));
                inflate.setOnClickListener(new os3.v2(c16937x774df189, string2, bundle2.getString("attach_fileId", ""), i27, bundle2.getString("attach_download_url", ""), bundle2.getBoolean("is_big_attach", r76)));
                ((android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.ljw)).setImageResource(o25.y.b(string2));
                i19++;
                r76 = 0;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.ViewOnCreateContextMenuListenerC16941x4db497e1 viewOnCreateContextMenuListenerC16941x4db497e1 = j4Var.f429661d;
        ks3.b0 b0Var2 = viewOnCreateContextMenuListenerC16941x4db497e1.f236460f;
        viewOnCreateContextMenuListenerC16941x4db497e1.getClass();
        com.p314xaae8f345.p3210x3857dc.d.g().c();
        if (b0Var2.f393168j == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ReadMailUI", "cookie is null");
            return;
        }
        com.p314xaae8f345.p3210x3857dc.d.g().b(ks3.k0.c(), "xm_skey=" + b0Var2.f393168j.getString("cookie_xmail_skey"));
        com.p314xaae8f345.p3210x3857dc.d.g().b(ks3.k0.c(), "xm_uin=" + b0Var2.f393168j.getLong("cookie_xmail_uin"));
        com.p314xaae8f345.p3210x3857dc.d.g().b(ks3.k0.c(), "xm_sid=" + b0Var2.f393168j.getString("cookie_xmail_sid"));
        com.p314xaae8f345.p3210x3857dc.d.g().mo120241x5d03b04();
    }
}
