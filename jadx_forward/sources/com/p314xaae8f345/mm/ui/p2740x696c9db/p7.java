package com.p314xaae8f345.mm.ui.p2740x696c9db;

/* loaded from: classes15.dex */
public final class p7 implements db5.o9 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22515xdd3b1ad7 f292171d;

    public p7(com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22515xdd3b1ad7 activityC22515xdd3b1ad7) {
        this.f292171d = activityC22515xdd3b1ad7;
    }

    @Override // db5.o9
    public void O4(java.lang.String str) {
        if (str == null) {
            return;
        }
        com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22515xdd3b1ad7.T6(this.f292171d, str.charAt(0), false);
    }

    @Override // db5.o9
    public void Q0(java.lang.String str) {
        if (str == null) {
            return;
        }
        char charAt = str.charAt(0);
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b("🔍", str);
        com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22515xdd3b1ad7 activityC22515xdd3b1ad7 = this.f292171d;
        if (!b17) {
            activityC22515xdd3b1ad7.f291663x = str;
            com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22515xdd3b1ad7.T6(activityC22515xdd3b1ad7, charAt, true);
        } else {
            android.widget.ListView listView = activityC22515xdd3b1ad7.f291646d;
            if (listView != null) {
                listView.setSelection(0);
            }
        }
    }
}
