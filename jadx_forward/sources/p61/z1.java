package p61;

/* loaded from: classes5.dex */
public class z1 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p61.a2 f433949d;

    public z1(p61.a2 a2Var) {
        this.f433949d = a2Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        android.content.Intent intent = new android.content.Intent();
        intent.addFlags(67108864);
        intent.putExtra("exit_and_restart", true);
        ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f105601d.u(intent, this.f433949d.f433741a);
    }
}
