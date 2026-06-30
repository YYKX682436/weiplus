package hb2;

/* loaded from: classes8.dex */
public final class q0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f361617d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(yz5.l lVar) {
        super(1);
        this.f361617d = lVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        r45.l13 l13Var;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        hb2.s0.f361623e.getClass();
        java.lang.String str = hb2.s0.f361624f;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("upload head img errType ");
        java.lang.String str2 = null;
        sb6.append(fVar != null ? java.lang.Integer.valueOf(fVar.f152148a) : null);
        sb6.append(" errCode ");
        sb6.append(fVar != null ? java.lang.Integer.valueOf(fVar.f152149b) : null);
        sb6.append(" errMsg ");
        sb6.append(fVar != null ? fVar.f152150c : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        r45.ri2 ri2Var = new r45.ri2();
        if (fVar != null && (l13Var = (r45.l13) fVar.f152151d) != null) {
            str2 = l13Var.m75945x2fec8307(3);
        }
        ri2Var.set(3, str2);
        this.f361617d.mo146xb9724478(ri2Var);
        return jz5.f0.f384359a;
    }
}
