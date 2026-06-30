package com.tencent.mm.plugin.appbrand.media.record;

/* loaded from: classes12.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static tl.b f85799a;

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.String f85800b;

    /* renamed from: c, reason: collision with root package name */
    public static com.tencent.mm.plugin.appbrand.media.record.c f85801c;

    /* renamed from: d, reason: collision with root package name */
    public static com.tencent.mm.sdk.platformtools.b4 f85802d;

    public static void a(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Record.AudioRecorder", "stopRecord what:%d", java.lang.Integer.valueOf(i17));
        if (com.tencent.mm.sdk.platformtools.t8.K0(f85800b)) {
            return;
        }
        tl.b bVar = f85799a;
        if (bVar == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Record.AudioRecorder", "sRecorder is null,err");
            return;
        }
        ((tl.t) bVar).h();
        ((tl.t) f85799a).d();
        f85799a = null;
        com.tencent.mm.sdk.platformtools.b4 b4Var = f85802d;
        if (b4Var != null) {
            b4Var.d();
        }
        f85802d = null;
        f85800b = null;
        com.tencent.mm.plugin.appbrand.media.record.c cVar = f85801c;
        if (cVar != null) {
            ((com.tencent.mm.plugin.appbrand.jsapi.audio.a3) cVar).a(i17);
        }
        f85801c = null;
    }
}
