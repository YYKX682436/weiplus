package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/finder/profile/FinderProfileCourseFragment;", "Lcom/tencent/mm/plugin/finder/ui/fragment/FinderHomeTabFragment;", "Lcom/tencent/mm/plugin/finder/profile/uic/je;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.profile.FinderProfileCourseFragment */
/* loaded from: classes2.dex */
public final class C14865x57cd08ee extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15124x7bae6180 implements com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.je {

    /* renamed from: t, reason: collision with root package name */
    public java.util.List f204816t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f204817u;

    public C14865x57cd08ee() {
        this.f210798p = 105;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.je
    public void k(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.j2 j2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.j2) pf5.z.f435481a.b(this).e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.j2.class);
        if (j2Var != null) {
            jz5.g gVar = j2Var.f205358m;
            if (z17) {
                ((vb2.y) ((jz5.n) gVar).mo141623x754a37bb()).f516310b.setBackgroundResource(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e);
            } else {
                ((vb2.y) ((jz5.n) gVar).mo141623x754a37bb()).f516310b.setBackgroundResource(com.p314xaae8f345.mm.R.C30859x5a72f63.f560027f);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22277x94c24639
    /* renamed from: l0 */
    public java.util.Set getF204828n() {
        return kz5.o1.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.j2.class);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15133xf6dcb656, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22277x94c24639, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onViewCreated */
    public void mo7518x594b1124(android.view.View view, android.os.Bundle bundle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        super.mo7518x594b1124(view, bundle);
        java.util.List list = this.f204816t;
        java.lang.String str = this.f204817u;
        if (list == null || str == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.j2 j2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.j2) pf5.z.f435481a.b(this).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.j2.class);
        byte[] bytes = str.getBytes(r26.c.f450398a);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = new com.p314xaae8f345.mm.p2495xc50a8b8b.g(bytes, 0, bytes.length);
        j2Var.getClass();
        j2Var.O6().f189110f = list;
        j2Var.O6().f189111g = gVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122.m56345x587162dc(j2Var.O6(), false, 1, null);
    }
}
