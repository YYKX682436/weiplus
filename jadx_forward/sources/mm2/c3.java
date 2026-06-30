package mm2;

/* loaded from: classes3.dex */
public final class c3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gk2.e f410465d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f410466e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ mm2.o4 f410467f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.eh1 f410468g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ no0.a f410469h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c3(gk2.e eVar, java.lang.String str, mm2.o4 o4Var, r45.eh1 eh1Var, no0.a aVar) {
        super(1);
        this.f410465d = eVar;
        this.f410466e = str;
        this.f410467f = o4Var;
        this.f410468g = eh1Var;
        this.f410469h = aVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        java.util.HashMap hashMap = ((mm2.o4) this.f410465d.a(mm2.o4.class)).K;
        java.lang.String str = this.f410466e;
        java.lang.Integer num = (java.lang.Integer) hashMap.get(str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MMFinder.LiveLinkMicSlice", "receive accept audience mic msg  enterRoomResp: " + intValue + " linkState: " + num);
        if (num != null && num.intValue() == 3) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MMFinder.LiveLinkMicSlice", "seesionId:" + str + " has closed. skip this accept.");
        } else {
            mm2.o4 o4Var = this.f410467f;
            if (intValue >= 0) {
                ((b92.g1) ((c61.ac) i95.n0.c(c61.ac.class))).wi(o4Var.f410496d, this.f410468g.m75939xb282bd08(1));
                o4Var.H7(this.f410469h);
                ((b92.g1) ((c61.ac) i95.n0.c(c61.ac.class))).getClass();
                tn0.w0 w0Var = dk2.ef.f314911d;
                if (w0Var != null) {
                    w0Var.d0(false);
                }
                ((b92.g1) ((c61.ac) i95.n0.c(c61.ac.class))).getClass();
                tn0.w0 w0Var2 = dk2.ef.f314911d;
                if (w0Var2 != null) {
                    w0Var2.c0(false);
                }
                ((b92.g1) ((c61.ac) i95.n0.c(c61.ac.class))).Vi();
                ((b92.g1) ((c61.ac) i95.n0.c(c61.ac.class))).getClass();
                tn0.w0 w0Var3 = dk2.ef.f314911d;
                if (w0Var3 != null) {
                    w0Var3.C(((mm2.e1) o4Var.m147920xbba4bfc0(mm2.e1.class)).b7());
                }
            } else {
                c61.ac acVar = (c61.ac) i95.n0.c(c61.ac.class);
                long j17 = ((mm2.e1) o4Var.m147920xbba4bfc0(mm2.e1.class)).f410520q.f461837q;
                long m75942xfb822ef2 = ((mm2.e1) o4Var.m147920xbba4bfc0(mm2.e1.class)).f410521r.m75942xfb822ef2(0);
                ((b92.g1) acVar).getClass();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMicWatcher", "onVisitorEnterRoomMicFail errCode: " + intValue + " roomId: " + j17 + " liveId: " + m75942xfb822ef2);
                pm0.z.b(xy2.b.f539688b, "mic_visitorEnterRoomFail", false, null, null, false, false, new dk2.ta(intValue, j17, m75942xfb822ef2), 60, null);
            }
        }
        return jz5.f0.f384359a;
    }
}
