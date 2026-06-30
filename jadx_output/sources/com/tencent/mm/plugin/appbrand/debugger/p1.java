package com.tencent.mm.plugin.appbrand.debugger;

/* loaded from: classes7.dex */
public class p1 implements java.util.Comparator {
    public p1(com.tencent.mm.plugin.appbrand.debugger.n1 n1Var) {
    }

    @Override // java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        r45.l47 l47Var = (r45.l47) obj;
        r45.l47 l47Var2 = (r45.l47) obj2;
        if (l47Var == null || l47Var2 == null) {
            return 0;
        }
        return l47Var.f379129d - l47Var2.f379129d;
    }
}
