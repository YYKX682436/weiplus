package ap1;

/* loaded from: classes5.dex */
public final class w0 extends com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ap1.x0 f94288d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j75.f f94289e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(ap1.x0 x0Var, j75.f fVar) {
        super(null, 0);
        this.f94288d = x0Var;
        this.f94289e = fVar;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.p2
    public int a() {
        return this.f94288d.f94294d.size();
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.p2
    public java.lang.CharSequence c(int i17) {
        return (java.lang.CharSequence) ((jz5.l) this.f94288d.f94294d.get(i17)).f384366d;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.p2
    public boolean d(int i17) {
        ap1.d dVar = new ap1.d(ap1.e.f94174f, null);
        j75.f fVar = this.f94289e;
        fVar.B3(dVar);
        fVar.B3(new ap1.f2((ap1.p0) ((jz5.l) this.f94288d.f94294d.get(i17)).f384367e, null, 2, null));
        super.d(i17);
        return true;
    }
}
