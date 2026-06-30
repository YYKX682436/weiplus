package com.p314xaae8f345.mm.p2613x7643c6b5;

/* renamed from: com.tencent.mm.service.MMIntentService */
/* loaded from: classes12.dex */
public abstract class AbstractC21024xc1ed8ab9 extends com.p314xaae8f345.mm.p2613x7643c6b5.AbstractC21025xb0cc40f5 {

    /* renamed from: i, reason: collision with root package name */
    public volatile l85.o0 f274736i;

    public AbstractC21024xc1ed8ab9(java.lang.String str) {
    }

    @Override // com.p314xaae8f345.mm.p2613x7643c6b5.AbstractC21025xb0cc40f5
    public void d() {
        super.d();
        this.f274736i = new l85.o0(this, xu5.b.a("close-db-while-crash"));
    }

    @Override // com.p314xaae8f345.mm.p2613x7643c6b5.AbstractC21025xb0cc40f5
    public void e() {
        this.f274736i.mo50283x2f1920ea().f538836b.g();
    }

    @Override // com.p314xaae8f345.mm.p2613x7643c6b5.AbstractC21025xb0cc40f5
    public void f(android.content.Intent intent, int i17) {
        android.os.Message mo50288x733c63a2 = this.f274736i.mo50288x733c63a2();
        mo50288x733c63a2.arg1 = i17;
        mo50288x733c63a2.obj = intent;
        this.f274736i.mo50308x2936bf5f(mo50288x733c63a2);
    }

    @Override // com.p314xaae8f345.mm.p2613x7643c6b5.AbstractC21025xb0cc40f5
    public int g(android.content.Intent intent, int i17, int i18) {
        f(intent, i18);
        return 2;
    }

    public abstract void i(android.content.Intent intent);
}
