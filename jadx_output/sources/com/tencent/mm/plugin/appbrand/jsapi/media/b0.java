package com.tencent.mm.plugin.appbrand.jsapi.media;

/* loaded from: classes7.dex */
public final class b0 implements nf.n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ km5.b f81702a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f81703b;

    public b0(km5.b bVar, java.util.ArrayList arrayList) {
        this.f81702a = bVar;
        this.f81703b = arrayList;
    }

    @Override // nf.n
    public final void b(java.lang.String[] strArr, int[] iArr) {
        kotlin.jvm.internal.o.d(iArr);
        int length = iArr.length;
        int i17 = 0;
        int i18 = 0;
        while (true) {
            km5.b bVar = this.f81702a;
            if (i17 >= length) {
                bVar.c(java.lang.Boolean.TRUE);
                return;
            }
            int i19 = i18 + 1;
            if (iArr[i17] != 0) {
                bVar.a(new java.lang.IllegalAccessException("fail:system permission denied"));
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.ChooseMediaWorkFlow", "interrupt pipeline, " + ((java.lang.String) this.f81703b.get(i18)) + " denied by user");
                return;
            }
            i17++;
            i18 = i19;
        }
    }
}
