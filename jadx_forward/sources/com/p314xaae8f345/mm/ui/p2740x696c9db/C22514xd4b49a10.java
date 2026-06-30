package com.p314xaae8f345.mm.ui.p2740x696c9db;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/tencent/mm/ui/tools/NewCountryCodeAlphabetScrollBar;", "Lcom/tencent/mm/ui/base/AlphabetScrollBar;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "app_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.ui.tools.NewCountryCodeAlphabetScrollBar */
/* loaded from: classes15.dex */
public final class C22514xd4b49a10 extends com.p314xaae8f345.mm.ui.p2642x2e06d1.C21465x84498b3 {
    public C22514xd4b49a10(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.C21465x84498b3, com.p314xaae8f345.mm.ui.p2642x2e06d1.AbstractC21534x4b3e8b10
    public void c() {
        super.c();
        this.f279239f = new java.lang.String[]{"🔍", p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f2968x9376332f, "B", "C", "D", p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3048xa13f9cad, "F", "G", "H", "J", "K", "L", "M", "N", "P", "R", p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3025x7c20d01a, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f2960xe17f46c3, p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3049xa147da5f, "X", "Y", "Z"};
    }

    public final void e(java.lang.String header, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(header, "header");
        java.lang.String[] alphabet = this.f279239f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(alphabet, "alphabet");
        int X = kz5.z.X(alphabet, header);
        if (z17 && X >= 0) {
            java.lang.String[] strArr = this.f279239f;
            if (X < strArr.length) {
                this.f279240g = X;
                d(strArr[X]);
                this.f279244n = true;
                invalidate();
            }
        }
        this.f279240g = 0;
        this.f279244n = false;
        invalidate();
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        if ((r4.getAction() == 3) != false) goto L11;
     */
    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.AbstractC21534x4b3e8b10, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r4) {
        /*
            r3 = this;
            super.onTouchEvent(r4)
            int r0 = r4.getAction()
            r1 = 0
            r2 = 1
            if (r0 != r2) goto Ld
            r0 = r2
            goto Le
        Ld:
            r0 = r1
        Le:
            if (r0 != 0) goto L1a
            int r4 = r4.getAction()
            r0 = 3
            if (r4 != r0) goto L18
            r1 = r2
        L18:
            if (r1 == 0) goto L20
        L1a:
            int r4 = r3.f279240g
            if (r4 == 0) goto L20
            r3.f279244n = r2
        L20:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2740x696c9db.C22514xd4b49a10.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
