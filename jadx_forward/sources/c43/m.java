package c43;

/* loaded from: classes8.dex */
public final class m extends c43.x {
    public android.widget.ImageView Z;

    /* renamed from: l1, reason: collision with root package name */
    public android.view.View f119990l1;

    /* renamed from: p0, reason: collision with root package name */
    public android.widget.ImageView f119991p0;

    /* renamed from: x0, reason: collision with root package name */
    public android.widget.ImageView f119992x0;

    /* renamed from: y0, reason: collision with root package name */
    public android.widget.TextView f119993y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(android.view.View itemView, int i17) {
        super(itemView, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemView, "itemView");
    }

    /* JADX WARN: Code restructure failed: missing block: B:141:0x00ac, code lost:
    
        if (r2.getHeight() != r1.f36562x34efed7c) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0043, code lost:
    
        if (r2.getHeight() != r1.f36562x34efed7c) goto L27;
     */
    @Override // c43.x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void k(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15731x94356d67 r21) {
        /*
            Method dump skipped, instructions count: 738
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c43.m.k(com.tencent.mm.plugin.game.autogen.chatroom.ChatroomMsgPack):void");
    }

    @Override // c43.x
    public android.view.View p(android.view.ViewGroup viewGroup) {
        android.view.View inflate = android.view.LayoutInflater.from(this.f120025g).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.beq, (android.view.ViewGroup) null);
        android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.f566634gj4);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.Z = (android.widget.ImageView) findViewById;
        android.view.View findViewById2 = inflate.findViewById(com.p314xaae8f345.mm.R.id.gj6);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f119991p0 = (android.widget.ImageView) findViewById2;
        android.view.View findViewById3 = inflate.findViewById(com.p314xaae8f345.mm.R.id.gj8);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f119992x0 = (android.widget.ImageView) findViewById3;
        android.view.View findViewById4 = inflate.findViewById(com.p314xaae8f345.mm.R.id.gj9);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        this.f119993y0 = (android.widget.TextView) findViewById4;
        android.view.View findViewById5 = inflate.findViewById(com.p314xaae8f345.mm.R.id.gj7);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById5, "findViewById(...)");
        this.f119990l1 = findViewById5;
        return inflate;
    }

    @Override // c43.x
    public void w(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15791x7c5dbdd8 c15791x7c5dbdd8;
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15729xd7c0ac4f c15729xd7c0ac4f;
        long j17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15731x94356d67 c15731x94356d67 = this.f120028m;
        if (c15731x94356d67 == null || (c15791x7c5dbdd8 = c15731x94356d67.f36571x8f2d71bb) == null || (c15729xd7c0ac4f = c15791x7c5dbdd8.f36766x345c4582) == null || s()) {
            return;
        }
        int h17 = s33.y.h(this.f120025g, c15729xd7c0ac4f.f36561x28d1961f);
        if (h17 == 1) {
            j17 = 6;
        } else if (h17 == 2) {
            j17 = 7;
        } else if (h17 != 3) {
            return;
        } else {
            j17 = 28;
        }
        long j18 = j17;
        com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.f fVar = com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.g.f149728a;
        long j19 = this.f120027i;
        long j27 = this.f120026h;
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15731x94356d67 c15731x94356d672 = this.f120028m;
        com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.f.j(fVar, 1L, j18, j19, j27, c15731x94356d672.seq, c15731x94356d672.f36570xfd4da1cb, 0L, this.X, null, 256, null);
    }
}
