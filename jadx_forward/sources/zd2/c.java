package zd2;

/* loaded from: classes10.dex */
public final class c extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.q f553126d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f553127e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f553128f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f553129g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ byte[] f553130h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f553131i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1474xf20093b6.p1476x696c9db.C14174x3055276b f553132m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(yz5.q qVar, android.app.Activity activity, long j17, long j18, byte[] bArr, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1474xf20093b6.p1476x696c9db.C14174x3055276b c14174x3055276b, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f553126d = qVar;
        this.f553127e = activity;
        this.f553128f = j17;
        this.f553129g = j18;
        this.f553130h = bArr;
        this.f553131i = str;
        this.f553132m = c14174x3055276b;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new zd2.c(this.f553126d, this.f553127e, this.f553128f, this.f553129g, this.f553130h, this.f553131i, this.f553132m, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        zd2.c cVar = (zd2.c) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        cVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        yz5.q qVar = this.f553126d;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        java.lang.String str = "lottery_" + java.lang.System.currentTimeMillis();
        try {
            zd2.d.f553134b.put(str, qVar);
            android.content.Intent intent = new android.content.Intent();
            long j17 = this.f553128f;
            long j18 = this.f553129g;
            byte[] bArr = this.f553130h;
            java.lang.String str2 = this.f553131i;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1474xf20093b6.p1476x696c9db.C14174x3055276b c14174x3055276b = this.f553132m;
            intent.putExtra("KEY_PARAMS_LOTTERY_SOURCE", 0);
            intent.putExtra("KEY_PARAMS_LIVE_ID", j17);
            intent.putExtra("KEY_PARAMS_OBJECT_ID", j18);
            intent.putExtra("KEY_PARAMS_NONCE_ID", bArr);
            intent.putExtra("KEY_PARAMS_ANCHOR_USERNAME", str2);
            intent.putExtra("ai_prefill_request_id", str);
            intent.putExtra("ai_prefill_prize_type", c14174x3055276b.prizeType);
            intent.putExtra("ai_prefill_winner_count", c14174x3055276b.winnerCount);
            intent.putExtra("ai_prefill_attend_type", c14174x3055276b.attendType);
            intent.putExtra("ai_prefill_allow_repeat_win", c14174x3055276b.allowRepeatWin);
            java.lang.Integer num = c14174x3055276b.durationMinutes;
            if (num != null) {
                intent.putExtra("ai_prefill_duration_minutes", num.intValue());
            }
            java.lang.String str3 = c14174x3055276b.attendComment;
            if (str3 != null) {
                intent.putExtra("ai_prefill_attend_comment", str3);
            }
            java.lang.String str4 = c14174x3055276b.lotteryDescription;
            if (str4 != null) {
                intent.putExtra("ai_prefill_lottery_description", str4);
            }
            java.lang.Integer num2 = c14174x3055276b.claimType;
            if (num2 != null) {
                intent.putExtra("ai_prefill_claim_type", num2.intValue());
            }
            java.lang.String str5 = c14174x3055276b.claimRemindWording;
            if (str5 != null) {
                intent.putExtra("ai_prefill_claim_remind_wording", str5);
            }
            java.lang.Integer num3 = c14174x3055276b.giftDistributeType;
            if (num3 != null) {
                intent.putExtra("ai_prefill_gift_distribute_type", num3.intValue());
            }
            java.util.List<?> list = c14174x3055276b.giftItems;
            if (list != null) {
                intent.putExtra("ai_prefill_gift_items", zd2.d.d(zd2.d.f553133a, list));
            }
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) ((c61.ub) i95.n0.c(c61.ub.class))).sj(this.f553127e, intent, 1002);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.Live.AiAssistant.ToolLotteryCreate", "lotteryCreate: page opened, waiting for prefill result, requestId=" + str);
        } catch (java.lang.Exception e17) {
            zd2.d.f553134b.remove(str);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.Live.AiAssistant.ToolLotteryCreate", "lotteryCreate: failed: " + e17.getMessage());
            qVar.mo147xb9724478(java.lang.Boolean.FALSE, "{\"error\":\"" + e17.getMessage() + "\"}", new java.lang.Integer(1006));
        }
        return jz5.f0.f384359a;
    }
}
