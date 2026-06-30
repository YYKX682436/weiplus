package com.tencent.mm.plugin.finder.extension.reddot;

/* loaded from: classes2.dex */
public final class z9 extends com.tencent.mm.plugin.finder.extension.reddot.a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z9(boolean z17, r45.f03 f03Var, com.tencent.mm.plugin.finder.extension.reddot.jb jbVar, java.lang.String finderUserName) {
        super(z17, f03Var, jbVar, finderUserName);
        kotlin.jvm.internal.o.g(finderUserName, "finderUserName");
    }

    public java.lang.String toString() {
        r45.vs2 vs2Var;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("tipId=");
        com.tencent.mm.plugin.finder.extension.reddot.jb jbVar = this.f105329c;
        sb6.append(jbVar != null ? jbVar.field_tipsId : null);
        sb6.append(" type=");
        sb6.append((jbVar == null || (vs2Var = jbVar.field_ctrInfo) == null) ? null : java.lang.Integer.valueOf(vs2Var.f388487e));
        sb6.append(" isShow=");
        sb6.append(this.f105327a);
        sb6.append(" path=");
        r45.f03 f03Var = this.f105328b;
        sb6.append(f03Var != null ? f03Var.f373892i : null);
        sb6.append(" showType=");
        sb6.append(f03Var != null ? java.lang.Integer.valueOf(f03Var.f373887d) : null);
        sb6.append(" title=");
        sb6.append(f03Var != null ? f03Var.f373889f : null);
        sb6.append(" path:");
        sb6.append(this.f105331e);
        sb6.append(" count:");
        sb6.append(f03Var != null ? java.lang.Integer.valueOf(f03Var.f373888e) : null);
        return sb6.toString();
    }
}
