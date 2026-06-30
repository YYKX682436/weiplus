package com.tencent.luggage.sdk.launching;

@java.lang.Deprecated
/* loaded from: classes7.dex */
public final class OnWXAppResultXPCWrapper<R extends android.os.Parcelable> implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.luggage.sdk.launching.OnWXAppResultXPCWrapper> CREATOR = new com.tencent.luggage.sdk.launching.n();

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.luggage.sdk.launching.h f47605d = new com.tencent.luggage.sdk.launching.m(this);

    /* renamed from: e, reason: collision with root package name */
    public final android.os.ResultReceiver f47606e;

    /* renamed from: com.tencent.luggage.sdk.launching.OnWXAppResultXPCWrapper$1, reason: invalid class name */
    /* loaded from: classes7.dex */
    class AnonymousClass1 extends android.os.ResultReceiver {
        @Override // android.os.ResultReceiver
        public void onReceiveResult(int i17, android.os.Bundle bundle) {
            bundle.getClass();
            bundle.setClassLoader(com.tencent.luggage.sdk.launching.OnWXAppResultXPCWrapper.SafeParcelableWrapper.class.getClassLoader());
            try {
                try {
                    android.os.Parcelable parcelable = ((com.tencent.luggage.sdk.launching.OnWXAppResultXPCWrapper.SafeParcelableWrapper) bundle.getParcelable("parcel")).f47607d;
                    throw null;
                } catch (java.lang.ClassCastException e17) {
                    e = e17;
                    com.tencent.mars.xlog.Log.e("Luggage.WxaSDK.OnWXAppResultXPCWrapper", "onReceiveResult, e = %s", e);
                    throw null;
                }
            } catch (java.lang.NullPointerException e18) {
                e = e18;
                com.tencent.mars.xlog.Log.e("Luggage.WxaSDK.OnWXAppResultXPCWrapper", "onReceiveResult, e = %s", e);
                throw null;
            }
        }
    }

    public OnWXAppResultXPCWrapper(android.os.Parcel parcel, com.tencent.luggage.sdk.launching.OnWXAppResultXPCWrapper.AnonymousClass1 anonymousClass1) {
        this.f47606e = (android.os.ResultReceiver) android.os.ResultReceiver.CREATOR.createFromParcel(parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        this.f47606e.writeToParcel(parcel, i17);
    }

    /* loaded from: classes7.dex */
    public static final class SafeParcelableWrapper implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<com.tencent.luggage.sdk.launching.OnWXAppResultXPCWrapper.SafeParcelableWrapper> CREATOR = new com.tencent.luggage.sdk.launching.o();

        /* renamed from: d, reason: collision with root package name */
        public final android.os.Parcelable f47607d;

        public SafeParcelableWrapper(android.os.Parcelable parcelable) {
            this.f47607d = parcelable;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i17) {
            android.os.Parcelable parcelable = this.f47607d;
            if (parcelable == null) {
                parcel.writeString(null);
            } else {
                parcel.writeString(parcelable.getClass().getName());
                parcel.writeParcelable(parcelable, i17);
            }
        }

        public SafeParcelableWrapper(android.os.Parcel parcel) {
            java.lang.String readString = parcel.readString();
            if (android.text.TextUtils.isEmpty(readString)) {
                this.f47607d = null;
                return;
            }
            try {
                this.f47607d = parcel.readParcelable(java.lang.Class.forName(readString).getClassLoader());
            } catch (java.lang.ClassNotFoundException unused) {
                com.tencent.mars.xlog.Log.e("Luggage.WxaSDK.OnWXAppResultXPCWrapper", "ClassNotFoundException with %s", readString);
            }
        }
    }
}
