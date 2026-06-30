package xr2;

/* loaded from: classes2.dex */
public final class a extends fc2.d {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ xr2.b f537741g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13920xa5f564aa f537742h;

    public a(xr2.b bVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13920xa5f564aa c13920xa5f564aa) {
        this.f537741g = bVar;
        this.f537742h = c13920xa5f564aa;
    }

    @Override // fc2.d
    public boolean E0() {
        return false;
    }

    @Override // fc2.d
    public boolean F0(fc2.c dispatcher, fc2.a event) {
        int i17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dispatcher, "dispatcher");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        if ((event instanceof fc2.t) && ((i17 = ((fc2.t) event).f342518d) == 6 || i17 == 7 || i17 == 0)) {
            return true;
        }
        if (!(event instanceof ec2.f)) {
            return false;
        }
        int i18 = ((ec2.f) event).f332492d;
        return i18 == 27 || i18 == 28 || i18 == 26;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0096 A[Catch: all -> 0x00e7, TRY_LEAVE, TryCatch #0 {, blocks: (B:26:0x0060, B:28:0x006b, B:33:0x0077, B:35:0x007f, B:38:0x0089, B:44:0x0096, B:47:0x00bc), top: B:25:0x0060 }] */
    @Override // fc2.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void G0(fc2.a r22) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xr2.a.G0(fc2.a):void");
    }
}
