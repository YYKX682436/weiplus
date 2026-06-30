package we5;

/* loaded from: classes9.dex */
public final class y0 {

    /* renamed from: a, reason: collision with root package name */
    public final yz5.a f526935a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f526936b = "UIBlock";

    /* renamed from: c, reason: collision with root package name */
    public final java.util.List f526937c = new java.util.ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f526938d = new java.util.ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f526939e = new java.util.ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public long f526940f;

    static {
        new we5.v0(null);
    }

    public y0(yz5.a aVar) {
        this.f526935a = aVar;
    }

    public static final we5.y0 a(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.g0 holder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        return new we5.y0(new we5.u0(holder));
    }

    public final void b(com.p314xaae8f345.mm.ui.p2740x696c9db.e3 blocks, we5.r0 adapter) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(blocks, "blocks");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adapter, "adapter");
        yz5.a aVar = this.f526935a;
        if (aVar != null) {
            blocks.a(adapter.a((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.g0) aVar.mo152xb9724478()));
            return;
        }
        if (od5.b.a()) {
            ((java.util.ArrayList) this.f526938d).add(java.lang.Integer.valueOf(new java.lang.Throwable().getStackTrace()[1].getLineNumber()));
        }
        ((java.util.ArrayList) this.f526937c).add(new we5.w0(blocks, adapter));
    }

    public final void c(we5.t0 block) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(block, "block");
        yz5.a aVar = this.f526935a;
        if (aVar != null) {
            block.a((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.g0) aVar.mo152xb9724478());
            return;
        }
        if (od5.b.a()) {
            ((java.util.ArrayList) this.f526938d).add(java.lang.Integer.valueOf(new java.lang.Throwable().getStackTrace()[1].getLineNumber()));
        }
        ((java.util.ArrayList) this.f526937c).add(new we5.x0(block));
    }

    public final void d(yz5.l block) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(block, "block");
        yz5.a aVar = this.f526935a;
        if (aVar != null) {
            block.mo146xb9724478(aVar.mo152xb9724478());
            return;
        }
        if (od5.b.a()) {
            ((java.util.ArrayList) this.f526938d).add(java.lang.Integer.valueOf(new java.lang.Throwable().getStackTrace()[1].getLineNumber()));
        }
        ((java.util.ArrayList) this.f526937c).add(block);
    }
}
