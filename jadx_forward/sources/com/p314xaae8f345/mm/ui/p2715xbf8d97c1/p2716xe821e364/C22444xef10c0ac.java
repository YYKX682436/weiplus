package com.p314xaae8f345.mm.ui.p2715xbf8d97c1.p2716xe821e364;

/* renamed from: com.tencent.mm.ui.matrix.recyclerview.JsonRecyclerView */
/* loaded from: classes15.dex */
public class C22444xef10c0ac extends p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 {

    /* renamed from: b2, reason: collision with root package name */
    public int f290649b2;

    /* renamed from: c2, reason: collision with root package name */
    public float f290650c2;

    /* renamed from: d2, reason: collision with root package name */
    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.v2 f290651d2;

    public C22444xef10c0ac(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static float g1(com.p314xaae8f345.mm.ui.p2715xbf8d97c1.p2716xe821e364.C22444xef10c0ac c22444xef10c0ac, android.view.MotionEvent motionEvent) {
        c22444xef10c0ac.getClass();
        float x17 = motionEvent.getX(0) - motionEvent.getX(1);
        float y17 = motionEvent.getY(0) - motionEvent.getY(1);
        return (float) java.lang.Math.sqrt((x17 * x17) + (y17 * y17));
    }

    /* renamed from: setBracesColor */
    public void m80779x3975e0e1(int i17) {
    }

    /* renamed from: setKeyColor */
    public void m80780x92e462c6(int i17) {
    }

    /* renamed from: setScaleEnable */
    public void m80781x271b35ab(boolean z17) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.v2 v2Var = this.f290651d2;
        if (z17) {
            P(v2Var);
        } else {
            U0(v2Var);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x000c, code lost:
    
        if (r3 > 30.0f) goto L4;
     */
    /* renamed from: setTextSize */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m80782x3abfd950(float r3) {
        /*
            r2 = this;
            r0 = 1092616192(0x41200000, float:10.0)
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 >= 0) goto L8
        L6:
            r3 = r0
            goto Lf
        L8:
            r0 = 1106247680(0x41f00000, float:30.0)
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 <= 0) goto Lf
            goto L6
        Lf:
            float r0 = qh5.a.f444983d
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 == 0) goto L17
            qh5.a.f444983d = r3
        L17:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2715xbf8d97c1.p2716xe821e364.C22444xef10c0ac.m80782x3abfd950(float):void");
    }

    /* renamed from: setValueBooleanColor */
    public void m80783xdc5503ea(int i17) {
    }

    /* renamed from: setValueNullColor */
    public void m80784x92f3a8ad(int i17) {
    }

    /* renamed from: setValueNumberColor */
    public void m80785x33957beb(int i17) {
    }

    /* renamed from: setValueTextColor */
    public void m80786x16ed00c7(int i17) {
    }

    /* renamed from: setValueUrlColor */
    public void m80787xe8709e83(int i17) {
    }

    public C22444xef10c0ac(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f290651d2 = new qh5.b(this);
        mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(getContext()));
    }
}
