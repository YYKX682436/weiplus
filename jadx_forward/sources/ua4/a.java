package ua4;

/* loaded from: classes4.dex */
public final class a {
    public a(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final void a(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 snsInfo, android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDetailPageDescSpanBindView", "com.tencent.mm.plugin.sns.reportflow.SnsTagSearchSpanClickReportFlow$Companion");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(snsInfo, "snsInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        r45.ek6 ek6Var = new r45.ek6();
        ek6Var.f455118e = 3;
        ek6Var.f455119f = snsInfo.m70374x6bf53a6c() + '#' + ca4.z0.t0(snsInfo.f68891x29d1292e);
        ek6Var.f455120g = (long) snsInfo.f68883xac3be4e;
        ek6Var.f455121h = 3;
        ek6Var.f455122i = snsInfo.f68895x2262335f;
        nd0.e eVar = (nd0.e) i95.n0.c(nd0.e.class);
        android.content.Context context = view.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        o04.n Bi = ((md0.e) eVar).Bi(context, 1);
        if (Bi != null) {
            ((o04.g) Bi).b(java.lang.String.valueOf(view.hashCode()), ek6Var);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDetailPageDescSpanBindView", "com.tencent.mm.plugin.sns.reportflow.SnsTagSearchSpanClickReportFlow$Companion");
    }

    public final void b(android.view.View view, r45.e86 comment) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onItemCommentSpanBindView", "com.tencent.mm.plugin.sns.reportflow.SnsTagSearchSpanClickReportFlow$Companion");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(comment, "comment");
        if (view instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.C18412x8f28cefe) {
            nd0.e eVar = (nd0.e) i95.n0.c(nd0.e.class);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.C18412x8f28cefe c18412x8f28cefe = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.C18412x8f28cefe) view;
            android.content.Context context = c18412x8f28cefe.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            o04.n Bi = ((md0.e) eVar).Bi(context, 1);
            if (Bi != null) {
                ((o04.g) Bi).a("Comment_" + comment.hashCode(), java.lang.String.valueOf(c18412x8f28cefe.m71265x84c9a5e4().hashCode()));
            }
            nd0.e eVar2 = (nd0.e) i95.n0.c(nd0.e.class);
            android.content.Context context2 = c18412x8f28cefe.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
            o04.n Bi2 = ((md0.e) eVar2).Bi(context2, 1);
            if (Bi2 != null) {
                ((o04.g) Bi2).a("Comment_" + comment.hashCode(), java.lang.String.valueOf(c18412x8f28cefe.m71263xb7f99171().hashCode()));
            }
        } else if (view instanceof android.widget.TextView) {
            nd0.e eVar3 = (nd0.e) i95.n0.c(nd0.e.class);
            android.content.Context context3 = ((android.widget.TextView) view).getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context3, "getContext(...)");
            o04.n Bi3 = ((md0.e) eVar3).Bi(context3, 1);
            if (Bi3 != null) {
                ((o04.g) Bi3).a("Comment_" + comment.hashCode(), java.lang.String.valueOf(view.hashCode()));
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTAG", "com.tencent.mm.plugin.sns.reportflow.SnsTagSearchSpanClickReportFlow$Companion");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getTAG$cp", "com.tencent.mm.plugin.sns.reportflow.SnsTagSearchSpanClickReportFlow");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getTAG$cp", "com.tencent.mm.plugin.sns.reportflow.SnsTagSearchSpanClickReportFlow");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTAG", "com.tencent.mm.plugin.sns.reportflow.SnsTagSearchSpanClickReportFlow$Companion");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Sns.SnsTagSearchSpanClickReportFlow", "onItemCommentSpanBindView Comment_" + comment.hashCode() + ' ' + view.hashCode());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onItemCommentSpanBindView", "com.tencent.mm.plugin.sns.reportflow.SnsTagSearchSpanClickReportFlow$Companion");
    }

    public final void c(android.view.View view, int i17, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ns struct) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onItemDescSpanBindView", "com.tencent.mm.plugin.sns.reportflow.SnsTagSearchSpanClickReportFlow$Companion");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(struct, "struct");
        android.view.View findViewById = view.findViewById(i17);
        nd0.e eVar = (nd0.e) i95.n0.c(nd0.e.class);
        android.content.Context context = view.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        o04.n Bi = ((md0.e) eVar).Bi(context, 1);
        if (Bi != null) {
            ((o04.g) Bi).a("Item_" + struct.f251558a.f38324x142bbdc6, java.lang.String.valueOf(findViewById.hashCode()));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onItemDescSpanBindView", "com.tencent.mm.plugin.sns.reportflow.SnsTagSearchSpanClickReportFlow$Companion");
    }
}
