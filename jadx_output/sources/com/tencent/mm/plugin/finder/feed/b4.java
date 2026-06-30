package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes10.dex */
public final class b4 extends ym5.m0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.a7 f106350a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.storage.FinderItem f106351b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderCommentDrawer f106352c;

    public b4(com.tencent.mm.plugin.finder.feed.a7 a7Var, com.tencent.mm.plugin.finder.storage.FinderItem finderItem, com.tencent.mm.plugin.finder.view.FinderCommentDrawer finderCommentDrawer) {
        this.f106350a = a7Var;
        this.f106351b = finderItem;
        this.f106352c = finderCommentDrawer;
    }

    @Override // ym5.m0
    public boolean d() {
        return false;
    }

    @Override // ym5.m0
    public void e(android.view.View parent, java.util.List exposedHolders) {
        java.util.HashMap hashMap;
        java.util.Iterator it;
        com.tencent.mm.plugin.finder.feed.a7 a7Var;
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar;
        java.lang.String str;
        int i17;
        so2.y0 y0Var;
        com.tencent.mm.plugin.finder.feed.b4 b4Var = this;
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(exposedHolders, "exposedHolders");
        java.util.HashMap hashMap2 = new java.util.HashMap();
        com.tencent.mm.plugin.finder.feed.a7 a7Var2 = b4Var.f106350a;
        android.content.Context context = a7Var2.f106207d;
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar2 = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        java.util.Iterator it6 = exposedHolders.iterator();
        while (true) {
            boolean hasNext = it6.hasNext();
            java.util.HashMap hashMap3 = a7Var2.Q;
            if (!hasNext) {
                hashMap3.clear();
                hashMap3.putAll(hashMap2);
                return;
            }
            androidx.recyclerview.widget.k3 k3Var = (androidx.recyclerview.widget.k3) it6.next();
            if (k3Var instanceof in5.s0) {
                in5.s0 s0Var = (in5.s0) k3Var;
                java.lang.Object obj = s0Var.f293125i;
                so2.y0 y0Var2 = obj instanceof so2.y0 ? (so2.y0) obj : null;
                if (y0Var2 != null) {
                    long itemId = y0Var2.getItemId();
                    hashMap2.put(java.lang.Long.valueOf(itemId), y0Var2);
                    if (!hashMap3.containsKey(java.lang.Long.valueOf(itemId))) {
                        r45.ky0 advertisement_info = y0Var2.f410703d.u0().getAdvertisement_info();
                        if (advertisement_info == null || (str = advertisement_info.getString(3)) == null) {
                            str = "";
                        }
                        com.tencent.mm.plugin.finder.report.o3 o3Var = (com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
                        long j17 = a7Var2.f106221r;
                        java.lang.String str2 = nyVar2 != null ? nyVar2.f135385q : null;
                        java.lang.String str3 = nyVar2 != null ? nyVar2.f135382p : null;
                        java.lang.String str4 = nyVar2 != null ? nyVar2.f135386r : null;
                        if (nyVar2 != null) {
                            i17 = nyVar2.f135380n;
                            it = it6;
                        } else {
                            it = it6;
                            i17 = 0;
                        }
                        long id6 = b4Var.f106351b.getFeedObject().getId();
                        int i18 = b4Var.f106352c.getCom.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_REASON java.lang.String();
                        int adapterPosition = s0Var.getAdapterPosition();
                        so2.e0 e0Var = y0Var2.D;
                        a7Var = a7Var2;
                        nyVar = nyVar2;
                        hashMap = hashMap2;
                        long j18 = e0Var.f410321a + e0Var.f410322b;
                        o3Var.getClass();
                        java.lang.String report_json = y0Var2.f410703d.u0().getReport_json();
                        com.tencent.mm.autogen.mmdata.rpt.CommentExposeStruct commentExposeStruct = new com.tencent.mm.autogen.mmdata.rpt.CommentExposeStruct();
                        if (str2 == null) {
                            str2 = "";
                        }
                        so2.y0 y0Var3 = y0Var2;
                        commentExposeStruct.f55705d = commentExposeStruct.b("SessionId", str2, true);
                        if (str3 == null) {
                            str3 = "";
                        }
                        commentExposeStruct.f55706e = commentExposeStruct.b("ContextId", str3, true);
                        if (str4 == null) {
                            str4 = "";
                        }
                        commentExposeStruct.f55707f = commentExposeStruct.b("ClickTabContextId", str4, true);
                        commentExposeStruct.f55708g = i17;
                        commentExposeStruct.f55709h = commentExposeStruct.b("feedid", pm0.v.u(id6), true);
                        commentExposeStruct.f55712k = o3Var.tk(i18);
                        commentExposeStruct.f55715n = commentExposeStruct.b("enterSessionID", java.lang.String.valueOf(j17), true);
                        commentExposeStruct.f55713l = commentExposeStruct.b("reportJson", report_json != null ? r26.i0.t(report_json, ",", ";", false) : null, true);
                        long j19 = adapterPosition - 1;
                        if (j19 < 0) {
                            j19 = 0;
                        }
                        commentExposeStruct.f55714m = j19;
                        commentExposeStruct.f55716o = commentExposeStruct.b("ad_report_data", r26.i0.t(str, ",", ";", false), true);
                        commentExposeStruct.f55717p = 0L;
                        commentExposeStruct.f55718q = j18;
                        int h17 = y0Var3.h();
                        if (h17 == 1 || h17 == 5) {
                            y0Var = y0Var3;
                            commentExposeStruct.f55710i = commentExposeStruct.b("rootCommentid", pm0.v.u(y0Var.f410703d.t0()), true);
                            commentExposeStruct.f55711j = commentExposeStruct.b("subCommentid", "", true);
                        } else {
                            y0Var = y0Var3;
                            if (h17 == 2) {
                                commentExposeStruct.f55710i = commentExposeStruct.b("rootCommentid", pm0.v.u(y0Var.f410703d.Y0()), true);
                                commentExposeStruct.f55711j = commentExposeStruct.b("subCommentid", pm0.v.u(y0Var.f410703d.t0()), true);
                            } else {
                                b4Var = this;
                                it6 = it;
                                a7Var2 = a7Var;
                                nyVar2 = nyVar;
                                hashMap2 = hashMap;
                            }
                        }
                        commentExposeStruct.f55722u = y0Var.f410703d.w0();
                        cl0.g gVar = new cl0.g();
                        cl0.g gVar2 = new cl0.g();
                        com.tencent.mm.api.IEmojiInfo iEmojiInfo = y0Var.f410714r;
                        if (iEmojiInfo != null) {
                            gVar2.h("pid", iEmojiInfo.getGroupId());
                            gVar2.h("emoticon_designerid", iEmojiInfo.X0());
                            gVar2.h("emoticon_activityid", iEmojiInfo.S0());
                        }
                        gVar.h("big_sticker_info", gVar2);
                        java.lang.String gVar3 = gVar.toString();
                        kotlin.jvm.internal.o.f(gVar3, "toString(...)");
                        commentExposeStruct.f55721t = commentExposeStruct.b("extrainfo", r26.i0.t(gVar3, ",", ";", false), true);
                        com.tencent.mm.api.IEmojiInfo iEmojiInfo2 = y0Var.f410714r;
                        commentExposeStruct.f55723v = commentExposeStruct.b("EmoticonMd5", iEmojiInfo2 != null ? iEmojiInfo2.getMd5() : null, true);
                        commentExposeStruct.k();
                        o3Var.Zk(commentExposeStruct);
                        b4Var = this;
                        it6 = it;
                        a7Var2 = a7Var;
                        nyVar2 = nyVar;
                        hashMap2 = hashMap;
                    }
                }
            }
            hashMap = hashMap2;
            it = it6;
            a7Var = a7Var2;
            nyVar = nyVar2;
            b4Var = this;
            it6 = it;
            a7Var2 = a7Var;
            nyVar2 = nyVar;
            hashMap2 = hashMap;
        }
    }
}
