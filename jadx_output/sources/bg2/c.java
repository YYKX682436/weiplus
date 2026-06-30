package bg2;

/* loaded from: classes2.dex */
public final class c extends tc2.c {

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f19956e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(tc2.g store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
        this.f19956e = "Finder.LiveBrandController";
    }

    @Override // tc2.c
    public void P6() {
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject;
        r45.kr0 styleInfo;
        java.util.LinkedList list;
        java.lang.Object obj;
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject2;
        r45.nw1 liveInfo;
        java.lang.String l17;
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject3;
        r45.nw1 liveInfo2;
        in5.s0 s0Var;
        uc2.g gVar = (uc2.g) O6(uc2.g.class);
        android.widget.ImageView imageView = (gVar == null || (s0Var = ((sb2.l) gVar).f417141d.f417149i) == null) ? null : (android.widget.ImageView) s0Var.p(com.tencent.mm.R.id.f483458ax2);
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        tc2.g gVar2 = this.f417141d;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = gVar2.f417148h;
        if (baseFinderFeed == null || (feedObject = baseFinderFeed.getFeedObject()) == null || (styleInfo = feedObject.getStyleInfo()) == null || (list = styleInfo.getList(12)) == null) {
            return;
        }
        java.util.Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            r45.kz3 kz3Var = (r45.kz3) obj;
            if (kz3Var.getInteger(0) == 6 && ((r45.mg6) kz3Var.getCustom(1)) != null) {
                break;
            }
        }
        if (((r45.kz3) obj) != null) {
            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed2 = gVar2.f417148h;
            r45.i92 i92Var = (baseFinderFeed2 == null || (feedObject3 = baseFinderFeed2.getFeedObject()) == null || (liveInfo2 = feedObject3.getLiveInfo()) == null) ? null : (r45.i92) liveInfo2.getCustom(55);
            if (i92Var != null && i92Var.getInteger(0) == 1) {
                java.lang.String string = i92Var.getString(1);
                java.lang.String str = "";
                java.lang.String str2 = string == null ? "" : string;
                if (imageView != null) {
                    i95.m c17 = i95.n0.c(s40.w0.class);
                    kotlin.jvm.internal.o.f(c17, "getService(...)");
                    s40.w0 w0Var = (s40.w0) c17;
                    android.content.Context context = imageView.getContext();
                    kotlin.jvm.internal.o.f(context, "getContext(...)");
                    float q17 = i65.a.q(context);
                    float s17 = i65.a.s(context);
                    s40.w0.S2(w0Var, imageView, str2, q17 > s17 ? s17 : q17, null, 8, null);
                    imageView.setVisibility(0);
                    uc2.g gVar3 = (uc2.g) O6(uc2.g.class);
                    r45.qt2 c76 = gVar3 != null ? ((sb2.l) gVar3).c7() : null;
                    com.tencent.mm.plugin.finder.assist.v3 v3Var = com.tencent.mm.plugin.finder.assist.v3.f102621a;
                    ml2.u1 u1Var = ml2.u1.F2;
                    jz5.l[] lVarArr = new jz5.l[1];
                    com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed3 = gVar2.f417148h;
                    if (baseFinderFeed3 != null && (feedObject2 = baseFinderFeed3.getFeedObject()) != null && (liveInfo = feedObject2.getLiveInfo()) != null && (l17 = java.lang.Long.valueOf(liveInfo.getLong(0)).toString()) != null) {
                        str = l17;
                    }
                    lVarArr[0] = new jz5.l("liveid", str);
                    v3Var.c(c76, u1Var, kz5.c1.i(lVarArr));
                    kotlin.jvm.internal.g0 g0Var = new kotlin.jvm.internal.g0();
                    g0Var.f310121d = c01.id.c();
                    ym5.a1.h(imageView, new bg2.b(this, g0Var));
                }
                com.tencent.mars.xlog.Log.i(this.f19956e, "brandUrl ".concat(str2));
            }
        }
    }
}
