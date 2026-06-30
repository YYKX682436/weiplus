package tx2;

/* loaded from: classes3.dex */
public final class x implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tx2.i0 f504204d;

    public x(tx2.i0 i0Var) {
        this.f504204d = i0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/notice/NoticeBigCardWidget$refreshBindCouponView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        tx2.i0 i0Var = this.f504204d;
        java.lang.String str = i0Var.D;
        if (str == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLiveNoticeBigCardWidget", "no anchorFinderUsername");
        } else {
            r45.h32 h32Var = i0Var.C;
            if (h32Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLiveNoticeBigCardWidget", "no noticeInfo");
            } else {
                r45.ov2 a17 = zl2.t.a(h32Var);
                if (a17 == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLiveNoticeBigCardWidget", "no coupon");
                } else {
                    i95.m c17 = i95.n0.c(s40.w0.class);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                    s40.w0 w0Var = (s40.w0) c17;
                    java.lang.String e17 = xy2.c.e(i0Var.f199914d);
                    java.util.LinkedList linkedList = new java.util.LinkedList();
                    java.lang.String m75945x2fec8307 = a17.m75945x2fec8307(1);
                    if (m75945x2fec8307 == null) {
                        m75945x2fec8307 = "";
                    }
                    linkedList.add(m75945x2fec8307);
                    java.lang.String m75945x2fec83072 = h32Var.m75945x2fec8307(4);
                    s40.w0.Fa(w0Var, 0L, 0L, str, e17, null, linkedList, m75945x2fec83072 == null ? "" : m75945x2fec83072, i0Var.f199914d, false, new tx2.w(h32Var, i0Var, a17), 256, null);
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/notice/NoticeBigCardWidget$refreshBindCouponView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
