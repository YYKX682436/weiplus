package bi4;

/* loaded from: classes11.dex */
public final class o1 {

    /* renamed from: a, reason: collision with root package name */
    public static final bi4.o1 f102608a = new bi4.o1();

    public final boolean a(android.content.Context context, bi4.d1 d1Var, android.os.ResultReceiver resultReceiver) {
        if (context == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TextStatusSetter", "setTextStatus context == null");
            return false;
        }
        bi4.d1 d1Var2 = d1Var == null ? new bi4.d1() : d1Var;
        bi4.s1.a(d1Var2);
        if (!bi4.v1.g()) {
            int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18675x35ba4862.f255234g;
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18675x35ba4862.class);
            boolean z17 = context instanceof android.app.Activity;
            if (!z17) {
                intent.addFlags(268435456);
            }
            intent.putExtra("SET_TEXT_PARAMS", d1Var2.mo14344x5f01b1f6());
            intent.putExtra("CALLBACK", resultReceiver);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/textstatus/ui/TextStatusTransparentActivity$Companion", "start", "(Landroid/content/Context;Lcom/tencent/mm/plugin/textstatus/api/SetStatusParam;Landroid/os/ResultReceiver;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context, "com/tencent/mm/plugin/textstatus/ui/TextStatusTransparentActivity$Companion", "start", "(Landroid/content/Context;Lcom/tencent/mm/plugin/textstatus/api/SetStatusParam;Landroid/os/ResultReceiver;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            android.app.Activity activity = z17 ? (android.app.Activity) context : null;
            if (activity != null) {
                activity.overridePendingTransition(0, 0);
            }
            return false;
        }
        ((k30.a) ((l30.h) i95.n0.c(l30.h.class))).Ai("xlab");
        boolean z18 = d1Var != null && d1Var.f436482s == 1;
        if (!z18) {
            ai4.m0 m0Var = ai4.m0.f86706a;
            di4.i iVar = di4.i.f314315a;
        }
        bk4.i.a().P(1);
        if (d1Var2.f436484u) {
            java.lang.String str = d1Var2.f436471e;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                bi4.s1.c(d1Var2, resultReceiver, "", 0, 0);
            } else {
                ((j70.e) ((k70.g0) i95.n0.c(k70.g0.class))).Ui(str, new bi4.q1(new bi4.r1(d1Var2, resultReceiver)));
            }
            return true;
        }
        boolean z19 = d1Var2.f436475i == 5;
        if (!z18 && !z19) {
            di4.i iVar2 = di4.i.f314315a;
            if (qi4.p.f445309a.d()) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setTextStatus: route to flutter publish page, sessionId=");
                sb6.append(d1Var2.f436474h);
                sb6.append(", hasCallback=");
                sb6.append(resultReceiver != null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatusSetter", sb6.toString());
                if (((we0.u0) ((xe0.c0) i95.n0.c(xe0.c0.class))).c(context, d1Var2, resultReceiver, -1)) {
                    return true;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.TextStatusSetter", "setTextStatus: flutter launch failed, fallback to native");
            }
        }
        if (!bi4.s1.b(d1Var2)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18639xf6f98078.f255099u2.a(context, d1Var2, false, false, resultReceiver);
            return true;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putByteArray("SET_TEXT_PARAMS", d1Var2.mo14344x5f01b1f6());
        bundle.putParcelable("CALLBACK", resultReceiver);
        if (bk4.i.a().C()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18635xb8188ef9.C1.a(context, bundle, null);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18631x6637f79d.C.a(context, bundle, null);
        }
        return true;
    }

    public final boolean b(android.app.Activity activity, bi4.d1 d1Var, int i17) {
        if (activity == null) {
            return false;
        }
        bi4.d1 d1Var2 = d1Var == null ? new bi4.d1() : d1Var;
        bi4.s1.a(d1Var2);
        if (!bi4.v1.g()) {
            int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18675x35ba4862.f255234g;
            android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18675x35ba4862.class);
            intent.putExtra("SET_TEXT_PARAMS", d1Var2.mo14344x5f01b1f6());
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.k(activity, arrayList.toArray(), "com/tencent/mm/plugin/textstatus/ui/TextStatusTransparentActivity$Companion", "startForResult", "(Landroid/app/Activity;Lcom/tencent/mm/plugin/textstatus/api/SetStatusParam;I)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
            activity.overridePendingTransition(0, 0);
            return false;
        }
        ((k30.a) ((l30.h) i95.n0.c(l30.h.class))).Ai("xlab");
        boolean z17 = d1Var != null && d1Var.f436482s == 1;
        if (!z17) {
            ai4.m0 m0Var = ai4.m0.f86706a;
            di4.i iVar = di4.i.f314315a;
        }
        bk4.i.a().P(1);
        boolean z18 = d1Var2.f436475i == 5;
        if (!z17 && !z18) {
            di4.i iVar2 = di4.i.f314315a;
            if (qi4.p.f445309a.d()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatusSetter", "setTextStatusForResult: route to flutter publish page, reqCode=" + i17 + ", sessionId=" + d1Var2.f436474h);
                if (((we0.u0) ((xe0.c0) i95.n0.c(xe0.c0.class))).c(activity, d1Var2, null, i17)) {
                    return true;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.TextStatusSetter", "setTextStatusForResult: flutter launch failed, fallback to native");
            }
        }
        if (bi4.s1.b(d1Var2)) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putByteArray("SET_TEXT_PARAMS", d1Var2.mo14344x5f01b1f6());
            if (bk4.i.a().C()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18635xb8188ef9.C1.a(activity, bundle, java.lang.Integer.valueOf(i17));
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18631x6637f79d.C.a(activity, bundle, java.lang.Integer.valueOf(i17));
            }
            return true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.d8 d8Var = com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18639xf6f98078.f255099u2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.TextStatusEditActivity", "startForResult: enterSource=" + java.lang.Long.valueOf(d1Var2.f436475i) + ", reqCode=" + i17);
        android.content.Intent intent2 = new android.content.Intent(activity, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18639xf6f98078.class);
        intent2.putExtra("SET_TEXT_PARAMS", d1Var2.mo14344x5f01b1f6());
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(java.lang.Integer.valueOf(i17));
        arrayList2.add(intent2);
        java.util.Collections.reverse(arrayList2);
        yj0.a.k(activity, arrayList2.toArray(), "com/tencent/mm/plugin/textstatus/ui/TextStatusEditActivity$Companion", "startForResult", "(Landroid/app/Activity;Lcom/tencent/mm/plugin/textstatus/api/SetStatusParam;I)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
        activity.overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559390df, com.p314xaae8f345.mm.R.C30854x2dc211.f559261p);
        return true;
    }
}
