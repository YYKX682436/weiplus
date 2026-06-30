package com.tencent.mm.plugin.fav.ui.detail;

/* loaded from: classes12.dex */
public class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.detail.BaseFavDetailReportUI f100700d;

    public c(com.tencent.mm.plugin.fav.ui.detail.BaseFavDetailReportUI baseFavDetailReportUI) {
        this.f100700d = baseFavDetailReportUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.fav.ui.detail.BaseFavDetailReportUI baseFavDetailReportUI = this.f100700d;
        baseFavDetailReportUI.f100600g.f343495t = ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().Ah((int) baseFavDetailReportUI.f100600g.f343478c) + 1;
        o72.u2 u2Var = baseFavDetailReportUI.f100600g;
        java.util.Map map = o72.v2.f343502a;
        jx3.f.INSTANCE.kvStat(15098, u2Var.toString());
        java.lang.String.format("scene[%s],index[%s],favId[%s],type[%s],infoLength[%s],source[%s],timestamp[%s],detailPeriod[%s],subDetailPeriod[%s],needOpenOtherApp[%s],subDetailCount[%s],shareFriendCount[%s],shareSnsCount[%s],editContentCount[%s],editTagCount[%s],isDelete[%s],isScrollBottom[%s],subScene[%s],sid[%s],sourcePos[%s],query[%s],tags[%s],generalMsgType[%s],isSearch[%s],searchIndex[%s],origIndex[%s]", java.lang.Integer.valueOf(u2Var.f343476a), java.lang.Integer.valueOf(u2Var.f343477b), java.lang.Long.valueOf(u2Var.f343478c), java.lang.Integer.valueOf(u2Var.f343479d), u2Var.f343480e, java.lang.Integer.valueOf(u2Var.f343481f), java.lang.Long.valueOf(u2Var.f343482g), java.lang.Long.valueOf(u2Var.f343483h), java.lang.Long.valueOf(u2Var.f343484i), java.lang.Integer.valueOf(u2Var.f343485j ? 1 : 0), java.lang.Integer.valueOf(u2Var.f343486k), java.lang.Integer.valueOf(u2Var.f343487l), java.lang.Integer.valueOf(u2Var.f343488m), java.lang.Integer.valueOf(u2Var.f343489n), java.lang.Integer.valueOf(u2Var.f343490o), java.lang.Integer.valueOf(u2Var.f343491p ? 1 : 0), java.lang.Integer.valueOf(u2Var.f343492q ? 1 : 0), java.lang.Integer.valueOf(u2Var.f343493r), u2Var.f343494s, java.lang.Integer.valueOf(u2Var.f343495t), u2Var.f343496u, u2Var.f343497v, java.lang.Integer.valueOf(u2Var.f343501z), java.lang.Integer.valueOf(u2Var.f343498w), java.lang.Integer.valueOf(u2Var.f343499x), java.lang.Integer.valueOf(u2Var.f343500y));
    }
}
