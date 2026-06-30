package ay2;

/* loaded from: classes5.dex */
public final class b implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ay2.i f96765d;

    public b(ay2.i iVar) {
        this.f96765d = iVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(android.content.DialogInterface dialogInterface) {
        ay2.i iVar = this.f96765d;
        if (iVar.f96784s) {
            ay2.a[] aVarArr = ay2.a.f96764d;
            iVar.c(5);
        }
        iVar.f96784s = false;
        yz5.a aVar = iVar.f96782q;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
    }
}
