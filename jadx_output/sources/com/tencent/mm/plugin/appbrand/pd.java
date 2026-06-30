package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public class pd implements java.util.Comparator {
    public pd(com.tencent.mm.plugin.appbrand.qd qdVar) {
    }

    @Override // java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.appbrand.sc scVar = (com.tencent.mm.plugin.appbrand.sc) obj;
        com.tencent.mm.plugin.appbrand.sc scVar2 = (com.tencent.mm.plugin.appbrand.sc) obj2;
        if (scVar == scVar2) {
            return 0;
        }
        return scVar.hashCode() - scVar2.hashCode();
    }
}
