package com.p314xaae8f345.p3210x3857dc;

/* loaded from: classes8.dex */
public class a1 implements tx5.e {

    /* renamed from: b, reason: collision with root package name */
    public static com.p314xaae8f345.p3210x3857dc.a1 f301739b;

    /* renamed from: a, reason: collision with root package name */
    public tx5.e f301740a;

    public static synchronized com.p314xaae8f345.p3210x3857dc.a1 c() {
        com.p314xaae8f345.p3210x3857dc.a1 a1Var;
        synchronized (com.p314xaae8f345.p3210x3857dc.a1.class) {
            if (f301739b == null) {
                f301739b = new com.p314xaae8f345.p3210x3857dc.a1();
            }
            a1Var = f301739b;
        }
        return a1Var;
    }

    @Override // tx5.e
    public void a() {
        tx5.e eVar = this.f301740a;
        if (eVar != null) {
            eVar.a();
        }
    }

    @Override // tx5.e
    public void b(java.lang.String str) {
        tx5.e eVar = this.f301740a;
        if (eVar != null) {
            eVar.b(str);
        }
    }
}
