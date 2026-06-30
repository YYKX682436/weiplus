package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes3.dex */
public final class w7 implements o75.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.z7 f101515d;

    public w7(com.tencent.mm.plugin.fav.ui.z7 z7Var) {
        this.f101515d = z7Var;
    }

    @Override // e75.a
    public void onChanged(java.lang.Object obj) {
        o75.c event = (o75.c) obj;
        kotlin.jvm.internal.o.g(event, "event");
        t72.a aVar = (t72.a) event.f343590d;
        if (aVar != null) {
            o75.b bVar = o75.b.f343584e;
            o75.b bVar2 = event.f343587a;
            boolean b17 = kotlin.jvm.internal.o.b(bVar2, bVar);
            com.tencent.mm.plugin.fav.ui.z7 z7Var = this.f101515d;
            if (b17) {
                com.tencent.mars.xlog.Log.i("MicroMsg.FavTopFilter", "[favTagStorageListener] fav tag remove");
                com.tencent.mm.plugin.fav.ui.y8 y8Var = z7Var.f101669o;
                if (y8Var != null) {
                    java.lang.String field_name = aVar.field_name;
                    kotlin.jvm.internal.o.f(field_name, "field_name");
                    kotlinx.coroutines.l.d(y8Var.f101627f, null, null, new com.tencent.mm.plugin.fav.ui.t8(y8Var, field_name, null), 3, null);
                }
            }
            if (kotlin.jvm.internal.o.b(bVar2, o75.b.f343582c)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.FavTopFilter", "[favTagStorageListener] fav tag insert");
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(aVar);
                com.tencent.mm.plugin.fav.ui.y8 y8Var2 = z7Var.f101669o;
                if (y8Var2 != null) {
                    ym5.a1.f(new com.tencent.mm.plugin.fav.ui.g8(arrayList, y8Var2));
                }
            }
            if (kotlin.jvm.internal.o.b(bVar2, o75.b.f343583d)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.FavTopFilter", "[favTagStorageListener] fav tag update");
                com.tencent.mm.plugin.fav.ui.y8 y8Var3 = z7Var.f101669o;
                if (y8Var3 != null) {
                    ym5.a1.f(new com.tencent.mm.plugin.fav.ui.x8(y8Var3, aVar));
                }
            }
        }
    }
}
