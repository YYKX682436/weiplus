package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui;

/* loaded from: classes3.dex */
public final class g8 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f182399d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.y8 f182400e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g8(java.util.List list, com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.y8 y8Var) {
        super(0);
        this.f182399d = list;
        this.f182400e = y8Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        for (t72.a aVar : this.f182399d) {
            java.lang.String field_name = aVar.f68044x225f1eb0;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_name, "field_name");
            com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.y8 y8Var = this.f182400e;
            if (!y8Var.x(field_name)) {
                y8Var.f183159e.add(aVar);
                java.lang.String str = "[addTag] tag id = " + aVar.f68043xc8a07680 + ", tag name = " + aVar.f68044x225f1eb0;
                int i17 = rl.b.f478676a;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavTopMenu", str, null);
                y8Var.m8149x8b456734(y8Var.mo1894x7e414b06() - 1);
            }
        }
        return jz5.f0.f384359a;
    }
}
