package zw1;

/* loaded from: classes8.dex */
public final class n6 {

    /* renamed from: a, reason: collision with root package name */
    public static final zw1.n6 f558277a = new zw1.n6();

    public static final void b(r45.mu5 mu5Var, java.lang.String str, android.content.Context context) {
        if (mu5Var == null || context == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WalletCollectQrCodeUIHelp", "navigateToBusinessQRCodePageForPersonal: saveSuccJumpInfo or context is null");
            return;
        }
        r45.vk4 vk4Var = mu5Var.f462371e;
        if ((vk4Var != null ? vk4Var.f469854h : null) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WalletCollectQrCodeUIHelp", "navigateToBusinessQRCodePageForPersonal: waapp_path is null");
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("navigateToBusinessQRCodePageForPersonal - username: ");
        r45.vk4 vk4Var2 = mu5Var.f462371e;
        sb6.append(vk4Var2 != null ? vk4Var2.f469853g : null);
        sb6.append(", path: ");
        r45.vk4 vk4Var3 = mu5Var.f462371e;
        sb6.append(vk4Var3 != null ? vk4Var3.f469854h : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletCollectQrCodeUIHelp", sb6.toString());
        l81.b1 b1Var = new l81.b1();
        r45.vk4 vk4Var4 = mu5Var.f462371e;
        b1Var.f398545a = vk4Var4 != null ? vk4Var4.f469853g : null;
        b1Var.f398555f = vk4Var4 != null ? vk4Var4.f469854h : null;
        b1Var.f398565k = 1001;
        b1Var.f398561i = new zw1.h6(str);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6 h6Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6.class);
        if (h6Var != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.xc) h6Var).bj(context, b1Var);
        }
    }

    public static final java.lang.String c(ww1.a3 a3Var) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        java.lang.String str = a3Var != null ? a3Var.f531632i : null;
        if (str == null) {
            str = "";
        }
        jSONObject.put("key_collect_pay_url", str);
        jSONObject.put("key_collect_fee", a3Var != null ? java.lang.Double.valueOf(a3Var.f531634k) : null);
        java.lang.String str2 = a3Var != null ? a3Var.f531635l : null;
        if (str2 == null) {
            str2 = "";
        }
        jSONObject.put("key_collect_fee_type", str2);
        java.lang.String str3 = a3Var != null ? a3Var.f531636m : null;
        if (str3 == null) {
            str3 = "";
        }
        jSONObject.put("key_collect_fee_desc", str3);
        jSONObject.put("key_collect_error_level", a3Var != null ? java.lang.Integer.valueOf(a3Var.f531639p) : null);
        java.lang.String str4 = a3Var != null ? a3Var.f531640q : null;
        if (str4 == null) {
            str4 = "";
        }
        jSONObject.put("key_collect_currenct_unit", str4);
        jSONObject.put("key_collect_desc_required", a3Var != null ? java.lang.Boolean.valueOf(a3Var.f531638o) : null);
        java.lang.String str5 = a3Var != null ? a3Var.f531637n : null;
        if (str5 == null) {
            str5 = "";
        }
        jSONObject.put("key_collect_fee_desc_placeholder", str5);
        java.lang.String jSONObject2 = jSONObject.toString();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletCollectQrCodeUIHelp", "Parsed extra data: " + jSONObject2);
        return jSONObject2 == null ? "" : jSONObject2;
    }

    public final r45.i34 a(ww1.a3 a3Var) {
        r45.fk5 fk5Var;
        java.lang.Object obj;
        r45.fk5 fk5Var2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletCollectQrCodeUIHelp", "getCurrentJumpInfo");
        if (a3Var != null && !a3Var.T) {
            r45.fk5 fk5Var3 = a3Var.f531624b0;
            if (fk5Var3 != null) {
                return fk5Var3.f455946e;
            }
            return null;
        }
        java.lang.Long valueOf = a3Var != null ? java.lang.Long.valueOf(a3Var.U) : null;
        java.util.LinkedList linkedList = (a3Var == null || (fk5Var2 = a3Var.f531624b0) == null) ? null : fk5Var2.f455947f;
        if (linkedList != null) {
            java.util.Iterator it = linkedList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (valueOf != null && ((r45.i34) obj).f458232d == valueOf.longValue()) {
                    break;
                }
            }
            r45.i34 i34Var = (r45.i34) obj;
            if (i34Var != null) {
                return i34Var;
            }
        }
        if (a3Var == null || (fk5Var = a3Var.f531624b0) == null) {
            return null;
        }
        return fk5Var.f455946e;
    }
}
