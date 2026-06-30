package com.tencent.mm.chatroom.ui;

/* loaded from: classes8.dex */
public class f1 implements c01.o8 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f64145a;

    public f1(java.lang.String str) {
        this.f64145a = str;
    }

    @Override // c01.o8
    public void a(java.lang.String str, boolean z17) {
        if (z17 && this.f64145a.equals(str)) {
            gm0.j1.e().j(new com.tencent.mm.chatroom.ui.e1(this, str));
        }
    }
}
