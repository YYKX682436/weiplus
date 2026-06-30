package com.tencent.mm.chatroom.ui;

/* loaded from: classes11.dex */
public class a9 implements c01.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.ProgressDialog f64034d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.RoomInfoDetailUI f64035e;

    public a9(com.tencent.mm.chatroom.ui.RoomInfoDetailUI roomInfoDetailUI, android.app.ProgressDialog progressDialog) {
        this.f64035e = roomInfoDetailUI;
        this.f64034d = progressDialog;
    }

    @Override // c01.da
    public boolean a() {
        return this.f64035e.f63853q;
    }

    @Override // c01.da
    public void c() {
        android.app.ProgressDialog progressDialog = this.f64034d;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
    }
}
