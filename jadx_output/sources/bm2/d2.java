package bm2;

/* loaded from: classes3.dex */
public final class d2 implements com.tencent.mm.ui.widget.dialog.p3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.z2 f21840a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ bm2.f2 f21841b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ bm2.b2 f21842c;

    public d2(com.tencent.mm.ui.widget.dialog.z2 z2Var, bm2.f2 f2Var, bm2.b2 b2Var) {
        this.f21840a = z2Var;
        this.f21841b = f2Var;
        this.f21842c = b2Var;
    }

    @Override // com.tencent.mm.ui.widget.dialog.p3
    public final void a() {
        this.f21840a.B();
        yz5.l lVar = this.f21841b.f21883e;
        if (lVar != null) {
            lVar.invoke(this.f21842c);
        }
    }
}
