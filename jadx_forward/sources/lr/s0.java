package lr;

/* loaded from: classes13.dex */
public class s0 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final lr.k0 f402113d;

    /* renamed from: e, reason: collision with root package name */
    public ir.u0 f402114e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(android.view.View itemView, lr.k0 k0Var) {
        super(itemView);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemView, "itemView");
        this.f402113d = k0Var;
        itemView.setOnClickListener(new lr.q0(this));
        itemView.setOnLongClickListener(new lr.r0(this));
    }

    public void i(ir.u0 item) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        this.f402114e = item;
        if (bm5.o1.f104252a.h(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2528x5c28046.C20143xa1d0785()) == 1) {
            ir.u0 u0Var = this.f402114e;
            if (u0Var instanceof ir.i0) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(u0Var, "null cannot be cast to non-null type com.tencent.mm.emoji.model.panel.GroupTitleItem");
                ((ir.i0) u0Var).f375401d = true;
            }
        }
    }
}
