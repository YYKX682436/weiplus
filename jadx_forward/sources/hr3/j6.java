package hr3;

/* loaded from: classes9.dex */
public class j6 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qk.o f365204d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hr3.t6 f365205e;

    public j6(hr3.t6 t6Var, qk.o oVar) {
        this.f365205e = t6Var;
        this.f365204d = oVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        qk.o oVar = this.f365204d;
        oVar.f66741xae4ef36 = 1;
        oVar.f66733x6baace8e |= 4;
        this.f365205e.d(oVar, true);
    }
}
