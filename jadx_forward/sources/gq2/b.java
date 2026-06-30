package gq2;

/* loaded from: classes2.dex */
public final class b extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f356080d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gq2.d f356081e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(int i17, gq2.d dVar) {
        super(0);
        this.f356080d = i17;
        this.f356081e = dVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        oa.i k17;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onStreamTabChange position: ");
        int i17 = this.f356080d;
        sb6.append(i17);
        sb6.append(" tabLayout: ");
        gq2.d dVar = this.f356081e;
        sb6.append(dVar.f356086d);
        sb6.append(' ');
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveTabListConvert", sb6.toString());
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff c2718xca2902ff = dVar.f356086d;
        if (c2718xca2902ff != null && (k17 = c2718xca2902ff.k(i17)) != null && !k17.a()) {
            k17.b();
        }
        return jz5.f0.f384359a;
    }
}
