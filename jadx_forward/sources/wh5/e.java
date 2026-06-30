package wh5;

/* loaded from: classes12.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final wh5.e f527582a = new wh5.e();

    public final void a(com.p314xaae8f345.mm.p2621x8fb0427b.f9 msg, m11.b0 imgInfo, android.content.Context context, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imgInfo, "imgInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        wh5.v vVar = (wh5.v) wh5.h0.f527601a.a(msg, imgInfo);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        sf3.g e17 = vVar.e();
        gg3.c a17 = vVar.a();
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        vf3.a aVar = (vf3.a) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).d(vf3.a.class);
        vf3.b T4 = aVar != null ? aVar.T4(vVar) : null;
        long j17 = T4 != null ? T4.f517902e : 0L;
        java.lang.String c17 = e17.c();
        java.lang.String str = a17.f353261c;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("C2CLiveExporter", "exportLivePhoto >> msgId: " + vVar.f527629a.m124847x74d37ac6() + ", mediaLevel: " + vVar.f527631c.name() + "videoPath: " + str + ", videoSize: " + com.p314xaae8f345.mm.vfs.w6.k(str) + " coverPath: " + c17 + ", coverSize: " + com.p314xaae8f345.mm.vfs.w6.k(c17) + " coverTimeStampMs: " + j17);
        p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.a(p3325xe03a0797.p3326xc267989b.q1.f392103c.mo7096x348d9a(p3325xe03a0797.p3326xc267989b.t3.a(null, 1, null))), null, null, new wh5.d(c17, str, j17, currentTimeMillis, vVar, z17, context, null), 3, null);
    }
}
