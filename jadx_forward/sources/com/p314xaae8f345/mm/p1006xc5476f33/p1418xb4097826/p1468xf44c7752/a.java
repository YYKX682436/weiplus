package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.ArrayList f192875a;

    /* renamed from: b, reason: collision with root package name */
    public final int f192876b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f192877c;

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 f192878d;

    /* renamed from: e, reason: collision with root package name */
    public long f192879e;

    /* renamed from: f, reason: collision with root package name */
    public long f192880f;

    public a(java.util.ArrayList tabList, int i17, byte[] bArr, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tabList, "tabList");
        this.f192875a = tabList;
        this.f192876b = i17;
        this.f192877c = bArr;
        this.f192878d = c19792x256d2725;
    }

    /* renamed from: equals */
    public boolean m56731xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.a)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.a aVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.a) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f192875a, aVar.f192875a) && this.f192876b == aVar.f192876b && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f192877c, aVar.f192877c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f192878d, aVar.f192878d);
    }

    /* renamed from: hashCode */
    public int m56732x8cdac1b() {
        int hashCode = ((this.f192875a.hashCode() * 31) + java.lang.Integer.hashCode(this.f192876b)) * 31;
        byte[] bArr = this.f192877c;
        int hashCode2 = (hashCode + (bArr == null ? 0 : java.util.Arrays.hashCode(bArr))) * 31;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = this.f192878d;
        return hashCode2 + (c19792x256d2725 != null ? c19792x256d2725.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m56733x9616526c() {
        return "ConfigData(tabList=" + this.f192875a + ", bizScene=" + this.f192876b + ", extBuff=" + java.util.Arrays.toString(this.f192877c) + ", lastSelectedObject=" + this.f192878d + ')';
    }
}
