package ib2;

/* loaded from: classes2.dex */
public final class o implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ib2.w f371679d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.ev2 f371680e;

    public o(ib2.w wVar, r45.ev2 ev2Var) {
        this.f371679d = wVar;
        this.f371680e = ev2Var;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        ib2.w wVar = this.f371679d;
        o25.y1 y1Var = wVar.E;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(menuItem, "null cannot be cast to non-null type com.tencent.mm.ui.base.MMMenuItem");
        ((com.p314xaae8f345.mm.p2470x93e71c27.p2472xd7a392c5.m) y1Var).aj((db5.h4) menuItem, new ib2.n(wVar, this.f371680e));
    }
}
