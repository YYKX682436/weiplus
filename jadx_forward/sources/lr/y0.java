package lr;

/* loaded from: classes12.dex */
public class y0 extends lr.s0 {

    /* renamed from: f, reason: collision with root package name */
    public boolean f402146f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p679x5c28046.p684x373aa5.C10450x95592a7d f402147g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.ProgressBar f402148h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.TextView f402149i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(android.view.View itemView, boolean z17, lr.k0 k0Var) {
        super(itemView, k0Var);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemView, "itemView");
        this.f402146f = z17;
        android.view.View findViewById = itemView.findViewById(com.p314xaae8f345.mm.R.id.f564805a50);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        com.p314xaae8f345.mm.p679x5c28046.p684x373aa5.C10450x95592a7d c10450x95592a7d = (com.p314xaae8f345.mm.p679x5c28046.p684x373aa5.C10450x95592a7d) findViewById;
        this.f402147g = c10450x95592a7d;
        this.f402148h = (android.widget.ProgressBar) itemView.findViewById(com.p314xaae8f345.mm.R.id.czj);
        android.view.View findViewById2 = itemView.findViewById(com.p314xaae8f345.mm.R.id.f564806a51);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        android.view.View findViewById3 = itemView.findViewById(com.p314xaae8f345.mm.R.id.krb);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f402149i = (android.widget.TextView) findViewById3;
        c10450x95592a7d.m64937x6f817d4a(0);
    }

    @Override // lr.s0
    public void i(ir.u0 item) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        super.i(item);
        ir.g gVar = (ir.g) this.f402114e;
        if (gVar != null) {
            android.widget.ProgressBar progressBar = this.f402148h;
            com.p314xaae8f345.mm.p679x5c28046.p684x373aa5.C10450x95592a7d c10450x95592a7d = this.f402147g;
            if (progressBar != null) {
                c10450x95592a7d.m43715x36e51bc8(new lr.x0(this));
                c10450x95592a7d.setImageDrawable(null);
            }
            com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb interfaceC4987x84e327cb = gVar.f375369b;
            int B0 = interfaceC4987x84e327cb.B0();
            android.widget.TextView textView = this.f402149i;
            if (B0 == 1) {
                textView.setVisibility(0);
                c10450x95592a7d.setContentDescription(this.f3639x46306858.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.bx6) + interfaceC4987x84e327cb.E1());
            } else {
                textView.setVisibility(8);
                c10450x95592a7d.setContentDescription(interfaceC4987x84e327cb.E1());
            }
            c10450x95592a7d.y();
            com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb m43708x63ed375e = c10450x95592a7d.m43708x63ed375e();
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(m43708x63ed375e != null ? m43708x63ed375e.mo42933xb5885648() : null, interfaceC4987x84e327cb.mo42933xb5885648())) {
                c10450x95592a7d.setImageDrawable(new android.graphics.drawable.ColorDrawable(c10450x95592a7d.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560025d)));
            }
            if (this.f402146f) {
                c10450x95592a7d.m43712xc040f7d2(interfaceC4987x84e327cb);
                c10450x95592a7d.setContentDescription(interfaceC4987x84e327cb.E1());
            } else {
                zq.h hVar = zq.h.f556505a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(interfaceC4987x84e327cb, "null cannot be cast to non-null type com.tencent.mm.storage.emotion.EmojiInfo");
                hVar.d((com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4) interfaceC4987x84e327cb, c10450x95592a7d, new android.graphics.drawable.ColorDrawable(c10450x95592a7d.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560025d)));
            }
        }
    }
}
