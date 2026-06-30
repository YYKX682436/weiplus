package r02;

/* loaded from: classes8.dex */
public class t implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h02.a f449866d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.r0 f449867e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.ui.ActivityC13242xdf6880d5 f449868f;

    public t(com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.ui.ActivityC13242xdf6880d5 activityC13242xdf6880d5, h02.a aVar, com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.r0 r0Var) {
        this.f449868f = activityC13242xdf6880d5;
        this.f449866d = aVar;
        this.f449867e = r0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.r0 r0Var = this.f449867e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.ui.ActivityC13242xdf6880d5 activityC13242xdf6880d5 = this.f449868f;
        h02.a aVar = this.f449866d;
        if (aVar == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.o.b(activityC13242xdf6880d5, r0Var, true);
            return;
        }
        int i17 = aVar.f68441x10a0fed7;
        if (i17 == 1) {
            return;
        }
        if (i17 == 2) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.o.f(activityC13242xdf6880d5, com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.d(r0Var.f178850f), r0Var, false, null);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.o.b(activityC13242xdf6880d5, r0Var, true);
        }
    }
}
