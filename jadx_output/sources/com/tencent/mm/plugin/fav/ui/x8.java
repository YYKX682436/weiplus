package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes3.dex */
public final class x8 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.y8 f101601d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t72.a f101602e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x8(com.tencent.mm.plugin.fav.ui.y8 y8Var, t72.a aVar) {
        super(0);
        this.f101601d = y8Var;
        this.f101602e = aVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.fav.ui.y8 y8Var = this.f101601d;
        int size = y8Var.f101626e.size();
        int i17 = 0;
        while (true) {
            if (i17 >= size) {
                break;
            }
            java.util.List list = y8Var.f101626e;
            t72.a aVar = (t72.a) list.get(i17);
            t72.a aVar2 = this.f101602e;
            if (aVar2.field_id == aVar.field_id) {
                list.set(i17, aVar2);
                y8Var.notifyDataSetChanged();
                java.lang.String str = "[updateTag] tag id = " + aVar.field_id + ", tag name = " + aVar.field_name;
                int i18 = rl.b.f397143a;
                com.tencent.mars.xlog.Log.i("MicroMsg.FavTopMenu", str, null);
                break;
            }
            i17++;
        }
        return jz5.f0.f302826a;
    }
}
