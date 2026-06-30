package com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29;

/* loaded from: classes10.dex */
public final class m1 {

    /* renamed from: a, reason: collision with root package name */
    public final long f257206a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f257207b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f257208c;

    /* renamed from: d, reason: collision with root package name */
    public final r45.i07 f257209d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.ArrayList f257210e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f257211f;

    /* renamed from: g, reason: collision with root package name */
    public float[] f257212g;

    /* renamed from: h, reason: collision with root package name */
    public final float[] f257213h;

    public m1(long j17, java.util.List materials, java.lang.String netMusicPath, r45.i07 xEffectConfig, java.util.ArrayList editItems, java.util.ArrayList editData, float[] drawingRect, float[] fArr, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        editItems = (i17 & 16) != 0 ? new java.util.ArrayList() : editItems;
        editData = (i17 & 32) != 0 ? new java.util.ArrayList() : editData;
        drawingRect = (i17 & 64) != 0 ? new float[]{0.0f, 0.0f, 0.0f, 0.0f} : drawingRect;
        fArr = (i17 & 128) != 0 ? null : fArr;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(materials, "materials");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(netMusicPath, "netMusicPath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(xEffectConfig, "xEffectConfig");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(editItems, "editItems");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(editData, "editData");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(drawingRect, "drawingRect");
        this.f257206a = j17;
        this.f257207b = materials;
        this.f257208c = netMusicPath;
        this.f257209d = xEffectConfig;
        this.f257210e = editItems;
        this.f257211f = editData;
        this.f257212g = drawingRect;
        this.f257213h = fArr;
    }

    /* renamed from: equals */
    public boolean m72486xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.m1)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.m1 m1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.m1) obj;
        return this.f257206a == m1Var.f257206a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f257207b, m1Var.f257207b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f257208c, m1Var.f257208c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f257209d, m1Var.f257209d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f257210e, m1Var.f257210e) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f257211f, m1Var.f257211f) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f257212g, m1Var.f257212g) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f257213h, m1Var.f257213h);
    }

    /* renamed from: hashCode */
    public int m72487x8cdac1b() {
        int hashCode = ((((((((((((java.lang.Long.hashCode(this.f257206a) * 31) + this.f257207b.hashCode()) * 31) + this.f257208c.hashCode()) * 31) + this.f257209d.hashCode()) * 31) + this.f257210e.hashCode()) * 31) + this.f257211f.hashCode()) * 31) + java.util.Arrays.hashCode(this.f257212g)) * 31;
        float[] fArr = this.f257213h;
        return hashCode + (fArr == null ? 0 : java.util.Arrays.hashCode(fArr));
    }

    /* renamed from: toString */
    public java.lang.String m72488x9616526c() {
        return "VLogScriptModel(respId=" + this.f257206a + ", materials=" + this.f257207b + ", netMusicPath='" + this.f257208c + "', xEffectConfig=" + this.f257209d + ", editItems=" + this.f257210e + ", editData=" + this.f257211f + ", drawingRect=" + java.util.Arrays.toString(this.f257212g) + ')';
    }
}
