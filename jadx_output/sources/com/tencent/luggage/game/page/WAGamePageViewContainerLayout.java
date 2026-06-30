package com.tencent.luggage.game.page;

/* loaded from: classes7.dex */
public class WAGamePageViewContainerLayout extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public ce.k f47259d;

    /* renamed from: e, reason: collision with root package name */
    public android.app.Activity f47260e;

    /* renamed from: f, reason: collision with root package name */
    public ce.j f47261f;

    public WAGamePageViewContainerLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0061, code lost:
    
        if ((r1 == r5 || r1 == r3) == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0075, code lost:
    
        if ((r1 == r4 || r1 == r2) != false) goto L60;
     */
    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onLayout(boolean r22, int r23, int r24, int r25, int r26) {
        /*
            Method dump skipped, instructions count: 359
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.luggage.game.page.WAGamePageViewContainerLayout.onLayout(boolean, int, int, int, int):void");
    }

    public void setOnConfigurationChangedListener(ce.j jVar) {
        this.f47261f = jVar;
    }

    public WAGamePageViewContainerLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f47259d = null;
        this.f47261f = null;
        this.f47260e = q75.a.a(getContext());
    }
}
