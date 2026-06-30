package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class hw extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.nw f200133d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f200134e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hw(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.nw nwVar, java.util.List list) {
        super(1);
        this.f200133d = nwVar;
        this.f200134e = list;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        mm2.o4 o4Var;
        java.util.List list;
        int intValue = ((java.lang.Number) obj).intValue();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.nw nwVar = this.f200133d;
        java.util.List list2 = this.f200134e;
        java.lang.Object obj2 = null;
        az2.f a17 = az2.c.a(az2.f.f97658d, nwVar.f199914d, null, 0L, null, 14, null);
        a17.a();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var = dk2.ef.f314913e;
        if (k0Var != null && (o4Var = (mm2.o4) k0Var.m57635xbba4bfc0(mm2.o4.class)) != null && (list = o4Var.f410860v) != null) {
            synchronized (list) {
                java.util.Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    java.lang.Object next = it.next();
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(((km2.q) next).f390703a, ((mm2.c1) k0Var.m57635xbba4bfc0(mm2.c1.class)).m8())) {
                        obj2 = next;
                        break;
                    }
                }
            }
            obj2 = (km2.q) obj2;
        }
        if ((obj2 != null) && (nwVar.f199914d instanceof android.app.Activity)) {
            a17.b();
            if (k0Var != null) {
                android.content.Context context = nwVar.f199914d;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type android.app.Activity");
                k0Var.m57765x2eb2fa87((android.app.Activity) context, "", nwVar.f199914d.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.eij), "");
            }
        } else {
            new ke2.m0(xy2.c.e(nwVar.f199914d), intValue, null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.mw(a17, intValue, list2, nwVar), 12, null).l();
        }
        return jz5.f0.f384359a;
    }
}
