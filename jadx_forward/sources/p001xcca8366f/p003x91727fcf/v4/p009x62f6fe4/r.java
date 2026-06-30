package p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4;

/* loaded from: classes11.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final android.os.Bundle f90471a = new android.os.Bundle();

    public p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.C0042x9e34a075 a() {
        return new p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.C0042x9e34a075(this.f90471a);
    }

    public p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.r b(java.lang.String str, android.graphics.Bitmap bitmap) {
        x.b bVar = p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.C0042x9e34a075.f90448f;
        if (!bVar.m174748xc6607c0(str) || ((java.lang.Integer) bVar.m174751x4aabfc28(str, null)).intValue() == 2) {
            this.f90471a.putParcelable(str, bitmap);
            return this;
        }
        throw new java.lang.IllegalArgumentException("The " + str + " key cannot be used to put a Bitmap");
    }

    public p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.r c(java.lang.String str, long j17) {
        x.b bVar = p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.C0042x9e34a075.f90448f;
        if (!bVar.m174748xc6607c0(str) || ((java.lang.Integer) bVar.m174751x4aabfc28(str, null)).intValue() == 0) {
            this.f90471a.putLong(str, j17);
            return this;
        }
        throw new java.lang.IllegalArgumentException("The " + str + " key cannot be used to put a long");
    }

    public p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.r d(java.lang.String str, java.lang.String str2) {
        x.b bVar = p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.C0042x9e34a075.f90448f;
        if (!bVar.m174748xc6607c0(str) || ((java.lang.Integer) bVar.m174751x4aabfc28(str, null)).intValue() == 1) {
            this.f90471a.putCharSequence(str, str2);
            return this;
        }
        throw new java.lang.IllegalArgumentException("The " + str + " key cannot be used to put a String");
    }

    public p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.r e(java.lang.String str, java.lang.CharSequence charSequence) {
        x.b bVar = p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.C0042x9e34a075.f90448f;
        if (!bVar.m174748xc6607c0(str) || ((java.lang.Integer) bVar.m174751x4aabfc28(str, null)).intValue() == 1) {
            this.f90471a.putCharSequence(str, charSequence);
            return this;
        }
        throw new java.lang.IllegalArgumentException("The " + str + " key cannot be used to put a CharSequence");
    }
}
