package re2;

/* loaded from: classes2.dex */
public final class z0 implements ek2.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f476039a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.l f476040b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yz5.r f476041c;

    public z0(long j17, yz5.l lVar, yz5.r rVar) {
        this.f476039a = j17;
        this.f476040b = lVar;
        this.f476041c = rVar;
    }

    @Override // ek2.p
    public void a(int i17, int i18, java.lang.String str, r45.nx0 resp) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        long j17 = this.f476039a;
        if (i17 == 0 && i18 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CoLiveRequestHelper", "acceptInvitation success: invitationId=" + j17 + ", userFlag=" + resp.f463252d + ", spamJumpUrl=" + resp.f463253e);
            yz5.l lVar = this.f476040b;
            if (lVar != null) {
                lVar.mo146xb9724478(resp);
                return;
            }
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.CoLiveRequestHelper", "acceptInvitation failed: invitationId=" + j17 + ", errType=" + i17 + ", errCode=" + i18 + ", errMsg=" + str + ", userFlag=" + resp.f463252d + ", spamJumpUrl=" + resp.f463253e);
        yz5.r rVar = this.f476041c;
        if (rVar != null) {
            rVar.C(java.lang.Integer.valueOf(i18), str, java.lang.Integer.valueOf(resp.f463252d), resp.f463253e);
        }
    }
}
