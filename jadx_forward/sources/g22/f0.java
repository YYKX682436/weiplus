package g22;

/* loaded from: classes.dex */
public final class f0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v3.ActivityC13364x933d260b f349346d;

    public f0(com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v3.ActivityC13364x933d260b activityC13364x933d260b) {
        this.f349346d = activityC13364x933d260b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((sg0.y3) ((tg0.o1) i95.n0.c(tg0.o1.class))).getClass();
        android.content.Intent a17 = su4.r2.a();
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v3.ActivityC13364x933d260b activityC13364x933d260b = this.f349346d;
        ((sg0.y3) ((tg0.o1) i95.n0.c(tg0.o1.class))).wi(a17, activityC13364x933d260b.f179970g == 17 ? 50 : 24, false, 384);
        a17.putExtra("ftsneedkeyboard", true);
        a17.putExtra("key_load_js_without_delay", true);
        a17.putExtra("ftsInitToSearch", true);
        j45.l.y(activityC13364x933d260b.mo55332x76847179(), a17);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(13054, java.lang.Integer.valueOf(activityC13364x933d260b.f179971h == 0 ? 0 : 1), 0, "");
    }
}
