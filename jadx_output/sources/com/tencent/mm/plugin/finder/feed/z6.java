package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class z6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.AppCompatActivity f111233d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.a7 f111234e;

    public z6(androidx.appcompat.app.AppCompatActivity appCompatActivity, com.tencent.mm.plugin.finder.feed.a7 a7Var) {
        this.f111233d = appCompatActivity;
        this.f111234e = a7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.view.s8 s8Var = com.tencent.mm.plugin.finder.view.s8.f133027a;
        com.tencent.mm.plugin.finder.feed.a7 a7Var = this.f111234e;
        java.lang.String string = ((androidx.appcompat.app.AppCompatActivity) a7Var.f106207d).getResources().getString(com.tencent.mm.R.string.p3u);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        com.tencent.mm.plugin.finder.view.i8 i8Var = com.tencent.mm.plugin.finder.view.i8.f132294e;
        com.tencent.mm.plugin.finder.view.d8 d8Var = com.tencent.mm.plugin.finder.view.d8.f131881e;
        java.lang.String string2 = ((androidx.appcompat.app.AppCompatActivity) a7Var.f106207d).getResources().getString(com.tencent.mm.R.string.f493796p40);
        kotlin.jvm.internal.o.f(string2, "getString(...)");
        java.lang.String string3 = ((androidx.appcompat.app.AppCompatActivity) a7Var.f106207d).getResources().getString(com.tencent.mm.R.string.p3z);
        kotlin.jvm.internal.o.f(string3, "getString(...)");
        androidx.appcompat.app.AppCompatActivity appCompatActivity = this.f111233d;
        com.tencent.mm.plugin.finder.feed.y6 y6Var = new com.tencent.mm.plugin.finder.feed.y6(appCompatActivity);
        jz5.l[] lVarArr = new jz5.l[2];
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem = a7Var.f106212i;
        if (finderItem == null) {
            kotlin.jvm.internal.o.o("feedObj");
            throw null;
        }
        com.tencent.mm.protocal.protobuf.FinderContact contact = finderItem.getFeedObject().getContact();
        lVarArr[0] = new jz5.l("author_finder_username", contact != null ? contact.getUsername() : null);
        lVarArr[1] = new jz5.l("action_type", 3);
        s8Var.e(appCompatActivity, com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_COMMENT, new com.tencent.mm.plugin.finder.view.h8(string, i8Var, d8Var, string2, string3, y6Var, null, null, "profile_set_entrance_open", "profile_set_entrance_unopen", "profile_set_entrance_halfscreen", kz5.c1.k(lVarArr), 192, null));
    }
}
