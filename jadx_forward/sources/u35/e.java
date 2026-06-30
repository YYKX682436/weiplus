package u35;

/* loaded from: classes5.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final u35.e f505969a = new u35.e();

    public final void a(long j17, java.lang.String sttVoiceSessionId, java.lang.String chatUsername, java.lang.String voiceId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sttVoiceSessionId, "sttVoiceSessionId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(chatUsername, "chatUsername");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(voiceId, "voiceId");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.QuickVoice2TxtReporter", "reportCancel sessionId:%s, chatUsername:%s, voiceId:%s, duration:%s", sttVoiceSessionId, chatUsername, voiceId, java.lang.Long.valueOf(j17));
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("cancel_diff_duration_ms", java.lang.Long.valueOf(j17));
        hashMap.put("stt_voice_session_id", sttVoiceSessionId);
        hashMap.put("chat_username", chatUsername);
        hashMap.put("voiceid", voiceId);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("sst_long_press_cancel", hashMap, 35963);
    }

    public final void b(java.lang.String sttVoiceSessionId, java.lang.String chatUsername, int i17, int i18, java.lang.String voiceId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sttVoiceSessionId, "sttVoiceSessionId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(chatUsername, "chatUsername");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(voiceId, "voiceId");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.QuickVoice2TxtReporter", "reportError sessionId:%s, chatUsername:%s, voiceId:%s, errReason:%s, textCnt:%s", sttVoiceSessionId, chatUsername, voiceId, java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i17));
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("stt_voice_session_id", sttVoiceSessionId);
        hashMap.put("chat_username", chatUsername);
        hashMap.put("text_utf8_cnt", java.lang.Integer.valueOf(i17));
        hashMap.put("sst_err_reason", java.lang.Integer.valueOf(i18));
        hashMap.put("voiceid", voiceId);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("sst_long_press_error", hashMap, 35963);
    }

    public final void c(int i17, java.lang.String sttVoiceSessionId, java.lang.String chatUsername, long j17, long j18, java.lang.String voiceId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sttVoiceSessionId, "sttVoiceSessionId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(chatUsername, "chatUsername");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(voiceId, "voiceId");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.QuickVoice2TxtReporter", "reportSend sessionId:%s, chatUsername:%s, voiceId:%s, textCnt:%s, duration:%s, msgSvrId:%s", sttVoiceSessionId, chatUsername, voiceId, java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18));
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("text_utf8_cnt", java.lang.Integer.valueOf(i17));
        hashMap.put("stt_voice_session_id", sttVoiceSessionId);
        hashMap.put("chat_username", chatUsername);
        hashMap.put("voice_duration_ms", java.lang.Long.valueOf(j17));
        hashMap.put("msgsvrid", java.lang.Long.valueOf(j18));
        hashMap.put("voiceid", voiceId);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("sst_long_press_send", hashMap, 35963);
    }
}
