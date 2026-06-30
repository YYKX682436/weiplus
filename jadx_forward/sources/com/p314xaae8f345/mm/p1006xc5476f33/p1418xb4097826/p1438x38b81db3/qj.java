package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class qj extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f185930d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.uj f185931e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qj(in5.s0 s0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.uj ujVar) {
        super(0);
        this.f185930d = s0Var;
        this.f185931e = ujVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.content.Context context = this.f185930d.f374654e;
        final com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f activityC21401x6ce6f73f = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f) context : null;
        if (activityC21401x6ce6f73f != null) {
            final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.uj ujVar = this.f185931e;
            ujVar.o(activityC21401x6ce6f73f);
            td2.c cVar = new td2.c() { // from class: com.tencent.mm.plugin.finder.convert.FinderFeedProductConvert$bindLifeCycle$1
                @Override // td2.c
                /* renamed from: onCreate */
                public void mo55613x3e5a77bb(p012xc85e97e9.p093xedfae76a.y var1) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(var1, "var1");
                }

                @Override // td2.c
                /* renamed from: onDestroy */
                public void mo55614xac79a11b(p012xc85e97e9.p093xedfae76a.y var1) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(var1, "var1");
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.uj ujVar2 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.uj.this;
                    com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f activityC21401x6ce6f73f2 = activityC21401x6ce6f73f;
                    ujVar2.o(activityC21401x6ce6f73f2);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(ujVar2.f186242e, "auto life remove " + activityC21401x6ce6f73f2);
                }

                @Override // td2.c
                /* renamed from: onPause */
                public void mo55615xb01dfb57(p012xc85e97e9.p093xedfae76a.y var1) {
                    android.view.ViewGroup viewGroup;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(var1, "var1");
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.uj ujVar2 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.uj.this;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(ujVar2.f186242e, "onPause life " + activityC21401x6ce6f73f);
                    in5.s0 s0Var = ujVar2.f186243f;
                    java.lang.Object childAt = (s0Var == null || (viewGroup = (android.view.ViewGroup) s0Var.p(com.p314xaae8f345.mm.R.id.f565888ta0)) == null) ? null : viewGroup.getChildAt(0);
                    k20.h hVar = childAt instanceof k20.h ? (k20.h) childAt : null;
                    if (hVar != null) {
                        hVar.mo44333xb01dfb57();
                    }
                }

                @Override // td2.c
                /* renamed from: onResume */
                public void mo55616x57429eec(p012xc85e97e9.p093xedfae76a.y var1) {
                    android.view.ViewGroup viewGroup;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(var1, "var1");
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.uj ujVar2 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.uj.this;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(ujVar2.f186242e, "onResume life " + activityC21401x6ce6f73f);
                    in5.s0 s0Var = ujVar2.f186243f;
                    java.lang.Object childAt = (s0Var == null || (viewGroup = (android.view.ViewGroup) s0Var.p(com.p314xaae8f345.mm.R.id.f565888ta0)) == null) ? null : viewGroup.getChildAt(0);
                    k20.h hVar = childAt instanceof k20.h ? (k20.h) childAt : null;
                    if (hVar != null) {
                        hVar.mo44334x57429eec();
                    }
                }

                @Override // td2.c
                /* renamed from: onStart */
                public void mo55617xb05099c3(p012xc85e97e9.p093xedfae76a.y var1) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(var1, "var1");
                }

                @Override // td2.c
                /* renamed from: onStop */
                public void mo55618xc39f8281(p012xc85e97e9.p093xedfae76a.y var1) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(var1, "var1");
                }
            };
            ujVar.f186246i = cVar;
            activityC21401x6ce6f73f.mo273xed6858b4().a(cVar);
        }
        return jz5.f0.f384359a;
    }
}
