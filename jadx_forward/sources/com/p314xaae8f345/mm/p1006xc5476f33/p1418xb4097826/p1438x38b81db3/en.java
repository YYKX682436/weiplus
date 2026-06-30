package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class en extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.yn f184804d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f184805e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15195x130b2a6d f184806f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f184807g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public en(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.yn ynVar, in5.s0 s0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15195x130b2a6d c15195x130b2a6d, android.view.View view) {
        super(0);
        this.f184804d = ynVar;
        this.f184805e = s0Var;
        this.f184806f = c15195x130b2a6d;
        this.f184807g = view;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f c15196x85976f5f;
        cw2.h8 playInfo;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.yn ynVar = this.f184804d;
        in5.s0 s0Var = this.f184805e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.yn.Q1(ynVar, s0Var, true);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15195x130b2a6d c15195x130b2a6d = this.f184806f;
        cw2.ba baVar = c15195x130b2a6d.f212236y0;
        if (baVar != null && (playInfo = (c15196x85976f5f = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f) baVar).getPlayInfo()) != null) {
            playInfo.f305288k = !(c15196x85976f5f.getVideoView() != null ? r3.mo58787xc00617a4() : false);
        }
        c15195x130b2a6d.f212235x1 = true;
        android.view.View view = this.f184807g;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/convert/FinderLongVideoConvert$convertMedia$2", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/convert/FinderLongVideoConvert$convertMedia$2", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View p17 = s0Var.p(com.p314xaae8f345.mm.R.id.g99);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(p17, arrayList2.toArray(), "com/tencent/mm/plugin/finder/convert/FinderLongVideoConvert$convertMedia$2", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p17.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(p17, "com/tencent/mm/plugin/finder/convert/FinderLongVideoConvert$convertMedia$2", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        return jz5.f0.f384359a;
    }
}
