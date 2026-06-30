package com.p176xb6135e39.p177xcca8366f.p268xc9fa65a8.p269xa785d61b.p270xaf12f3cb;

/* renamed from: com.google.android.search.verification.client.SearchActionVerificationClientService */
/* loaded from: classes8.dex */
public abstract class AbstractIntentServiceC2731xa719591 extends android.app.IntentService {

    /* renamed from: d, reason: collision with root package name */
    public final boolean f126165d;

    /* renamed from: e, reason: collision with root package name */
    public final long f126166e;

    /* renamed from: f, reason: collision with root package name */
    public final android.content.Intent f126167f;

    /* renamed from: g, reason: collision with root package name */
    public ta.a f126168g;

    /* renamed from: h, reason: collision with root package name */
    public sa.c f126169h;

    public AbstractIntentServiceC2731xa719591() {
        super("SearchActionVerificationClientService");
        this.f126167f = new android.content.Intent("com.google.android.googlequicksearchbox.SEARCH_ACTION_VERIFICATION_SERVICE").setPackage("com.google.android.googlequicksearchbox");
        this.f126169h = null;
        this.f126165d = !"user".equals(android.os.Build.TYPE);
        this.f126166e = 1000L;
    }

    public abstract boolean a(android.content.Intent intent, boolean z17, android.os.Bundle bundle);

    @Override // android.app.IntentService, android.app.Service
    public final void onCreate() {
        super.onCreate();
        ta.a aVar = new ta.a(this);
        this.f126168g = aVar;
        bindService(this.f126167f, aVar, 1);
    }

    @Override // android.app.IntentService, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        unbindService(this.f126168g);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x004f  */
    @Override // android.app.IntentService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onHandleIntent(android.content.Intent r14) {
        /*
            Method dump skipped, instructions count: 337
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p176xb6135e39.p177xcca8366f.p268xc9fa65a8.p269xa785d61b.p270xaf12f3cb.AbstractIntentServiceC2731xa719591.onHandleIntent(android.content.Intent):void");
    }
}
