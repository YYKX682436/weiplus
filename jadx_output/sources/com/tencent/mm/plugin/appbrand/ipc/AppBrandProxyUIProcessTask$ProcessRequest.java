package com.tencent.mm.plugin.appbrand.ipc;

/* loaded from: classes7.dex */
public abstract class AppBrandProxyUIProcessTask$ProcessRequest implements android.os.Parcelable {
    public AppBrandProxyUIProcessTask$ProcessRequest(android.os.Parcel parcel) {
        readParcel(parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean forcePortrait() {
        return false;
    }

    public int getStartActivityRequestCode() {
        return -1;
    }

    public abstract java.lang.Class getTaskClass();

    public java.lang.String getUIAlias() {
        return null;
    }

    public boolean needParams() {
        return true;
    }

    public boolean noActionBar() {
        return true;
    }

    public boolean oneShotForeground() {
        return false;
    }

    public boolean preferRunOnUiThreadForStartingProcessProxyUI() {
        return false;
    }

    public void readParcel(android.os.Parcel parcel) {
    }

    public boolean useLandscape() {
        return false;
    }

    public boolean usePendingIntentOnBackground() {
        return false;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
    }
}
