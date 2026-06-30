package com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app;

/* renamed from: com.tencent.mm.pluginsdk.model.app.IPCInstallApp */
/* loaded from: classes8.dex */
public class C19587xf385fa2 implements com.p314xaae8f345.mm.p794xb0fa9b5e.j {
    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.j
    /* renamed from: invoke */
    public void mo8834xb9724478(java.lang.Object obj, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.C19587xf385fa2.IPCInstallAppParam iPCInstallAppParam = (com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.C19587xf385fa2.IPCInstallAppParam) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCInstallApp", "invoke()");
        int i17 = iPCInstallAppParam.f270313d;
        boolean z17 = iPCInstallAppParam.f270316g;
        if (i17 == 1) {
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.n1.e(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, iPCInstallAppParam.f270314e, new com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.i3(this, rVar), z17);
        } else if (i17 == 2) {
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.j3 j3Var = new com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.j3(this, rVar);
            android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW");
            com.p314xaae8f345.mm.sdk.p2603x2137b148.i1.d(context, intent, iPCInstallAppParam.f270315f, "application/vnd.android.package-archive", false);
            intent.addFlags(268435456);
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.n1.c(context, intent, j3Var, z17);
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.model.app.IPCInstallApp$IPCInstallAppParam */
    /* loaded from: classes8.dex */
    public static final class IPCInstallAppParam implements android.os.Parcelable {

        /* renamed from: CREATOR */
        public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.C19587xf385fa2.IPCInstallAppParam> f38827x681a0c0c = new com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.k3();

        /* renamed from: d, reason: collision with root package name */
        public final int f270313d;

        /* renamed from: e, reason: collision with root package name */
        public final java.lang.String f270314e;

        /* renamed from: f, reason: collision with root package name */
        public final android.net.Uri f270315f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f270316g;

        public IPCInstallAppParam(int i17, java.lang.String str, android.net.Uri uri, boolean z17) {
            this.f270313d = i17;
            this.f270314e = str;
            this.f270315f = uri;
            this.f270316g = z17;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i17) {
            parcel.writeInt(this.f270313d);
            parcel.writeString(this.f270314e);
            parcel.writeParcelable(this.f270315f, i17);
            parcel.writeByte(this.f270316g ? (byte) 1 : (byte) 0);
        }

        public IPCInstallAppParam(android.os.Parcel parcel) {
            this.f270313d = parcel.readInt();
            this.f270314e = parcel.readString();
            this.f270315f = (android.net.Uri) parcel.readParcelable(android.net.Uri.class.getClassLoader());
            this.f270316g = parcel.readByte() != 0;
        }
    }
}
