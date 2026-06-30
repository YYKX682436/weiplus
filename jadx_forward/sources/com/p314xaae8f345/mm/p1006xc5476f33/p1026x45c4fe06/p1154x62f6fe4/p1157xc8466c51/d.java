package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1157xc8466c51;

/* loaded from: classes12.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static tl.b f167332a;

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.String f167333b;

    /* renamed from: c, reason: collision with root package name */
    public static com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1157xc8466c51.c f167334c;

    /* renamed from: d, reason: collision with root package name */
    public static com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f167335d;

    public static void a(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Record.AudioRecorder", "stopRecord what:%d", java.lang.Integer.valueOf(i17));
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(f167333b)) {
            return;
        }
        tl.b bVar = f167332a;
        if (bVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Record.AudioRecorder", "sRecorder is null,err");
            return;
        }
        ((tl.t) bVar).h();
        ((tl.t) f167332a).d();
        f167332a = null;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = f167335d;
        if (b4Var != null) {
            b4Var.d();
        }
        f167335d = null;
        f167333b = null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1154x62f6fe4.p1157xc8466c51.c cVar = f167334c;
        if (cVar != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.a3) cVar).a(i17);
        }
        f167334c = null;
    }
}
