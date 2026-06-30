package sj3;

/* loaded from: classes14.dex */
public class x4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sj3.a5 f490339d;

    public x4(sj3.a5 a5Var) {
        this.f490339d = a5Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        sj3.a5 a5Var = this.f490339d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.ServiceConnectionC16581x3d1d6bd2 serviceConnectionC16581x3d1d6bd2 = a5Var.f489950d;
        if (serviceConnectionC16581x3d1d6bd2 == null || serviceConnectionC16581x3d1d6bd2.isFinishing()) {
            return;
        }
        if (a5Var.f489950d.findViewById(com.p314xaae8f345.mm.R.id.k6o) != null) {
            a5Var.f489950d.findViewById(com.p314xaae8f345.mm.R.id.k6o).setOnClickListener(null);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.p1889xd1075a44.C16584x79838812 c16584x79838812 = a5Var.H;
        if (c16584x79838812 != null) {
            c16584x79838812.m67072x1188427c(null);
        }
        a5Var.getClass();
        a5Var.f489958o.setVisibility(8);
        a5Var.f489959p.setVisibility(8);
    }
}
