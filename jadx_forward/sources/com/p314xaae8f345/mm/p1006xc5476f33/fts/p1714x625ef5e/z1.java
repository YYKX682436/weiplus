package com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e;

/* loaded from: classes9.dex */
public class z1 extends p13.c {

    /* renamed from: n, reason: collision with root package name */
    public final java.util.List f219287n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.StringBuffer f219288o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.l2 f219289p;

    public z1(com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.l2 l2Var, java.util.List list) {
        this.f219289p = l2Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f219287n = arrayList;
        arrayList.addAll(list);
        this.f219288o = new java.lang.StringBuffer();
    }

    @Override // p13.c
    /* renamed from: getName */
    public java.lang.String mo9544xfb82e301() {
        return "InsertMessageTask";
    }

    @Override // p13.c
    public boolean i() {
        com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.l2 l2Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = ((java.util.ArrayList) this.f219287n).iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            l2Var = this.f219289p;
            if (!hasNext) {
                break;
            }
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = (com.p314xaae8f345.mm.p2621x8fb0427b.f9) it.next();
            com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.b2 b2Var = new com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.b2(l2Var, null);
            b2Var.f218997a = f9Var.m124847x74d37ac6();
            b2Var.f218998b = f9Var.Q0();
            b2Var.f218999c = f9Var.mo78012x3fdd41df();
            b2Var.f219000d = f9Var.j();
            b2Var.f219001e = f9Var.mo78013xfb85f7b0();
            b2Var.f219003g = f9Var.A0();
            if (com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.l2.b(l2Var, b2Var, null)) {
                b2Var.a();
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(b2Var.f219004h)) {
                    arrayList.add(b2Var);
                }
            }
        }
        java.lang.StringBuffer stringBuffer = this.f219288o;
        stringBuffer.append("{MsgId: ");
        java.util.Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.b2 b2Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.b2) it6.next();
            stringBuffer.append(b2Var2.f218997a);
            stringBuffer.append(",");
            stringBuffer.append(b2Var2.f218998b);
            stringBuffer.append(",");
            stringBuffer.append(b2Var2.f218999c);
            stringBuffer.append(" ");
        }
        stringBuffer.append("count: ");
        stringBuffer.append(arrayList.size());
        stringBuffer.append("}");
        if (arrayList.size() > 0) {
            l2Var.f219142h.h();
            java.util.Iterator it7 = arrayList.iterator();
            while (it7.hasNext()) {
                com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.b2 b2Var3 = (com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.b2) it7.next();
                l2Var.f219142h.N(65536, b2Var3.f219002f, b2Var3.f218997a, b2Var3.f218998b, b2Var3.f218999c, b2Var3.f219004h, b2Var3.f219005i);
            }
            l2Var.f219142h.j();
        }
        return true;
    }

    @Override // p13.c
    public java.lang.String j() {
        return this.f219288o.toString();
    }
}
