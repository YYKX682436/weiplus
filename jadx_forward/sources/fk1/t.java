package fk1;

/* loaded from: classes8.dex */
public final class t implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1210xc8466c51.ActivityC12732x6baffca6 f344824d;

    public t(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1210xc8466c51.ActivityC12732x6baffca6 activityC12732x6baffca6) {
        this.f344824d = activityC12732x6baffca6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1210xc8466c51.ActivityC12732x6baffca6 activityC12732x6baffca6 = this.f344824d;
        android.widget.Button button = activityC12732x6baffca6.f171720m;
        if (button == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("shareButton");
            throw null;
        }
        android.widget.Button button2 = activityC12732x6baffca6.f171719i;
        if (button2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("stashButton");
            throw null;
        }
        activityC12732x6baffca6.Y6(button, button2);
        android.widget.TextView textView = activityC12732x6baffca6.f171721n;
        if (textView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("shareText");
            throw null;
        }
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.f0 f0Var = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.f0(activityC12732x6baffca6.getString(com.p314xaae8f345.mm.R.C30867xcad56011.a1o));
        f0Var.c(((ke0.e) ((le0.u) i95.n0.c(le0.u.class))).Di("", b3.l.m9702x7444d5ad(activityC12732x6baffca6, com.p314xaae8f345.mm.R.C30859x5a72f63.f560841vo), b3.l.m9702x7444d5ad(activityC12732x6baffca6, com.p314xaae8f345.mm.R.C30859x5a72f63.f77636xad7ef29), true, new fk1.r(activityC12732x6baffca6)), 7, 16, 18);
        textView.setText(f0Var);
        textView.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
        db5.t7.h(activityC12732x6baffca6, activityC12732x6baffca6.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.a1n));
    }
}
