package r33;

/* loaded from: classes5.dex */
public class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f450503d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f450504e;

    public d(r33.f fVar, android.content.Context context, java.lang.String str) {
        this.f450503d = context;
        this.f450504e = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.content.Context context = this.f450503d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(context);
        u1Var.g(this.f450504e);
        u1Var.n(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.l_e));
        u1Var.q(false);
    }
}
