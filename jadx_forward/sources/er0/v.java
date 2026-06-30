package er0;

/* loaded from: classes12.dex */
public final class v extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p849xbf8d97c1.p850xec41ae0d.p851x3bc562.acc.C10875xc0cf956c f337527d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f337528e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(com.p314xaae8f345.mm.p849xbf8d97c1.p850xec41ae0d.p851x3bc562.acc.C10875xc0cf956c c10875xc0cf956c, java.lang.String str) {
        super(0);
        this.f337527d = c10875xc0cf956c;
        this.f337528e = str;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.util.Map m40827x8f8c4694;
        com.p314xaae8f345.mm.p849xbf8d97c1.p850xec41ae0d.p851x3bc562.acc.C10875xc0cf956c c10875xc0cf956c = this.f337527d;
        m40827x8f8c4694 = c10875xc0cf956c.m40827x8f8c4694(c10875xc0cf956c.m46726xbbf94a17());
        java.util.Map<java.lang.String, java.lang.Integer> m46726xbbf94a17 = c10875xc0cf956c.m46726xbbf94a17();
        java.lang.String str = this.f337528e;
        java.lang.Integer num = m46726xbbf94a17.get(str);
        if (num == null) {
            num = 0;
        }
        m40827x8f8c4694.put(str, java.lang.Integer.valueOf(num.intValue() + 1));
        return jz5.f0.f384359a;
    }
}
