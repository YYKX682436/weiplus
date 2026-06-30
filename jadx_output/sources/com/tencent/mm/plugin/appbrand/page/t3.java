package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public class t3 implements java.util.Comparator {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.i3 f87111d;

    public t3(com.tencent.mm.plugin.appbrand.page.i3 i3Var) {
        this.f87111d = i3Var;
    }

    @Override // java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        oi1.j jVar = (oi1.j) obj;
        oi1.j jVar2 = (oi1.j) obj2;
        com.tencent.mm.plugin.appbrand.page.i3 i3Var = this.f87111d;
        oi1.l w17 = i3Var.getCurrentPage().w(jVar.a());
        oi1.l w18 = i3Var.getCurrentPage().w(jVar2.a());
        if (w17 == null) {
            return 1;
        }
        if (w18 == null) {
            return -1;
        }
        return jVar2.priority().f345602a - jVar.priority().f345602a;
    }
}
