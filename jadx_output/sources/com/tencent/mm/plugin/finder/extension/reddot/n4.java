package com.tencent.mm.plugin.finder.extension.reddot;

/* loaded from: classes8.dex */
public final class n4 extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.extension.reddot.l5 f105723d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n4(com.tencent.mm.plugin.finder.extension.reddot.l5 l5Var) {
        super(3);
        this.f105723d = l5Var;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        jz5.f0 f0Var;
        java.lang.Object obj4;
        jz5.f0 f0Var2;
        java.lang.String key = (java.lang.String) obj;
        java.lang.String path = (java.lang.String) obj2;
        com.tencent.mm.plugin.finder.extension.reddot.jb jbVar = (com.tencent.mm.plugin.finder.extension.reddot.jb) obj3;
        kotlin.jvm.internal.o.g(key, "key");
        kotlin.jvm.internal.o.g(path, "path");
        java.lang.String redDotDicPath = com.tencent.mm.plugin.finder.extension.reddot.l5.H.c(path, jbVar);
        com.tencent.mm.plugin.finder.extension.reddot.pb pbVar = (com.tencent.mm.plugin.finder.extension.reddot.pb) this.f105723d.x().remove(redDotDicPath);
        com.tencent.mm.plugin.finder.extension.reddot.z5 A = this.f105723d.A();
        A.getClass();
        kotlin.jvm.internal.o.g(redDotDicPath, "redDotDicPath");
        if (!(A.f106051e.length() > 0)) {
            if ((key.length() > 0) && kotlin.jvm.internal.o.b(key, A.f106050d)) {
                A.f106063q = pbVar;
            }
        } else if (kotlin.jvm.internal.o.b(A.f106051e, redDotDicPath)) {
            A.f106063q = pbVar;
        }
        if (pbVar != null) {
            com.tencent.mm.plugin.finder.extension.reddot.pb.v0(pbVar, this.f105723d.f105650b, false, 2, null);
        }
        r45.oc4 oc4Var = (r45.oc4) this.f105723d.y().remove(redDotDicPath);
        this.f105723d.b(redDotDicPath, com.tencent.mm.plugin.finder.extension.reddot.v5.f105922f);
        if (jbVar != null) {
            int i17 = jbVar.field_businessType;
            com.tencent.mm.plugin.finder.extension.reddot.u6 B = this.f105723d.B();
            java.lang.String str = jbVar.field_tips_uuid;
            if (str == null) {
                str = "";
            }
            B.getClass();
            if (B.f105908m) {
                B.a(str, i17);
                java.util.List f17 = B.f();
                kotlin.jvm.internal.o.f(f17, "<get-historyRecords>(...)");
                synchronized (f17) {
                    java.util.Iterator it = f17.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj4 = null;
                            break;
                        }
                        obj4 = it.next();
                        if (((r45.sw3) obj4).getInteger(0) == i17) {
                            break;
                        }
                    }
                }
                r45.sw3 sw3Var = (r45.sw3) obj4;
                if (sw3Var != null) {
                    int e17 = c01.id.e();
                    if (!B.j(B.f105903h * 1000, e17 * 1000)) {
                        B.k(sw3Var);
                    }
                    java.util.LinkedList list = sw3Var.getList(1);
                    kotlin.jvm.internal.o.f(list, "getRecord_items(...)");
                    r45.tw3 tw3Var = (r45.tw3) kz5.n0.Z(list);
                    if (tw3Var != null) {
                        tw3Var.set(2, java.lang.Integer.valueOf(tw3Var.getInteger(2) + 1));
                    }
                    com.tencent.mm.plugin.finder.extension.reddot.x6.f105995a.c(sw3Var, e17);
                    B.l("click", e17, i17, sw3Var);
                    f0Var2 = jz5.f0.f302826a;
                } else {
                    f0Var2 = null;
                }
                if (f0Var2 == null) {
                    com.tencent.mars.xlog.Log.e("FinderRedDotFreqCtrlXStrategy", "[click] but businessType=" + i17 + " record is null!");
                }
            }
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(key);
        sb6.append(" entry click more than ");
        sb6.append(this.f105723d.v().getInteger(1));
        sb6.append("s,path=");
        sb6.append(path);
        sb6.append(",tipUuid=");
        sb6.append(jbVar != null ? jbVar.field_tips_uuid : null);
        sb6.append(",dicPath=");
        sb6.append(redDotDicPath);
        sb6.append(",remove n/m=");
        sb6.append(pbVar);
        sb6.append(",remove penalized=");
        sb6.append(oc4Var);
        sb6.append('!');
        com.tencent.mars.xlog.Log.i("Finder.RedDotFreqControlHandler", sb6.toString());
        com.tencent.mm.plugin.finder.extension.reddot.l5 l5Var = this.f105723d;
        com.tencent.mm.plugin.finder.extension.reddot.l6 l6Var = l5Var.f105671w;
        if (l6Var != null) {
            l6Var.g(l5Var, l5Var.v(), this.f105723d.x(), this.f105723d.y(), this.f105723d.o(), (r21 & 32) != 0 ? null : null, (r21 & 64) != 0 ? null : null, (r21 & 128) != 0 ? null : null);
        }
        com.tencent.mm.plugin.finder.extension.reddot.l5 l5Var2 = this.f105723d;
        l5Var2.getClass();
        if (path.length() > 0) {
            com.tencent.mm.plugin.finder.extension.reddot.pb pbVar2 = (com.tencent.mm.plugin.finder.extension.reddot.pb) l5Var2.o().get(path);
            if (pbVar2 != null) {
                r45.pc4 pc4Var = pbVar2.field_businessTypeBanModel;
                if (pc4Var != null && pc4Var.getList(1).contains(redDotDicPath)) {
                    pbVar2.t0(redDotDicPath);
                    com.tencent.mm.plugin.finder.extension.reddot.pb.y0(pbVar2, "banRemove", l5Var2.f105650b, false, 4, null);
                    com.tencent.mars.xlog.Log.i("Finder.RedDotFreqControlHandler", "removeBusinessTypePenalizedPath " + redDotDicPath + '!');
                } else {
                    com.tencent.mars.xlog.Log.w("Finder.RedDotFreqControlHandler", "removeBusinessTypePenalizedPath but " + redDotDicPath + " not exist!");
                }
                f0Var = jz5.f0.f302826a;
            } else {
                f0Var = null;
            }
            if (f0Var == null) {
                com.tencent.mars.xlog.Log.w("Finder.RedDotFreqControlHandler", "removeBusinessTypePenalizedPath " + redDotDicPath + " but " + path + " 's penalized path is empty!");
            }
        }
        return jz5.f0.f302826a;
    }
}
