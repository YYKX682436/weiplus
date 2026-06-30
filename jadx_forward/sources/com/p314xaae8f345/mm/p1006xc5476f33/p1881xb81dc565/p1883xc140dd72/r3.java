package com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72;

/* loaded from: classes14.dex */
public class r3 implements com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.s3 f231291a;

    public r3(com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.s3 s3Var) {
        this.f231291a = s3Var;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.v
    public void a(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.o oVar) {
        r45.v07 v07Var = (r45.v07) oVar.f152244b.f152233a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.s3 s3Var = this.f231291a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.c cVar = s3Var.f231315e.Y;
        java.lang.String str2 = s3Var.f231314d;
        int i19 = v07Var.f469325e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.v0 v0Var = cVar.f231047a;
        v0Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MT.MultiTalkManager", "onDoScreenSharingSecurityCheck filemd5:%s ret:%d checkRet:%d", str2, java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
        ((ku5.t0) ku5.t0.f394148d).A("delayChecking");
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.c3 c3Var = v0Var.f231706p1;
        if (c3Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MT.MultiTalkManager", "mFileSecurity is null");
            return;
        }
        c3Var.f231435b = java.lang.Boolean.valueOf(i19 == 0);
        c3Var.f231434a = str2;
        p012xc85e97e9.p093xedfae76a.j0 j0Var = v0Var.f231716x1;
        if (j0Var != null) {
            j0Var.mo7808x76db6cb1(c3Var);
        }
    }
}
