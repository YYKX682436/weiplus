package r35;

/* loaded from: classes9.dex */
public class o0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j f450766d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f450767e;

    public o0(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j jVar, android.view.View view) {
        this.f450766d = jVar;
        this.f450767e = view;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j jVar = this.f450766d;
        if (jVar != null) {
            android.view.View view = this.f450767e;
            jVar.a(true, r35.j1.a(view), r35.j1.b(view));
        }
    }
}
