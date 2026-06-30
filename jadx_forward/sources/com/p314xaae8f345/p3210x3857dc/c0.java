package com.p314xaae8f345.p3210x3857dc;

/* loaded from: classes13.dex */
public class c0 implements tx5.d {

    /* renamed from: b, reason: collision with root package name */
    public static com.p314xaae8f345.p3210x3857dc.c0 f301751b;

    /* renamed from: a, reason: collision with root package name */
    public tx5.d f301752a;

    public static synchronized com.p314xaae8f345.p3210x3857dc.c0 a() {
        com.p314xaae8f345.p3210x3857dc.c0 c0Var;
        synchronized (com.p314xaae8f345.p3210x3857dc.c0.class) {
            if (f301751b == null) {
                f301751b = new com.p314xaae8f345.p3210x3857dc.c0();
            }
            c0Var = f301751b;
        }
        return c0Var;
    }

    @Override // tx5.d
    /* renamed from: getOrCreateProfile */
    public tx5.c mo120236x125d89b4(java.lang.String str) {
        by5.a1.a();
        tx5.d dVar = this.f301752a;
        if (dVar != null) {
            return dVar.mo120236x125d89b4(str);
        }
        return null;
    }
}
