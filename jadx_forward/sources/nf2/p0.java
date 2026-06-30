package nf2;

/* loaded from: classes10.dex */
public final class p0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nf2.d1 f418322d;

    public p0(nf2.d1 d1Var) {
        this.f418322d = d1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        r45.by1 by1Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/controller/lyrics/FinderLiveLyricsView$setupMenuClickListeners$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        nf2.h0 h0Var = this.f418322d.I;
        if (h0Var != null) {
            nf2.w wVar = ((nf2.c) h0Var).f418192a;
            te2.a9.f499416a.e(((java.lang.Boolean) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) wVar.Z6().f410791z).mo144003x754a37bb()).booleanValue() ^ true ? 3 : 2, null);
            sf2.e1 e1Var = (sf2.e1) wVar.m56789x25fe639c(sf2.e1.class);
            if (e1Var != null) {
                if (((java.lang.Boolean) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) e1Var.g7().f410791z).mo144003x754a37bb()).booleanValue()) {
                    ah2.b f76 = e1Var.f7();
                    if (f76 != null) {
                        ((dh2.x) f76).l();
                    }
                    ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) e1Var.g7().f410790y).k(java.lang.Boolean.FALSE);
                } else {
                    sf2.x xVar = (sf2.x) e1Var.m56789x25fe639c(sf2.x.class);
                    if (xVar != null) {
                        r45.z22 a17 = ((mm2.j6) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) e1Var.g7().f410784s).mo144003x754a37bb()).a();
                        r45.ay1 ay1Var = (a17 == null || (by1Var = a17.f473164h) == null) ? null : by1Var.f452676d;
                        r45.z22 a18 = ((mm2.j6) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) e1Var.g7().f410784s).mo144003x754a37bb()).a();
                        java.lang.String str = a18 != null ? a18.f473165i : null;
                        xVar.m7(3, ay1Var, str == null ? "" : str, e1Var.g7().F);
                    }
                    ah2.b f77 = e1Var.f7();
                    if (f77 != null) {
                        ((dh2.x) f77).j();
                    }
                    ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) e1Var.g7().f410790y).k(java.lang.Boolean.TRUE);
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/controller/lyrics/FinderLiveLyricsView$setupMenuClickListeners$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
