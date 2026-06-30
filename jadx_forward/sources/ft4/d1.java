package ft4;

/* loaded from: classes14.dex */
public final class d1 implements ft4.t1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2372xbe09ad69.ActivityC19139x26e1e89c f348136a;

    public d1(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2372xbe09ad69.ActivityC19139x26e1e89c activityC19139x26e1e89c) {
        this.f348136a = activityC19139x26e1e89c;
    }

    @Override // ft4.t1
    public void a(int i17) {
        int i18 = i17 != 0 ? i17 != 101 ? i17 != 201 ? i17 != 301 ? -1 : 5 : 4 : 6 : 3;
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2372xbe09ad69.ActivityC19139x26e1e89c activityC19139x26e1e89c = this.f348136a;
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(30027, 1, 4, java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(activityC19139x26e1e89c.f261983f), java.lang.Integer.valueOf(activityC19139x26e1e89c.f261984g));
        ft4.u1 u1Var = activityC19139x26e1e89c.f261989o;
        if (u1Var != null) {
            u1Var.B();
        }
        activityC19139x26e1e89c.f261987m = i17;
        android.widget.TextView textView = activityC19139x26e1e89c.f261994t;
        if (textView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("typeText");
            throw null;
        }
        textView.setText(activityC19139x26e1e89c.mo55332x76847179().getString(dt4.p.f324799f.c(activityC19139x26e1e89c.f261987m)));
        activityC19139x26e1e89c.U6();
    }
}
