package or1;

/* loaded from: classes9.dex */
public class v1 {

    /* renamed from: a, reason: collision with root package name */
    public final r45.d67 f429122a;

    /* renamed from: b, reason: collision with root package name */
    public int f429123b;

    public v1() {
        this.f429123b = 0;
        this.f429122a = new r45.d67();
    }

    public static o11.g a(android.content.Context context, int i17) {
        o11.f fVar = new o11.f();
        fVar.f423611b = true;
        fVar.f423628s = true;
        fVar.f423624o = i17;
        fVar.f423629t = true;
        if (i65.a.D(context)) {
            fVar.f423630u = 0.1f * i65.a.f(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561099i);
        } else {
            fVar.f423630u = 0.1f * i65.a.f(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561423i3);
        }
        return fVar.a();
    }

    public v1(r45.d67 d67Var) {
        this.f429123b = 0;
        this.f429122a = d67Var;
    }
}
