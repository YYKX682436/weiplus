package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui;

/* loaded from: classes3.dex */
public final class p0 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13561xae558fe3 f182862d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f182863e;

    public p0(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13561xae558fe3 activityC13561xae558fe3, java.lang.String str) {
        this.f182862d = activityC13561xae558fe3;
        this.f182863e = str;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13561xae558fe3 activityC13561xae558fe3 = this.f182862d;
        android.widget.EditText editText = activityC13561xae558fe3.f181831d;
        if (editText == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("coreEditText");
            throw null;
        }
        java.lang.String obj = editText.getText().toString();
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(obj, this.f182863e)) {
            activityC13561xae558fe3.finish();
            return true;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("change_name", obj);
        activityC13561xae558fe3.setResult(-1, intent);
        activityC13561xae558fe3.finish();
        return true;
    }
}
