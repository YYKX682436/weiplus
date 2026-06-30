package mx0;

/* loaded from: classes5.dex */
public final class y2 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10973x5ab09303 f413982d;

    public y2(com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10973x5ab09303 c10973x5ab09303) {
        this.f413982d = c10973x5ab09303;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("playReverseAni record ani >> ani end ");
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10973x5ab09303 c10973x5ab09303 = this.f413982d;
        sb6.append(c10973x5ab09303.f151044q);
        sb6.append(", ");
        sb6.append(c10973x5ab09303.C);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecordButton", sb6.toString());
        if (!c10973x5ab09303.C) {
            c10973x5ab09303.f151044q = false;
            return;
        }
        if (c10973x5ab09303.f151044q) {
            mx0.a0 a0Var = c10973x5ab09303.f151039i;
            if (a0Var != null) {
                ((mx0.e3) a0Var).a();
            }
            c10973x5ab09303.f151044q = false;
            return;
        }
        if (c10973x5ab09303.D) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecordButton", "tap to auto record");
            com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10973x5ab09303.a(c10973x5ab09303, true);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecordButton", "tap to take picture");
        mx0.x9 x9Var = c10973x5ab09303.f151040m;
        if (x9Var != null) {
            mx0.g3 g3Var = ((mx0.d3) x9Var).f413449a;
            long j17 = g3Var.f413532p;
            if (j17 != -1) {
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                if (android.os.SystemClock.elapsedRealtime() - j17 <= g3Var.f413531o) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImproveRecordButtonPlugin", "onSimpleTap too often! %s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.b(true));
                    dx1.g.f326022a.j("SnsPublishProcess", "endSessionShot", 1, bx1.u.f117843e);
                }
            }
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImproveRecordButtonPlugin", "onSimpleTap %s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.b(true));
            g3Var.f413526g.m47281xbc91ffe0(false);
            ((com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10977x8e40eced) g3Var.f413524e).e1();
            g3Var.f413532p = android.os.SystemClock.elapsedRealtime();
            dx1.g.f326022a.j("SnsPublishProcess", "endSessionShot", 1, bx1.u.f117843e);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecordButton", "playReverseAni record ani >> ani start");
        int i17 = com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10973x5ab09303.G;
        this.f413982d.e();
    }
}
