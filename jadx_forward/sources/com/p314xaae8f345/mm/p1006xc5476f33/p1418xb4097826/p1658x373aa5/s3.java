package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes10.dex */
public final class s3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f214544d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15258xcd50c176 f214545e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.CharSequence f214546f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f214547g;

    public s3(android.view.View view, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15258xcd50c176 c15258xcd50c176, java.lang.CharSequence charSequence, yz5.l lVar) {
        this.f214544d = view;
        this.f214545e = c15258xcd50c176;
        this.f214546f = charSequence;
        this.f214547g = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int width = this.f214544d.getWidth();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15258xcd50c176 c15258xcd50c176 = this.f214545e;
        if (width > 0) {
            c15258xcd50c176.m61722x390676d5().m84171x2778bcd8(new float[]{width});
        }
        c15258xcd50c176.m61745x765074af(this.f214546f);
        this.f214547g.mo146xb9724478(java.lang.Boolean.valueOf(c15258xcd50c176.m61722x390676d5().f296711e));
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3 o3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
        android.content.Context context = c15258xcd50c176.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        o3Var.vk(context, true, 0, c15258xcd50c176.isCollapse, c15258xcd50c176.isTopicExpand);
    }
}
