package com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e;

/* loaded from: classes8.dex */
public final class b1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f231953d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f231954e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(int i17, java.lang.String str) {
        super(1);
        this.f231953d = i17;
        this.f231954e = str;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        boolean z17;
        ik3.r rVar = (ik3.r) obj;
        if (rVar.f373445b == this.f231953d) {
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(rVar.f373444a, this.f231954e)) {
                z17 = true;
                return java.lang.Boolean.valueOf(z17);
            }
        }
        z17 = false;
        return java.lang.Boolean.valueOf(z17);
    }
}
