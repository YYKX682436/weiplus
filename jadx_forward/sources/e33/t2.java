package e33;

/* loaded from: classes10.dex */
public class t2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f329004d;

    /* renamed from: e, reason: collision with root package name */
    public final e33.u2 f329005e;

    /* renamed from: f, reason: collision with root package name */
    public final e33.s2 f329006f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ e33.v2 f329007g;

    public t2(e33.v2 v2Var, e33.u2 u2Var, java.lang.String str, e33.s2 s2Var) {
        this.f329007g = v2Var;
        this.f329004d = str;
        this.f329005e = u2Var;
        this.f329006f = s2Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/gallery/ui/ImageAdapter$VideoItemClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        e33.s2 s2Var = this.f329006f;
        if (s2Var != null) {
            e33.C28265x625d43c c28265x625d43c = (e33.C28265x625d43c) s2Var;
            c28265x625d43c.getClass();
            int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15656x6f26b561.f220105k2;
            c28265x625d43c.f328917a.W6();
        }
        if (!com.p314xaae8f345.mm.vfs.w6.j(this.f329004d)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ImageAdapter", "File doesn't exists anymore");
            yj0.a.h(this, "com/tencent/mm/plugin/gallery/ui/ImageAdapter$VideoItemClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        } else {
            ((ku5.t0) ku5.t0.f394148d).q(new java.lang.Runnable() { // from class: e33.t2$$a
                @Override // java.lang.Runnable
                public final void run() {
                    final boolean z17;
                    rs0.q a17;
                    final e33.t2 t2Var = e33.t2.this;
                    t2Var.getClass();
                    try {
                        a17 = rs0.r.f480849a.a(t2Var.f329004d);
                    } catch (java.lang.Exception e17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ImageAdapter", "get color space fail", e17);
                    }
                    if (a17 != null) {
                        int i18 = a17.f480847c;
                        if (i18 == 7 || i18 == 6) {
                            z17 = true;
                            t2Var.f329007g.f329047y.post(new java.lang.Runnable() { // from class: e33.t2$$b
                                @Override // java.lang.Runnable
                                public final void run() {
                                    e33.t2 t2Var2 = e33.t2.this;
                                    e33.u2 u2Var = t2Var2.f329005e;
                                    if (z17) {
                                        u2Var.f329021f.h();
                                    } else {
                                        u2Var.f329021f.h();
                                    }
                                    u2Var.f329021f.mo69327xab3268fe(t2Var2.f329004d);
                                }
                            });
                        }
                    }
                    z17 = false;
                    t2Var.f329007g.f329047y.post(new java.lang.Runnable() { // from class: e33.t2$$b
                        @Override // java.lang.Runnable
                        public final void run() {
                            e33.t2 t2Var2 = e33.t2.this;
                            e33.u2 u2Var = t2Var2.f329005e;
                            if (z17) {
                                u2Var.f329021f.h();
                            } else {
                                u2Var.f329021f.h();
                            }
                            u2Var.f329021f.mo69327xab3268fe(t2Var2.f329004d);
                        }
                    });
                }
            });
            yj0.a.h(this, "com/tencent/mm/plugin/gallery/ui/ImageAdapter$VideoItemClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }
}
