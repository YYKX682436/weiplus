package com.tencent.mm.advertise.cgi;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/advertise/cgi/MagicAdIPCCgiCallbackData;", "Landroid/os/Parcelable;", "ad-impl_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final /* data */ class MagicAdIPCCgiCallbackData implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.advertise.cgi.MagicAdIPCCgiCallbackData> CREATOR = new yj.i();

    /* renamed from: d, reason: collision with root package name */
    public final boolean f53148d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f53149e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.Integer f53150f;

    public MagicAdIPCCgiCallbackData(boolean z17, byte[] bArr, java.lang.Integer num) {
        this.f53148d = z17;
        this.f53149e = bArr;
        this.f53150f = num;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!kotlin.jvm.internal.o.b(com.tencent.mm.advertise.cgi.MagicAdIPCCgiCallbackData.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.advertise.cgi.MagicAdIPCCgiCallbackData");
        com.tencent.mm.advertise.cgi.MagicAdIPCCgiCallbackData magicAdIPCCgiCallbackData = (com.tencent.mm.advertise.cgi.MagicAdIPCCgiCallbackData) obj;
        if (this.f53148d != magicAdIPCCgiCallbackData.f53148d || !kotlin.jvm.internal.o.b(this.f53150f, magicAdIPCCgiCallbackData.f53150f)) {
            return false;
        }
        byte[] bArr = magicAdIPCCgiCallbackData.f53149e;
        byte[] bArr2 = this.f53149e;
        if (bArr2 != null) {
            if (bArr == null || !java.util.Arrays.equals(bArr2, bArr)) {
                return false;
            }
        } else if (bArr != null) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode = java.lang.Boolean.hashCode(this.f53148d) * 31;
        java.lang.Integer num = this.f53150f;
        int intValue = (hashCode + (num != null ? num.intValue() : 0)) * 31;
        byte[] bArr = this.f53149e;
        return intValue + (bArr != null ? java.util.Arrays.hashCode(bArr) : 0);
    }

    public java.lang.String toString() {
        return "MagicAdIPCCgiCallbackData(success=" + this.f53148d + ", adsResult=" + java.util.Arrays.toString(this.f53149e) + ", errCode=" + this.f53150f + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        int intValue;
        kotlin.jvm.internal.o.g(out, "out");
        out.writeInt(this.f53148d ? 1 : 0);
        out.writeByteArray(this.f53149e);
        java.lang.Integer num = this.f53150f;
        if (num == null) {
            intValue = 0;
        } else {
            out.writeInt(1);
            intValue = num.intValue();
        }
        out.writeInt(intValue);
    }

    public /* synthetic */ MagicAdIPCCgiCallbackData(boolean z17, byte[] bArr, java.lang.Integer num, int i17, kotlin.jvm.internal.i iVar) {
        this((i17 & 1) != 0 ? true : z17, (i17 & 2) != 0 ? null : bArr, (i17 & 4) != 0 ? null : num);
    }
}
