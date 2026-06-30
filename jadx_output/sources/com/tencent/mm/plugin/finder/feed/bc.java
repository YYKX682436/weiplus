package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class bc extends com.tencent.mm.plugin.finder.feed.dj {

    /* renamed from: y, reason: collision with root package name */
    public final jz5.g f106375y;

    /* renamed from: z, reason: collision with root package name */
    public final zy2.h8 f106376z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bc(com.tencent.mm.ui.MMActivity context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        this.f106375y = jz5.h.b(new com.tencent.mm.plugin.finder.feed.yb(context));
        this.f106376z = ((te2.e4) ((zy2.g8) pf5.z.f353948a.a(context).c(zy2.g8.class))).f417974d;
    }

    @Override // com.tencent.mm.plugin.finder.feed.c0
    public void C() {
    }

    @Override // com.tencent.mm.plugin.finder.feed.c0
    public void P() {
    }

    @Override // com.tencent.mm.plugin.finder.feed.dj
    public void X(com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader model, com.tencent.mm.plugin.finder.feed.gj callback) {
        fc2.c n17;
        fc2.c n18;
        kotlin.jvm.internal.o.g(model, "model");
        kotlin.jvm.internal.o.g(callback, "callback");
        super.X(model, callback);
        jz5.g gVar = this.f106375y;
        ((com.tencent.mm.plugin.finder.feed.model.l0) ((jz5.n) gVar).getValue()).N0(2, this.f106422e, new com.tencent.mm.plugin.finder.feed.zb(this));
        com.tencent.mm.ui.MMActivity context = this.f106421d;
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = (com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
        if (nyVar != null && (n18 = zy2.ra.n1(nyVar, 0, 1, null)) != null) {
            n18.a((com.tencent.mm.plugin.finder.feed.model.l0) ((jz5.n) gVar).getValue());
        }
        zy2.h8 h8Var = this.f106376z;
        com.tencent.mm.plugin.finder.feed.ac acVar = new com.tencent.mm.plugin.finder.feed.ac(this);
        com.tencent.mm.plugin.finder.feed.i0 i0Var = this.f106424g;
        com.tencent.mm.plugin.finder.feed.model.s3 s3Var = (com.tencent.mm.plugin.finder.feed.model.s3) h8Var;
        s3Var.N0(acVar, i0Var != null ? i0Var.getRecyclerView() : null);
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar2 = (com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
        if (nyVar2 == null || (n17 = zy2.ra.n1(nyVar2, 0, 1, null)) == null) {
            return;
        }
        s3Var.getClass();
        n17.a(s3Var);
    }

    @Override // com.tencent.mm.plugin.finder.feed.dj, com.tencent.mm.plugin.finder.feed.c0, fs2.a
    public void onDetach() {
        fc2.c n17;
        fc2.c n18;
        jz5.g gVar = this.f106375y;
        ((com.tencent.mm.plugin.finder.feed.model.l0) ((jz5.n) gVar).getValue()).onDetach();
        com.tencent.mm.ui.MMActivity context = this.f106421d;
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = (com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
        if (nyVar != null && (n18 = zy2.ra.n1(nyVar, 0, 1, null)) != null) {
            n18.d((com.tencent.mm.plugin.finder.feed.model.l0) ((jz5.n) gVar).getValue());
        }
        com.tencent.mm.plugin.finder.feed.model.s3 s3Var = (com.tencent.mm.plugin.finder.feed.model.s3) this.f106376z;
        s3Var.onDetach();
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar2 = (com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
        if (nyVar2 != null && (n17 = zy2.ra.n1(nyVar2, 0, 1, null)) != null) {
            s3Var.getClass();
            n17.d(s3Var);
        }
        super.onDetach();
    }
}
