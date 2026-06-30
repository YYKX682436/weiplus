package com.tencent.mm.chatroom.ui;

/* loaded from: classes11.dex */
public class w8 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.z8 f64621d;

    public w8(com.tencent.mm.chatroom.ui.z8 z8Var) {
        this.f64621d = z8Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        this.f64621d.f64722a.f63853q = true;
    }
}
