package re2;

/* loaded from: classes3.dex */
public final class o0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1481xaf3ea758.ActivityC14183x9ab478f1 f475992d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ az2.f f475993e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1481xaf3ea758.ActivityC14183x9ab478f1 activityC14183x9ab478f1, az2.f fVar) {
        super(1);
        this.f475992d = activityC14183x9ab478f1;
        this.f475993e = fVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        r45.nx0 it = (r45.nx0) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CoLiveInvitationConfirmUI", "acceptInvitation success, start prepare cgi");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1481xaf3ea758.ActivityC14183x9ab478f1 activityC14183x9ab478f1 = this.f475992d;
        activityC14183x9ab478f1.runOnUiThread(new re2.n0(activityC14183x9ab478f1, this.f475993e));
        return jz5.f0.f384359a;
    }
}
