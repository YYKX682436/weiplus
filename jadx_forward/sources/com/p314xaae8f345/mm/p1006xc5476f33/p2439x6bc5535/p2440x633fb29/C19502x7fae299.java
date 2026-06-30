package com.p314xaae8f345.mm.p1006xc5476f33.p2439x6bc5535.p2440x633fb29;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/webwx/model/AutoDownloadAddTaskData;", "Landroid/os/Parcelable;", "app_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.webwx.model.AutoDownloadAddTaskData */
/* loaded from: classes5.dex */
public final /* data */ class C19502x7fae299 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p2439x6bc5535.p2440x633fb29.C19502x7fae299> f38788x681a0c0c = new iy4.h();

    /* renamed from: d, reason: collision with root package name */
    public final long f269491d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f269492e;

    public C19502x7fae299(long j17, java.lang.String talker) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
        this.f269491d = j17;
        this.f269492e = talker;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m74947xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2439x6bc5535.p2440x633fb29.C19502x7fae299)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2439x6bc5535.p2440x633fb29.C19502x7fae299 c19502x7fae299 = (com.p314xaae8f345.mm.p1006xc5476f33.p2439x6bc5535.p2440x633fb29.C19502x7fae299) obj;
        return this.f269491d == c19502x7fae299.f269491d && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f269492e, c19502x7fae299.f269492e);
    }

    /* renamed from: hashCode */
    public int m74948x8cdac1b() {
        return (java.lang.Long.hashCode(this.f269491d) * 31) + this.f269492e.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m74949x9616526c() {
        return "AutoDownloadAddTaskData(msgId=" + this.f269491d + ", talker=" + this.f269492e + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeLong(this.f269491d);
        out.writeString(this.f269492e);
    }
}
