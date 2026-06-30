package com.tencent.mm.plugin.ball.ui;

/* loaded from: classes14.dex */
public abstract class e0 {
    public static void a(dp1.x xVar, android.graphics.Point point, android.graphics.Point point2, float f17, mp1.b bVar) {
        com.tencent.mm.sdk.platformtools.v5.b(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.string.f493669l73);
        if (xVar.c()) {
            xVar.j(new com.tencent.mm.plugin.ball.ui.z(bVar, point, xVar, point2, f17));
        } else {
            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.ball.ui.a0(bVar));
        }
    }

    public static void b(dp1.x xVar, android.graphics.Point point, mp1.b bVar) {
        a(xVar, point, null, -1.0f, bVar);
    }
}
