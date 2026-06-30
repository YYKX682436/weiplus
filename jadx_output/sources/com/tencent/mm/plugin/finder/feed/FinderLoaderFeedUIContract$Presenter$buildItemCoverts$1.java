package com.tencent.mm.plugin.finder.feed;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\n\u0018\u00002\u00020\u0001J\u0014\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"com/tencent/mm/plugin/finder/feed/FinderLoaderFeedUIContract$Presenter$buildItemCoverts$1", "Lin5/s;", "", "type", "Lin5/r;", "getItemConvert", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderLoaderFeedUIContract$Presenter$buildItemCoverts$1 implements in5.s {
    final /* synthetic */ com.tencent.mm.plugin.finder.feed.dj this$0;

    public FinderLoaderFeedUIContract$Presenter$buildItemCoverts$1(com.tencent.mm.plugin.finder.feed.dj djVar) {
        this.this$0 = djVar;
    }

    @Override // in5.s
    public in5.r getItemConvert(int type) {
        if (type == -21) {
            return new com.tencent.mm.plugin.finder.convert.z2();
        }
        if (type == -20) {
            return new com.tencent.mm.plugin.finder.convert.f0();
        }
        if (type == -18) {
            return new com.tencent.mm.plugin.finder.convert.ho();
        }
        if (type == -12) {
            return new com.tencent.mm.plugin.finder.convert.xr();
        }
        if (type == 2) {
            com.tencent.mm.plugin.finder.feed.dj djVar = this.this$0;
            return new com.tencent.mm.plugin.finder.convert.df(djVar, djVar.Q(), this.this$0.f106427m, false, 8, null);
        }
        if (type == 4) {
            com.tencent.mm.plugin.finder.feed.dj djVar2 = this.this$0;
            return new com.tencent.mm.plugin.finder.convert.bh(djVar2.f106429o, djVar2, djVar2.Q(), this.this$0.f106427m, false, 16, null);
        }
        if (type == 9) {
            com.tencent.mm.plugin.finder.feed.dj djVar3 = this.this$0;
            cw2.f8 f8Var = djVar3.f106429o;
            boolean Q = djVar3.Q();
            com.tencent.mm.plugin.finder.feed.dj djVar4 = this.this$0;
            int i17 = djVar4.f106427m;
            com.tencent.mm.ui.MMActivity context = djVar4.f106421d;
            kotlin.jvm.internal.o.g(context, "context");
            com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
            return new com.tencent.mm.plugin.finder.convert.zf(f8Var, djVar3, Q, i17, nyVar != null ? nyVar.f135380n : 0);
        }
        if (type == 15) {
            com.tencent.mm.plugin.finder.feed.aj ajVar = com.tencent.mm.plugin.finder.feed.aj.f106298d;
            com.tencent.mm.plugin.finder.feed.dj djVar5 = this.this$0;
            return new com.tencent.mm.plugin.finder.convert.oj(ajVar, djVar5, djVar5.f106427m);
        }
        if (type == 19) {
            com.tencent.mm.plugin.finder.feed.dj djVar6 = this.this$0;
            return new com.tencent.mm.plugin.finder.convert.uj(djVar6, djVar6.f106427m);
        }
        if (type != 2003) {
            hc2.l.a(this.this$0.v(), type);
            return new com.tencent.mm.plugin.finder.convert.z2();
        }
        com.tencent.mm.plugin.finder.feed.dj djVar7 = this.this$0;
        com.tencent.mm.ui.MMActivity activity = djVar7.f106421d;
        kotlin.jvm.internal.o.g(activity, "activity");
        return new com.tencent.mm.plugin.finder.convert.th(djVar7, ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6(), 0);
    }
}
