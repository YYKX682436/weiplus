package com.tencent.mm.plugin.emoji.ui.fts;

/* loaded from: classes8.dex */
public class n implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f98023d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f98024e;

    public n(com.tencent.mm.plugin.emoji.ui.fts.FTSEmojiDetailPageUI fTSEmojiDetailPageUI, java.util.List list, java.util.List list2) {
        this.f98023d = list;
        this.f98024e = list2;
    }

    @Override // db5.o4
    public void onCreateMMMenu(db5.g4 g4Var) {
        g4Var.setHeaderTitle("");
        int i17 = 0;
        while (true) {
            java.util.List list = this.f98023d;
            if (i17 >= list.size()) {
                return;
            }
            g4Var.f(((java.lang.Integer) list.get(i17)).intValue(), (java.lang.CharSequence) this.f98024e.get(i17));
            i17++;
        }
    }
}
