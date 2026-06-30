package rh;

/* loaded from: classes12.dex */
public class y2 extends rh.z2 {

    /* renamed from: a, reason: collision with root package name */
    public java.util.List f477093a;

    public static rh.y2 a(long[] jArr) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (long j17 : jArr) {
            arrayList.add(rh.x2.b(java.lang.Long.valueOf(j17)));
        }
        rh.y2 y2Var = new rh.y2();
        y2Var.f477093a = arrayList;
        return y2Var;
    }

    public static rh.y2 b() {
        rh.y2 y2Var = new rh.y2();
        y2Var.f477093a = new java.util.ArrayList();
        return y2Var;
    }
}
