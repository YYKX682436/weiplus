package cm5;

/* loaded from: classes3.dex */
public final class a implements q80.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q80.d0 f124955a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f124956b;

    public a(q80.d0 d0Var, android.content.Context context) {
        this.f124955a = d0Var;
        this.f124956b = context;
    }

    @Override // q80.f0
    /* renamed from: fail */
    public void mo555x2fd71e() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BlockFunctionUtil", "openLiteApp fail %s.", this.f124955a.f442182a);
        int i17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
        android.content.Context context = this.f124956b;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(context);
        e4Var.f293309c = context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ggb);
        e4Var.c();
    }

    @Override // q80.f0
    /* renamed from: success */
    public void mo556x90b54003() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BlockFunctionUtil", "openLiteApp success %s.", this.f124955a.f442182a);
    }
}
