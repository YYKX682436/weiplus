package fx4;

/* loaded from: classes11.dex */
public final class h implements com.p314xaae8f345.p3133xd0ce8b26.iam.biz.m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ fx4.a f348687a;

    public h(fx4.a aVar) {
        this.f348687a = aVar;
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.iam.biz.m
    public final void a(com.p314xaae8f345.p3133xd0ce8b26.iam.biz.k kVar) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getSpecialPlayListAsync result ");
        sb6.append(kVar != null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AudioPlayLaterHelper", sb6.toString());
        fx4.j.f348689a = kVar;
        fx4.a aVar = this.f348687a;
        if (kVar != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(kVar);
            kVar.b(new fx4.g(aVar));
        } else if (aVar != null) {
            aVar.a(true);
        }
    }
}
