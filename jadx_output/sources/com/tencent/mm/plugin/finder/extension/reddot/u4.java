package com.tencent.mm.plugin.finder.extension.reddot;

/* loaded from: classes8.dex */
public final class u4 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.extension.reddot.l5 f105886d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u4(com.tencent.mm.plugin.finder.extension.reddot.l5 l5Var) {
        super(0);
        this.f105886d = l5Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        r45.at2 at2Var;
        java.util.ArrayList arrayList;
        r45.ng7 ng7Var;
        java.util.LinkedList list;
        r45.at2 at2Var2 = new r45.at2();
        com.tencent.mm.plugin.finder.extension.reddot.l5 l5Var = this.f105886d;
        try {
            java.lang.Object m17 = gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_FINDER_REDDOT_FREQ_CONF_STRING_SYNC, "");
            kotlin.jvm.internal.o.e(m17, "null cannot be cast to non-null type kotlin.String");
            at2Var2.parseFrom(com.tencent.mm.sdk.platformtools.t8.h((java.lang.String) m17));
            byte[] a17 = fp.i0.a(at2Var2);
            if (a17 != null) {
                com.tencent.mm.protobuf.f parseFrom = ((com.tencent.mm.protobuf.f) r45.at2.class.newInstance()).parseFrom(a17);
                if (parseFrom == null) {
                    throw new java.lang.NullPointerException("null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderReddotFreqConfig");
                }
                at2Var = (r45.at2) parseFrom;
            } else {
                at2Var = null;
            }
            l5Var.f105662n = at2Var;
            int i17 = 2;
            if (at2Var != null && (ng7Var = (r45.ng7) at2Var.getCustom(3)) != null && (list = ng7Var.getList(2)) != null) {
                list.clear();
            }
            java.util.Iterator it = at2Var2.getList(0).iterator();
            kotlin.jvm.internal.o.f(it, "iterator(...)");
            while (it.hasNext()) {
                r45.f90 f90Var = (r45.f90) it.next();
                if (f90Var.getInteger(0) <= 0 || f90Var.getInteger(1) <= 0) {
                    com.tencent.mars.xlog.Log.i("Finder.RedDotFreqControlHandler", "initFinderReddotFreqConfig remove invalid item:" + f90Var.getInteger(0) + " - " + f90Var.getInteger(1));
                    it.remove();
                }
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append("initFinderReddotFreqConfig nm=");
            java.util.LinkedList<r45.f90> list2 = at2Var2.getList(0);
            int i18 = 10;
            if (list2 != null) {
                arrayList = new java.util.ArrayList(kz5.d0.q(list2, 10));
                for (r45.f90 f90Var2 : list2) {
                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                    sb7.append(f90Var2.getInteger(0));
                    sb7.append('_');
                    sb7.append(f90Var2.getInteger(1));
                    arrayList.add(sb7.toString());
                }
            } else {
                arrayList = null;
            }
            sb6.append(arrayList);
            sb6.append(",stay_entry_min_duration=");
            sb6.append(at2Var2.getInteger(1));
            sb6.append(",simul_expose_max_count_limit=");
            sb6.append(at2Var2.getInteger(2));
            sb6.append(",x_strategy=");
            r45.ng7 ng7Var2 = (r45.ng7) at2Var2.getCustom(3);
            sb6.append(ng7Var2 != null ? ng7Var2.getList(1) : null);
            sb6.append(",is_reset_client_record=");
            r45.ng7 ng7Var3 = (r45.ng7) at2Var2.getCustom(3);
            sb6.append(ng7Var3 != null ? java.lang.Boolean.valueOf(ng7Var3.getBoolean(4)) : null);
            sb6.append(",history_record_update_time=");
            r45.ng7 ng7Var4 = (r45.ng7) at2Var2.getCustom(3);
            sb6.append(ng7Var4 != null ? java.lang.Integer.valueOf(ng7Var4.getInteger(3)) : null);
            sb6.append(",biz_x_strategy=");
            r45.en enVar = (r45.en) at2Var2.getCustom(6);
            sb6.append(enVar != null ? enVar.getList(0) : null);
            sb6.append(",biz_control_items=");
            java.util.LinkedList<r45.gk> list3 = at2Var2.getList(4);
            kotlin.jvm.internal.o.f(list3, "getBiz_control_items(...)");
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(list3, 10));
            for (r45.gk gkVar : list3) {
                java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
                sb8.append(gkVar.getInteger(i17));
                sb8.append(",n_m=");
                java.util.LinkedList<r45.f90> list4 = gkVar.getList(1);
                kotlin.jvm.internal.o.f(list4, "getControl_items(...)");
                java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(list4, i18));
                for (r45.f90 f90Var3 : list4) {
                    java.lang.StringBuilder sb9 = new java.lang.StringBuilder();
                    sb9.append(f90Var3.getInteger(0));
                    sb9.append('_');
                    sb9.append(f90Var3.getInteger(1));
                    arrayList3.add(sb9.toString());
                }
                sb8.append(arrayList3);
                arrayList2.add(sb8.toString());
                i17 = 2;
                i18 = 10;
            }
            sb6.append(arrayList2);
            sb6.append(",exempt_strategy=");
            r45.sl0 sl0Var = (r45.sl0) at2Var2.getCustom(5);
            sb6.append(sl0Var != null ? sl0Var.getList(2) : null);
            sb6.append(",is_count_with_x=");
            r45.sl0 sl0Var2 = (r45.sl0) at2Var2.getCustom(5);
            sb6.append(sl0Var2 != null ? java.lang.Boolean.valueOf(sl0Var2.getBoolean(1)) : null);
            sb6.append('!');
            com.tencent.mars.xlog.Log.i("Finder.RedDotFreqControlHandler", sb6.toString());
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("Finder.RedDotFreqControlHandler", e17, "", new java.lang.Object[0]);
        }
        return at2Var2;
    }
}
