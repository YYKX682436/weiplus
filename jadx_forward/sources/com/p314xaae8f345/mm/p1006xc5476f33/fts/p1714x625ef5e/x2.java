package com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e;

/* loaded from: classes12.dex */
public class x2 extends p13.c {

    /* renamed from: n, reason: collision with root package name */
    public final java.util.List f219266n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.StringBuffer f219267o;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f219268p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.e3 f219269q;

    public x2(com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.e3 e3Var, java.util.List list, java.lang.String str) {
        this.f219269q = e3Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f219266n = arrayList;
        arrayList.addAll(list);
        this.f219267o = new java.lang.StringBuffer();
        this.f219268p = str;
    }

    @Override // p13.c
    /* renamed from: getName */
    public java.lang.String mo9544xfb82e301() {
        return "InsertServiceNotifyMsgTask";
    }

    @Override // p13.c
    public boolean i() {
        com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.e3 e3Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = ((java.util.ArrayList) this.f219266n).iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            e3Var = this.f219269q;
            if (!hasNext) {
                break;
            }
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = (com.p314xaae8f345.mm.p2621x8fb0427b.f9) it.next();
            com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.y2 y2Var = new com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.y2(e3Var, null);
            y2Var.f219277a = f9Var.m124847x74d37ac6();
            y2Var.f219279c = f9Var.mo78012x3fdd41df();
            y2Var.f219280d = f9Var.j();
            java.lang.String str = this.f219268p;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                y2Var.f219278b = f9Var.Q0();
            } else {
                y2Var.f219278b = str;
            }
            y2Var.a();
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(y2Var.f219282f)) {
                arrayList.add(y2Var);
            }
        }
        java.lang.StringBuffer stringBuffer = this.f219267o;
        stringBuffer.append("{MsgId: ");
        java.util.Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.y2 y2Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.y2) it6.next();
            stringBuffer.append(y2Var2.f219277a);
            stringBuffer.append(",");
            stringBuffer.append(y2Var2.f219278b);
            stringBuffer.append(",");
            stringBuffer.append(y2Var2.f219279c);
            stringBuffer.append(" ");
        }
        stringBuffer.append("count: ");
        stringBuffer.append(arrayList.size());
        stringBuffer.append("}");
        if (arrayList.size() > 0) {
            e3Var.f219050h.h();
            java.util.Iterator it7 = arrayList.iterator();
            while (it7.hasNext()) {
                com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.y2 y2Var3 = (com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.y2) it7.next();
                e3Var.f219050h.N(524288, y2Var3.f219281e, y2Var3.f219277a, y2Var3.f219278b, y2Var3.f219279c, y2Var3.f219282f, y2Var3.f219283g);
            }
            e3Var.f219050h.j();
        }
        return true;
    }

    @Override // p13.c
    public java.lang.String j() {
        return this.f219267o.toString();
    }
}
