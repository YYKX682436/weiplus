package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1108x71e6f5fe;

/* loaded from: classes7.dex */
public final class h extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f164485d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f164486e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 f164487f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f164488g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1108x71e6f5fe.i f164489h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f164490i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(java.util.List list, java.util.List list2, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1108x71e6f5fe.i iVar, java.lang.String str) {
        super(1);
        this.f164485d = list;
        this.f164486e = list2;
        this.f164487f = c0Var;
        this.f164488g = i17;
        this.f164489h = iVar;
        this.f164490i = str;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        java.util.List list2 = this.f164486e;
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list2, 10));
        java.util.Iterator it = list2.iterator();
        int i17 = 0;
        while (true) {
            boolean hasNext = it.hasNext();
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1108x71e6f5fe.i iVar = this.f164489h;
            if (!hasNext) {
                java.util.List list3 = this.f164485d;
                list3.addAll(arrayList);
                java.util.HashMap hashMap = new java.util.HashMap();
                hashMap.put("results", list3);
                iVar.getClass();
                java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                hashMap.put("errno", 0);
                this.f164487f.a(this.f164488g, iVar.t("ok", hashMap));
                return jz5.f0.f384359a;
            }
            java.lang.Object next = it.next();
            int i18 = i17 + 1;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1108x71e6f5fe.C12226xbf714832 c12226xbf714832 = null;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            zs5.c0 c0Var = (zs5.c0) next;
            int a17 = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.j1.a(c0Var.f556864e);
            java.lang.String str2 = this.f164490i;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str2);
            if (list != null) {
                c12226xbf714832 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1108x71e6f5fe.C12226xbf714832) list.get(i17);
            }
            arrayList.add(iVar.C(str2, a17, c0Var, c12226xbf714832));
            i17 = i18;
        }
    }
}
