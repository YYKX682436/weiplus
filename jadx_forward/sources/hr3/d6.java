package hr3;

/* loaded from: classes9.dex */
public class d6 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p944x882e457a.m1 f365005d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hr3.t6 f365006e;

    public d6(hr3.t6 t6Var, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        this.f365006e = t6Var;
        this.f365005d = m1Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        c01.d9.e().q(536, this.f365006e);
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5332x1e5a33 c5332x1e5a33 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5332x1e5a33();
        am.y4 y4Var = c5332x1e5a33.f135645g;
        y4Var.f89965c = 2;
        y4Var.f89966d = this.f365005d;
        c5332x1e5a33.e();
    }
}
