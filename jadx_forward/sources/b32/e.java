package b32;

/* loaded from: classes10.dex */
public final class e implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1381xb20c216d.C13397xbda8fd8e f99166d;

    public e(com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1381xb20c216d.C13397xbda8fd8e c13397xbda8fd8e) {
        this.f99166d = c13397xbda8fd8e;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/emojicapture/ui/editor/CaptureEditorContainer$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1381xb20c216d.C13397xbda8fd8e c13397xbda8fd8e = this.f99166d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.api.C13384x547d8141 c13384x547d8141 = c13397xbda8fd8e.f180228f;
        if (c13384x547d8141 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("reporter");
            throw null;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.api.C13384x547d8141 c13384x547d81412 = c13397xbda8fd8e.f180228f;
        if (c13384x547d81412 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("reporter");
            throw null;
        }
        c13384x547d8141.f180124o = currentTimeMillis - c13384x547d81412.f180119g;
        if (c13384x547d81412 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("reporter");
            throw null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(15982, 17, java.lang.Long.valueOf(c13384x547d81412.f180116d), 0, 0, java.lang.Long.valueOf(c13384x547d81412.f180124o), 0, 0, 0, 0, java.lang.Integer.valueOf(c13384x547d81412.G), c13384x547d81412.A, java.lang.Integer.valueOf(c13384x547d81412.B), 0, java.lang.Integer.valueOf(c13384x547d81412.C), c13384x547d81412.D, java.lang.Integer.valueOf(c13384x547d81412.E), java.lang.Integer.valueOf(c13384x547d81412.F));
        com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.api.C13384x547d8141.c(3, 1);
        r22.c presenter = c13397xbda8fd8e.getPresenter();
        if (presenter != null) {
            w22.v vVar = (w22.v) presenter;
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(vVar.f524116d)) {
                s25.b Bi = ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).Bi();
                com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_EMOJI_CAPTURE_IMITATE_SAVED_BOOLEAN;
                if (!((java.lang.Boolean) Bi.l(u3Var, java.lang.Boolean.FALSE)).booleanValue()) {
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.i0 i0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.i0(vVar.f524113a);
                    i0Var.d(com.p314xaae8f345.mm.R.C30867xcad56011.bpr);
                    i0Var.f(com.p314xaae8f345.mm.R.C30867xcad56011.bpq);
                    i0Var.f293354b.H = new w22.m(vVar);
                    i0Var.h();
                    ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).Bi().u(u3Var, java.lang.Boolean.TRUE);
                }
            }
            vVar.e();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/emojicapture/ui/editor/CaptureEditorContainer$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
