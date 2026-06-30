package cj5;

/* loaded from: classes.dex */
public final class z4 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cj5.c5 f42289d;

    public z4(cj5.c5 c5Var) {
        this.f42289d = c5Var;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        java.util.ArrayList arrayList;
        ym3.o oVar = (ym3.o) obj;
        if ((oVar != null ? oVar.f463177a : null) == ym3.p.f463181f) {
            cj5.c5 c5Var = this.f42289d;
            com.tencent.mm.view.recyclerview.WxRecyclerView k17 = c5Var.T6().k();
            kotlin.jvm.internal.o.f(k17, "getSelectContactRv(...)");
            com.tencent.mm.plugin.mvvmlist.MvvmList a17 = xm3.u0.a(k17);
            if (((a17 == null || (arrayList = a17.f152065o) == null) ? 0 : arrayList.size()) > 0) {
                c5Var.T6().d().setVisibility(8);
                return;
            }
            if (!c5Var.f42088e) {
                c5Var.f42088e = true;
                android.widget.FrameLayout d17 = c5Var.T6().d();
                if (d17 != null) {
                    android.view.View inflate = android.view.LayoutInflater.from(d17.getContext()).inflate(com.tencent.mm.R.layout.dpc, (android.view.ViewGroup) null);
                    if (inflate != null) {
                        inflate.setOnClickListener(new cj5.y4(c5Var));
                    }
                    d17.addView(inflate, new android.widget.FrameLayout.LayoutParams(-1, -2));
                }
            }
            c5Var.T6().d().setVisibility(0);
        }
    }
}
