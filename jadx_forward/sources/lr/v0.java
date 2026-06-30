package lr;

/* loaded from: classes12.dex */
public class v0 extends lr.s0 {

    /* renamed from: f, reason: collision with root package name */
    public boolean f402127f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p679x5c28046.p684x373aa5.C10450x95592a7d f402128g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(android.view.View itemView, boolean z17, lr.k0 k0Var) {
        super(itemView, k0Var);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemView, "itemView");
        this.f402127f = z17;
        android.view.View findViewById = itemView.findViewById(com.p314xaae8f345.mm.R.id.f564805a50);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f402128g = (com.p314xaae8f345.mm.p679x5c28046.p684x373aa5.C10450x95592a7d) findViewById;
    }

    @Override // lr.s0
    public void i(ir.u0 item) {
        ir.g gVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        super.i(item);
        android.view.View findViewById = this.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.f563859bf);
        int i17 = this.f402127f ? 0 : 8;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/emoji/panel/adapter/SimilarEmojiHeadViewHolder", "onBind", "(Lcom/tencent/mm/emoji/model/panel/PanelItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/emoji/panel/adapter/SimilarEmojiHeadViewHolder", "onBind", "(Lcom/tencent/mm/emoji/model/panel/PanelItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.p314xaae8f345.mm.p679x5c28046.p684x373aa5.C10450x95592a7d c10450x95592a7d = this.f402128g;
        if (c10450x95592a7d.m43708x63ed375e() != null || (gVar = (ir.g) this.f402114e) == null) {
            return;
        }
        c10450x95592a7d.m43712xc040f7d2(gVar.f375369b);
    }
}
