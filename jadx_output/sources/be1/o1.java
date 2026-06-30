package be1;

/* loaded from: classes3.dex */
public final class o1 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public static final be1.o1 f19489d = new be1.o1();

    public o1() {
        super(2);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        android.content.Context context = (android.content.Context) obj;
        java.util.Map outRes = (java.util.Map) obj2;
        kotlin.jvm.internal.o.g(outRes, "outRes");
        if (context == null) {
            context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        }
        outRes.put("deviceOrientation", 2 == context.getResources().getConfiguration().orientation ? "landscape" : "portrait");
        return jz5.f0.f302826a;
    }
}
