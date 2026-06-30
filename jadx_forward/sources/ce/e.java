package ce;

/* loaded from: classes7.dex */
public class e extends android.widget.FrameLayout implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ib {

    /* renamed from: d, reason: collision with root package name */
    public ce.d f122203d;

    public e(android.content.Context context) {
        super(context);
        this.f122203d = null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ib
    public void a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.bb bbVar) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ma
    public void d(int i17, int i18, int i19, int i27, android.view.View view) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ib
    /* renamed from: getContainer */
    public android.view.ViewGroup mo14679xe6eebdcb() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.r8
    public void h(int i17) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ja
    public void j(boolean z17, int i17, int i18, int i19, int i27) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ib
    public void l(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.fb fbVar) {
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(android.view.View view) {
        super.onViewAdded(view);
        if ((view instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.C12072x6098f505) && !view.hasOnClickListeners()) {
            view.setOnTouchListener(new ce.c(null));
        }
        ce.d dVar = this.f122203d;
        if (dVar != null) {
            dVar.C(view);
        }
    }

    /* renamed from: setNativeWidgetAddedCallback */
    public void m14680xf57ab9a8(ce.d dVar) {
        this.f122203d = dVar;
    }

    /* renamed from: setupWebViewTouchInterceptor */
    public void m14681x619e462(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.fb fbVar) {
    }
}
