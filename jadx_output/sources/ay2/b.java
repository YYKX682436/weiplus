package ay2;

/* loaded from: classes5.dex */
public final class b implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ay2.i f15232d;

    public b(ay2.i iVar) {
        this.f15232d = iVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(android.content.DialogInterface dialogInterface) {
        ay2.i iVar = this.f15232d;
        if (iVar.f15251s) {
            ay2.a[] aVarArr = ay2.a.f15231d;
            iVar.c(5);
        }
        iVar.f15251s = false;
        yz5.a aVar = iVar.f15249q;
        if (aVar != null) {
            aVar.invoke();
        }
    }
}
