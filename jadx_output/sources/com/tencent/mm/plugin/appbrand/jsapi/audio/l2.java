package com.tencent.mm.plugin.appbrand.jsapi.audio;

/* loaded from: classes7.dex */
public final class l2 implements android.os.Parcelable.Creator {
    public l2(kotlin.jvm.internal.i iVar) {
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        return new com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiSetTingAudioState$SetTingAudioListenerTask(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiSetTingAudioState$SetTingAudioListenerTask[i17];
    }
}
