package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4;

/* loaded from: classes7.dex */
public final class b0 implements nf.n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ km5.b f163235a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f163236b;

    public b0(km5.b bVar, java.util.ArrayList arrayList) {
        this.f163235a = bVar;
        this.f163236b = arrayList;
    }

    @Override // nf.n
    public final void b(java.lang.String[] strArr, int[] iArr) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(iArr);
        int length = iArr.length;
        int i17 = 0;
        int i18 = 0;
        while (true) {
            km5.b bVar = this.f163235a;
            if (i17 >= length) {
                bVar.c(java.lang.Boolean.TRUE);
                return;
            }
            int i19 = i18 + 1;
            if (iArr[i17] != 0) {
                bVar.a(new java.lang.IllegalAccessException("fail:system permission denied"));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.ChooseMediaWorkFlow", "interrupt pipeline, " + ((java.lang.String) this.f163236b.get(i18)) + " denied by user");
                return;
            }
            i17++;
            i18 = i19;
        }
    }
}
