package bm5;

/* loaded from: classes13.dex */
public class m0 extends android.os.Binder {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.util.HotpotService f22704d;

    public m0(com.tencent.mm.util.HotpotService hotpotService) {
        this.f22704d = hotpotService;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i17, android.os.Parcel parcel, android.os.Parcel parcel2, int i18) {
        if (i17 != 1) {
            return super.onTransact(i17, parcel, parcel2, i18);
        }
        int readInt = parcel.readInt();
        com.tencent.mm.util.HotpotService hotpotService = this.f22704d;
        android.os.Bundle bundle = (android.os.Bundle) parcel.readParcelable(hotpotService.getClassLoader());
        android.os.Bundle bundle2 = new android.os.Bundle();
        try {
            hotpotService.b(readInt, bundle, bundle2);
            parcel2.writeInt(0);
            parcel2.writeParcelable(bundle2, 0);
        } catch (java.lang.Throwable th6) {
            parcel2.writeInt(1);
            parcel2.writeSerializable(new bm5.q0(th6));
        }
        return true;
    }
}
