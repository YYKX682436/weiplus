package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes11.dex */
public final class op implements d90.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ cf5.b f281190a;

    public op(cf5.b bVar) {
        this.f281190a = bVar;
    }

    @Override // d90.j
    public void a(java.util.ArrayList contentList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contentList, "contentList");
        try {
            this.f281190a.a(contentList);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WeClawStream.ChattingComponent", th6, "Failed to append text in stream parse", new java.lang.Object[0]);
            throw th6;
        }
    }

    @Override // d90.j
    public void b() {
    }
}
