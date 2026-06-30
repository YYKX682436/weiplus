package com.tencent.mm.plugin.ball.service;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes14.dex */
public class PageFloatBallHelper$ExitPageAnimationInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.ball.service.PageFloatBallHelper$ExitPageAnimationInfo> CREATOR = new com.tencent.mm.plugin.ball.service.c5();

    /* renamed from: d, reason: collision with root package name */
    public int f93117d;

    /* renamed from: e, reason: collision with root package name */
    public int f93118e;

    /* renamed from: f, reason: collision with root package name */
    public android.graphics.Bitmap f93119f;

    public PageFloatBallHelper$ExitPageAnimationInfo(android.os.Parcel parcel) {
        this.f93117d = parcel.readInt();
        this.f93118e = parcel.readInt();
        this.f93119f = (android.graphics.Bitmap) parcel.readParcelable(android.graphics.Bitmap.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f93117d);
        parcel.writeInt(this.f93118e);
        parcel.writeParcelable(this.f93119f, i17);
    }
}
