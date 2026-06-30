package cj5;

/* loaded from: classes.dex */
public final class p3 implements db5.t6 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cj5.u3 f123747d;

    public p3(cj5.u3 u3Var) {
        this.f123747d = u3Var;
    }

    @Override // db5.t6
    public void a(java.lang.String tag) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tag, "tag");
    }

    @Override // db5.t6
    public void c() {
    }

    @Override // db5.t6
    public void d(java.lang.String tag) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tag, "tag");
    }

    @Override // db5.t6
    public void f(java.lang.String tag) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tag, "tag");
    }

    @Override // db5.t6
    public void g(java.lang.String curText) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(curText, "curText");
    }

    @Override // db5.t6
    public void h(java.lang.String tag) {
        wi5.n0 n0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tag, "tag");
        cj5.u3 u3Var = this.f123747d;
        u3Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11225, 1, 0);
        j75.f Q6 = u3Var.Q6();
        if (Q6 == null || (n0Var = (wi5.n0) Q6.mo140437x75286adb()) == null) {
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.setClassName(u3Var.m158354x19263085(), "com.tencent.mm.ui.contact.SelectLabelContactUI");
        intent.putExtra("label", tag);
        java.util.HashSet hashSet = new java.util.HashSet();
        hashSet.addAll(wi5.p0.f527866a.a(n0Var.f527852o, n0Var.f527851n, (n0Var.f527847g & 8192) > 0));
        intent.putExtra("always_select_contact", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(new java.util.ArrayList(hashSet), ","));
        if (n0Var.e()) {
            intent.putExtra("list_attr", com.p314xaae8f345.mm.ui.p2690x38b72420.i5.g(16384, 64, 131072));
            if (n0Var.f527848h == 14) {
                intent.putExtra("max_limit_num", u3Var.m158354x19263085().getIntent().getIntExtra("max_limit_num", Integer.MAX_VALUE));
            }
        } else {
            intent.putExtra("list_attr", 16384);
        }
        u3Var.m158354x19263085().startActivityForResult(intent, 3);
    }

    @Override // db5.t6
    public void j(boolean z17, int i17) {
    }
}
