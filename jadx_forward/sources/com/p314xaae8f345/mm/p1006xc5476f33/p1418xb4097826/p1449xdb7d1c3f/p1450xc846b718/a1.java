package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718;

/* loaded from: classes8.dex */
public final class a1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f186867d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f186868e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f186869f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(java.lang.String str, int i17, java.lang.String str2) {
        super(1);
        this.f186867d = str;
        this.f186868e = i17;
        this.f186869f = str2;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        int i17;
        r45.f03 it = (r45.f03) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        java.lang.String str = this.f186867d;
        boolean z17 = (str.length() > 0) && kz5.n0.O(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.e1.f187014g, it.f455425i) && (i17 = this.f186868e) != 3 && i17 != 6;
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(this.f186869f, it.f455425i + " must be remove for account block! " + str);
        }
        return java.lang.Boolean.valueOf(z17);
    }
}
