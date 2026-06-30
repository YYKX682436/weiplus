package f00;

/* loaded from: classes9.dex */
public final class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f00.d f339823d;

    public b(f00.d dVar) {
        this.f339823d = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.content.Context context;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var;
        f00.d dVar = this.f339823d;
        f00.v vVar = dVar.f339827b;
        if (vVar != null && (u3Var = ((f00.u) vVar).f339861b) != null) {
            u3Var.dismiss();
        }
        f00.v vVar2 = dVar.f339827b;
        if (vVar2 != null) {
            f00.u uVar = (f00.u) vVar2;
            java.lang.ref.WeakReference weakReference = uVar.f339864a;
            if (weakReference == null || (context = (android.content.Context) weakReference.get()) == null) {
                context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            }
            java.lang.String str = uVar.f339862c;
            android.content.DialogInterface.OnCancelListener onCancelListener = uVar.f339863d;
            uVar.f339861b = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3.f(context, str, onCancelListener != null, 0, onCancelListener);
        }
    }
}
