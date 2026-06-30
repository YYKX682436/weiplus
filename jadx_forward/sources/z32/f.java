package z32;

/* loaded from: classes12.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z32.b f551438d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k91.v5 f551439e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ z32.s f551440f;

    public f(z32.b bVar, k91.v5 v5Var, z32.s sVar) {
        this.f551438d = bVar;
        this.f551439e = v5Var;
        this.f551440f = sVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        z32.b bVar = this.f551438d;
        android.widget.TextView textView = bVar.f551412d;
        k91.v5 v5Var = this.f551439e;
        if (textView != null) {
            textView.setText(v5Var.f68913x21f9b213);
        }
        o11.f fVar = new o11.f();
        fVar.f423629t = true;
        fVar.f423612c = true;
        o11.g a17 = fVar.a();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = bVar.f551411c;
        if (c22699x3dcdb352 != null) {
            c22699x3dcdb352.m82040x7541828(this.f551440f.m80379x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e));
        }
        n11.a.b().h(v5Var.f68920x68aa7b8d, bVar.f551411c, a17);
    }
}
