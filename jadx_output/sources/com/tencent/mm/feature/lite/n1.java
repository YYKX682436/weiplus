package com.tencent.mm.feature.lite;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class n1 implements com.tencent.mm.ipcinvoker.j {
    private n1() {
    }

    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        java.lang.String string = bundle.getString("url", "");
        java.lang.String string2 = bundle.getString("extInfo", "");
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppFeatureService", "OpenGameLiteAppTask, url: " + string + ", extInfo: " + string2);
        m33.l1 l1Var = (m33.l1) i95.n0.c(m33.l1.class);
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        com.tencent.mm.feature.lite.m1 m1Var = new com.tencent.mm.feature.lite.m1(this, rVar);
        ((com.tencent.mm.plugin.game.p0) l1Var).getClass();
        if (context == null) {
            context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        }
        com.tencent.mm.plugin.game.model.r0 r0Var = new com.tencent.mm.plugin.game.model.r0();
        r0Var.f140430e = string;
        r0Var.jump_url = string;
        r53.f.s(context, r0Var, "", string2, m1Var);
    }
}
