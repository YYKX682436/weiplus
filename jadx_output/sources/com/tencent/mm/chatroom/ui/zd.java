package com.tencent.mm.chatroom.ui;

/* loaded from: classes8.dex */
public class zd implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.ae f64729d;

    public zd(com.tencent.mm.chatroom.ui.ae aeVar) {
        this.f64729d = aeVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f64729d.f64045d.initView();
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SelectedMemberChattingRecordUI", "initView failed, exception : " + th6.getMessage());
        }
    }
}
