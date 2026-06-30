package ap1;

/* loaded from: classes5.dex */
public final class w0 extends com.tencent.mm.ui.widget.dialog.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ap1.x0 f12755d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j75.f f12756e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(ap1.x0 x0Var, j75.f fVar) {
        super(null, 0);
        this.f12755d = x0Var;
        this.f12756e = fVar;
    }

    @Override // com.tencent.mm.ui.widget.dialog.p2
    public int a() {
        return this.f12755d.f12761d.size();
    }

    @Override // com.tencent.mm.ui.widget.dialog.p2
    public java.lang.CharSequence c(int i17) {
        return (java.lang.CharSequence) ((jz5.l) this.f12755d.f12761d.get(i17)).f302833d;
    }

    @Override // com.tencent.mm.ui.widget.dialog.p2
    public boolean d(int i17) {
        ap1.d dVar = new ap1.d(ap1.e.f12641f, null);
        j75.f fVar = this.f12756e;
        fVar.B3(dVar);
        fVar.B3(new ap1.f2((ap1.p0) ((jz5.l) this.f12755d.f12761d.get(i17)).f302834e, null, 2, null));
        super.d(i17);
        return true;
    }
}
