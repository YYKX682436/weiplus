package v61;

/* loaded from: classes4.dex */
public class a0 extends tg3.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f514955e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(v61.b0 b0Var, int i17, r35.m3 m3Var, java.lang.ref.WeakReference weakReference) {
        super(i17, m3Var);
        this.f514955e = weakReference;
    }

    @Override // tg3.a
    public void a(android.view.View view) {
        int i17 = rl.b.f478676a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HandleUnavailableAccountTipClickListener", "onClickDetail", null);
        android.content.Context context = (android.content.Context) this.f514955e.get();
        if (context != null) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2(context, 2, 0, true);
            z2Var.y(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571987vi));
            z2Var.F = new v61.C30646x56d4592(z2Var);
            z2Var.x(1);
            z2Var.j(com.p314xaae8f345.mm.ui.id.b(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.dpi, (android.view.ViewGroup) null));
            z2Var.C();
        }
    }
}
