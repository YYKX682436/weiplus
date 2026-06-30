package ru1;

/* loaded from: classes13.dex */
public final class p extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ru1.t f481259d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(ru1.t tVar) {
        super(1);
        this.f481259d = tVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        gs0.b $receiver = (gs0.b) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g($receiver, "$this$$receiver");
        ru1.t tVar = this.f481259d;
        ru1.t.a(tVar, $receiver);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        tVar.f481266d = android.os.SystemClock.elapsedRealtime();
        $receiver.f356506c = new ru1.n(tVar);
        $receiver.f356507d = new ru1.o(tVar);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CastReportHelper", "markVideoEncodingUseAsync");
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(1634L, 13L, 1L);
        return jz5.f0.f384359a;
    }
}
