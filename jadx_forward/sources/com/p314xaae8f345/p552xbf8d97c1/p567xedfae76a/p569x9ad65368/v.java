package com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368;

/* loaded from: classes12.dex */
public final class v {

    /* renamed from: f, reason: collision with root package name */
    public static final com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.v f134416f = new com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.v();

    /* renamed from: a, reason: collision with root package name */
    public static final jz5.g f134411a = jz5.h.b(com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.s.f134404d);

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f134412b = jz5.h.b(com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.t.f134406d);

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.ArrayList f134413c = new java.util.ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.ArrayList f134414d = new java.util.ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public static final com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.d f134415e = new com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.u();

    public static final java.lang.String a(com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.v vVar) {
        vVar.getClass();
        return (java.lang.String) ((jz5.n) f134411a).mo141623x754a37bb();
    }

    public static final boolean b(com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.v vVar, java.util.ArrayList arrayList, java.lang.String str, java.lang.String str2, java.lang.Integer num) {
        boolean booleanValue;
        vVar.getClass();
        java.util.Iterator it = arrayList.iterator();
        while (true) {
            boolean z17 = false;
            while (it.hasNext()) {
                yz5.q qVar = (yz5.q) it.next();
                com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.d0 d0Var = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.d0.f134367k;
                java.lang.String b17 = d0Var.b();
                try {
                    booleanValue = ((java.lang.Boolean) qVar.mo147xb9724478(str, str2, num)).booleanValue();
                    if (booleanValue) {
                        oj.j.b(d0Var.b(), qVar.getClass() + " try to rescue process", new java.lang.Object[0]);
                    }
                } catch (java.lang.Throwable th6) {
                    oj.j.d(b17, th6, "", new java.lang.Object[0]);
                }
                if (z17 || booleanValue) {
                    z17 = true;
                }
            }
            return z17;
        }
    }

    public final com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.p c() {
        return (com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.p) ((jz5.n) f134412b).mo141623x754a37bb();
    }
}
