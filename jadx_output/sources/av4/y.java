package av4;

/* loaded from: classes.dex */
public final class y implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        return new com.tencent.mm.plugin.websearch.jsapi.OpenWXSearchHalfPageJSApi$RequestParams(parcel.readInt(), parcel.readInt());
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.websearch.jsapi.OpenWXSearchHalfPageJSApi$RequestParams[i17];
    }
}
