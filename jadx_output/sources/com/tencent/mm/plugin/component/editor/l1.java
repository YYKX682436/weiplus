package com.tencent.mm.plugin.component.editor;

/* loaded from: classes12.dex */
public class l1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f96591d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f96592e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.component.editor.EditorUI f96593f;

    public l1(com.tencent.mm.plugin.component.editor.EditorUI editorUI, java.lang.String str, java.lang.String str2) {
        this.f96593f = editorUI;
        this.f96591d = str;
        this.f96592e = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str = this.f96591d;
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(str);
        ix1.b bVar = new ix1.b();
        java.lang.String str2 = this.f96592e;
        bVar.f295339s = com.tencent.mm.sdk.platformtools.t8.K0(str2) ? r6Var.getName() : str2;
        bVar.f295340t = hx1.b.d((float) r6Var.C());
        bVar.f295323l = nx1.d.q().k();
        bVar.f295327p = 5;
        bVar.f295328q = true;
        bVar.f295341u = o35.a.f(str, str2);
        bVar.f295326o = r6Var.C();
        bVar.f295311a = hx1.b.a(bVar.toString(), 18);
        r45.gp0 gp0Var = new r45.gp0();
        com.tencent.mm.plugin.component.editor.EditorUI editorUI = this.f96593f;
        editorUI.f96516z = gp0Var;
        editorUI.f96516z.h0(8);
        editorUI.f96516z.e0(bVar.f295311a);
        editorUI.f96516z.i0(bVar.f295341u);
        r45.gp0 gp0Var2 = editorUI.f96516z;
        bVar.f295325n = gp0Var2;
        bVar.f295329r = hx1.b.c(gp0Var2);
        nx1.d q17 = nx1.d.q();
        q17.getClass();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(bVar);
        if (q17.e(arrayList)) {
            editorUI.f7();
        } else {
            com.tencent.mm.vfs.w6.c(str, bVar.f295329r);
            nx1.d.q().r(bVar, editorUI.f96503m.c(), true, true, false, true, false);
        }
        editorUI.k7(true, 100L);
        editorUI.j7(1, 0L);
    }
}
