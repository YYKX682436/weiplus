package com.tencent.mm.ipcinvoker.wx_extension;

@j95.b
/* loaded from: classes5.dex */
public class p0 extends i95.w implements com.tencent.mm.ipcinvoker.wx_extension.i0, com.tencent.mm.ipcinvoker.c0 {

    /* renamed from: d, reason: collision with root package name */
    public static final long f68440d = java.util.concurrent.TimeUnit.DAYS.toMillis(1);

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f68441e = 0;

    @Override // i95.w
    public void onCreate(android.content.Context context) {
        com.tencent.mars.xlog.Log.i("MicroMsg.PluginIPC", "execute(%s)", bm5.f1.a());
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            ((ku5.t0) ku5.t0.f312615d).q(new com.tencent.mm.ipcinvoker.wx_extension.n0(this));
        }
        com.tencent.mm.ipcinvoker.q.f68386h = this;
        com.tencent.mm.ipcinvoker.i0.b();
        if (com.tencent.mm.sdk.platformtools.x2.s()) {
            com.tencent.mm.ipcinvoker.i0.a(com.tencent.mm.ipcinvoker.wx_extension.service.MainProcessIPCService.f68459e);
        }
    }
}
