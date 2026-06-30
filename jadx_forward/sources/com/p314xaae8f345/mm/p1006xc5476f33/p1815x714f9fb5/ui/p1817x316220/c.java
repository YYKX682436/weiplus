package com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220;

/* loaded from: classes15.dex */
public class c implements u60.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.a f226290a;

    public c(com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.a aVar) {
        this.f226290a = aVar;
    }

    @Override // u60.e
    /* renamed from: onLocationAddr */
    public void mo24721x71c058c5(com.p314xaae8f345.mm.p949xdb1a5788.C11121x1f1011 c11121x1f1011) {
        c11121x1f1011.m48126x9616526c();
        com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.a aVar = this.f226290a;
        aVar.getClass();
        java.lang.String b17 = c11121x1f1011.b();
        com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.p1816x633fb29.C16279x64cea23 c16279x64cea23 = aVar.f226265h;
        android.content.res.Resources resources = aVar.f226261d.getResources();
        aVar.getClass();
        c16279x64cea23.f226124m = resources.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ggg);
        java.lang.Object obj = c11121x1f1011.f152760w;
        if (obj != null && obj.equals(aVar.f226265h.f226118d)) {
            aVar.f226265h.f226122h = b17;
        } else if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c11121x1f1011.f152744d)) {
            aVar.f226266i.f226332a.setVisibility(0);
        }
        java.lang.Object obj2 = c11121x1f1011.f152760w;
        if (obj2 == null || !aVar.f226267m.containsKey(obj2)) {
            return;
        }
        za3.c cVar = (za3.c) aVar.f226267m.get(c11121x1f1011.f152760w);
        cVar.mo65933x765074af(cVar.mo65930x2ac69e3a() + b17);
    }
}
