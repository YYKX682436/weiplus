package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public abstract class gj extends com.tencent.mm.plugin.finder.feed.i0 {

    /* renamed from: q, reason: collision with root package name */
    public final ym5.q1 f106850q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gj(com.tencent.mm.ui.MMActivity context, com.tencent.mm.plugin.finder.feed.dj presenter, int i17, int i18) {
        super(context, presenter, i17, i18, false);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(presenter, "presenter");
        this.f106850q = new com.tencent.mm.plugin.finder.feed.ej(this);
    }

    @Override // com.tencent.mm.plugin.finder.feed.i0
    public void u() {
        java.util.regex.Pattern pattern = pm0.v.f356802a;
        pm0.v.J(km5.u.d(), new com.tencent.mm.plugin.finder.feed.fj(this));
    }

    public ym5.q1 w() {
        return this.f106850q;
    }

    public void x(ym5.s3 reason) {
        kotlin.jvm.internal.o.g(reason, "reason");
    }
}
