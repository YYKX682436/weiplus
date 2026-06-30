package com.tencent.mm.plugin.finder.extension.reddot;

/* loaded from: classes8.dex */
public final class pb extends dm.z4 {
    public static final l75.e0 P = dm.z4.initAutoDBInfo(com.tencent.mm.plugin.finder.extension.reddot.pb.class);

    static {
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        z65.c.a();
    }

    public static void v0(com.tencent.mm.plugin.finder.extension.reddot.pb pbVar, l75.n0 storage, boolean z17, int i17, java.lang.Object obj) {
        if ((i17 & 2) != 0) {
            z17 = true;
        }
        pbVar.getClass();
        kotlin.jvm.internal.o.g(storage, "storage");
        com.tencent.mm.plugin.finder.extension.reddot.mb mbVar = new com.tencent.mm.plugin.finder.extension.reddot.mb(storage, pbVar);
        if (z17) {
            pm0.v.O("Finder.RedDotCtrInfo", new com.tencent.mm.plugin.finder.extension.reddot.lb(mbVar));
        } else {
            mbVar.invoke();
        }
    }

    public static boolean y0(com.tencent.mm.plugin.finder.extension.reddot.pb pbVar, java.lang.String source, l75.n0 storage, boolean z17, int i17, java.lang.Object obj) {
        if ((i17 & 4) != 0) {
            z17 = true;
        }
        pbVar.getClass();
        kotlin.jvm.internal.o.g(source, "source");
        kotlin.jvm.internal.o.g(storage, "storage");
        java.lang.String str = pbVar.field_freqControlId;
        if (!(str == null || str.length() == 0)) {
            com.tencent.mm.plugin.finder.extension.reddot.ob obVar = new com.tencent.mm.plugin.finder.extension.reddot.ob(storage, pbVar.u0(), source, pbVar, java.lang.System.currentTimeMillis());
            if (z17) {
                pm0.v.O("Finder.RedDotCtrInfo", new com.tencent.mm.plugin.finder.extension.reddot.nb(obVar));
                return true;
            }
            obVar.invoke();
            return true;
        }
        com.tencent.mars.xlog.Log.e("Finder.RedDotFreqCtrlInfo", pbVar.field_freqControlId + ' ' + pbVar.field_findTabRedDotPath + " is inValid");
        return false;
    }

    @Override // dm.z4, l75.f0
    public l75.e0 getDBInfo() {
        return P;
    }

    public final boolean t0(java.lang.String removePath) {
        r45.pc4 pc4Var;
        java.lang.String str;
        kotlin.jvm.internal.o.g(removePath, "removePath");
        r45.pc4 pc4Var2 = this.field_businessTypeBanModel;
        java.util.LinkedList list = pc4Var2 != null ? pc4Var2.getList(1) : null;
        if ((list == null || list.isEmpty()) || (pc4Var = this.field_businessTypeBanModel) == null) {
            return false;
        }
        if (pc4Var.getInteger(0) < 0 || pc4Var.getInteger(0) >= pc4Var.getList(1).size()) {
            java.util.LinkedList list2 = pc4Var.getList(1);
            kotlin.jvm.internal.o.f(list2, "getBanPathList(...)");
            str = (java.lang.String) kz5.n0.Z(list2);
            if (str == null) {
                str = "";
            }
        } else {
            str = (java.lang.String) pc4Var.getList(1).get(pc4Var.getInteger(0));
        }
        java.util.LinkedList list3 = pc4Var.getList(1);
        if (list3 != null) {
            list3.remove(removePath);
        }
        java.util.LinkedList list4 = pc4Var.getList(1);
        int size = list4 != null ? list4.size() : 0;
        if (size <= 0) {
            pc4Var.set(0, 0);
        } else if (kotlin.jvm.internal.o.b(str, removePath)) {
            pc4Var.set(0, java.lang.Integer.valueOf(pc4Var.getInteger(0) % size));
        } else {
            java.util.LinkedList list5 = pc4Var.getList(1);
            kotlin.jvm.internal.o.f(list5, "getBanPathList(...)");
            java.util.Iterator it = list5.iterator();
            int i17 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i17 = -1;
                    break;
                }
                if (kotlin.jvm.internal.o.b((java.lang.String) it.next(), str)) {
                    break;
                }
                i17++;
            }
            if (i17 < 0) {
                i17 = 0;
            }
            pc4Var.set(0, java.lang.Integer.valueOf(i17));
        }
        return true;
    }

    public java.lang.String toString() {
        if (this.field_isBusinessTypeBanModel) {
            return "[" + this.field_freqControlId + ',' + this.field_businessTypeBanModel.getList(1) + ",index=" + this.field_businessTypeBanModel.getInteger(0) + ']';
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[");
        sb6.append(this.field_freqControlId);
        sb6.append(',');
        sb6.append(this.field_findTabRedDotPath);
        sb6.append(":(");
        r45.vb4 vb4Var = this.field_exposeCnt;
        sb6.append(vb4Var != null ? java.lang.Integer.valueOf(vb4Var.getInteger(0)) : null);
        sb6.append(',');
        r45.vb4 vb4Var2 = this.field_banCnt;
        sb6.append(vb4Var2 != null ? java.lang.Integer.valueOf(vb4Var2.getInteger(0)) : null);
        sb6.append("),");
        sb6.append(this.field_businessType);
        sb6.append(",exposeCnt=");
        r45.vb4 vb4Var3 = this.field_exposeCnt;
        sb6.append(vb4Var3 != null ? java.lang.Integer.valueOf(vb4Var3.getInteger(0)) : null);
        sb6.append(" remain_expose=");
        sb6.append(this.field_exposeCnt.getInteger(3));
        sb6.append(",banCnt=");
        r45.vb4 vb4Var4 = this.field_banCnt;
        sb6.append(vb4Var4 != null ? java.lang.Integer.valueOf(vb4Var4.getInteger(0)) : null);
        sb6.append("(acc:");
        r45.vb4 vb4Var5 = this.field_banCnt;
        sb6.append(vb4Var5 != null ? java.lang.Integer.valueOf(vb4Var5.getInteger(1)) : null);
        sb6.append(") remain_ban=");
        r45.vb4 vb4Var6 = this.field_banCnt;
        sb6.append(vb4Var6 != null ? java.lang.Integer.valueOf(vb4Var6.getInteger(3)) : null);
        sb6.append(",accExpST=");
        sb6.append(this.field_accRedDotExpStartTime);
        sb6.append(",exposeCntLimit=");
        sb6.append(this.field_exposeCntLimit);
        sb6.append(',');
        sb6.append(this.field_exposeCntStrategy);
        sb6.append(']');
        return sb6.toString();
    }

    public final com.tencent.mm.plugin.finder.extension.reddot.pb u0() {
        java.lang.Object m521constructorimpl;
        com.tencent.mm.plugin.finder.extension.reddot.pb pbVar = new com.tencent.mm.plugin.finder.extension.reddot.pb();
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(convertTo());
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        if (kotlin.Result.m527isFailureimpl(m521constructorimpl)) {
            m521constructorimpl = null;
        }
        android.content.ContentValues contentValues = (android.content.ContentValues) m521constructorimpl;
        if (contentValues == null) {
            contentValues = convertTo();
        }
        pbVar.convertFrom(contentValues, true);
        java.lang.String str = pbVar.field_freqControlId;
        if (!(!(str == null || str.length() == 0))) {
            com.tencent.mars.xlog.Log.e("Finder.RedDotFreqCtrlInfo", "[cloneInstance] error! " + this.field_freqControlId + ' ' + this.field_findTabRedDotPath);
            pm0.z.b(xy2.b.f458155b, "FreqCtrInfoCloneFail", false, null, null, false, false, new com.tencent.mm.plugin.finder.extension.reddot.kb(this), 60, null);
        }
        return pbVar;
    }

    public final boolean w0(r45.at2 freqConfig) {
        kotlin.jvm.internal.o.g(freqConfig, "freqConfig");
        jz5.o b17 = com.tencent.mm.plugin.finder.extension.reddot.qa.b(freqConfig, this);
        return b17 != null && ((java.lang.Number) b17.f302842e).intValue() < ((r45.f90) b17.f302843f).getInteger(1);
    }
}
