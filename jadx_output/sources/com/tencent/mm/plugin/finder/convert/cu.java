package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class cu implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ms2.b f103096a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.eu f103097b;

    public cu(ms2.b bVar, com.tencent.mm.plugin.finder.convert.eu euVar) {
        this.f103096a = bVar;
        this.f103097b = euVar;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        jz5.l lVar = new jz5.l("action_category_id", this.f103096a.f330968d.getString(14));
        jz5.l lVar2 = this.f103097b.f103291f;
        return kz5.c1.k(lVar, new jz5.l("action_category_type", lVar2.f302834e), new jz5.l("bizusername", lVar2.f302833d));
    }
}
