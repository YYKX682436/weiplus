package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class f00 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.g00 f106681d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.CopyOnWriteArrayList f106682e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f106683f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ rn5.a f106684g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.e f106685h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f00(com.tencent.mm.plugin.finder.feed.g00 g00Var, java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList, java.util.List list, rn5.a aVar, com.tencent.mm.plugin.finder.feed.model.e eVar) {
        super(0);
        this.f106681d = g00Var;
        this.f106682e = copyOnWriteArrayList;
        this.f106683f = list;
        this.f106684g = aVar;
        this.f106685h = eVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.report.o3 o3Var = (com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
        com.tencent.mm.plugin.finder.feed.g00 g00Var = this.f106681d;
        o3Var.Zj(g00Var.f106797b.U0(), "StartCgi");
        java.util.Iterator it = this.f106682e.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            int i17 = g00Var.f106799d;
            if (!hasNext) {
                ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).Zj(g00Var.f106797b.U0(), "StartCgi");
                com.tencent.mm.plugin.finder.extension.reddot.ha.f105557a.m(i17, g00Var.f106796a);
                boolean booleanValue = ((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.r1().r()).booleanValue();
                g00Var.f106800e.g(this.f106683f, this.f106684g, this.f106685h, booleanValue);
                return jz5.f0.f302826a;
            }
            ((ni3.a) it.next()).b(i17);
        }
    }
}
