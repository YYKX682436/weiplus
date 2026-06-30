package qk2;

/* loaded from: classes3.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public final pk2.o9 f445960a;

    /* renamed from: b, reason: collision with root package name */
    public final int f445961b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.List f445962c;

    /* renamed from: d, reason: collision with root package name */
    public qk2.f f445963d;

    /* renamed from: e, reason: collision with root package name */
    public yz5.p f445964e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f445965f;

    public f(pk2.o9 helper, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(helper, "helper");
        this.f445960a = helper;
        this.f445961b = i17;
        this.f445962c = new java.util.ArrayList();
    }

    public static /* synthetic */ void f(qk2.f fVar, boolean z17, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: disposeRedDot");
        }
        if ((i17 & 1) != 0) {
            z17 = false;
        }
        fVar.e(z17);
    }

    public final void a(qk2.f item) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        g().add(item);
    }

    public final void b() {
        for (qk2.f fVar : g()) {
            fVar.f445963d = this;
            fVar.b();
        }
    }

    public final boolean c() {
        boolean z17;
        if (!o() || p()) {
            return false;
        }
        java.util.List g17 = g();
        if (!(g17 instanceof java.util.Collection) || !g17.isEmpty()) {
            java.util.Iterator it = g17.iterator();
            while (it.hasNext()) {
                if (((qk2.f) it.next()) instanceof qk2.c) {
                    z17 = true;
                    break;
                }
            }
        }
        z17 = false;
        if (!z17 && k()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.a aVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.a) ll2.e.f400666a.g(i()).mo3195x754a37bb();
            if (aVar != null && aVar.f186860a) {
                return true;
            }
        }
        java.util.Iterator it6 = g().iterator();
        while (it6.hasNext()) {
            if (((qk2.f) it6.next()).c()) {
                return true;
            }
        }
        return false;
    }

    public final void d() {
        for (qk2.f fVar : g()) {
            if (ll2.e.f400666a.a(fVar.i())) {
                fVar.e(true);
            }
        }
    }

    public final void e(boolean z17) {
        if (!p() && k()) {
            if (this instanceof pk2.m2) {
                ll2.e.d(ll2.e.f400666a, i(), z17, false, 4, null);
            } else {
                ll2.e.b(ll2.e.f400666a, i(), z17, false, 4, null);
            }
            l();
        }
    }

    public java.util.List g() {
        return this.f445962c;
    }

    public boolean h() {
        return false;
    }

    public abstract java.lang.String i();

    public final p3325xe03a0797.p3326xc267989b.y0 j() {
        pk2.g8 g8Var;
        int i17 = this.f445961b;
        pk2.o9 o9Var = this.f445960a;
        if (i17 == 1) {
            pk2.j9 j9Var = o9Var.f437617g;
            if (j9Var != null) {
                return j9Var.f437418a;
            }
            return null;
        }
        pk2.d9 d9Var = o9Var.f437615f;
        if (d9Var == null || (g8Var = d9Var.f437191a) == null) {
            return null;
        }
        return ((pk2.k9) g8Var).c();
    }

    public final boolean k() {
        zy2.fa nk6 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk();
        java.lang.String i17 = i();
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        java.util.Iterator it = zy2.fa.O0(nk6, i17, xy2.c.e(context), true, false, 8, null).iterator();
        while (it.hasNext()) {
            java.util.LinkedList<r45.f03> show_infos = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb) it.next()).f65874xb5f7102a.f470022g;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(show_infos, "show_infos");
            for (r45.f03 f03Var : show_infos) {
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(f03Var.f455425i, i()) && f03Var.f455424h == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void l() {
        qk2.f fVar = this.f445963d;
        if (fVar == null || fVar.c()) {
            return;
        }
        android.view.View view = fVar.f445965f;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/moreaction/model/MoreActionItem", "hideParentRedDotsIfNeeded", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/moreaction/model/MoreActionItem", "hideParentRedDotsIfNeeded", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        yz5.p pVar = fVar.f445964e;
        if (pVar != null) {
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            pVar.mo149xb9724478(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.a(false, null, null, xy2.c.e(context)), java.lang.Boolean.FALSE);
        }
        fVar.l();
    }

    public final void m() {
        b();
        q();
    }

    public final boolean n() {
        return this.f445961b == 0;
    }

    public abstract boolean o();

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean p() {
        return (this instanceof qk2.c) && !zl2.r4.f555483a.n2((r45.q12) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) ((mm2.g1) ((pk2.m2) ((qk2.c) this)).f445960a.f437607b.a(mm2.g1.class)).f410601f).mo144003x754a37bb());
    }

    public final void q() {
        if (c()) {
            ll2.e.f400666a.k(this.f445960a.f437611d, i(), new qk2.e(this));
            return;
        }
        android.view.View view = this.f445965f;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/moreaction/model/MoreActionItem", "registerRedDot", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/moreaction/model/MoreActionItem", "registerRedDot", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        yz5.p pVar = this.f445964e;
        if (pVar != null) {
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            pVar.mo149xb9724478(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.a(false, null, null, xy2.c.e(context)), java.lang.Boolean.FALSE);
        }
    }

    public boolean r() {
        return false;
    }
}
