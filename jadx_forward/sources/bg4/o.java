package bg4;

/* loaded from: classes9.dex */
public class o extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public o() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        java.lang.String str;
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6225x24315251 c6225x24315251 = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6225x24315251) abstractC20979x809547d1;
        zf4.o a17 = zf4.o.a(c6225x24315251.f136472g.f89390a);
        am.s00 s00Var = c6225x24315251.f136472g;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = s00Var.f89392c;
        if (a17 != null) {
            zf4.l wi6 = zf4.l.wi();
            java.lang.String Q0 = f9Var.Q0();
            java.lang.String str2 = s00Var.f89391b;
            java.lang.String h17 = k35.m1.h(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, a17.f554215a);
            if (h17 == null || h17.length() <= 0) {
                str = "";
            } else {
                java.lang.String[] split = h17.split(";");
                str = "" + split[0];
                if (split.length > 1) {
                    str = str + split[1];
                }
            }
            if (str2 != null) {
                str = str + str2;
            }
            long mo78012x3fdd41df = f9Var.mo78012x3fdd41df();
            wi6.getClass();
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            if (context != null) {
                try {
                    boolean i17 = ip.b.i();
                    boolean b17 = ip.b.b();
                    if (!com.p314xaae8f345.mm.p2621x8fb0427b.z3.I4(((com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.x) c01.d9.f()).f145049b)) {
                        if (i17) {
                            com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L1(context, true);
                        }
                        if (b17) {
                            android.util.Pair i18 = ip.l.i();
                            wi6.Di(context, (java.lang.String) i18.second, ((java.lang.Boolean) i18.first).booleanValue());
                        }
                    } else if (i17) {
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L1(context, true);
                    }
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SubCoreVoiceRemind", e17, "", new java.lang.Object[0]);
                }
                java.util.Set set = wi6.f554209h;
                if (set != null) {
                    java.util.HashSet hashSet = (java.util.HashSet) set;
                    if (hashSet.size() != 0) {
                        java.util.Iterator it = hashSet.iterator();
                        while (it.hasNext()) {
                            ((c01.r8) it.next()).a(str, mo78012x3fdd41df);
                        }
                    }
                }
                boolean z17 = com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.ui.p2250x30b64fa4.ActivityC18543xcf2786cd.f253972m;
                java.util.List list = com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.ui.p2250x30b64fa4.ActivityC18543xcf2786cd.f253971i;
                if (z17) {
                    ((java.util.ArrayList) list).add(str);
                } else {
                    ((java.util.ArrayList) list).clear();
                    com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.ui.p2250x30b64fa4.ActivityC18543xcf2786cd.f253972m = true;
                    if (c01.d9.e().f152304n) {
                        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.ui.p2250x30b64fa4.ActivityC18543xcf2786cd.class);
                        intent.putExtra("_RemindDialog_User", Q0);
                        intent.putExtra("_RemindDialog_Remind", str);
                        intent.setFlags(603979776);
                        intent.addFlags(268435456);
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        arrayList.add(intent);
                        java.util.Collections.reverse(arrayList);
                        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/subapp/ui/voicereminder/RemindDialog", "show", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        context.startActivity((android.content.Intent) arrayList.get(0));
                        yj0.a.f(context, "com/tencent/mm/plugin/subapp/ui/voicereminder/RemindDialog", "show", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    } else {
                        android.content.Intent intent2 = new android.content.Intent(context, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.ui.p2250x30b64fa4.ActivityC18543xcf2786cd.class);
                        intent2.putExtra("_RemindDialog_User", Q0);
                        intent2.putExtra("_RemindDialog_Remind", str);
                        intent2.setFlags(604012544);
                        intent2.addFlags(268435456);
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        arrayList2.add(intent2);
                        java.util.Collections.reverse(arrayList2);
                        yj0.a.d(context, arrayList2.toArray(), "com/tencent/mm/plugin/subapp/ui/voicereminder/RemindDialog", "show", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        context.startActivity((android.content.Intent) arrayList2.get(0));
                        yj0.a.f(context, "com/tencent/mm/plugin/subapp/ui/voicereminder/RemindDialog", "show", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    }
                }
            }
        }
        return false;
    }
}
