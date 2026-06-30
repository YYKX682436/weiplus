package rg1;

/* loaded from: classes7.dex */
public final class a extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sg1.e f476737d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f476738e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(sg1.e eVar, boolean z17) {
        super(0);
        this.f476737d = eVar;
        this.f476738e = z17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("WxaPkg path from OpenSdk accepted appId[");
        sg1.e eVar = this.f476737d;
        sb6.append(eVar.f469606d);
        sb6.append("] key[");
        sb6.append(eVar.f469607e);
        sb6.append("] type[");
        sb6.append(eVar.f469608f);
        sb6.append("] version[");
        sb6.append(eVar.f469609g);
        sb6.append("] zstd?[");
        sb6.append(this.f476738e);
        sb6.append(']');
        dp.a.m125854x26a183b(context, sb6.toString(), 0).show();
        return jz5.f0.f384359a;
    }
}
