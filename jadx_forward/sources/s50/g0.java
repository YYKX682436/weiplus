package s50;

@j95.b
/* loaded from: classes11.dex */
public class g0 extends i95.w implements u50.v {
    public void Ai(android.content.Context context, java.lang.String str, android.content.Intent intent, android.os.Bundle bundle) {
        java.util.HashMap hashMap = o13.n.f423774a;
        if (intent == null) {
            try {
                intent = new android.content.Intent();
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FTS.FTSApiLogic", "Class Not Found when startActivity %s", e17);
                return;
            }
        }
        if (str.startsWith(".")) {
            str = "com.tencent.mm.plugin.fts".concat(str);
        }
        intent.setClassName(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b, str);
        java.lang.Class.forName(str, false, context.getClassLoader());
        if (context instanceof android.app.Activity) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(bundle);
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/fts/api/FTSApiLogic", "startFTSActivity", "(Landroid/content/Context;Ljava/lang/String;Landroid/content/Intent;Landroid/os/Bundle;)V", "Undefined", "startActivity", "(Landroid/content/Intent;Landroid/os/Bundle;)V");
            context.startActivity((android.content.Intent) arrayList.get(0), (android.os.Bundle) arrayList.get(1));
            yj0.a.f(context, "com/tencent/mm/plugin/fts/api/FTSApiLogic", "startFTSActivity", "(Landroid/content/Context;Ljava/lang/String;Landroid/content/Intent;Landroid/os/Bundle;)V", "Undefined", "startActivity", "(Landroid/content/Intent;Landroid/os/Bundle;)V");
            return;
        }
        intent.addFlags(268435456);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(bundle);
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(context, arrayList2.toArray(), "com/tencent/mm/plugin/fts/api/FTSApiLogic", "startFTSActivity", "(Landroid/content/Context;Ljava/lang/String;Landroid/content/Intent;Landroid/os/Bundle;)V", "Undefined", "startActivity", "(Landroid/content/Intent;Landroid/os/Bundle;)V");
        context.startActivity((android.content.Intent) arrayList2.get(0), (android.os.Bundle) arrayList2.get(1));
        yj0.a.f(context, "com/tencent/mm/plugin/fts/api/FTSApiLogic", "startFTSActivity", "(Landroid/content/Context;Ljava/lang/String;Landroid/content/Intent;Landroid/os/Bundle;)V", "Undefined", "startActivity", "(Landroid/content/Intent;Landroid/os/Bundle;)V");
    }

    public void Bi(android.app.Activity activity, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FTSApiLogicFeatureService", "startFTSGlobalActivity(context: " + activity + ", tab: " + i17 + ")");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("from_tab_index", i17);
        boolean z17 = j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2567xc9fa65a8.C20672x8f1bd40b()) == 1;
        if (z17) {
            intent.putExtra("MMActivity.OverrideEnterAnimation", 0);
            intent.putExtra("MMActivity.OverrideExitAnimation", com.p314xaae8f345.mm.R.C30854x2dc211.f559422ed);
        } else {
            intent.putExtra("MMActivity.OverrideEnterAnimation", com.p314xaae8f345.mm.R.C30854x2dc211.f559337bx);
            intent.putExtra("MMActivity.OverrideExitAnimation", com.p314xaae8f345.mm.R.C30854x2dc211.by);
        }
        o13.n.q(activity, ".ui.FTSMainUI", intent);
        if (z17) {
            activity.overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559419ea, 0);
        }
    }

    public void Di(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.l2 l2Var;
        com.p314xaae8f345.mm.p1006xc5476f33.fts.d0 d0Var = (com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.fts.d0.class);
        synchronized (d0Var.f218931z) {
            l2Var = (com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.l2) d0Var.f218931z.get(3);
        }
        if (l2Var != null) {
            l2Var.k(i17);
        }
    }

    public java.lang.String wi(java.lang.String str) {
        if (str == null) {
            java.util.HashMap hashMap = o13.n.f423774a;
            return null;
        }
        java.lang.String lowerCase = o13.n.a(str).toLowerCase();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i17 = 0; i17 < lowerCase.length(); i17++) {
            char charAt = lowerCase.charAt(i17);
            if (o13.s.a(charAt)) {
                java.lang.String[] strArr = (java.lang.String[]) o13.s.f423799l.get(java.lang.String.valueOf(charAt));
                if (strArr == null || strArr.length <= 0 || strArr[0].length() < 1) {
                    arrayList.add("\u2001");
                } else {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    arrayList2.add(strArr[0]);
                    arrayList.add(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(arrayList2, "\u200f"));
                }
            } else {
                arrayList.add(java.lang.String.valueOf(lowerCase.charAt(i17)));
            }
        }
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(arrayList, "\u200d");
    }
}
