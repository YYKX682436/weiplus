package com.tencent.mm.plugin.appbrand.jsapi.auth.entity;

/* loaded from: classes7.dex */
public final class b implements com.tencent.mm.plugin.appbrand.jsapi.auth.entity.p {

    /* renamed from: a, reason: collision with root package name */
    public final r45.sv6 f79485a;

    /* renamed from: b, reason: collision with root package name */
    public final r45.jv5 f79486b;

    public b(r45.sv6 userAvatarInfo, r45.jv5 scopeInfo, com.tencent.mm.plugin.appbrand.jsapi.auth.entity.n nVar) {
        kotlin.jvm.internal.o.g(userAvatarInfo, "userAvatarInfo");
        kotlin.jvm.internal.o.g(scopeInfo, "scopeInfo");
        this.f79485a = userAvatarInfo;
        this.f79486b = scopeInfo;
        if (nVar != null) {
            java.util.LinkedList<r45.tv6> avatar_list = userAvatarInfo.f385984d;
            kotlin.jvm.internal.o.f(avatar_list, "avatar_list");
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(avatar_list, 10));
            for (r45.tv6 tv6Var : avatar_list) {
                java.lang.String str = tv6Var.f386823e;
                java.lang.String str2 = tv6Var.f386825g;
                java.lang.String str3 = this.f79486b.f378131d;
                boolean z17 = this.f79485a.f385987g == tv6Var.f386822d;
                java.lang.String avatarurl = tv6Var.f386824f;
                kotlin.jvm.internal.o.f(avatarurl, "avatarurl");
                arrayList.add(new fl1.h1(0, str, str2, str3, z17, avatarurl, tv6Var.f386822d));
            }
            nVar.b(arrayList);
        }
        if (nVar != null) {
            java.lang.String str4 = this.f79485a.f385990m;
            nVar.c(true, true, "", str4 == null ? "" : str4, com.tencent.mm.plugin.appbrand.jsapi.auth.entity.a.f79482a);
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.auth.entity.p
    public void a(fl1.h1 item) {
        kotlin.jvm.internal.o.g(item, "item");
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.auth.entity.p
    public void b(android.view.View view, int i17, int i18, int i19) {
        kotlin.jvm.internal.o.g(view, "view");
    }
}
