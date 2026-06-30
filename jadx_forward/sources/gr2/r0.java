package gr2;

/* loaded from: classes2.dex */
public final class r0 implements oa.c {
    @Override // oa.c
    public void h0(oa.i t17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(t17, "t");
    }

    @Override // oa.c
    public void l4(oa.i t17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(t17, "t");
        java.lang.Object obj = t17.f425311a;
        if (obj instanceof gr2.q0) {
            gr2.q0 q0Var = (gr2.q0) obj;
            android.widget.TextView textView = q0Var.f356351c;
            if (textView != null) {
                android.view.View view = q0Var.f356350b.f425316f;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view);
                textView.setTextColor(view.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560785u4));
            }
            q0Var.a(false);
        }
    }

    @Override // oa.c
    public void u1(oa.i t17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(t17, "t");
        java.lang.Object obj = t17.f425311a;
        if (obj instanceof gr2.q0) {
            gr2.q0 q0Var = (gr2.q0) obj;
            android.widget.TextView textView = q0Var.f356351c;
            if (textView != null) {
                android.view.View view = q0Var.f356350b.f425316f;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view);
                textView.setTextColor(view.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaz));
            }
            q0Var.a(true);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.ThemeTagListWidget", "onTabSelected position = " + t17.f425315e);
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5685xa20ebe4d c5685xa20ebe4d = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5685xa20ebe4d();
            int i17 = q0Var.f356353e;
            am.bj bjVar = c5685xa20ebe4d.f136011g;
            bjVar.f87791b = i17;
            bjVar.f87790a = 1;
            c5685xa20ebe4d.e();
        }
    }
}
