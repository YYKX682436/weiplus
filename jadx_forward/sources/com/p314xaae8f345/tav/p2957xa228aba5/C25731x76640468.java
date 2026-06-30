package com.p314xaae8f345.tav.p2957xa228aba5;

/* renamed from: com.tencent.tav.coremedia.CGRect */
/* loaded from: classes14.dex */
public class C25731x76640468 implements java.lang.Cloneable {

    /* renamed from: origin */
    public final android.graphics.PointF f47829xc3e1af26;

    /* renamed from: size */
    public final com.p314xaae8f345.tav.p2957xa228aba5.C25732x76648a85 f47830x35e001;

    public C25731x76640468(float f17, float f18, float f19, float f27) {
        this(new android.graphics.PointF(f17, f18), new com.p314xaae8f345.tav.p2957xa228aba5.C25732x76648a85(f19, f27));
    }

    /* renamed from: equals */
    public boolean m97173xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        com.p314xaae8f345.tav.p2957xa228aba5.C25731x76640468 c25731x76640468 = (com.p314xaae8f345.tav.p2957xa228aba5.C25731x76640468) obj;
        return this.f47829xc3e1af26.equals(c25731x76640468.f47829xc3e1af26) && this.f47830x35e001.m97178xb2c87fbf(c25731x76640468.f47830x35e001);
    }

    /* renamed from: toString */
    public java.lang.String m97174x9616526c() {
        return "[" + this.f47829xc3e1af26 + "," + this.f47830x35e001 + "]";
    }

    public C25731x76640468(android.graphics.PointF pointF, com.p314xaae8f345.tav.p2957xa228aba5.C25732x76648a85 c25732x76648a85) {
        pointF = pointF == null ? new android.graphics.PointF() : pointF;
        c25732x76648a85 = c25732x76648a85 == null ? new com.p314xaae8f345.tav.p2957xa228aba5.C25732x76648a85() : c25732x76648a85;
        this.f47829xc3e1af26 = pointF;
        this.f47830x35e001 = c25732x76648a85;
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public com.p314xaae8f345.tav.p2957xa228aba5.C25731x76640468 m97172x5a5dd5d() {
        android.graphics.PointF pointF = this.f47829xc3e1af26;
        float f17 = pointF.x;
        float f18 = pointF.y;
        com.p314xaae8f345.tav.p2957xa228aba5.C25732x76648a85 c25732x76648a85 = this.f47830x35e001;
        return new com.p314xaae8f345.tav.p2957xa228aba5.C25731x76640468(f17, f18, c25732x76648a85.f47833x6be2dc6, c25732x76648a85.f47832xb7389127);
    }

    public C25731x76640468() {
        this.f47829xc3e1af26 = new android.graphics.PointF();
        this.f47830x35e001 = new com.p314xaae8f345.tav.p2957xa228aba5.C25732x76648a85();
    }
}
