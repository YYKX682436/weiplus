package com.p176xb6135e39.p280x308fcb;

/* loaded from: classes16.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.C2760x7ab541f8 f126361a = com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.C2760x7ab541f8.f126218i;

    /* renamed from: b, reason: collision with root package name */
    public final com.p176xb6135e39.p280x308fcb.u f126362b = com.p176xb6135e39.p280x308fcb.u.f126376d;

    /* renamed from: c, reason: collision with root package name */
    public final com.p176xb6135e39.p280x308fcb.h f126363c = com.p176xb6135e39.p280x308fcb.g.f126205d;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f126364d = new java.util.HashMap();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f126365e = new java.util.ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f126366f = new java.util.ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public boolean f126367g = false;

    /* renamed from: h, reason: collision with root package name */
    public final int f126368h = 2;

    /* renamed from: i, reason: collision with root package name */
    public final int f126369i = 2;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f126370j = true;

    /* renamed from: k, reason: collision with root package name */
    public boolean f126371k = false;

    public com.p176xb6135e39.p280x308fcb.i a() {
        int i17;
        java.util.List list = this.f126365e;
        int size = ((java.util.ArrayList) list).size();
        java.util.List list2 = this.f126366f;
        java.util.ArrayList arrayList = new java.util.ArrayList(size + ((java.util.ArrayList) list2).size() + 3);
        arrayList.addAll(list);
        java.util.Collections.reverse(arrayList);
        java.util.ArrayList arrayList2 = new java.util.ArrayList(list2);
        java.util.Collections.reverse(arrayList2);
        arrayList.addAll(arrayList2);
        int i18 = this.f126368h;
        if (i18 != 2 && (i17 = this.f126369i) != 2) {
            com.p176xb6135e39.p280x308fcb.C2752xda4bd9c6 c2752xda4bd9c6 = new com.p176xb6135e39.p280x308fcb.C2752xda4bd9c6(java.util.Date.class, i18, i17);
            com.p176xb6135e39.p280x308fcb.C2752xda4bd9c6 c2752xda4bd9c62 = new com.p176xb6135e39.p280x308fcb.C2752xda4bd9c6(java.sql.Timestamp.class, i18, i17);
            com.p176xb6135e39.p280x308fcb.C2752xda4bd9c6 c2752xda4bd9c63 = new com.p176xb6135e39.p280x308fcb.C2752xda4bd9c6(java.sql.Date.class, i18, i17);
            arrayList.add(com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.p282x2e243d.e.a(java.util.Date.class, c2752xda4bd9c6));
            arrayList.add(com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.p282x2e243d.e.a(java.sql.Timestamp.class, c2752xda4bd9c62));
            arrayList.add(com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.p282x2e243d.e.a(java.sql.Date.class, c2752xda4bd9c63));
        }
        return new com.p176xb6135e39.p280x308fcb.i(this.f126361a, this.f126363c, this.f126364d, this.f126367g, false, false, this.f126370j, this.f126371k, false, false, this.f126362b, null, this.f126368h, this.f126369i, list, list2, arrayList);
    }
}
