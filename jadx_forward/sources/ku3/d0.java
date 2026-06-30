package ku3;

/* loaded from: classes10.dex */
public final class d0 implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ku3.i0 f393724d;

    public d0(ku3.i0 i0Var) {
        this.f393724d = i0Var;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        ku3.i0 i0Var = this.f393724d;
        java.lang.Integer P6 = i0Var.f393784d.P6(7);
        if (P6 != null) {
            int intValue = P6.intValue();
            p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = i0Var.a().mo7946xf939df19();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(mo7946xf939df19, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.Adapter<androidx.recyclerview.widget.RecyclerView.ViewHolder>");
            mo7946xf939df19.m8147xed6e4d18(intValue);
        }
    }
}
