package f93;

/* loaded from: classes11.dex */
public class g1 extends com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ActivityC16168xac76ee12 f341874a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ActivityC16168xac76ee12 activityC16168xac76ee12, android.os.Looper looper) {
        super(looper);
        this.f341874a = activityC16168xac76ee12;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.n3
    /* renamed from: handleMessage */
    public void mo1038x5b586cbf(android.os.Message message) {
        int i17 = message.what;
        if (i17 == 6001) {
            int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ActivityC16168xac76ee12.I;
            this.f341874a.b7();
        } else if (i17 != 6002) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Label.ContactLabelEditUI", "unknow message. what is:%d", java.lang.Integer.valueOf(i17));
        } else {
            ((com.p314xaae8f345.mm.app.o7) ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi()).Zi();
        }
    }
}
