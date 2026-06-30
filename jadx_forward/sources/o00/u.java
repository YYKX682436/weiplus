package o00;

/* loaded from: classes9.dex */
public final class u implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o00.w f423417d;

    public u(o00.w wVar) {
        this.f423417d = wVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.content.Context context;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var;
        o00.w wVar = this.f423417d;
        o00.t tVar = wVar.f423420b;
        if (tVar != null && (u3Var = ((o00.s) tVar).f423414b) != null) {
            u3Var.dismiss();
        }
        o00.t tVar2 = wVar.f423420b;
        if (tVar2 != null) {
            o00.s sVar = (o00.s) tVar2;
            java.lang.ref.WeakReference weakReference = sVar.f423416a;
            if (weakReference == null || (context = (android.content.Context) weakReference.get()) == null) {
                context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            }
            sVar.f423414b = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3.f(context, sVar.f423415c, false, 0, null);
        }
    }
}
