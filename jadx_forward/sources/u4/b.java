package u4;

/* loaded from: classes16.dex */
public final class b extends android.util.Property {
    @Override // android.util.Property
    public /* bridge */ /* synthetic */ java.lang.Object get(java.lang.Object obj) {
        return null;
    }

    @Override // android.util.Property
    public void set(java.lang.Object obj, java.lang.Object obj2) {
        u4.j jVar = (u4.j) obj;
        android.graphics.PointF pointF = (android.graphics.PointF) obj2;
        jVar.getClass();
        jVar.f506025a = java.lang.Math.round(pointF.x);
        int round = java.lang.Math.round(pointF.y);
        jVar.f506026b = round;
        int i17 = jVar.f506030f + 1;
        jVar.f506030f = i17;
        if (i17 == jVar.f506031g) {
            u4.w1.b(jVar.f506029e, jVar.f506025a, round, jVar.f506027c, jVar.f506028d);
            jVar.f506030f = 0;
            jVar.f506031g = 0;
        }
    }
}
