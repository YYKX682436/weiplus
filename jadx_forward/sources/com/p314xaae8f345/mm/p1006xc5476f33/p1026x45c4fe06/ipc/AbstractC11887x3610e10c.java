package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc;

/* renamed from: com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessRequest */
/* loaded from: classes7.dex */
public abstract class AbstractC11887x3610e10c implements android.os.Parcelable {
    public AbstractC11887x3610e10c(android.os.Parcel parcel) {
        mo50318xdc053d3f(parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: forcePortrait */
    public boolean mo50396xd2cb8fa6() {
        return false;
    }

    /* renamed from: getStartActivityRequestCode */
    public int mo50397x4930e041() {
        return -1;
    }

    /* renamed from: getTaskClass */
    public abstract java.lang.Class mo50317x8a7a03d();

    /* renamed from: getUIAlias */
    public java.lang.String mo50398xeb5ebc06() {
        return null;
    }

    /* renamed from: needParams */
    public boolean m50399xaa6425bc() {
        return true;
    }

    /* renamed from: noActionBar */
    public boolean mo50400x69604d3c() {
        return true;
    }

    /* renamed from: oneShotForeground */
    public boolean mo50401x34ca7fe3() {
        return false;
    }

    /* renamed from: preferRunOnUiThreadForStartingProcessProxyUI */
    public boolean mo50402xf764f604() {
        return false;
    }

    /* renamed from: readParcel */
    public void mo50318xdc053d3f(android.os.Parcel parcel) {
    }

    /* renamed from: useLandscape */
    public boolean mo50403x949e94f4() {
        return false;
    }

    /* renamed from: usePendingIntentOnBackground */
    public boolean mo50404x2733f359() {
        return false;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
    }
}
