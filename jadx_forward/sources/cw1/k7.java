package cw1;

/* loaded from: classes11.dex */
public final class k7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13124x71d67823 f304625d;

    public k7(com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13124x71d67823 activityC13124x71d67823) {
        this.f304625d = activityC13124x71d67823;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str;
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13124x71d67823.f177332h;
        com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13124x71d67823 activityC13124x71d67823 = this.f304625d;
        activityC13124x71d67823.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StorageDisableAlertUI", "showDialogView");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1(activityC13124x71d67823);
        activityC13124x71d67823.f177336g = y1Var;
        y1Var.i(false);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var2 = activityC13124x71d67823.f177336g;
        if (y1Var2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("dialog");
            throw null;
        }
        y1Var2.H = false;
        android.view.View inflate = android.view.LayoutInflater.from(activityC13124x71d67823).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.e2z, (android.view.ViewGroup) null);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f565638t45);
        android.widget.TextView textView2 = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.t47);
        android.widget.TextView textView3 = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f565636t43);
        android.widget.TextView textView4 = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f565635t42);
        fp.r0 r0Var = fp.r0.f346765a;
        long j17 = l75.d1.f398479b;
        if (j17 > 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StorageDisableAlert", "getThresholdWording by exptConf, threshold=" + j17);
            str = fp.n0.a(j17);
        } else {
            str = (java.lang.String) r0Var.d().f384376f;
        }
        textView.setText(activityC13124x71d67823.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ndw, str));
        double d17 = activityC13124x71d67823.f177333d;
        if (d17 < 0.0d) {
            textView2.setVisibility(8);
        } else if (d17 < 1.0d) {
            textView2.setText(activityC13124x71d67823.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ndy));
        } else {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append((long) activityC13124x71d67823.f177333d);
            sb6.append('%');
            textView2.setText(activityC13124x71d67823.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ndx, sb6.toString()));
        }
        jx3.f.INSTANCE.d(25984, 201, "", "", "", java.lang.Double.valueOf(activityC13124x71d67823.f177333d));
        textView3.setOnClickListener(new cw1.n7(activityC13124x71d67823));
        textView4.setOnClickListener(new cw1.o7(activityC13124x71d67823));
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var3 = activityC13124x71d67823.f177336g;
        if (y1Var3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("dialog");
            throw null;
        }
        y1Var3.k(inflate);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var4 = activityC13124x71d67823.f177336g;
        if (y1Var4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("dialog");
            throw null;
        }
        y1Var4.s();
        l75.d1.f398482e = true;
        if (z65.c.a()) {
            textView.setOnLongClickListener(new cw1.p7(activityC13124x71d67823));
        } else {
            java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        }
    }
}
