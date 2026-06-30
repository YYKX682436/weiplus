package r02;

/* loaded from: classes8.dex */
public class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r02.j f449837d;

    public i(r02.j jVar) {
        this.f449837d = jVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        r02.j jVar = this.f449837d;
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(jVar.f449839a);
        com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.ui.ActivityC13242xdf6880d5 activityC13242xdf6880d5 = jVar.f449840b;
        if (!K0) {
            java.util.HashMap hashMap = (java.util.HashMap) activityC13242xdf6880d5.f178910i.f178840b;
            java.lang.String str = jVar.f449839a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.r0 r0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.r0) hashMap.get(str);
            if (r0Var != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.s0.a(str);
                com.p314xaae8f345.mm.p794xb0fa9b5e.w0.d(new r02.h(this, r0Var), 200L);
            } else {
                db5.e1.s(activityC13242xdf6880d5, "", activityC13242xdf6880d5.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.h9x));
            }
        }
        activityC13242xdf6880d5.V6(activityC13242xdf6880d5.f178910i, true);
    }
}
