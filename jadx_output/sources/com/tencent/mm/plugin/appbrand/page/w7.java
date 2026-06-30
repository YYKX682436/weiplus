package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public class w7 extends zl1.z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.n7 f87200a;

    public w7(com.tencent.mm.plugin.appbrand.page.n7 n7Var) {
        this.f87200a = n7Var;
    }

    @Override // zl1.z
    public void a(android.graphics.Bitmap bitmap, zl1.y yVar) {
        super.a(bitmap, yVar);
        al1.b r17 = this.f87200a.r1();
        com.tencent.mm.plugin.appbrand.page.v7 v7Var = new com.tencent.mm.plugin.appbrand.page.v7(this);
        r17.getClass();
        r17.post(new al1.d(r17, bitmap, v7Var));
    }
}
