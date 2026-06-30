package com.google.gson;

/* loaded from: classes16.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final com.google.gson.internal.Excluder f44828a = com.google.gson.internal.Excluder.f44685i;

    /* renamed from: b, reason: collision with root package name */
    public final com.google.gson.u f44829b = com.google.gson.u.f44843d;

    /* renamed from: c, reason: collision with root package name */
    public final com.google.gson.h f44830c = com.google.gson.g.f44672d;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f44831d = new java.util.HashMap();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f44832e = new java.util.ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f44833f = new java.util.ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public boolean f44834g = false;

    /* renamed from: h, reason: collision with root package name */
    public final int f44835h = 2;

    /* renamed from: i, reason: collision with root package name */
    public final int f44836i = 2;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f44837j = true;

    /* renamed from: k, reason: collision with root package name */
    public boolean f44838k = false;

    public com.google.gson.i a() {
        int i17;
        java.util.List list = this.f44832e;
        int size = ((java.util.ArrayList) list).size();
        java.util.List list2 = this.f44833f;
        java.util.ArrayList arrayList = new java.util.ArrayList(size + ((java.util.ArrayList) list2).size() + 3);
        arrayList.addAll(list);
        java.util.Collections.reverse(arrayList);
        java.util.ArrayList arrayList2 = new java.util.ArrayList(list2);
        java.util.Collections.reverse(arrayList2);
        arrayList.addAll(arrayList2);
        int i18 = this.f44835h;
        if (i18 != 2 && (i17 = this.f44836i) != 2) {
            com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter = new com.google.gson.DefaultDateTypeAdapter(java.util.Date.class, i18, i17);
            com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter2 = new com.google.gson.DefaultDateTypeAdapter(java.sql.Timestamp.class, i18, i17);
            com.google.gson.DefaultDateTypeAdapter defaultDateTypeAdapter3 = new com.google.gson.DefaultDateTypeAdapter(java.sql.Date.class, i18, i17);
            arrayList.add(com.google.gson.internal.bind.e.a(java.util.Date.class, defaultDateTypeAdapter));
            arrayList.add(com.google.gson.internal.bind.e.a(java.sql.Timestamp.class, defaultDateTypeAdapter2));
            arrayList.add(com.google.gson.internal.bind.e.a(java.sql.Date.class, defaultDateTypeAdapter3));
        }
        return new com.google.gson.i(this.f44828a, this.f44830c, this.f44831d, this.f44834g, false, false, this.f44837j, this.f44838k, false, false, this.f44829b, null, this.f44835h, this.f44836i, list, list2, arrayList);
    }
}
