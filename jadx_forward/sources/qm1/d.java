package qm1;

/* loaded from: classes10.dex */
public final class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.C24951x8c692f44 f446219d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f446220e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ qm1.f f446221f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f446222g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19781xd1c47b87 f446223h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yz5.l f446224i;

    public d(com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.C24951x8c692f44 c24951x8c692f44, p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, qm1.f fVar, boolean z17, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19781xd1c47b87 c19781xd1c47b87, yz5.l lVar) {
        this.f446219d = c24951x8c692f44;
        this.f446220e = c0Var;
        this.f446221f = fVar;
        this.f446222g = z17;
        this.f446223h = c19781xd1c47b87;
        this.f446224i = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.widget.TextView m53847x623e5088;
        android.view.inputmethod.InputMethodManager inputMethodManager;
        com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.C24951x8c692f44 c24951x8c692f44 = this.f446219d;
        java.lang.Boolean m92427xfb854373 = c24951x8c692f44.m92427xfb854373();
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(m92427xfb854373, bool);
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = this.f446220e;
        qm1.f fVar = this.f446221f;
        if (b17 && c0Var.f391645d && !fVar.f446234i) {
            qm1.f.a(fVar, c24951x8c692f44);
        } else if (this.f446222g) {
            qm1.f.a(fVar, c24951x8c692f44);
        }
        boolean z17 = fVar.f446234i;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19781xd1c47b87 c19781xd1c47b87 = this.f446223h;
        if (z17) {
            qm1.f.c(fVar, c19781xd1c47b87, c0Var.f391645d);
        }
        fVar.h(c24951x8c692f44);
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c24951x8c692f44.m92427xfb854373(), bool)) {
            qm1.f.c(fVar, c19781xd1c47b87, c0Var.f391645d);
            boolean z18 = c0Var.f391645d;
            fVar.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizCommentController", "showCommentInputView needInitCommentFooter: " + z18 + " showInputBar: " + fVar.f446234i);
            com.p314xaae8f345.mm.p1006xc5476f33.p1239x58d9bd6.p1244x38a5ee5f.p1245x373aa5.C12827x691a1aa7 c12827x691a1aa7 = fVar.f446229d;
            if (c12827x691a1aa7 != null && z18 && !fVar.f446235j && (inputMethodManager = (android.view.inputmethod.InputMethodManager) c12827x691a1aa7.getContext().getSystemService("input_method")) != null) {
                inputMethodManager.showSoftInput(c12827x691a1aa7.m53838xdb574fcd(), 0);
            }
        } else {
            qm1.f.b(fVar);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1239x58d9bd6.p1244x38a5ee5f.p1245x373aa5.C12827x691a1aa7 c12827x691a1aa72 = fVar.f446229d;
        if (c12827x691a1aa72 == null || (m53847x623e5088 = c12827x691a1aa72.m53847x623e5088()) == null) {
            return;
        }
        m53847x623e5088.setOnClickListener(new qm1.c(fVar, c19781xd1c47b87, this.f446224i));
    }
}
