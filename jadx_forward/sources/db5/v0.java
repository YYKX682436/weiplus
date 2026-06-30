package db5;

/* loaded from: classes8.dex */
public class v0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ db5.a1 f310082d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 f310083e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f310084f;

    public v0(db5.a1 a1Var, com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017, android.content.Context context) {
        this.f310082d = a1Var;
        this.f310083e = c22621x7603e017;
        this.f310084f = context;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        db5.a1 a1Var = this.f310082d;
        if (a1Var != null ? a1Var.mo26039x42fe6352(this.f310083e.getText().toString().trim()) : true) {
            dialogInterface.dismiss();
            if (this.f310084f instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new db5.u0(this));
            }
        }
    }
}
