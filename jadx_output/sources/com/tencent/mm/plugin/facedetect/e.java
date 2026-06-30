package com.tencent.mm.plugin.facedetect;

@j95.b
/* loaded from: classes12.dex */
public class e extends i95.w {
    public static boolean wi() {
        ((k30.a) ((l30.h) i95.n0.c(l30.h.class))).wi();
        return true;
    }

    @Override // i95.w
    public void onCreate(android.content.Context context) {
        super.onCreate(context);
        com.tencent.mars.xlog.Log.i("MicroMsg.PluginFace", "hy: starting execute.");
        ((km5.q) ((km5.q) km5.u.d()).q(new com.tencent.mm.plugin.facedetect.j())).s(new com.tencent.mm.plugin.facedetect.f(this));
        if (com.tencent.mm.sdk.platformtools.x2.n() && uo.n.f429522a.c()) {
            uo.n.f429526e = new com.tencent.mm.plugin.facedetect.e$$a();
        }
    }
}
