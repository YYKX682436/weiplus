package qk;

/* loaded from: classes11.dex */
public interface f9 {
    static /* synthetic */ void a(qk.f9 f9Var, android.content.Context context, bw5.o50 o50Var, bw5.ar0 ar0Var, boolean z17, yz5.a aVar, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: consumeChatRoomItem");
        }
        if ((i17 & 4) != 0) {
            ar0Var = bw5.ar0.TingScene_UnDefined;
        }
        bw5.ar0 ar0Var2 = ar0Var;
        if ((i17 & 8) != 0) {
            z17 = false;
        }
        boolean z18 = z17;
        if ((i17 & 16) != 0) {
            aVar = null;
        }
        ((rk4.k8) f9Var).p(context, o50Var, ar0Var2, z18, aVar);
    }

    static /* synthetic */ void b(qk.f9 f9Var, android.content.Context context, boolean z17, bw5.lp0 lp0Var, il4.e eVar, bw5.o50 o50Var, android.os.Bundle bundle, bw5.ar0 ar0Var, yz5.a aVar, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: goToTingPlayerActivity");
        }
        ((rk4.k8) f9Var).z(context, (i17 & 2) != 0 ? false : z17, (i17 & 4) != 0 ? null : lp0Var, (i17 & 8) != 0 ? null : eVar, (i17 & 16) != 0 ? null : o50Var, (i17 & 32) != 0 ? null : bundle, (i17 & 64) != 0 ? bw5.ar0.TingScene_UnDefined : ar0Var, (i17 & 128) == 0 ? aVar : null);
    }

    static /* synthetic */ void c(qk.f9 f9Var, android.content.Context context, bw5.o50 o50Var, bw5.ar0 ar0Var, il4.e eVar, yz5.a aVar, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: consumeCategoryItem");
        }
        if ((i17 & 4) != 0) {
            ar0Var = bw5.ar0.TingScene_UnDefined;
        }
        ((rk4.k8) f9Var).o(context, o50Var, ar0Var, (i17 & 8) != 0 ? null : eVar, (i17 & 16) != 0 ? null : aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00fe  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static void d(qk.f9 r43, android.content.Context r44, bw5.o50 r45, java.util.List r46, qk.ja r47, bw5.ar0 r48, il4.e r49, yz5.a r50, byte[] r51, java.lang.String r52, bw5.pp0 r53, boolean r54, int r55, java.lang.Object r56) {
        /*
            Method dump skipped, instructions count: 446
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qk.f9.d(qk.f9, android.content.Context, bw5.o50, java.util.List, qk.ja, bw5.ar0, il4.e, yz5.a, byte[], java.lang.String, bw5.pp0, boolean, int, java.lang.Object):void");
    }

    static void e(qk.f9 f9Var, android.content.Context context, bw5.ar0 ar0Var, il4.e eVar, int i17, java.lang.Integer num, java.lang.String str, int i18, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: gotoMyAlbum");
        }
        bw5.ar0 enterScene = (i18 & 2) != 0 ? bw5.ar0.TingScene_UnDefined : ar0Var;
        il4.e eVar2 = (i18 & 4) != 0 ? null : eVar;
        int i19 = (i18 & 8) != 0 ? 0 : i17;
        java.lang.Integer num2 = (i18 & 16) != 0 ? null : num;
        java.lang.String str2 = (i18 & 32) == 0 ? str : null;
        rk4.k8 k8Var = (rk4.k8) f9Var;
        k8Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(enterScene, "enterScene");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingRouter", "gotoMyAlbum enterScene: " + enterScene + ", albumPageType: " + i19);
        if (eVar2 == null) {
            eVar2 = new il4.e(null, 0, enterScene.f106955d, false, null, null, 0, 0, false, false, null, null, null, null, null, null, false, false, null, null, false, null, false, null, false, 33554427, null);
        }
        il4.l.q(eVar2, true, context, null, 8, null);
        k8Var.M(enterScene);
        p3325xe03a0797.p3326xc267989b.l.d(k8Var, null, null, new rk4.x7(k8Var, i19, num2, str2, context, null), 3, null);
    }
}
