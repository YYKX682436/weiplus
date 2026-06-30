package com.p314xaae8f345.mm.p2802xd031a825;

/* loaded from: classes14.dex */
public class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f295327d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f295328e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2802xd031a825.e f295329f;

    public c(com.p314xaae8f345.mm.p2802xd031a825.e eVar, android.view.View view, int i17) {
        this.f295329f = eVar;
        this.f295327d = view;
        this.f295328e = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f295329f.a(this.f295327d, this.f295328e);
    }
}
