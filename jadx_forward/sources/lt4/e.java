package lt4;

/* loaded from: classes9.dex */
public class e extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.p2377x633fb29.C19166x1e10373b f402822d;

    public e() {
        super(0);
        this.f402822d = new com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.p2377x633fb29.C19166x1e10373b();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x0025. Please report as an issue. */
    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        boolean z17 = abstractC20979x809547d1 instanceof com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5587xf7a06bec;
        com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.p2377x633fb29.C19166x1e10373b c19166x1e10373b = this.f402822d;
        if (!z17) {
            if (abstractC20979x809547d1 instanceof com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5834xa4df3853) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5834xa4df3853 c5834xa4df3853 = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5834xa4df3853) abstractC20979x809547d1;
                c19166x1e10373b.getClass();
                com.p314xaae8f345.mm.p2802xd031a825.b.a().getClass();
                if (c19166x1e10373b.f262593g == null) {
                    c19166x1e10373b.f262593g = new java.util.LinkedList();
                }
                ((java.util.LinkedList) c19166x1e10373b.f262593g).offer(c5834xa4df3853);
                if (!com.p314xaae8f345.mm.sdk.p2600x5c6729a.d.f273903d.b(c19166x1e10373b)) {
                    c19166x1e10373b.mo48813x58998cd();
                }
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putInt("a8key_scene", c5834xa4df3853.f136141g.f87799b);
                am.bo boVar = c5834xa4df3853.f136141g;
                bundle.putString("qrcode_url", boVar.f87798a);
                bundle.putInt("channel", boVar.f87800c);
                bundle.putInt("chat_type", boVar.f87802e);
                bundle.putInt("send_type", boVar.f87803f);
                bundle.putInt("qrcode_session_type", boVar.f87804g);
                bundle.putString("qrcode_session_name", boVar.f87805h);
                bundle.putString("qrcode_timeline_objid", boVar.f87806i);
                bundle.putString("qrcodeSenderName", boVar.f87807j);
                java.lang.String str = boVar.f87808k;
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                    if (str.startsWith("msg_")) {
                        str = str.substring(4);
                    }
                    bundle.putString("qrcodeSenderMsgId", str);
                }
                java.lang.String str2 = boVar.f87809l;
                long j17 = boVar.f87810m;
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                    str2 = boVar.f87798a;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletGetA8KeyRedirectListener", "doAuthNative initRawUrl is empty, use qrcode_url as fallback");
                }
                if (j17 == 0) {
                    j17 = c01.id.a() / 1000;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletGetA8KeyRedirectListener", "doAuthNative initTimestamp is 0, use current timestamp as fallback");
                }
                bundle.putString("payInitRawUrl", str2 != null ? str2 : "");
                bundle.putLong("payInitTimestamp", j17);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletGetA8KeyRedirectListener", "doAuthNative initRawUrl: " + str2 + ", initTimestamp: " + j17);
                ((h45.q) i95.n0.c(h45.q.class)).mo24831x2a828efb(boVar.f87801d, bundle);
            }
            return false;
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5587xf7a06bec c5587xf7a06bec = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5587xf7a06bec) abstractC20979x809547d1;
        c19166x1e10373b.f262592f = c5587xf7a06bec;
        am.df dfVar = c5587xf7a06bec.f135909g;
        java.lang.String str3 = dfVar.f87980b;
        android.os.Bundle bundle2 = dfVar.f87982d;
        if (bundle2 != null) {
            c19166x1e10373b.f262591e = bundle2.getInt("pay_channel", 0);
        }
        switch (c19166x1e10373b.f262592f.f135909g.f87979a) {
            case 10:
            case 11:
                if (!com.p314xaae8f345.mm.sdk.p2600x5c6729a.d.f273903d.b(c19166x1e10373b)) {
                    c19166x1e10373b.mo48813x58998cd();
                }
                if (str3 != null) {
                    if (str3.startsWith("weixin://wxpay")) {
                        c19166x1e10373b.f262590d = 4;
                        gm0.j1.i();
                        gm0.j1.n().f354821b.a(com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p335x584fd04f.C2933x39866d30.f10095xfbb5a33d, c19166x1e10373b);
                        w60.j jVar = (w60.j) i95.n0.c(w60.j.class);
                        c19166x1e10373b.f262592f.f135909g.getClass();
                        java.lang.Object Ai = ((v60.u) jVar).Ai(str3, null, 4, 0, o45.cg.a(), new byte[0]);
                        gm0.j1.i();
                        gm0.j1.n().f354821b.g((com.p314xaae8f345.mm.p944x882e457a.m1) Ai);
                        c19166x1e10373b.f262594h = java.lang.System.currentTimeMillis();
                    } else {
                        c19166x1e10373b.f262590d = 1;
                        c19166x1e10373b.d(str3, c19166x1e10373b.f262591e);
                    }
                }
                return true;
            case 12:
                java.lang.String[] split = str3.replace(com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.p2377x633fb29.C19166x1e10373b.f262588i, "").split("&");
                java.lang.String str4 = null;
                java.lang.String str5 = null;
                java.lang.String str6 = null;
                for (java.lang.String str7 : split) {
                    if (str7.startsWith("errcode=")) {
                        str4 = str7.replace("errcode=", "");
                    } else if (str7.startsWith("errmsg=")) {
                        str6 = str7.replace("errmsg=", "");
                    } else if (str7.startsWith("importkey=")) {
                        str5 = str7.replace("importkey=", "");
                    }
                }
                if (!"0".equals(str4) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str5)) {
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str6)) {
                        str6 = ((android.content.Context) c19166x1e10373b.f262592f.f135909g.f87981c.get()).getString(com.p314xaae8f345.mm.R.C30867xcad56011.l0g);
                    }
                    db5.e1.t((android.content.Context) c19166x1e10373b.f262592f.f135909g.f87981c.get(), str6, "", new nt4.w(c19166x1e10373b));
                } else {
                    android.content.Context context = (android.content.Context) c19166x1e10373b.f262592f.f135909g.f87981c.get();
                    android.content.Intent intent = new android.content.Intent();
                    intent.putExtra("key_import_key", str5);
                    intent.putExtra("key_req_bind_scene", 2);
                    intent.putExtra("key_custom_bind_tips", (java.lang.String) null);
                    j45.l.j(context, "wallet", ".bind.ui.WalletBindUI", intent, null);
                    com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5587xf7a06bec c5587xf7a06bec2 = c19166x1e10373b.f262592f;
                    java.lang.Runnable runnable = c5587xf7a06bec2.f273897d;
                    if (runnable != null) {
                        c5587xf7a06bec2.f135910h.f88087a = 1;
                        runnable.run();
                    }
                }
                return true;
            default:
                return false;
        }
    }
}
