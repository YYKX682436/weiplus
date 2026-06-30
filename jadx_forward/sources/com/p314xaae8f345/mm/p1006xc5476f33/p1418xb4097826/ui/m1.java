package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

/* loaded from: classes3.dex */
public final class m1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.ix0 f211024d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15013x60db486b f211025e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.kh2 f211026f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(r45.ix0 ix0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15013x60db486b activityC15013x60db486b, r45.kh2 kh2Var) {
        super(0);
        this.f211024d = ix0Var;
        this.f211025e = activityC15013x60db486b;
        this.f211026f = kh2Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.Object obj;
        int m75939xb282bd08 = this.f211024d.m75939xb282bd08(1);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15013x60db486b activityC15013x60db486b = this.f211025e;
        if (m75939xb282bd08 == 0) {
            java.util.Iterator it = activityC15013x60db486b.f210050w.iterator();
            while (true) {
                obj = null;
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                if (r26.i0.q(((r45.q21) next).m75945x2fec8307(2), this.f211026f.m75945x2fec8307(4), false, 2, null)) {
                    obj = next;
                    break;
                }
            }
            r45.q21 q21Var = (r45.q21) obj;
            if (q21Var != null) {
                java.util.ArrayList arrayList = activityC15013x60db486b.f210050w;
                arrayList.remove(q21Var);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.e eVar = activityC15013x60db486b.f210049v;
                eVar.c(arrayList);
                eVar.notifyDataSetChanged();
                activityC15013x60db486b.e7();
            }
        } else {
            db5.t7.m123883x26a183b(activityC15013x60db486b.mo55332x76847179(), activityC15013x60db486b.mo55332x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.d1v), 0).show();
        }
        return jz5.f0.f384359a;
    }
}
