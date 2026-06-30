package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/plugin/finder/convert/FinderFeedPlaceHolderConvert$bindLifeCycle$2", "Ltd2/c;", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.convert.FinderFeedPlaceHolderConvert$bindLifeCycle$2 */
/* loaded from: classes2.dex */
public final class C13700xb79d7efb implements td2.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.oj f184368d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f f184369e;

    public C13700xb79d7efb(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.oj ojVar, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f activityC21401x6ce6f73f) {
        this.f184368d = ojVar;
        this.f184369e = activityC21401x6ce6f73f;
    }

    @Override // td2.c
    /* renamed from: onCreate */
    public void mo55613x3e5a77bb(p012xc85e97e9.p093xedfae76a.y var1) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(var1, "var1");
    }

    @Override // td2.c
    /* renamed from: onDestroy */
    public void mo55614xac79a11b(p012xc85e97e9.p093xedfae76a.y var1) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(var1, "var1");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.oj ojVar = this.f184368d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.ka kaVar = ojVar.F;
        if (kaVar != null) {
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf activity = ojVar.f185717f.getF204176d();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15456x2c452bca) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15456x2c452bca.class)).f215108o.remove(kaVar);
        }
        ojVar.A();
        td2.c cVar = ojVar.E;
        if (cVar != null) {
            java.lang.String str = ojVar.f185719h;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("auto life remove ");
            com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f activityC21401x6ce6f73f = this.f184369e;
            sb6.append(activityC21401x6ce6f73f);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
            activityC21401x6ce6f73f.mo273xed6858b4().c(cVar);
            ojVar.E = null;
        }
    }

    @Override // td2.c
    /* renamed from: onPause */
    public void mo55615xb01dfb57(p012xc85e97e9.p093xedfae76a.y var1) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(var1, "var1");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.oj ojVar = this.f184368d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(ojVar.f185719h, "onPause life " + this.f184369e);
        cw2.da daVar = ojVar.C;
        if (daVar != null) {
            daVar.mo58788x65825f6();
        }
    }

    @Override // td2.c
    /* renamed from: onResume */
    public void mo55616x57429eec(p012xc85e97e9.p093xedfae76a.y var1) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(var1, "var1");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.oj ojVar = this.f184368d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(ojVar.f185719h, "onResume life " + this.f184369e);
        ojVar.s("onActivityResume");
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
}
