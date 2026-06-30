package r;

/* loaded from: classes16.dex */
public final class j implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p980x69aca1b.p981x2e7b10.C11202x49ad0094 f449485d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f449486e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f449487f;

    public j(com.p314xaae8f345.mm.p980x69aca1b.p981x2e7b10.C11202x49ad0094 c11202x49ad0094, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var) {
        this.f449485d = c11202x49ad0094;
        this.f449486e = i17;
        this.f449487f = f0Var;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        int i17 = com.p314xaae8f345.mm.p980x69aca1b.p981x2e7b10.C11202x49ad0094.f153767p;
        com.p314xaae8f345.mm.p980x69aca1b.p981x2e7b10.C11202x49ad0094 c11202x49ad0094 = this.f449485d;
        int height = ((android.view.View) ((jz5.n) c11202x49ad0094.f153772i).mo141623x754a37bb()).getHeight();
        if (height <= 0) {
            return true;
        }
        int height2 = height - c11202x49ad0094.c().getHeight();
        int i18 = this.f449486e - height2;
        if (i18 < 0) {
            i18 = 0;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var = this.f449487f;
        int i19 = f0Var.f391649d;
        if (i18 != i19) {
            if (i19 < 0 || java.lang.Math.abs(i18 - i19) > 2) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OVC.SelectContactCard", "adaptive list max: old=" + f0Var.f391649d + ", new=" + i18 + ", contentH=" + height + ", listH=" + c11202x49ad0094.c().getHeight() + ", othersH=" + height2);
            }
            f0Var.f391649d = i18;
            c11202x49ad0094.c().m82585x25bfb969(i18);
            c11202x49ad0094.c().requestLayout();
        }
        return true;
    }
}
