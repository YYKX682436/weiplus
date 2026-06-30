package cd0;

/* loaded from: classes5.dex */
public final class z implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yb5.d f40609d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f40610e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f40611f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.u3 f40612g;

    public z(yb5.d dVar, com.tencent.mm.storage.f9 f9Var, java.lang.String str, com.tencent.mm.ui.widget.dialog.u3 u3Var) {
        this.f40609d = dVar;
        this.f40610e = f9Var;
        this.f40611f = str;
        this.f40612g = u3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((com.tencent.mm.ui.chatting.component.ah) ((sb5.e1) this.f40609d.f460708c.a(sb5.e1.class))).m0(this.f40610e, this.f40611f);
        cd0.c0.b(1, this.f40610e, 1);
        this.f40612g.dismiss();
        ((ku5.t0) ku5.t0.f312615d).B(new cd0.y(this.f40609d));
    }
}
