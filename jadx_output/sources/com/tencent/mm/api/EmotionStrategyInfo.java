package com.tencent.mm.api;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/api/EmotionStrategyInfo;", "Landroid/os/Parcelable;", "emojisdk-lib_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final /* data */ class EmotionStrategyInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.api.EmotionStrategyInfo> CREATOR = new qk.f0();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f53201d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f53202e;

    public EmotionStrategyInfo(java.lang.String md52, java.lang.String queryWording) {
        kotlin.jvm.internal.o.g(md52, "md5");
        kotlin.jvm.internal.o.g(queryWording, "queryWording");
        this.f53201d = md52;
        this.f53202e = queryWording;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.api.EmotionStrategyInfo)) {
            return false;
        }
        com.tencent.mm.api.EmotionStrategyInfo emotionStrategyInfo = (com.tencent.mm.api.EmotionStrategyInfo) obj;
        return kotlin.jvm.internal.o.b(this.f53201d, emotionStrategyInfo.f53201d) && kotlin.jvm.internal.o.b(this.f53202e, emotionStrategyInfo.f53202e);
    }

    public int hashCode() {
        return (this.f53201d.hashCode() * 31) + this.f53202e.hashCode();
    }

    public java.lang.String toString() {
        return "EmotionStrategyInfo(md5=" + this.f53201d + ", queryWording=" + this.f53202e + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeString(this.f53201d);
        out.writeString(this.f53202e);
    }
}
