package vd1;

/* loaded from: classes7.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f517133a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f517134b;

    /* renamed from: c, reason: collision with root package name */
    public int f517135c;

    /* renamed from: d, reason: collision with root package name */
    public int f517136d;

    /* renamed from: e, reason: collision with root package name */
    public int f517137e;

    /* renamed from: f, reason: collision with root package name */
    public int f517138f;

    /* renamed from: g, reason: collision with root package name */
    public int f517139g;

    /* renamed from: h, reason: collision with root package name */
    public vd1.l f517140h;

    /* renamed from: i, reason: collision with root package name */
    public long f517141i;

    /* renamed from: j, reason: collision with root package name */
    public int f517142j;

    /* renamed from: k, reason: collision with root package name */
    public vd1.m f517143k;

    public final void a() {
        java.lang.String str;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.lang.String str2 = this.f517133a;
        if (str2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("instanceId");
            throw null;
        }
        linkedList.add(str2);
        java.lang.String str3 = this.f517134b;
        if (str3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("appId");
            throw null;
        }
        linkedList.add(str3);
        linkedList.add(java.lang.String.valueOf(this.f517135c));
        linkedList.add(java.lang.String.valueOf(this.f517136d));
        linkedList.add(java.lang.String.valueOf(this.f517137e));
        linkedList.add(java.lang.String.valueOf(this.f517138f));
        linkedList.add(java.lang.String.valueOf(this.f517139g));
        vd1.l lVar = this.f517140h;
        if (lVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o(com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26667x4be17176.f56088xe92e69a4);
            throw null;
        }
        int ordinal = lVar.ordinal();
        if (ordinal == 0) {
            str = "2";
        } else if (ordinal == 1) {
            str = "3";
        } else {
            if (ordinal != 2) {
                throw new jz5.j();
            }
            str = "1";
        }
        linkedList.add(str);
        linkedList.add(java.lang.String.valueOf(this.f517141i));
        linkedList.add(java.lang.String.valueOf(this.f517142j));
        vd1.m mVar = this.f517143k;
        if (mVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("action");
            throw null;
        }
        linkedList.add(java.lang.String.valueOf(mVar.f517132d));
        java.lang.String h17 = u46.l.h(linkedList, ",");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9.c cVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9.c) nd.f.d(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9.c.class, true);
        if (cVar != null) {
            ((ch1.d) cVar).b(26761, h17);
        }
    }

    public final void b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 t37;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11808xe47dc718 u07 = (yVar == null || (t37 = yVar.t3()) == null) ? null : t37.u0();
        com.p314xaae8f345.p425x1ea3c036.sdk.p434xaf3f8342.C3897xbc286aa1 c3897xbc286aa1 = u07 instanceof com.p314xaae8f345.p425x1ea3c036.sdk.p434xaf3f8342.C3897xbc286aa1 ? (com.p314xaae8f345.p425x1ea3c036.sdk.p434xaf3f8342.C3897xbc286aa1) u07 : null;
        java.lang.String str = c3897xbc286aa1 != null ? c3897xbc286aa1.f128810w : null;
        if (str == null) {
            str = "";
        }
        this.f517133a = str;
        java.lang.String mo48798x74292566 = yVar != null ? yVar.mo48798x74292566() : null;
        this.f517134b = mo48798x74292566 != null ? mo48798x74292566 : "";
        this.f517135c = c3897xbc286aa1 != null ? c3897xbc286aa1.L : 0;
        this.f517136d = (c3897xbc286aa1 != null ? c3897xbc286aa1.f158814g : -1) + 1;
        this.f517137e = (c3897xbc286aa1 != null ? c3897xbc286aa1.f128817z : -1000) + 1000;
    }
}
