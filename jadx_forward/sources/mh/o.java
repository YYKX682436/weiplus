package mh;

/* loaded from: classes12.dex */
public final class o extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.os.Parcel f407807d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.AbstractC4629x1dfec73e f407808e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(android.os.Parcel parcel, com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.AbstractC4629x1dfec73e abstractC4629x1dfec73e) {
        super(0);
        this.f407807d = parcel;
        this.f407808e = abstractC4629x1dfec73e;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.os.Parcel parcel = this.f407807d;
        com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.AbstractC4629x1dfec73e abstractC4629x1dfec73e = this.f407808e;
        try {
            int readInt = parcel.readInt();
            if (readInt == com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.AbstractC4629x1dfec73e.m40825x94b41ff8(abstractC4629x1dfec73e)) {
                com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.a.f134086a.j(abstractC4629x1dfec73e, parcel);
                abstractC4629x1dfec73e.m40839x8292b43a(true);
            } else {
                abstractC4629x1dfec73e.m40840xfe260e64(false);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.proc.FlattParcelable", "ver mismatch, get=" + readInt + ", expected=" + com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.AbstractC4629x1dfec73e.m40825x94b41ff8(abstractC4629x1dfec73e));
            }
            return jz5.f0.f384359a;
        } catch (java.lang.Throwable th6) {
            throw new java.io.IOException("readFromParcel err: " + th6.getMessage());
        }
    }
}
