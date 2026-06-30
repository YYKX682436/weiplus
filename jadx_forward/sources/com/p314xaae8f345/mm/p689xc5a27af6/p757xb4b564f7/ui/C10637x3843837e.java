package com.p314xaae8f345.mm.p689xc5a27af6.p757xb4b564f7.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/tencent/mm/feature/openmsg/ui/OpenMsgHalfScreenDialog;", "Lcom/tencent/mm/ui/halfscreen/MMHalfScreenMaxHeightDialogFragment;", "Landroid/content/Context;", "context", "Ldh5/a;", "halfScreenParam", "<init>", "(Landroid/content/Context;Ldh5/a;)V", "feature-openmsg_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.feature.openmsg.ui.OpenMsgHalfScreenDialog */
/* loaded from: classes14.dex */
public final class C10637x3843837e extends com.p314xaae8f345.mm.ui.p2710x1c644e5f.C22416x4a36f104 {
    public static final /* synthetic */ int H = 0;
    public final jz5.g G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10637x3843837e(android.content.Context context, dh5.a halfScreenParam) {
        super(context, halfScreenParam);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(halfScreenParam, "halfScreenParam");
        this.G = jz5.h.b(new ib0.f(this, context));
    }

    @Override // com.p314xaae8f345.mm.ui.p2710x1c644e5f.C22416x4a36f104
    public int C0() {
        return ((java.lang.Number) ((jz5.n) this.G).mo141623x754a37bb()).intValue();
    }

    @Override // com.p314xaae8f345.mm.ui.p2710x1c644e5f.C22415x6ef905d7
    public bh5.l m0(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        bh5.l m07 = super.m0(context);
        android.view.Window window = m07.getWindow();
        if (window != null) {
            window.setSoftInputMode(48);
        }
        return m07;
    }

    @Override // com.p314xaae8f345.mm.ui.p2710x1c644e5f.C22415x6ef905d7, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onViewCreated */
    public void mo7518x594b1124(android.view.View view, android.os.Bundle bundle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        super.mo7518x594b1124(view, bundle);
        o0().setBackgroundResource(com.p314xaae8f345.mm.R.C30859x5a72f63.f560023b);
    }
}
