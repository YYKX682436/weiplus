package cr3;

/* loaded from: classes11.dex */
public class k implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f303486d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f303487e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ cr3.d0 f303488f;

    public k(cr3.d0 d0Var, java.lang.String str, boolean z17) {
        this.f303488f = d0Var;
        this.f303486d = str;
        this.f303487e = z17;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        cr3.d0 d0Var = this.f303488f;
        g0Var.d(14553, 2, 3, d0Var.f303465e.d1());
        d0Var.f303470m.show();
        d0Var.f303469i = false;
        d0Var.f(this.f303486d, this.f303487e);
    }
}
