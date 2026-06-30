package qr;

/* loaded from: classes9.dex */
public final class c extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f447537d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qr.a f447538e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(long j17, qr.a aVar) {
        super(0);
        this.f447537d = j17;
        this.f447538e = aVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.util.HashMap hashMap = qr.e.f447542b;
        long j17 = this.f447537d;
        java.util.HashSet hashSet = (java.util.HashSet) hashMap.get(java.lang.Long.valueOf(j17));
        if (hashSet == null) {
            hashSet = new java.util.HashSet();
            hashMap.put(java.lang.Long.valueOf(j17), hashSet);
        }
        hashSet.add(this.f447538e);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiCaptureCallbackDispatcher", "registerCallback: " + hashSet.size());
        return jz5.f0.f384359a;
    }
}
