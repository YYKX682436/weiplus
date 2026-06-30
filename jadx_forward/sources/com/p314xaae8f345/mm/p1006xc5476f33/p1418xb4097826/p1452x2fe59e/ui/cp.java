package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

/* loaded from: classes3.dex */
public final class cp extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14121xff3e46f f191451d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cp(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14121xff3e46f activityC14121xff3e46f) {
        super(1);
        this.f191451d = activityC14121xff3e46f;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.String word = (java.lang.String) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(word, "word");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14121xff3e46f activityC14121xff3e46f = this.f191451d;
        bm2.w7 w7Var = activityC14121xff3e46f.f191152z;
        w7Var.getClass();
        java.util.ArrayList arrayList = (java.util.ArrayList) w7Var.f103950e;
        int indexOf = arrayList.indexOf(word);
        arrayList.remove(word);
        w7Var.m8155x27702c4(indexOf);
        activityC14121xff3e46f.g7(w7Var.mo1894x7e414b06());
        p3325xe03a0797.p3326xc267989b.l.d(v65.m.b(activityC14121xff3e46f), null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.fp(activityC14121xff3e46f, word, null), 3, null);
        return jz5.f0.f384359a;
    }
}
