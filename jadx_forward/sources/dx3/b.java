package dx3;

/* loaded from: classes9.dex */
public final class b extends gp1.a0 {
    @Override // gp1.a0, gp1.z
    public void G0(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d) {
    }

    @Override // gp1.a0, gp1.z
    public void V(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d) {
        hz1.a aVar = ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).f306223m.f495380b;
        java.lang.String str = aVar != null ? aVar.f367822c : "";
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
        if (r26.n0.L(str, "AppBrandUI", 0, false, 6, null) == 0) {
            str = "AppBrandUI";
        }
        java.lang.String str2 = ((kg0.r) ((lg0.n) i95.n0.c(lg0.n.class))).wi() ? "Voip is calling \n当前界面名字是：\n" : "当前界面名字是：\n";
        java.lang.String str3 = com.tencent.mm.plugin.repairer.ui.RepairerActivityStackDebugUI.e;
        java.lang.String concat = str2.concat(str);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(concat, "<set-?>");
        com.tencent.mm.plugin.repairer.ui.RepairerActivityStackDebugUI.e = concat;
    }

    @Override // gp1.a0, gp1.z
    public void r0(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d) {
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.plugin.repairer.ui.RepairerActivityStackDebugUI.class);
        intent.addFlags(268435456);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/repairer/ui/floatball/RepairerActivityStackDebugFloatBallHelper$Companion$repairerFloatBallInfoEventListener$1", "onFloatBallInfoClicked", "(Lcom/tencent/mm/plugin/ball/model/BallInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/repairer/ui/floatball/RepairerActivityStackDebugFloatBallHelper$Companion$repairerFloatBallInfoEventListener$1", "onFloatBallInfoClicked", "(Lcom/tencent/mm/plugin/ball/model/BallInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
