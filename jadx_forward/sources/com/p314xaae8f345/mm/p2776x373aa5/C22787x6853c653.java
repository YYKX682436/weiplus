package com.p314xaae8f345.mm.p2776x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¨\u0006\u0012"}, d2 = {"Lcom/tencent/mm/view/LazyPlayPAGView;", "Lcom/tencent/mm/view/MMPAGView;", "", com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714, "Ljz5/f0;", "setComposition", "Lorg/libpag/PAGFile;", "pagFile", "Lcom/tencent/mm/rfx/RfxPagFile;", "rfxPagFile", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "libmmui_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.view.LazyPlayPAGView */
/* loaded from: classes3.dex */
public final class C22787x6853c653 extends com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b {

    /* renamed from: w, reason: collision with root package name */
    public boolean f294857w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f294858x;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C22787x6853c653(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    @Override // com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b
    public boolean f() {
        return this.f294857w || super.f();
    }

    @Override // com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b
    public void g() {
        if (this.f294858x) {
            super.g();
        } else {
            this.f294857w = true;
        }
    }

    @Override // com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b
    public void k(android.content.res.AssetManager assetManager, java.lang.String path) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(assetManager, "assetManager");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        super.k(assetManager, path);
        p();
    }

    @Override // com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b
    public void n() {
        this.f294857w = false;
        super.n();
    }

    public final void p() {
        this.f294858x = (getUseRfx() ? m82578x583e633c() : m82574xa7d55074()) != null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LazyPlayPAGView", "onCompositionUpdated: " + this.f294858x);
        if (this.f294857w && this.f294858x) {
            this.f294857w = false;
            super.g();
        }
    }

    @Override // com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b
    /* renamed from: setComposition */
    public void mo82567x3e3ac3e8(java.lang.String str) {
        super.mo82567x3e3ac3e8(str);
        p();
    }

    public /* synthetic */ C22787x6853c653(android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(context, (i18 & 2) != 0 ? null : attributeSet, (i18 & 4) != 0 ? 0 : i17);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22787x6853c653(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    @Override // com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b
    /* renamed from: setComposition */
    public void mo82568x3e3ac3e8(org.p3363xbe4143f1.C29690xfae77312 c29690xfae77312) {
        super.mo82568x3e3ac3e8(c29690xfae77312);
        p();
    }

    @Override // com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b
    /* renamed from: setComposition */
    public void mo82566x3e3ac3e8(com.p314xaae8f345.mm.rfx.C20942x379cf5ee c20942x379cf5ee) {
        super.mo82566x3e3ac3e8(c20942x379cf5ee);
        p();
    }
}
