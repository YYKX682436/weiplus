package dk5;

/* loaded from: classes9.dex */
public class k3 implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f316238d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f316239e;

    public k3(com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22571x51759e93 activityC22571x51759e93, java.lang.String str, android.view.View view) {
        this.f316238d = str;
        this.f316239e = view;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(android.content.DialogInterface dialogInterface) {
        k01.u0 u0Var = (k01.u0) i95.n0.c(k01.u0.class);
        ((ij1.j) u0Var).Ui(this.f316238d, this.f316239e);
    }
}
