package com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic;

/* loaded from: classes10.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.q f232652d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j75.d f232653e;

    public f(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.q qVar, j75.d dVar) {
        this.f232652d = qVar;
        this.f232653e = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r45.oc5 oc5Var = ((pm3.b) this.f232653e).f438403b;
        java.lang.String str = oc5Var.f463684f;
        if (str == null) {
            str = "";
        }
        java.lang.String str2 = oc5Var.f463685g;
        java.lang.String str3 = str2 != null ? str2 : "";
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.q qVar = this.f232652d;
        int O6 = com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.q.O6(qVar, oc5Var, str, str3);
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22847x422a813d c22847x422a813d = (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22847x422a813d) ((jz5.n) qVar.f232895e).mo141623x754a37bb();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(O6));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(c22847x422a813d, arrayList.toArray(), "com/tencent/mm/plugin/mv/ui/uic/MusicMvAlbumPreviewRecyclerUIC$onCreate$2$1$3$onChanged$1", "run", "()V", "Undefined", "scrollToPosition", "(I)V");
        c22847x422a813d.mo2420xc593c771(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(c22847x422a813d, "com/tencent/mm/plugin/mv/ui/uic/MusicMvAlbumPreviewRecyclerUIC$onCreate$2$1$3$onChanged$1", "run", "()V", "Undefined", "scrollToPosition", "(I)V");
        qVar.m67288x4905e9fa().post(new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.e(qVar));
    }
}
