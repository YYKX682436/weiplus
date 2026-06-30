package zs4;

/* loaded from: classes9.dex */
public class j implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zs4.q f556828d;

    public j(zs4.q qVar) {
        this.f556828d = qVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        dialogInterface.dismiss();
        zs4.q qVar = this.f556828d;
        qVar.f556848g.dismiss();
        java.lang.ref.WeakReference weakReference = qVar.f556846e;
        if (weakReference != null && weakReference.get() != null) {
            ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) qVar.f556846e.get()).finish();
        }
        qVar.b();
    }
}
