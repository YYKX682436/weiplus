package com.p314xaae8f345.mm.ui.p2710x1c644e5f;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/tencent/mm/ui/halfscreen/MMHalfScreenMaxHeightDialogFragment;", "Lcom/tencent/mm/ui/halfscreen/MMHalfScreenDialogFragment;", "Landroid/content/Context;", "activityContext", "Ldh5/a;", "halfScreenParam", "<init>", "(Landroid/content/Context;Ldh5/a;)V", "libmmui_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.ui.halfscreen.MMHalfScreenMaxHeightDialogFragment */
/* loaded from: classes14.dex */
public class C22416x4a36f104 extends com.p314xaae8f345.mm.ui.p2710x1c644e5f.C22415x6ef905d7 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22416x4a36f104(android.content.Context activityContext, dh5.a halfScreenParam) {
        super(activityContext, halfScreenParam);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activityContext, "activityContext");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(halfScreenParam, "halfScreenParam");
    }

    public int C0() {
        return super.p0();
    }

    public int F0() {
        return 0;
    }

    @Override // com.p314xaae8f345.mm.ui.p2710x1c644e5f.C22415x6ef905d7
    /* renamed from: getLayoutId */
    public int mo80693x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f570702eh0;
    }

    @Override // com.p314xaae8f345.mm.ui.p2710x1c644e5f.C22415x6ef905d7, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onCreateView */
    public android.view.View mo7503x18bad100(android.view.LayoutInflater inflaterOri, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(inflaterOri, "inflaterOri");
        android.view.View mo7503x18bad100 = super.mo7503x18bad100(inflaterOri, viewGroup, bundle);
        android.view.View o07 = o0();
        com.p314xaae8f345.mm.p2776x373aa5.C22790xd706766c c22790xd706766c = o07 instanceof com.p314xaae8f345.mm.p2776x373aa5.C22790xd706766c ? (com.p314xaae8f345.mm.p2776x373aa5.C22790xd706766c) o07 : null;
        if (c22790xd706766c != null) {
            c22790xd706766c.m82585x25bfb969(C0());
            int F0 = F0();
            if (F0 > 0) {
                c22790xd706766c.m82586x6549caa9(new bh5.w0(this, F0));
            }
        }
        return mo7503x18bad100;
    }

    @Override // com.p314xaae8f345.mm.ui.p2710x1c644e5f.C22415x6ef905d7
    public int p0() {
        return -2;
    }
}
