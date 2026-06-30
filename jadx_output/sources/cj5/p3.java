package cj5;

/* loaded from: classes.dex */
public final class p3 implements db5.t6 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cj5.u3 f42214d;

    public p3(cj5.u3 u3Var) {
        this.f42214d = u3Var;
    }

    @Override // db5.t6
    public void a(java.lang.String tag) {
        kotlin.jvm.internal.o.g(tag, "tag");
    }

    @Override // db5.t6
    public void c() {
    }

    @Override // db5.t6
    public void d(java.lang.String tag) {
        kotlin.jvm.internal.o.g(tag, "tag");
    }

    @Override // db5.t6
    public void f(java.lang.String tag) {
        kotlin.jvm.internal.o.g(tag, "tag");
    }

    @Override // db5.t6
    public void g(java.lang.String curText) {
        kotlin.jvm.internal.o.g(curText, "curText");
    }

    @Override // db5.t6
    public void h(java.lang.String tag) {
        wi5.n0 n0Var;
        kotlin.jvm.internal.o.g(tag, "tag");
        cj5.u3 u3Var = this.f42214d;
        u3Var.getClass();
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11225, 1, 0);
        j75.f Q6 = u3Var.Q6();
        if (Q6 == null || (n0Var = (wi5.n0) Q6.getState()) == null) {
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.setClassName(u3Var.getActivity(), "com.tencent.mm.ui.contact.SelectLabelContactUI");
        intent.putExtra("label", tag);
        java.util.HashSet hashSet = new java.util.HashSet();
        hashSet.addAll(wi5.p0.f446333a.a(n0Var.f446319o, n0Var.f446318n, (n0Var.f446314g & 8192) > 0));
        intent.putExtra("always_select_contact", com.tencent.mm.sdk.platformtools.t8.c1(new java.util.ArrayList(hashSet), ","));
        if (n0Var.e()) {
            intent.putExtra("list_attr", com.tencent.mm.ui.contact.i5.g(16384, 64, 131072));
            if (n0Var.f446315h == 14) {
                intent.putExtra("max_limit_num", u3Var.getActivity().getIntent().getIntExtra("max_limit_num", Integer.MAX_VALUE));
            }
        } else {
            intent.putExtra("list_attr", 16384);
        }
        u3Var.getActivity().startActivityForResult(intent, 3);
    }

    @Override // db5.t6
    public void j(boolean z17, int i17) {
    }
}
