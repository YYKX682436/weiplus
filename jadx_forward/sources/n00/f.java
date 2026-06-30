package n00;

/* loaded from: classes8.dex */
public final class f extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f415352e = {l75.n0.m145250x3fdc6f77(n00.e.f415351z, "EcsGiftMsgRecord")};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f415353d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(l75.k0 db6) {
        super(db6, n00.e.f415351z, "EcsGiftMsgRecord", null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
        l75.e0 e0Var = n00.e.f415351z;
        this.f415353d = db6;
    }

    public final boolean D0(java.lang.String giftMsgId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(giftMsgId, "giftMsgId");
        n00.e eVar = new n00.e();
        eVar.f67881xbba2e427 = giftMsgId;
        boolean z17 = get(eVar, new java.lang.String[0]);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsGiftMsgRecordStorage", "recordExist giftMsgId:" + giftMsgId + " had:" + z17);
        return z17;
    }

    public final boolean J0(java.lang.String giftMsgId, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(giftMsgId, "giftMsgId");
        java.lang.String str = "UPDATE EcsGiftMsgRecord SET hasMsgClicked=" + (z17 ? 1 : 0) + " WHERE giftMsgId='" + giftMsgId + '\'';
        boolean m145253xb158737d = m145253xb158737d("EcsGiftMsgRecord", str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsGiftMsgRecordStorage", "updateHasMsgClicked giftMsgId:" + giftMsgId + " hasMsgClicked:" + z17 + " ret:" + m145253xb158737d + " sql:" + str);
        return m145253xb158737d;
    }

    public final n00.e y0(java.lang.String giftMsgId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(giftMsgId, "giftMsgId");
        n00.e eVar = new n00.e();
        eVar.f67881xbba2e427 = giftMsgId;
        get(eVar, new java.lang.String[0]);
        return eVar;
    }

    public final boolean z0(java.lang.String giftMsgId, long j17, java.lang.String talker, boolean z17, java.lang.String appMsgSign, boolean z18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(giftMsgId, "giftMsgId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appMsgSign, "appMsgSign");
        n00.e eVar = new n00.e();
        eVar.f67881xbba2e427 = giftMsgId;
        eVar.f67884x9a279b8a = j17;
        eVar.f67885x3e123854 = talker;
        eVar.f67882xa281e91b = z17;
        eVar.f67880x4cbf2be2 = appMsgSign;
        eVar.f67883xffb7180a = z18;
        boolean mo880xb970c2b9 = mo880xb970c2b9(eVar);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsGiftMsgRecordStorage", "insert giftMsgId:" + giftMsgId + " msgLocalId:" + j17 + " talker: " + talker + ", appMsgSign: " + appMsgSign + ", ret:" + mo880xb970c2b9);
        return mo880xb970c2b9;
    }
}
