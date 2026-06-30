package com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p179xe52d7b2f;

/* renamed from: com.google.android.exoplayer2.metadata.Metadata */
/* loaded from: classes13.dex */
public final class C1603xe907df4f implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p179xe52d7b2f.C1603xe907df4f> f5307x681a0c0c = new z8.a();

    /* renamed from: d, reason: collision with root package name */
    public final com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p179xe52d7b2f.C1603xe907df4f.Entry[] f125637d;

    /* renamed from: com.google.android.exoplayer2.metadata.Metadata$Entry */
    /* loaded from: classes13.dex */
    public interface Entry extends android.os.Parcelable {
    }

    public C1603xe907df4f(com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p179xe52d7b2f.C1603xe907df4f.Entry... entryArr) {
        this.f125637d = entryArr == null ? new com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p179xe52d7b2f.C1603xe907df4f.Entry[0] : entryArr;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m17159xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p179xe52d7b2f.C1603xe907df4f.class != obj.getClass()) {
            return false;
        }
        return java.util.Arrays.equals(this.f125637d, ((com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p179xe52d7b2f.C1603xe907df4f) obj).f125637d);
    }

    /* renamed from: hashCode */
    public int m17160x8cdac1b() {
        return java.util.Arrays.hashCode(this.f125637d);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p179xe52d7b2f.C1603xe907df4f.Entry[] entryArr = this.f125637d;
        parcel.writeInt(entryArr.length);
        for (com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p179xe52d7b2f.C1603xe907df4f.Entry entry : entryArr) {
            parcel.writeParcelable(entry, 0);
        }
    }

    public C1603xe907df4f(java.util.List list) {
        if (list != null) {
            com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p179xe52d7b2f.C1603xe907df4f.Entry[] entryArr = new com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p179xe52d7b2f.C1603xe907df4f.Entry[list.size()];
            this.f125637d = entryArr;
            list.toArray(entryArr);
            return;
        }
        this.f125637d = new com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p179xe52d7b2f.C1603xe907df4f.Entry[0];
    }

    public C1603xe907df4f(android.os.Parcel parcel) {
        this.f125637d = new com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p179xe52d7b2f.C1603xe907df4f.Entry[parcel.readInt()];
        int i17 = 0;
        while (true) {
            com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p179xe52d7b2f.C1603xe907df4f.Entry[] entryArr = this.f125637d;
            if (i17 >= entryArr.length) {
                return;
            }
            entryArr[i17] = (com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p179xe52d7b2f.C1603xe907df4f.Entry) parcel.readParcelable(com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p179xe52d7b2f.C1603xe907df4f.Entry.class.getClassLoader());
            i17++;
        }
    }
}
