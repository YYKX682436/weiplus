package com.p314xaae8f345.mm.ui.p2710x1c644e5f;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u000201B\u001d\b\u0007\u0012\u0006\u0010+\u001a\u00020*\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010,¢\u0006\u0004\b.\u0010/R0\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\"\u0010\u000e\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R*\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R$\u0010!\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u0014\u0010%\u001a\u00020\"8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0014\u0010)\u001a\u00020&8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u00062"}, d2 = {"Lcom/tencent/mm/ui/halfscreen/HalfScreenPullDownCloseLayout;", "Landroid/widget/FrameLayout;", "Lkotlin/Function1;", "Landroid/view/MotionEvent;", "", "d", "Lyz5/l;", "getDragEnableBlock", "()Lyz5/l;", "setDragEnableBlock", "(Lyz5/l;)V", "dragEnableBlock", "e", "Z", "isRecordDragPosition", "()Z", "setRecordDragPosition", "(Z)V", "Lkotlin/Function0;", "m", "Lyz5/a;", "getDragFinishInterceptor", "()Lyz5/a;", "setDragFinishInterceptor", "(Lyz5/a;)V", "dragFinishInterceptor", "Lbh5/e;", "o", "Lbh5/e;", "getPullDownCallback", "()Lbh5/e;", "setPullDownCallback", "(Lbh5/e;)V", "pullDownCallback", "", "getMSlideHeight", "()F", "mSlideHeight", "", "getMDialogHeight", "()I", "mDialogHeight", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "bh5/f", "bh5/g", "libmmui_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.ui.halfscreen.HalfScreenPullDownCloseLayout */
/* loaded from: classes14.dex */
public final class C22412x5e02431c extends android.widget.FrameLayout {

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f290322p = 0;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public yz5.l dragEnableBlock;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public boolean isRecordDragPosition;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f290325f;

    /* renamed from: g, reason: collision with root package name */
    public android.app.Activity f290326g;

    /* renamed from: h, reason: collision with root package name */
    public p012xc85e97e9.p080xa1c8a596.p082xd1075a44.l f290327h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f290328i;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    public yz5.a dragFinishInterceptor;

    /* renamed from: n, reason: collision with root package name */
    public bh5.g f290330n;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    public bh5.e pullDownCallback;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22412x5e02431c(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f290326g = (android.app.Activity) context;
        this.f290327h = new p012xc85e97e9.p080xa1c8a596.p082xd1075a44.l(getContext(), this, new bh5.f(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getMDialogHeight */
    public final int m80683x58bb39e6() {
        return getHeight();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getMSlideHeight */
    public final float m80684xc0319601() {
        return m80683x58bb39e6() * 0.3f;
    }

    @Override // android.view.View
    public void computeScroll() {
        p012xc85e97e9.p080xa1c8a596.p082xd1075a44.l lVar = this.f290327h;
        boolean z17 = false;
        if (lVar != null && lVar.h(true)) {
            z17 = true;
        }
        if (z17) {
            invalidate();
        }
    }

    public final yz5.l getDragEnableBlock() {
        return this.dragEnableBlock;
    }

    public final yz5.a getDragFinishInterceptor() {
        return this.dragFinishInterceptor;
    }

    public final bh5.e getPullDownCallback() {
        return this.pullDownCallback;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0015, code lost:
    
        if (((java.lang.Boolean) r0.mo146xb9724478(r4)).booleanValue() == true) goto L8;
     */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r4) {
        /*
            r3 = this;
            java.lang.String r0 = "event"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r4, r0)
            yz5.l r0 = r3.dragEnableBlock
            r1 = 0
            if (r0 == 0) goto L18
            java.lang.Object r0 = r0.mo146xb9724478(r4)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r2 = 1
            if (r0 != r2) goto L18
            goto L19
        L18:
            r2 = r1
        L19:
            if (r2 == 0) goto L24
            androidx.customview.widget.l r0 = r3.f290327h
            if (r0 == 0) goto L24
            boolean r4 = r0.t(r4)
            r1 = r4
        L24:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2710x1c644e5f.C22412x5e02431c.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        super.onLayout(z17, i17, i18, i19, i27);
        bh5.g gVar = this.f290330n;
        if (gVar != null) {
            android.view.View view = gVar.f102465a;
            view.layout(view.getLeft(), gVar.f102466b, view.getRight(), gVar.f102467c);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        p012xc85e97e9.p080xa1c8a596.p082xd1075a44.l lVar = this.f290327h;
        if (lVar == null) {
            return true;
        }
        lVar.m(event);
        return true;
    }

    /* renamed from: setDragEnableBlock */
    public final void m80688x4e740634(yz5.l lVar) {
        this.dragEnableBlock = lVar;
    }

    /* renamed from: setDragFinishInterceptor */
    public final void m80689xdf36bd7c(yz5.a aVar) {
        this.dragFinishInterceptor = aVar;
    }

    /* renamed from: setPullDownCallback */
    public final void m80690xcd40a66e(bh5.e eVar) {
        this.pullDownCallback = eVar;
    }

    /* renamed from: setRecordDragPosition */
    public final void m80691xb8d26970(boolean z17) {
        this.isRecordDragPosition = z17;
    }
}
