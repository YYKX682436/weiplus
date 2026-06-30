package com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p185x6b0147b;

/* renamed from: com.google.android.exoplayer2.video.ColorInfo */
/* loaded from: classes13.dex */
public final class C1622xed7fbe91 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p185x6b0147b.C1622xed7fbe91> f5324x681a0c0c = new u9.b();

    /* renamed from: d, reason: collision with root package name */
    public final int f125696d;

    /* renamed from: e, reason: collision with root package name */
    public final int f125697e;

    /* renamed from: f, reason: collision with root package name */
    public final int f125698f;

    /* renamed from: g, reason: collision with root package name */
    public final byte[] f125699g;

    /* renamed from: h, reason: collision with root package name */
    public int f125700h;

    public C1622xed7fbe91(int i17, int i18, int i19, byte[] bArr) {
        this.f125696d = i17;
        this.f125697e = i18;
        this.f125698f = i19;
        this.f125699g = bArr;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m17199xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p185x6b0147b.C1622xed7fbe91.class == obj.getClass()) {
            com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p185x6b0147b.C1622xed7fbe91 c1622xed7fbe91 = (com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p185x6b0147b.C1622xed7fbe91) obj;
            if (this.f125696d == c1622xed7fbe91.f125696d && this.f125697e == c1622xed7fbe91.f125697e && this.f125698f == c1622xed7fbe91.f125698f && java.util.Arrays.equals(this.f125699g, c1622xed7fbe91.f125699g)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: hashCode */
    public int m17200x8cdac1b() {
        if (this.f125700h == 0) {
            this.f125700h = ((((((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.v5.f34918x366c91de + this.f125696d) * 31) + this.f125697e) * 31) + this.f125698f) * 31) + java.util.Arrays.hashCode(this.f125699g);
        }
        return this.f125700h;
    }

    /* renamed from: toString */
    public java.lang.String m17201x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("ColorInfo(");
        sb6.append(this.f125696d);
        sb6.append(", ");
        sb6.append(this.f125697e);
        sb6.append(", ");
        sb6.append(this.f125698f);
        sb6.append(", ");
        sb6.append(this.f125699g != null);
        sb6.append(")");
        return sb6.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f125696d);
        parcel.writeInt(this.f125697e);
        parcel.writeInt(this.f125698f);
        byte[] bArr = this.f125699g;
        parcel.writeInt(bArr != null ? 1 : 0);
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
    }

    public C1622xed7fbe91(android.os.Parcel parcel) {
        this.f125696d = parcel.readInt();
        this.f125697e = parcel.readInt();
        this.f125698f = parcel.readInt();
        this.f125699g = parcel.readInt() != 0 ? parcel.createByteArray() : null;
    }
}
