package bn2;

/* loaded from: classes14.dex */
public final class b0 implements com.tencent.mm.ui.widget.dialog.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ bn2.d0 f22843a;

    public b0(bn2.d0 d0Var) {
        this.f22843a = d0Var;
    }

    @Override // com.tencent.mm.ui.widget.dialog.w1
    public final void a(boolean z17, java.lang.String str) {
        bn2.d0 d0Var = this.f22843a;
        for (lo0.h0 h0Var : d0Var.f22848b.f320040f) {
            double d17 = h0Var.f320003g;
            h0Var.f320006j = d17;
            ((bn2.z) d0Var.f22852f).invoke(h0Var, java.lang.Double.valueOf(d17));
        }
        xm2.l lVar = d0Var.f22853g;
        lVar.f455229h.notifyDataSetChanged();
        lVar.a(lVar.f455228g);
    }
}
