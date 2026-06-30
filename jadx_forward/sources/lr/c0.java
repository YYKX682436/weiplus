package lr;

/* loaded from: classes12.dex */
public class c0 extends lr.s0 {

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.ImageView f402034f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.TextView f402035g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(android.view.View itemView, lr.k0 k0Var) {
        super(itemView, k0Var);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemView, "itemView");
        android.view.View findViewById = itemView.findViewById(com.p314xaae8f345.mm.R.id.f564805a50);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f402034f = (android.widget.ImageView) findViewById;
        android.view.View findViewById2 = itemView.findViewById(com.p314xaae8f345.mm.R.id.f564806a51);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f402035g = (android.widget.TextView) findViewById2;
    }

    @Override // lr.s0
    public void i(ir.u0 item) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        super.i(item);
        ir.g gVar = (ir.g) this.f402114e;
        if (gVar != null) {
            android.widget.ImageView imageView = this.f402034f;
            int i17 = gVar.f375370c;
            com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb interfaceC4987x84e327cb = gVar.f375369b;
            if (i17 != 3) {
                zq.h hVar = zq.h.f556505a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(interfaceC4987x84e327cb, "null cannot be cast to non-null type com.tencent.mm.storage.emotion.EmojiInfo");
                hVar.d((com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4) interfaceC4987x84e327cb, imageView, null);
            } else {
                zq.h.f556505a.b(imageView);
                imageView.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f77983xe490a197);
            }
            android.widget.TextView textView = this.f402035g;
            if (i17 == 2) {
                textView.setVisibility(0);
                java.lang.String v17 = ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).Bi().v(interfaceC4987x84e327cb.mo42933xb5885648());
                textView.setText(v17);
                imageView.setContentDescription(v17);
            } else {
                if (interfaceC4987x84e327cb.mo42933xb5885648().equals("08f223fa83f1ca34e143d1e580252c7c")) {
                    imageView.setContentDescription(this.f3639x46306858.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572629bw0));
                } else if (interfaceC4987x84e327cb.mo42933xb5885648().equals("9bd1281af3a31710a45b84d736363691")) {
                    imageView.setContentDescription(this.f3639x46306858.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.bwj));
                } else {
                    imageView.setContentDescription(((g30.h) ((k12.s) i95.n0.c(k12.s.class))).Bi().v(interfaceC4987x84e327cb.mo42933xb5885648()));
                }
                textView.setVisibility(8);
            }
            if (n22.m.j(interfaceC4987x84e327cb)) {
                imageView.setContentDescription(this.f3639x46306858.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.bvu));
            }
        }
    }
}
