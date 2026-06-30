package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes3.dex */
public abstract class hk {

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 f213781a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f213782b = "";

    /* renamed from: c, reason: collision with root package name */
    public final java.util.ArrayList f213783c = new java.util.ArrayList();

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.hk a(java.lang.String title, java.util.List dataList, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.dk dkVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(title, "title");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dataList, "dataList");
        this.f213782b = title;
        java.util.ArrayList arrayList = this.f213783c;
        arrayList.clear();
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(dataList, 10));
        java.util.Iterator it = dataList.iterator();
        while (it.hasNext()) {
            r45.u24 source = (r45.u24) it.next();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
            arrayList2.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.qo(source));
        }
        arrayList.addAll(arrayList2);
        if (i17 >= 0 && i17 < arrayList.size() && (dkVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.dk) kz5.n0.a0(arrayList, i17)) != null) {
            dkVar.f213434e = true;
        }
        return this;
    }

    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 b() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var = this.f213781a;
        if (y1Var != null) {
            return y1Var;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("bottomSheet");
        throw null;
    }

    public final void c(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f213781a = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1(context);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 b17 = b();
        b17.j(com.p314xaae8f345.mm.R.C30864xbddafb2a.b9d);
        b17.f293560f.setBackground(null);
        b17.f293560f.findViewById(com.p314xaae8f345.mm.R.id.euy).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.ek(this));
        android.widget.TextView textView = (android.widget.TextView) b17.f293560f.findViewById(com.p314xaae8f345.mm.R.id.mzj);
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25 = (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25) b17.f293560f.findViewById(com.p314xaae8f345.mm.R.id.mzi);
        textView.setText(this.f213782b);
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = new com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf(new in5.s() { // from class: com.tencent.mm.plugin.finder.view.FinderSingleSelectBottomSheet$getAdapter$1
            @Override // in5.s
            /* renamed from: getItemConvert */
            public in5.r mo43555xf2bb75ea(int type) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.so soVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.so) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.hk.this;
                soVar.getClass();
                return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.po(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.ro(soVar));
            }
        }, this.f213783c, false);
        c22848x6ddd90cf.f374638o = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.fk(this);
        c22849x81a93d25.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(context));
        c22849x81a93d25.mo7960x6cab2c8d(c22848x6ddd90cf);
        b().o(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.gk(this));
        b().s();
    }
}
