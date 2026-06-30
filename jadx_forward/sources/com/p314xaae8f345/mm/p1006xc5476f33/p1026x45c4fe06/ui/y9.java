package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui;

/* loaded from: classes7.dex */
public final class y9 {
    public y9(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final boolean a(android.app.Activity activity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "<this>");
        int requestedOrientation = activity.getRequestedOrientation();
        if (requestedOrientation != -1) {
            if (requestedOrientation != 1) {
                return false;
            }
        } else if (1 != activity.getResources().getConfiguration().orientation) {
            return false;
        }
        return true;
    }

    public final boolean b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12666xc288131a activityC12666xc288131a, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.x9 x9Var) {
        java.lang.Class cls;
        android.graphics.Bitmap Y1;
        java.lang.String a17 = bm5.f1.a();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "getProcessName(...)");
        boolean z17 = false;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            cls = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12689x7f595f54.class;
        } else if (r26.i0.n(a17, ":appbrand4", false)) {
            cls = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12688xc20b2400.class;
        } else if (r26.i0.n(a17, ":appbrand3", false)) {
            cls = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12687xc20b23ff.class;
        } else if (r26.i0.n(a17, ":appbrand2", false)) {
            cls = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12686xc20b23fe.class;
        } else {
            if (!r26.i0.n(a17, ":appbrand1", false)) {
                if (r26.i0.n(a17, ":appbrand0", false)) {
                    cls = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12684xc20b23fc.class;
                }
                return false;
            }
            cls = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12685xc20b23fd.class;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.hc q76 = activityC12666xc288131a.q7();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 mo48805xd384d23c = q76 != null ? q76.mo48805xd384d23c() : null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var = mo48805xd384d23c instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6) mo48805xd384d23c : null;
        if (o6Var != null && (Y1 = o6Var.Y1()) != null && !Y1.isRecycled() && Y1.getWidth() > 0 && Y1.getHeight() > 0) {
            int hashCode = activityC12666xc288131a.hashCode();
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12683x695b32b4.f170971h.put(hashCode, Y1);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12683x695b32b4.f170972i.put(hashCode, activityC12666xc288131a);
            android.content.Intent addFlags = new android.content.Intent(activityC12666xc288131a, (java.lang.Class<?>) cls).addFlags(268435456);
            android.view.Window window = activityC12666xc288131a.getWindow();
            if (window != null && window.getDecorView() != null && (window.getDecorView().getSystemUiVisibility() & 8192) != 0) {
                z17 = true;
            }
            addFlags.putExtra("KEY_LIGHT_STATUS_BAR_BOOL", z17);
            addFlags.putExtra("KEY_NAVIGATION_BAR_COLOR_INT", activityC12666xc288131a.getWindow().getNavigationBarColor());
            addFlags.putExtra("KEY_FULLSCREEN_BOOL", com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.na.j(activityC12666xc288131a));
            addFlags.putExtra("KEY_REQUESTED_ORIENTATION_INT", activityC12666xc288131a.getRequestedOrientation());
            addFlags.putExtra("KEY_ACTIVITY_HASH_INT", hashCode);
            addFlags.putExtra("KEY_WORKAROUND_SCENE", x9Var.ordinal());
            activityC12666xc288131a.H7(addFlags, -1, null);
            return true;
        }
        return false;
    }
}
