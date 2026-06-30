package com.tencent.mm.plugin.finder.feed.ui.commentimage;

/* loaded from: classes10.dex */
public final class d1 extends androidx.lifecycle.c1 {

    /* renamed from: d, reason: collision with root package name */
    public boolean f109820d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.storage.FinderItem f109821e;

    /* renamed from: f, reason: collision with root package name */
    public int f109822f;

    /* renamed from: g, reason: collision with root package name */
    public long f109823g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.feed.f7 f109824h;

    /* renamed from: i, reason: collision with root package name */
    public r45.vg7 f109825i;

    /* renamed from: m, reason: collision with root package name */
    public int f109826m;

    /* renamed from: p, reason: collision with root package name */
    public volatile com.tencent.mm.protobuf.g f109829p;

    /* renamed from: r, reason: collision with root package name */
    public final kotlinx.coroutines.flow.i2 f109831r;

    /* renamed from: s, reason: collision with root package name */
    public final kotlinx.coroutines.flow.n2 f109832s;

    /* renamed from: t, reason: collision with root package name */
    public final kotlinx.coroutines.flow.i2 f109833t;

    /* renamed from: u, reason: collision with root package name */
    public final kotlinx.coroutines.flow.n2 f109834u;

    /* renamed from: v, reason: collision with root package name */
    public final kotlinx.coroutines.flow.i2 f109835v;

    /* renamed from: w, reason: collision with root package name */
    public final kotlinx.coroutines.flow.n2 f109836w;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.ArrayList f109827n = new java.util.ArrayList();

    /* renamed from: o, reason: collision with root package name */
    public int f109828o = -1;

    /* renamed from: q, reason: collision with root package name */
    public boolean f109830q = true;

    public d1() {
        u26.u uVar = u26.u.DROP_OLDEST;
        kotlinx.coroutines.flow.i2 b17 = kotlinx.coroutines.flow.r2.b(0, 1, uVar, 1, null);
        this.f109831r = b17;
        this.f109832s = kotlinx.coroutines.flow.l.a(b17);
        kotlinx.coroutines.flow.i2 b18 = kotlinx.coroutines.flow.r2.b(0, 1, uVar, 1, null);
        this.f109833t = b18;
        this.f109834u = kotlinx.coroutines.flow.l.a(b18);
        kotlinx.coroutines.flow.i2 b19 = kotlinx.coroutines.flow.r2.b(0, Integer.MAX_VALUE, null, 5, null);
        this.f109835v = b19;
        this.f109836w = kotlinx.coroutines.flow.l.a(b19);
    }

    public static final void N6(com.tencent.mm.plugin.finder.feed.ui.commentimage.d1 d1Var, android.content.Context context, r45.ty0 ty0Var) {
        ec2.d e27;
        d1Var.getClass();
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        if (nyVar == null || (e27 = zy2.ra.e2(nyVar, 0, 1, null)) == null) {
            return;
        }
        long id6 = d1Var.O6().getId();
        java.lang.String dupFlag = d1Var.O6().getDupFlag();
        int i17 = d1Var.f109826m;
        long j17 = ty0Var.getLong(1);
        ec2.a aVar = new ec2.a(30, id6, dupFlag);
        aVar.f250950h = new ec2.c(0, false, false, i17, j17, 0, 36, null);
        e27.a(aVar);
    }

    public static void P6(com.tencent.mm.plugin.finder.feed.ui.commentimage.d1 d1Var, android.content.Context context, com.tencent.mm.plugin.finder.view.FinderCommentFooter finderCommentFooter, int i17, java.util.List mentionContactList, java.lang.String str, int i18, java.lang.Object obj) {
        if ((i18 & 16) != 0) {
            str = null;
        }
        java.lang.String str2 = str;
        d1Var.getClass();
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(mentionContactList, "mentionContactList");
        java.lang.String z17 = hc2.o0.z(d1Var.O6().getFeedObject(), i17);
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
        com.tencent.mm.plugin.finder.viewmodel.component.dy.f134172a.c(context, z17, 1, new com.tencent.mm.plugin.finder.feed.ui.commentimage.b1(d1Var, context, finderCommentFooter, i17, mentionContactList, str2));
    }

    public final com.tencent.mm.plugin.finder.storage.FinderItem O6() {
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem = this.f109821e;
        if (finderItem != null) {
            return finderItem;
        }
        kotlin.jvm.internal.o.o("feedObj");
        throw null;
    }

    @Override // androidx.lifecycle.c1
    public void onCleared() {
        this.f109829p = null;
    }
}
