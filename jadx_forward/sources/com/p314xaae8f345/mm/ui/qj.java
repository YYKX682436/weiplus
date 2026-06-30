package com.p314xaae8f345.mm.ui;

/* loaded from: classes.dex */
public final class qj extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f291103d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f291104e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f291105f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qj(int i17, int i18, java.lang.String str) {
        super(0);
        this.f291103d = i17;
        this.f291104e = i18;
        this.f291105f = str;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("exist_group_list_num", java.lang.String.valueOf(this.f291103d));
        hashMap.put("select_num", java.lang.String.valueOf(this.f291104e));
        java.lang.String str = this.f291105f;
        if (str == null) {
            str = "";
        }
        hashMap.put("create_group_sessionid", str);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Cj("the_same_add_new_group", null, hashMap, 35568);
        return jz5.f0.f384359a;
    }
}
