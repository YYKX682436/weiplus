package ox5;

/* loaded from: classes15.dex */
public class i implements io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ox5.a f431348a;

    public i(ox5.a aVar) {
        this.f431348a = aVar;
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result
    /* renamed from: error */
    public void mo65718x5c4d208(java.lang.String str, java.lang.String str2, java.lang.Object obj) {
        nx5.c.e("WxaRouter.WxaFlutterActivityAndFragmentDelegate", "Invoked onBackPressed() error. s:%s s1:%s", str, str2);
        ox5.a aVar = this.f431348a;
        if (aVar.f431327c.m29017x19263085() != null) {
            aVar.f431327c.m29017x19263085().finish();
        }
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result
    /* renamed from: notImplemented */
    public void mo65719xbc9fa82f() {
        nx5.c.e("WxaRouter.WxaFlutterActivityAndFragmentDelegate", "Invoked onBackPressed() notImplemented.", new java.lang.Object[0]);
        ox5.a aVar = this.f431348a;
        if (aVar.f431327c.m29017x19263085() != null) {
            aVar.f431327c.m29017x19263085().finish();
        }
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result
    /* renamed from: success */
    public void mo65720x90b54003(java.lang.Object obj) {
        if (obj != null && (obj instanceof java.lang.Boolean) && ((java.lang.Boolean) obj).booleanValue()) {
            nx5.c.e("WxaRouter.WxaFlutterActivityAndFragmentDelegate", "Invoked onBackPressed() back press comsumed .", new java.lang.Object[0]);
            return;
        }
        ox5.a aVar = this.f431348a;
        if (aVar.f431327c.m29017x19263085() != null) {
            ox5.l lVar = aVar.f431327c;
            if (lVar instanceof android.view.View) {
                return;
            }
            lVar.m29017x19263085().finish();
        }
    }
}
