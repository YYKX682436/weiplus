package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718;

/* loaded from: classes2.dex */
public final class z9 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z9(boolean z17, r45.f03 f03Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb jbVar, java.lang.String finderUserName) {
        super(z17, f03Var, jbVar, finderUserName);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderUserName, "finderUserName");
    }

    /* renamed from: toString */
    public java.lang.String m56007x9616526c() {
        r45.vs2 vs2Var;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("tipId=");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb jbVar = this.f186862c;
        sb6.append(jbVar != null ? jbVar.f65880x11c19d58 : null);
        sb6.append(" type=");
        sb6.append((jbVar == null || (vs2Var = jbVar.f65874xb5f7102a) == null) ? null : java.lang.Integer.valueOf(vs2Var.f470020e));
        sb6.append(" isShow=");
        sb6.append(this.f186860a);
        sb6.append(" path=");
        r45.f03 f03Var = this.f186861b;
        sb6.append(f03Var != null ? f03Var.f455425i : null);
        sb6.append(" showType=");
        sb6.append(f03Var != null ? java.lang.Integer.valueOf(f03Var.f455420d) : null);
        sb6.append(" title=");
        sb6.append(f03Var != null ? f03Var.f455422f : null);
        sb6.append(" path:");
        sb6.append(this.f186864e);
        sb6.append(" count:");
        sb6.append(f03Var != null ? java.lang.Integer.valueOf(f03Var.f455421e) : null);
        return sb6.toString();
    }
}
