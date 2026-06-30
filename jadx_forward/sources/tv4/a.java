package tv4;

/* loaded from: classes12.dex */
public final class a implements al5.c2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ tv4.b f503891a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ sv4.q f503892b;

    public a(tv4.b bVar, sv4.q qVar) {
        this.f503891a = bVar;
        this.f503892b = qVar;
    }

    @Override // al5.c2
    /* renamed from: onStatusChange */
    public final void mo2289xd6191dc1(boolean z17) {
        tv4.b bVar = this.f503891a;
        rv4.a0 a0Var = bVar.f503895d;
        a0Var.f481960a.f413208b.c(a0Var.a(ov4.f.f430764f));
        rv4.a0 a0Var2 = bVar.f503895d;
        a0Var2.e(z17);
        bVar.b((com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8) ((jz5.n) this.f503892b.f494943f).mo141623x754a37bb(), a0Var2.f481962c);
        sv4.i iVar = (sv4.i) bVar.f503894c;
        sv4.d dVar = (sv4.d) iVar.f494933a.get();
        iVar.f494934b = dVar != null ? ((qv4.r0) dVar).h() : null;
        jv4.i iVar2 = iVar.f494935c;
        if (iVar2 != null) {
            ((jv4.p) iVar2).y(false);
        }
        jv4.i iVar3 = iVar.f494935c;
        if (iVar3 != null) {
            ((jv4.p) iVar3).y(false);
        }
    }
}
