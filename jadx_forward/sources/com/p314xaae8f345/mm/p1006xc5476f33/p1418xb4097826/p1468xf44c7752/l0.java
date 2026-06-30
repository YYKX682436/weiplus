package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752;

/* loaded from: classes2.dex */
public final class l0 implements in5.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf f192922d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.C14156x47847a0e f192923e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f192924f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.i f192925g;

    public l0(com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.C14156x47847a0e c14156x47847a0e, java.util.ArrayList arrayList, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.i iVar) {
        this.f192922d = c22848x6ddd90cf;
        this.f192923e = c14156x47847a0e;
        this.f192924f = arrayList;
        this.f192925g = iVar;
    }

    @Override // in5.x
    public void s2(p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 adapter, android.view.View view, int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        java.lang.Object obj;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19;
        in5.s0 holder = (in5.s0) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adapter, "adapter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        int a07 = i17 - this.f192922d.a0();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.C14156x47847a0e c14156x47847a0e = this.f192923e;
        java.lang.String str = c14156x47847a0e.f192872d;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("click item ");
        java.util.ArrayList arrayList = this.f192924f;
        if (a07 < 0 || a07 >= arrayList.size()) {
            obj = "";
        } else {
            obj = arrayList.get(a07);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
        }
        sb6.append(obj);
        sb6.append(" pos:");
        sb6.append(a07);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.j0 j0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.j0) holder.f374658i;
        if (j0Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.i0 i0Var = j0Var.f192919d;
            int i18 = i0Var.f192916a;
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("select item hash:");
            sb7.append(j0Var.hashCode());
            sb7.append(", title:");
            java.lang.String str2 = i0Var.f192917b;
            sb7.append(str2);
            sb7.append(", selected:");
            sb7.append(j0Var.f192920e);
            java.lang.String sb8 = sb7.toString();
            java.lang.String str3 = c14156x47847a0e.f192872d;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, sb8);
            java.util.Iterator it = arrayList.iterator();
            while (true) {
                boolean z17 = true;
                if (!it.hasNext()) {
                    break;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.j0 j0Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.j0) it.next();
                if (j0Var2.f192919d.f192916a != i18) {
                    z17 = false;
                }
                j0Var2.f192920e = z17;
            }
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 recyclerView = c14156x47847a0e.getRecyclerView();
            if (recyclerView != null && (mo7946xf939df19 = recyclerView.mo7946xf939df19()) != null) {
                mo7946xf939df19.m8152xc67946d3(0, mo7946xf939df19.mo1894x7e414b06(), 1);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, "refresh itemCount:" + mo7946xf939df19.mo1894x7e414b06());
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.i iVar = this.f192925g;
            iVar.getClass();
            java.util.Iterator it6 = iVar.f192909f.iterator();
            int i19 = 0;
            while (true) {
                if (!it6.hasNext()) {
                    i19 = -1;
                    break;
                } else {
                    if (((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.j0) it6.next()).f192919d.f192916a == i0Var.f192916a) {
                        break;
                    } else {
                        i19++;
                    }
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(iVar.f192907d, "onSelectTab title:" + str2 + ", index:" + i19);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15359x536ace78 c15359x536ace78 = iVar.f192910g;
            if (c15359x536ace78.m8300xfda78ef6() != i19) {
                c15359x536ace78.m8317x940d026a(i19, false);
            }
        }
    }
}
