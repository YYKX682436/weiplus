package com.p314xaae8f345.tav.p2957xa228aba5;

/* renamed from: com.tencent.tav.coremedia.CGSize */
/* loaded from: classes14.dex */
public class C25732x76648a85 implements java.lang.Cloneable {

    /* renamed from: CGSizeZero */
    public static final com.p314xaae8f345.tav.p2957xa228aba5.C25732x76648a85 f47831x448c32cd = new com.p314xaae8f345.tav.p2957xa228aba5.C25732x76648a85(0.0f, 0.0f);

    /* renamed from: height */
    public float f47832xb7389127;

    /* renamed from: width */
    public float f47833x6be2dc6;

    public C25732x76648a85(float f17, float f18) {
        this.f47833x6be2dc6 = f17;
        this.f47832xb7389127 = f18;
    }

    /* renamed from: equals */
    public boolean m97178xb2c87fbf(java.lang.Object obj) {
        if (!(obj instanceof com.p314xaae8f345.tav.p2957xa228aba5.C25732x76648a85)) {
            return false;
        }
        com.p314xaae8f345.tav.p2957xa228aba5.C25732x76648a85 c25732x76648a85 = (com.p314xaae8f345.tav.p2957xa228aba5.C25732x76648a85) obj;
        return c25732x76648a85.f47833x6be2dc6 == this.f47833x6be2dc6 && c25732x76648a85.f47832xb7389127 == this.f47832xb7389127;
    }

    /* renamed from: toString */
    public java.lang.String m97179x9616526c() {
        return "[" + this.f47833x6be2dc6 + "," + this.f47832xb7389127 + "]";
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public com.p314xaae8f345.tav.p2957xa228aba5.C25732x76648a85 m97177x5a5dd5d() {
        return new com.p314xaae8f345.tav.p2957xa228aba5.C25732x76648a85(this.f47833x6be2dc6, this.f47832xb7389127);
    }

    public C25732x76648a85() {
        this(1.0f, 1.0f);
    }
}
