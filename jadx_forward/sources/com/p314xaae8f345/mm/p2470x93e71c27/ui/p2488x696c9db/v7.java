package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db;

/* loaded from: classes3.dex */
public abstract class v7 {

    /* renamed from: a, reason: collision with root package name */
    public static int f273490a = -1;

    public static void a(android.view.View view, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19747xde723c7 c19747xde723c7) {
        if (view != null && c19747xde723c7 != null) {
            if (view.getVisibility() == 0) {
                c19747xde723c7.addOnLayoutChangeListener(new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.u7(view));
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("VideoSightHelper", "null view object " + view + "," + c19747xde723c7);
        }
    }
}
