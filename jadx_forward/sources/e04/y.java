package e04;

/* loaded from: classes15.dex */
public class y implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p944x882e457a.m1 f327687d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e04.p f327688e;

    public y(e04.p pVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        this.f327688e = pVar;
        this.f327687d = m1Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        gm0.j1.d().d(this.f327687d);
        rz3.e eVar = this.f327688e.f327592w;
        if (eVar != null) {
            eVar.a(1, null);
        }
    }
}
