package f41;

/* loaded from: classes4.dex */
public final class j0 implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p980x69aca1b.p981x2e7b10.C11205xa3c55569 f341021d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f341022e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f341023f;

    public j0(com.p314xaae8f345.mm.p980x69aca1b.p981x2e7b10.C11205xa3c55569 c11205xa3c55569, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var) {
        this.f341021d = c11205xa3c55569;
        this.f341022e = i17;
        this.f341023f = f0Var;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        int i17 = com.p314xaae8f345.mm.p980x69aca1b.p981x2e7b10.C11205xa3c55569.f153776v;
        com.p314xaae8f345.mm.p980x69aca1b.p981x2e7b10.C11205xa3c55569 c11205xa3c55569 = this.f341021d;
        int height = ((android.view.View) ((jz5.n) c11205xa3c55569.f153780h).mo141623x754a37bb()).getHeight();
        if (height <= 0) {
            return true;
        }
        int height2 = this.f341022e - (height - c11205xa3c55569.d().getHeight());
        if (height2 < 0) {
            height2 = 0;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var = this.f341023f;
        if (height2 != f0Var.f391649d) {
            f0Var.f391649d = height2;
            c11205xa3c55569.d().m82585x25bfb969(height2);
            c11205xa3c55569.d().requestLayout();
        }
        return true;
    }
}
