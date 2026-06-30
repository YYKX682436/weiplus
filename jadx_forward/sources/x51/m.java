package x51;

/* loaded from: classes11.dex */
public class m implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x51.r1 f533563d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f533564e;

    public m(x51.o oVar, x51.r1 r1Var, android.app.Activity activity) {
        this.f533563d = r1Var;
        this.f533564e = activity;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", this.f533563d.f533613d);
        intent.putExtra("showShare", false);
        intent.putExtra("show_bottom", false);
        intent.putExtra("needRedirect", false);
        intent.putExtra("hardcode_jspermission", com.p314xaae8f345.mm.p2496xc50a8ce6.C19775x58fd37b3.f273711h);
        intent.putExtra("hardcode_general_ctrl", com.p314xaae8f345.mm.p2496xc50a8ce6.C19774x1007d35e.f273708e);
        ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f105601d.D(intent, this.f533564e);
    }
}
