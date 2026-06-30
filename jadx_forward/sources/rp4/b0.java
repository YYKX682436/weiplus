package rp4;

/* loaded from: classes10.dex */
public final class b0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f480145d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rp4.f0 f480146e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f480147f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(java.lang.String str, rp4.f0 f0Var, int i17) {
        super(0);
        this.f480145d = str;
        this.f480146e = f0Var;
        this.f480147f = i17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        rp4.f0 f0Var = this.f480146e;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f480145d, f0Var.f480170o)) {
            if (!f0Var.B) {
                ju3.d0 d0Var = f0Var.f480163e;
                if (d0Var != null) {
                    ju3.d0.k(d0Var, ju3.c0.L2, null, 2, null);
                }
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2762x1410e13c.C22703xb395948f c22703xb395948f = f0Var.f480179x;
                if (c22703xb395948f != null) {
                    c22703xb395948f.m82049x3ae760af(0);
                }
                android.view.View view = f0Var.f480178w;
                if (view != null) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList.add(0);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/vlog/ui/video/VideoCompositionRemuxPlugin$initProgress$3$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(view, "com/tencent/mm/plugin/vlog/ui/video/VideoCompositionRemuxPlugin$initProgress$3$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                f0Var.B = true;
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2762x1410e13c.C22703xb395948f c22703xb395948f2 = f0Var.f480179x;
            if (c22703xb395948f2 != null) {
                c22703xb395948f2.m82049x3ae760af(this.f480147f);
            }
        }
        return jz5.f0.f384359a;
    }
}
