package com.tencent.mm.plugin.finder.activity.uic;

/* loaded from: classes3.dex */
public final class r0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.activity.uic.c1 f101943d;

    public r0(com.tencent.mm.plugin.finder.activity.uic.c1 c1Var) {
        this.f101943d = c1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/activity/uic/FinderActivityPostUIC$initView$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.activity.uic.c1 c1Var = this.f101943d;
        boolean z17 = false;
        c1Var.U6(false, 0);
        com.tencent.mm.ui.widget.MMEditText mMEditText = c1Var.f101843e;
        if (mMEditText == null) {
            kotlin.jvm.internal.o.o("nameEdit");
            throw null;
        }
        boolean J0 = com.tencent.mm.sdk.platformtools.t8.J0(mMEditText.getText());
        com.tencent.mm.ui.widget.MMEditText mMEditText2 = c1Var.f101844f;
        if (mMEditText2 == null) {
            kotlin.jvm.internal.o.o("descEdit");
            throw null;
        }
        boolean J02 = com.tencent.mm.sdk.platformtools.t8.J0(mMEditText2.getText());
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(c1Var.f101859x);
        android.widget.CheckBox checkBox = c1Var.f101853r;
        if (checkBox == null) {
            kotlin.jvm.internal.o.o("announceCheckBox");
            throw null;
        }
        boolean z18 = checkBox.isChecked();
        if (J0 || K0 || J02) {
            if (J0) {
                com.tencent.mm.ui.widget.MMEditText mMEditText3 = c1Var.f101843e;
                if (mMEditText3 == null) {
                    kotlin.jvm.internal.o.o("nameEdit");
                    throw null;
                }
                mMEditText3.setHintTextColor(c1Var.getResources().getColor(com.tencent.mm.R.color.f478532ac));
            }
            if (J02) {
                com.tencent.mm.ui.widget.MMEditText mMEditText4 = c1Var.f101844f;
                if (mMEditText4 == null) {
                    kotlin.jvm.internal.o.o("descEdit");
                    throw null;
                }
                mMEditText4.setHintTextColor(c1Var.getResources().getColor(com.tencent.mm.R.color.f478532ac));
            }
            if (K0) {
                android.widget.TextView textView = c1Var.f101849n;
                if (textView == null) {
                    kotlin.jvm.internal.o.o("selectTimeText");
                    throw null;
                }
                textView.setHintTextColor(c1Var.getResources().getColor(com.tencent.mm.R.color.f478532ac));
            }
        } else if (z18) {
            z17 = true;
        } else {
            android.view.animation.Animation loadAnimation = android.view.animation.AnimationUtils.loadAnimation(c1Var.getActivity().getApplicationContext(), com.tencent.mm.R.anim.f477787bg);
            kotlin.jvm.internal.o.f(loadAnimation, "loadAnimation(...)");
            android.widget.RelativeLayout relativeLayout = c1Var.f101851p;
            if (relativeLayout == null) {
                kotlin.jvm.internal.o.o("checkkAnnounceContainer");
                throw null;
            }
            relativeLayout.startAnimation(loadAnimation);
        }
        if (z17) {
            androidx.appcompat.app.AppCompatActivity activity = c1Var.getActivity();
            kotlin.jvm.internal.o.g(activity, "activity");
            pf5.z zVar = pf5.z.f353948a;
            if (((com.tencent.mm.plugin.finder.activity.uic.h1) zVar.a(activity).a(com.tencent.mm.plugin.finder.activity.uic.h1.class)).f101888q) {
                androidx.appcompat.app.AppCompatActivity activity2 = c1Var.getActivity();
                kotlin.jvm.internal.o.g(activity2, "activity");
                c1Var.H = ((com.tencent.mm.plugin.finder.activity.uic.h1) zVar.a(activity2).a(com.tencent.mm.plugin.finder.activity.uic.h1.class)).f101887p;
            }
            androidx.appcompat.app.AppCompatActivity activity3 = c1Var.getActivity();
            kotlin.jvm.internal.o.g(activity3, "activity");
            com.tencent.mm.ui.widget.dialog.u3 u3Var = ((com.tencent.mm.plugin.finder.activity.uic.h1) zVar.a(activity3).a(com.tencent.mm.plugin.finder.activity.uic.h1.class)).f101878d;
            if (u3Var != null && !u3Var.isShowing()) {
                u3Var.show();
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(c1Var.H)) {
                c1Var.R6(null);
            } else {
                ((qs2.q) ((w40.e) i95.n0.c(w40.e.class))).getClass();
                mv2.f0 f0Var = mv2.f0.f331561a;
                java.lang.String path = c1Var.H;
                com.tencent.mm.plugin.finder.activity.uic.k0 k0Var = new com.tencent.mm.plugin.finder.activity.uic.k0(c1Var);
                kotlin.jvm.internal.o.g(path, "path");
                mv2.f0.f331562b.b(new mv2.i0(path), k0Var);
            }
        } else {
            com.tencent.mars.xlog.Log.i("FinderActivityPostUIC", "doPost: check post fail");
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/activity/uic/FinderActivityPostUIC$initView$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
