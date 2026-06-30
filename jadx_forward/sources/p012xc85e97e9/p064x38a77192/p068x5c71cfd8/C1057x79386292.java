package p012xc85e97e9.p064x38a77192.p068x5c71cfd8;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/runtime/ParcelableSnapshotMutableState;", p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f2960xe17f46c3, "Ln0/q4;", "Landroid/os/Parcelable;", "runtime_release"}, k = 1, mv = {1, 6, 0})
/* renamed from: androidx.compose.runtime.ParcelableSnapshotMutableState */
/* loaded from: classes14.dex */
public final class C1057x79386292<T> extends n0.q4 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<p012xc85e97e9.p064x38a77192.p068x5c71cfd8.C1057x79386292<java.lang.Object>> f2644x681a0c0c = new n0.z2();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1057x79386292(java.lang.Object obj, n0.r4 policy) {
        super(obj, policy);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(policy, "policy");
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        int i18;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parcel, "parcel");
        parcel.writeValue(mo128745x754a37bb());
        n0.w2 w2Var = n0.w2.f415272a;
        n0.r4 r4Var = this.f415221d;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r4Var, w2Var)) {
            i18 = 0;
        } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r4Var, n0.h5.f415062a)) {
            i18 = 1;
        } else {
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r4Var, n0.c4.f415007a)) {
                throw new java.lang.IllegalStateException("Only known types of MutableState's SnapshotMutationPolicy are supported");
            }
            i18 = 2;
        }
        parcel.writeInt(i18);
    }
}
