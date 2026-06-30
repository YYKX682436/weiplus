package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1101x949d092f;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.offlinevoice.IPCSetCurrentPaySpeech */
/* loaded from: classes7.dex */
public class C12196x94c4d117 implements com.p314xaae8f345.mm.p794xb0fa9b5e.i<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1101x949d092f.C12196x94c4d117.IPCSetCurrentPaySpeechParam, android.os.Bundle> {
    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.j
    /* renamed from: invoke */
    public void mo8834xb9724478(java.lang.Object obj, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1101x949d092f.C12196x94c4d117.IPCSetCurrentPaySpeechParam iPCSetCurrentPaySpeechParam = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1101x949d092f.C12196x94c4d117.IPCSetCurrentPaySpeechParam) obj;
        android.os.Bundle bundle = new android.os.Bundle();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(iPCSetCurrentPaySpeechParam.f164000d)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OfflineVoice.IPCSetCurrentPaySpeech", "fail:dialectPackId is null");
            if (rVar != null) {
                bundle.putString("IPCResultInfo", "fail:dialectPackId is null");
                rVar.a(bundle);
                return;
            }
            return;
        }
        boolean z17 = iPCSetCurrentPaySpeechParam.f164003g;
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z17);
        java.lang.String str2 = iPCSetCurrentPaySpeechParam.f164000d;
        java.lang.String str3 = iPCSetCurrentPaySpeechParam.f164004h;
        java.lang.String str4 = iPCSetCurrentPaySpeechParam.f164002f;
        java.lang.String str5 = iPCSetCurrentPaySpeechParam.f164005i;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OfflineVoice.IPCSetCurrentPaySpeech", "data.dialectPackId: %s,data.md5Sum:%s ,data.tempFileAbsolutePath :%s ,data.isOnlyDownload:%s ，data.version: %s", str2, str3, str4, valueOf, str5);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str4)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OfflineVoice.IPCSetCurrentPaySpeech", "tempFileAbsolutePath == null");
        } else {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3) || !str3.equalsIgnoreCase(com.p314xaae8f345.mm.vfs.w6.p(str4))) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OfflineVoice.IPCSetCurrentPaySpeech", "fail:md5Sum:%s", java.lang.Boolean.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)));
                if (rVar != null) {
                    bundle.putString("IPCResultInfo", "fail:md5Sum is null or md5Sum is not euqal tempFileAbsolutePath MD5");
                    rVar.a(bundle);
                    return;
                }
                return;
            }
            java.lang.String str6 = kd1.e.f388234c;
            com.p314xaae8f345.mm.vfs.w6.u(str6);
            java.lang.String str7 = str6 + str2 + ".pos";
            if (com.p314xaae8f345.mm.vfs.w6.j(str7)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OfflineVoice.IPCSetCurrentPaySpeech", " has this voice resource file before ，first delete exist file");
                com.p314xaae8f345.mm.vfs.w6.h(str7);
            }
            com.p314xaae8f345.mm.vfs.w6.c(str4, str7);
            kd1.e.b().e(str2, str7, str3, str5);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OfflineVoice.IPCSetCurrentPaySpeech", "copyFile to %s %s", str7, str3);
        }
        boolean z18 = false;
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OfflineVoice.IPCSetCurrentPaySpeech", "isOnlyDownload:%s", java.lang.Boolean.valueOf(z17));
            str = "isOnlyDownload is true, dont reset source";
        } else if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(iPCSetCurrentPaySpeechParam.f164001e)) {
            kd1.e.b();
            kd1.e.f(str2);
            str = "data.tempFilePath is not null，data.dialectPackId is " + str2 + ", set source";
        } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(str2, "0")) {
            kd1.e.b();
            java.lang.String string = kd1.e.a().getString(str2, "");
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string) || !com.p314xaae8f345.mm.vfs.w6.j(string)) {
                str = "isOnlyDownload is false , data.tempFilePath is null、data.dialectPackId = " + str2 + "，dont have this resource , set defaylt resource";
            } else {
                str = "isOnlyDownload is false , data.tempFilePath is null、data.dialectPackId = " + str2 + "，set resource";
            }
            kd1.e.b();
            kd1.e.f(str2);
        } else {
            kd1.e.b();
            java.lang.String string2 = kd1.e.a().getString(str2, "");
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string2) || !com.p314xaae8f345.mm.vfs.w6.j(string2)) {
                java.lang.Object[] objArr = new java.lang.Object[2];
                objArr[0] = string2 == null ? "null" : string2;
                z18 = true;
                objArr[1] = java.lang.Boolean.valueOf(com.p314xaae8f345.mm.vfs.w6.j(string2));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OfflineVoice.IPCSetCurrentPaySpeech", "resPath:%s %s", objArr);
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

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.offlinevoice.IPCSetCurrentPaySpeech$IPCSetCurrentPaySpeechParam */
    /* loaded from: classes7.dex */
    public static final class IPCSetCurrentPaySpeechParam implements android.os.Parcelable {

        /* renamed from: CREATOR */
        public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1101x949d092f.C12196x94c4d117.IPCSetCurrentPaySpeechParam> f34576x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1101x949d092f.a();

        /* renamed from: d, reason: collision with root package name */
        public final java.lang.String f164000d;

        /* renamed from: e, reason: collision with root package name */
        public final java.lang.String f164001e;

        /* renamed from: f, reason: collision with root package name */
        public final java.lang.String f164002f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f164003g;

        /* renamed from: h, reason: collision with root package name */
        public final java.lang.String f164004h;

        /* renamed from: i, reason: collision with root package name */
        public final java.lang.String f164005i;

        public IPCSetCurrentPaySpeechParam(java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z17, java.lang.String str4, java.lang.String str5) {
            this.f164000d = str;
            this.f164001e = str2;
            this.f164002f = str3;
            this.f164003g = z17;
            this.f164004h = str4;
            this.f164005i = str5;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i17) {
            parcel.writeString(this.f164000d);
            parcel.writeString(this.f164001e);
            parcel.writeString(this.f164002f);
            parcel.writeByte(this.f164003g ? (byte) 1 : (byte) 0);
            parcel.writeString(this.f164004h);
            parcel.writeString(this.f164005i);
        }

        public IPCSetCurrentPaySpeechParam(android.os.Parcel parcel) {
            this.f164000d = parcel.readString();
            this.f164001e = parcel.readString();
            this.f164002f = parcel.readString();
            this.f164003g = parcel.readByte() != 0;
            this.f164004h = parcel.readString();
            this.f164005i = parcel.readString();
        }
    }
}
