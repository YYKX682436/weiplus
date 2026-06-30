package com.tencent.mm.chatroom.ui;

/* loaded from: classes11.dex */
public class j2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.k2 f64245d;

    public j2(com.tencent.mm.chatroom.ui.k2 k2Var) {
        this.f64245d = k2Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.chatroom.ui.k2 k2Var = this.f64245d;
        if (k2Var.f64268d.f63747e.getCount() == 0) {
            k2Var.f64268d.finish();
        }
    }
}
