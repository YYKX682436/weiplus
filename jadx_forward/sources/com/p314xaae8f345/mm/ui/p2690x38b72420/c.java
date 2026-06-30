package com.p314xaae8f345.mm.ui.p2690x38b72420;

/* loaded from: classes11.dex */
public class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f288168d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2690x38b72420.e f288169e;

    public c(com.p314xaae8f345.mm.ui.p2690x38b72420.e eVar, java.util.LinkedList linkedList) {
        this.f288169e = eVar;
        this.f288168d = linkedList;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p2621x8fb0427b.e8 q17 = c01.d9.b().q();
        com.p314xaae8f345.mm.ui.p2690x38b72420.e eVar = this.f288169e;
        android.database.Cursor A = ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) q17).A(eVar.f288205v, eVar.f288206w, eVar.f288207x, this.f288168d, eVar.u(), eVar.f288204J);
        if (A != null) {
            try {
                if (A instanceof e95.j) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    e95.h hVar = ((e95.j) A).f331956f[0];
                    int position = hVar.getPosition();
                    while (hVar.moveToNext()) {
                        com.p314xaae8f345.mm.p2621x8fb0427b.g gVar = new com.p314xaae8f345.mm.p2621x8fb0427b.g();
                        gVar.a(hVar);
                        arrayList.add(gVar.e());
                    }
                    hVar.moveToPosition(position);
                    ((ye4.e) ((ze4.f) i95.n0.c(ze4.f.class))).getClass();
                    java.util.List list = ef4.i.f333979a;
                    s75.d.b(ef4.h.f333977d, "FavourUserChecker_StoryStateChecker");
                }
            } finally {
                A.close();
            }
        }
        if (A != null) {
        }
    }
}
