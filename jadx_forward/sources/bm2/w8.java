package bm2;

/* loaded from: classes.dex */
public final class w8 implements android.os.Parcelable.Creator {
    public w8(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(final android.os.Parcel parcel) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parcel, "parcel");
        return new android.os.Parcelable(parcel) { // from class: com.tencent.mm.plugin.finder.live.view.adapter.FinderLiveWhiteListGroupAdapter$ChatRoomInfo

            /* renamed from: CREATOR */
            public static final bm2.w8 f35845x681a0c0c = new bm2.w8(null);

            /* renamed from: d, reason: collision with root package name */
            public final java.lang.String f197725d;

            /* renamed from: e, reason: collision with root package name */
            public final java.lang.String f197726e;

            {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parcel, "parcel");
                java.lang.String readString = parcel.readString();
                java.lang.String readString2 = parcel.readString();
                this.f197725d = readString;
                this.f197726e = readString2;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            /* renamed from: equals */
            public boolean m57568xb2c87fbf(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.p1535xbb6ca34f.C14373x866f3760)) {
                    return false;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.p1535xbb6ca34f.C14373x866f3760 c14373x866f3760 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.p1535xbb6ca34f.C14373x866f3760) obj;
                return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f197725d, c14373x866f3760.f197725d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f197726e, c14373x866f3760.f197726e);
            }

            /* renamed from: hashCode */
            public int m57569x8cdac1b() {
                java.lang.String str = this.f197725d;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                java.lang.String str2 = this.f197726e;
                return hashCode + (str2 != null ? str2.hashCode() : 0);
            }

            /* renamed from: toString */
            public java.lang.String m57570x9616526c() {
                return "ChatRoomInfo(username=" + this.f197725d + ", nickname=" + this.f197726e + ')';
            }

            @Override // android.os.Parcelable
            public void writeToParcel(android.os.Parcel parcel2, int i17) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parcel2, "parcel");
                parcel2.writeString(this.f197725d);
                parcel2.writeString(this.f197726e);
            }
        };
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.p1535xbb6ca34f.C14373x866f3760[i17];
    }
}
