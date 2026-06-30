package com.p314xaae8f345.mm.ui.p2695x2c1ddc83;

/* loaded from: classes8.dex */
public final class k8 implements com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p5 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.ui.p2695x2c1ddc83.k8 f289347a = new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.k8();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.List f289348b = kz5.c0.i(com.p314xaae8f345.mm.ui.p2695x2c1ddc83.j8.f289315a, com.p314xaae8f345.mm.ui.p2695x2c1ddc83.o8.f289479a);

    @Override // com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p5
    public boolean a(com.p314xaae8f345.mm.ui.p2695x2c1ddc83.e8 context, org.json.JSONObject jSONObject) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        java.util.Iterator it = f289348b.iterator();
        while (it.hasNext()) {
            if (((com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p5) it.next()).a(context, jSONObject)) {
                return true;
            }
        }
        return false;
    }
}
