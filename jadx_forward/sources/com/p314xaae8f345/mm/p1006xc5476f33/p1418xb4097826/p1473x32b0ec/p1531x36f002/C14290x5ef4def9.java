package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002;

/* JADX INFO: Access modifiers changed from: package-private */
@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\b\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"com/tencent/mm/plugin/finder/live/util/IntentBufferSameProcess$BufferShell", "Landroid/os/Parcelable;", "CREATOR", "com/tencent/mm/plugin/finder/live/util/p1", "plugin-finder-base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.live.util.IntentBufferSameProcess$BufferShell */
/* loaded from: classes3.dex */
public final /* data */ class C14290x5ef4def9 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.p1 f35822x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.p1(null);

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f196965d;

    public C14290x5ef4def9(java.lang.String id6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(id6, "id");
        this.f196965d = id6;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m57150xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.C14290x5ef4def9) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f196965d, ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.C14290x5ef4def9) obj).f196965d);
    }

    /* renamed from: hashCode */
    public int m57151x8cdac1b() {
        return this.f196965d.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m57152x9616526c() {
        return "BufferShell(id=" + this.f196965d + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel dest, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dest, "dest");
        dest.writeString(this.f196965d);
    }
}
