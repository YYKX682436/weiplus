package com.tencent.mm.plugin.facedetect;

@java.lang.Deprecated
/* loaded from: classes12.dex */
public class FaceProNative {
    public static final int ROTFLIPHOR = 3;
    public static final int ROTFLIPLEFT = 4;
    public static final int ROTFLIPRIGHT = 5;
    public static final int ROTLEFT = 1;
    public static final int ROTRIGHT = 2;
    public static final int ROTSTABLE = 0;
    private static final java.lang.String TAG = "MicroMsg.FaceProNative";
    private static final long TIMEOUT_CHECKER = 3600000;
    private static java.lang.String[] cachedStr;
    public static volatile boolean hasDetectInit;
    private static long lastCheckTime;
    private long nativePtr;

    /* loaded from: classes13.dex */
    public static class FaceResult implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.facedetect.FaceProNative.FaceResult> CREATOR = new android.os.Parcelable.Creator<com.tencent.mm.plugin.facedetect.FaceProNative.FaceResult>() { // from class: com.tencent.mm.plugin.facedetect.FaceProNative.FaceResult.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public com.tencent.mm.plugin.facedetect.FaceProNative.FaceResult createFromParcel(android.os.Parcel parcel) {
                return new com.tencent.mm.plugin.facedetect.FaceProNative.FaceResult(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public com.tencent.mm.plugin.facedetect.FaceProNative.FaceResult[] newArray(int i17) {
                return new com.tencent.mm.plugin.facedetect.FaceProNative.FaceResult[i17];
            }
        };
        public byte[] data;
        public int result;
        public byte[] sidedata;

        public FaceResult() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public java.lang.String toString() {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("FaceResult{result=");
            sb6.append(this.result);
            sb6.append(", sidedataLen=");
            byte[] bArr = this.sidedata;
            sb6.append(bArr == null ? 0 : bArr.length);
            sb6.append(", dataLen=");
            byte[] bArr2 = this.data;
            sb6.append(bArr2 != null ? bArr2.length : 0);
            sb6.append('}');
            return sb6.toString();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i17) {
            parcel.writeInt(this.result);
            parcel.writeByteArray(this.data);
            parcel.writeByteArray(this.sidedata);
        }

        public FaceResult(android.os.Parcel parcel) {
            this.result = parcel.readInt();
            this.data = parcel.createByteArray();
            this.sidedata = parcel.createByteArray();
        }
    }

    /* loaded from: classes7.dex */
    public static class FaceStatus implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.facedetect.FaceProNative.FaceStatus> CREATOR = new android.os.Parcelable.Creator<com.tencent.mm.plugin.facedetect.FaceProNative.FaceStatus>() { // from class: com.tencent.mm.plugin.facedetect.FaceProNative.FaceStatus.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public com.tencent.mm.plugin.facedetect.FaceProNative.FaceStatus createFromParcel(android.os.Parcel parcel) {
                return new com.tencent.mm.plugin.facedetect.FaceProNative.FaceStatus(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public com.tencent.mm.plugin.facedetect.FaceProNative.FaceStatus[] newArray(int i17) {
                return new com.tencent.mm.plugin.facedetect.FaceProNative.FaceStatus[i17];
            }
        };
        public android.graphics.Rect facerect;
        public float pitch;
        public int result;
        public float roll;
        public float[] xys;
        public float yaw;

        public FaceStatus() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public java.lang.String toString() {
            return "FaceStatus{result=" + this.result + ", facerect=" + this.facerect + ", pitch=" + this.pitch + ", yaw=" + this.yaw + ", roll=" + this.roll + '}';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i17) {
            parcel.writeInt(this.result);
            parcel.writeParcelable(this.facerect, i17);
            parcel.writeFloatArray(this.xys);
            parcel.writeFloat(this.pitch);
            parcel.writeFloat(this.yaw);
            parcel.writeFloat(this.roll);
        }

        public FaceStatus(android.os.Parcel parcel) {
            this.result = parcel.readInt();
            this.facerect = (android.graphics.Rect) parcel.readParcelable(android.graphics.Rect.class.getClassLoader());
            this.xys = parcel.createFloatArray();
            this.pitch = parcel.readFloat();
            this.yaw = parcel.readFloat();
            this.roll = parcel.readFloat();
        }
    }

    static {
        tryLoadLibrary();
        cachedStr = null;
        lastCheckTime = -1L;
    }

    public FaceProNative() {
        com.tencent.mm.plugin.facedetect.e.wi();
        tryLoadLibrary();
        NativeConstructor();
    }

    private native void NativeConstructor();

    private native void NativeDestructor();

    @java.lang.Deprecated
    public static native java.lang.String addVerifyData2Jpg(java.lang.String str, java.lang.String str2, java.lang.String str3);

    public static native int checkByNative();

    public static void checkInitDetectFace() {
        synchronized (com.tencent.mm.plugin.facedetect.FaceProNative.class) {
            com.tencent.mm.sdk.platformtools.Log.c(TAG, "checkInitDetectFace, hasDetectInit: %s", java.lang.Boolean.valueOf(hasDetectInit));
            com.tencent.mm.sdk.platformtools.u3.h(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.facedetect.FaceProNative.1
                @Override // java.lang.Runnable
                public void run() {
                    if (com.tencent.mm.plugin.facedetect.FaceProNative.hasDetectInit) {
                        return;
                    }
                    com.tencent.mm.plugin.facedetect.e.wi();
                    int nativeFacedetectInitBin = com.tencent.mm.plugin.facedetect.FaceProNative.nativeFacedetectInitBin(com.tencent.mm.vfs.w6.N(com.tencent.mm.plugin.facedetect.model.s0.g(), 0, -1));
                    if (nativeFacedetectInitBin == -1) {
                        com.tencent.mars.xlog.Log.w(com.tencent.mm.plugin.facedetect.FaceProNative.TAG, "detectFaceCnt init failed: %s", com.tencent.mm.plugin.facedetect.model.s0.g());
                    } else {
                        com.tencent.mars.xlog.Log.i(com.tencent.mm.plugin.facedetect.FaceProNative.TAG, "detectFaceCnt init:%d, %s", java.lang.Integer.valueOf(nativeFacedetectInitBin), com.tencent.mm.plugin.facedetect.model.s0.g());
                        com.tencent.mm.plugin.facedetect.FaceProNative.hasDetectInit = true;
                    }
                }
            });
        }
    }

    public static int detectFaceCnt(java.lang.String str) {
        return 0;
    }

    public static native int engineVersion();

    public static java.lang.String[] getDynamicValue(java.lang.String str) {
        if (java.lang.System.currentTimeMillis() - lastCheckTime >= TIMEOUT_CHECKER) {
            lastCheckTime = java.lang.System.currentTimeMillis();
            java.lang.String d17 = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d(str);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(d17)) {
                try {
                    org.json.JSONArray jSONArray = new org.json.JSONArray(d17);
                    java.util.ArrayList arrayList = new java.util.ArrayList(5);
                    int length = jSONArray.length();
                    for (int i17 = 0; i17 < length; i17++) {
                        arrayList.add(jSONArray.getString(i17));
                    }
                    java.lang.String[] strArr = new java.lang.String[length];
                    cachedStr = strArr;
                    arrayList.toArray(strArr);
                } catch (org.json.JSONException e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace(TAG, e17, "hy: array resolve failed", new java.lang.Object[0]);
                }
            }
        }
        return cachedStr;
    }

    public static native java.lang.String getVAScanResult();

    public static native int nativeFacedetectInitBin(byte[] bArr);

    public static native void nativeFacedetectRelease();

    public static native int nativeFacedetectWithBitmap(java.lang.Object obj);

    public static native boolean nativeInit();

    private static void tryLoadLibrary() {
        com.tencent.mm.plugin.facedetect.e.wi();
        ((k30.a) ((l30.h) i95.n0.c(l30.h.class))).Di("wechatvoicereco");
        ((k30.a) ((l30.h) i95.n0.c(l30.h.class))).Di("wechatxlog");
    }

    public void destroy() {
        com.tencent.mm.plugin.facedetect.e.wi();
        NativeDestructor();
    }

    public native com.tencent.mm.plugin.facedetect.FaceProNative.FaceStatus engineFaceProcess(byte[] bArr, int i17, int i18, int i19, int i27, int i28);

    public native int[] engineGetAllMotions();

    public native int engineGetCurrMotion();

    public native java.lang.String engineGetCurrMotionData();

    public native int engineGroupChange();

    public native int engineInit(java.lang.String str, byte[] bArr, java.lang.String str2, java.lang.String str3);

    public native int engineNextMotion();

    public native int engineRelease();

    public native int engineReleaseCurrMotion();

    public native com.tencent.mm.plugin.facedetect.FaceProNative.FaceResult engineReleaseOut();

    public native int engineSetVoiceData(byte[] bArr);

    public native int engineStartRecord();

    public void finalize() {
        super.finalize();
        com.tencent.mm.plugin.facedetect.e.wi();
        NativeDestructor();
    }
}
