package com.tencent.mm.plugin.exdevice.model;

/* loaded from: classes13.dex */
public class j0 extends u32.f1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.exdevice.model.o0 f98928d;

    public j0(com.tencent.mm.plugin.exdevice.model.o0 o0Var) {
        this.f98928d = o0Var;
    }

    @Override // u32.g1
    public void o4(long j17, int i17, int i18, java.lang.String str) {
        java.util.LinkedList linkedList;
        com.tencent.mm.plugin.exdevice.model.o0 o0Var = this.f98928d;
        java.lang.String f17 = a42.i.f(j17);
        if (i18 == 0) {
            o0Var.getClass();
            return;
        }
        synchronized (o0Var.f99012a) {
            linkedList = new java.util.LinkedList(o0Var.f99012a);
        }
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.plugin.exdevice.model.m0) it.next()).o1(f17, null, false);
        }
        linkedList.clear();
        java.util.Iterator it6 = ((java.util.HashMap) o0Var.f99013b).values().iterator();
        while (it6.hasNext()) {
            ((com.tencent.mm.plugin.exdevice.model.m0) it6.next()).o1(f17, null, false);
        }
    }
}
