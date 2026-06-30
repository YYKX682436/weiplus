package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class bi implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.ei f199429a;

    public bi(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.ei eiVar) {
        this.f199429a = eiVar;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.ei eiVar = this.f199429a;
        boolean z17 = true;
        eiVar.d(true);
        if (fVar.f152148a == 0 && fVar.f152149b == 0) {
            db5.t7.i(eiVar.getContext(), eiVar.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.de9), com.p314xaae8f345.mm.R.raw.f79703xc84d169a);
        } else {
            int i17 = fVar.f152149b;
            if (i17 == -200143) {
                java.lang.String str = fVar.f152150c;
                if (str != null && str.length() != 0) {
                    z17 = false;
                }
                db5.t7.i(eiVar.getContext(), z17 ? eiVar.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.de7) : fVar.f152150c, com.p314xaae8f345.mm.R.raw.f79891x20253fac);
            } else if (i17 == -200144) {
                db5.t7.g(eiVar.getContext(), fVar.f152150c);
            } else {
                java.lang.String str2 = fVar.f152150c;
                if (str2 != null && str2.length() != 0) {
                    z17 = false;
                }
                db5.t7.g(eiVar.getContext(), z17 ? eiVar.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.de6) : fVar.f152150c);
            }
        }
        return jz5.f0.f384359a;
    }
}
