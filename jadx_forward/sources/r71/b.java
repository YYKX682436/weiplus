package r71;

/* loaded from: classes12.dex */
public class b implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r71.c f474656d;

    public b(r71.c cVar) {
        this.f474656d = cVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        r71.c cVar = this.f474656d;
        if (cVar.f474661h == null || !cVar.f474659f.isEmpty()) {
            return;
        }
        cVar.f474661h.dismiss();
        java.util.Iterator it = cVar.f474660g.iterator();
        while (it.hasNext()) {
            c01.d9.e().d((com.p314xaae8f345.mm.p944x882e457a.m1) it.next());
        }
        cVar.f474660g.clear();
    }
}
