package b31;

/* loaded from: classes5.dex */
public final class l {

    /* renamed from: h, reason: collision with root package name */
    public static int f17620h;

    /* renamed from: i, reason: collision with root package name */
    public static long f17621i;

    /* renamed from: l, reason: collision with root package name */
    public static long f17624l;

    /* renamed from: a, reason: collision with root package name */
    public static final b31.l f17613a = new b31.l();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f17614b = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f17615c = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.ArrayList f17616d = new java.util.ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.ArrayList f17617e = new java.util.ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public static java.lang.String f17618f = "";

    /* renamed from: g, reason: collision with root package name */
    public static java.lang.String f17619g = "";

    /* renamed from: j, reason: collision with root package name */
    public static final com.tencent.mm.sdk.platformtools.r2 f17622j = new com.tencent.mm.sdk.platformtools.r2(100);

    /* renamed from: k, reason: collision with root package name */
    public static final com.tencent.mm.sdk.platformtools.r2 f17623k = new com.tencent.mm.sdk.platformtools.r2(100);

    /* renamed from: m, reason: collision with root package name */
    public static final jz5.g f17625m = jz5.h.b(b31.h.f17609d);

    public static final int b(java.lang.CharSequence charSequence) {
        java.lang.String obj = charSequence != null ? charSequence.toString() : null;
        if (obj == null) {
            obj = "";
        }
        if (obj.length() == 0) {
            return 0;
        }
        if (r26.n0.B(obj, "。", false) || r26.n0.B(obj, ".", false)) {
            return 1;
        }
        if (r26.n0.B(obj, "！", false) || r26.n0.B(obj, "!", false)) {
            return 2;
        }
        if (r26.n0.B(obj, "，", false) || r26.n0.B(obj, ",", false)) {
            return 3;
        }
        if (r26.n0.B(obj, "、", false)) {
            return 4;
        }
        if (r26.n0.B(obj, "；", false) || r26.n0.B(obj, ";", false)) {
            return 5;
        }
        if (r26.n0.B(obj, "：", false) || r26.n0.B(obj, ":", false)) {
            return 6;
        }
        return (r26.n0.B(obj, "？", false) || r26.n0.B(obj, "?", false)) ? 7 : 0;
    }

    public static final int c(java.lang.CharSequence charSequence) {
        java.lang.String obj = charSequence != null ? charSequence.toString() : null;
        if (obj == null) {
            obj = "";
        }
        if (obj.length() == 0) {
            return 0;
        }
        java.util.Iterator it = kz5.c0.i("唉", "啊", "哎", "哈", "喽", "哦", "啦", "嗯", "呐", "嘞", "嘛", "呢", "噢", "吧", "喂", "哇", "呀", "哟", "呵", "哼", "嘿", "呃", "呗", "呦", "诶", "吗").iterator();
        int i17 = 0;
        while (it.hasNext()) {
            i17++;
            if (r26.n0.B(obj, (java.lang.String) it.next(), false)) {
                return i17;
            }
        }
        return 0;
    }

    public final void a() {
        f17616d.clear();
        f17617e.clear();
        f17619g = "";
        f17620h = 0;
        f17621i = 0L;
    }

    public final void d(b31.e eVar, long j17, long j18) {
        java.lang.String str = eVar.f17603c;
        int i17 = eVar.f17601a;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        int i18 = eVar.f17604d;
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(i18);
        long j19 = eVar.f17606f;
        java.lang.Long valueOf3 = java.lang.Long.valueOf(j19);
        int i19 = eVar.f17605e;
        com.tencent.mars.xlog.Log.i("MicroMsg.VoiceInputReporter", "doStopReport voiceId:%s, startScene:%s, textCount:%s, recordLength:%s, stopType:%s, wifi:%s, cellular:%s", str, valueOf, valueOf2, valueOf3, java.lang.Integer.valueOf(i19), java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18));
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("view_id", "speech_to_text_button");
        hashMap.put("stt_trig_scenes", java.lang.Integer.valueOf(i17));
        hashMap.put("stt_text_cnt", java.lang.Integer.valueOf(i18));
        hashMap.put("chat_username", eVar.f17602b);
        hashMap.put("voiceid", eVar.f17603c);
        hashMap.put("stt_stop_type", java.lang.Integer.valueOf(i19));
        hashMap.put("stt_enter_ms", java.lang.Long.valueOf(j19));
        hashMap.put("stt_wifi_bytes", java.lang.Long.valueOf(j17));
        hashMap.put("stt_cellular_bytes", java.lang.Long.valueOf(j18));
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("stt_inputbox_success", hashMap, 35268);
    }

    public final void e(long j17, java.lang.String voiceId, long j18, long j19, long j27, int i17, int i18, java.util.Map map) {
        kotlin.jvm.internal.o.g(voiceId, "voiceId");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        linkedHashMap.put("stt_req", java.lang.Long.valueOf(j17));
        linkedHashMap.put("voiceid", voiceId);
        linkedHashMap.put("stt_click_ts", java.lang.Long.valueOf(j18));
        linkedHashMap.put("stt_req_return_ts", java.lang.Long.valueOf(j27));
        linkedHashMap.put("stt_req_send_ts", java.lang.Long.valueOf(j19));
        linkedHashMap.put("stt_req_text_cnt", java.lang.Integer.valueOf(i17));
        linkedHashMap.put("stt_trig_scenes", java.lang.Integer.valueOf(i18));
        if (map != null) {
            linkedHashMap.putAll(map);
        }
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("stt_req_return_end", linkedHashMap, 35963);
    }

    public final void f() {
        com.tencent.mars.xlog.Log.i("MicroMsg.VoiceInputReporter", "reportNetError");
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("view_id", "Abnormal_toast_exposure");
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("view_exp", hashMap, 35268);
    }

    public final void g(int i17, boolean z17, long j17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.VoiceInputReporter", "reportPullEndPacketFinish voiceId:%s, startScene:%s, pullPacketIntervalSet:%s, isPullPacket:%s, stopPullEndDuration:%s, sttEnterMs:%s", f17619g, java.lang.Integer.valueOf(f17620h), java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(z17), java.lang.Long.valueOf(j17), java.lang.Long.valueOf(f17621i));
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("voiceid", f17619g);
        hashMap.put("stt_trig_scenes", java.lang.Integer.valueOf(f17620h));
        hashMap.put("pull_packet_interval_set", java.lang.Integer.valueOf(i17));
        hashMap.put("is_pull_packet", java.lang.Integer.valueOf(z17 ? 1 : 0));
        hashMap.put("stop_pull_end_duration", java.lang.Long.valueOf(j17));
        hashMap.put("stt_enter_ms", java.lang.Long.valueOf(f17621i));
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("pull_end_packet_finish", hashMap, 35268);
    }

    public final void h(android.view.View voiceinputBtn, int i17, java.lang.String userName) {
        kotlin.jvm.internal.o.g(voiceinputBtn, "voiceinputBtn");
        kotlin.jvm.internal.o.g(userName, "userName");
        jz5.g gVar = f17625m;
        f17624l = ((com.tencent.mm.sdk.platformtools.o4) ((jz5.n) gVar).getValue()).getLong("lastExporeTime", 0L);
        if (java.lang.System.currentTimeMillis() - f17624l < 7200000) {
            return;
        }
        ((com.tencent.mm.sdk.platformtools.o4) ((jz5.n) gVar).getValue()).putLong("lastExporeTime", java.lang.System.currentTimeMillis());
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("view_id", "speech_to_text_button");
        hashMap.put("chat_username", userName);
        hashMap.put("stt_trig_scenes", java.lang.Integer.valueOf(i17));
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("view_exp", hashMap, 35268);
    }

    public final void i() {
        java.lang.String str = f17618f;
        if (str == null || r26.n0.N(str)) {
            return;
        }
        java.lang.String g07 = kz5.n0.g0(f17616d, "#", null, null, 0, null, b31.k.f17612d, 30, null);
        java.lang.String g08 = kz5.n0.g0(f17617e, "#", null, null, 0, null, b31.j.f17611d, 30, null);
        if (!(r26.n0.N(g07))) {
            f17622j.put(f17618f, g07);
        }
        if (r26.n0.N(g08)) {
            return;
        }
        f17623k.put(f17618f, g08);
    }
}
