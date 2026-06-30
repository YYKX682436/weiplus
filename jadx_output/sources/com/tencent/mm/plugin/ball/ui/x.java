package com.tencent.mm.plugin.ball.ui;

/* loaded from: classes14.dex */
public class x implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ball.ui.z f93372d;

    public x(com.tencent.mm.plugin.ball.ui.z zVar) {
        this.f93372d = zVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        mp1.b bVar = this.f93372d.f93374a;
        if (bVar != null) {
            bVar.a();
        }
    }
}
