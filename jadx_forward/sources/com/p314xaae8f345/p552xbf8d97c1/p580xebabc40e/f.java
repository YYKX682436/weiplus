package com.p314xaae8f345.p552xbf8d97c1.p580xebabc40e;

/* loaded from: classes13.dex */
public final class f implements com.p314xaae8f345.p552xbf8d97c1.p580xebabc40e.g {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Intent f134478a;

    /* renamed from: b, reason: collision with root package name */
    public final int f134479b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p552xbf8d97c1.p580xebabc40e.AbstractServiceC4704xa345f5bd f134480c;

    public f(com.p314xaae8f345.p552xbf8d97c1.p580xebabc40e.AbstractServiceC4704xa345f5bd abstractServiceC4704xa345f5bd, android.content.Intent intent, int i17) {
        this.f134480c = abstractServiceC4704xa345f5bd;
        this.f134478a = intent;
        this.f134479b = i17;
    }

    @Override // com.p314xaae8f345.p552xbf8d97c1.p580xebabc40e.g
    /* renamed from: complete */
    public void mo41234xdc453139() {
        this.f134480c.stopSelf(this.f134479b);
    }

    @Override // com.p314xaae8f345.p552xbf8d97c1.p580xebabc40e.g
    /* renamed from: getIntent */
    public android.content.Intent mo41235x1e885992() {
        return this.f134478a;
    }
}
