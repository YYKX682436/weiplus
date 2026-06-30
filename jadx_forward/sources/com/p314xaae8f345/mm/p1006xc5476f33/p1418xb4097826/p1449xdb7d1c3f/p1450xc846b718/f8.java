package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718;

/* loaded from: classes8.dex */
public final class f8 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f187052d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f187053e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f187054f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f8(java.lang.String str, int i17, yz5.l lVar) {
        super(1);
        this.f187052d = str;
        this.f187053e = i17;
        this.f187054f = lVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        boolean z17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb it = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        if (it.F0(this.f187052d)) {
            int i17 = it.f65874xb5f7102a.f470020e;
            int i18 = this.f187053e;
            if ((i17 == i18 || i18 == Integer.MIN_VALUE) && ((java.lang.Boolean) this.f187054f.mo146xb9724478(it)).booleanValue()) {
                z17 = true;
                return java.lang.Boolean.valueOf(z17);
            }
        }
        z17 = false;
        return java.lang.Boolean.valueOf(z17);
    }
}
