package mh;

/* loaded from: classes12.dex */
public final class p extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.os.Parcel f407809d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.AbstractC4629x1dfec73e f407810e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f407811f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(android.os.Parcel parcel, com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.AbstractC4629x1dfec73e abstractC4629x1dfec73e, int i17) {
        super(0);
        this.f407809d = parcel;
        this.f407810e = abstractC4629x1dfec73e;
        this.f407811f = i17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.AbstractC4629x1dfec73e abstractC4629x1dfec73e = this.f407810e;
        android.os.Parcel parcel = this.f407809d;
        try {
            parcel.writeInt(com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.AbstractC4629x1dfec73e.m40825x94b41ff8(abstractC4629x1dfec73e));
            com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.a.f134086a.k(abstractC4629x1dfec73e, parcel, this.f407811f);
            return jz5.f0.f384359a;
        } catch (java.lang.Throwable th6) {
            throw new java.io.IOException("writeToParcel err: " + th6.getMessage());
        }
    }
}
