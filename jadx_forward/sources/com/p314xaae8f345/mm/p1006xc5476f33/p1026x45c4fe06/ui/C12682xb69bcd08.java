package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui;

@mk0.a
/* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandUIDeclarePromptIPC */
/* loaded from: classes3.dex */
public class C12682xb69bcd08 implements com.p314xaae8f345.mm.p794xb0fa9b5e.j {
    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.j
    /* renamed from: invoke */
    public void mo8834xb9724478(java.lang.Object obj, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        java.lang.String[] split;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.C12682xb69bcd08.IPCDeclarePromptCallbackParam iPCDeclarePromptCallbackParam = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.C12682xb69bcd08.IPCDeclarePromptCallbackParam) obj;
        if (iPCDeclarePromptCallbackParam == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandUIDeclarePromptIPC", "data == null");
            if (rVar != null) {
                rVar.a(new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10757xa20383b0());
                return;
            }
            return;
        }
        java.lang.Object[] objArr = new java.lang.Object[3];
        int i17 = iPCDeclarePromptCallbackParam.f170967d;
        boolean z17 = false;
        objArr[0] = java.lang.Integer.valueOf(i17);
        objArr[1] = java.lang.Boolean.valueOf(iPCDeclarePromptCallbackParam.f170968e);
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        java.lang.String str = iPCDeclarePromptCallbackParam.f170969f;
        objArr[2] = str == null ? "" : str;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandUIDeclarePromptIPC", "bizType:%s cancel:%s funcId:%s", objArr);
        if (i17 == 1) {
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_JD_ENTRANCE_DECLARE_CLICK_BOOLEAN_SYNC, java.lang.Boolean.TRUE);
        } else if (i17 == 2 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            gm0.j1.i();
            java.lang.String str2 = (java.lang.String) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_MALL_THIRD_PARTY_DISCLAIMER_STRING, null);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2) && (split = str2.split(",")) != null && split.length != 0) {
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
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_MALL_THIRD_PARTY_DISCLAIMER_STRING, str);
        }
        if (rVar != null) {
            rVar.a(new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10757xa20383b0());
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandUIDeclarePromptIPC$IPCDeclarePromptCallbackParam */
    /* loaded from: classes3.dex */
    public static final class IPCDeclarePromptCallbackParam implements android.os.Parcelable {

        /* renamed from: CREATOR */
        public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.C12682xb69bcd08.IPCDeclarePromptCallbackParam> f35294x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.x8();

        /* renamed from: d, reason: collision with root package name */
        public final int f170967d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f170968e;

        /* renamed from: f, reason: collision with root package name */
        public final java.lang.String f170969f;

        public IPCDeclarePromptCallbackParam(int i17, boolean z17, java.lang.String str) {
            this.f170967d = i17;
            this.f170968e = z17;
            this.f170969f = str;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i17) {
            parcel.writeInt(this.f170967d);
            parcel.writeByte(this.f170968e ? (byte) 1 : (byte) 0);
            parcel.writeString(this.f170969f);
        }

        public IPCDeclarePromptCallbackParam(android.os.Parcel parcel) {
            this.f170967d = parcel.readInt();
            this.f170968e = parcel.readByte() != 0;
            this.f170969f = parcel.readString();
        }
    }
}
