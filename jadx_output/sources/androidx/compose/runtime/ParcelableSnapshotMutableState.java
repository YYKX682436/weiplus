package androidx.compose.runtime;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/runtime/ParcelableSnapshotMutableState;", androidx.exifinterface.media.ExifInterface.GPS_DIRECTION_TRUE, "Ln0/q4;", "Landroid/os/Parcelable;", "runtime_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes14.dex */
public final class ParcelableSnapshotMutableState<T> extends n0.q4 implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<androidx.compose.runtime.ParcelableSnapshotMutableState<java.lang.Object>> CREATOR = new n0.z2();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ParcelableSnapshotMutableState(java.lang.Object obj, n0.r4 policy) {
        super(obj, policy);
        kotlin.jvm.internal.o.g(policy, "policy");
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        int i18;
        kotlin.jvm.internal.o.g(parcel, "parcel");
        parcel.writeValue(getValue());
        n0.w2 w2Var = n0.w2.f333739a;
        n0.r4 r4Var = this.f333688d;
        if (kotlin.jvm.internal.o.b(r4Var, w2Var)) {
            i18 = 0;
        } else if (kotlin.jvm.internal.o.b(r4Var, n0.h5.f333529a)) {
            i18 = 1;
        } else {
            if (!kotlin.jvm.internal.o.b(r4Var, n0.c4.f333474a)) {
                throw new java.lang.IllegalStateException("Only known types of MutableState's SnapshotMutationPolicy are supported");
            }
            i18 = 2;
        }
        parcel.writeInt(i18);
    }
}
