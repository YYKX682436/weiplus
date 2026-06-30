package cb1;

/* loaded from: classes7.dex */
public class g1 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f40245d;

    public g1(cb1.h1 h1Var, yz5.l lVar) {
        this.f40245d = lVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        dialogInterface.dismiss();
        this.f40245d.invoke(0);
    }
}
