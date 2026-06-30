package com.tencent.mm.plugin.finder.extension.reddot;

/* loaded from: classes8.dex */
public final class w9 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.vt2 f105970d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.extension.reddot.x9 f105971e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w9(r45.vt2 vt2Var, com.tencent.mm.plugin.finder.extension.reddot.x9 x9Var) {
        super(0);
        this.f105970d = vt2Var;
        this.f105971e = x9Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.LinkedList list = this.f105970d.getList(0);
        kotlin.jvm.internal.o.f(list, "getRevoke_tab_tips_info(...)");
        java.util.Iterator it = list.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            jz5.f0 f0Var = jz5.f0.f302826a;
            com.tencent.mm.plugin.finder.extension.reddot.x9 x9Var = this.f105971e;
            if (!hasNext) {
                r45.dz2 dz2Var = new r45.dz2();
                dz2Var.set(0, linkedList);
                x9Var.e1(dz2Var, "FinderRevokeTabTips");
                return f0Var;
            }
            r45.wt2 wt2Var = (r45.wt2) it.next();
            com.tencent.mm.plugin.finder.extension.reddot.jb c17 = x9Var.c(wt2Var.getString(0));
            if (c17 != null) {
                x9Var.F(c17.field_ctrInfo, "revokeTabTips");
                linkedList.addAll(wt2Var.getList(1));
                boolean L = x9Var.L(c17);
                com.tencent.mars.xlog.Log.i("Finder.RedDotManagerV1", "[revokeRedDot] ret=" + L + " revokeId=" + wt2Var.getString(0) + " removeRedDot=" + c17);
                if (L) {
                    com.tencent.mm.plugin.finder.report.o3 o3Var = (com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
                    int type = c17.getType();
                    java.lang.String str = c17.field_tipsId;
                    if (str == null) {
                        str = "";
                    }
                    java.lang.String string = wt2Var.getString(0);
                    if (string == null) {
                        string = "";
                    }
                    o3Var.vj(type, str, string, 1);
                    x9Var.Z0().d("[revokeRedDot]", c17);
                } else {
                    com.tencent.mm.plugin.finder.report.o3 o3Var2 = (com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
                    int type2 = c17.getType();
                    java.lang.String str2 = c17.field_tipsId;
                    if (str2 == null) {
                        str2 = "";
                    }
                    java.lang.String string2 = wt2Var.getString(0);
                    if (string2 == null) {
                        string2 = "";
                    }
                    o3Var2.vj(type2, str2, string2, 0);
                }
            } else {
                f0Var = null;
            }
            if (f0Var == null) {
                com.tencent.mars.xlog.Log.w("Finder.RedDotManagerV1", "no found redDot. " + wt2Var.getString(0));
                java.util.concurrent.ConcurrentHashMap c18 = x9Var.c1();
                java.lang.String string3 = wt2Var.getString(0);
                if (string3 == null) {
                    string3 = "";
                }
                c18.put(string3, wt2Var);
                com.tencent.mm.plugin.finder.report.o3 o3Var3 = (com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
                java.lang.String string4 = wt2Var.getString(0);
                if (string4 == null) {
                    string4 = "";
                }
                o3Var3.vj(0, "", string4, 0);
            }
        }
    }
}
