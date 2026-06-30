package ku3;

/* loaded from: classes3.dex */
public final class a2 implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ku3.n2 f393696d;

    public a2(ku3.n2 n2Var) {
        this.f393696d = n2Var;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        ku3.n0 n0Var = (ku3.n0) obj;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("hintText change >> ");
        sb6.append(n0Var.f393865a);
        sb6.append(", ");
        java.lang.String str = n0Var.f393867c;
        sb6.append(str);
        sb6.append(", ");
        int i17 = n0Var.f393866b;
        sb6.append(i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecordHintPlugin", sb6.toString());
        ku3.n2 n2Var = this.f393696d;
        int i18 = n0Var.f393865a;
        if (i18 == 1) {
            if (i17 == 1) {
                n2Var.b().setVisibility(4);
                p3325xe03a0797.p3326xc267989b.r2 r2Var = n2Var.f393875m;
                if (r2Var != null) {
                    p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
                    return;
                }
                return;
            }
            if (i17 != 2) {
                if (i17 != 3) {
                    n2Var.getClass();
                    return;
                } else {
                    n2Var.c(str);
                    return;
                }
            }
            if (n2Var.a().getVisibility() != 0) {
                n2Var.b().setText(str);
                n2Var.b().setVisibility(0);
                return;
            }
            return;
        }
        if (i18 != 2) {
            return;
        }
        if (i17 != 1) {
            n2Var.getClass();
            return;
        }
        p3325xe03a0797.p3326xc267989b.r2 r2Var2 = n2Var.f393874i;
        if (r2Var2 != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var2, null, 1, null);
        }
        p3325xe03a0797.p3326xc267989b.r2 r2Var3 = n2Var.f393874i;
        if (r2Var3 != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var3, null, 1, null);
        }
        android.view.View a17 = n2Var.a();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(4);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(a17, arrayList.toArray(), "com/tencent/mm/plugin/recordvideo/plugin/professional/RecordHintPlugin", "dismissPermissionHint", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        a17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(a17, "com/tencent/mm/plugin/recordvideo/plugin/professional/RecordHintPlugin", "dismissPermissionHint", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
