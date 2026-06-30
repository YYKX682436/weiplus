package qx5;

/* loaded from: classes13.dex */
public class v implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qx5.w f449061d;

    public v(qx5.w wVar) {
        this.f449061d = wVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        qx5.w wVar = this.f449061d;
        boolean z17 = zx5.n.f558783a;
        synchronized (zx5.n.class) {
            if (wVar != null) {
                java.util.List list = zx5.n.f558784b;
                if (((java.util.ArrayList) list).contains(wVar)) {
                    ((java.util.ArrayList) list).remove(wVar);
                }
            }
        }
        qx5.w wVar2 = this.f449061d;
        if (wVar2.f449065d) {
            by5.g0.b(wVar2.f449062a);
        }
    }
}
