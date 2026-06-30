package com.tencent.matrix.lifecycle.supervisor;

/* loaded from: classes12.dex */
public final class e0 implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel src) {
        kotlin.jvm.internal.o.g(src, "src");
        return new com.tencent.matrix.lifecycle.supervisor.ProcessToken(src);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.matrix.lifecycle.supervisor.ProcessToken[i17];
    }
}
