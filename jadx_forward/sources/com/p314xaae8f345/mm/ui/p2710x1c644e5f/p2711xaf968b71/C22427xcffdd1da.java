package com.p314xaae8f345.mm.ui.p2710x1c644e5f.p2711xaf968b71;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/tencent/mm/ui/halfscreen/custom/WebSearchHomeHalfScreen;", "Lcom/tencent/mm/ui/halfscreen/MMHalfScreenDialogFragment;", "Landroid/content/Context;", "activityContext", "Ldh5/a;", "halfScreenParam", "<init>", "(Landroid/content/Context;Ldh5/a;)V", "libmmui_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.ui.halfscreen.custom.WebSearchHomeHalfScreen */
/* loaded from: classes3.dex */
public final class C22427xcffdd1da extends com.p314xaae8f345.mm.ui.p2710x1c644e5f.C22415x6ef905d7 {
    public final jz5.g G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22427xcffdd1da(android.content.Context activityContext, dh5.a halfScreenParam) {
        super(activityContext, halfScreenParam);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activityContext, "activityContext");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(halfScreenParam, "halfScreenParam");
        this.G = jz5.h.b(new ch5.n1(activityContext));
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.DialogInterfaceOnCancelListenerC1100xc25047d8
    /* renamed from: dismiss */
    public void mo7391x63a3b28a() {
        android.view.ViewPropertyAnimator animate;
        android.view.ViewPropertyAnimator alpha;
        super.mo7391x63a3b28a();
        android.view.View view = (android.view.View) ((jz5.n) this.G).mo141623x754a37bb();
        if (view == null || (animate = view.animate()) == null || (alpha = animate.alpha(0.0f)) == null) {
            return;
        }
        alpha.setInterpolator(ta5.h.f498412a.a());
        alpha.setDuration(300L);
        alpha.start();
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

    @Override // com.p314xaae8f345.mm.ui.p2710x1c644e5f.C22415x6ef905d7, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onViewCreated */
    public void mo7518x594b1124(android.view.View view, android.os.Bundle bundle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        super.mo7518x594b1124(view, bundle);
        n3.m0.a(view, new ch5.m1(this));
    }

    @Override // com.p314xaae8f345.mm.ui.p2710x1c644e5f.C22415x6ef905d7
    public float s0() {
        return 0.0f;
    }
}
