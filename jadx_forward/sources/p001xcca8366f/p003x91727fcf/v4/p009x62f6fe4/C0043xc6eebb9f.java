package p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4;

/* renamed from: android.support.v4.media.RatingCompat */
/* loaded from: classes13.dex */
public final class C0043xc6eebb9f implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.C0043xc6eebb9f> f67x681a0c0c = new p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.s();

    /* renamed from: d, reason: collision with root package name */
    public final int f90451d;

    /* renamed from: e, reason: collision with root package name */
    public final float f90452e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f90453f;

    public C0043xc6eebb9f(int i17, float f17) {
        this.f90451d = i17;
        this.f90452e = f17;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0013. Please report as an issue. */
    public static p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.C0043xc6eebb9f a(java.lang.Object obj) {
        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.C0043xc6eebb9f c0043xc6eebb9f;
        float f17;
        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.C0043xc6eebb9f c0043xc6eebb9f2 = null;
        if (obj != null) {
            android.media.Rating rating = (android.media.Rating) obj;
            int b17 = p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.t.b(rating);
            if (!p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.t.e(rating)) {
                switch (b17) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        c0043xc6eebb9f2 = new p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.C0043xc6eebb9f(b17, -1.0f);
                        break;
                }
            } else {
                switch (b17) {
                    case 1:
                        c0043xc6eebb9f = new p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.C0043xc6eebb9f(1, p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.t.d(rating) ? 1.0f : 0.0f);
                        c0043xc6eebb9f2 = c0043xc6eebb9f;
                        break;
                    case 2:
                        c0043xc6eebb9f = new p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.C0043xc6eebb9f(2, p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.t.f(rating) ? 1.0f : 0.0f);
                        c0043xc6eebb9f2 = c0043xc6eebb9f;
                        break;
                    case 3:
                    case 4:
                    case 5:
                        float c17 = p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.t.c(rating);
                        if (b17 == 3) {
                            f17 = 3.0f;
                        } else if (b17 == 4) {
                            f17 = 4.0f;
                        } else if (b17 == 5) {
                            f17 = 5.0f;
                        }
                        if (c17 >= 0.0f && c17 <= f17) {
                            c0043xc6eebb9f2 = new p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.C0043xc6eebb9f(b17, c17);
                            break;
                        }
                        break;
                    case 6:
                        float a17 = p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.t.a(rating);
                        if (a17 >= 0.0f && a17 <= 100.0f) {
                            c0043xc6eebb9f2 = new p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.C0043xc6eebb9f(6, a17);
                            break;
                        }
                        break;
                    default:
                        return null;
                }
            }
            c0043xc6eebb9f2.f90453f = obj;
        }
        return c0043xc6eebb9f2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return this.f90451d;
    }

    /* renamed from: toString */
    public java.lang.String m2466x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Rating:style=");
        sb6.append(this.f90451d);
        sb6.append(" rating=");
        float f17 = this.f90452e;
        sb6.append(f17 < 0.0f ? "unrated" : java.lang.String.valueOf(f17));
        return sb6.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f90451d);
        parcel.writeFloat(this.f90452e);
    }
}
