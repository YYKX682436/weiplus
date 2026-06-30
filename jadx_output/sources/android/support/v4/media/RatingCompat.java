package android.support.v4.media;

/* loaded from: classes13.dex */
public final class RatingCompat implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.support.v4.media.RatingCompat> CREATOR = new android.support.v4.media.s();

    /* renamed from: d, reason: collision with root package name */
    public final int f8918d;

    /* renamed from: e, reason: collision with root package name */
    public final float f8919e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f8920f;

    public RatingCompat(int i17, float f17) {
        this.f8918d = i17;
        this.f8919e = f17;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0013. Please report as an issue. */
    public static android.support.v4.media.RatingCompat a(java.lang.Object obj) {
        android.support.v4.media.RatingCompat ratingCompat;
        float f17;
        android.support.v4.media.RatingCompat ratingCompat2 = null;
        if (obj != null) {
            android.media.Rating rating = (android.media.Rating) obj;
            int b17 = android.support.v4.media.t.b(rating);
            if (!android.support.v4.media.t.e(rating)) {
                switch (b17) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        ratingCompat2 = new android.support.v4.media.RatingCompat(b17, -1.0f);
                        break;
                }
            } else {
                switch (b17) {
                    case 1:
                        ratingCompat = new android.support.v4.media.RatingCompat(1, android.support.v4.media.t.d(rating) ? 1.0f : 0.0f);
                        ratingCompat2 = ratingCompat;
                        break;
                    case 2:
                        ratingCompat = new android.support.v4.media.RatingCompat(2, android.support.v4.media.t.f(rating) ? 1.0f : 0.0f);
                        ratingCompat2 = ratingCompat;
                        break;
                    case 3:
                    case 4:
                    case 5:
                        float c17 = android.support.v4.media.t.c(rating);
                        if (b17 == 3) {
                            f17 = 3.0f;
                        } else if (b17 == 4) {
                            f17 = 4.0f;
                        } else if (b17 == 5) {
                            f17 = 5.0f;
                        }
                        if (c17 >= 0.0f && c17 <= f17) {
                            ratingCompat2 = new android.support.v4.media.RatingCompat(b17, c17);
                            break;
                        }
                        break;
                    case 6:
                        float a17 = android.support.v4.media.t.a(rating);
                        if (a17 >= 0.0f && a17 <= 100.0f) {
                            ratingCompat2 = new android.support.v4.media.RatingCompat(6, a17);
                            break;
                        }
                        break;
                    default:
                        return null;
                }
            }
            ratingCompat2.f8920f = obj;
        }
        return ratingCompat2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return this.f8918d;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Rating:style=");
        sb6.append(this.f8918d);
        sb6.append(" rating=");
        float f17 = this.f8919e;
        sb6.append(f17 < 0.0f ? "unrated" : java.lang.String.valueOf(f17));
        return sb6.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f8918d);
        parcel.writeFloat(this.f8919e);
    }
}
