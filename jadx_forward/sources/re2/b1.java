package re2;

/* loaded from: classes2.dex */
public final class b1 implements ek2.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f475896a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f475897b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yz5.l f475898c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.p f475899d;

    public b1(long j17, int i17, yz5.l lVar, yz5.p pVar) {
        this.f475896a = j17;
        this.f475897b = i17;
        this.f475898c = lVar;
        this.f475899d = pVar;
    }

    @Override // ek2.p
    public void a(int i17, int i18, java.lang.String str, r45.nx0 resp) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        int i19 = this.f475897b;
        long j17 = this.f475896a;
        if (i17 == 0 && i18 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CoLiveRequestHelper", "inviteManage success: invitationId=" + j17 + ", actionType=" + i19);
            yz5.l lVar = this.f475898c;
            if (lVar != null) {
                lVar.mo146xb9724478(resp);
                return;
            }
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.CoLiveRequestHelper", "inviteManage failed: invitationId=" + j17 + ", actionType=" + i19 + ", errType=" + i17 + ", errCode=" + i18 + ", errMsg=" + str);
        yz5.p pVar = this.f475899d;
        if (pVar != null) {
            pVar.mo149xb9724478(java.lang.Integer.valueOf(i18), str);
        }
    }
}
