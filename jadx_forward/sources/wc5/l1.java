package wc5;

/* loaded from: classes10.dex */
public final class l1 extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 f526134d;

    /* renamed from: e, reason: collision with root package name */
    public ed5.v f526135e;

    /* renamed from: f, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.v2 f526136f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 baseActivity) {
        super(baseActivity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(baseActivity, "baseActivity");
        this.f526134d = baseActivity;
    }

    public final void T6() {
        android.view.LayoutInflater.Factory factory = this.f526134d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(factory, "null cannot be cast to non-null type com.tencent.mm.ui.chatting.history.base.MsgHistoryGalleryController");
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 m76 = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.ActivityC21814x1938a8b3) ((uc5.r) factory)).m7();
        p012xc85e97e9.p103xe821e364.p104xd1075a44.v2 v2Var = this.f526136f;
        if (v2Var != null) {
            m76.U0(v2Var);
        }
        this.f526136f = null;
        ed5.v vVar = this.f526135e;
        if (vVar != null) {
            m76.S0(vVar);
        }
        this.f526135e = null;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onFinished */
    public void mo13982x7cf2e371() {
        T6();
        super.mo13982x7cf2e371();
    }
}
