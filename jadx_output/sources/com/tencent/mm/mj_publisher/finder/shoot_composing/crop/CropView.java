package com.tencent.mm.mj_publisher.finder.shoot_composing.crop;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010'\u001a\u00020&\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010(\u0012\b\b\u0002\u0010+\u001a\u00020*¢\u0006\u0004\b,\u0010-J\u001a\u0010\u0006\u001a\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002R\u001b\u0010\f\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\u0011\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0016\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\t\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0019\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\t\u001a\u0004\b\u0018\u0010\u0015R\u001b\u0010\u001c\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\t\u001a\u0004\b\u001b\u0010\u0015R\u001b\u0010\u001f\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\t\u001a\u0004\b\u001e\u0010\u0015R\u001b\u0010\"\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010\t\u001a\u0004\b!\u0010\u0015R\u001b\u0010%\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\t\u001a\u0004\b$\u0010\u0015¨\u0006."}, d2 = {"Lcom/tencent/mm/mj_publisher/finder/shoot_composing/crop/CropView;", "Landroid/widget/FrameLayout;", "Lkotlin/Function1;", "Lcom/tencent/maas/camstudio/MJCamSpatialDesc;", "Ljz5/f0;", "onExitListener", "setExitOnClickListener", "Lcom/tencent/mm/mj_publisher/finder/shoot_composing/crop/CropDrawView;", "d", "Ljz5/g;", "getCropDraw", "()Lcom/tencent/mm/mj_publisher/finder/shoot_composing/crop/CropDrawView;", "cropDraw", "Landroid/widget/ImageView;", "e", "getCropImage", "()Landroid/widget/ImageView;", com.tencent.mm.plugin.appbrand.jsapi.media.u5.NAME, "Landroid/view/View;", "f", "getBottomContainer", "()Landroid/view/View;", "bottomContainer", "g", "getRotateBtn", "rotateBtn", "h", "getMirrorBtn", "mirrorBtn", "i", "getResetText", "resetText", "m", "getCancelBtn", "cancelBtn", "n", "getOkBtn", "okBtn", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-vlog-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class CropView extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final jz5.g cropDraw;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final jz5.g cropImage;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final jz5.g bottomContainer;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final jz5.g rotateBtn;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final jz5.g mirrorBtn;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    public final jz5.g resetText;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    public final jz5.g cancelBtn;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    public final jz5.g okBtn;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.maas.camstudio.MJCamSpatialDesc f69639o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.maas.camstudio.MJCamSpatialDesc f69640p;

    /* renamed from: q, reason: collision with root package name */
    public long f69641q;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CropView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.o.g(context, "context");
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02e4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(com.tencent.mm.mj_publisher.finder.shoot_composing.crop.CropView r18) {
        /*
            Method dump skipped, instructions count: 792
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.mj_publisher.finder.shoot_composing.crop.CropView.b(com.tencent.mm.mj_publisher.finder.shoot_composing.crop.CropView):void");
    }

    public static final void c(com.tencent.mm.mj_publisher.finder.shoot_composing.crop.CropView cropView, float f17) {
        cropView.getClass();
        float f18 = j65.q.a(com.tencent.mm.sdk.platformtools.x2.f193071a).getDisplayMetrics().density * 30.0f * 2.0f;
        float width = cropView.getCropDraw().getWidth() - f18;
        float height = (cropView.getCropDraw().getHeight() - f18) - cropView.getBottomContainer().getHeight();
        float left = (cropView.getCropDraw().getLeft() + cropView.getCropDraw().getRight()) / 2.0f;
        float top = ((cropView.getCropDraw().getTop() + cropView.getCropDraw().getBottom()) - cropView.getBottomContainer().getHeight()) / 2.0f;
        float f19 = f17 * height;
        if (width > f19) {
            width = f19;
        } else {
            height = width / f17;
        }
        com.tencent.mm.mj_publisher.finder.shoot_composing.crop.CropDrawView cropDraw = cropView.getCropDraw();
        float f27 = width / 2.0f;
        float f28 = height / 2.0f;
        cropDraw.clipRect.set(left - f27, top - f28, left + f27, top + f28);
        cropDraw.invalidate();
    }

    private final android.view.View getBottomContainer() {
        java.lang.Object value = this.bottomContainer.getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.view.View) value;
    }

    private final android.view.View getCancelBtn() {
        java.lang.Object value = this.cancelBtn.getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.view.View) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.tencent.mm.mj_publisher.finder.shoot_composing.crop.CropDrawView getCropDraw() {
        java.lang.Object value = this.cropDraw.getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (com.tencent.mm.mj_publisher.finder.shoot_composing.crop.CropDrawView) value;
    }

    private final android.widget.ImageView getCropImage() {
        java.lang.Object value = this.cropImage.getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.widget.ImageView) value;
    }

    private final android.view.View getMirrorBtn() {
        java.lang.Object value = this.mirrorBtn.getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.view.View) value;
    }

    private final android.view.View getOkBtn() {
        java.lang.Object value = this.okBtn.getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.view.View) value;
    }

    private final android.view.View getResetText() {
        java.lang.Object value = this.resetText.getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.view.View) value;
    }

    private final android.view.View getRotateBtn() {
        java.lang.Object value = this.rotateBtn.getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.view.View) value;
    }

    /* JADX WARN: Removed duplicated region for block: B:135:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x015e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d() {
        /*
            Method dump skipped, instructions count: 772
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.mj_publisher.finder.shoot_composing.crop.CropView.d():void");
    }

    public final boolean e() {
        if (getVisibility() != 0) {
            return false;
        }
        setVisibility(8);
        getCancelBtn().callOnClick();
        return true;
    }

    public final void f(com.tencent.maas.camstudio.MJCamSpatialDesc desc, android.graphics.Bitmap bitmap) {
        kotlin.jvm.internal.o.g(desc, "desc");
        kotlin.jvm.internal.o.g(bitmap, "bitmap");
        this.f69639o = desc;
        this.f69640p = new com.tencent.maas.camstudio.MJCamSpatialDesc(desc.getViewPointSize().m43clone(), desc.getScaleMode(), desc.getRotationMode(), desc.getFlipMode(), desc.getScale(), desc.getPosition().m43clone());
        android.widget.ImageView cropImage = getCropImage();
        android.view.ViewGroup.LayoutParams layoutParams = getCropImage().getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams2 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) layoutParams;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(bitmap.getWidth());
        sb6.append(':');
        sb6.append(bitmap.getHeight());
        java.lang.String sb7 = sb6.toString();
        com.tencent.mars.xlog.Log.i("MicroMsg.CropView", "cropImage ratio: " + sb7);
        layoutParams2.B = sb7;
        cropImage.setLayoutParams(layoutParams2);
        getCropImage().setImageBitmap(bitmap);
        getCropImage().setScaleType(android.widget.ImageView.ScaleType.FIT_XY);
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        if (!n3.x0.c(this) || isLayoutRequested()) {
            addOnLayoutChangeListener(new ox0.q(this, desc));
        } else {
            c(this, desc.getViewPointSize().f47799x / desc.getViewPointSize().f47800y);
            d();
        }
    }

    public final void setExitOnClickListener(yz5.l onExitListener) {
        kotlin.jvm.internal.o.g(onExitListener, "onExitListener");
        getOkBtn().setOnClickListener(new ox0.r(onExitListener, this));
        getCancelBtn().setOnClickListener(new ox0.s(onExitListener, this));
    }

    public /* synthetic */ CropView(android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18, kotlin.jvm.internal.i iVar) {
        this(context, (i18 & 2) != 0 ? null : attributeSet, (i18 & 4) != 0 ? 0 : i17);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CropView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        jz5.i iVar = jz5.i.f302831f;
        this.cropDraw = jz5.h.a(iVar, new ox0.j(this));
        this.cropImage = jz5.h.a(iVar, new ox0.k(this));
        this.bottomContainer = jz5.h.a(iVar, new ox0.h(this));
        this.rotateBtn = jz5.h.a(iVar, new ox0.p(this));
        this.mirrorBtn = jz5.h.a(iVar, new ox0.m(this));
        this.resetText = jz5.h.a(iVar, new ox0.o(this));
        this.cancelBtn = jz5.h.a(iVar, new ox0.i(this));
        this.okBtn = jz5.h.a(iVar, new ox0.n(this));
        android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.dxz, this);
        getRotateBtn().setOnClickListener(new ox0.b(this));
        getMirrorBtn().setOnClickListener(new ox0.d(this));
        getResetText().setOnClickListener(new ox0.e(this));
        getCropDraw().setOnTouchListener(new ox0.f(new bv0.h(context, new ox0.l(this))));
    }
}
