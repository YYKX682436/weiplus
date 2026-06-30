package hr3;

/* loaded from: classes9.dex */
public class l6 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qk.o f365278d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hr3.t6 f365279e;

    public l6(hr3.t6 t6Var, qk.o oVar) {
        this.f365279e = t6Var;
        this.f365278d = oVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        qk.o oVar = this.f365278d;
        oVar.f66741xae4ef36 = 1;
        this.f365279e.d(oVar, false);
    }
}
