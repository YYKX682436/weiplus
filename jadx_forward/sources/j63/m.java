package j63;

/* loaded from: classes.dex */
public final class m implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public java.lang.Object createFromParcel(android.os.Parcel parcel) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parcel, "parcel");
        final java.lang.String readString = parcel.readString();
        final java.lang.String readString2 = parcel.readString();
        final java.lang.String readString3 = parcel.readString();
        final long readLong = parcel.readLong();
        final java.lang.String readString4 = parcel.readString();
        return new android.os.Parcelable(readString, readString2, readString3, readLong, readString4) { // from class: com.tencent.mm.plugin.gamelive.event.GameLiveAppbrandEventService$LiveStartInfoPayload

            /* renamed from: CREATOR */
            public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1762x9697b3de.p1763x5c6729a.C16060x33daecf> f36988x681a0c0c = new j63.m();

            /* renamed from: d, reason: collision with root package name */
            public final java.lang.String f223596d;

            /* renamed from: e, reason: collision with root package name */
            public final java.lang.String f223597e;

            /* renamed from: f, reason: collision with root package name */
            public final java.lang.String f223598f;

            /* renamed from: g, reason: collision with root package name */
            public final long f223599g;

            /* renamed from: h, reason: collision with root package name */
            public final java.lang.String f223600h;

            {
                this.f223596d = readString;
                this.f223597e = readString2;
                this.f223598f = readString3;
                this.f223599g = readLong;
                this.f223600h = readString4;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            /* renamed from: equals */
            public boolean m64904xb2c87fbf(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1762x9697b3de.p1763x5c6729a.C16060x33daecf)) {
                    return false;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1762x9697b3de.p1763x5c6729a.C16060x33daecf c16060x33daecf = (com.p314xaae8f345.mm.p1006xc5476f33.p1762x9697b3de.p1763x5c6729a.C16060x33daecf) obj;
                return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f223596d, c16060x33daecf.f223596d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f223597e, c16060x33daecf.f223597e) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f223598f, c16060x33daecf.f223598f) && this.f223599g == c16060x33daecf.f223599g && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f223600h, c16060x33daecf.f223600h);
            }

            /* renamed from: hashCode */
            public int m64905x8cdac1b() {
                java.lang.String str = this.f223596d;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                java.lang.String str2 = this.f223597e;
                int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                java.lang.String str3 = this.f223598f;
                int hashCode3 = (((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + java.lang.Long.hashCode(this.f223599g)) * 31;
                java.lang.String str4 = this.f223600h;
                return hashCode3 + (str4 != null ? str4.hashCode() : 0);
            }

            /* renamed from: toString */
            public java.lang.String m64906x9616526c() {
                return "LiveStartInfoPayload(nickname=" + this.f223596d + ", headerUrl=" + this.f223597e + ", joinLiveTips=" + this.f223598f + ", liveId=" + this.f223599g + ", finderUsrName=" + this.f223600h + ')';
            }

            @Override // android.os.Parcelable
            public void writeToParcel(android.os.Parcel out, int i17) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
                out.writeString(this.f223596d);
                out.writeString(this.f223597e);
                out.writeString(this.f223598f);
                out.writeLong(this.f223599g);
                out.writeString(this.f223600h);
            }
        };
    }

    @Override // android.os.Parcelable.Creator
    public java.lang.Object[] newArray(int i17) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1762x9697b3de.p1763x5c6729a.C16060x33daecf[i17];
    }
}
