package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bB#\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\n\u0010\u000eJ\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\u0016\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004H\u0002¨\u0006\u000f"}, d2 = {"Lcom/tencent/mm/plugin/finder/live/view/FinderLiveCommentTouchLayout;", "Landroid/widget/RelativeLayout;", "Landroid/graphics/Rect;", "getCommentRectOnScreen", "Ljz5/l;", "getCommentExtraRectOnScreen", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.live.view.FinderLiveCommentTouchLayout */
/* loaded from: classes3.dex */
public final class C14307xcd4bf55c extends android.widget.RelativeLayout {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f197369d;

    /* renamed from: e, reason: collision with root package name */
    public android.graphics.Rect f197370e;

    /* renamed from: f, reason: collision with root package name */
    public jz5.l f197371f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f197372g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f197373h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14307xcd4bf55c(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f197369d = "FinderLiveCommentTouchLayout";
    }

    /* renamed from: getCommentExtraRectOnScreen */
    private final jz5.l m57278xa7a10e36() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.mg mgVar;
        ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) ((s40.w0) i95.n0.c(s40.w0.class))).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var = dk2.ef.f314913e;
        if (k0Var == null || (mgVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.mg) k0Var.mo57682x2a5e9229(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.mg.class)) == null || !mgVar.C1().isShown()) {
            return null;
        }
        jz5.l lVar = mgVar.X;
        if (lVar != null) {
            return lVar;
        }
        int[] t17 = pm0.v.t(mgVar.C1());
        int i17 = t17[0];
        android.graphics.Rect rect = new android.graphics.Rect(i17, t17[1], mgVar.C1().getWidth() + i17, t17[1] + mgVar.C1().getHeight());
        android.graphics.Rect rect2 = new android.graphics.Rect(rect.left, rect.top - mgVar.D1(), rect.right, rect.top);
        int i18 = rect.left;
        int i19 = rect.bottom;
        jz5.l lVar2 = new jz5.l(rect2, new android.graphics.Rect(i18, i19, rect.right, mgVar.D1() + i19));
        mgVar.X = lVar2;
        return lVar2;
    }

    /* renamed from: getCommentRectOnScreen */
    private final android.graphics.Rect m57279x4d3fb9f8() {
        return ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) ((s40.w0) i95.n0.c(s40.w0.class))).Kj();
    }

    public final boolean a(float f17, float f18) {
        jz5.l lVar = this.f197371f;
        if (lVar == null) {
            return false;
        }
        int i17 = (int) f17;
        int i18 = (int) f18;
        return ((android.graphics.Rect) lVar.f384366d).contains(i17, i18) || ((android.graphics.Rect) lVar.f384367e).contains(i17, i18);
    }

    /* JADX WARN: Code restructure failed: missing block: B:78:0x018d, code lost:
    
        if (a(r11 != null ? r11.getX() : 0.0f, r11 != null ? r11.getY() : 0.0f) != false) goto L111;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean dispatchTouchEvent(android.view.MotionEvent r11) {
        /*
            Method dump skipped, instructions count: 520
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14307xcd4bf55c.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14307xcd4bf55c(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f197369d = "FinderLiveCommentTouchLayout";
    }
}
