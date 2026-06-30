package gx1;

/* loaded from: classes12.dex */
public class w implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gx1.x f358864d;

    public w(gx1.x xVar) {
        this.f358864d = xVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        dialogInterface.dismiss();
        com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.f fVar = com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.f.f178086d;
        gx1.x xVar = this.f358864d;
        fVar.e(xVar.f358865d.f358836e.f376844a);
        ((java.util.ArrayList) fVar.f178087a).remove(xVar.f358865d.B);
    }
}
