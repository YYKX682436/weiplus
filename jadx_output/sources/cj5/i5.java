package cj5;

/* loaded from: classes.dex */
public final class i5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cj5.k5 f42146d;

    public i5(cj5.k5 k5Var) {
        this.f42146d = k5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        cj5.k5 k5Var = this.f42146d;
        java.util.Iterator it = k5Var.f42173d.iterator();
        int i17 = 0;
        while (it.hasNext()) {
            java.util.ArrayList arrayList = (java.util.ArrayList) k5Var.f42174e.get((java.lang.String) it.next());
            i17 += arrayList != null ? arrayList.size() : 0;
        }
        androidx.appcompat.app.AppCompatActivity activity = k5Var.getActivity();
        kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        com.tencent.mm.ui.MMActivity mMActivity = (com.tencent.mm.ui.MMActivity) activity;
        if (i17 == 0) {
            mMActivity.setMMTitle(k5Var.getActivity().getString(com.tencent.mm.R.string.njd));
        } else {
            java.lang.String string = k5Var.getActivity().getString(com.tencent.mm.R.string.njf);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            java.lang.String format = java.lang.String.format(string, java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(i17)}, 1));
            kotlin.jvm.internal.o.f(format, "format(...)");
            mMActivity.setMMTitle(format);
        }
        com.tencent.mm.view.recyclerview.WxRecyclerView k17 = ((em.l2) ((jz5.n) k5Var.f42177h).getValue()).k();
        kotlin.jvm.internal.o.f(k17, "getSelectContactRv(...)");
        com.tencent.mm.plugin.mvvmlist.MvvmList a17 = xm3.u0.a(k17);
        if (a17 != null) {
            a17.z(new cj5.h5(k5Var));
        }
    }
}
