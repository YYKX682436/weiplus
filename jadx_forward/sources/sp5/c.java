package sp5;

/* loaded from: classes3.dex */
public abstract class c {
    public static int a(int i17) {
        int b17 = i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, i17);
        float f17 = j65.f.f379476g;
        return f17 != 1.0f ? (int) (b17 / f17) : b17;
    }

    public static void b(android.view.View view) {
        if (j65.f.f379476g != 1.0f) {
            view.post(new sp5.a(view));
        }
    }
}
