package com.tencent.mm.plugin.appbrand.jsapi.audio;

/* loaded from: classes7.dex */
public class x1 implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiPausePlayVoice$PausePlayVoice jsApiPausePlayVoice$PausePlayVoice = new com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiPausePlayVoice$PausePlayVoice();
        jsApiPausePlayVoice$PausePlayVoice.v(parcel);
        return jsApiPausePlayVoice$PausePlayVoice;
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiPausePlayVoice$PausePlayVoice[i17];
    }
}
