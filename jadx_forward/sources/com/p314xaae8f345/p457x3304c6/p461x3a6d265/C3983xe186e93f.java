package com.p314xaae8f345.p457x3304c6.p461x3a6d265;

/* renamed from: com.tencent.maas.camstudio.MJAIFaceResult */
/* loaded from: classes5.dex */
public class C3983xe186e93f {

    /* renamed from: a, reason: collision with root package name */
    public final int f129364a;

    /* renamed from: b, reason: collision with root package name */
    public final float f129365b;

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.p457x3304c6.p461x3a6d265.g f129366c;

    public C3983xe186e93f(int i17, float f17, int i18) {
        com.p314xaae8f345.p457x3304c6.p461x3a6d265.g gVar;
        this.f129364a = i17;
        this.f129365b = f17;
        com.p314xaae8f345.p457x3304c6.p461x3a6d265.g[] m32909xcee59d22 = com.p314xaae8f345.p457x3304c6.p461x3a6d265.g.m32909xcee59d22();
        int length = m32909xcee59d22.length;
        int i19 = 0;
        while (true) {
            if (i19 >= length) {
                gVar = com.p314xaae8f345.p457x3304c6.p461x3a6d265.g.nMJAIGenderTypeUnknown;
                break;
            }
            gVar = m32909xcee59d22[i19];
            if (gVar.f129474d == i18) {
                break;
            } else {
                i19++;
            }
        }
        this.f129366c = gVar;
    }

    /* renamed from: toString */
    public java.lang.String m32477x9616526c() {
        return "MJAIFaceResult{faceID=" + this.f129364a + ", age=" + this.f129365b + ", gender=" + this.f129366c + '}';
    }
}
