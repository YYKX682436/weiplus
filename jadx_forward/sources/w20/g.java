package w20;

/* loaded from: classes9.dex */
public final class g extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f523817e = {l75.n0.m145250x3fdc6f77(w20.f.f523816t, "EcsConversationRecord")};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f523818d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(l75.k0 db6) {
        super(db6, w20.f.f523816t, "EcsConversationRecord", null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
        l75.e0 e0Var = w20.f.f523816t;
        this.f523818d = db6;
    }

    public final boolean D0(java.lang.String talker, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
        if (!J0(talker)) {
            w20.f fVar = new w20.f();
            fVar.f67778x114ef53e = talker;
            fVar.f67776xbdb2116c = i17;
            int i18 = h20.c.f359796a;
            fVar.f67775xc4d9c6fd = 0;
            boolean mo880xb970c2b9 = mo880xb970c2b9(fVar);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsConversationRecordStorage", "insertOrUpdateUnhandledCount, insert new, talker:" + talker + ", unhandled count:" + i17);
            return mo880xb970c2b9;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsConversationRecordStorage", "insertOrUpdateUnhandledCount, talker:" + talker + ", unhandled count:" + i17);
        boolean m145253xb158737d = m145253xb158737d("EcsConversationRecord", "UPDATE EcsConversationRecord SET ecsUnhandledGiftCount=" + i17 + " WHERE talker='" + talker + '\'');
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsConversationRecordStorage", "updateEcsUnhandledGiftCount, talker:" + talker + ", unhandled count:" + i17 + ", ret:" + m145253xb158737d);
        return m145253xb158737d;
    }

    public final boolean J0(java.lang.String talker) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
        w20.f fVar = new w20.f();
        fVar.f67778x114ef53e = talker;
        boolean z17 = get(fVar, new java.lang.String[0]);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsConversationRecordStorage", "recordExist, talker:" + talker + ", is exist:" + z17);
        return z17;
    }

    public final w20.f y0(java.lang.String talker) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
        w20.f fVar = new w20.f();
        fVar.f67778x114ef53e = talker;
        if (get(fVar, new java.lang.String[0])) {
            return fVar;
        }
        return null;
    }

    public final boolean z0(java.lang.String talker, int i17, int i18, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
        if (!J0(talker)) {
            w20.f fVar = new w20.f();
            fVar.f67778x114ef53e = talker;
            fVar.f67776xbdb2116c = i17;
            fVar.f67775xc4d9c6fd = i18;
            fVar.f67777x6d297bba = j17;
            boolean mo880xb970c2b9 = mo880xb970c2b9(fVar);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsConversationRecordStorage", "insert, talker:" + talker + ", unhandled count:" + i17 + ", red label type:" + i18 + ", last handle gift timestamp:" + j17);
            return mo880xb970c2b9;
        }
        boolean m145253xb158737d = m145253xb158737d("EcsConversationRecord", "UPDATE EcsConversationRecord SET ecsUnhandledGiftCount=" + i17 + ", ecsGiftRedLabelType=" + i18 + ", lastHandleEcsGiftTimeStampMs=" + j17 + " WHERE talker='" + talker + '\'');
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsConversationRecordStorage", "updateEcsUnhandledGiftCountAndRedLabelType, talker:" + talker + ", unhandled count:" + i17 + ", label type:" + i18 + ", last handle gift timestamp:" + j17 + ", ret:" + m145253xb158737d);
        return m145253xb158737d;
    }
}
