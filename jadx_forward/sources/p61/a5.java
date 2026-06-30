package p61;

/* loaded from: classes14.dex */
public class a5 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p957x53236a1b.l1 f433746d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p61.b5 f433747e;

    public a5(p61.b5 b5Var, com.p314xaae8f345.mm.p957x53236a1b.l1 l1Var) {
        this.f433747e = b5Var;
        this.f433746d = l1Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        this.f433747e.f433756d.b();
        gm0.j1.d().d(this.f433746d);
    }
}
