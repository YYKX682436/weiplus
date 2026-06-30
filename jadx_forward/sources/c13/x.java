package c13;

/* loaded from: classes11.dex */
public final class x implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y03.f f119466d;

    public x(y03.f fVar) {
        this.f119466d = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        y03.f fVar = this.f119466d;
        int i17 = fVar.f540174d;
        int i18 = fVar.f540175e;
        int i19 = fVar.f540176f;
        com.p314xaae8f345.p2845xc516c4b6.p2864x6eae83e3.C24115x44252fc3 c24115x44252fc3 = new com.p314xaae8f345.p2845xc516c4b6.p2864x6eae83e3.C24115x44252fc3(fVar.f540171a, i17, i18, i19, false);
        com.p314xaae8f345.p2845xc516c4b6.p2864x6eae83e3.C24132x9b57f23e c24132x9b57f23e = c13.b0.f119394e;
        if (c24132x9b57f23e != null) {
            c24132x9b57f23e.m89497x28cd6a4a(c24115x44252fc3, new c13.b("callback onTextureInfoChanged textureId:" + c24115x44252fc3.m89350xc2ca74e0() + ", width:" + c24115x44252fc3.m89351x755bd410() + ", height:" + c24115x44252fc3.m89347x1c4fb41d() + ", orientation:" + i19 + ", oldWidth:" + i17 + ", oldHeight:" + i18 + ", "));
        }
    }
}
