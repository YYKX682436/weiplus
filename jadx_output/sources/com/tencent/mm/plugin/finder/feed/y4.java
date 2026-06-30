package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class y4 implements zy2.gc {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.a7 f111143d;

    public y4(com.tencent.mm.plugin.finder.feed.a7 a7Var) {
        this.f111143d = a7Var;
    }

    @Override // zy2.gc
    public void r5(java.lang.Object obj, r45.ix0 ret) {
        com.tencent.mm.protocal.protobuf.FinderObject feedObject;
        r45.wh2 req = (r45.wh2) obj;
        kotlin.jvm.internal.o.g(req, "req");
        kotlin.jvm.internal.o.g(ret, "ret");
        if (ret.getInteger(1) == 0) {
            com.tencent.mm.plugin.finder.feed.a7 a7Var = this.f111143d;
            com.tencent.mm.plugin.finder.storage.FinderItem finderItem = a7Var.f106212i;
            if (finderItem == null) {
                kotlin.jvm.internal.o.o("feedObj");
                throw null;
            }
            if (finderItem.getId() == req.getLong(0)) {
                com.tencent.mm.plugin.finder.storage.FinderItem finderItem2 = a7Var.f106212i;
                if (finderItem2 == null) {
                    kotlin.jvm.internal.o.o("feedObj");
                    throw null;
                }
                finderItem2.setComment_close(0);
                com.tencent.mm.plugin.finder.view.FinderCommentDrawer finderCommentDrawer = a7Var.L;
                if (finderCommentDrawer != null) {
                    long j17 = req.getLong(0);
                    com.tencent.mm.plugin.finder.storage.FinderItem finderItem3 = finderCommentDrawer.feedObj;
                    if ((finderItem3 == null || (feedObject = finderItem3.getFeedObject()) == null || j17 != feedObject.getId()) ? false : true) {
                        finderCommentDrawer.closeComment = false;
                        finderCommentDrawer.showFooter = true;
                    }
                }
                yw2.a0 a0Var = a7Var.f106216o;
                if (a0Var != null) {
                    a0Var.v();
                }
                com.tencent.mm.plugin.finder.feed.a7.u0(this.f111143d, false, 0, 0, 7, null);
                int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
                android.content.Context context = a7Var.f106207d;
                com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
                e4Var.f211776c = context.getString(com.tencent.mm.R.string.mhc);
                e4Var.b(com.tencent.mm.R.raw.toast_ok);
                e4Var.c();
            }
        }
    }
}
