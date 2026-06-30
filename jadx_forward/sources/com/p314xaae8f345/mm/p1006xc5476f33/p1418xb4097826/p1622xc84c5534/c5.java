package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534;

/* loaded from: classes2.dex */
public final class c5 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.d5 f206515d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f206516e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c5(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.d5 d5Var, java.lang.String str) {
        super(0);
        this.f206515d = d5Var;
        this.f206516e = str;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.util.HashMap hashMap;
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.d5 d5Var = this.f206515d;
        java.util.Iterator it = d5Var.f206531v.entrySet().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            hashMap = d5Var.f206530u;
            str = this.f206516e;
            if (!hasNext) {
                break;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "onRelease")) {
                d5Var.V0((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.f5) entry.getValue(), false);
            } else if (((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.f5) hashMap.get(entry.getKey())) == null) {
                d5Var.V0((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.f5) entry.getValue(), false);
            }
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "onInvisible")) {
            hashMap.putAll(d5Var.f206531v);
        }
        d5Var.f206531v = new java.util.HashMap();
        return jz5.f0.f384359a;
    }
}
