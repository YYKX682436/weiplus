package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes12.dex */
public class v5 implements n13.x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s82.g f101490a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.FavSelectUI f101491b;

    public v5(com.tencent.mm.plugin.fav.ui.FavSelectUI favSelectUI, s82.g gVar) {
        this.f101491b = favSelectUI;
        this.f101490a = gVar;
    }

    @Override // n13.x
    public void a(boolean z17, java.lang.String str, android.os.Bundle bundle) {
        com.tencent.mm.plugin.fav.ui.FavSelectUI favSelectUI = this.f101491b;
        favSelectUI.hideVKB();
        if (z17) {
            com.tencent.mm.ui.widget.dialog.u3 Q = db5.e1.Q(favSelectUI.getContext(), "", favSelectUI.getString(com.tencent.mm.R.string.cax), true, false, null);
            com.tencent.mm.plugin.fav.ui.x5.i(favSelectUI.getContext(), favSelectUI.T, str, bundle.getBoolean("is_group_to_do", false), this.f101490a.f404774a, new com.tencent.mm.plugin.fav.ui.u5(this, Q));
        }
    }
}
