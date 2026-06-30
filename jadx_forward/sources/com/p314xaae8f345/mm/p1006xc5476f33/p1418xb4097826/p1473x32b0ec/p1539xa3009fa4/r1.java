package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4;

/* loaded from: classes9.dex */
public final class r1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.s1 f198885d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.s1 s1Var) {
        super(0);
        this.f198885d = s1Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.s1 s1Var = this.f198885d;
        boolean z17 = true;
        if (!s1Var.f198913o.isEmpty()) {
            java.util.List K0 = kz5.n0.K0(s1Var.f198913o, 8);
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(K0, 10));
            java.util.Iterator it = K0.iterator();
            while (it.hasNext()) {
                arrayList.add(new cm2.k((r45.c73) it.next()));
            }
            bm2.c cVar = s1Var.f198914p;
            cVar.getClass();
            java.util.ArrayList arrayList2 = cVar.f103336d;
            arrayList2.clear();
            arrayList2.addAll(arrayList);
            cVar.m8146xced61ae5();
            android.widget.EditText editText = s1Var.f198911m;
            if (editText == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("editText");
                throw null;
            }
            android.text.Editable text = editText.getText();
            java.lang.String obj = text != null ? text.toString() : null;
            if (obj != null && obj.length() != 0) {
                z17 = false;
            }
            if (z17 && cVar.mo1894x7e414b06() > 0) {
                android.widget.LinearLayout linearLayout = s1Var.f198909h;
                if (linearLayout == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("container");
                    throw null;
                }
                linearLayout.setVisibility(0);
            }
        }
        return jz5.f0.f384359a;
    }
}
