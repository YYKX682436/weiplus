package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4;

/* loaded from: classes5.dex */
public final class u3 extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f198980d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f198981e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f198982f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f198983g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f198984h;

    /* renamed from: i, reason: collision with root package name */
    public r45.v11 f198985i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u3(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    public final void T6(android.view.View view, java.lang.String title, java.lang.String subtitle, yz5.a action) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(title, "title");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(subtitle, "subtitle");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(action, "action");
        android.widget.TextView textView = view != null ? (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.obc) : null;
        if (textView != null) {
            textView.setText(title);
        }
        android.widget.TextView textView2 = view != null ? (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.nrk) : null;
        if (textView2 != null) {
            textView2.setText(subtitle);
        }
        if (view != null) {
            view.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.n3(action));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0028, code lost:
    
        if (r0 == false) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void U6() {
        /*
            r4 = this;
            java.lang.String r0 = r4.f198980d
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L13
            int r0 = r0.length()
            if (r0 <= 0) goto Le
            r0 = r1
            goto Lf
        Le:
            r0 = r2
        Lf:
            if (r0 != r1) goto L13
            r0 = r1
            goto L14
        L13:
            r0 = r2
        L14:
            if (r0 == 0) goto L2b
            java.lang.String r0 = r4.f198981e
            if (r0 == 0) goto L27
            int r0 = r0.length()
            if (r0 <= 0) goto L22
            r0 = r1
            goto L23
        L22:
            r0 = r2
        L23:
            if (r0 != r1) goto L27
            r0 = r1
            goto L28
        L27:
            r0 = r2
        L28:
            if (r0 == 0) goto L2b
            goto L2c
        L2b:
            r1 = r2
        L2c:
            android.widget.TextView r0 = r4.f198984h
            if (r0 != 0) goto L31
            goto L34
        L31:
            r0.setEnabled(r1)
        L34:
            android.widget.TextView r0 = r4.f198984h
            if (r0 == 0) goto L4c
            androidx.appcompat.app.AppCompatActivity r2 = r4.m158354x19263085()
            if (r1 == 0) goto L42
            r3 = 2131099825(0x7f0600b1, float:1.7812014E38)
            goto L45
        L42:
            r3 = 2131099901(0x7f0600fd, float:1.7812168E38)
        L45:
            int r2 = r2.getColor(r3)
            r0.setTextColor(r2)
        L4c:
            android.widget.TextView r0 = r4.f198984h
            if (r0 != 0) goto L51
            goto L77
        L51:
            android.graphics.drawable.GradientDrawable r2 = new android.graphics.drawable.GradientDrawable
            r2.<init>()
            androidx.appcompat.app.AppCompatActivity r3 = r4.m158354x19263085()
            if (r1 == 0) goto L60
            r1 = 2131099789(0x7f06008d, float:1.7811941E38)
            goto L63
        L60:
            r1 = 2131099828(0x7f0600b4, float:1.781202E38)
        L63:
            int r1 = r3.getColor(r1)
            r2.setColor(r1)
            r1 = 8
            int r1 = pm0.v.S(r1)
            float r1 = (float) r1
            r2.setCornerRadius(r1)
            r0.setBackground(r2)
        L77:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.u3.U6():void");
    }

    public final void V6(android.view.View view, boolean z17) {
        if (view != null) {
            view.setEnabled(!z17);
        }
        android.widget.TextView textView = view != null ? (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.nhj) : null;
        if (textView != null) {
            textView.setText(m158354x19263085().getString(z17 ? com.p314xaae8f345.mm.R.C30867xcad56011.opc : com.p314xaae8f345.mm.R.C30867xcad56011.opd));
        }
        if (textView != null) {
            textView.setTextColor(m158354x19263085().getColor(z17 ? com.p314xaae8f345.mm.R.C30859x5a72f63.f560035m : com.p314xaae8f345.mm.R.C30859x5a72f63.f560065ac));
        }
        android.view.View findViewById = view != null ? view.findViewById(com.p314xaae8f345.mm.R.id.a4f) : null;
        if (findViewById == null) {
            return;
        }
        int i17 = z17 ? 4 : 0;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/viewmodel/FinderLiveCashOutMultiAuthUIC", "updateSubtypeView", "(Landroid/view/View;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/live/viewmodel/FinderLiveCashOutMultiAuthUIC", "updateSubtypeView", "(Landroid/view/View;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: getLayoutId */
    public int mo569x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.e9_;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        android.view.View findViewById;
        r45.v11 v11Var = new r45.v11();
        byte[] byteArrayExtra = m158354x19263085().getIntent().getByteArrayExtra("FinderLiveCashOutMuliAuth.KEY_MULTI_AUTH_DATA");
        if (byteArrayExtra != null) {
            try {
                v11Var.mo11468x92b714fd(byteArrayExtra);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("safeParser", "", e17);
            }
        }
        this.f198985i = v11Var;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = m158354x19263085 instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf ? (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) m158354x19263085 : null;
        if (abstractActivityC21394xb3d2c0cf != null) {
            abstractActivityC21394xb3d2c0cf.mo56583xbf7c1df6((java.lang.CharSequence) "");
        }
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x192630852 = m158354x19263085();
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf2 = m158354x192630852 instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf ? (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) m158354x192630852 : null;
        if (abstractActivityC21394xb3d2c0cf2 != null) {
            abstractActivityC21394xb3d2c0cf2.m78561xe5bc8f21(com.p314xaae8f345.mm.R.C30859x5a72f63.f560024c);
        }
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x192630853 = m158354x19263085();
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf3 = m158354x192630853 instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf ? (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) m158354x192630853 : null;
        if (abstractActivityC21394xb3d2c0cf3 != null) {
            abstractActivityC21394xb3d2c0cf3.mo64405x4dab7448(m158354x19263085().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560024c));
        }
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x192630854 = m158354x19263085();
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf4 = m158354x192630854 instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf ? (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) m158354x192630854 : null;
        if (abstractActivityC21394xb3d2c0cf4 != null) {
            abstractActivityC21394xb3d2c0cf4.mo78530x8b45058f();
        }
        android.view.View findViewById2 = m80380x71e92c1d().findViewById(com.p314xaae8f345.mm.R.id.uwm);
        this.f198982f = findViewById2;
        java.lang.String string = m158354x19263085().getString(com.p314xaae8f345.mm.R.C30867xcad56011.opb);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        java.lang.String string2 = m158354x19263085().getString(com.p314xaae8f345.mm.R.C30867xcad56011.opa);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
        T6(findViewById2, string, string2, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.p3(this));
        V6(this.f198982f, false);
        android.view.View findViewById3 = m80380x71e92c1d().findViewById(com.p314xaae8f345.mm.R.id.ku_);
        this.f198983g = findViewById3;
        if (findViewById3 != null && (findViewById = findViewById3.findViewById(com.p314xaae8f345.mm.R.id.ofy)) != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            int intValue = ((java.lang.Integer) arrayList.get(0)).intValue();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(java.lang.Integer.valueOf(intValue));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/viewmodel/FinderLiveCashOutMultiAuthUIC", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/live/viewmodel/FinderLiveCashOutMultiAuthUIC", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            yj0.a.f(findViewById, "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View view = this.f198983g;
        java.lang.String string3 = m158354x19263085().getString(com.p314xaae8f345.mm.R.C30867xcad56011.op_);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string3, "getString(...)");
        java.lang.String string4 = m158354x19263085().getString(com.p314xaae8f345.mm.R.C30867xcad56011.op9);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string4, "getString(...)");
        T6(view, string3, string4, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.r3(this));
        V6(this.f198983g, false);
        android.widget.TextView textView = (android.widget.TextView) m80380x71e92c1d().findViewById(com.p314xaae8f345.mm.R.id.t4m);
        this.f198984h = textView;
        if (textView != null) {
            textView.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.t3(this));
        }
        U6();
    }
}
