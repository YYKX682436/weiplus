package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/OccupyFinderUI29;", "Lcom/tencent/mm/ui/base/preference/MMPreference;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI29 */
/* loaded from: classes8.dex */
public final class ActivityC14118xff3e450 extends com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f191137h = 0;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f191138d = "Finder.FinderSelectInteractUI";

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21571x8a410717 f191139e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21571x8a410717 f191140f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21571x8a410717 f191141g;

    public final void V6() {
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21571x8a410717 c21571x8a410717 = this.f191139e;
        if (c21571x8a410717 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("selectEveryBody");
            throw null;
        }
        if (!c21571x8a410717.P) {
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21571x8a410717 c21571x8a4107172 = this.f191140f;
            if (c21571x8a4107172 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("selectNeedFollow");
                throw null;
            }
            if (!c21571x8a4107172.P) {
                com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21571x8a410717 c21571x8a4107173 = this.f191141g;
                if (c21571x8a4107173 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("selectNobody");
                    throw null;
                }
                if (!c21571x8a4107173.P) {
                    m78500x43e00957(0, false);
                    return;
                }
            }
        }
        m78500x43e00957(0, true);
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: getFooterResourceId */
    public int mo56597xfe2df53a() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.b8p;
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: getResourceId */
    public int mo43516x9e0bb9bf() {
        return com.p314xaae8f345.mm.R.xml.f576414d8;
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.mrd);
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb h17 = ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) m79336x8b97809d()).h("select_everyBody");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(h17, "null cannot be cast to non-null type com.tencent.mm.ui.base.preference.SelectPreference");
        this.f191139e = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21571x8a410717) h17;
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb h18 = ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) m79336x8b97809d()).h("select_needFollow");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(h18, "null cannot be cast to non-null type com.tencent.mm.ui.base.preference.SelectPreference");
        this.f191140f = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21571x8a410717) h18;
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb h19 = ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) m79336x8b97809d()).h("select_nobody");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(h19, "null cannot be cast to non-null type com.tencent.mm.ui.base.preference.SelectPreference");
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21571x8a410717 c21571x8a410717 = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21571x8a410717) h19;
        this.f191141g = c21571x8a410717;
        c21571x8a410717.M(c21571x8a410717.f279303d.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.mrc));
        int intExtra = getIntent().getIntExtra("key_input_interact", 2);
        ot5.g.c(this.f191138d, "inputInteract = " + intExtra);
        if (intExtra == 1) {
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21571x8a410717 c21571x8a4107172 = this.f191139e;
            if (c21571x8a4107172 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("selectEveryBody");
                throw null;
            }
            c21571x8a4107172.P = false;
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21571x8a410717 c21571x8a4107173 = this.f191140f;
            if (c21571x8a4107173 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("selectNeedFollow");
                throw null;
            }
            c21571x8a4107173.P = false;
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21571x8a410717 c21571x8a4107174 = this.f191141g;
            if (c21571x8a4107174 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("selectNobody");
                throw null;
            }
            c21571x8a4107174.P = true;
        } else if (intExtra == 2) {
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21571x8a410717 c21571x8a4107175 = this.f191139e;
            if (c21571x8a4107175 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("selectEveryBody");
                throw null;
            }
            c21571x8a4107175.P = true;
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21571x8a410717 c21571x8a4107176 = this.f191140f;
            if (c21571x8a4107176 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("selectNeedFollow");
                throw null;
            }
            c21571x8a4107176.P = false;
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21571x8a410717 c21571x8a4107177 = this.f191141g;
            if (c21571x8a4107177 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("selectNobody");
                throw null;
            }
            c21571x8a4107177.P = false;
        } else if (intExtra != 3) {
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21571x8a410717 c21571x8a4107178 = this.f191139e;
            if (c21571x8a4107178 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("selectEveryBody");
                throw null;
            }
            c21571x8a4107178.P = false;
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21571x8a410717 c21571x8a4107179 = this.f191140f;
            if (c21571x8a4107179 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("selectNeedFollow");
                throw null;
            }
            c21571x8a4107179.P = false;
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21571x8a410717 c21571x8a41071710 = this.f191141g;
            if (c21571x8a41071710 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("selectNobody");
                throw null;
            }
            c21571x8a41071710.P = false;
        } else {
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21571x8a410717 c21571x8a41071711 = this.f191139e;
            if (c21571x8a41071711 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("selectEveryBody");
                throw null;
            }
            c21571x8a41071711.P = false;
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21571x8a410717 c21571x8a41071712 = this.f191140f;
            if (c21571x8a41071712 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("selectNeedFollow");
                throw null;
            }
            c21571x8a41071712.P = true;
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21571x8a410717 c21571x8a41071713 = this.f191141g;
            if (c21571x8a41071713 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("selectNobody");
                throw null;
            }
            c21571x8a41071713.P = false;
        }
        m78494xd9193382(0, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571974v5), new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.no(this), null, com.p314xaae8f345.mm.ui.fb.GREEN);
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.oo(this));
        V6();
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: onPreferenceTreeClick */
    public boolean mo26755x5cc6f590(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb) {
        java.lang.String str = c21560x1fce98fb != null ? c21560x1fce98fb.f279313q : null;
        if (str == null) {
            str = "";
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "select_everyBody")) {
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21571x8a410717 c21571x8a410717 = this.f191139e;
            if (c21571x8a410717 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("selectEveryBody");
                throw null;
            }
            c21571x8a410717.P = true;
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21571x8a410717 c21571x8a4107172 = this.f191140f;
            if (c21571x8a4107172 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("selectNeedFollow");
                throw null;
            }
            c21571x8a4107172.P = false;
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21571x8a410717 c21571x8a4107173 = this.f191141g;
            if (c21571x8a4107173 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("selectNobody");
                throw null;
            }
            c21571x8a4107173.P = false;
            if (rVar != null) {
                ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) rVar).notifyDataSetChanged();
            }
        } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "select_needFollow")) {
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21571x8a410717 c21571x8a4107174 = this.f191139e;
            if (c21571x8a4107174 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("selectEveryBody");
                throw null;
            }
            c21571x8a4107174.P = false;
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21571x8a410717 c21571x8a4107175 = this.f191140f;
            if (c21571x8a4107175 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("selectNeedFollow");
                throw null;
            }
            c21571x8a4107175.P = true;
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21571x8a410717 c21571x8a4107176 = this.f191141g;
            if (c21571x8a4107176 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("selectNobody");
                throw null;
            }
            c21571x8a4107176.P = false;
        } else {
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21571x8a410717 c21571x8a4107177 = this.f191139e;
            if (c21571x8a4107177 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("selectEveryBody");
                throw null;
            }
            c21571x8a4107177.P = false;
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21571x8a410717 c21571x8a4107178 = this.f191140f;
            if (c21571x8a4107178 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("selectNeedFollow");
                throw null;
            }
            c21571x8a4107178.P = false;
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21571x8a410717 c21571x8a4107179 = this.f191141g;
            if (c21571x8a4107179 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("selectNobody");
                throw null;
            }
            c21571x8a4107179.P = true;
        }
        V6();
        if (rVar != null) {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) rVar).notifyDataSetChanged();
        }
        return false;
    }
}
