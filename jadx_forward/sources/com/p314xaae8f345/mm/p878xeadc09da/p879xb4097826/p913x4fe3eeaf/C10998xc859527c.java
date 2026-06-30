package com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p913x4fe3eeaf;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\nB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/tencent/mm/mj_publisher/finder/widgets/MovieComposingPlayerCoverView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "dy0/i", "plugin-mj-template_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.mj_publisher.finder.widgets.MovieComposingPlayerCoverView */
/* loaded from: classes5.dex */
public final class C10998xc859527c extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f151219d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f151220e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C10998xc859527c(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent ev6) {
        java.lang.Object obj;
        boolean z17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ev6, "ev");
        java.util.Iterator it = this.f151219d.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            bv0.e eVar = (bv0.e) ((dy0.i) obj);
            eVar.getClass();
            if (ev6.getAction() == 0) {
                java.util.ArrayList arrayList = eVar.f106227e;
                if (!(arrayList instanceof java.util.Collection) || !arrayList.isEmpty()) {
                    java.util.Iterator it6 = arrayList.iterator();
                    while (it6.hasNext()) {
                        if (((bv0.a) it6.next()).mo9046xc3989f21(ev6.getX(), ev6.getY())) {
                            z17 = true;
                            break;
                        }
                    }
                }
                z17 = false;
                eVar.f106225c = z17;
            }
            if (eVar.f106225c) {
                break;
            }
        }
        if (obj != null) {
            return true;
        }
        return super.onInterceptTouchEvent(ev6);
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent ev6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ev6, "ev");
        java.lang.Object obj = null;
        if (ev6.getAction() == 1) {
            yy0.m7 m7Var = (yy0.m7) ((pp0.l0) i95.n0.c(pp0.l0.class));
            p3325xe03a0797.p3326xc267989b.l.d(m7Var.Di(), null, null, new yy0.n4(m7Var, null), 3, null);
        }
        java.util.Iterator it = this.f151219d.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            bv0.e eVar = (bv0.e) ((dy0.i) next);
            eVar.getClass();
            eVar.f106223a.a(ev6);
            eVar.f106224b.b(ev6);
            if (eVar.f106225c) {
                obj = next;
                break;
            }
        }
        if (obj != null) {
            return true;
        }
        java.util.Iterator it6 = this.f151220e.iterator();
        while (it6.hasNext()) {
            if (((android.view.ViewGroup) it6.next()).dispatchTouchEvent(ev6)) {
                return true;
            }
        }
        return super.onTouchEvent(ev6);
    }

    public /* synthetic */ C10998xc859527c(android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(context, (i18 & 2) != 0 ? null : attributeSet, (i18 & 4) != 0 ? 0 : i17);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10998xc859527c(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f151219d = new java.util.ArrayList();
        this.f151220e = new java.util.ArrayList();
    }
}
