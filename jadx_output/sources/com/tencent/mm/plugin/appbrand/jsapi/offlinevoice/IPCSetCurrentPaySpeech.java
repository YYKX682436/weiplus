package com.tencent.mm.plugin.appbrand.jsapi.offlinevoice;

/* loaded from: classes7.dex */
public class IPCSetCurrentPaySpeech implements com.tencent.mm.ipcinvoker.i<com.tencent.mm.plugin.appbrand.jsapi.offlinevoice.IPCSetCurrentPaySpeech.IPCSetCurrentPaySpeechParam, android.os.Bundle> {
    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        java.lang.String str;
        com.tencent.mm.plugin.appbrand.jsapi.offlinevoice.IPCSetCurrentPaySpeech.IPCSetCurrentPaySpeechParam iPCSetCurrentPaySpeechParam = (com.tencent.mm.plugin.appbrand.jsapi.offlinevoice.IPCSetCurrentPaySpeech.IPCSetCurrentPaySpeechParam) obj;
        android.os.Bundle bundle = new android.os.Bundle();
        if (com.tencent.mm.sdk.platformtools.t8.K0(iPCSetCurrentPaySpeechParam.f82467d)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.OfflineVoice.IPCSetCurrentPaySpeech", "fail:dialectPackId is null");
            if (rVar != null) {
                bundle.putString("IPCResultInfo", "fail:dialectPackId is null");
                rVar.a(bundle);
                return;
            }
            return;
        }
        boolean z17 = iPCSetCurrentPaySpeechParam.f82470g;
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z17);
        java.lang.String str2 = iPCSetCurrentPaySpeechParam.f82467d;
        java.lang.String str3 = iPCSetCurrentPaySpeechParam.f82471h;
        java.lang.String str4 = iPCSetCurrentPaySpeechParam.f82469f;
        java.lang.String str5 = iPCSetCurrentPaySpeechParam.f82472i;
        com.tencent.mars.xlog.Log.i("MicroMsg.OfflineVoice.IPCSetCurrentPaySpeech", "data.dialectPackId: %s,data.md5Sum:%s ,data.tempFileAbsolutePath :%s ,data.isOnlyDownload:%s ，data.version: %s", str2, str3, str4, valueOf, str5);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str4)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.OfflineVoice.IPCSetCurrentPaySpeech", "tempFileAbsolutePath == null");
        } else {
            if (com.tencent.mm.sdk.platformtools.t8.K0(str3) || !str3.equalsIgnoreCase(com.tencent.mm.vfs.w6.p(str4))) {
                com.tencent.mars.xlog.Log.e("MicroMsg.OfflineVoice.IPCSetCurrentPaySpeech", "fail:md5Sum:%s", java.lang.Boolean.valueOf(com.tencent.mm.sdk.platformtools.t8.K0(str3)));
                if (rVar != null) {
                    bundle.putString("IPCResultInfo", "fail:md5Sum is null or md5Sum is not euqal tempFileAbsolutePath MD5");
                    rVar.a(bundle);
                    return;
                }
                return;
            }
            java.lang.String str6 = kd1.e.f306701c;
            com.tencent.mm.vfs.w6.u(str6);
            java.lang.String str7 = str6 + str2 + ".pos";
            if (com.tencent.mm.vfs.w6.j(str7)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.OfflineVoice.IPCSetCurrentPaySpeech", " has this voice resource file before ，first delete exist file");
                com.tencent.mm.vfs.w6.h(str7);
            }
            com.tencent.mm.vfs.w6.c(str4, str7);
            kd1.e.b().e(str2, str7, str3, str5);
            com.tencent.mars.xlog.Log.i("MicroMsg.OfflineVoice.IPCSetCurrentPaySpeech", "copyFile to %s %s", str7, str3);
        }
        boolean z18 = false;
        if (z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.OfflineVoice.IPCSetCurrentPaySpeech", "isOnlyDownload:%s", java.lang.Boolean.valueOf(z17));
            str = "isOnlyDownload is true, dont reset source";
        } else if (!com.tencent.mm.sdk.platformtools.t8.K0(iPCSetCurrentPaySpeechParam.f82468e)) {
            kd1.e.b();
            kd1.e.f(str2);
            str = "data.tempFilePath is not null，data.dialectPackId is " + str2 + ", set source";
        } else if (com.tencent.mm.sdk.platformtools.t8.D0(str2, "0")) {
            kd1.e.b();
            java.lang.String string = kd1.e.a().getString(str2, "");
            if (com.tencent.mm.sdk.platformtools.t8.K0(string) || !com.tencent.mm.vfs.w6.j(string)) {
                str = "isOnlyDownload is false , data.tempFilePath is null、data.dialectPackId = " + str2 + "，dont have this resource , set defaylt resource";
            } else {
                str = "isOnlyDownload is false , data.tempFilePath is null、data.dialectPackId = " + str2 + "，set resource";
            }
            kd1.e.b();
            kd1.e.f(str2);
        } else {
            kd1.e.b();
            java.lang.String string2 = kd1.e.a().getString(str2, "");
            if (com.tencent.mm.sdk.platformtools.t8.K0(string2) || !com.tencent.mm.vfs.w6.j(string2)) {
                java.lang.Object[] objArr = new java.lang.Object[2];
                objArr[0] = string2 == null ? "null" : string2;
                z18 = true;
                objArr[1] = java.lang.Boolean.valueOf(com.tencent.mm.vfs.w6.j(string2));
                com.tencent.mars.xlog.Log.e("MicroMsg.OfflineVoice.IPCSetCurrentPaySpeech", "resPath:%s %s", objArr);
                str = "isOnlyDownload is false , data.tempFilePath is null、data.dialectPackId =" + str2 + "，dont have this resource";
            } else {
                kd1.e.b();
                kd1.e.f(str2);
                str = "isOnlyDownload is false , data.tempFilePath is null、data.dialectPackId = " + str2 + "，set resource";
            }
        }
        if (rVar != null) {
            if (z18) {
                bundle.putString("IPCResultInfo", "fail:" + str);
                rVar.a(bundle);
                return;
            }
            bundle.putString("IPCResultInfo", "ok:" + str);
            rVar.a(bundle);
        }
    }

    /* loaded from: classes7.dex */
    public static final class IPCSetCurrentPaySpeechParam implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.jsapi.offlinevoice.IPCSetCurrentPaySpeech.IPCSetCurrentPaySpeechParam> CREATOR = new com.tencent.mm.plugin.appbrand.jsapi.offlinevoice.a();

        /* renamed from: d, reason: collision with root package name */
        public final java.lang.String f82467d;

        /* renamed from: e, reason: collision with root package name */
        public final java.lang.String f82468e;

        /* renamed from: f, reason: collision with root package name */
        public final java.lang.String f82469f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f82470g;

        /* renamed from: h, reason: collision with root package name */
        public final java.lang.String f82471h;

        /* renamed from: i, reason: collision with root package name */
        public final java.lang.String f82472i;

        public IPCSetCurrentPaySpeechParam(java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z17, java.lang.String str4, java.lang.String str5) {
            this.f82467d = str;
            this.f82468e = str2;
            this.f82469f = str3;
            this.f82470g = z17;
            this.f82471h = str4;
            this.f82472i = str5;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i17) {
            parcel.writeString(this.f82467d);
            parcel.writeString(this.f82468e);
            parcel.writeString(this.f82469f);
            parcel.writeByte(this.f82470g ? (byte) 1 : (byte) 0);
            parcel.writeString(this.f82471h);
            parcel.writeString(this.f82472i);
        }

        public IPCSetCurrentPaySpeechParam(android.os.Parcel parcel) {
            this.f82467d = parcel.readString();
            this.f82468e = parcel.readString();
            this.f82469f = parcel.readString();
            this.f82470g = parcel.readByte() != 0;
            this.f82471h = parcel.readString();
            this.f82472i = parcel.readString();
        }
    }
}
