package bk4;

/* loaded from: classes3.dex */
public abstract class k1 {
    public static final java.lang.String a() {
        java.lang.String k17 = gm0.j1.b().k();
        kotlin.jvm.internal.o.f(k17, "getUserName(...)");
        return k17;
    }

    public static void b(android.view.View view, long j17, android.view.View.OnClickListener onClickListener, yz5.a aVar, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            j17 = 300;
        }
        long j18 = j17;
        android.view.View.OnClickListener onClickListener2 = (i17 & 2) != 0 ? null : onClickListener;
        yz5.a aVar2 = (i17 & 4) != 0 ? null : aVar;
        kotlin.jvm.internal.o.g(view, "<this>");
        view.setOnClickListener(new bk4.j1(view, j18, onClickListener2, aVar2));
    }
}
