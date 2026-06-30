package com.tencent.mm.chatroom.ui;

/* loaded from: classes12.dex */
public class uc implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.SelectDelRoomManagerUI f64583d;

    public uc(com.tencent.mm.chatroom.ui.SelectDelRoomManagerUI selectDelRoomManagerUI) {
        this.f64583d = selectDelRoomManagerUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.chatroom.ui.SelectDelRoomManagerUI selectDelRoomManagerUI = this.f64583d;
        if (!selectDelRoomManagerUI.f63969v) {
            android.content.Intent intent = new android.content.Intent();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.addAll(selectDelRoomManagerUI.f63981q);
            intent.putExtra("Select_Contact", com.tencent.mm.sdk.platformtools.t8.c1(arrayList, ","));
            selectDelRoomManagerUI.setResult(-1, intent);
            selectDelRoomManagerUI.finish();
            return true;
        }
        com.tencent.mm.storage.a3 z07 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().z0(selectDelRoomManagerUI.f63979o);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.addAll(selectDelRoomManagerUI.f63981q);
        java.util.Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            java.util.Set set = c01.e2.f37117a;
            gm0.j1.i();
            com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true);
            java.lang.String w07 = !com.tencent.mm.sdk.platformtools.t8.K0(n17.w0()) ? n17.w0() : z07 != null ? z07.z0(n17.d1()) : null;
            if (com.tencent.mm.sdk.platformtools.t8.K0(w07)) {
                w07 = n17.w0();
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(w07)) {
                w07 = n17.f2();
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(w07)) {
                w07 = n17.d1();
            }
            sb6.append(w07);
            sb6.append("、");
        }
        if (sb6.length() > 0) {
            sb6.deleteCharAt(sb6.length() - 1);
        }
        db5.e1.u(selectDelRoomManagerUI, selectDelRoomManagerUI.getString(com.tencent.mm.R.string.i4d, sb6), "", new com.tencent.mm.chatroom.ui.sc(this), new com.tencent.mm.chatroom.ui.tc(this));
        return true;
    }
}
