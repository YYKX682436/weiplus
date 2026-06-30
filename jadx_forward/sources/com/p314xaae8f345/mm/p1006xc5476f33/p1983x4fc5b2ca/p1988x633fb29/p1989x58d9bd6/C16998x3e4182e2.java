package com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/recordvideo/model/audio/LyricsInfo;", "Landroid/os/Parcelable;", "CREATOR", "wt3/l0", "plugin-recordvideo_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.recordvideo.model.audio.LyricsInfo */
/* loaded from: classes5.dex */
public final class C16998x3e4182e2 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final wt3.l0 f37776x681a0c0c = new wt3.l0(null);

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f237263d;

    public C16998x3e4182e2(java.util.List lyricDatas) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lyricDatas, "lyricDatas");
        this.f237263d = new java.util.ArrayList();
        java.util.Iterator it = lyricDatas.iterator();
        while (it.hasNext()) {
            this.f237263d.add(((r45.ge4) it.next()).mo14344x5f01b1f6());
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parcel, "parcel");
        java.util.ArrayList<byte[]> arrayList = this.f237263d;
        parcel.writeInt(arrayList.size());
        for (byte[] bArr : arrayList) {
            parcel.writeInt(bArr.length);
            parcel.writeByteArray(bArr);
        }
    }
}
