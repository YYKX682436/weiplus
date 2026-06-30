package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic;

/* loaded from: classes3.dex */
public final class r0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic.c1 f183476d;

    public r0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic.c1 c1Var) {
        this.f183476d = c1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/activity/uic/FinderActivityPostUIC$initView$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic.c1 c1Var = this.f183476d;
        boolean z17 = false;
        c1Var.U6(false, 0);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = c1Var.f183376e;
        if (c22621x7603e017 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("nameEdit");
            throw null;
        }
        boolean J0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.J0(c22621x7603e017.getText());
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e0172 = c1Var.f183377f;
        if (c22621x7603e0172 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("descEdit");
            throw null;
        }
        boolean J02 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.J0(c22621x7603e0172.getText());
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c1Var.f183392x);
        android.widget.CheckBox checkBox = c1Var.f183386r;
        if (checkBox == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("announceCheckBox");
            throw null;
        }
        boolean z18 = checkBox.isChecked();
        if (J0 || K0 || J02) {
            if (J0) {
                com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e0173 = c1Var.f183376e;
                if (c22621x7603e0173 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("nameEdit");
                    throw null;
                }
                c22621x7603e0173.setHintTextColor(c1Var.m158361x893a2f6f().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560065ac));
            }
            if (J02) {
                com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e0174 = c1Var.f183377f;
                if (c22621x7603e0174 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("descEdit");
                    throw null;
                }
                c22621x7603e0174.setHintTextColor(c1Var.m158361x893a2f6f().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560065ac));
            }
            if (K0) {
                android.widget.TextView textView = c1Var.f183382n;
                if (textView == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("selectTimeText");
                    throw null;
                }
                textView.setHintTextColor(c1Var.m158361x893a2f6f().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560065ac));
            }
        } else if (z18) {
            z17 = true;
        } else {
            android.view.animation.Animation loadAnimation = android.view.animation.AnimationUtils.loadAnimation(c1Var.m158354x19263085().getApplicationContext(), com.p314xaae8f345.mm.R.C30854x2dc211.f559320bg);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(loadAnimation, "loadAnimation(...)");
            android.widget.RelativeLayout relativeLayout = c1Var.f183384p;
            if (relativeLayout == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("checkkAnnounceContainer");
                throw null;
            }
            relativeLayout.startAnimation(loadAnimation);
        }
        if (z17) {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = c1Var.m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
            pf5.z zVar = pf5.z.f435481a;
            if (((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic.h1) zVar.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic.h1.class)).f183421q) {
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity2 = c1Var.m158354x19263085();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity2, "activity");
                c1Var.H = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic.h1) zVar.a(activity2).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic.h1.class)).f183420p;
            }
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity3 = c1Var.m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity3, "activity");
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic.h1) zVar.a(activity3).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic.h1.class)).f183411d;
            if (u3Var != null && !u3Var.isShowing()) {
                u3Var.show();
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c1Var.H)) {
                c1Var.R6(null);
            } else {
                ((qs2.q) ((w40.e) i95.n0.c(w40.e.class))).getClass();
                mv2.f0 f0Var = mv2.f0.f413094a;
                java.lang.String path = c1Var.H;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic.k0 k0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic.k0(c1Var);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
                mv2.f0.f413095b.b(new mv2.i0(path), k0Var);
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderActivityPostUIC", "doPost: check post fail");
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/activity/uic/FinderActivityPostUIC$initView$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
