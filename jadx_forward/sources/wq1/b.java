package wq1;

/* loaded from: classes8.dex */
public class b implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wq1.c f530034d;

    public b(wq1.c cVar) {
        this.f530034d = cVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(android.content.DialogInterface dialogInterface) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Box.BoxHomeUI", "dismiss dialog");
        wq1.c cVar = this.f530034d;
        xq1.b bVar = cVar.f530039m;
        if (bVar != null) {
            if (bVar.f537557e != null) {
                gm0.j1.d().d(bVar.f537557e);
            }
            gm0.j1.d().q(1869, bVar);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.box.p1288x48fb3bf9.C12962xa24d9bee c12962xa24d9bee = cVar.f530038i;
        if (c12962xa24d9bee != null) {
            c12962xa24d9bee.mo120173x7af55728("boxJSApi");
            cVar.f530038i.mo52095x5cd39ffa();
            cVar.f530038i = null;
        }
    }
}
