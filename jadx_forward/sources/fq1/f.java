package fq1;

/* loaded from: classes8.dex */
public class f implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 f347042d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j f347043e;

    public f(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j jVar) {
        this.f347042d = j0Var;
        this.f347043e = jVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = this.f347042d;
        j0Var.dismiss();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j jVar = this.f347043e;
        if (jVar != null) {
            java.lang.String h17 = j0Var.h();
            android.widget.EditText editText = j0Var.f293370r;
            jVar.a(true, h17, editText instanceof com.p314xaae8f345.mm.ui.p2747xd1075a44.p2758x5f8b9e37.C22695xac2d47d6 ? ((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2758x5f8b9e37.C22695xac2d47d6) editText).mo70737xc8d30aa0() : 0);
        }
    }
}
