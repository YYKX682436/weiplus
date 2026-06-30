package zs4;

/* loaded from: classes9.dex */
public class h implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f556824d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zs4.q f556825e;

    public h(zs4.q qVar, int i17) {
        this.f556825e = qVar;
        this.f556824d = i17;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.p314xaae8f345.mm.p2802xd031a825.ui.r1.r0(2, 1, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1(), this.f556824d);
        zs4.q qVar = this.f556825e;
        java.lang.ref.WeakReference weakReference = qVar.f556847f;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        gm0.j1.i();
        gm0.j1.n().f354821b.a(385, qVar);
        qVar.getClass();
        ((np5.e) qVar.f556847f.get()).a(new ys4.d(-1), true);
    }
}
