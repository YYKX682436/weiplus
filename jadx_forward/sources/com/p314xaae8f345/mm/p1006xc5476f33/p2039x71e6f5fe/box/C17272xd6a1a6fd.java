package com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.box;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eB#\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u0003¢\u0006\u0004\b\r\u0010\u0010J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0012\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0011"}, d2 = {"Lcom/tencent/mm/plugin/scanner/box/ScanOCRDialogBackgroundOpView;", "Landroid/widget/RelativeLayout;", "Luy3/q;", "", "getVieHeight", "Luy3/p;", com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1928x4237fde6.CastExtraArgs.f5946x7ee2b4b4, "Ljz5/f0;", "setOpListener", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-scan_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.scanner.box.ScanOCRDialogBackgroundOpView */
/* loaded from: classes8.dex */
public final class C17272xd6a1a6fd extends android.widget.RelativeLayout implements uy3.q {

    /* renamed from: d, reason: collision with root package name */
    public uy3.p f240245d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ImageView f240246e;

    /* renamed from: f, reason: collision with root package name */
    public int f240247f;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C17272xd6a1a6fd(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    @Override // uy3.q
    /* renamed from: getVieHeight, reason: from getter */
    public int getF240247f() {
        return this.f240247f;
    }

    @Override // uy3.q
    /* renamed from: setOpListener */
    public void mo68549x3a44cbb7(uy3.p pVar) {
        this.f240245d = pVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17272xd6a1a6fd(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        android.widget.ImageView imageView = (android.widget.ImageView) android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bow, (android.view.ViewGroup) this, true).findViewById(com.p314xaae8f345.mm.R.id.ptf);
        this.f240246e = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(new uy3.v0(this));
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.q(this.f240246e, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        this.f240247f = i65.a.b(context, 28);
    }
}
