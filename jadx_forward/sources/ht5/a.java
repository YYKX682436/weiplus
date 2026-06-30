package ht5;

/* loaded from: classes13.dex */
public final class a extends com.qq.taf.jce.AbstractC2861x7aec4921 {

    /* renamed from: d, reason: collision with root package name */
    public int f366502d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f366503e = 0;

    @Override // com.qq.taf.jce.AbstractC2861x7aec4921
    /* renamed from: readFrom */
    public void mo21234xcc442a60(com.qq.taf.jce.C2859xe10ac61e c2859xe10ac61e) {
        this.f366502d = c2859xe10ac61e.m21299x355996(this.f366502d, 0, true);
        this.f366503e = c2859xe10ac61e.m21299x355996(this.f366503e, 1, false);
    }

    @Override // com.qq.taf.jce.AbstractC2861x7aec4921
    /* renamed from: writeTo */
    public void mo21235x5f8be6ba(com.qq.taf.jce.C2860x6de9642d c2860x6de9642d) {
        c2860x6de9642d.m21338x6c257df(this.f366502d, 0);
        c2860x6de9642d.m21338x6c257df(this.f366503e, 1);
    }
}
