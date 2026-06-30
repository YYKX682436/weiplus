package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class jg extends p012xc85e97e9.p103xe821e364.p104xd1075a44.b0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.mg f194634a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.List f194635b;

    public jg(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.mg mgVar, java.util.List list) {
        this.f194634a = mgVar;
        this.f194635b = list;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.b0
    public boolean a(int i17, int i18) {
        dk2.zf zfVar = (dk2.zf) kz5.n0.a0(this.f194635b, i18);
        return ((zfVar instanceof dk2.eg) && ((dk2.eg) zfVar).A()) ? false : true;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.b0
    public boolean b(int i17, int i18) {
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(kz5.n0.a0(this.f194634a.D.f103713m, i17), kz5.n0.a0(this.f194635b, i18));
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.b0
    public int d() {
        return this.f194635b.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.b0
    public int e() {
        return this.f194634a.D.f103713m.size();
    }
}
