package com.p314xaae8f345.mm.ui;

/* loaded from: classes11.dex */
public class ha implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f290318d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s75.b f290319e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.ga f290320f;

    public ha(com.p314xaae8f345.mm.ui.ga gaVar, boolean z17, s75.b bVar) {
        this.f290320f = gaVar;
        this.f290318d = z17;
        this.f290319e = bVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17 = com.p314xaae8f345.mm.ui.ga.f290161v0;
        com.p314xaae8f345.mm.ui.ga gaVar = this.f290320f;
        boolean z18 = this.f290318d;
        if (!z17 && z18) {
            db5.m9.a(z18, new android.content.Intent().putExtra("classname", gaVar.v()).putExtra("main_process", false));
            return;
        }
        db5.m9.a(z18, new android.content.Intent().putExtra("classname", gaVar.v() + this.f290319e));
    }
}
