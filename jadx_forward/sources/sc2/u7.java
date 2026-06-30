package sc2;

/* loaded from: classes2.dex */
public class u7 implements ad2.j {

    /* renamed from: a, reason: collision with root package name */
    public final int f487822a;

    public u7(int i17) {
        this.f487822a = i17;
    }

    @Override // ad2.j
    public android.view.ViewGroup a(android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        sc2.t7 t7Var = sc2.a8.G;
        java.lang.Integer num = (java.lang.Integer) sc2.a8.H.get(java.lang.Integer.valueOf(this.f487822a));
        return (android.view.ViewGroup) view.findViewById(num != null ? num.intValue() : 0);
    }
}
