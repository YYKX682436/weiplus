package com.tencent.matrix.lifecycle.supervisor;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/matrix/lifecycle/supervisor/ProcessToken;", "Landroid/os/Parcelable;", "matrix-android-lib_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes12.dex */
public final class ProcessToken implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.matrix.lifecycle.supervisor.ProcessToken> CREATOR = new com.tencent.matrix.lifecycle.supervisor.e0();

    /* renamed from: d, reason: collision with root package name */
    public final android.os.IBinder f52791d;

    /* renamed from: e, reason: collision with root package name */
    public final int f52792e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f52793f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f52794g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f52795h;

    public ProcessToken(int i17, java.lang.String processName, java.lang.String statefulName, boolean z17) {
        kotlin.jvm.internal.o.g(processName, "processName");
        kotlin.jvm.internal.o.g(statefulName, "statefulName");
        this.f52791d = new android.os.Binder();
        this.f52792e = i17;
        this.f52793f = processName;
        this.f52794g = statefulName;
        this.f52795h = z17;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == null || !(obj instanceof com.tencent.matrix.lifecycle.supervisor.ProcessToken)) {
            return false;
        }
        com.tencent.matrix.lifecycle.supervisor.ProcessToken processToken = (com.tencent.matrix.lifecycle.supervisor.ProcessToken) obj;
        return kotlin.jvm.internal.o.b(this.f52793f, processToken.f52793f) && this.f52792e == processToken.f52792e;
    }

    public int hashCode() {
        return (this.f52792e * 31) + this.f52793f.hashCode();
    }

    public java.lang.String toString() {
        return "ProcessToken(pid=" + this.f52792e + ", name='" + this.f52793f + "', statefulName = " + this.f52794g + ", state = " + this.f52795h + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel dest, int i17) {
        kotlin.jvm.internal.o.g(dest, "dest");
        dest.writeStrongBinder(this.f52791d);
        dest.writeInt(this.f52792e);
        dest.writeString(this.f52793f);
        dest.writeString(this.f52794g);
        dest.writeInt(this.f52795h ? 1 : 0);
    }

    public ProcessToken(android.os.Parcel src) {
        kotlin.jvm.internal.o.g(src, "src");
        android.os.IBinder readStrongBinder = src.readStrongBinder();
        kotlin.jvm.internal.o.f(readStrongBinder, "src.readStrongBinder()");
        this.f52791d = readStrongBinder;
        this.f52792e = src.readInt();
        java.lang.String readString = src.readString();
        this.f52793f = readString == null ? "" : readString;
        java.lang.String readString2 = src.readString();
        this.f52794g = readString2 != null ? readString2 : "";
        this.f52795h = src.readInt() != 0;
    }
}
