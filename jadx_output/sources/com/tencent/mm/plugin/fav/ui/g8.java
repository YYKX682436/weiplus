package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes3.dex */
public final class g8 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f100866d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.y8 f100867e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g8(java.util.List list, com.tencent.mm.plugin.fav.ui.y8 y8Var) {
        super(0);
        this.f100866d = list;
        this.f100867e = y8Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        for (t72.a aVar : this.f100866d) {
            java.lang.String field_name = aVar.field_name;
            kotlin.jvm.internal.o.f(field_name, "field_name");
            com.tencent.mm.plugin.fav.ui.y8 y8Var = this.f100867e;
            if (!y8Var.x(field_name)) {
                y8Var.f101626e.add(aVar);
                java.lang.String str = "[addTag] tag id = " + aVar.field_id + ", tag name = " + aVar.field_name;
                int i17 = rl.b.f397143a;
                com.tencent.mars.xlog.Log.i("MicroMsg.FavTopMenu", str, null);
                y8Var.notifyItemInserted(y8Var.getItemCount() - 1);
            }
        }
        return jz5.f0.f302826a;
    }
}
