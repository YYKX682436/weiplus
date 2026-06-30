package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1419xb9d38a2d.p1421xac8f1cfd;

/* loaded from: classes2.dex */
public class f extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1419xb9d38a2d.api.p1420xac8f1cfd.C13638xb683e9ec {

    /* renamed from: z, reason: collision with root package name */
    public boolean f183238z;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public f(android.content.Context r1, android.util.AttributeSet r2, boolean r3, int r4, p3321xbce91901.jvm.p3324x21ffc6bd.i r5) {
        /*
            r0 = this;
            r4 = r4 & 2
            if (r4 == 0) goto L5
            r2 = 0
        L5:
            java.lang.String r4 = "context"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r1, r4)
            r0.<init>(r1, r2)
            r0.f183238z = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1419xb9d38a2d.p1421xac8f1cfd.f.<init>(android.content.Context, android.util.AttributeSet, boolean, int, kotlin.jvm.internal.i):void");
    }

    @Override // com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22821xbaee45b5
    public com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781 p() {
        android.content.Context context = getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        return new com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22820x7802ca65(context, null);
    }

    /* renamed from: setNeedCreateAccount */
    public final void m55421xf3e20c59(boolean z17) {
        this.f183238z = z17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1419xb9d38a2d.api.p1420xac8f1cfd.C13638xb683e9ec
    public int u(android.content.Context context, int i17) {
        int i18;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561195c0) + (context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561182bo) * i17) + (this.f183238z ? context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561266dq) : context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561208cc));
        int c17 = com.p314xaae8f345.mm.ui.bl.c(context);
        android.graphics.Point b17 = com.p314xaae8f345.mm.ui.bl.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        int i19 = b17.x;
        int i27 = b17.y;
        java.lang.System.nanoTime();
        boolean z17 = com.p314xaae8f345.mm.ui.bk.y() || com.p314xaae8f345.mm.ui.bk.Q() || com.p314xaae8f345.mm.ui.bk.A();
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        if (z17) {
            i18 = i27 - c17;
        } else {
            if (i27 >= i19) {
                i19 = i27;
            }
            i18 = i19 - c17;
        }
        int i28 = (int) (i18 * 0.75f);
        int i29 = dimensionPixelSize >= i28 ? i28 : dimensionPixelSize;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderAccountSwitchDrawer", "totalHeight=" + i18 + " realHeight=" + dimensionPixelSize + " maxHeight=" + i28);
        return i18 - i29;
    }
}
