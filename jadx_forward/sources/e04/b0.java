package e04;

/* loaded from: classes15.dex */
public class b0 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p944x882e457a.m1 f327402d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e04.p f327403e;

    public b0(e04.p pVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        this.f327403e = pVar;
        this.f327402d = m1Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        gm0.j1.d().d(this.f327402d);
        rz3.e eVar = this.f327403e.f327592w;
        if (eVar != null) {
            eVar.a(1, null);
        }
    }
}
