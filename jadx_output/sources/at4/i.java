package at4;

/* loaded from: classes9.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    public static at4.i f13870a;

    public static at4.i a() {
        if (f13870a == null) {
            f13870a = new at4.i();
        }
        return f13870a;
    }

    public static com.tencent.mm.plugin.wallet_core.model.Bankcard b(r45.qv qvVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.BankcardParser", "parseFromBindQueryRecord %s", qvVar);
        com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard = new com.tencent.mm.plugin.wallet_core.model.Bankcard();
        try {
            bankcard.field_bankName = qvVar.f384268f;
            bankcard.field_bankcardTypeName = qvVar.P;
            bankcard.field_bankcardType = qvVar.f384270h;
            bankcard.field_bindSerial = qvVar.f384275o;
            boolean z17 = true;
            if (2 == com.tencent.mm.sdk.platformtools.t8.P(qvVar.f384271i, 2)) {
                bankcard.field_cardType |= 2;
            }
            if (!"NORMAL".equals(qvVar.D)) {
                bankcard.field_cardType |= 4;
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(qvVar.f384284v)) {
                bankcard.field_mobile = java.net.URLDecoder.decode(qvVar.f384284v.replaceAll("x", "%"), com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding);
            }
            bankcard.field_onceQuotaKind = com.tencent.mm.wallet_core.ui.r1.j(qvVar.f384289y, "100", 2, java.math.RoundingMode.HALF_UP);
            bankcard.field_onceQuotaVirtual = com.tencent.mm.wallet_core.ui.r1.j(qvVar.f384285w, "100", 2, java.math.RoundingMode.HALF_UP);
            bankcard.field_dayQuotaKind = com.tencent.mm.wallet_core.ui.r1.j(qvVar.f384282t, "100", 2, java.math.RoundingMode.HALF_UP);
            bankcard.field_dayQuotaVirtual = com.tencent.mm.wallet_core.ui.r1.j(qvVar.f384280r, "100", 2, java.math.RoundingMode.HALF_UP);
            bankcard.field_bankcardTail = qvVar.f384276p;
            java.lang.String str = qvVar.B;
            bankcard.field_forbidWord = str;
            bankcard.field_repay_url = qvVar.F;
            bankcard.field_wxcreditState = 2;
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                bankcard.field_bankcardState = 8;
            } else if (1 == com.tencent.mm.sdk.platformtools.t8.P(qvVar.f384283u, 0)) {
                bankcard.field_bankcardState = 1;
            } else if (com.tencent.mm.sdk.platformtools.t8.P(qvVar.f384267e, 1) == 0) {
                bankcard.field_bankcardState = 2;
            } else {
                bankcard.field_bankcardState = 0;
            }
            bankcard.field_bankPhone = qvVar.f384269g;
            bankcard.field_fetchArriveTime = com.tencent.mm.sdk.platformtools.t8.V(qvVar.f384265J, 0L) * 1000;
            bankcard.field_fetchArriveTimeWording = qvVar.X;
            int P = com.tencent.mm.sdk.platformtools.t8.P(qvVar.f384292z, 1);
            bankcard.field_bankcardTag = P;
            if (P == 2) {
                bankcard.field_cardType |= 1;
            }
            if (qvVar.G != 1) {
                z17 = false;
            }
            bankcard.field_support_micropay = z17;
            com.tencent.mars.xlog.Log.i("MicroMsg.BankcardParser", "getBalance() support_micropay:" + qvVar.G);
            bankcard.field_arrive_type = qvVar.R;
            bankcard.field_avail_save_wording = qvVar.T;
            int i17 = qvVar.Y;
            com.tencent.mars.xlog.Log.i("MicroMsg.BankcardParser", "fetch_charge_rate:" + i17);
            bankcard.field_fetch_charge_rate = ((double) i17) / 10000.0d;
            com.tencent.mars.xlog.Log.i("MicroMsg.BankcardParser", "field_fetch_charge_rate:" + bankcard.field_fetch_charge_rate);
            int i18 = qvVar.Z;
            com.tencent.mars.xlog.Log.i("MicroMsg.BankcardParser", "full_fetch_charge_fee:" + bankcard.field_full_fetch_charge_fee);
            bankcard.field_full_fetch_charge_fee = ((double) i18) / 100.0d;
            bankcard.field_fetch_charge_info = qvVar.f384277p0;
            bankcard.field_tips = qvVar.f384287x0;
            bankcard.field_forbid_title = qvVar.f384272l1;
            bankcard.field_forbid_url = qvVar.f384278p1;
            bankcard.field_no_micro_word = qvVar.S;
            bankcard.field_card_bottom_wording = qvVar.B1;
            bankcard.field_support_lqt_turn_in = qvVar.E1;
            bankcard.field_support_lqt_turn_out = qvVar.F1;
            bankcard.field_is_hightlight_pre_arrive_time_wording = qvVar.D1;
            r45.ae5 ae5Var = qvVar.J1;
            if (ae5Var != null) {
                bankcard.field_prompt_info_prompt_text = ae5Var.f369969d;
                bankcard.field_prompt_info_jump_text = ae5Var.f369970e;
                bankcard.field_prompt_info_jump_url = ae5Var.f369971f;
            }
            f(bankcard);
            return bankcard;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.BankcardParser", e17, "parseFromBindQueryRecord() error:" + e17.getMessage(), new java.lang.Object[0]);
            return null;
        }
    }

    public static void d(com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard, org.json.JSONObject jSONObject) {
        org.json.JSONObject optJSONObject = jSONObject.optJSONObject("minimch_info");
        if (optJSONObject != null) {
            bankcard.field_minimch_key = optJSONObject.optString("minimch_key");
            bankcard.field_minimch_avail_balance = optJSONObject.optLong("minimch_avail_balance");
            bankcard.field_minimch_user_state = optJSONObject.optInt("minimch_user_state");
            bankcard.field_minimch_system_state = optJSONObject.optInt("minimch_system_state");
            bankcard.field_minimch_ext_msg = optJSONObject.optString("minimch_ext_msg");
        }
    }

    public static void e(com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard, org.json.JSONObject jSONObject) {
        org.json.JSONObject optJSONObject = jSONObject.optJSONObject("yht_info");
        if (optJSONObject != null) {
            bankcard.field_yht_related_bank = optJSONObject.optString("yht_related_bank");
            bankcard.field_yht_avail_balance = optJSONObject.optLong("yht_avail_balance");
            bankcard.field_yht_system_state = optJSONObject.optInt("yht_system_state");
            bankcard.field_yht_user_state = optJSONObject.optInt("yht_user_state");
            bankcard.field_yht_ext_msg = optJSONObject.optString("yht_ext_msg");
        }
    }

    public static void f(com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard) {
        if (bankcard == null) {
            return;
        }
        if (bankcard.v0()) {
            bankcard.field_desc = bankcard.field_bankName;
            return;
        }
        if (bankcard.A0()) {
            bankcard.field_desc = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.kme, bankcard.f179569h3, com.tencent.mm.wallet_core.ui.r1.h(bankcard.f179566e3, 8));
            return;
        }
        if (bankcard.w0()) {
            bankcard.field_desc = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.kkj, bankcard.field_bankName, bankcard.field_bankcardTail);
            return;
        }
        if (bankcard.F0()) {
            bankcard.field_desc = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.l28, bankcard.field_bankName, bankcard.field_bankcardTail);
            return;
        }
        if (bankcard.z0()) {
            bankcard.field_desc = bankcard.f179575n3;
            return;
        }
        if (bankcard.field_bankcardType.equals("YHT")) {
            bankcard.field_desc = java.lang.String.format("%s(%s)", bankcard.field_bankName, bankcard.field_yht_ext_msg);
        } else if (bankcard.field_bankcardType.equals("MINIMCH")) {
            bankcard.field_desc = java.lang.String.format("%s(%s)", bankcard.field_bankName, bankcard.field_minimch_ext_msg);
        } else {
            bankcard.field_desc = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.kl9, bankcard.field_bankName, bankcard.field_bankcardTail);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0111 A[Catch: Exception -> 0x03c6, UnsupportedEncodingException -> 0x03e4, JSONException -> 0x0401, TryCatch #2 {UnsupportedEncodingException -> 0x03e4, JSONException -> 0x0401, Exception -> 0x03c6, blocks: (B:6:0x0026, B:10:0x0076, B:11:0x007b, B:13:0x008a, B:14:0x0090, B:16:0x009a, B:18:0x00a8, B:19:0x00f3, B:21:0x0111, B:22:0x0119, B:24:0x014d, B:25:0x0155, B:27:0x0178, B:28:0x0197, B:30:0x01a1, B:32:0x01af, B:33:0x01c7, B:37:0x0206, B:38:0x020c, B:40:0x0216, B:41:0x0219, B:43:0x0221, B:44:0x022f, B:46:0x0310, B:47:0x0328, B:49:0x0336, B:51:0x034e, B:53:0x0354, B:54:0x035c, B:56:0x0362, B:58:0x036e, B:60:0x037c, B:62:0x039c, B:64:0x03a2, B:65:0x03aa, B:67:0x03b0, B:69:0x03bc, B:73:0x0225, B:75:0x022d, B:77:0x017d, B:79:0x0186, B:80:0x0189, B:82:0x0191, B:83:0x0195), top: B:5:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x014d A[Catch: Exception -> 0x03c6, UnsupportedEncodingException -> 0x03e4, JSONException -> 0x0401, TryCatch #2 {UnsupportedEncodingException -> 0x03e4, JSONException -> 0x0401, Exception -> 0x03c6, blocks: (B:6:0x0026, B:10:0x0076, B:11:0x007b, B:13:0x008a, B:14:0x0090, B:16:0x009a, B:18:0x00a8, B:19:0x00f3, B:21:0x0111, B:22:0x0119, B:24:0x014d, B:25:0x0155, B:27:0x0178, B:28:0x0197, B:30:0x01a1, B:32:0x01af, B:33:0x01c7, B:37:0x0206, B:38:0x020c, B:40:0x0216, B:41:0x0219, B:43:0x0221, B:44:0x022f, B:46:0x0310, B:47:0x0328, B:49:0x0336, B:51:0x034e, B:53:0x0354, B:54:0x035c, B:56:0x0362, B:58:0x036e, B:60:0x037c, B:62:0x039c, B:64:0x03a2, B:65:0x03aa, B:67:0x03b0, B:69:0x03bc, B:73:0x0225, B:75:0x022d, B:77:0x017d, B:79:0x0186, B:80:0x0189, B:82:0x0191, B:83:0x0195), top: B:5:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0178 A[Catch: Exception -> 0x03c6, UnsupportedEncodingException -> 0x03e4, JSONException -> 0x0401, TryCatch #2 {UnsupportedEncodingException -> 0x03e4, JSONException -> 0x0401, Exception -> 0x03c6, blocks: (B:6:0x0026, B:10:0x0076, B:11:0x007b, B:13:0x008a, B:14:0x0090, B:16:0x009a, B:18:0x00a8, B:19:0x00f3, B:21:0x0111, B:22:0x0119, B:24:0x014d, B:25:0x0155, B:27:0x0178, B:28:0x0197, B:30:0x01a1, B:32:0x01af, B:33:0x01c7, B:37:0x0206, B:38:0x020c, B:40:0x0216, B:41:0x0219, B:43:0x0221, B:44:0x022f, B:46:0x0310, B:47:0x0328, B:49:0x0336, B:51:0x034e, B:53:0x0354, B:54:0x035c, B:56:0x0362, B:58:0x036e, B:60:0x037c, B:62:0x039c, B:64:0x03a2, B:65:0x03aa, B:67:0x03b0, B:69:0x03bc, B:73:0x0225, B:75:0x022d, B:77:0x017d, B:79:0x0186, B:80:0x0189, B:82:0x0191, B:83:0x0195), top: B:5:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01a1 A[Catch: Exception -> 0x03c6, UnsupportedEncodingException -> 0x03e4, JSONException -> 0x0401, TryCatch #2 {UnsupportedEncodingException -> 0x03e4, JSONException -> 0x0401, Exception -> 0x03c6, blocks: (B:6:0x0026, B:10:0x0076, B:11:0x007b, B:13:0x008a, B:14:0x0090, B:16:0x009a, B:18:0x00a8, B:19:0x00f3, B:21:0x0111, B:22:0x0119, B:24:0x014d, B:25:0x0155, B:27:0x0178, B:28:0x0197, B:30:0x01a1, B:32:0x01af, B:33:0x01c7, B:37:0x0206, B:38:0x020c, B:40:0x0216, B:41:0x0219, B:43:0x0221, B:44:0x022f, B:46:0x0310, B:47:0x0328, B:49:0x0336, B:51:0x034e, B:53:0x0354, B:54:0x035c, B:56:0x0362, B:58:0x036e, B:60:0x037c, B:62:0x039c, B:64:0x03a2, B:65:0x03aa, B:67:0x03b0, B:69:0x03bc, B:73:0x0225, B:75:0x022d, B:77:0x017d, B:79:0x0186, B:80:0x0189, B:82:0x0191, B:83:0x0195), top: B:5:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0206 A[Catch: Exception -> 0x03c6, UnsupportedEncodingException -> 0x03e4, JSONException -> 0x0401, TryCatch #2 {UnsupportedEncodingException -> 0x03e4, JSONException -> 0x0401, Exception -> 0x03c6, blocks: (B:6:0x0026, B:10:0x0076, B:11:0x007b, B:13:0x008a, B:14:0x0090, B:16:0x009a, B:18:0x00a8, B:19:0x00f3, B:21:0x0111, B:22:0x0119, B:24:0x014d, B:25:0x0155, B:27:0x0178, B:28:0x0197, B:30:0x01a1, B:32:0x01af, B:33:0x01c7, B:37:0x0206, B:38:0x020c, B:40:0x0216, B:41:0x0219, B:43:0x0221, B:44:0x022f, B:46:0x0310, B:47:0x0328, B:49:0x0336, B:51:0x034e, B:53:0x0354, B:54:0x035c, B:56:0x0362, B:58:0x036e, B:60:0x037c, B:62:0x039c, B:64:0x03a2, B:65:0x03aa, B:67:0x03b0, B:69:0x03bc, B:73:0x0225, B:75:0x022d, B:77:0x017d, B:79:0x0186, B:80:0x0189, B:82:0x0191, B:83:0x0195), top: B:5:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0216 A[Catch: Exception -> 0x03c6, UnsupportedEncodingException -> 0x03e4, JSONException -> 0x0401, TryCatch #2 {UnsupportedEncodingException -> 0x03e4, JSONException -> 0x0401, Exception -> 0x03c6, blocks: (B:6:0x0026, B:10:0x0076, B:11:0x007b, B:13:0x008a, B:14:0x0090, B:16:0x009a, B:18:0x00a8, B:19:0x00f3, B:21:0x0111, B:22:0x0119, B:24:0x014d, B:25:0x0155, B:27:0x0178, B:28:0x0197, B:30:0x01a1, B:32:0x01af, B:33:0x01c7, B:37:0x0206, B:38:0x020c, B:40:0x0216, B:41:0x0219, B:43:0x0221, B:44:0x022f, B:46:0x0310, B:47:0x0328, B:49:0x0336, B:51:0x034e, B:53:0x0354, B:54:0x035c, B:56:0x0362, B:58:0x036e, B:60:0x037c, B:62:0x039c, B:64:0x03a2, B:65:0x03aa, B:67:0x03b0, B:69:0x03bc, B:73:0x0225, B:75:0x022d, B:77:0x017d, B:79:0x0186, B:80:0x0189, B:82:0x0191, B:83:0x0195), top: B:5:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0221 A[Catch: Exception -> 0x03c6, UnsupportedEncodingException -> 0x03e4, JSONException -> 0x0401, TryCatch #2 {UnsupportedEncodingException -> 0x03e4, JSONException -> 0x0401, Exception -> 0x03c6, blocks: (B:6:0x0026, B:10:0x0076, B:11:0x007b, B:13:0x008a, B:14:0x0090, B:16:0x009a, B:18:0x00a8, B:19:0x00f3, B:21:0x0111, B:22:0x0119, B:24:0x014d, B:25:0x0155, B:27:0x0178, B:28:0x0197, B:30:0x01a1, B:32:0x01af, B:33:0x01c7, B:37:0x0206, B:38:0x020c, B:40:0x0216, B:41:0x0219, B:43:0x0221, B:44:0x022f, B:46:0x0310, B:47:0x0328, B:49:0x0336, B:51:0x034e, B:53:0x0354, B:54:0x035c, B:56:0x0362, B:58:0x036e, B:60:0x037c, B:62:0x039c, B:64:0x03a2, B:65:0x03aa, B:67:0x03b0, B:69:0x03bc, B:73:0x0225, B:75:0x022d, B:77:0x017d, B:79:0x0186, B:80:0x0189, B:82:0x0191, B:83:0x0195), top: B:5:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0310 A[Catch: Exception -> 0x03c6, UnsupportedEncodingException -> 0x03e4, JSONException -> 0x0401, TryCatch #2 {UnsupportedEncodingException -> 0x03e4, JSONException -> 0x0401, Exception -> 0x03c6, blocks: (B:6:0x0026, B:10:0x0076, B:11:0x007b, B:13:0x008a, B:14:0x0090, B:16:0x009a, B:18:0x00a8, B:19:0x00f3, B:21:0x0111, B:22:0x0119, B:24:0x014d, B:25:0x0155, B:27:0x0178, B:28:0x0197, B:30:0x01a1, B:32:0x01af, B:33:0x01c7, B:37:0x0206, B:38:0x020c, B:40:0x0216, B:41:0x0219, B:43:0x0221, B:44:0x022f, B:46:0x0310, B:47:0x0328, B:49:0x0336, B:51:0x034e, B:53:0x0354, B:54:0x035c, B:56:0x0362, B:58:0x036e, B:60:0x037c, B:62:0x039c, B:64:0x03a2, B:65:0x03aa, B:67:0x03b0, B:69:0x03bc, B:73:0x0225, B:75:0x022d, B:77:0x017d, B:79:0x0186, B:80:0x0189, B:82:0x0191, B:83:0x0195), top: B:5:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0336 A[Catch: Exception -> 0x03c6, UnsupportedEncodingException -> 0x03e4, JSONException -> 0x0401, TryCatch #2 {UnsupportedEncodingException -> 0x03e4, JSONException -> 0x0401, Exception -> 0x03c6, blocks: (B:6:0x0026, B:10:0x0076, B:11:0x007b, B:13:0x008a, B:14:0x0090, B:16:0x009a, B:18:0x00a8, B:19:0x00f3, B:21:0x0111, B:22:0x0119, B:24:0x014d, B:25:0x0155, B:27:0x0178, B:28:0x0197, B:30:0x01a1, B:32:0x01af, B:33:0x01c7, B:37:0x0206, B:38:0x020c, B:40:0x0216, B:41:0x0219, B:43:0x0221, B:44:0x022f, B:46:0x0310, B:47:0x0328, B:49:0x0336, B:51:0x034e, B:53:0x0354, B:54:0x035c, B:56:0x0362, B:58:0x036e, B:60:0x037c, B:62:0x039c, B:64:0x03a2, B:65:0x03aa, B:67:0x03b0, B:69:0x03bc, B:73:0x0225, B:75:0x022d, B:77:0x017d, B:79:0x0186, B:80:0x0189, B:82:0x0191, B:83:0x0195), top: B:5:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x037c A[Catch: Exception -> 0x03c6, UnsupportedEncodingException -> 0x03e4, JSONException -> 0x0401, TryCatch #2 {UnsupportedEncodingException -> 0x03e4, JSONException -> 0x0401, Exception -> 0x03c6, blocks: (B:6:0x0026, B:10:0x0076, B:11:0x007b, B:13:0x008a, B:14:0x0090, B:16:0x009a, B:18:0x00a8, B:19:0x00f3, B:21:0x0111, B:22:0x0119, B:24:0x014d, B:25:0x0155, B:27:0x0178, B:28:0x0197, B:30:0x01a1, B:32:0x01af, B:33:0x01c7, B:37:0x0206, B:38:0x020c, B:40:0x0216, B:41:0x0219, B:43:0x0221, B:44:0x022f, B:46:0x0310, B:47:0x0328, B:49:0x0336, B:51:0x034e, B:53:0x0354, B:54:0x035c, B:56:0x0362, B:58:0x036e, B:60:0x037c, B:62:0x039c, B:64:0x03a2, B:65:0x03aa, B:67:0x03b0, B:69:0x03bc, B:73:0x0225, B:75:0x022d, B:77:0x017d, B:79:0x0186, B:80:0x0189, B:82:0x0191, B:83:0x0195), top: B:5:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0225 A[Catch: Exception -> 0x03c6, UnsupportedEncodingException -> 0x03e4, JSONException -> 0x0401, TryCatch #2 {UnsupportedEncodingException -> 0x03e4, JSONException -> 0x0401, Exception -> 0x03c6, blocks: (B:6:0x0026, B:10:0x0076, B:11:0x007b, B:13:0x008a, B:14:0x0090, B:16:0x009a, B:18:0x00a8, B:19:0x00f3, B:21:0x0111, B:22:0x0119, B:24:0x014d, B:25:0x0155, B:27:0x0178, B:28:0x0197, B:30:0x01a1, B:32:0x01af, B:33:0x01c7, B:37:0x0206, B:38:0x020c, B:40:0x0216, B:41:0x0219, B:43:0x0221, B:44:0x022f, B:46:0x0310, B:47:0x0328, B:49:0x0336, B:51:0x034e, B:53:0x0354, B:54:0x035c, B:56:0x0362, B:58:0x036e, B:60:0x037c, B:62:0x039c, B:64:0x03a2, B:65:0x03aa, B:67:0x03b0, B:69:0x03bc, B:73:0x0225, B:75:0x022d, B:77:0x017d, B:79:0x0186, B:80:0x0189, B:82:0x0191, B:83:0x0195), top: B:5:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x017d A[Catch: Exception -> 0x03c6, UnsupportedEncodingException -> 0x03e4, JSONException -> 0x0401, TryCatch #2 {UnsupportedEncodingException -> 0x03e4, JSONException -> 0x0401, Exception -> 0x03c6, blocks: (B:6:0x0026, B:10:0x0076, B:11:0x007b, B:13:0x008a, B:14:0x0090, B:16:0x009a, B:18:0x00a8, B:19:0x00f3, B:21:0x0111, B:22:0x0119, B:24:0x014d, B:25:0x0155, B:27:0x0178, B:28:0x0197, B:30:0x01a1, B:32:0x01af, B:33:0x01c7, B:37:0x0206, B:38:0x020c, B:40:0x0216, B:41:0x0219, B:43:0x0221, B:44:0x022f, B:46:0x0310, B:47:0x0328, B:49:0x0336, B:51:0x034e, B:53:0x0354, B:54:0x035c, B:56:0x0362, B:58:0x036e, B:60:0x037c, B:62:0x039c, B:64:0x03a2, B:65:0x03aa, B:67:0x03b0, B:69:0x03bc, B:73:0x0225, B:75:0x022d, B:77:0x017d, B:79:0x0186, B:80:0x0189, B:82:0x0191, B:83:0x0195), top: B:5:0x0026 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.tencent.mm.plugin.wallet_core.model.Bankcard c(org.json.JSONObject r19) {
        /*
            Method dump skipped, instructions count: 1054
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: at4.i.c(org.json.JSONObject):com.tencent.mm.plugin.wallet_core.model.Bankcard");
    }
}
