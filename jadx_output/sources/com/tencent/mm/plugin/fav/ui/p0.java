package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes3.dex */
public final class p0 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.FavChangeTagUI f101329d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f101330e;

    public p0(com.tencent.mm.plugin.fav.ui.FavChangeTagUI favChangeTagUI, java.lang.String str) {
        this.f101329d = favChangeTagUI;
        this.f101330e = str;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.fav.ui.FavChangeTagUI favChangeTagUI = this.f101329d;
        android.widget.EditText editText = favChangeTagUI.f100298d;
        if (editText == null) {
            kotlin.jvm.internal.o.o("coreEditText");
            throw null;
        }
        java.lang.String obj = editText.getText().toString();
        if (kotlin.jvm.internal.o.b(obj, this.f101330e)) {
            favChangeTagUI.finish();
            return true;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("change_name", obj);
        favChangeTagUI.setResult(-1, intent);
        favChangeTagUI.finish();
        return true;
    }
}
