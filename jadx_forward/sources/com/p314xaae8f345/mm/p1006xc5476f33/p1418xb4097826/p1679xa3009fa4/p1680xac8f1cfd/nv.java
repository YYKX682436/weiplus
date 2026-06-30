package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class nv implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f216897a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.pv f216898b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f216899c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2495xc50a8b8b.g f216900d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 f216901e;

    public nv(java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.pv pvVar, java.lang.String str2, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079) {
        this.f216897a = str;
        this.f216898b = pvVar;
        this.f216899c = str2;
        this.f216900d = gVar;
        this.f216901e = c14994x9b99c079;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        java.lang.Object next;
        java.lang.String str;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        if (fVar.f152148a == 0 && fVar.f152149b == 0) {
            bu2.g0 g0Var = bu2.g0.f106044a;
            java.lang.String userName = this.f216897a;
            r45.s13 s13Var = (r45.s13) fVar.f152151d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
            synchronized (g0Var) {
                java.util.Map map = bu2.g0.f106045b;
                if (map.containsKey(userName)) {
                    bu2.f0 f0Var = (bu2.f0) ((java.util.LinkedHashMap) map).get(userName);
                    if (f0Var != null) {
                        f0Var.f106039c = s13Var;
                    }
                } else {
                    if (map.size() >= bu2.g0.f106046c) {
                        java.util.Iterator it = ((java.util.LinkedHashMap) map).entrySet().iterator();
                        if (it.hasNext()) {
                            next = it.next();
                            if (it.hasNext()) {
                                long j17 = ((bu2.f0) ((java.util.Map.Entry) next).getValue()).f106037a;
                                do {
                                    java.lang.Object next2 = it.next();
                                    long j18 = ((bu2.f0) ((java.util.Map.Entry) next2).getValue()).f106037a;
                                    if (j17 > j18) {
                                        next = next2;
                                        j17 = j18;
                                    }
                                } while (it.hasNext());
                            }
                        } else {
                            next = null;
                        }
                        java.util.Map.Entry entry = (java.util.Map.Entry) next;
                        if (entry != null && (str = (java.lang.String) entry.getKey()) != null) {
                        }
                    }
                    java.util.Map map2 = bu2.g0.f106045b;
                    bu2.f0 f0Var2 = new bu2.f0(0L, null, null, null, 15, null);
                    f0Var2.f106039c = s13Var;
                    map2.put(userName, f0Var2);
                }
            }
            p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f216898b.f217164g;
            if (r2Var != null) {
                p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.pv pvVar = this.f216898b;
            pvVar.f217164g = pf5.e.m158343xd39de650(pvVar, null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.mv(fVar, pvVar, this.f216897a, this.f216899c, this.f216900d, this.f216901e, null), 3, null);
        }
        return jz5.f0.f384359a;
    }
}
