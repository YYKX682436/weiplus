package com.p314xaae8f345.p3210x3857dc;

/* renamed from: com.tencent.xweb.XWebExtendPluginNativeViewClient$NativeViewPresentation */
/* loaded from: classes7.dex */
class PresentationC27822x14e38e8a extends android.app.Presentation {

    /* renamed from: mClient */
    private final com.p314xaae8f345.p3210x3857dc.j2 f61120xfe7f1a98;

    /* renamed from: mContentView */
    private android.widget.FrameLayout f61121x92dc1011;

    /* renamed from: mStartFocused */
    private boolean f61122x666125c2;

    /* renamed from: this$0 */
    final /* synthetic */ com.p314xaae8f345.p3210x3857dc.j2 f61123xcbdd23aa;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PresentationC27822x14e38e8a(com.p314xaae8f345.p3210x3857dc.j2 j2Var, android.content.Context context, android.view.Display display, boolean z17, com.p314xaae8f345.p3210x3857dc.j2 j2Var2) {
        super(context, display);
        this.f61123xcbdd23aa = j2Var;
        this.f61122x666125c2 = false;
        getWindow().setFlags(8, 8);
        this.f61122x666125c2 = z17;
        this.f61120xfe7f1a98 = j2Var2;
    }

    /* renamed from: detach */
    public void m120227xb06a1793() {
        android.widget.FrameLayout frameLayout = this.f61123xcbdd23aa.f301854a;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
    }

    @Override // android.app.Dialog
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setBackgroundDrawable(new android.graphics.drawable.ColorDrawable(0));
        this.f61123xcbdd23aa.f301854a = new android.widget.FrameLayout(getContext());
        android.widget.FrameLayout frameLayout = this.f61121x92dc1011;
        if (frameLayout != null) {
            if (this.f61122x666125c2) {
                frameLayout.requestFocus();
            }
            this.f61123xcbdd23aa.f301854a.addView(this.f61121x92dc1011);
        }
        setContentView(this.f61123xcbdd23aa.f301854a);
        this.f61123xcbdd23aa.getClass();
    }
}
