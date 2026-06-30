package com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.p1939x36f002;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/offline/util/OfflinePayShortcutReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "plugin-wxpay_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.offline.util.OfflinePayShortcutReceiver */
/* loaded from: classes9.dex */
public final class C16772x4f31765a extends android.content.BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        java.lang.Object obj;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OfflinePayShortcutReceiver", "onReceive: shortcut pinned by user");
        yo3.b.b("offlinePayShortcutCreateSuccess", 1);
        android.app.Activity[] activityArr = new android.app.Activity[3];
        java.lang.ref.WeakReference weakReference = yo3.b.f545676a;
        activityArr[0] = weakReference != null ? (android.app.Activity) weakReference.get() : null;
        java.lang.ref.WeakReference weakReference2 = com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.ActivityC16762xf11130c5.f234019r;
        activityArr[1] = weakReference2 != null ? (android.app.Activity) weakReference2.get() : null;
        java.lang.ref.WeakReference k17 = com.p314xaae8f345.mm.app.w.k();
        activityArr[2] = k17 != null ? (android.app.Activity) k17.get() : null;
        java.util.Iterator it = kz5.c0.i(activityArr).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            android.app.Activity activity = (android.app.Activity) obj;
            if ((activity == null || activity.isFinishing() || activity.isDestroyed()) ? false : true) {
                break;
            }
        }
        android.app.Activity activity2 = (android.app.Activity) obj;
        java.lang.ref.WeakReference weakReference3 = com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.ActivityC16762xf11130c5.f234018q;
        if (weakReference3 != null && (z2Var = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2) weakReference3.get()) != null && z2Var.h()) {
            z2Var.B();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.ActivityC16762xf11130c5.f234018q = null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.ActivityC16762xf11130c5.f234019r = null;
        java.lang.ref.WeakReference weakReference4 = com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.ActivityC16762xf11130c5.f234020s;
        com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.ActivityC16762xf11130c5 activityC16762xf11130c5 = weakReference4 != null ? (com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.ActivityC16762xf11130c5) weakReference4.get() : null;
        if (activityC16762xf11130c5 != null && !activityC16762xf11130c5.isFinishing() && !activityC16762xf11130c5.isDestroyed()) {
            activityC16762xf11130c5.f234021d = 3;
            android.view.View view = activityC16762xf11130c5.f234023f;
            if (view == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mStep1Dot");
                throw null;
            }
            activityC16762xf11130c5.V6(view, 16);
            android.view.View view2 = activityC16762xf11130c5.f234023f;
            if (view2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mStep1Dot");
                throw null;
            }
            view2.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.d7g);
            android.view.View view3 = activityC16762xf11130c5.f234024g;
            if (view3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mStep2Dot");
                throw null;
            }
            activityC16762xf11130c5.V6(view3, 16);
            android.view.View view4 = activityC16762xf11130c5.f234024g;
            if (view4 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mStep2Dot");
                throw null;
            }
            view4.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.d7g);
            android.view.View view5 = activityC16762xf11130c5.f234025h;
            if (view5 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mStepLine");
                throw null;
            }
            view5.setBackgroundColor(activityC16762xf11130c5.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560035m));
            android.widget.TextView textView = activityC16762xf11130c5.f234026i;
            if (textView == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mStep1Text");
                throw null;
            }
            textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.pg6);
            android.widget.TextView textView2 = activityC16762xf11130c5.f234026i;
            if (textView2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mStep1Text");
                throw null;
            }
            textView2.setTextColor(activityC16762xf11130c5.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560035m));
            android.widget.TextView textView3 = activityC16762xf11130c5.f234027m;
            if (textView3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mStep2Text");
                throw null;
            }
            textView3.setTextColor(activityC16762xf11130c5.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560035m));
            android.widget.TextView textView4 = activityC16762xf11130c5.f234028n;
            if (textView4 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mGuideTitle");
                throw null;
            }
            textView4.setText(com.p314xaae8f345.mm.R.C30867xcad56011.pg9);
            android.widget.Button button = activityC16762xf11130c5.f234029o;
            if (button == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mGuideBtn");
                throw null;
            }
            button.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f575405pg2);
            android.widget.Button button2 = activityC16762xf11130c5.f234029o;
            if (button2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mGuideBtn");
                throw null;
            }
            button2.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562596jr);
            android.widget.Button button3 = activityC16762xf11130c5.f234029o;
            if (button3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mGuideBtn");
                throw null;
            }
            button3.setTextColor(activityC16762xf11130c5.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77654xad7ef30));
            android.widget.Button button4 = activityC16762xf11130c5.f234029o;
            if (button4 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mGuideBtn");
                throw null;
            }
            button4.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.f1(activityC16762xf11130c5));
            yo3.b.b("offlinePayShortcutGuideStep3Show", 2);
        }
        if (activity2 != null) {
            int i17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(activity2);
            e4Var.f293309c = activity2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.pek);
            e4Var.b(com.p314xaae8f345.mm.R.raw.f80084xebd378da);
            e4Var.c();
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.OfflinePayShortcutReceiver", "onReceive: no activity available for WeToast");
        }
        yo3.b.f545676a = null;
    }
}
