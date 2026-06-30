package com.p314xaae8f345.mm.ui;

/* loaded from: classes.dex */
public final class pj extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f291047d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f291048e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f291049f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pj(java.util.List list, java.util.List list2, java.lang.String str) {
        super(0);
        this.f291047d = list;
        this.f291048e = list2;
        this.f291049f = str;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("appear_type", "4");
        hashMap.put("exist_group_list_num", java.lang.String.valueOf(this.f291047d.size()));
        hashMap.put("select_num", java.lang.String.valueOf(this.f291048e.size()));
        hashMap.put("create_group_sessionid", this.f291049f);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Cj("view_exp", null, hashMap, 35568);
        return jz5.f0.f384359a;
    }
}
