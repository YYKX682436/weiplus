package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class y7 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.a8 f196693d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f196694e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y7(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.a8 a8Var, boolean z17) {
        super(0);
        this.f196693d = a8Var;
        this.f196694e = z17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        boolean z17;
        boolean z18;
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.a8 a8Var = this.f196693d;
        java.lang.String str = a8Var.f193353p;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("notifyAnchorVolumeChange isTalking:");
        boolean z19 = this.f196694e;
        sb6.append(z19);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        xh2.c cVar = (xh2.c) ((mm2.o4) a8Var.P0(mm2.o4.class)).A.mo3195x754a37bb();
        if (cVar != null) {
            int i17 = cVar.f536067d;
            if ((i17 == 0 && cVar.f536069f == 1) || (i17 == 2 && cVar.f536068e == 1)) {
                z17 = true;
                z18 = pm0.v.z(a8Var.f193361x, 1);
                c22789xd23e9a9b = a8Var.f193357t;
                if (z18 || pm0.v.z(a8Var.f193361x, 4) || z17) {
                    c22789xd23e9a9b.setVisibility(8);
                    c22789xd23e9a9b.n();
                } else if (z19) {
                    c22789xd23e9a9b.setVisibility(0);
                    if (!c22789xd23e9a9b.f()) {
                        c22789xd23e9a9b.g();
                    }
                } else {
                    c22789xd23e9a9b.setVisibility(8);
                    c22789xd23e9a9b.n();
                }
                return jz5.f0.f384359a;
            }
        }
        z17 = false;
        z18 = pm0.v.z(a8Var.f193361x, 1);
        c22789xd23e9a9b = a8Var.f193357t;
        if (z18) {
        }
        c22789xd23e9a9b.setVisibility(8);
        c22789xd23e9a9b.n();
        return jz5.f0.f384359a;
    }
}
