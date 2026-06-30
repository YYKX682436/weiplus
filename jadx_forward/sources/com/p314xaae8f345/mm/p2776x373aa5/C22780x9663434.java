package com.p314xaae8f345.mm.p2776x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/tencent/mm/view/ChatRoomPreviewHalfScreen;", "Lcom/tencent/mm/ui/halfscreen/MMHalfScreenDialogFragment;", "Landroid/content/Context;", "activityContext", "Ldh5/a;", "halfScreenParam", "<init>", "(Landroid/content/Context;Ldh5/a;)V", "ui-selectcontact_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.view.ChatRoomPreviewHalfScreen */
/* loaded from: classes3.dex */
public final class C22780x9663434 extends com.p314xaae8f345.mm.ui.p2710x1c644e5f.C22415x6ef905d7 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22780x9663434(android.content.Context activityContext, dh5.a halfScreenParam) {
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
    public bh5.l m0(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        bh5.l lVar = new bh5.l(context, com.p314xaae8f345.mm.R.C30868x68b1db1.f575834jd);
        android.view.Window window = lVar.getWindow();
        if (window != null) {
            window.setSoftInputMode(48);
        }
        return lVar;
    }
}
