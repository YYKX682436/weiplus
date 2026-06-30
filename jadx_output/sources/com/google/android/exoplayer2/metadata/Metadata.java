package com.google.android.exoplayer2.metadata;

/* loaded from: classes13.dex */
public final class Metadata implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.google.android.exoplayer2.metadata.Metadata> CREATOR = new z8.a();

    /* renamed from: d, reason: collision with root package name */
    public final com.google.android.exoplayer2.metadata.Metadata.Entry[] f44104d;

    /* loaded from: classes13.dex */
    public interface Entry extends android.os.Parcelable {
    }

    public Metadata(com.google.android.exoplayer2.metadata.Metadata.Entry... entryArr) {
        this.f44104d = entryArr == null ? new com.google.android.exoplayer2.metadata.Metadata.Entry[0] : entryArr;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || com.google.android.exoplayer2.metadata.Metadata.class != obj.getClass()) {
            return false;
        }
        return java.util.Arrays.equals(this.f44104d, ((com.google.android.exoplayer2.metadata.Metadata) obj).f44104d);
    }

    public int hashCode() {
        return java.util.Arrays.hashCode(this.f44104d);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        com.google.android.exoplayer2.metadata.Metadata.Entry[] entryArr = this.f44104d;
        parcel.writeInt(entryArr.length);
        for (com.google.android.exoplayer2.metadata.Metadata.Entry entry : entryArr) {
            parcel.writeParcelable(entry, 0);
        }
    }

    public Metadata(java.util.List list) {
        if (list != null) {
            com.google.android.exoplayer2.metadata.Metadata.Entry[] entryArr = new com.google.android.exoplayer2.metadata.Metadata.Entry[list.size()];
            this.f44104d = entryArr;
            list.toArray(entryArr);
            return;
        }
        this.f44104d = new com.google.android.exoplayer2.metadata.Metadata.Entry[0];
    }

    public Metadata(android.os.Parcel parcel) {
        this.f44104d = new com.google.android.exoplayer2.metadata.Metadata.Entry[parcel.readInt()];
        int i17 = 0;
        while (true) {
            com.google.android.exoplayer2.metadata.Metadata.Entry[] entryArr = this.f44104d;
            if (i17 >= entryArr.length) {
                return;
            }
            entryArr[i17] = (com.google.android.exoplayer2.metadata.Metadata.Entry) parcel.readParcelable(com.google.android.exoplayer2.metadata.Metadata.Entry.class.getClassLoader());
            i17++;
        }
    }
}
