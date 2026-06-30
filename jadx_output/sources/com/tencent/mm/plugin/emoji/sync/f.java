package com.tencent.mm.plugin.emoji.sync;

/* loaded from: classes12.dex */
public class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emoji.sync.k f97623d;

    public f(com.tencent.mm.plugin.emoji.sync.k kVar) {
        this.f97623d = kVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.emoji.sync.k kVar = this.f97623d;
        kVar.getClass();
        if (kVar.f97631b || kVar.f97632c) {
            kVar.f();
        }
    }
}
