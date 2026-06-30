package bm5;

/* loaded from: classes13.dex */
public class m0 extends android.os.Binder {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2770x36f002.AbstractServiceC22729xf7d3da8d f104237d;

    public m0(com.p314xaae8f345.mm.p2770x36f002.AbstractServiceC22729xf7d3da8d abstractServiceC22729xf7d3da8d) {
        this.f104237d = abstractServiceC22729xf7d3da8d;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i17, android.os.Parcel parcel, android.os.Parcel parcel2, int i18) {
        if (i17 != 1) {
            return super.onTransact(i17, parcel, parcel2, i18);
        }
        int readInt = parcel.readInt();
        com.p314xaae8f345.mm.p2770x36f002.AbstractServiceC22729xf7d3da8d abstractServiceC22729xf7d3da8d = this.f104237d;
        android.os.Bundle bundle = (android.os.Bundle) parcel.readParcelable(abstractServiceC22729xf7d3da8d.getClassLoader());
        android.os.Bundle bundle2 = new android.os.Bundle();
        try {
            abstractServiceC22729xf7d3da8d.b(readInt, bundle, bundle2);
            parcel2.writeInt(0);
            parcel2.writeParcelable(bundle2, 0);
        } catch (java.lang.Throwable th6) {
            parcel2.writeInt(1);
            parcel2.writeSerializable(new bm5.q0(th6));
        }
        return true;
    }
}
