package com.p314xaae8f345.mm.p2621x8fb0427b;

/* loaded from: classes8.dex */
public class c3 extends dm.z1 {

    /* renamed from: x, reason: collision with root package name */
    public static final l75.e0 f275343x = dm.z1.m125725x3593deb(com.p314xaae8f345.mm.p2621x8fb0427b.c3.class);

    @Override // dm.z1, l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f275343x;
    }

    /* renamed from: toString */
    public java.lang.String m77961x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("username:");
        sb6.append(this.f69295xdec927b);
        sb6.append(" lastLocalSeq:");
        sb6.append(this.f69291x16eb58cf);
        sb6.append(" lastPushSeq:");
        sb6.append(this.f69293xcef36faa);
        sb6.append(" ");
        if (this.f69294xbf0c1c61 != null) {
            sb6.append("block:");
            java.util.Iterator it = this.f69294xbf0c1c61.f411788d.iterator();
            while (it.hasNext()) {
                mo.c cVar = (mo.c) it.next();
                sb6.append("[");
                sb6.append(cVar.f411784d);
                sb6.append(":");
                sb6.append(cVar.f411785e);
                sb6.append("][");
                sb6.append(cVar.f411786f);
                sb6.append(":");
                sb6.append(cVar.f411787g);
                sb6.append("] | ");
            }
        }
        return sb6.toString();
    }
}
