package com.tencent.mm.plugin.appbrand.ui;

@mk0.a
/* loaded from: classes3.dex */
public class AppBrandUIDeclarePromptIPC implements com.tencent.mm.ipcinvoker.j {
    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        java.lang.String[] split;
        com.tencent.mm.plugin.appbrand.ui.AppBrandUIDeclarePromptIPC.IPCDeclarePromptCallbackParam iPCDeclarePromptCallbackParam = (com.tencent.mm.plugin.appbrand.ui.AppBrandUIDeclarePromptIPC.IPCDeclarePromptCallbackParam) obj;
        if (iPCDeclarePromptCallbackParam == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandUIDeclarePromptIPC", "data == null");
            if (rVar != null) {
                rVar.a(new com.tencent.mm.ipcinvoker.type.IPCVoid());
                return;
            }
            return;
        }
        java.lang.Object[] objArr = new java.lang.Object[3];
        int i17 = iPCDeclarePromptCallbackParam.f89434d;
        boolean z17 = false;
        objArr[0] = java.lang.Integer.valueOf(i17);
        objArr[1] = java.lang.Boolean.valueOf(iPCDeclarePromptCallbackParam.f89435e);
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        java.lang.String str = iPCDeclarePromptCallbackParam.f89436f;
        objArr[2] = str == null ? "" : str;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandUIDeclarePromptIPC", "bizType:%s cancel:%s funcId:%s", objArr);
        if (i17 == 1) {
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_JD_ENTRANCE_DECLARE_CLICK_BOOLEAN_SYNC, java.lang.Boolean.TRUE);
        } else if (i17 == 2 && !com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            gm0.j1.i();
            java.lang.String str2 = (java.lang.String) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_MALL_THIRD_PARTY_DISCLAIMER_STRING, null);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str2) && (split = str2.split(",")) != null && split.length != 0) {
                int i18 = 0;
                while (true) {
                    if (i18 >= split.length) {
                        break;
                    }
                    if (split[i18].equals(str)) {
                        z17 = true;
                        break;
                    }
                    i18++;
                }
                if (z17) {
                    str = str2;
                } else {
                    str = str2 + "," + str;
                }
            }
            gm0.j1.i();
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_MALL_THIRD_PARTY_DISCLAIMER_STRING, str);
        }
        if (rVar != null) {
            rVar.a(new com.tencent.mm.ipcinvoker.type.IPCVoid());
        }
    }

    /* loaded from: classes3.dex */
    public static final class IPCDeclarePromptCallbackParam implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.ui.AppBrandUIDeclarePromptIPC.IPCDeclarePromptCallbackParam> CREATOR = new com.tencent.mm.plugin.appbrand.ui.x8();

        /* renamed from: d, reason: collision with root package name */
        public final int f89434d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f89435e;

        /* renamed from: f, reason: collision with root package name */
        public final java.lang.String f89436f;

        public IPCDeclarePromptCallbackParam(int i17, boolean z17, java.lang.String str) {
            this.f89434d = i17;
            this.f89435e = z17;
            this.f89436f = str;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i17) {
            parcel.writeInt(this.f89434d);
            parcel.writeByte(this.f89435e ? (byte) 1 : (byte) 0);
            parcel.writeString(this.f89436f);
        }

        public IPCDeclarePromptCallbackParam(android.os.Parcel parcel) {
            this.f89434d = parcel.readInt();
            this.f89435e = parcel.readByte() != 0;
            this.f89436f = parcel.readString();
        }
    }
}
