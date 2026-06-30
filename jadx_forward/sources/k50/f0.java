package k50;

/* loaded from: classes.dex */
public final class f0 implements java.util.Comparator {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f385741d;

    public f0(yz5.l lVar) {
        this.f385741d = lVar;
    }

    @Override // java.util.Comparator
    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
        k50.g0 g0Var = k50.g0.f385747a;
        yz5.l lVar = this.f385741d;
        long a17 = g0Var.a((k50.o0) lVar.mo146xb9724478(obj));
        long a18 = g0Var.a((k50.o0) lVar.mo146xb9724478(obj2));
        if (a17 > 0 && a18 > 0) {
            return p3321xbce91901.jvm.p3324x21ffc6bd.o.j(a18, a17);
        }
        if (a17 > 0) {
            return -1;
        }
        if (a18 > 0) {
            return 1;
        }
        java.util.Map map = k50.g0.f385749c;
        java.lang.Integer num = (java.lang.Integer) map.get(lVar.mo146xb9724478(obj));
        int intValue = num != null ? num.intValue() : Integer.MAX_VALUE;
        java.lang.Integer num2 = (java.lang.Integer) map.get(lVar.mo146xb9724478(obj2));
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.i(intValue, num2 != null ? num2.intValue() : Integer.MAX_VALUE);
    }
}
