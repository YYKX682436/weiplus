package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes10.dex */
public final class ph extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.uh f190255d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f190256e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f190257f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ph(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.uh uhVar, java.lang.String str, int i17) {
        super(0);
        this.f190255d = uhVar;
        this.f190256e = str;
        this.f190257f = i17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.li liVar;
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.uh uhVar = this.f190255d;
        java.util.Iterator it = uhVar.f190724p.iterator();
        int i17 = 0;
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            cd2.b bVar = (cd2.b) next;
            java.lang.String str = this.f190256e;
            if (str == null || str.length() == 0) {
                break;
            }
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, bVar.f122188d.q()) && (liVar = uhVar.f190721m) != null && (c22848x6ddd90cf = liVar.f188832i) != null) {
                c22848x6ddd90cf.m8148xed6e4d18(i17, java.lang.Integer.valueOf(this.f190257f));
            }
            i17 = i18;
        }
        return jz5.f0.f384359a;
    }
}
