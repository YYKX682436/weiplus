package com.p314xaae8f345.p425x1ea3c036.sdk.p442xd7c2f34f;

@java.lang.Deprecated
/* renamed from: com.tencent.luggage.sdk.launching.OnWXAppResultXPCWrapper */
/* loaded from: classes7.dex */
public final class C3938x410b34a6<R extends android.os.Parcelable> implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.p425x1ea3c036.sdk.p442xd7c2f34f.C3938x410b34a6> f15705x681a0c0c = new com.p314xaae8f345.p425x1ea3c036.sdk.p442xd7c2f34f.n();

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.p425x1ea3c036.sdk.p442xd7c2f34f.h f129138d = new com.p314xaae8f345.p425x1ea3c036.sdk.p442xd7c2f34f.m(this);

    /* renamed from: e, reason: collision with root package name */
    public final android.os.ResultReceiver f129139e;

    /* renamed from: com.tencent.luggage.sdk.launching.OnWXAppResultXPCWrapper$1, reason: invalid class name */
    /* loaded from: classes7.dex */
    class AnonymousClass1 extends android.os.ResultReceiver {
        @Override // android.os.ResultReceiver
        public void onReceiveResult(int i17, android.os.Bundle bundle) {
            bundle.getClass();
            bundle.setClassLoader(com.p314xaae8f345.p425x1ea3c036.sdk.p442xd7c2f34f.C3938x410b34a6.SafeParcelableWrapper.class.getClassLoader());
            try {
                try {
                    android.os.Parcelable parcelable = ((com.p314xaae8f345.p425x1ea3c036.sdk.p442xd7c2f34f.C3938x410b34a6.SafeParcelableWrapper) bundle.getParcelable("parcel")).f129140d;
                    throw null;
                } catch (java.lang.ClassCastException e17) {
                    e = e17;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Luggage.WxaSDK.OnWXAppResultXPCWrapper", "onReceiveResult, e = %s", e);
                    throw null;
                }
            } catch (java.lang.NullPointerException e18) {
                e = e18;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Luggage.WxaSDK.OnWXAppResultXPCWrapper", "onReceiveResult, e = %s", e);
                throw null;
            }
        }
    }

    public C3938x410b34a6(android.os.Parcel parcel, com.p314xaae8f345.p425x1ea3c036.sdk.p442xd7c2f34f.C3938x410b34a6.AnonymousClass1 anonymousClass1) {
        this.f129139e = (android.os.ResultReceiver) android.os.ResultReceiver.CREATOR.createFromParcel(parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        this.f129139e.writeToParcel(parcel, i17);
    }

    /* renamed from: com.tencent.luggage.sdk.launching.OnWXAppResultXPCWrapper$SafeParcelableWrapper */
    /* loaded from: classes7.dex */
    public static final class SafeParcelableWrapper implements android.os.Parcelable {

        /* renamed from: CREATOR */
        public static final android.os.Parcelable.Creator<com.p314xaae8f345.p425x1ea3c036.sdk.p442xd7c2f34f.C3938x410b34a6.SafeParcelableWrapper> f15706x681a0c0c = new com.p314xaae8f345.p425x1ea3c036.sdk.p442xd7c2f34f.o();

        /* renamed from: d, reason: collision with root package name */
        public final android.os.Parcelable f129140d;

        public SafeParcelableWrapper(android.os.Parcelable parcelable) {
            this.f129140d = parcelable;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i17) {
            android.os.Parcelable parcelable = this.f129140d;
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
                this.f129140d = null;
                return;
            }
            try {
                this.f129140d = parcel.readParcelable(java.lang.Class.forName(readString).getClassLoader());
            } catch (java.lang.ClassNotFoundException unused) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Luggage.WxaSDK.OnWXAppResultXPCWrapper", "ClassNotFoundException with %s", readString);
            }
        }
    }
}
