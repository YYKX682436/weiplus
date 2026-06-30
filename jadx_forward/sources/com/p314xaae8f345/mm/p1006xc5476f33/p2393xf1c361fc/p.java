package com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc;

/* loaded from: classes.dex */
public final class p extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f263113d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f263114e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(java.util.List list, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var) {
        super(1);
        this.f263113d = list;
        this.f263114e = h0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        org.json.JSONObject it = (org.json.JSONObject) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        this.f263113d.add(it);
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(it.get("key"), "parentSearchID")) {
            java.lang.Object obj2 = it.get("textValue");
            java.lang.String str = obj2 instanceof java.lang.String ? (java.lang.String) obj2 : null;
            if (str == null) {
                str = "";
            }
            this.f263114e.f391656d = str;
        }
        return jz5.f0.f384359a;
    }
}
