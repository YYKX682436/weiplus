package jn2;

/* loaded from: classes10.dex */
public final class z0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jn2.b1 f382296d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ jn2.w0 f382297e;

    public z0(jn2.b1 b1Var, jn2.w0 w0Var) {
        this.f382296d = b1Var;
        this.f382297e = w0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongListAdapter$SongViewHolder$bind$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        jn2.b1 b1Var = this.f382296d;
        b1Var.getClass();
        hn2.i iVar = hn2.i.f364064a;
        jn2.w0 w0Var = this.f382297e;
        hn2.d a17 = iVar.a(w0Var.f382273a, w0Var.f382274b);
        r45.zr5 b17 = a17.b();
        r45.ay1 ay1Var = w0Var.f382273a;
        if (b17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveAnchorSingSongListAdapter", "no audition resource for song: " + ay1Var.f451884e);
        } else {
            jn2.c1 c1Var = b1Var.f382096i;
            int ordinal = c1Var.f382104h.ordinal();
            if (ordinal == 0) {
                str = "Audition song from board";
            } else {
                if (ordinal != 1) {
                    throw new jz5.j();
                }
                str = "Audition song from search";
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveAnchorSingSongListAdapter", str + ": " + ay1Var.f451884e);
            sf2.x xVar = c1Var.f382101e;
            if (xVar != null) {
                nm2.a aVar = (nm2.a) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) ((mm2.j5) xVar.m56788xbba4bfc0(mm2.j5.class)).f410715g).mo144003x754a37bb();
                jz5.g gVar = xVar.f488881q;
                if (aVar == null) {
                    ((sf2.o1) ((jz5.n) gVar).mo141623x754a37bb()).k("", false, true);
                } else {
                    java.lang.String str2 = a17.f364038a;
                    boolean c17 = aVar.c(str2 != null ? str2 : "", a17.f364049l);
                    if (aVar instanceof nm2.b ? true : aVar instanceof nm2.c) {
                        if (c17) {
                            java.lang.String songMid = aVar.b();
                            boolean d17 = aVar.d();
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(songMid, "songMid");
                            ((sf2.o1) ((jz5.n) gVar).mo141623x754a37bb()).k(songMid, d17, true);
                        } else {
                            java.lang.String songMid2 = aVar.b();
                            boolean d18 = aVar.d();
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(songMid2, "songMid");
                            ((sf2.o1) ((jz5.n) gVar).mo141623x754a37bb()).k(songMid2, d18, false);
                            ((sf2.o1) ((jz5.n) gVar).mo141623x754a37bb()).j(a17);
                        }
                    } else if (aVar instanceof nm2.d) {
                        ((sf2.o1) ((jz5.n) gVar).mo141623x754a37bb()).j(a17);
                    }
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongListAdapter$SongViewHolder$bind$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
