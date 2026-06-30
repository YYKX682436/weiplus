package com.tencent.mm.plugin.finder.assist;

/* loaded from: classes3.dex */
public abstract class o7 {
    public static final boolean a(r45.ov2 ov2Var) {
        kotlin.jvm.internal.o.g(ov2Var, "<this>");
        if (ov2Var.getInteger(3) == 1 || ov2Var.getInteger(3) == 4) {
            return true;
        }
        if (ov2Var.getInteger(3) == 5) {
            r45.l1 l1Var = (r45.l1) ov2Var.getCustom(19);
            if (l1Var != null && com.tencent.mm.plugin.finder.assist.a.a(l1Var)) {
                return true;
            }
        }
        return false;
    }
}
