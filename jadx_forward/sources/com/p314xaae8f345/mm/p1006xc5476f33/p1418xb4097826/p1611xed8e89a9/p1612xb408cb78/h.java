package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1612xb408cb78;

/* loaded from: classes2.dex */
public final class h implements com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1612xb408cb78.q {

    /* renamed from: a, reason: collision with root package name */
    public final android.app.Activity f204897a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.ArrayList f204898b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f204899c;

    /* renamed from: d, reason: collision with root package name */
    public final int f204900d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f204901e;

    /* renamed from: f, reason: collision with root package name */
    public yz5.p f204902f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f204903g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1612xb408cb78.C14879x7c6ab7a6 f204904h;

    public h(android.app.Activity context, java.util.ArrayList outerDataList, java.lang.String username, int i17, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        i17 = (i18 & 8) != 0 ? 1 : i17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outerDataList, "outerDataList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        this.f204897a = context;
        this.f204898b = outerDataList;
        this.f204899c = username;
        this.f204900d = i17;
        this.f204901e = new java.util.ArrayList();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1612xb408cb78.q
    /* renamed from: getView */
    public android.view.View mo58632xfb86a31b() {
        return this.f204904h;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1612xb408cb78.q
    /* renamed from: hasData */
    public boolean mo58633x29831964() {
        return !this.f204898b.isEmpty();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1612xb408cb78.q
    public void k(boolean z17) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19;
        java.util.ArrayList arrayList;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1612xb408cb78.C14879x7c6ab7a6 c14879x7c6ab7a6 = this.f204904h;
        if (c14879x7c6ab7a6 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1612xb408cb78.h hVar = c14879x7c6ab7a6.presenter;
            if (hVar != null) {
                hVar.f204903g = z17;
            }
            if (hVar != null && (arrayList = hVar.f204901e) != null) {
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((so2.e5) it.next()).f491866g = z17;
                }
            }
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25 = c14879x7c6ab7a6.recyclerView;
            if (c22849x81a93d25 != null && (mo7946xf939df19 = c22849x81a93d25.mo7946xf939df19()) != null) {
                mo7946xf939df19.m8146xced61ae5();
            }
            int color = z17 ? c14879x7c6ab7a6.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560655ql) : c14879x7c6ab7a6.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77762x20e833);
            android.widget.TextView textView = (android.widget.TextView) c14879x7c6ab7a6.findViewById(com.p314xaae8f345.mm.R.id.e4c);
            if (textView != null) {
                textView.setTextColor(color);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1612xb408cb78.q
    public void l() {
        java.util.ArrayList arrayList = this.f204901e;
        boolean isEmpty = arrayList.isEmpty();
        arrayList.clear();
        java.util.ArrayList arrayList2 = this.f204898b;
        java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(arrayList2, 10));
        java.util.Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            so2.e5 e5Var = new so2.e5((r45.r03) it.next(), this.f204900d);
            e5Var.f491866g = this.f204903g;
            arrayList3.add(e5Var);
        }
        arrayList.addAll(arrayList3);
        if (arrayList.isEmpty()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1612xb408cb78.C14879x7c6ab7a6 c14879x7c6ab7a6 = this.f204904h;
            if (c14879x7c6ab7a6 != null) {
                c14879x7c6ab7a6.setVisibility(8);
            }
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1612xb408cb78.C14879x7c6ab7a6 c14879x7c6ab7a62 = this.f204904h;
            if (c14879x7c6ab7a62 != null) {
                c14879x7c6ab7a62.setVisibility(0);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1612xb408cb78.C14879x7c6ab7a6 c14879x7c6ab7a63 = this.f204904h;
        if (c14879x7c6ab7a63 != null) {
            c14879x7c6ab7a63.d();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderTopicFilterContract", "refresh, dataList size:" + arrayList.size());
        if (isEmpty && (!arrayList.isEmpty())) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68478xbd3cda5f(21570, this.f204899c + ",1,");
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1612xb408cb78.q
    public android.view.View n(int i17) {
        java.util.ArrayList arrayList = this.f204901e;
        arrayList.clear();
        java.util.ArrayList arrayList2 = this.f204898b;
        java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(arrayList2, 10));
        java.util.Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            so2.e5 e5Var = new so2.e5((r45.r03) it.next(), i17);
            e5Var.f491866g = this.f204903g;
            arrayList3.add(e5Var);
        }
        arrayList.addAll(arrayList3);
        android.app.Activity context = this.f204897a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1612xb408cb78.C14879x7c6ab7a6 c14879x7c6ab7a6 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1612xb408cb78.C14879x7c6ab7a6(context);
        c14879x7c6ab7a6.c(this);
        c14879x7c6ab7a6.d();
        if (arrayList.isEmpty()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1612xb408cb78.C14879x7c6ab7a6 c14879x7c6ab7a62 = this.f204904h;
            if (c14879x7c6ab7a62 != null) {
                c14879x7c6ab7a62.setVisibility(8);
            }
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            pf5.z zVar = pf5.z.f435481a;
            if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.C14900x9bf524dd c14900x9bf524dd = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.C14900x9bf524dd) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.C14900x9bf524dd.class);
            if (c14900x9bf524dd != null) {
                c14900x9bf524dd.f204996y = true;
                c14900x9bf524dd.V6();
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1612xb408cb78.C14879x7c6ab7a6 c14879x7c6ab7a63 = this.f204904h;
                if (c14879x7c6ab7a63 != null) {
                    c14879x7c6ab7a63.setVisibility(0);
                }
            }
        }
        this.f204904h = c14879x7c6ab7a6;
        return c14879x7c6ab7a6;
    }
}
