package dk5;

/* loaded from: classes9.dex */
public class c1 implements g35.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ot0.q f316069a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ot0.q f316070b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f316071c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ byte[] f316072d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22567x42e895b8 f316073e;

    public c1(com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22567x42e895b8 activityC22567x42e895b8, ot0.q qVar, ot0.q qVar2, java.lang.String str, byte[] bArr) {
        this.f316073e = activityC22567x42e895b8;
        this.f316069a = qVar;
        this.f316070b = qVar2;
        this.f316071c = str;
        this.f316072d = bArr;
    }

    @Override // g35.d
    public void a(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, long j17) {
        java.lang.String G1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.G1(str3);
        java.lang.String G12 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.G1(str4);
        ot0.q qVar = this.f316069a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgRetransmitUI", "summerbig CheckBigFile callback new, errMsg:[%s], md5[%s], aesKey[%s], signature[%s], old aeskey[%s], faesKey[%s], fsignature[%s]", str, str2, G1, G12, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.G1(qVar.T), com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.G1(str5), com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.G1(str6));
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str4);
        com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22567x42e895b8 activityC22567x42e895b8 = this.f316073e;
        if (K0) {
            db5.e1.s(activityC22567x42e895b8, activityC22567x42e895b8.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bkr), "");
            activityC22567x42e895b8.finish();
        } else {
            java.lang.Object obj = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.k0.K(this.f316070b, qVar.f430179d, qVar.H, this.f316071c, "", this.f316072d, activityC22567x42e895b8.I, str4, "", com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5.f231012g).second;
            if (obj != null) {
                com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22567x42e895b8.O6(this.f316071c, (java.lang.Long) obj);
            }
        }
    }
}
