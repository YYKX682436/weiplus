package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718;

/* loaded from: classes8.dex */
public final class o1 implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public boolean f187267d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.w1 f187268e;

    public o1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.w1 w1Var) {
        this.f187268e = w1Var;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.z9 it = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.z9) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.w1 w1Var = this.f187268e;
        boolean z17 = it.f186860a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb jbVar = it.f186862c;
        if (!z17 || this.f187267d) {
            if (!z17) {
                w1Var.f187485p = null;
                w1Var.f187486q = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.i1.f187110d;
            }
            if (jbVar != null && jbVar.y0("FinderEntrance")) {
                w1Var.f187482m |= 256;
            } else {
                if (jbVar != null && jbVar.y0("FinderLiveEntrance")) {
                    w1Var.f187482m |= 512;
                }
            }
        } else {
            w1Var.Ni("tabChange");
            jz5.l Di = w1Var.Di(true);
            w1Var.f187485p = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb) Di.f384366d;
            w1Var.f187486q = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.i1) Di.f384367e;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.NewDiscoveryRedDotHandler", java.lang.String.valueOf(jbVar));
        }
        this.f187267d = z17;
    }
}
