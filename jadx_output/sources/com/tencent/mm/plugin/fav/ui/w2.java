package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes12.dex */
public final class w2 implements n13.x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.FavFinderFilterUI f101507a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o72.r2 f101508b;

    public w2(com.tencent.mm.plugin.fav.ui.FavFinderFilterUI favFinderFilterUI, o72.r2 r2Var) {
        this.f101507a = favFinderFilterUI;
        this.f101508b = r2Var;
    }

    @Override // n13.x
    public final void a(boolean z17, java.lang.String str, android.os.Bundle extInfo) {
        kotlin.jvm.internal.o.g(extInfo, "extInfo");
        com.tencent.mm.plugin.fav.ui.FavFinderFilterUI favFinderFilterUI = this.f101507a;
        favFinderFilterUI.hideVKB();
        if (z17) {
            com.tencent.mm.ui.widget.dialog.u3 Q = db5.e1.Q(favFinderFilterUI.getContext(), "", favFinderFilterUI.getString(com.tencent.mm.R.string.cax), true, false, null);
            boolean z18 = extInfo.getBoolean("is_group_to_do");
            androidx.appcompat.app.AppCompatActivity context = favFinderFilterUI.getContext();
            java.lang.String str2 = favFinderFilterUI.f100351g;
            if (str2 != null) {
                com.tencent.mm.plugin.fav.ui.x5.i(context, str2, str, z18, this.f101508b, new com.tencent.mm.plugin.fav.ui.v2(Q, favFinderFilterUI));
            } else {
                kotlin.jvm.internal.o.o("toUser");
                throw null;
            }
        }
    }
}
