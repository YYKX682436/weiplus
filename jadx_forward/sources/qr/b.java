package qr;

/* loaded from: classes9.dex */
public final class b extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f447534d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f447535e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f447536f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(long j17, boolean z17, java.lang.String str) {
        super(0);
        this.f447534d = j17;
        this.f447535e = z17;
        this.f447536f = str;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.util.HashMap hashMap = qr.e.f447542b;
        long j17 = this.f447534d;
        java.util.HashSet hashSet = (java.util.HashSet) hashMap.get(java.lang.Long.valueOf(j17));
        if (hashSet != null) {
            java.util.Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ((qr.a) it.next()).a(j17, this.f447535e, this.f447536f);
            }
        }
        return jz5.f0.f384359a;
    }
}
