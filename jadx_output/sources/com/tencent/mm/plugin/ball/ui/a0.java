package com.tencent.mm.plugin.ball.ui;

/* loaded from: classes14.dex */
public class a0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mp1.b f93277d;

    public a0(mp1.b bVar) {
        this.f93277d = bVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        mp1.b bVar = this.f93277d;
        if (bVar != null) {
            bVar.a();
        }
    }
}
