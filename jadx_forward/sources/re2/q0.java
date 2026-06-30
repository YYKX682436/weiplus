package re2;

/* loaded from: classes3.dex */
public final class q0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1481xaf3ea758.ActivityC14183x9ab478f1 f476008d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ az2.f f476009e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1481xaf3ea758.ActivityC14183x9ab478f1 activityC14183x9ab478f1, az2.f fVar) {
        super(4);
        this.f476008d = activityC14183x9ab478f1;
        this.f476009e = fVar;
    }

    @Override // yz5.r
    public java.lang.Object C(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        int intValue = ((java.lang.Number) obj).intValue();
        java.lang.String str = (java.lang.String) obj2;
        int intValue2 = ((java.lang.Number) obj3).intValue();
        java.lang.String str2 = (java.lang.String) obj4;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.CoLiveInvitationConfirmUI", "acceptInvitation failed: errCode=" + intValue + ", errMsg=" + str + ", userFlag=" + intValue2 + ", spamJumpUrl=" + str2);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1481xaf3ea758.ActivityC14183x9ab478f1 activityC14183x9ab478f1 = this.f476008d;
        activityC14183x9ab478f1.runOnUiThread(new re2.p0(this.f476009e, activityC14183x9ab478f1, intValue, str, intValue2, str2));
        return jz5.f0.f384359a;
    }
}
