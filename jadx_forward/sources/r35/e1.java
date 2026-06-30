package r35;

/* loaded from: classes8.dex */
public class e1 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 f450615d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j f450616e;

    public e1(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j jVar) {
        this.f450615d = j0Var;
        this.f450616e = jVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        this.f450615d.dismiss();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j jVar = this.f450616e;
        if (jVar != null) {
            jVar.a(false, null, 0);
        }
    }
}
