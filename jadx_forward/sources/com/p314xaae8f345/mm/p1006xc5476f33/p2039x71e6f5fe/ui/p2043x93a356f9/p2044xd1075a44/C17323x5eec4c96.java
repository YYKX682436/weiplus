package com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2043x93a356f9.p2044xd1075a44;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fB#\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000b\u0010\u000fJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0010"}, d2 = {"Lcom/tencent/mm/plugin/scanner/ui/scangoods/widget/ScanAnimationDotsView;", "Landroid/view/View;", "Lc04/e;", "", "duration", "Ljz5/f0;", "setDuration", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-scan_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.scanner.ui.scangoods.widget.ScanAnimationDotsView */
/* loaded from: classes13.dex */
public final class C17323x5eec4c96 extends android.view.View implements c04.e {

    /* renamed from: d, reason: collision with root package name */
    public c04.f f241165d;

    /* renamed from: e, reason: collision with root package name */
    public int f241166e;

    /* renamed from: f, reason: collision with root package name */
    public int f241167f;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C17323x5eec4c96(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        super.onDraw(canvas);
        c04.f fVar = this.f241165d;
        if (fVar != null) {
            java.util.Iterator it = ((c04.b) fVar).f119204d.iterator();
            while (it.hasNext()) {
                ((c04.g) ((c04.d) it.next())).getClass();
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i17, int i18) {
        super.onMeasure(i17, i18);
        if (this.f241166e == getMeasuredWidth() && this.f241167f == getMeasuredHeight()) {
            return;
        }
        this.f241166e = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        this.f241167f = measuredHeight;
        c04.f fVar = this.f241165d;
        if (fVar != null) {
            int i19 = this.f241166e;
            c04.b bVar = (c04.b) fVar;
            bVar.getClass();
            bVar.getClass();
            java.util.Iterator it = bVar.f119204d.iterator();
            while (it.hasNext()) {
                ((c04.g) ((c04.d) it.next())).a(i19, measuredHeight, false);
            }
        }
    }

    /* renamed from: setDuration */
    public void m68740xffd6ec16(long j17) {
        c04.f fVar = this.f241165d;
        if (fVar != null) {
            c04.b bVar = (c04.b) fVar;
            bVar.getClass();
            java.util.Iterator it = bVar.f119204d.iterator();
            while (it.hasNext()) {
                ((c04.g) ((c04.d) it.next())).getClass();
            }
        }
    }

    @Override // c04.e
    /* renamed from: startAnimation */
    public void mo13988x2d8c4542() {
        c04.f fVar = this.f241165d;
        if (fVar != null) {
            fVar.mo13988x2d8c4542();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17323x5eec4c96(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f241165d = new c04.c(context, this);
    }
}
