package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b;

/* loaded from: classes.dex */
public final class aq extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.aq f208013d = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.aq();

    public aq() {
        super(1);
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        boolean z17;
        android.app.Activity activity = (android.app.Activity) obj;
        if (activity != null) {
            i95.m c17 = i95.n0.c(zy2.ca.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            if (((java.lang.Boolean) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.o0().r()).booleanValue()) {
                z17 = true;
            } else {
                java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                z17 = false;
            }
            if (z17) {
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(activity);
                p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.f0();
                f0Var.f391649d = -2;
                android.widget.EditText editText = new android.widget.EditText(activity);
                editText.setHint("maxWidth\n(default:WRAP_CONTENT)");
                editText.setInputType(2);
                editText.addTextChangedListener(new oc2.d(f0Var));
                u1Var.u("json to dsl");
                u1Var.f(java.lang.Boolean.TRUE);
                u1Var.o("json");
                u1Var.d(editText);
                u1Var.b(new oc2.b(f0Var, activity));
                u1Var.q(false);
            }
        }
        return jz5.f0.f384359a;
    }
}
