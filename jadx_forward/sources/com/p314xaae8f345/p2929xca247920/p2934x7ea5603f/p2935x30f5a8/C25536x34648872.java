package com.p314xaae8f345.p2929xca247920.p2934x7ea5603f.p2935x30f5a8;

/* renamed from: com.tencent.shadow.dynamic.host.FailedException */
/* loaded from: classes13.dex */
public class C25536x34648872 extends java.lang.Exception implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.p2929xca247920.p2934x7ea5603f.p2935x30f5a8.C25536x34648872> f46684x681a0c0c = new android.os.Parcelable.Creator<com.p314xaae8f345.p2929xca247920.p2934x7ea5603f.p2935x30f5a8.C25536x34648872>() { // from class: com.tencent.shadow.dynamic.host.FailedException.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.p314xaae8f345.p2929xca247920.p2934x7ea5603f.p2935x30f5a8.C25536x34648872 createFromParcel(android.os.Parcel parcel) {
            return new com.p314xaae8f345.p2929xca247920.p2934x7ea5603f.p2935x30f5a8.C25536x34648872(parcel.readInt(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.p314xaae8f345.p2929xca247920.p2934x7ea5603f.p2935x30f5a8.C25536x34648872[] newArray(int i17) {
            return new com.p314xaae8f345.p2929xca247920.p2934x7ea5603f.p2935x30f5a8.C25536x34648872[i17];
        }
    };

    /* renamed from: ERROR_CODE_FILE_NOT_FOUND_EXCEPTION */
    public static final int f46685x588190be = 3003;

    /* renamed from: ERROR_CODE_RELOAD_LOADER_EXCEPTION */
    public static final int f46686x2e37038e = 3008;

    /* renamed from: ERROR_CODE_RELOAD_RUNTIME_EXCEPTION */
    public static final int f46687xbf7f413d = 3007;

    /* renamed from: ERROR_CODE_REMOTE_EXCEPTION */
    public static final int f46688x791c9871 = 3001;

    /* renamed from: ERROR_CODE_RESET_UUID_EXCEPTION */
    public static final int f46689x7d33f936 = 3006;

    /* renamed from: ERROR_CODE_RUNTIME_EXCEPTION */
    public static final int f46690x3c8b1ecd = 3002;

    /* renamed from: ERROR_CODE_UUID_MANAGER_DEAD_EXCEPTION */
    public static final int f46691x1c416e2f = 3005;

    /* renamed from: ERROR_CODE_UUID_MANAGER_NULL_EXCEPTION */
    public static final int f46692xd2e36792 = 3004;

    /* renamed from: ERROR_PLUGIN_PROCESS_LOADER_NOT_LOADED */
    public static final int f46693x191f6238 = 3010;

    /* renamed from: FRAMEWORK_MANAGER_LOAD_ERROR */
    public static final int f46694x7414b142 = 1008;

    /* renamed from: errorCode */
    public final int f46695x139cb015;

    /* renamed from: errorMessage */
    public final java.lang.String f46696x47b7ecdf;

    public C25536x34648872(android.os.RemoteException remoteException) {
        super("3001:" + remoteException.getClass().getSimpleName() + ":" + remoteException.getMessage());
        this.f46695x139cb015 = 3001;
        this.f46696x47b7ecdf = getMessage();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f46696x47b7ecdf);
        parcel.writeInt(this.f46695x139cb015);
    }

    public C25536x34648872(java.lang.RuntimeException runtimeException) {
        super("3002:" + runtimeException.getClass().getSimpleName() + ":" + runtimeException.getMessage());
        this.f46695x139cb015 = 3002;
        this.f46696x47b7ecdf = getMessage();
    }

    public C25536x34648872(int i17, java.lang.String str) {
        super(i17 + ":" + str);
        this.f46695x139cb015 = i17;
        this.f46696x47b7ecdf = str;
    }

    public C25536x34648872(com.p314xaae8f345.p2929xca247920.p2934x7ea5603f.p2935x30f5a8.C25535x8b1186b6 c25535x8b1186b6) {
        super(c25535x8b1186b6.f46683x5c4d1e6 + ":" + c25535x8b1186b6.f46682xb2d4efdc);
        this.f46695x139cb015 = c25535x8b1186b6.f46683x5c4d1e6;
        this.f46696x47b7ecdf = c25535x8b1186b6.f46682xb2d4efdc;
    }
}
