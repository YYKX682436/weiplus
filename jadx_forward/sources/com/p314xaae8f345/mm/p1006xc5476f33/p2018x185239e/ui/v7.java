package com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui;

/* loaded from: classes5.dex */
public final class v7 implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f239528d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.C17147x9fa5370e f239529e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 f239530f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f239531g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f239532h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f239533i;

    public v7(android.widget.TextView textView, com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.C17147x9fa5370e c17147x9fa5370e, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var, p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var2, java.util.ArrayList arrayList) {
        this.f239528d = textView;
        this.f239529e = c17147x9fa5370e;
        this.f239530f = z2Var;
        this.f239531g = c0Var;
        this.f239532h = c0Var2;
        this.f239533i = arrayList;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable s17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(s17, "s");
        int length = s17.toString().length();
        java.lang.Integer valueOf = java.lang.Integer.valueOf(length);
        com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.C17147x9fa5370e c17147x9fa5370e = this.f239529e;
        java.lang.String format = java.lang.String.format("%s/%s", java.util.Arrays.copyOf(new java.lang.Object[]{valueOf, java.lang.Integer.valueOf(c17147x9fa5370e.f239095e)}, 2));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
        android.widget.TextView textView = this.f239528d;
        textView.setText(format);
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf activity = c17147x9fa5370e.f239094d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        ((com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.r1) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.r1.class)).m42291x53d8522f("desc_length_key", java.lang.String.valueOf(length));
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf activity2 = c17147x9fa5370e.f239094d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity2, "activity");
        ((com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.r1) pf5.z.f435481a.a(activity2).a(com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.r1.class)).m42291x53d8522f("desc_max_length_key", java.lang.String.valueOf(c17147x9fa5370e.f239095e));
        int i17 = c17147x9fa5370e.f239095e;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var = this.f239530f;
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = this.f239531g;
        if (length > i17) {
            z2Var.b(false);
            textView.setTextColor(c17147x9fa5370e.f239094d.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560065ac));
            textView.setVisibility(0);
            if (!c0Var.f391645d && c17147x9fa5370e.f239097g == com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.l7.f239340d) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(22750, 6, c17147x9fa5370e.f239096f);
            }
            c0Var.f391645d = true;
        } else {
            z2Var.b(true);
            textView.setVisibility(4);
            c0Var.f391645d = false;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var2 = this.f239532h;
        if (c0Var2.f391645d) {
            c0Var2.f391645d = false;
            return;
        }
        java.util.ArrayList arrayList = this.f239533i;
        if (arrayList.isEmpty() || !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(kz5.n0.i0(arrayList), "1")) {
            arrayList.add("1");
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence s17, int i17, int i18, int i19) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(s17, "s");
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence s17, int i17, int i18, int i19) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(s17, "s");
    }
}
