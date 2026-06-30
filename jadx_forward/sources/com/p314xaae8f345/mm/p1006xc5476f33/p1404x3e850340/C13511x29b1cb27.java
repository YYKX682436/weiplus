package com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340;

@java.lang.Deprecated
/* renamed from: com.tencent.mm.plugin.facedetect.FaceProNative */
/* loaded from: classes12.dex */
public class C13511x29b1cb27 {

    /* renamed from: ROTFLIPHOR */
    public static final int f35486x1355e307 = 3;

    /* renamed from: ROTFLIPLEFT */
    public static final int f35487x576828ab = 4;

    /* renamed from: ROTFLIPRIGHT */
    public static final int f35488x95f34dd8 = 5;

    /* renamed from: ROTLEFT */
    public static final int f35489x7d51223e = 1;

    /* renamed from: ROTRIGHT */
    public static final int f35490x2d2986a5 = 2;

    /* renamed from: ROTSTABLE */
    public static final int f35491x7a5457b2 = 0;
    private static final java.lang.String TAG = "MicroMsg.FaceProNative";

    /* renamed from: TIMEOUT_CHECKER */
    private static final long f35492x4d8c0a97 = 3600000;

    /* renamed from: cachedStr */
    private static java.lang.String[] f35493xdf07d9af;

    /* renamed from: hasDetectInit */
    public static volatile boolean f35494xb51b6c8d;

    /* renamed from: lastCheckTime */
    private static long f35495xaccdfdff;

    /* renamed from: nativePtr */
    private long f35496xc3e75f57;

    /* renamed from: com.tencent.mm.plugin.facedetect.FaceProNative$FaceResult */
    /* loaded from: classes13.dex */
    public static class FaceResult implements android.os.Parcelable {

        /* renamed from: CREATOR */
        public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.C13511x29b1cb27.FaceResult> f35497x681a0c0c = new android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.C13511x29b1cb27.FaceResult>() { // from class: com.tencent.mm.plugin.facedetect.FaceProNative.FaceResult.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.C13511x29b1cb27.FaceResult createFromParcel(android.os.Parcel parcel) {
                return new com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.C13511x29b1cb27.FaceResult(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.C13511x29b1cb27.FaceResult[] newArray(int i17) {
                return new com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.C13511x29b1cb27.FaceResult[i17];
            }
        };

        /* renamed from: data */
        public byte[] f35498x2eefaa;

        /* renamed from: result */
        public int f35499xc84dc81d;

        /* renamed from: sidedata */
        public byte[] f35500xcf84981;

        public FaceResult() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* renamed from: toString */
        public java.lang.String m55216x9616526c() {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("FaceResult{result=");
            sb6.append(this.f35499xc84dc81d);
            sb6.append(", sidedataLen=");
            byte[] bArr = this.f35500xcf84981;
            sb6.append(bArr == null ? 0 : bArr.length);
            sb6.append(", dataLen=");
            byte[] bArr2 = this.f35498x2eefaa;
            sb6.append(bArr2 != null ? bArr2.length : 0);
            sb6.append('}');
            return sb6.toString();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i17) {
            parcel.writeInt(this.f35499xc84dc81d);
            parcel.writeByteArray(this.f35498x2eefaa);
            parcel.writeByteArray(this.f35500xcf84981);
        }

        public FaceResult(android.os.Parcel parcel) {
            this.f35499xc84dc81d = parcel.readInt();
            this.f35498x2eefaa = parcel.createByteArray();
            this.f35500xcf84981 = parcel.createByteArray();
        }
    }

    /* renamed from: com.tencent.mm.plugin.facedetect.FaceProNative$FaceStatus */
    /* loaded from: classes7.dex */
    public static class FaceStatus implements android.os.Parcelable {

        /* renamed from: CREATOR */
        public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.C13511x29b1cb27.FaceStatus> f35501x681a0c0c = new android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.C13511x29b1cb27.FaceStatus>() { // from class: com.tencent.mm.plugin.facedetect.FaceProNative.FaceStatus.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.C13511x29b1cb27.FaceStatus createFromParcel(android.os.Parcel parcel) {
                return new com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.C13511x29b1cb27.FaceStatus(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.C13511x29b1cb27.FaceStatus[] newArray(int i17) {
                return new com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.C13511x29b1cb27.FaceStatus[i17];
            }
        };

        /* renamed from: facerect */
        public android.graphics.Rect f35502x1da8b9c1;

        /* renamed from: pitch */
        public float f35503x65bc340;

        /* renamed from: result */
        public int f35504xc84dc81d;

        /* renamed from: roll */
        public float f35505x35807d;
        public float[] xys;
        public float yaw;

        public FaceStatus() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* renamed from: toString */
        public java.lang.String m55218x9616526c() {
            return "FaceStatus{result=" + this.f35504xc84dc81d + ", facerect=" + this.f35502x1da8b9c1 + ", pitch=" + this.f35503x65bc340 + ", yaw=" + this.yaw + ", roll=" + this.f35505x35807d + '}';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i17) {
            parcel.writeInt(this.f35504xc84dc81d);
            parcel.writeParcelable(this.f35502x1da8b9c1, i17);
            parcel.writeFloatArray(this.xys);
            parcel.writeFloat(this.f35503x65bc340);
            parcel.writeFloat(this.yaw);
            parcel.writeFloat(this.f35505x35807d);
        }

        public FaceStatus(android.os.Parcel parcel) {
            this.f35504xc84dc81d = parcel.readInt();
            this.f35502x1da8b9c1 = (android.graphics.Rect) parcel.readParcelable(android.graphics.Rect.class.getClassLoader());
            this.xys = parcel.createFloatArray();
            this.f35503x65bc340 = parcel.readFloat();
            this.yaw = parcel.readFloat();
            this.f35505x35807d = parcel.readFloat();
        }
    }

    static {
        m55200x8090dc3a();
        f35493xdf07d9af = null;
        f35495xaccdfdff = -1L;
    }

    public C13511x29b1cb27() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.e.wi();
        m55200x8090dc3a();
        m55187x65a24b43();
    }

    /* renamed from: NativeConstructor */
    private native void m55187x65a24b43();

    /* renamed from: NativeDestructor */
    private native void m55188xb127390();

    @java.lang.Deprecated
    /* renamed from: addVerifyData2Jpg */
    public static native java.lang.String m55189x18326393(java.lang.String str, java.lang.String str2, java.lang.String str3);

    /* renamed from: checkByNative */
    public static native int m55190xdf992c76();

    /* renamed from: checkInitDetectFace */
    public static void m55191x8826d7f8() {
        synchronized (com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.C13511x29b1cb27.class) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c(TAG, "checkInitDetectFace, hasDetectInit: %s", java.lang.Boolean.valueOf(f35494xb51b6c8d));
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.facedetect.FaceProNative.1
                @Override // java.lang.Runnable
                public void run() {
                    if (com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.C13511x29b1cb27.f35494xb51b6c8d) {
                        return;
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.e.wi();
                    int m55196x9a8d7320 = com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.C13511x29b1cb27.m55196x9a8d7320(com.p314xaae8f345.mm.vfs.w6.N(com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.s0.g(), 0, -1));
                    if (m55196x9a8d7320 == -1) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.C13511x29b1cb27.TAG, "detectFaceCnt init failed: %s", com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.s0.g());
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.C13511x29b1cb27.TAG, "detectFaceCnt init:%d, %s", java.lang.Integer.valueOf(m55196x9a8d7320), com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.s0.g());
                        com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.C13511x29b1cb27.f35494xb51b6c8d = true;
                    }
                }
            });
        }
    }

    /* renamed from: detectFaceCnt */
    public static int m55192x977afda9(java.lang.String str) {
        return 0;
    }

    /* renamed from: engineVersion */
    public static native int m55193xab960c36();

    /* renamed from: getDynamicValue */
    public static java.lang.String[] m55194x831422e8(java.lang.String str) {
        if (java.lang.System.currentTimeMillis() - f35495xaccdfdff >= f35492x4d8c0a97) {
            f35495xaccdfdff = java.lang.System.currentTimeMillis();
            java.lang.String d17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d(str);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(d17)) {
                try {
                    org.json.JSONArray jSONArray = new org.json.JSONArray(d17);
                    java.util.ArrayList arrayList = new java.util.ArrayList(5);
                    int length = jSONArray.length();
                    for (int i17 = 0; i17 < length; i17++) {
                        arrayList.add(jSONArray.getString(i17));
                    }
                    java.lang.String[] strArr = new java.lang.String[length];
                    f35493xdf07d9af = strArr;
                    arrayList.toArray(strArr);
                } catch (org.json.JSONException e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(TAG, e17, "hy: array resolve failed", new java.lang.Object[0]);
                }
            }
        }
        return f35493xdf07d9af;
    }

    /* renamed from: getVAScanResult */
    public static native java.lang.String m55195xee1ef45b();

    /* renamed from: nativeFacedetectInitBin */
    public static native int m55196x9a8d7320(byte[] bArr);

    /* renamed from: nativeFacedetectRelease */
    public static native void m55197x676dd550();

    /* renamed from: nativeFacedetectWithBitmap */
    public static native int m55198xe53cc3ac(java.lang.Object obj);

    /* renamed from: nativeInit */
    public static native boolean m55199xb90145c7();

    /* renamed from: tryLoadLibrary */
    private static void m55200x8090dc3a() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.e.wi();
        ((k30.a) ((l30.h) i95.n0.c(l30.h.class))).Di("wechatvoicereco");
        ((k30.a) ((l30.h) i95.n0.c(l30.h.class))).Di("wechatxlog");
    }

    /* renamed from: destroy */
    public void m55201x5cd39ffa() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.e.wi();
        m55188xb127390();
    }

    /* renamed from: engineFaceProcess */
    public native com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.C13511x29b1cb27.FaceStatus m55202xf9c47db0(byte[] bArr, int i17, int i18, int i19, int i27, int i28);

    /* renamed from: engineGetAllMotions */
    public native int[] m55203x7ab9770();

    /* renamed from: engineGetCurrMotion */
    public native int m55204xedad5c();

    /* renamed from: engineGetCurrMotionData */
    public native java.lang.String m55205x4d800326();

    /* renamed from: engineGroupChange */
    public native int m55206x8501eb6d();

    /* renamed from: engineInit */
    public native int m55207x55cfe272(java.lang.String str, byte[] bArr, java.lang.String str2, java.lang.String str3);

    /* renamed from: engineNextMotion */
    public native int m55208x7c55606b();

    /* renamed from: engineRelease */
    public native int m55209xd7a21765();

    /* renamed from: engineReleaseCurrMotion */
    public native int m55210x8c6f3dcd();

    /* renamed from: engineReleaseOut */
    public native com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.C13511x29b1cb27.FaceResult m55211x77c1a9a9();

    /* renamed from: engineSetVoiceData */
    public native int m55212x2300891c(byte[] bArr);

    /* renamed from: engineStartRecord */
    public native int m55213x1f3dbb1();

    /* renamed from: finalize */
    public void m55214xd764dc1e() {
        super.finalize();
        com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.e.wi();
        m55188xb127390();
    }
}
