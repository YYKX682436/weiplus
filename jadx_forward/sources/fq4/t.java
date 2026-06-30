package fq4;

/* loaded from: classes15.dex */
public class t implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public int f347175d = 71;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f347176e = null;

    /* renamed from: f, reason: collision with root package name */
    public int f347177f = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f347178g = 0;

    /* renamed from: h, reason: collision with root package name */
    public fq4.s f347179h;

    public t(fq4.s sVar) {
        this.f347179h = null;
        c01.d9.e().a(611, this);
        c01.d9.e().a(612, this);
        this.f347179h = sVar;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        fq4.s sVar;
        if (i17 != 0 && i18 != 0) {
            if (i18 != -34) {
                fq4.s sVar2 = this.f347179h;
                if (sVar2 != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui.ActivityC18840xef9a7fc2 activityC18840xef9a7fc2 = (com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui.ActivityC18840xef9a7fc2) sVar2;
                    activityC18840xef9a7fc2.f257701h.m72725xca0261a3(com.p314xaae8f345.mm.R.C30867xcad56011.k9u);
                    activityC18840xef9a7fc2.f257701h.c();
                    activityC18840xef9a7fc2.a7();
                    return;
                }
                return;
            }
            fq4.s sVar3 = this.f347179h;
            if (sVar3 != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui.ActivityC18840xef9a7fc2 activityC18840xef9a7fc22 = (com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui.ActivityC18840xef9a7fc2) sVar3;
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                    str = activityC18840xef9a7fc22.getString(com.p314xaae8f345.mm.R.C30867xcad56011.k9n);
                }
                activityC18840xef9a7fc22.f257701h.m72726xca0261a3(str);
                activityC18840xef9a7fc22.f257701h.c();
                activityC18840xef9a7fc22.a7();
                return;
            }
            return;
        }
        if (m1Var.mo808xfb85f7b0() == 611) {
            fq4.e eVar = (fq4.e) m1Var;
            this.f347177f = eVar.f347123g;
            java.lang.String str2 = eVar.f347122f;
            this.f347176e = str2;
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            fq4.s sVar4 = this.f347179h;
            if (sVar4 != null) {
                int i19 = this.f347175d;
                if (i19 == 71) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui.ActivityC18840xef9a7fc2 activityC18840xef9a7fc23 = (com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui.ActivityC18840xef9a7fc2) sVar4;
                    activityC18840xef9a7fc23.Y6();
                    activityC18840xef9a7fc23.f257705o = str2;
                    activityC18840xef9a7fc23.T6();
                    activityC18840xef9a7fc23.f257701h.d();
                    activityC18840xef9a7fc23.f257701h.m72728x63103da6(str2);
                    activityC18840xef9a7fc23.f257698e.setEnabled(true);
                } else if (i19 == 72) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui.ActivityC18840xef9a7fc2 activityC18840xef9a7fc24 = (com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui.ActivityC18840xef9a7fc2) sVar4;
                    activityC18840xef9a7fc24.f257705o = str2;
                    activityC18840xef9a7fc24.T6();
                    activityC18840xef9a7fc24.f257701h.d();
                    activityC18840xef9a7fc24.f257701h.m72728x63103da6(str2);
                    activityC18840xef9a7fc24.f257698e.setEnabled(true);
                }
            }
        }
        if (m1Var.mo808xfb85f7b0() == 612) {
            fq4.i iVar = (fq4.i) m1Var;
            int i27 = iVar.f347142n;
            boolean z18 = (i27 == 72 && iVar.f347143o == 0) || i27 == 71;
            if (z18) {
                this.f347178g = iVar.f347141m;
                fq4.s sVar5 = this.f347179h;
                if (sVar5 != null) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui.ActivityC18840xef9a7fc2) sVar5).Z6(true, i27);
                }
            } else {
                fq4.s sVar6 = this.f347179h;
                if (sVar6 != null) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui.ActivityC18840xef9a7fc2) sVar6).Z6(false, i27);
                }
            }
            if (z18 && i27 == 71 && (sVar = this.f347179h) != null) {
                java.lang.String str3 = this.f347176e;
                com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui.ActivityC18840xef9a7fc2 activityC18840xef9a7fc25 = (com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui.ActivityC18840xef9a7fc2) sVar;
                activityC18840xef9a7fc25.f257705o = str3;
                activityC18840xef9a7fc25.T6();
                activityC18840xef9a7fc25.f257701h.d();
                activityC18840xef9a7fc25.f257701h.m72728x63103da6(str3);
                activityC18840xef9a7fc25.f257698e.setEnabled(true);
            }
        }
    }
}
