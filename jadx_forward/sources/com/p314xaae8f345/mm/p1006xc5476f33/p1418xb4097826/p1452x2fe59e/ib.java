package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes2.dex */
public final class ib extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.jb f188532d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 f188533e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ib(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.jb jbVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079) {
        super(0);
        this.f188532d = jbVar;
        this.f188533e = c14994x9b99c079;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        fp0.t tVar;
        java.util.HashMap hashMap = new java.util.HashMap();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.jb jbVar = this.f188532d;
        int size = jbVar.f188540m.size();
        for (int i17 = 0; i17 < size; i17++) {
            java.util.ArrayList arrayList = jbVar.f188540m;
            ((so2.f1) arrayList.get(i17)).f491869d.set(4, 1);
            java.lang.String m75945x2fec8307 = ((so2.f1) arrayList.get(i17)).f491869d.m75945x2fec8307(5);
            if (m75945x2fec8307 == null) {
                m75945x2fec8307 = "";
            }
            hashMap.put(m75945x2fec8307, new jz5.l(((so2.f1) arrayList.get(i17)).f491869d, java.lang.Integer.valueOf(i17)));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.hb hbVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.hb(jbVar, hashMap);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079 = this.f188533e;
        if (c14994x9b99c079 != null && (tVar = jbVar.f188539i) != null) {
            tVar.b(new fp0.r(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.gd(true, c14994x9b99c079, jbVar, hbVar), null, 2, null));
        }
        return jz5.f0.f384359a;
    }
}
