package id2;

/* loaded from: classes3.dex */
public final class d implements com.p314xaae8f345.mm.ui.zc {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ id2.l f372054a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ mm2.y6 f372055b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p2837x8fa2df7c.p2838xc43d2152.p2840x373aa5.C23001x9d3a0bdc f372056c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.Button f372057d;

    public d(id2.l lVar, mm2.y6 y6Var, com.p314xaae8f345.p2837x8fa2df7c.p2838xc43d2152.p2840x373aa5.C23001x9d3a0bdc c23001x9d3a0bdc, android.widget.Button button) {
        this.f372054a = lVar;
        this.f372055b = y6Var;
        this.f372056c = c23001x9d3a0bdc;
        this.f372057d = button;
    }

    @Override // com.p314xaae8f345.mm.ui.zc
    public final void a(int i17, android.content.Intent intent) {
        if (i17 == -1) {
            id2.l lVar = this.f372054a;
            lVar.f372185f = false;
            mm2.y6 y6Var = this.f372055b;
            y6Var.g(intent);
            android.widget.Button okBtn = this.f372057d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(okBtn, "$okBtn");
            id2.l.O6(lVar, y6Var, this.f372056c, okBtn);
        }
    }
}
