package ft4;

/* loaded from: classes14.dex */
public final class s implements ft4.t1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2372xbe09ad69.ActivityC19137x536ca21f f348225a;

    public s(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2372xbe09ad69.ActivityC19137x536ca21f activityC19137x536ca21f) {
        this.f348225a = activityC19137x536ca21f;
    }

    @Override // ft4.t1
    public void a(int i17) {
        int i18 = i17 != 0 ? i17 != 101 ? i17 != 201 ? i17 != 301 ? -1 : 5 : 4 : 6 : 3;
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2372xbe09ad69.ActivityC19137x536ca21f activityC19137x536ca21f = this.f348225a;
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(30027, 1, 5, java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(activityC19137x536ca21f.f261947e), java.lang.Integer.valueOf(activityC19137x536ca21f.f261948f));
        ft4.u1 u1Var = activityC19137x536ca21f.f261951i;
        if (u1Var != null) {
            u1Var.B();
        }
        activityC19137x536ca21f.f261950h = i17;
        android.widget.TextView textView = activityC19137x536ca21f.f261955p;
        if (textView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("typeText");
            throw null;
        }
        textView.setText(activityC19137x536ca21f.mo55332x76847179().getString(dt4.p.f324799f.c(activityC19137x536ca21f.f261950h)));
        activityC19137x536ca21f.V6();
    }
}
