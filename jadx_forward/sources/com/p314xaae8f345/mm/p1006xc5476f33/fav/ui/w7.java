package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui;

/* loaded from: classes3.dex */
public final class w7 implements o75.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.z7 f183048d;

    public w7(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.z7 z7Var) {
        this.f183048d = z7Var;
    }

    @Override // e75.a
    /* renamed from: onChanged */
    public void mo2231x7bb163d5(java.lang.Object obj) {
        o75.c event = (o75.c) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        t72.a aVar = (t72.a) event.f425123d;
        if (aVar != null) {
            o75.b bVar = o75.b.f425117e;
            o75.b bVar2 = event.f425120a;
            boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bVar2, bVar);
            com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.z7 z7Var = this.f183048d;
            if (b17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavTopFilter", "[favTagStorageListener] fav tag remove");
                com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.y8 y8Var = z7Var.f183202o;
                if (y8Var != null) {
                    java.lang.String field_name = aVar.f68044x225f1eb0;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_name, "field_name");
                    p3325xe03a0797.p3326xc267989b.l.d(y8Var.f183160f, null, null, new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.t8(y8Var, field_name, null), 3, null);
                }
            }
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bVar2, o75.b.f425115c)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavTopFilter", "[favTagStorageListener] fav tag insert");
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(aVar);
                com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.y8 y8Var2 = z7Var.f183202o;
                if (y8Var2 != null) {
                    ym5.a1.f(new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.g8(arrayList, y8Var2));
                }
            }
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bVar2, o75.b.f425116d)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavTopFilter", "[favTagStorageListener] fav tag update");
                com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.y8 y8Var3 = z7Var.f183202o;
                if (y8Var3 != null) {
                    ym5.a1.f(new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.x8(y8Var3, aVar));
                }
            }
        }
    }
}
