package com.p314xaae8f345.p457x3304c6.p459x2e06d1;

/* renamed from: com.tencent.maas.base.MJID */
/* loaded from: classes5.dex */
public final class C3971x241f78 {

    /* renamed from: value */
    private final java.lang.String f15786x6ac9171;

    private C3971x241f78(java.lang.String str) {
        this.f15786x6ac9171 = str;
    }

    public static com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 of(java.lang.String str) {
        if (str == null) {
            return null;
        }
        return new com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78(str);
    }

    /* renamed from: equals */
    public boolean m32422xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78.class != obj.getClass()) {
            return false;
        }
        return java.util.Objects.equals(this.f15786x6ac9171, ((com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78) obj).f15786x6ac9171);
    }

    /* renamed from: hashCode */
    public int m32423x8cdac1b() {
        return java.util.Objects.hash(this.f15786x6ac9171);
    }

    /* renamed from: toString */
    public java.lang.String m32424x9616526c() {
        return "MJID{value='" + this.f15786x6ac9171 + "'}";
    }

    /* renamed from: value */
    public java.lang.String m32425x6ac9171() {
        return this.f15786x6ac9171;
    }
}
