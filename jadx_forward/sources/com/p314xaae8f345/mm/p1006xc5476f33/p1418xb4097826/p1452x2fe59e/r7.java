package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes2.dex */
public final class r7 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.f8 f190428a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fp0.r f190429b;

    public r7(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.f8 f8Var, fp0.r rVar) {
        this.f190428a = f8Var;
        this.f190429b = rVar;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        java.util.ArrayList arrayList;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m82555x4905e9fa;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19;
        java.util.LinkedList linkedList = (java.util.LinkedList) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(linkedList);
        boolean z17 = !linkedList.isEmpty();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.f8 f8Var = this.f190428a;
        if (z17) {
            int size = f8Var.f188252p.size();
            java.util.Iterator it = linkedList.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                arrayList = f8Var.f188252p;
                if (!hasNext) {
                    break;
                }
                r45.s21 s21Var = (r45.s21) it.next();
                java.util.Iterator it6 = arrayList.iterator();
                int i17 = 0;
                while (true) {
                    if (!it6.hasNext()) {
                        i17 = -1;
                        break;
                    }
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((so2.c1) it6.next()).f491821d.f466961f, s21Var.f466961f)) {
                        break;
                    }
                    i17++;
                }
                if (!(i17 >= 0)) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(s21Var);
                    arrayList.add(new so2.c1(s21Var, f8Var.a().m59298x5bcf3ee6()));
                }
            }
            yw2.f fVar = f8Var.f188253q;
            if (fVar != null && (m82555x4905e9fa = fVar.n().m82555x4905e9fa()) != null && (mo7946xf939df19 = m82555x4905e9fa.mo7946xf939df19()) != null) {
                mo7946xf939df19.m8153xd399a4d9(size, arrayList.size() - size);
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.FavListDrawerPresenter", "[loadMoreData] empty!");
        }
        ym5.s3 s3Var = new ym5.s3(0);
        s3Var.f545054f = f8Var.f188258v;
        int size2 = linkedList.size();
        s3Var.f545056h = size2;
        if (size2 > 0) {
            s3Var.f545055g = false;
        }
        yw2.f fVar2 = f8Var.f188253q;
        if (fVar2 != null) {
            fVar2.n().mo56054xc12c74c0(s3Var);
        }
        this.f190429b.b(fp0.u.f346823f);
        return jz5.f0.f384359a;
    }
}
