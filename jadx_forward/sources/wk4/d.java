package wk4;

/* loaded from: classes10.dex */
public final class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.C24951x8c692f44 f528497d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f528498e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ wk4.f f528499f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f528500g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19781xd1c47b87 f528501h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yz5.l f528502i;

    public d(com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.C24951x8c692f44 c24951x8c692f44, p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, wk4.f fVar, boolean z17, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19781xd1c47b87 c19781xd1c47b87, yz5.l lVar) {
        this.f528497d = c24951x8c692f44;
        this.f528498e = c0Var;
        this.f528499f = fVar;
        this.f528500g = z17;
        this.f528501h = c19781xd1c47b87;
        this.f528502i = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.widget.TextView m72075x623e5088;
        android.view.inputmethod.InputMethodManager inputMethodManager;
        com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.C24951x8c692f44 c24951x8c692f44 = this.f528497d;
        java.lang.Boolean m92427xfb854373 = c24951x8c692f44.m92427xfb854373();
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(m92427xfb854373, bool);
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = this.f528498e;
        wk4.f fVar = this.f528499f;
        if (b17 && c0Var.f391645d && !fVar.f528512i) {
            wk4.f.a(fVar, c24951x8c692f44);
        } else if (this.f528500g) {
            wk4.f.a(fVar, c24951x8c692f44);
        }
        boolean z17 = fVar.f528512i;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19781xd1c47b87 c19781xd1c47b87 = this.f528501h;
        if (z17) {
            wk4.f.c(fVar, c19781xd1c47b87, c0Var.f391645d);
        }
        fVar.h(c24951x8c692f44);
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c24951x8c692f44.m92427xfb854373(), bool)) {
            wk4.f.c(fVar, c19781xd1c47b87, c0Var.f391645d);
            boolean z18 = c0Var.f391645d;
            fVar.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingCommentController", "showCommentInputView needInitCommentFooter: " + z18 + " showInputBar: " + fVar.f528512i);
            com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2288x38a5ee5f.p2289x373aa5.C18713x3be2dc6c c18713x3be2dc6c = fVar.f528507d;
            if (c18713x3be2dc6c != null && z18 && !fVar.f528513j && (inputMethodManager = (android.view.inputmethod.InputMethodManager) c18713x3be2dc6c.getContext().getSystemService("input_method")) != null) {
                inputMethodManager.showSoftInput(c18713x3be2dc6c.m72066xdb574fcd(), 0);
            }
        } else {
            wk4.f.b(fVar);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2288x38a5ee5f.p2289x373aa5.C18713x3be2dc6c c18713x3be2dc6c2 = fVar.f528507d;
        if (c18713x3be2dc6c2 == null || (m72075x623e5088 = c18713x3be2dc6c2.m72075x623e5088()) == null) {
            return;
        }
        m72075x623e5088.setOnClickListener(new wk4.c(fVar, c19781xd1c47b87, this.f528502i));
    }
}
