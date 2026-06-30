package ht5;

/* loaded from: classes13.dex */
public final class b extends com.qq.taf.jce.AbstractC2861x7aec4921 {

    /* renamed from: d, reason: collision with root package name */
    public int f366504d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f366505e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f366506f = 0;

    @Override // com.qq.taf.jce.AbstractC2861x7aec4921
    /* renamed from: readFrom */
    public void mo21234xcc442a60(com.qq.taf.jce.C2859xe10ac61e c2859xe10ac61e) {
        this.f366504d = c2859xe10ac61e.m21299x355996(this.f366504d, 1, true);
        this.f366505e = c2859xe10ac61e.m21299x355996(this.f366505e, 2, true);
        this.f366506f = c2859xe10ac61e.m21299x355996(this.f366506f, 3, true);
    }

    @Override // com.qq.taf.jce.AbstractC2861x7aec4921
    /* renamed from: writeTo */
    public void mo21235x5f8be6ba(com.qq.taf.jce.C2860x6de9642d c2860x6de9642d) {
        c2860x6de9642d.m21338x6c257df(this.f366504d, 1);
        c2860x6de9642d.m21338x6c257df(this.f366505e, 2);
        c2860x6de9642d.m21338x6c257df(this.f366506f, 3);
    }
}
