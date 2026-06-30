package ex0;

/* loaded from: classes5.dex */
public final class e0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ex0.a0 f338662d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(ex0.a0 a0Var) {
        super(1);
        this.f338662d = a0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        ex0.r segmentVM = (ex0.r) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(segmentVM, "segmentVM");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("did select segment not reach here : ");
        sb6.append(segmentVM);
        sb6.append(", state ");
        ax0.e eVar = (ax0.e) this.f338662d.f338647x.mo3195x754a37bb();
        sb6.append(eVar != null ? eVar.name() : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("TimelineViewModelEditingState", sb6.toString());
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        return jz5.f0.f384359a;
    }
}
