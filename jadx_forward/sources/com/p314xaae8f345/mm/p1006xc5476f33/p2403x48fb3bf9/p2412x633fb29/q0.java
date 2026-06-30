package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29;

/* loaded from: classes5.dex */
public class q0 extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f264597d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f264598e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f264599f;

    /* renamed from: g, reason: collision with root package name */
    public final int f264600g;

    public q0() {
        this(null, null, null, 7, null);
        int mo75927x8ded05a8 = super.mo75927x8ded05a8(new com.p314xaae8f345.mm.p2495xc50a8b8b.k[]{com.p314xaae8f345.mm.p2495xc50a8b8b.i.u(-1, com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811), com.p314xaae8f345.mm.p2495xc50a8b8b.i.u(-1, com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28), com.p314xaae8f345.mm.p2495xc50a8b8b.i.t(-1, "chatRecords", com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.r0.class, "")});
        this.f264600g = mo75927x8ded05a8;
        super.m126741x8589bfe1("chatLogInfo");
        super.m126744x8061d213("");
        super.m126742x3674fae4(true);
        super.m75950x7e1708ed(mo75927x8ded05a8, new java.lang.Object[]{this.f264597d, this.f264598e, this.f264599f});
    }

    public java.util.LinkedList j() {
        return super.m75940x3e48ce4d(this.f264600g + 2);
    }

    public /* synthetic */ q0(java.lang.String str, java.lang.String str2, java.util.LinkedList linkedList, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this((i17 & 1) != 0 ? "" : str, (i17 & 2) != 0 ? "" : str2, (i17 & 4) != 0 ? new java.util.LinkedList() : linkedList);
        super.m75950x7e1708ed(this.f264600g, new java.lang.Object[]{this.f264597d, this.f264598e, this.f264599f});
    }

    public q0(java.lang.String scene, java.lang.String title, java.util.LinkedList<com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.r0> chatRecords) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scene, "scene");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(title, "title");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(chatRecords, "chatRecords");
        this.f264597d = scene;
        this.f264598e = title;
        this.f264599f = chatRecords;
        super.m75950x7e1708ed(this.f264600g, new java.lang.Object[]{scene, title, chatRecords});
    }
}
