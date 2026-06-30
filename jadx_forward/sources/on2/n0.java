package on2;

/* loaded from: classes3.dex */
public final class n0 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ on2.v0 f428506a;

    public n0(on2.v0 v0Var) {
        this.f428506a = v0Var;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        r45.cz1 cz1Var;
        r45.yy1 yy1Var;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        if (fVar.f152148a == 0 && fVar.f152149b == 0) {
            r45.ht1 ht1Var = (r45.ht1) fVar.f152151d;
            on2.v0 v0Var = this.f428506a;
            v0Var.R = ht1Var;
            if (ht1Var != null && (cz1Var = (r45.cz1) ht1Var.m75936x14adae67(1)) != null && (yy1Var = (r45.yy1) cz1Var.m75936x14adae67(13)) != null) {
                v0Var.c7(yy1Var);
            }
        }
        return jz5.f0.f384359a;
    }
}
