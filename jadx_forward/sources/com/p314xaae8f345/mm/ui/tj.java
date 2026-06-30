package com.p314xaae8f345.mm.ui;

/* loaded from: classes.dex */
public final class tj extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f291485d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f291486e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f291487f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.hj f291488g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tj(java.lang.String str, java.util.List list, java.util.List list2, com.p314xaae8f345.mm.ui.hj hjVar) {
        super(0);
        this.f291485d = str;
        this.f291486e = list;
        this.f291487f = list2;
        this.f291488g = hjVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("create_group_sessionid", this.f291485d);
        hashMap.put("exist_group_list_num", java.lang.String.valueOf(this.f291486e.size()));
        java.util.List list = this.f291487f;
        hashMap.put("select_num", java.lang.String.valueOf(list.size()));
        hashMap.put("appear_type", "4");
        com.p314xaae8f345.mm.ui.hj hjVar = this.f291488g;
        hashMap.put("group_index", java.lang.String.valueOf(hjVar.f290420e));
        hashMap.put("group_member_num", java.lang.String.valueOf(list.size()));
        hashMap.put("chat_username", hjVar.f290419d);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Cj("view_clk", null, hashMap, 35568);
        return jz5.f0.f384359a;
    }
}
