package cr1;

/* loaded from: classes11.dex */
public final class e implements br1.w {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f303370a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ cr1.g f303371b;

    public e(java.lang.String str, cr1.g gVar) {
        this.f303370a = str;
        this.f303371b = gVar;
    }

    @Override // br1.w
    public void a(int i17) {
    }

    @Override // br1.w
    public void b(boolean z17, int i17, hr1.a aVar) {
        java.lang.String str = this.f303370a;
        if (!z17 || aVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("BizFans.BizFansAvatarInterceptor", "[loadHdBitmap] failed to get contact, isOk=" + z17 + ", tag=" + str);
            return;
        }
        vo0.d dVar = cr1.k.f303381a;
        wo0.c a17 = cr1.k.f303381a.a(new cr1.a(aVar.f66207xff000111));
        cr1.d dVar2 = new cr1.d(this.f303371b, str);
        a17.getClass();
        a17.f529406d = dVar2;
        a17.a();
    }
}
