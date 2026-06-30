package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/tencent/mm/plugin/account/ui/EnterAnimationHalfScreen;", "Lcom/tencent/mm/ui/halfscreen/MMHalfScreenDialogFragment;", "Landroid/content/Context;", "activityContext", "Ldh5/a;", "halfScreenParam", "<init>", "(Landroid/content/Context;Ldh5/a;)V", "plugin-account_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.account.ui.EnterAnimationHalfScreen */
/* loaded from: classes14.dex */
public final class C11403x95bea34b extends com.p314xaae8f345.mm.ui.p2710x1c644e5f.C22415x6ef905d7 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11403x95bea34b(android.content.Context activityContext, dh5.a halfScreenParam) {
        super(activityContext, halfScreenParam);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activityContext, "activityContext");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(halfScreenParam, "halfScreenParam");
    }

    @Override // com.p314xaae8f345.mm.ui.p2710x1c644e5f.C22415x6ef905d7
    public void B0(android.view.Window window) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(window, "window");
        window.setWindowAnimations(com.p314xaae8f345.mm.R.C30868x68b1db1.f575681fg);
    }

    @Override // com.p314xaae8f345.mm.ui.p2710x1c644e5f.C22415x6ef905d7
    public int p0() {
        return (int) (w0() * 0.55d);
    }
}
