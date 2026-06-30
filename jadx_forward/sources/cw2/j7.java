package cw2;

/* loaded from: classes15.dex */
public final class j7 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd f305321d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j7(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd c15188xd8bd4bd) {
        super(0);
        this.f305321d = c15188xd8bd4bd;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd c15188xd8bd4bd = this.f305321d;
        cw2.z5 z5Var = c15188xd8bd4bd.G1;
        if (z5Var != null) {
            z5Var.d();
        }
        c15188xd8bd4bd.G1 = null;
        android.os.ConditionVariable conditionVariable = c15188xd8bd4bd.H1;
        if (conditionVariable == null) {
            return null;
        }
        conditionVariable.open();
        return jz5.f0.f384359a;
    }
}
