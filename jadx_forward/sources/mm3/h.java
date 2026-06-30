package mm3;

/* loaded from: classes10.dex */
public final class h implements sm3.u {

    /* renamed from: a, reason: collision with root package name */
    public int f411166a = -1;

    /* renamed from: b, reason: collision with root package name */
    public long f411167b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f411168c;

    /* renamed from: d, reason: collision with root package name */
    public int f411169d;

    /* renamed from: e, reason: collision with root package name */
    public long f411170e;

    /* renamed from: f, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f411171f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.h6 f411172g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ mm3.n f411173h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f411174i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f411175j;

    public h(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.h6 h6Var, mm3.n nVar, p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, android.widget.TextView textView) {
        this.f411172g = h6Var;
        this.f411173h = nVar;
        this.f411174i = c0Var;
        this.f411175j = textView;
    }

    public boolean a(float f17, sm3.v type, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        int ordinal = type.ordinal();
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = this.f411174i;
        mm3.n nVar = this.f411173h;
        if (ordinal == 0) {
            android.view.ViewGroup viewGroup = nVar.f411189g;
            if (viewGroup == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("deleteItemContainer");
                throw null;
            }
            float top = viewGroup.getTop();
            android.widget.TextView textView = this.f411175j;
            if (f17 >= top) {
                c0Var.f391645d = true;
                textView.setText(i65.a.r(nVar.m158354x19263085(), com.p314xaae8f345.mm.R.C30867xcad56011.h5e));
            } else {
                c0Var.f391645d = false;
                textView.setText(i65.a.r(nVar.m158354x19263085(), com.p314xaae8f345.mm.R.C30867xcad56011.h5d));
            }
        } else if (ordinal == 1) {
            android.view.ViewGroup viewGroup2 = nVar.f411189g;
            if (viewGroup2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("deleteItemContainer");
                throw null;
            }
            viewGroup2.setVisibility(8);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("size：");
            com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1923xd1075a44.C16708x2eab1ea0 c16708x2eab1ea0 = nVar.f411186d;
            if (c16708x2eab1ea0 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("tracksEditView");
                throw null;
            }
            sb6.append(c16708x2eab1ea0.mo67409x317d5b7e().size());
            sb6.append("， index: ");
            sb6.append(i17);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mv.MusicMvPreviewTrackUIC", sb6.toString());
            if (c0Var.f391645d) {
                com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1923xd1075a44.C16708x2eab1ea0 c16708x2eab1ea02 = nVar.f411186d;
                if (c16708x2eab1ea02 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("tracksEditView");
                    throw null;
                }
                if (c16708x2eab1ea02.mo67409x317d5b7e().size() != 1) {
                    com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.h6 h6Var = this.f411172g;
                    if (i17 == -1) {
                        h6Var.getClass();
                    } else {
                        java.util.LinkedList linkedList = h6Var.f232718m;
                        linkedList.remove(i17);
                        h6Var.S6(((jk4.f) linkedList.getLast()).f316011o);
                        pk4.c cVar = h6Var.f232719n;
                        if (cVar != null) {
                            java.util.ArrayList arrayList = new java.util.ArrayList();
                            for (java.lang.Object obj : linkedList) {
                                if (((jk4.f) obj).f316011o > 0) {
                                    arrayList.add(obj);
                                }
                            }
                            cVar.mo72016xdb523460(arrayList);
                        }
                        pk4.c cVar2 = h6Var.f232719n;
                        if (cVar2 != null) {
                            ((com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.TextureViewSurfaceTextureListenerC18694xeac4a29) cVar2).f();
                        }
                    }
                    java.util.LinkedList linkedList2 = nVar.f411190h;
                    if (linkedList2 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("trackList");
                        throw null;
                    }
                    linkedList2.remove(i17);
                    if (nVar.f411190h == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("trackList");
                        throw null;
                    }
                    nVar.P6(((r45.jf2) r13.getLast()).m75939xb282bd08(1));
                    nVar.f411192m = true;
                    h6Var.T6(0L);
                    kl3.t.g().a().c(0);
                    com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1923xd1075a44.C16708x2eab1ea0 c16708x2eab1ea03 = nVar.f411186d;
                    if (c16708x2eab1ea03 != null) {
                        c16708x2eab1ea03.c(i17, false);
                        return true;
                    }
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("tracksEditView");
                    throw null;
                }
                db5.t7.f(nVar.m158354x19263085(), i65.a.r(nVar.m158354x19263085(), com.p314xaae8f345.mm.R.C30867xcad56011.h57), mm3.c.f411144a);
            }
        }
        android.view.ViewGroup viewGroup3 = nVar.f411189g;
        if (viewGroup3 != null) {
            viewGroup3.getTop();
            return false;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("deleteItemContainer");
        throw null;
    }

    public final void b(int i17, long j17) {
        this.f411169d = i17;
        this.f411170e = j17;
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f411171f;
        boolean z17 = false;
        if (r2Var != null && r2Var.a()) {
            z17 = true;
        }
        if (z17) {
            return;
        }
        p3325xe03a0797.p3326xc267989b.i2 i2Var = p3325xe03a0797.p3326xc267989b.i2.f392010d;
        p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
        this.f411171f = p3325xe03a0797.p3326xc267989b.l.d(i2Var, p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a, null, new mm3.g(this.f411172g, this, null), 2, null);
    }
}
