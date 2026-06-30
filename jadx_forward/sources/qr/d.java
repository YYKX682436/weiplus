package qr;

/* loaded from: classes9.dex */
public final class d extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f447539d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qr.a f447540e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(long j17, qr.a aVar) {
        super(0);
        this.f447539d = j17;
        this.f447540e = aVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.util.HashMap hashMap = qr.e.f447542b;
        long j17 = this.f447539d;
        java.util.HashSet hashSet = (java.util.HashSet) hashMap.get(java.lang.Long.valueOf(j17));
        if (hashSet != null) {
            hashSet.remove(this.f447540e);
            if (hashSet.isEmpty()) {
                hashMap.remove(java.lang.Long.valueOf(j17));
            }
        }
        return jz5.f0.f384359a;
    }
}
