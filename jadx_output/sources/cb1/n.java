package cb1;

/* loaded from: classes7.dex */
public final class n implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ cb1.j0 f40272a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.v5 f40273b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f40274c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f40275d;

    public n(cb1.j0 j0Var, com.tencent.mm.plugin.appbrand.page.v5 v5Var, java.lang.String str, boolean z17) {
        this.f40272a = j0Var;
        this.f40273b = v5Var;
        this.f40274c = str;
        this.f40275d = z17;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x004a, code lost:
    
        if (r0 != false) goto L17;
     */
    @Override // gm5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object call(java.lang.Object r10) {
        /*
            r9 = this;
            nm5.b r10 = (nm5.b) r10
            vi1.l2 r0 = vi1.l2.f437401a
            com.tencent.mm.plugin.appbrand.page.v5 r3 = r9.f40273b
            java.lang.String r1 = r3.getAppId()
            java.lang.String r2 = "getAppId(...)"
            kotlin.jvm.internal.o.f(r1, r2)
            vi1.j2 r2 = r0.a(r1)
            java.lang.String r4 = r9.f40274c
            java.lang.String r0 = "$apiName"
            kotlin.jvm.internal.o.f(r4, r0)
            boolean r5 = r9.f40275d
            cb1.j0 r0 = r9.f40272a
            r0.getClass()
            r0 = 0
            if (r10 == 0) goto L2b
            java.lang.Object r1 = r10.a(r0)
            java.util.List r1 = (java.util.List) r1
            goto L2c
        L2b:
            r1 = 0
        L2c:
            if (r1 == 0) goto L4c
            boolean r6 = r1.isEmpty()
            if (r6 != 0) goto L4c
            java.util.Iterator r1 = r1.iterator()
        L38:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L49
            java.lang.Object r6 = r1.next()
            com.tencent.mm.plugin.appbrand.phonenumber.PhoneItem r6 = (com.tencent.mm.plugin.appbrand.phonenumber.PhoneItem) r6
            boolean r6 = r6.f87406n
            if (r6 == 0) goto L38
            goto L4a
        L49:
            r0 = 1
        L4a:
            if (r0 == 0) goto L73
        L4c:
            java.lang.String r0 = "MicroMsg.JsApiGetPhoneNumberNew"
            java.lang.String r1 = "phoneItems is null, tryToBindWechatPhoneNumber"
            com.tencent.mars.xlog.Log.e(r0, r1)
            if (r2 != 0) goto L56
            goto L5a
        L56:
            r0 = 1
            r2.f437352a = r0
        L5a:
            km5.b r6 = km5.u.c()
            android.content.Context r0 = r3.getF147807d()
            if (r0 == 0) goto L73
            vi1.l1 r1 = vi1.l1.f437399a
            vi1.g0 r7 = r1.a()
            cb1.v r8 = new cb1.v
            r1 = r8
            r1.<init>(r2, r3, r4, r5, r6)
            r7.o8(r0, r8)
        L73:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: cb1.n.call(java.lang.Object):java.lang.Object");
    }
}
