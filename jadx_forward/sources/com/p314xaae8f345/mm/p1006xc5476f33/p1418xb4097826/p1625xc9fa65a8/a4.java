package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8;

/* loaded from: classes2.dex */
public final class a4 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.b4 f207150d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a4(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.b4 b4Var) {
        super(1);
        this.f207150d = b4Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.b4 b4Var = this.f207150d;
        int i17 = fVar != null ? fVar.f152148a : 0;
        int i18 = fVar != null ? fVar.f152149b : 0;
        r45.iu2 iu2Var = fVar != null ? (r45.iu2) fVar.f152151d : null;
        b4Var.getClass();
        if (i17 == 0 && i18 == 0 && iu2Var != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onSceneEnd getHotWords : ");
            java.util.LinkedList m75941xfb821914 = iu2Var.m75941xfb821914(1);
            sb6.append(m75941xfb821914 != null ? m75941xfb821914.size() : -1);
            sb6.append(' ');
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderPopularListLogic", sb6.toString());
            java.util.LinkedList m75941xfb8219142 = iu2Var.m75941xfb821914(1);
            if (m75941xfb8219142 != null) {
                java.util.Iterator it = m75941xfb8219142.iterator();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(it, "iterator(...)");
                while (it.hasNext()) {
                    java.lang.Object next = it.next();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(next, "next(...)");
                    if (((r45.lu2) next).m75939xb282bd08(1) != 1) {
                        it.remove();
                    }
                }
            }
            android.widget.TextView textView = b4Var.f207168f;
            java.lang.String m75945x2fec8307 = iu2Var.m75945x2fec8307(2);
            if (m75945x2fec8307 == null) {
                m75945x2fec8307 = b4Var.f207166d.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573589f31);
            }
            textView.setText(m75945x2fec8307);
            b4Var.a(m75941xfb8219142, true);
            if (m75941xfb8219142 == null) {
                m75941xfb8219142 = new java.util.LinkedList();
            }
            r45.cp2 cp2Var = new r45.cp2();
            cp2Var.set(1, m75941xfb8219142);
            cp2Var.set(0, java.lang.Long.valueOf(c01.id.e()));
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.y3.f207519c = cp2Var;
            ((ku5.t0) ku5.t0.f394148d).g(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.x3.f207510d);
            b4Var.b();
        }
        return jz5.f0.f384359a;
    }
}
