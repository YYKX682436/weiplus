package i52;

/* loaded from: classes15.dex */
public abstract class l {
    public static p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 a(int i17, java.util.List list, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f activityC1102x9ee2d9f) {
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670 = null;
        if (list == null || list.isEmpty()) {
            return null;
        }
        int size = list.size();
        if (i17 < 0 || i17 >= size) {
            return null;
        }
        if (i17 == 0) {
            componentCallbacksC1101xa17d4670 = b("com.tencent.mm.ui.conversation.MainUI", list);
        } else if (i17 == 1) {
            componentCallbacksC1101xa17d4670 = b("com.tencent.mm.ui.contact.address.MvvmAddressUIFragment", list);
            if (componentCallbacksC1101xa17d4670 == null) {
                componentCallbacksC1101xa17d4670 = b("com.tencent.mm.ui.contact.AddressUI.AddressUIFragment", list);
            }
        } else if (i17 == 2) {
            componentCallbacksC1101xa17d4670 = b("com.tencent.mm.ui.FindMoreFriendsUI", list);
        } else if (i17 == 3) {
            componentCallbacksC1101xa17d4670 = b("com.tencent.mm.ui.MoreTabUI", list);
        } else if (i17 == 4) {
            componentCallbacksC1101xa17d4670 = b("com.tencent.mm.ui.chatting.ChattingUIFragment", list);
        }
        if (componentCallbacksC1101xa17d4670 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.FragmentUtil", "_getFragmentByIndex: " + componentCallbacksC1101xa17d4670.getClass().getCanonicalName());
            return componentCallbacksC1101xa17d4670;
        }
        try {
            p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d46702 = (p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670) list.get(i17);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.FragmentUtil", "getCurFragmentOfLauncherUI-1: " + componentCallbacksC1101xa17d46702.getClass().getCanonicalName());
            return componentCallbacksC1101xa17d46702;
        } catch (java.lang.Exception unused) {
            p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 c17 = c(activityC1102x9ee2d9f);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.FragmentUtil", "getCurFragmentOfLauncherUI-2:" + c17.getClass().getCanonicalName());
            return c17;
        }
    }

    public static p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 b(java.lang.String str, java.util.List list) {
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670 = (p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670) it.next();
            if (componentCallbacksC1101xa17d4670 != null && str.equals(componentCallbacksC1101xa17d4670.getClass().getCanonicalName())) {
                return componentCallbacksC1101xa17d4670;
            }
        }
        return null;
    }

    public static p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 c(p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f activityC1102x9ee2d9f) {
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670;
        java.lang.Boolean bool;
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d46702 = null;
        if (activityC1102x9ee2d9f == null) {
            return null;
        }
        try {
            java.lang.reflect.Method declaredMethod = activityC1102x9ee2d9f.getClass().getDeclaredMethod("getCurrentFragmet", new java.lang.Class[0]);
            declaredMethod.setAccessible(true);
            componentCallbacksC1101xa17d4670 = (p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670) declaredMethod.invoke(activityC1102x9ee2d9f, new java.lang.Object[0]);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.FragmentUtil", "getCurFragment, 1: " + componentCallbacksC1101xa17d4670.getClass().getCanonicalName());
        } catch (java.lang.Exception unused) {
            componentCallbacksC1101xa17d4670 = null;
        }
        if (componentCallbacksC1101xa17d4670 != null) {
            return componentCallbacksC1101xa17d4670;
        }
        p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d mo7595x9cdc264 = activityC1102x9ee2d9f.mo7595x9cdc264();
        if (mo7595x9cdc264 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("HABBYGE-MALI.FragmentUtil", "getCurFragment, FragmentManager: NULL");
            return null;
        }
        java.util.List<p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670> m7675x1626d96d = mo7595x9cdc264.m7675x1626d96d();
        if (m7675x1626d96d == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("HABBYGE-MALI.FragmentUtil", "_getCurrentFragmentFromSystem, fragmentList NULL");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.FragmentUtil", "_getCurrentFragmentFromSystem, fragmentList: " + m7675x1626d96d.size());
            java.util.Iterator<p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670> it = m7675x1626d96d.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 next = it.next();
                if (next != null && next.m7481x7a6e8df6()) {
                    try {
                        java.lang.reflect.Method declaredMethod2 = p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670.class.getDeclaredMethod("isMenuVisible", new java.lang.Class[0]);
                        declaredMethod2.setAccessible(true);
                        bool = (java.lang.Boolean) declaredMethod2.invoke(next, new java.lang.Object[0]);
                    } catch (java.lang.Throwable th6) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("HABBYGE-MALI.FragmentUtil", th6, "isMenuVisible", new java.lang.Object[0]);
                        bool = java.lang.Boolean.FALSE;
                    }
                    if (bool.booleanValue()) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.FragmentUtil", "_getCurrentFragmentFromSystem: " + next.getClass().getCanonicalName());
                        componentCallbacksC1101xa17d46702 = next;
                        break;
                    }
                }
            }
        }
        return componentCallbacksC1101xa17d46702;
    }

    public static p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 d(android.app.Activity activity) {
        if (activity == null) {
            return null;
        }
        return e(activity.getClass().getCanonicalName());
    }

    public static p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 e(java.lang.String str) {
        if (str == null || !b52.b.k(str)) {
            return null;
        }
        try {
            java.util.ArrayList arrayList = com.p314xaae8f345.mm.ui.ActivityC21387x976b8e54.f278359y;
            java.lang.reflect.Method declaredMethod = com.p314xaae8f345.mm.ui.ActivityC21387x976b8e54.class.getDeclaredMethod("getCurrentTabIndex", new java.lang.Class[0]);
            declaredMethod.setAccessible(true);
            int intValue = ((java.lang.Integer) declaredMethod.invoke(null, new java.lang.Object[0])).intValue();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.FragmentUtil", "getCurFragmentOfLauncherUI, index: " + intValue);
            p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f f17 = b52.b.f();
            if (f17 == null) {
                return null;
            }
            if (intValue <= 0) {
                return c(f17);
            }
            java.util.List<p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670> m7675x1626d96d = f17.mo7595x9cdc264().m7675x1626d96d();
            if (m7675x1626d96d != null) {
                return a(intValue, m7675x1626d96d, f17);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("HABBYGE-MALI.FragmentUtil", "getCurFragmentOfLauncherUI, fragmentList NULL");
            return null;
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    public static p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 f(p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f activityC1102x9ee2d9f, java.lang.String str) {
        p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d mo7595x9cdc264;
        java.util.List<p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670> m7675x1626d96d;
        if (activityC1102x9ee2d9f == null || str == null || (mo7595x9cdc264 = activityC1102x9ee2d9f.mo7595x9cdc264()) == null || (m7675x1626d96d = mo7595x9cdc264.m7675x1626d96d()) == null) {
            return null;
        }
        for (p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670 : m7675x1626d96d) {
            if (componentCallbacksC1101xa17d4670 != null && str.equals(componentCallbacksC1101xa17d4670.getClass().getCanonicalName())) {
                return componentCallbacksC1101xa17d4670;
            }
        }
        return null;
    }
}
