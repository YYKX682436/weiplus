package kf4;

/* loaded from: classes4.dex */
public final class k extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f389012d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f389013e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f389014f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f389015g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(long j17, boolean z17, java.lang.String str, java.lang.String str2) {
        super(0);
        this.f389012d = j17;
        this.f389013e = z17;
        this.f389014f = str;
        this.f389015g = str2;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        nf4.l i17 = ef4.w.f334001t.i();
        long j17 = this.f389012d;
        i17.L0(j17);
        kf4.o oVar = kf4.o.f389017d;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("new comment in ");
        sb6.append(j17);
        sb6.append(", isUnread:");
        sb6.append(this.f389013e);
        sb6.append(", storyOwner:");
        java.lang.String str = this.f389014f;
        sb6.append(str);
        sb6.append(", fromUser:");
        sb6.append(this.f389015g);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactSyncFetcher", sb6.toString());
        bf4.b bVar = bf4.b.f101229b;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactSyncFetcher", "filterStory false");
        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(kf4.o.f389019f.get(str));
        return jz5.f0.f384359a;
    }
}
