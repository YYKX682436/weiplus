package com.p314xaae8f345.mm.p1006xc5476f33.p1762x9697b3de.p1763x5c6729a;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/gamelive/event/GameLiveAppbrandEventService$LiveMemberInfoListPayload", "Landroid/os/Parcelable;", "plugin-gamelive_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.gamelive.event.GameLiveAppbrandEventService$LiveMemberInfoListPayload */
/* loaded from: classes7.dex */
public final /* data */ class C16055x610e3697 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1762x9697b3de.p1763x5c6729a.C16055x610e3697> f36983x681a0c0c = new j63.h();

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f223557d;

    public C16055x610e3697(java.util.List list) {
        this.f223557d = list;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m64884xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1762x9697b3de.p1763x5c6729a.C16055x610e3697) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f223557d, ((com.p314xaae8f345.mm.p1006xc5476f33.p1762x9697b3de.p1763x5c6729a.C16055x610e3697) obj).f223557d);
    }

    /* renamed from: hashCode */
    public int m64885x8cdac1b() {
        java.util.List list = this.f223557d;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m64886x9616526c() {
        return "LiveMemberInfoListPayload(msgList=" + this.f223557d + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        java.util.List list = this.f223557d;
        if (list == null) {
            out.writeInt(0);
            return;
        }
        out.writeInt(1);
        out.writeInt(list.size());
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1762x9697b3de.p1763x5c6729a.C16056x72b57895) it.next()).writeToParcel(out, i17);
        }
    }
}
