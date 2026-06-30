package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

/* loaded from: classes2.dex */
public final class r5 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13973x24fcfd83 f192014d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r5(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13973x24fcfd83 activityC13973x24fcfd83) {
        super(3);
        this.f192014d = activityC13973x24fcfd83;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        r45.lu2 hotWord = (r45.lu2) obj;
        int intValue = ((java.lang.Number) obj2).intValue();
        java.util.List list = (java.util.List) obj3;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(hotWord, "hotWord");
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13973x24fcfd83.f190831v;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13973x24fcfd83 activityC13973x24fcfd83 = this.f192014d;
        activityC13973x24fcfd83.getClass();
        android.content.Intent intent = new android.content.Intent();
        java.lang.String m75945x2fec8307 = hotWord.m75945x2fec8307(0);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(m75945x2fec8307)) {
            if (m75945x2fec8307 == null) {
                m75945x2fec8307 = "";
            }
            intent.putExtra("key_search_query", m75945x2fec8307);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f = hotWord.m75934xbce7f2f(4);
            intent.putExtra("key_search_session_buffer", m75934xbce7f2f != null ? m75934xbce7f2f.g() : null);
            intent.putExtra("key_search_hot_word_info", com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.p1626x2eefaa.C14955x327ee410.f36128x681a0c0c.a(hotWord, intValue, list));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0 i0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC13973x24fcfd83.mo55332x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x76847179, "getContext(...)");
        i0Var.wj(mo55332x76847179, null, intent);
        return jz5.f0.f384359a;
    }
}
