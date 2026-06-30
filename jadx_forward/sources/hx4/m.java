package hx4;

/* loaded from: classes8.dex */
public final class m implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hx4.p f367212d;

    public m(hx4.p pVar) {
        this.f367212d = pVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface dialogInterface) {
        hx4.p pVar = this.f367212d;
        pVar.b(0, null);
        hx4.s.b(pVar.f367216b, 4, pVar.f367218d);
    }
}
