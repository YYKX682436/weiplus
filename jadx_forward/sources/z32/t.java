package z32;

/* loaded from: classes4.dex */
public final class t implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f551473d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k91.v5 f551474e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f551475f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ z32.a0 f551476g;

    public t(android.widget.TextView textView, k91.v5 v5Var, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352, z32.a0 a0Var) {
        this.f551473d = textView;
        this.f551474e = v5Var;
        this.f551475f = c22699x3dcdb352;
        this.f551476g = a0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        k91.v5 v5Var = this.f551474e;
        this.f551473d.setText(v5Var.f68913x21f9b213);
        int color = this.f551476g.m80379x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = this.f551475f;
        c22699x3dcdb352.m82040x7541828(color);
        o11.f fVar = new o11.f();
        fVar.f423629t = true;
        fVar.f423612c = true;
        n11.a.b().h(v5Var.f68920x68aa7b8d, c22699x3dcdb352, fVar.a());
    }
}
