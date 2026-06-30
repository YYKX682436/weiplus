package it5;

/* loaded from: classes13.dex */
public final class a extends com.qq.taf.jce.AbstractC2861x7aec4921 {

    /* renamed from: g, reason: collision with root package name */
    public static final it5.c f376134g = new it5.c();

    /* renamed from: h, reason: collision with root package name */
    public static final java.util.ArrayList f376135h;

    /* renamed from: i, reason: collision with root package name */
    public static final it5.d f376136i;

    /* renamed from: d, reason: collision with root package name */
    public it5.c f376137d = null;

    /* renamed from: e, reason: collision with root package name */
    public java.util.ArrayList f376138e = null;

    /* renamed from: f, reason: collision with root package name */
    public it5.d f376139f = null;

    static {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        f376135h = arrayList;
        arrayList.add(new it5.b());
        f376136i = new it5.d();
    }

    @Override // com.qq.taf.jce.AbstractC2861x7aec4921
    /* renamed from: newInit */
    public com.qq.taf.jce.AbstractC2861x7aec4921 mo21369x6df6b2d0() {
        return new it5.a();
    }

    @Override // com.qq.taf.jce.AbstractC2861x7aec4921
    /* renamed from: readFrom */
    public void mo21234xcc442a60(com.qq.taf.jce.C2859xe10ac61e c2859xe10ac61e) {
        this.f376137d = (it5.c) c2859xe10ac61e.m21301x355996((com.qq.taf.jce.AbstractC2861x7aec4921) f376134g, 0, false);
        this.f376138e = (java.util.ArrayList) c2859xe10ac61e.m21302x355996((com.qq.taf.jce.C2859xe10ac61e) f376135h, 1, false);
        this.f376139f = (it5.d) c2859xe10ac61e.m21301x355996((com.qq.taf.jce.AbstractC2861x7aec4921) f376136i, 2, false);
    }

    @Override // com.qq.taf.jce.AbstractC2861x7aec4921
    /* renamed from: writeTo */
    public void mo21235x5f8be6ba(com.qq.taf.jce.C2860x6de9642d c2860x6de9642d) {
        it5.c cVar = this.f376137d;
        if (cVar != null) {
            c2860x6de9642d.m21340x6c257df((com.qq.taf.jce.AbstractC2861x7aec4921) cVar, 0);
        }
        java.util.ArrayList arrayList = this.f376138e;
        if (arrayList != null) {
            c2860x6de9642d.m21350x6c257df((java.util.Collection) arrayList, 1);
        }
        it5.d dVar = this.f376139f;
        if (dVar != null) {
            c2860x6de9642d.m21340x6c257df((com.qq.taf.jce.AbstractC2861x7aec4921) dVar, 2);
        }
    }
}
