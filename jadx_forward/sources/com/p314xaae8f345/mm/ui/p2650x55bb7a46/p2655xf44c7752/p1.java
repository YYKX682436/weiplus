package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752;

/* loaded from: classes12.dex */
public class p1 implements com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.r0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.q1 f282792a;

    public p1(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.q1 q1Var) {
        this.f282792a = q1Var;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.r0
    public void S(long j17, long j18, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        android.graphics.Bitmap Ai;
        if (j17 == j18) {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.q1 q1Var = this.f282792a;
            q1Var.f282821d.m124847x74d37ac6();
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ta taVar = q1Var.f282822e;
            taVar.f(taVar.f282980y, 8);
            try {
                Ai = x51.w0.c(q1Var.f282823f);
            } catch (java.lang.OutOfMemoryError unused) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ImageGalleryAdapter", "[tomys] Oops, app img [%s] is too large, use resample version.", q1Var.f282823f);
                java.lang.Runtime.getRuntime().gc();
                java.lang.Runtime.getRuntime().runFinalization();
                Ai = ((x60.e) ((y60.f) i95.n0.c(y60.f.class))).Ai(q1Var.f282823f);
            }
            if (Ai != null) {
                q1Var.f282822e.C.m79195x464b3146(false);
                com.p314xaae8f345.mm.ui.p2642x2e06d1.C21524xecd57b9a c21524xecd57b9a = q1Var.f282822e.C;
                int width = Ai.getWidth();
                int height = Ai.getHeight();
                c21524xecd57b9a.f279184o = width;
                c21524xecd57b9a.f279185p = height;
                q1Var.f282822e.C.setImageBitmap(Ai);
                q1Var.f282822e.C.invalidate();
            }
        }
    }
}
