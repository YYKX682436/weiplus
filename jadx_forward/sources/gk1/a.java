package gk1;

/* loaded from: classes4.dex */
public final class a implements com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.a {
    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.a
    public boolean a(java.lang.Object obj) {
        return obj instanceof gk1.b;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.a
    public java.lang.Object b(android.os.Parcel parcel) {
        if (parcel == null) {
            return null;
        }
        gk1.b bVar = new gk1.b();
        bVar.f69057x28d45f97 = parcel.readString();
        bVar.f69061x94d24c6d = parcel.readInt();
        bVar.f69058x119cf7dc = parcel.readInt();
        bVar.f69059xf1a1cde8 = parcel.readByte() > 0;
        bVar.f69060xead0d2ac = parcel.readString();
        return bVar;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.a
    public void c(java.lang.Object o17, android.os.Parcel parcel) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(o17, "o");
        gk1.b bVar = (gk1.b) o17;
        if (parcel == null) {
            return;
        }
        parcel.writeString(bVar.f69057x28d45f97);
        parcel.writeInt(bVar.f69061x94d24c6d);
        parcel.writeInt(bVar.f69058x119cf7dc);
        parcel.writeByte(bVar.f69059xf1a1cde8 ? (byte) 1 : (byte) 0);
        parcel.writeString(bVar.f69060xead0d2ac);
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.a
    /* renamed from: getName */
    public java.lang.String mo46195xfb82e301() {
        return gk1.a.class.getName();
    }
}
