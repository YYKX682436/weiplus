package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui;

/* loaded from: classes3.dex */
public final class j7 implements com.p314xaae8f345.mm.ui.xc {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.z7 f182734d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f182735e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f182736f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f182737g;

    public j7(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.z7 z7Var, java.lang.String str, int i17, int i18) {
        this.f182734d = z7Var;
        this.f182735e = str;
        this.f182736f = i17;
        this.f182737g = i18;
    }

    @Override // com.p314xaae8f345.mm.ui.xc
    /* renamed from: mmOnActivityResult */
    public final void mo9729x757c998b(int i17, int i18, android.content.Intent intent) {
        if (i17 == 52428 && i18 == -1) {
            java.lang.String stringExtra = intent.getStringExtra("change_name");
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.z7 z7Var = this.f182734d;
            com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.y8 y8Var = z7Var.f183202o;
            java.lang.String tag = this.f182735e;
            if (y8Var != null) {
                int i19 = this.f182736f;
                int i27 = this.f182737g;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(stringExtra);
                boolean x17 = y8Var.x(stringExtra);
                p3325xe03a0797.p3326xc267989b.y0 y0Var = y8Var.f183160f;
                if (x17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavTopFilter", "remove origin tag = " + tag + ", because rename changeName = " + stringExtra);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(tag);
                    p3325xe03a0797.p3326xc267989b.l.d(y0Var, null, null, new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.t8(y8Var, tag, null), 3, null);
                } else {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(tag);
                    p3325xe03a0797.p3326xc267989b.l.d(y0Var, null, null, new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.i8(tag, stringExtra, y8Var, i27, i19, null), 3, null);
                }
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(tag, "$tag");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(stringExtra);
            com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1416xd1075a44.C13624x28778504 c13624x28778504 = z7Var.f183194g;
            c13624x28778504.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavTopTagPanel", "[notifyFavTagChange] fav tag change listener call, origin name = " + tag + ", new name = " + stringExtra);
            java.util.Iterator it = c13624x28778504.M.iterator();
            while (it.hasNext()) {
                w82.s0 s0Var = (w82.s0) it.next();
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(s0Var.f525458a, tag)) {
                    java.lang.Object obj = c13624x28778504.N.get(s0Var);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type android.view.ViewGroup");
                    android.view.ViewGroup viewGroup = (android.view.ViewGroup) obj;
                    ((android.widget.TextView) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.dvf)).setText(stringExtra);
                    c13624x28778504.w(viewGroup);
                }
            }
        }
    }
}
