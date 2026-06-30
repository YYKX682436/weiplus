package com.tencent.mm.plugin.emoji.ui.fts;

/* loaded from: classes15.dex */
public class h implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emoji.ui.fts.FTSEmojiDetailPageUI f98017d;

    public h(com.tencent.mm.plugin.emoji.ui.fts.FTSEmojiDetailPageUI fTSEmojiDetailPageUI) {
        this.f98017d = fTSEmojiDetailPageUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        int i17 = com.tencent.mm.plugin.emoji.ui.fts.FTSEmojiDetailPageUI.P;
        com.tencent.mm.plugin.emoji.ui.fts.FTSEmojiDetailPageUI fTSEmojiDetailPageUI = this.f98017d;
        fTSEmojiDetailPageUI.getClass();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        if (fTSEmojiDetailPageUI.f97998p) {
            arrayList.add(1);
            arrayList2.add(fTSEmojiDetailPageUI.getString(com.tencent.mm.R.string.i8c));
        }
        arrayList.add(2);
        arrayList2.add(fTSEmojiDetailPageUI.getString(com.tencent.mm.R.string.byh));
        if (fTSEmojiDetailPageUI.f97996n == null) {
            fTSEmojiDetailPageUI.f97996n = new com.tencent.mm.ui.tools.s6(fTSEmojiDetailPageUI.getContext());
        }
        com.tencent.mm.ui.tools.s6 s6Var = fTSEmojiDetailPageUI.f97996n;
        s6Var.f210722f = new com.tencent.mm.plugin.emoji.ui.fts.n(fTSEmojiDetailPageUI, arrayList, arrayList2);
        s6Var.f210723g = fTSEmojiDetailPageUI.N;
        com.tencent.mm.plugin.emoji.ui.fts.a aVar = new com.tencent.mm.plugin.emoji.ui.fts.a(fTSEmojiDetailPageUI);
        s6Var.f210724h = aVar;
        s6Var.f210721e.f211854d = aVar;
        androidx.appcompat.app.AppCompatActivity context = fTSEmojiDetailPageUI.getContext();
        fTSEmojiDetailPageUI.f97996n.d();
        db5.e1.a(context, null);
        ((sg0.q3) ((tg0.v1) i95.n0.c(tg0.v1.class))).wi(fTSEmojiDetailPageUI.f98003u, fTSEmojiDetailPageUI.f98004v, fTSEmojiDetailPageUI.f98006x, 7, 0, 0, fTSEmojiDetailPageUI.f98005w);
        return true;
    }
}
