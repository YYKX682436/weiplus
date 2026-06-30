package fq1;

/* loaded from: classes8.dex */
public class g implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 f347044d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j f347045e;

    public g(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j jVar) {
        this.f347044d = j0Var;
        this.f347045e = jVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        this.f347044d.dismiss();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j jVar = this.f347045e;
        if (jVar != null) {
            jVar.a(false, null, 0);
        }
    }
}
