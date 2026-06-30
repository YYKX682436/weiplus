package f12;

/* loaded from: classes4.dex */
public final class j implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1364x5dd7b252.ui.ActivityC13254xf536ee79 f340149d;

    public j(com.p314xaae8f345.mm.p1006xc5476f33.p1364x5dd7b252.ui.ActivityC13254xf536ee79 activityC13254xf536ee79) {
        this.f340149d = activityC13254xf536ee79;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public final void mo525x7bb163d5(java.lang.Object obj) {
        f21.d0 d0Var = (f21.d0) obj;
        if (d0Var == null) {
            return;
        }
        java.lang.String str = y12.j.c() + "/egg/";
        boolean z17 = d0Var.f340403y == 0;
        com.p314xaae8f345.mm.p1006xc5476f33.p1364x5dd7b252.ui.ActivityC13254xf536ee79 activityC13254xf536ee79 = this.f340149d;
        activityC13254xf536ee79.getWindow().getDecorView().setSystemUiVisibility(z17 ? 9984 : 1792);
        activityC13254xf536ee79.m78559x68e5fd88(z17 ? com.p314xaae8f345.mm.R.C30859x5a72f63.f77625x1f52c6 : com.p314xaae8f345.mm.R.C30859x5a72f63.f560086an);
        f12.c0 c0Var = activityC13254xf536ee79.f178973f;
        if (c0Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewBinding");
            throw null;
        }
        c0Var.f340113i.setText(d0Var.f340391m);
        f12.c0 c0Var2 = activityC13254xf536ee79.f178973f;
        if (c0Var2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewBinding");
            throw null;
        }
        c0Var2.f340114j.m64938x75cc54fa(str + '/' + d0Var.f340390i);
        f12.c0 c0Var3 = activityC13254xf536ee79.f178973f;
        if (c0Var3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewBinding");
            throw null;
        }
        c0Var3.f340108d.setText(d0Var.f340386e);
        f12.c0 c0Var4 = activityC13254xf536ee79.f178973f;
        if (c0Var4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewBinding");
            throw null;
        }
        c0Var4.f340109e.setText(d0Var.f340388g);
        int V6 = com.p314xaae8f345.mm.p1006xc5476f33.p1364x5dd7b252.ui.ActivityC13254xf536ee79.V6(activityC13254xf536ee79, d0Var.f340387f, com.p314xaae8f345.mm.R.C30859x5a72f63.a6y);
        int V62 = com.p314xaae8f345.mm.p1006xc5476f33.p1364x5dd7b252.ui.ActivityC13254xf536ee79.V6(activityC13254xf536ee79, d0Var.f340389h, com.p314xaae8f345.mm.R.C30859x5a72f63.amt);
        f12.c0 c0Var5 = activityC13254xf536ee79.f178973f;
        if (c0Var5 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewBinding");
            throw null;
        }
        c0Var5.f340108d.setTextColor(com.p314xaae8f345.mm.p1006xc5476f33.p1364x5dd7b252.ui.ActivityC13254xf536ee79.T6(activityC13254xf536ee79, V6, 1.0f));
        f12.c0 c0Var6 = activityC13254xf536ee79.f178973f;
        if (c0Var6 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewBinding");
            throw null;
        }
        c0Var6.f340107c.r(V6, 1.0f);
        android.content.res.ColorStateList T6 = com.p314xaae8f345.mm.p1006xc5476f33.p1364x5dd7b252.ui.ActivityC13254xf536ee79.T6(activityC13254xf536ee79, V62, 0.5f);
        f12.c0 c0Var7 = activityC13254xf536ee79.f178973f;
        if (c0Var7 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewBinding");
            throw null;
        }
        c0Var7.f340109e.setTextColor(T6);
        f12.c0 c0Var8 = activityC13254xf536ee79.f178973f;
        if (c0Var8 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewBinding");
            throw null;
        }
        activityC13254xf536ee79.getClass();
        c0Var8.f340110f.setBackgroundColor(android.graphics.Color.argb((int) (255 * 0.5f), android.graphics.Color.red(V62), android.graphics.Color.green(V62), android.graphics.Color.blue(V62)));
        f12.c0 c0Var9 = activityC13254xf536ee79.f178973f;
        if (c0Var9 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewBinding");
            throw null;
        }
        c0Var9.f340111g.setTextColor(T6);
        if (d0Var.f340393o == null) {
            f12.c0 c0Var10 = activityC13254xf536ee79.f178973f;
            if (c0Var10 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewBinding");
                throw null;
            }
            c0Var10.f340112h.setImageBitmap(null);
        } else {
            p3325xe03a0797.p3326xc267989b.l.d(activityC13254xf536ee79.f178971d, null, null, new f12.o(activityC13254xf536ee79, str, d0Var, null), 3, null);
        }
        java.lang.String str2 = str + '/' + d0Var.f340398t;
        if (com.p314xaae8f345.mm.vfs.w6.j(str2)) {
            f12.c0 c0Var11 = activityC13254xf536ee79.f178973f;
            if (c0Var11 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewBinding");
                throw null;
            }
            c0Var11.f340106b.m64938x75cc54fa(str2);
        } else {
            java.lang.String str3 = d30.a.f307657g;
            if (com.p314xaae8f345.mm.vfs.w6.j(str3)) {
                f12.c0 c0Var12 = activityC13254xf536ee79.f178973f;
                if (c0Var12 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewBinding");
                    throw null;
                }
                c0Var12.f340106b.m64938x75cc54fa(str3);
            } else {
                f12.c0 c0Var13 = activityC13254xf536ee79.f178973f;
                if (c0Var13 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewBinding");
                    throw null;
                }
                c0Var13.f340106b.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.c8e);
            }
        }
        f12.c0 c0Var14 = activityC13254xf536ee79.f178973f;
        if (c0Var14 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewBinding");
            throw null;
        }
        c0Var14.f340119o.setTextColor(com.p314xaae8f345.mm.p1006xc5476f33.p1364x5dd7b252.ui.ActivityC13254xf536ee79.V6(activityC13254xf536ee79, d0Var.f340400v, com.p314xaae8f345.mm.R.C30859x5a72f63.f560086an));
        f12.c0 c0Var15 = activityC13254xf536ee79.f178973f;
        if (c0Var15 != null) {
            c0Var15.f340119o.setBackgroundColor(com.p314xaae8f345.mm.p1006xc5476f33.p1364x5dd7b252.ui.ActivityC13254xf536ee79.V6(activityC13254xf536ee79, d0Var.f340399u, com.p314xaae8f345.mm.R.C30859x5a72f63.f77890x91ab89a5));
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewBinding");
            throw null;
        }
    }
}
