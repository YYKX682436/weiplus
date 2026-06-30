package f12;

/* loaded from: classes4.dex */
public final class t implements p11.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1364x5dd7b252.ui.ActivityC13254xf536ee79 f340204a;

    public t(com.p314xaae8f345.mm.p1006xc5476f33.p1364x5dd7b252.ui.ActivityC13254xf536ee79 activityC13254xf536ee79) {
        this.f340204a = activityC13254xf536ee79;
    }

    @Override // p11.k
    public final void a(java.lang.String str, android.view.View view, android.graphics.Bitmap bitmap, java.lang.Object[] objArr) {
        if (bitmap == null) {
            int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1364x5dd7b252.ui.ActivityC13254xf536ee79.f178970o;
            com.p314xaae8f345.mm.p1006xc5476f33.p1364x5dd7b252.ui.ActivityC13254xf536ee79 activityC13254xf536ee79 = this.f340204a;
            f21.d0 d0Var = (f21.d0) activityC13254xf536ee79.X6().f340161r.mo3195x754a37bb();
            if (d0Var != null) {
                java.lang.String str2 = d0Var.f340401w;
                if (str2 == null || str2.length() == 0) {
                    return;
                }
                java.lang.String str3 = (y12.j.c() + "/egg/") + '/' + d0Var.f340401w;
                if (com.p314xaae8f345.mm.vfs.w6.j(str3)) {
                    f12.c0 c0Var = activityC13254xf536ee79.f178973f;
                    if (c0Var != null) {
                        c0Var.f340121q.post(new f12.s(activityC13254xf536ee79, str3));
                    } else {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewBinding");
                        throw null;
                    }
                }
            }
        }
    }
}
