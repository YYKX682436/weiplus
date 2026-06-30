package com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f;

/* loaded from: classes7.dex */
public class b implements com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.a {
    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.a
    public boolean a(java.lang.Object obj) {
        return obj instanceof nk0.a;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.a
    public java.lang.Object b(android.os.Parcel parcel) {
        java.lang.String readString = parcel.readString();
        android.os.Bundle readBundle = parcel.readBundle();
        java.util.Map map = com.p314xaae8f345.mm.p794xb0fa9b5e.v0.f149941a;
        nk0.a aVar = (nk0.a) qk0.c.d(readString, nk0.a.class);
        if (aVar == null) {
            return null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.C13010xa1fd27c4 c13010xa1fd27c4 = (com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.C13010xa1fd27c4) aVar;
        if (readBundle != null) {
            c13010xa1fd27c4.f175714d = readBundle.getStringArray("hosts");
        }
        return aVar;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.a
    public void c(java.lang.Object obj, android.os.Parcel parcel) {
        nk0.a aVar = (nk0.a) obj;
        parcel.writeString(aVar.getClass().getName());
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putStringArray("hosts", ((com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.C13010xa1fd27c4) aVar).f175714d);
        parcel.writeBundle(bundle);
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.a
    /* renamed from: getName */
    public java.lang.String mo46195xfb82e301() {
        return com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.b.class.getName();
    }
}
