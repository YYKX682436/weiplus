package com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui;

/* loaded from: classes11.dex */
public final class h4 {
    public h4(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public static void b(com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.h4 h4Var, android.content.Context context, java.lang.String str, int i17, java.lang.String str2, java.lang.Integer num, android.view.View view, java.lang.String str3, java.lang.String str4, int i18, java.lang.Object obj) {
        int i19;
        int i27;
        android.app.Activity activity;
        java.lang.String str5 = (i18 & 2) != 0 ? "" : str;
        java.lang.String scene = (i18 & 8) != 0 ? "SCENE_DEFAULT" : str2;
        java.lang.Integer num2 = (i18 & 16) != 0 ? null : num;
        android.view.View view2 = (i18 & 32) != 0 ? null : view;
        java.lang.String exitAnimStyle = (i18 & 64) != 0 ? "VALUE_EXIT_CARD_ANIM_AVATAR_STYLE" : str3;
        java.lang.String str6 = (i18 & 128) == 0 ? str4 : "";
        h4Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scene, "scene");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(exitAnimStyle, "exitAnimStyle");
        synchronized (com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18624x35d9f9b5.f255012p) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18624x35d9f9b5.f255011o.a(context, str5);
        }
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18624x35d9f9b5.class);
        intent.putExtra("KEY_USER_NAME", str5);
        intent.putExtra("KEY_FROM_SCENE", scene);
        boolean z17 = true;
        if (!bi4.v1.k() || view2 == null) {
            i19 = -1;
            i27 = -1;
        } else {
            int[] iArr = new int[2];
            view2.getLocationInWindow(iArr);
            i27 = iArr[0];
            i19 = iArr[1];
        }
        intent.putExtra("KEY_START_CARD_ANIM_X_OFFSET", i27);
        intent.putExtra("KEY_START_CARD_ANIM_Y_OFFSET", i19);
        intent.putExtra("KEY_EXIT_CARD_ANIM_STYLE", exitAnimStyle);
        if (num2 != null) {
            num2.intValue();
            intent.putExtra("KEY_SCROLL_INDEX", num2.intValue());
        }
        if (str6 != null && str6.length() != 0) {
            z17 = false;
        }
        if (!z17) {
            intent.putExtra("KEY_SCROLL_STATUS_ID", str6);
        }
        boolean z18 = context instanceof android.app.Activity;
        android.app.Activity activity2 = z18 ? (android.app.Activity) context : null;
        if (activity2 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.k(activity2, arrayList.toArray(), "com/tencent/mm/plugin/textstatus/ui/TextStatusCardFeedsActivity$Companion", "startForResult", "(Landroid/content/Context;Ljava/lang/String;ILjava/lang/String;Ljava/lang/Integer;Landroid/view/View;Ljava/lang/String;Ljava/lang/String;)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.TextStatusCardFeedsActivity", "startForResult context=" + context + ", userName=" + str5 + ", requestCode=" + i17 + ", scene=" + scene + ", scrollIndex=" + num2 + ", scrollStatusId=" + str6 + ", archorView=" + view2);
        if (i27 == -1 || i19 == -1) {
            activity = z18 ? (android.app.Activity) context : null;
            if (activity != null) {
                activity.overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559390df, com.p314xaae8f345.mm.R.C30854x2dc211.f559261p);
                return;
            }
            return;
        }
        activity = z18 ? (android.app.Activity) context : null;
        if (activity != null) {
            activity.overridePendingTransition(0, 0);
        }
    }

    public final void a(android.content.Context context, java.lang.String str) {
        int intValue;
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18624x35d9f9b5.f255012p.clear();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        p012xc85e97e9.p093xedfae76a.c1 a17 = zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ac.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ac acVar = (com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ac) a17;
        acVar.f255262g = str;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = acVar.f255260e;
        arrayList.addAll(arrayList2);
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (java.lang.Object obj : arrayList) {
            if (obj instanceof mj4.h) {
                mj4.k kVar = (mj4.k) ((mj4.h) obj);
                if (!linkedHashMap.containsKey(kVar.o())) {
                    java.lang.String o17 = kVar.o();
                    com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.h4 h4Var = com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18624x35d9f9b5.f255011o;
                    java.util.LinkedList linkedList = com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18624x35d9f9b5.f255012p;
                    linkedHashMap.put(o17, java.lang.Integer.valueOf(linkedList.size()));
                    linkedList.add(new java.util.LinkedList());
                }
                java.lang.Integer num = (java.lang.Integer) linkedHashMap.get(kVar.o());
                intValue = num != null ? num.intValue() : 0;
                com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.h4 h4Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18624x35d9f9b5.f255011o;
                java.util.LinkedList linkedList2 = (java.util.LinkedList) kz5.n0.a0(com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18624x35d9f9b5.f255012p, intValue);
                if (linkedList2 != null) {
                    linkedList2.add(obj);
                }
            } else if (obj instanceof nj4.e) {
                for (mj4.h hVar : ((nj4.e) obj).f419469d.f86668b) {
                    java.util.LinkedList linkedList3 = new java.util.LinkedList();
                    linkedList3.add(hVar);
                    com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.h4 h4Var3 = com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18624x35d9f9b5.f255011o;
                    com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18624x35d9f9b5.f255012p.add(linkedList3);
                }
            } else if (obj instanceof pj4.n1) {
                mj4.h a18 = fj4.b.a((pj4.n1) obj);
                bk4.d2 d2Var = bk4.d2.f102989a;
                java.lang.String c17 = bk4.d2.c(d2Var, d2Var.a(((mj4.k) a18).f408600b.f76512x81959a6e * 1000), null, 2, null);
                if (!linkedHashMap.containsKey(c17)) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.h4 h4Var4 = com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18624x35d9f9b5.f255011o;
                    java.util.LinkedList linkedList4 = com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18624x35d9f9b5.f255012p;
                    linkedHashMap.put(c17, java.lang.Integer.valueOf(linkedList4.size()));
                    linkedList4.add(new java.util.LinkedList());
                }
                java.lang.Integer num2 = (java.lang.Integer) linkedHashMap.get(c17);
                intValue = num2 != null ? num2.intValue() : 0;
                com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.h4 h4Var5 = com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18624x35d9f9b5.f255011o;
                java.util.LinkedList linkedList5 = (java.util.LinkedList) kz5.n0.a0(com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18624x35d9f9b5.f255012p, intValue);
                if (linkedList5 != null) {
                    linkedList5.add(a18);
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.TextStatusCardFeedsActivity", "prepareStart, " + str + ", dataSize=" + arrayList2.size() + ", itemsSnapShot Size=" + com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18624x35d9f9b5.f255012p.size());
    }
}
