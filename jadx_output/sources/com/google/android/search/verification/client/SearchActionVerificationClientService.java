package com.google.android.search.verification.client;

/* loaded from: classes8.dex */
public abstract class SearchActionVerificationClientService extends android.app.IntentService {

    /* renamed from: d, reason: collision with root package name */
    public final boolean f44632d;

    /* renamed from: e, reason: collision with root package name */
    public final long f44633e;

    /* renamed from: f, reason: collision with root package name */
    public final android.content.Intent f44634f;

    /* renamed from: g, reason: collision with root package name */
    public ta.a f44635g;

    /* renamed from: h, reason: collision with root package name */
    public sa.c f44636h;

    public SearchActionVerificationClientService() {
        super("SearchActionVerificationClientService");
        this.f44634f = new android.content.Intent("com.google.android.googlequicksearchbox.SEARCH_ACTION_VERIFICATION_SERVICE").setPackage("com.google.android.googlequicksearchbox");
        this.f44636h = null;
        this.f44632d = !"user".equals(android.os.Build.TYPE);
        this.f44633e = 1000L;
    }

    public abstract boolean a(android.content.Intent intent, boolean z17, android.os.Bundle bundle);

    @Override // android.app.IntentService, android.app.Service
    public final void onCreate() {
        super.onCreate();
        ta.a aVar = new ta.a(this);
        this.f44635g = aVar;
        bindService(this.f44634f, aVar, 1);
    }

    @Override // android.app.IntentService, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        unbindService(this.f44635g);
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.search.verification.client.SearchActionVerificationClientService.onHandleIntent(android.content.Intent):void");
    }
}
