package com.tencent.mm.plugin.appbrand.app;

/* loaded from: classes7.dex */
public class u0 implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        com.tencent.mm.plugin.appbrand.app.AppBrandProcessSuicideLogic$RebootProcessAndTask appBrandProcessSuicideLogic$RebootProcessAndTask = new com.tencent.mm.plugin.appbrand.app.AppBrandProcessSuicideLogic$RebootProcessAndTask();
        appBrandProcessSuicideLogic$RebootProcessAndTask.v(parcel);
        return appBrandProcessSuicideLogic$RebootProcessAndTask;
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.tencent.mm.plugin.appbrand.app.AppBrandProcessSuicideLogic$RebootProcessAndTask[i17];
    }
}
