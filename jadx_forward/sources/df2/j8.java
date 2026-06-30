package df2;

/* loaded from: classes3.dex */
public final class j8 implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.s8 f311988d;

    public j8(df2.s8 s8Var) {
        this.f311988d = s8Var;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        java.util.LinkedList m75941xfb821914;
        r45.nz3 nz3Var;
        r45.e84 e84Var = (r45.e84) obj;
        if (e84Var == null || e84Var.m75933x41a8a7f2(8)) {
            return;
        }
        df2.s8 s8Var = this.f311988d;
        if (s8Var.h7(e84Var)) {
            return;
        }
        java.util.LinkedList m75941xfb8219142 = e84Var.m75941xfb821914(2);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb8219142, "getItem_list(...)");
        r45.nz3 nz3Var2 = (r45.nz3) kz5.n0.Z(m75941xfb8219142);
        if (nz3Var2 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(s8Var.f312832m, "update progress from svr, cur:" + nz3Var2.m75939xb282bd08(2) + ", target:" + nz3Var2.m75939xb282bd08(1));
            android.widget.TextView textView = s8Var.F;
            if (textView != null) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(nz3Var2.m75939xb282bd08(2));
                sb6.append(' ');
                textView.setText(sb6.toString());
            }
            android.widget.TextView textView2 = s8Var.G;
            if (textView2 != null) {
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                sb7.append(nz3Var2.m75939xb282bd08(1));
                sb7.append(' ');
                textView2.setText(sb7.toString());
            }
            r45.e84 e84Var2 = s8Var.f312840s;
            if (e84Var2 == null || (m75941xfb821914 = e84Var2.m75941xfb821914(2)) == null || (nz3Var = (r45.nz3) kz5.n0.Z(m75941xfb821914)) == null) {
                return;
            }
            nz3Var.set(2, java.lang.Integer.valueOf(nz3Var2.m75939xb282bd08(2)));
            nz3Var.set(1, java.lang.Integer.valueOf(nz3Var2.m75939xb282bd08(1)));
            df2.s8.Z6(s8Var, "taskProgressInfo");
        }
    }
}
