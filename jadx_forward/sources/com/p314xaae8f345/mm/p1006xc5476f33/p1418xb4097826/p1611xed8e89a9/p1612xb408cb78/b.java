package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1612xb408cb78;

/* loaded from: classes2.dex */
public final class b implements com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1612xb408cb78.q {

    /* renamed from: a, reason: collision with root package name */
    public final android.app.Activity f204887a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1612xb408cb78.p f204888b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f204889c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f204890d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1612xb408cb78.C14877xc2c814e1 f204891e;

    public b(android.app.Activity context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1612xb408cb78.p collectionInfoList, java.lang.String username) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(collectionInfoList, "collectionInfoList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        this.f204887a = context;
        this.f204888b = collectionInfoList;
        this.f204889c = username;
        this.f204890d = new java.util.ArrayList();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1612xb408cb78.q
    /* renamed from: getView */
    public android.view.View mo58632xfb86a31b() {
        return this.f204891e;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1612xb408cb78.q
    /* renamed from: hasData */
    public boolean mo58633x29831964() {
        return !this.f204888b.d().isEmpty();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1612xb408cb78.q
    public void k(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1612xb408cb78.C14877xc2c814e1 c14877xc2c814e1 = this.f204891e;
        if (c14877xc2c814e1 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderCollectionFilterView", "notifyCoverChange: " + z17);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1612xb408cb78.b bVar = c14877xc2c814e1.f204874d;
            if (bVar == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("presenter");
                throw null;
            }
            java.util.Iterator it = bVar.f204890d.iterator();
            while (it.hasNext()) {
                ((so2.d0) it.next()).getClass();
            }
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25 = c14877xc2c814e1.f204875e;
            if (c22849x81a93d25 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
                throw null;
            }
            p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = c22849x81a93d25.mo7946xf939df19();
            if (mo7946xf939df19 != null) {
                mo7946xf939df19.m8146xced61ae5();
            }
            int color = z17 ? c14877xc2c814e1.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560655ql) : c14877xc2c814e1.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77762x20e833);
            android.widget.TextView textView = (android.widget.TextView) c14877xc2c814e1.findViewById(com.p314xaae8f345.mm.R.id.e4c);
            if (textView != null) {
                textView.setTextColor(color);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1612xb408cb78.q
    public void l() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1612xb408cb78.C14877xc2c814e1 c14877xc2c814e1 = this.f204891e;
        if (c14877xc2c814e1 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderCollectionFilterView", "refresh");
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25 = c14877xc2c814e1.f204875e;
            if (c22849x81a93d25 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
                throw null;
            }
            p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = c22849x81a93d25.mo7946xf939df19();
            if (mo7946xf939df19 != null) {
                mo7946xf939df19.m8146xced61ae5();
            }
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d252 = c14877xc2c814e1.f204875e;
            if (c22849x81a93d252 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
                throw null;
            }
            c22849x81a93d252.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1612xb408cb78.e(c14877xc2c814e1));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderCollectionFilterContract", "refresh, dataList size:" + this.f204890d.size());
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1612xb408cb78.q
    public android.view.View n(int i17) {
        java.util.ArrayList arrayList = this.f204890d;
        arrayList.clear();
        java.util.LinkedList d17 = this.f204888b.d();
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(d17, 10));
        java.util.Iterator it = d17.iterator();
        while (it.hasNext()) {
            arrayList2.add(new so2.d0((r45.vx0) it.next()));
        }
        arrayList.addAll(arrayList2);
        android.app.Activity context = this.f204887a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1612xb408cb78.C14877xc2c814e1 c14877xc2c814e1 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1612xb408cb78.C14877xc2c814e1(context);
        c14877xc2c814e1.a(this);
        if (arrayList.isEmpty()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1612xb408cb78.C14877xc2c814e1 c14877xc2c814e12 = this.f204891e;
            if (c14877xc2c814e12 != null) {
                c14877xc2c814e12.setVisibility(8);
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
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1612xb408cb78.C14877xc2c814e1 c14877xc2c814e13 = this.f204891e;
                if (c14877xc2c814e13 != null) {
                    c14877xc2c814e13.setVisibility(0);
                }
            }
        }
        this.f204891e = c14877xc2c814e1;
        return c14877xc2c814e1;
    }
}
