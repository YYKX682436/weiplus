package rq2;

/* loaded from: classes2.dex */
public final class r extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rq2.q f480411d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(rq2.q qVar) {
        super(0);
        this.f480411d = qVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        rq2.s sVar = rq2.s.f480412a;
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6784x711efb71 c6784x711efb71 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6784x711efb71();
        rq2.q qVar = this.f480411d;
        c6784x711efb71.f141156f = (int) qVar.f480407o;
        c6784x711efb71.f141154d = (int) qVar.f480404l;
        c6784x711efb71.f141155e = (int) qVar.f480405m;
        c6784x711efb71.f141157g = (int) qVar.f480406n;
        c6784x711efb71.f141165o = qVar.f480401i;
        c6784x711efb71.f141163m = oj.d.e(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).f427215d;
        c6784x711efb71.f141161k = rq2.s.f480415d ? 1 : 0;
        c6784x711efb71.f141164n = c6784x711efb71.b("networkType", com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40061x1de3608b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a), true);
        c6784x711efb71.f141166p = 2;
        c6784x711efb71.f141158h = (int) qVar.f480408p;
        c6784x711efb71.f141159i = (int) qVar.f480409q;
        c6784x711efb71.f141162l = rq2.s.f480417f ? 1 : 0;
        c6784x711efb71.f141160j = (int) rq2.s.f480421j;
        c6784x711efb71.f141167q = qVar.f480402j;
        c6784x711efb71.f141168r = c6784x711efb71.b("tabName", qVar.f480403k, true);
        if (rq2.s.f480416e) {
            c6784x711efb71.f141161k = 2;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderNearbyLiveLoadingReporter", "reportILog：\n " + c6784x711efb71.n() + " ，isFromRedClick = " + rq2.s.f480416e);
        c6784x711efb71.k();
        return jz5.f0.f384359a;
    }
}
