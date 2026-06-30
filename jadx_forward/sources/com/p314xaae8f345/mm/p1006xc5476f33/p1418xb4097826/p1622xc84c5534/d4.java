package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534;

/* loaded from: classes.dex */
public final class d4 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.k4 f206529d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d4(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.k4 k4Var) {
        super(1);
        this.f206529d = k4Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public final java.lang.Object mo146xb9724478(java.lang.Object value) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(value, "value");
        if (value instanceof org.json.JSONObject) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.k4 k4Var = this.f206529d;
            k4Var.getClass();
            return d75.b.e((org.json.JSONObject) value, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.d4(k4Var));
        }
        if (!(value instanceof org.json.JSONArray)) {
            return value;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.c4 c4Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.c4.f206514d;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        cf.f.b((org.json.JSONArray) value, new cf.e(c4Var, linkedList));
        return linkedList;
    }
}
