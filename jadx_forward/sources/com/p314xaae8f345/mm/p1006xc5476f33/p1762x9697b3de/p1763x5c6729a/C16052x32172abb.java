package com.p314xaae8f345.mm.p1006xc5476f33.p1762x9697b3de.p1763x5c6729a;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/gamelive/event/GameLiveAppbrandEventService$LiveCommentWrapperInfoPayload", "Landroid/os/Parcelable;", "plugin-gamelive_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.gamelive.event.GameLiveAppbrandEventService$LiveCommentWrapperInfoPayload */
/* loaded from: classes13.dex */
public final /* data */ class C16052x32172abb implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1762x9697b3de.p1763x5c6729a.C16052x32172abb> f36980x681a0c0c = new j63.e();

    /* renamed from: d, reason: collision with root package name */
    public long f223548d;

    /* renamed from: e, reason: collision with root package name */
    public long f223549e;

    /* renamed from: f, reason: collision with root package name */
    public long f223550f;

    /* renamed from: g, reason: collision with root package name */
    public long f223551g;

    /* renamed from: h, reason: collision with root package name */
    public long f223552h;

    /* renamed from: i, reason: collision with root package name */
    public java.util.List f223553i;

    public C16052x32172abb(long j17, long j18, long j19, long j27, long j28, java.util.List list) {
        this.f223548d = j17;
        this.f223549e = j18;
        this.f223550f = j19;
        this.f223551g = j27;
        this.f223552h = j28;
        this.f223553i = list;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m64872xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1762x9697b3de.p1763x5c6729a.C16052x32172abb)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1762x9697b3de.p1763x5c6729a.C16052x32172abb c16052x32172abb = (com.p314xaae8f345.mm.p1006xc5476f33.p1762x9697b3de.p1763x5c6729a.C16052x32172abb) obj;
        return this.f223548d == c16052x32172abb.f223548d && this.f223549e == c16052x32172abb.f223549e && this.f223550f == c16052x32172abb.f223550f && this.f223551g == c16052x32172abb.f223551g && this.f223552h == c16052x32172abb.f223552h && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f223553i, c16052x32172abb.f223553i);
    }

    /* renamed from: hashCode */
    public int m64873x8cdac1b() {
        int hashCode = ((((((((java.lang.Long.hashCode(this.f223548d) * 31) + java.lang.Long.hashCode(this.f223549e)) * 31) + java.lang.Long.hashCode(this.f223550f)) * 31) + java.lang.Long.hashCode(this.f223551g)) * 31) + java.lang.Long.hashCode(this.f223552h)) * 31;
        java.util.List list = this.f223553i;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    /* renamed from: toString */
    public java.lang.String m64874x9616526c() {
        return "LiveCommentWrapperInfoPayload(liveId=" + this.f223548d + ", currOnlineCount=" + this.f223549e + ", totalViewCount=" + this.f223550f + ", currLikeCount=" + this.f223551g + ", totalRewardCount=" + this.f223552h + ", msgList=" + this.f223553i + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeLong(this.f223548d);
        out.writeLong(this.f223549e);
        out.writeLong(this.f223550f);
        out.writeLong(this.f223551g);
        out.writeLong(this.f223552h);
        java.util.List list = this.f223553i;
        if (list == null) {
            out.writeInt(0);
            return;
        }
        out.writeInt(1);
        out.writeInt(list.size());
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1762x9697b3de.p1763x5c6729a.C16059xbced5ba8) it.next()).writeToParcel(out, i17);
        }
    }
}
