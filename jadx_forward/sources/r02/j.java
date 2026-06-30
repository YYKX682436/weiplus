package r02;

/* loaded from: classes8.dex */
public class j implements com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.p0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f449839a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.ui.ActivityC13242xdf6880d5 f449840b;

    public j(com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.ui.ActivityC13242xdf6880d5 activityC13242xdf6880d5, java.lang.String str) {
        this.f449840b = activityC13242xdf6880d5;
        this.f449839a = str;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.p0
    public void a(boolean z17) {
        com.p314xaae8f345.mm.p794xb0fa9b5e.w0.c(true, new r02.g(this));
        com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.ui.ActivityC13242xdf6880d5 activityC13242xdf6880d5 = this.f449840b;
        if (z17) {
            activityC13242xdf6880d5.f178910i = com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.q0.a();
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new r02.i(this));
        } else {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f449839a)) {
                return;
            }
            db5.e1.s(activityC13242xdf6880d5, "", activityC13242xdf6880d5.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.awx));
        }
    }
}
