package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public class be implements java.util.Comparator {
    public be(com.tencent.mm.plugin.appbrand.ge geVar) {
    }

    @Override // java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.appbrand.he heVar = (com.tencent.mm.plugin.appbrand.he) obj;
        com.tencent.mm.plugin.appbrand.he heVar2 = (com.tencent.mm.plugin.appbrand.he) obj2;
        if (heVar == heVar2) {
            return 0;
        }
        return heVar.hashCode() - heVar2.hashCode();
    }
}
