package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic;

/* loaded from: classes3.dex */
public final class h1 extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f183411d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f183412e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f183413f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f183414g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f183415h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.ImageView f183416i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.ImageView f183417m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f183418n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f183419o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f183420p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f183421q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f183422r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f183420p = "";
    }

    public static final void O6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic.h1 h1Var) {
        h1Var.getClass();
        if (!gm0.j1.u().l()) {
            db5.t7.l(h1Var.m158354x19263085());
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("album_min_ratio_limit", 0.33333334f);
        intent.putExtra("album_max_ratio_limit", 3.0f);
        vb0.o oVar = (vb0.o) i95.n0.c(vb0.o.class);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = h1Var.m158354x19263085();
        ((ub0.r) oVar).getClass();
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.l7.h(m158354x19263085, com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54075xb707b059, intent);
    }

    public final void P6() {
        this.f183422r = true;
        int color = m158361x893a2f6f().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560513mj);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158354x19263085, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) m158354x19263085).mo78514x143f1b92().O0(true);
        android.widget.ImageView imageView = this.f183416i;
        if (imageView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("coverImageView");
            throw null;
        }
        imageView.setVisibility(0);
        android.widget.ImageView imageView2 = this.f183417m;
        if (imageView2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("coverMaskImageView");
            throw null;
        }
        imageView2.setVisibility(0);
        android.view.View view = this.f183418n;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("coverMaskContainer");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/activity/uic/FinderActivitySelectCoverUIC", "onCoverSet", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/activity/uic/FinderActivitySelectCoverUIC", "onCoverSet", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.widget.TextView textView = this.f183414g;
        if (textView != null) {
            textView.setText(m158361x893a2f6f().getString(com.p314xaae8f345.mm.R.C30867xcad56011.cii));
        }
        android.widget.TextView textView2 = this.f183414g;
        if (textView2 != null) {
            textView2.setTextColor(color);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = this.f183419o;
        if (c22699x3dcdb352 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("addCoverIcon");
            throw null;
        }
        c22699x3dcdb352.m82040x7541828(color);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3522 = this.f183419o;
        if (c22699x3dcdb3522 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("addCoverIcon");
            throw null;
        }
        c22699x3dcdb3522.setImageResource(com.p314xaae8f345.mm.R.raw.f79697xe8d412c3);
        android.view.View view2 = this.f183413f;
        if (view2 != null) {
            view2.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f563046v9);
        }
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic.c1 c1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic.c1) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic.c1.class);
        int color2 = c1Var.m158361x893a2f6f().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560515ml);
        android.widget.TextView textView3 = c1Var.f183378g;
        if (textView3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("nickNameText");
            throw null;
        }
        textView3.setTextColor(c1Var.m158361x893a2f6f().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77681x8113c230));
        c1Var.T6(color2);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = c1Var.f183376e;
        if (c22621x7603e017 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("nameEdit");
            throw null;
        }
        c22621x7603e017.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.aau);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e0172 = c1Var.f183377f;
        if (c22621x7603e0172 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("descEdit");
            throw null;
        }
        c22621x7603e0172.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.aau);
        android.widget.TextView textView4 = c1Var.f183382n;
        if (textView4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("selectTimeText");
            throw null;
        }
        textView4.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.aau);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e0173 = c1Var.f183376e;
        if (c22621x7603e0173 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("nameEdit");
            throw null;
        }
        c22621x7603e0173.setHintTextColor(c1Var.m158361x893a2f6f().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560518mo));
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e0174 = c1Var.f183377f;
        if (c22621x7603e0174 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("descEdit");
            throw null;
        }
        c22621x7603e0174.setHintTextColor(c1Var.m158361x893a2f6f().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560518mo));
        android.widget.TextView textView5 = c1Var.f183382n;
        if (textView5 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("selectTimeText");
            throw null;
        }
        textView5.setHintTextColor(c1Var.m158361x893a2f6f().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560518mo));
        c1Var.S6(true);
    }

    public final void Q6() {
        this.f183422r = false;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158354x19263085, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) m158354x19263085).mo78514x143f1b92().O0(com.p314xaae8f345.mm.ui.bk.C());
        android.widget.ImageView imageView = this.f183416i;
        if (imageView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("coverImageView");
            throw null;
        }
        imageView.setVisibility(8);
        android.widget.ImageView imageView2 = this.f183417m;
        if (imageView2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("coverMaskImageView");
            throw null;
        }
        imageView2.setVisibility(8);
        android.view.View view = this.f183418n;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("coverMaskContainer");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/activity/uic/FinderActivitySelectCoverUIC", "onCoverUnset", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/activity/uic/FinderActivitySelectCoverUIC", "onCoverUnset", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        int color = m158361x893a2f6f().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832);
        android.widget.TextView textView = this.f183414g;
        if (textView != null) {
            textView.setTextColor(color);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = this.f183419o;
        if (c22699x3dcdb352 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("addCoverIcon");
            throw null;
        }
        c22699x3dcdb352.m82040x7541828(color);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3522 = this.f183419o;
        if (c22699x3dcdb3522 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("addCoverIcon");
            throw null;
        }
        c22699x3dcdb3522.setImageResource(com.p314xaae8f345.mm.R.raw.f79524x294297ca);
        android.view.View view2 = this.f183413f;
        if (view2 != null) {
            view2.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f563045v8);
        }
        android.widget.TextView textView2 = this.f183414g;
        if (textView2 != null) {
            textView2.setText(m158361x893a2f6f().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ci9));
        }
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic.c1 c1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic.c1) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic.c1.class);
        c1Var.T6(c1Var.m158361x893a2f6f().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560247f5));
        android.widget.TextView textView3 = c1Var.f183378g;
        if (textView3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("nickNameText");
            throw null;
        }
        textView3.setTextColor(c1Var.m158361x893a2f6f().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832));
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = c1Var.f183376e;
        if (c22621x7603e017 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("nameEdit");
            throw null;
        }
        c22621x7603e017.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.aat);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e0172 = c1Var.f183376e;
        if (c22621x7603e0172 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("nameEdit");
            throw null;
        }
        c22621x7603e0172.setHintTextColor(c1Var.m158361x893a2f6f().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77640xad7ef2a));
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e0173 = c1Var.f183377f;
        if (c22621x7603e0173 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("descEdit");
            throw null;
        }
        c22621x7603e0173.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.aat);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e0174 = c1Var.f183377f;
        if (c22621x7603e0174 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("descEdit");
            throw null;
        }
        c22621x7603e0174.setHintTextColor(c1Var.m158361x893a2f6f().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77640xad7ef2a));
        android.widget.TextView textView4 = c1Var.f183382n;
        if (textView4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("selectTimeText");
            throw null;
        }
        textView4.setHintTextColor(c1Var.m158361x893a2f6f().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77640xad7ef2a));
        android.widget.TextView textView5 = c1Var.f183382n;
        if (textView5 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("selectTimeText");
            throw null;
        }
        textView5.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.aat);
        c1Var.S6(false);
    }

    public final void R6(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || !com.p314xaae8f345.mm.vfs.w6.j(str)) {
            db5.t7.m123882x26a183b(m158354x19263085(), com.p314xaae8f345.mm.R.C30867xcad56011.cih, 0).show();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(pf5.o.TAG, "ERROR! filePath=" + str);
            return;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f183411d;
        if (u3Var != null && !u3Var.isShowing()) {
            u3Var.show();
        }
        this.f183421q = true;
        this.f183420p = str == null ? "" : str;
        S6(str);
        P6();
    }

    public final void S6(java.lang.String str) {
        mn2.j0 j0Var = new mn2.j0(str == null ? "" : str);
        mn2.g1 g1Var = mn2.g1.f411508a;
        wo0.c a17 = g1Var.e().a(j0Var);
        a17.g(g1Var.h(mn2.f1.f411499t));
        a17.f529406d = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic.g1(str, this);
        android.widget.ImageView imageView = this.f183416i;
        if (imageView != null) {
            a17.c(imageView);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("coverImageView");
            throw null;
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onActivityResult */
    public void mo2273x9d4787cb(int i17, int i18, android.content.Intent intent) {
        super.mo2273x9d4787cb(i17, i18, intent);
        if (intent == null || i18 != -1) {
            return;
        }
        switch (i17) {
            case com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54075xb707b059 /* 20000 */:
                android.net.Uri data = intent.getData();
                java.lang.String inputPath = data != null ? data.getPath() : null;
                if (inputPath == null || inputPath.length() == 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(pf5.o.TAG, "filePath is null.try to getResultPhotoPath.");
                    vb0.o oVar = (vb0.o) i95.n0.c(vb0.o.class);
                    p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.e9 e9Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.e9.f183665a;
                    java.lang.String str = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.e9.f183676l;
                    ((ub0.r) oVar).getClass();
                    inputPath = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.l7.b(m158354x19263085, intent, str);
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(pf5.o.TAG, "filePath[" + inputPath + "] " + intent);
                if (inputPath == null || inputPath.length() == 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(pf5.o.TAG, "filePath is null.");
                    return;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0 i0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class);
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 context = m158354x19263085();
                i0Var.getClass();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(inputPath, "inputPath");
                com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624.b(inputPath, "");
                b17.F = 11;
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putFloat("crop_fix_ratio", 0.75f);
                b17.M = bundle;
                ((w40.e) i95.n0.c(w40.e.class)).getClass();
                b17.a(1, "com.tencent.mm.plugin.finder.edit.FinderFixRatioPhoneEditPluginLayout");
                ut3.f.f512709c.f512710a = null;
                ut3.m.f512715a.f(context, 20002, com.p314xaae8f345.mm.R.C30854x2dc211.f559261p, com.p314xaae8f345.mm.R.C30854x2dc211.f559261p, b17, 1, 1);
                return;
            case 20001:
                R6(intent.getStringExtra("key_result_img_path"));
                return;
            case 20002:
                com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16991x15ced046 c16991x15ced046 = (com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16991x15ced046) intent.getParcelableExtra("KSEGMENTMEDIAINFO");
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("REQUEST_CODE_CROP_FIX_IMAGE model: ");
                sb6.append(c16991x15ced046 != null ? c16991x15ced046.f237195f : null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(pf5.o.TAG, sb6.toString());
                if (c16991x15ced046 != null) {
                    java.lang.Boolean bool = c16991x15ced046.f237197h;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bool, "getPhoto(...)");
                    if (!bool.booleanValue() || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c16991x15ced046.f237195f)) {
                        db5.t7.m123882x26a183b(m158354x19263085(), com.p314xaae8f345.mm.R.C30867xcad56011.cih, 0).show();
                        return;
                    } else {
                        R6(c16991x15ced046.f237195f);
                        return;
                    }
                }
                return;
            default:
                return;
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onCreateAfter */
    public void mo739xfd763ae1(android.os.Bundle bundle) {
        super.mo739xfd763ae1(bundle);
        android.view.View findViewById = m158354x19263085().findViewById(com.p314xaae8f345.mm.R.id.f564104i3);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f183416i = (android.widget.ImageView) findViewById;
        android.view.View findViewById2 = m158354x19263085().findViewById(com.p314xaae8f345.mm.R.id.f565960e92);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f183419o = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) findViewById2;
        android.view.View findViewById3 = m158354x19263085().findViewById(com.p314xaae8f345.mm.R.id.f564107i6);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f183417m = (android.widget.ImageView) findViewById3;
        android.view.View findViewById4 = m158354x19263085().findViewById(com.p314xaae8f345.mm.R.id.f564106i5);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        this.f183418n = findViewById4;
        android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158354x19263085, "null cannot be cast to non-null type android.app.Activity");
        m158354x19263085.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        float f17 = displayMetrics.widthPixels / 0.75f;
        android.widget.ImageView imageView = this.f183417m;
        android.view.View view = null;
        if (imageView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("coverMaskImageView");
            throw null;
        }
        android.view.ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        layoutParams.height = (int) f17;
        android.widget.ImageView imageView2 = this.f183417m;
        if (imageView2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("coverMaskImageView");
            throw null;
        }
        imageView2.setLayoutParams(layoutParams);
        this.f183413f = m158354x19263085().findViewById(com.p314xaae8f345.mm.R.id.f565959e91);
        this.f183414g = (android.widget.TextView) m158354x19263085().findViewById(com.p314xaae8f345.mm.R.id.f565961e93);
        this.f183411d = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3.c(m158354x19263085(), m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.f572137zq), false, 0, null);
        this.f183412e = m158354x19263085().findViewById(com.p314xaae8f345.mm.R.id.f565956e84);
        android.view.View findViewById5 = m158354x19263085().findViewById(com.p314xaae8f345.mm.R.id.e88);
        if (findViewById5 != null) {
            findViewById5.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic.d1(this));
            view = findViewById5;
        }
        this.f183415h = view;
        java.lang.String stringExtra = m158359x1e885992().getStringExtra("key_activity_local_cover_url");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
            Q6();
        } else {
            S6(stringExtra);
            P6();
        }
        android.view.View view2 = this.f183413f;
        if (view2 != null) {
            view2.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic.e1(this));
        }
    }
}
