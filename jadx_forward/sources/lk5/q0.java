package lk5;

/* loaded from: classes14.dex */
public abstract class q0 {
    public static com.p314xaae8f345.mm.ui.vas.C22584xf7d97e83 a(java.lang.Class uiCls, android.content.Intent intent, boolean z17, boolean z18, boolean z19, java.lang.Class fragmentCls, int i17, java.lang.Object obj) {
        if ((i17 & 2) != 0) {
            intent = null;
        }
        if ((i17 & 4) != 0) {
            z17 = true;
        }
        if ((i17 & 8) != 0) {
            z18 = false;
        }
        if ((i17 & 16) != 0) {
            z19 = false;
        }
        if ((i17 & 32) != 0) {
            fragmentCls = com.p314xaae8f345.mm.ui.vas.C22584xf7d97e83.class;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uiCls, "uiCls");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragmentCls, "fragmentCls");
        if (intent == null) {
            intent = new android.content.Intent();
        }
        intent.putExtra(com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37.f39697xfa441f0a, uiCls);
        intent.putExtra(com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37.f39699xc6812768, z17);
        intent.putExtra(com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37.f39701x5f6db9dd, z17);
        intent.putExtra(com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37.f39698x83153425, z18);
        intent.putExtra(com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37.f39704x5734e7fe, z19);
        if (intent.getComponent() == null) {
            intent.setClass(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, uiCls);
        }
        com.p314xaae8f345.mm.ui.vas.C22584xf7d97e83 a17 = com.p314xaae8f345.mm.ui.vas.C22584xf7d97e83.Q.a(intent, fragmentCls);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "newInstance(...)");
        return a17;
    }

    public static com.p314xaae8f345.mm.ui.vas.C22584xf7d97e83 b(java.lang.String uiCls, android.content.Intent intent, boolean z17, int i17, java.lang.Object obj) {
        if ((i17 & 2) != 0) {
            intent = null;
        }
        android.content.Intent intent2 = intent;
        if ((i17 & 4) != 0) {
            z17 = true;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uiCls, "uiCls");
        return a(java.lang.Class.forName(uiCls), intent2, z17, false, false, null, 56, null);
    }

    public static final java.lang.Class c(android.content.Context context, java.lang.Class uiCls) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uiCls, "uiCls");
        com.p314xaae8f345.mm.ui.bh.a(context);
        com.p314xaae8f345.mm.ui.ah a17 = com.p314xaae8f345.mm.ui.bh.a(context);
        if (!(java.lang.Math.min(a17.f278668a, a17.f278669b) > i65.a.b(context, 600))) {
            return com.p314xaae8f345.mm.ui.vas.ActivityC22582xf7828f42.class;
        }
        java.util.HashSet hashSet = lk5.i0.f400570a;
        return lk5.i0.f400570a.contains(uiCls.getName()) ? com.p314xaae8f345.mm.ui.vas.ActivityC22583xa926a22c.class : com.p314xaae8f345.mm.ui.vas.ActivityC22582xf7828f42.class;
    }

    public static final void d(android.content.Context context, android.content.Intent intent, android.os.Bundle bundle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "<this>");
        android.content.ComponentName component = (intent == null ? new android.content.Intent() : intent).getComponent();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(component);
        java.lang.Class<?> cls = java.lang.Class.forName(component.getClassName());
        if (context instanceof android.app.Activity) {
            e((android.app.Activity) context, cls, intent, bundle, -1);
            return;
        }
        android.content.Intent intent2 = new android.content.Intent();
        intent2.setClass(context, c(context, cls));
        if (intent == null) {
            intent = new android.content.Intent();
        }
        intent.putExtra(com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37.f39697xfa441f0a, cls);
        intent2.putExtra(com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37.f39703xd3a3c634, intent);
        intent2.addFlags(268435456);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(bundle);
        arrayList.add(intent2);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/ui/vas/VasNavigatorKt", "startVASActivity", "(Landroid/content/Context;Landroid/content/Intent;Landroid/os/Bundle;)V", "Undefined", "startActivity", "(Landroid/content/Intent;Landroid/os/Bundle;)V");
        context.startActivity((android.content.Intent) arrayList.get(0), (android.os.Bundle) arrayList.get(1));
        yj0.a.f(context, "com/tencent/mm/ui/vas/VasNavigatorKt", "startVASActivity", "(Landroid/content/Context;Landroid/content/Intent;Landroid/os/Bundle;)V", "Undefined", "startActivity", "(Landroid/content/Intent;Landroid/os/Bundle;)V");
    }

    public static final void e(android.app.Activity activity, java.lang.Class uiCls, android.content.Intent intent, android.os.Bundle bundle, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uiCls, "uiCls");
        android.content.Intent intent2 = new android.content.Intent();
        intent2.setClass(activity, c(activity, uiCls));
        if (intent == null) {
            intent = new android.content.Intent();
        }
        intent.putExtra(com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37.f39697xfa441f0a, uiCls);
        intent2.putExtra(com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37.f39703xd3a3c634, intent);
        activity.startActivityForResult(intent2, i17, bundle);
    }

    public static final void f(com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37 abstractActivityC22579xbed01a37, java.lang.Class uiCls, android.content.Intent intent, android.os.Bundle bundle, int i17) {
        com.p314xaae8f345.mm.ui.vas.C22584xf7d97e83 c22584xf7d97e83;
        com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37 abstractActivityC22579xbed01a372;
        android.os.Bundle bundle2;
        int i18;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(abstractActivityC22579xbed01a37, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uiCls, "uiCls");
        if (com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40539x7a994349()) {
            uiCls.toString();
            java.util.Objects.toString(intent);
            java.util.Objects.toString(bundle);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VAS.VasNavigator", "startVASActivityForResult() called with " + abstractActivityC22579xbed01a37.getClass().getName() + " uiCls = " + uiCls + ", options = " + bundle + ", requestCode = " + i17);
        }
        com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f.f39357x18545862.b(intent, abstractActivityC22579xbed01a37, true);
        p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d abstractC1104xc1ad431d = abstractActivityC22579xbed01a37.get_parentFragmentManager();
        if (abstractC1104xc1ad431d != null) {
            boolean z17 = false;
            int intExtra = intent != null ? intent.getIntExtra(com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37.f39702x6ee5c4af, 0) : 0;
            int flags = intent != null ? intent.getFlags() : 0;
            if (intExtra == 0 && (536870912 & flags) != 0) {
                intExtra = 1;
            }
            if (intExtra == 2) {
                flags &= 67108864;
            }
            if ((flags & 67108864) != 0) {
                int m7670x180b2948 = abstractC1104xc1ad431d.m7670x180b2948();
                int i19 = 0;
                while (true) {
                    if (i19 >= m7670x180b2948) {
                        break;
                    }
                    p012xc85e97e9.p087x9da2e250.app.k1 m7669x6358c69a = abstractC1104xc1ad431d.m7669x6358c69a(i19);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m7669x6358c69a, "getBackStackEntryAt(...)");
                    p012xc85e97e9.p087x9da2e250.app.a aVar = (p012xc85e97e9.p087x9da2e250.app.a) m7669x6358c69a;
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(aVar.f92885i, uiCls.getName())) {
                        abstractC1104xc1ad431d.m7707x96eafb01(aVar.f92885i, intExtra == 0 ? 1 : 0);
                    } else {
                        i19++;
                    }
                }
            }
            if (intExtra == 1 || intExtra == 2) {
                p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670 = abstractC1104xc1ad431d.m7675x1626d96d().size() > 0 ? abstractC1104xc1ad431d.m7675x1626d96d().get(0) : null;
                if ((componentCallbacksC1101xa17d4670 instanceof com.p314xaae8f345.mm.ui.vas.C22584xf7d97e83) && (abstractActivityC22579xbed01a372 = (c22584xf7d97e83 = (com.p314xaae8f345.mm.ui.vas.C22584xf7d97e83) componentCallbacksC1101xa17d4670).f292654p) != null && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(abstractActivityC22579xbed01a372.getClass(), uiCls)) {
                    android.os.Bundle m7436x8619eaa0 = c22584xf7d97e83.m7436x8619eaa0();
                    if (m7436x8619eaa0 != null) {
                        m7436x8619eaa0.clear();
                    }
                    if (intent == null || (bundle2 = intent.getExtras()) == null) {
                        bundle2 = new android.os.Bundle();
                    }
                    android.os.Bundle m7436x8619eaa02 = c22584xf7d97e83.m7436x8619eaa0();
                    if (m7436x8619eaa02 != null) {
                        m7436x8619eaa02.putAll(bundle2);
                    }
                    com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37 abstractActivityC22579xbed01a373 = c22584xf7d97e83.f292654p;
                    if (abstractActivityC22579xbed01a373 != null) {
                        abstractActivityC22579xbed01a373.m81219xbdb24b23(bundle2);
                    }
                    z17 = true;
                }
                if (z17) {
                    return;
                }
            }
            com.p314xaae8f345.mm.ui.vas.C22584xf7d97e83 a17 = a(uiCls, intent, false, false, false, abstractActivityC22579xbed01a37.m81203x2b036519().u0(), 24, null);
            if (!abstractActivityC22579xbed01a37.m81203x2b036519().m7489xb226ab8b()) {
                a17.m7582xf54bcc03(abstractActivityC22579xbed01a37.m81203x2b036519(), i17);
            }
            if (abstractActivityC22579xbed01a37.m81215x80d3e24e()) {
                java.util.HashSet hashSet = lk5.i0.f400570a;
                i18 = lk5.i0.f400570a.contains(uiCls.getName()) ? com.p314xaae8f345.mm.R.id.hyt : com.p314xaae8f345.mm.R.id.hyu;
            } else {
                i18 = com.p314xaae8f345.mm.R.id.hys;
            }
            android.content.Intent intent2 = a17.A;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent2, "<this>");
            java.lang.Object a18 = ok5.d.a(intent2, "KEY_VAS_START_ENTER_ANIM");
            sk5.j jVar = a18 instanceof sk5.j ? (sk5.j) a18 : null;
            if (jVar != null) {
                a17.B = jVar;
            }
            com.p314xaae8f345.mm.ui.vas.C22584xf7d97e83 m81203x2b036519 = abstractActivityC22579xbed01a37.m81203x2b036519();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m81203x2b036519, "null cannot be cast to non-null type com.tencent.mm.ui.vas.VASCommonFragment");
            if (intent != null) {
                java.lang.Object a19 = ok5.d.a(intent, "KEY_VAS_START_EXIT_ANIM");
                sk5.j jVar2 = a19 instanceof sk5.j ? (sk5.j) a19 : null;
                if (jVar2 != null) {
                    m81203x2b036519.C = jVar2;
                }
            }
            abstractActivityC22579xbed01a37.m81203x2b036519().B0();
            p012xc85e97e9.p087x9da2e250.app.i2 m7630xb2c12e75 = abstractC1104xc1ad431d.m7630xb2c12e75();
            m7630xb2c12e75.l(com.p314xaae8f345.mm.R.C30854x2dc211.f559452f7, com.p314xaae8f345.mm.R.C30854x2dc211.f559453f8, com.p314xaae8f345.mm.R.C30854x2dc211.f559454f9, com.p314xaae8f345.mm.R.C30854x2dc211.f_);
            m7630xb2c12e75.k(i18, a17, null);
            m7630xb2c12e75.c(uiCls.getName());
            m7630xb2c12e75.f92892p = true;
            m7630xb2c12e75.e();
            a17.f292655q = abstractActivityC22579xbed01a37.m81203x2b036519();
        }
    }
}
