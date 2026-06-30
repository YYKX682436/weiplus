package com.tencent.mm.plugin.finder.feed.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/OccupyFinderUI28;", "Lcom/tencent/mm/ui/base/preference/MMPreference;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class OccupyFinderUI28 extends com.tencent.mm.ui.base.preference.MMPreference {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f109599h = 0;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f109600d = "Finder.FinderSelectInteractUI";

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.SelectPreference f109601e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.SelectPreference f109602f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.SelectPreference f109603g;

    public final void V6() {
        com.tencent.mm.ui.base.preference.SelectPreference selectPreference = this.f109601e;
        if (selectPreference == null) {
            kotlin.jvm.internal.o.o("selectEveryBody");
            throw null;
        }
        if (!selectPreference.P) {
            com.tencent.mm.ui.base.preference.SelectPreference selectPreference2 = this.f109602f;
            if (selectPreference2 == null) {
                kotlin.jvm.internal.o.o("selectNeedFollow");
                throw null;
            }
            if (!selectPreference2.P) {
                com.tencent.mm.ui.base.preference.SelectPreference selectPreference3 = this.f109603g;
                if (selectPreference3 == null) {
                    kotlin.jvm.internal.o.o("selectNobody");
                    throw null;
                }
                if (!selectPreference3.P) {
                    enableOptionMenu(0, false);
                    return;
                }
            }
        }
        enableOptionMenu(0, true);
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public int getFooterResourceId() {
        return com.tencent.mm.R.layout.b8p;
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public int getResourceId() {
        return com.tencent.mm.R.xml.f494881d8;
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle(com.tencent.mm.R.string.mrb);
        com.tencent.mm.ui.base.preference.Preference h17 = ((com.tencent.mm.ui.base.preference.h0) getPreferenceScreen()).h("select_everyBody");
        kotlin.jvm.internal.o.e(h17, "null cannot be cast to non-null type com.tencent.mm.ui.base.preference.SelectPreference");
        this.f109601e = (com.tencent.mm.ui.base.preference.SelectPreference) h17;
        com.tencent.mm.ui.base.preference.Preference h18 = ((com.tencent.mm.ui.base.preference.h0) getPreferenceScreen()).h("select_needFollow");
        kotlin.jvm.internal.o.e(h18, "null cannot be cast to non-null type com.tencent.mm.ui.base.preference.SelectPreference");
        this.f109602f = (com.tencent.mm.ui.base.preference.SelectPreference) h18;
        com.tencent.mm.ui.base.preference.Preference h19 = ((com.tencent.mm.ui.base.preference.h0) getPreferenceScreen()).h("select_nobody");
        kotlin.jvm.internal.o.e(h19, "null cannot be cast to non-null type com.tencent.mm.ui.base.preference.SelectPreference");
        this.f109603g = (com.tencent.mm.ui.base.preference.SelectPreference) h19;
        int intExtra = getIntent().getIntExtra("key_input_interact", 2);
        ot5.g.c(this.f109600d, "inputInteract = " + intExtra);
        if (intExtra == 1) {
            com.tencent.mm.ui.base.preference.SelectPreference selectPreference = this.f109601e;
            if (selectPreference == null) {
                kotlin.jvm.internal.o.o("selectEveryBody");
                throw null;
            }
            selectPreference.P = false;
            com.tencent.mm.ui.base.preference.SelectPreference selectPreference2 = this.f109602f;
            if (selectPreference2 == null) {
                kotlin.jvm.internal.o.o("selectNeedFollow");
                throw null;
            }
            selectPreference2.P = false;
            com.tencent.mm.ui.base.preference.SelectPreference selectPreference3 = this.f109603g;
            if (selectPreference3 == null) {
                kotlin.jvm.internal.o.o("selectNobody");
                throw null;
            }
            selectPreference3.P = true;
        } else if (intExtra == 2) {
            com.tencent.mm.ui.base.preference.SelectPreference selectPreference4 = this.f109601e;
            if (selectPreference4 == null) {
                kotlin.jvm.internal.o.o("selectEveryBody");
                throw null;
            }
            selectPreference4.P = true;
            com.tencent.mm.ui.base.preference.SelectPreference selectPreference5 = this.f109602f;
            if (selectPreference5 == null) {
                kotlin.jvm.internal.o.o("selectNeedFollow");
                throw null;
            }
            selectPreference5.P = false;
            com.tencent.mm.ui.base.preference.SelectPreference selectPreference6 = this.f109603g;
            if (selectPreference6 == null) {
                kotlin.jvm.internal.o.o("selectNobody");
                throw null;
            }
            selectPreference6.P = false;
        } else if (intExtra != 3) {
            com.tencent.mm.ui.base.preference.SelectPreference selectPreference7 = this.f109601e;
            if (selectPreference7 == null) {
                kotlin.jvm.internal.o.o("selectEveryBody");
                throw null;
            }
            selectPreference7.P = false;
            com.tencent.mm.ui.base.preference.SelectPreference selectPreference8 = this.f109602f;
            if (selectPreference8 == null) {
                kotlin.jvm.internal.o.o("selectNeedFollow");
                throw null;
            }
            selectPreference8.P = false;
            com.tencent.mm.ui.base.preference.SelectPreference selectPreference9 = this.f109603g;
            if (selectPreference9 == null) {
                kotlin.jvm.internal.o.o("selectNobody");
                throw null;
            }
            selectPreference9.P = false;
        } else {
            com.tencent.mm.ui.base.preference.SelectPreference selectPreference10 = this.f109601e;
            if (selectPreference10 == null) {
                kotlin.jvm.internal.o.o("selectEveryBody");
                throw null;
            }
            selectPreference10.P = false;
            com.tencent.mm.ui.base.preference.SelectPreference selectPreference11 = this.f109602f;
            if (selectPreference11 == null) {
                kotlin.jvm.internal.o.o("selectNeedFollow");
                throw null;
            }
            selectPreference11.P = true;
            com.tencent.mm.ui.base.preference.SelectPreference selectPreference12 = this.f109603g;
            if (selectPreference12 == null) {
                kotlin.jvm.internal.o.o("selectNobody");
                throw null;
            }
            selectPreference12.P = false;
        }
        addTextOptionMenu(0, getString(com.tencent.mm.R.string.f490441v5), new com.tencent.mm.plugin.finder.feed.ui.lo(this), null, com.tencent.mm.ui.fb.GREEN);
        setBackBtn(new com.tencent.mm.plugin.finder.feed.ui.mo(this));
        V6();
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public boolean onPreferenceTreeClick(com.tencent.mm.ui.base.preference.r rVar, com.tencent.mm.ui.base.preference.Preference preference) {
        java.lang.String str = preference != null ? preference.f197780q : null;
        if (str == null) {
            str = "";
        }
        if (kotlin.jvm.internal.o.b(str, "select_everyBody")) {
            com.tencent.mm.ui.base.preference.SelectPreference selectPreference = this.f109601e;
            if (selectPreference == null) {
                kotlin.jvm.internal.o.o("selectEveryBody");
                throw null;
            }
            selectPreference.P = true;
            com.tencent.mm.ui.base.preference.SelectPreference selectPreference2 = this.f109602f;
            if (selectPreference2 == null) {
                kotlin.jvm.internal.o.o("selectNeedFollow");
                throw null;
            }
            selectPreference2.P = false;
            com.tencent.mm.ui.base.preference.SelectPreference selectPreference3 = this.f109603g;
            if (selectPreference3 == null) {
                kotlin.jvm.internal.o.o("selectNobody");
                throw null;
            }
            selectPreference3.P = false;
            if (rVar != null) {
                ((com.tencent.mm.ui.base.preference.h0) rVar).notifyDataSetChanged();
            }
        } else if (kotlin.jvm.internal.o.b(str, "select_needFollow")) {
            com.tencent.mm.ui.base.preference.SelectPreference selectPreference4 = this.f109601e;
            if (selectPreference4 == null) {
                kotlin.jvm.internal.o.o("selectEveryBody");
                throw null;
            }
            selectPreference4.P = false;
            com.tencent.mm.ui.base.preference.SelectPreference selectPreference5 = this.f109602f;
            if (selectPreference5 == null) {
                kotlin.jvm.internal.o.o("selectNeedFollow");
                throw null;
            }
            selectPreference5.P = true;
            com.tencent.mm.ui.base.preference.SelectPreference selectPreference6 = this.f109603g;
            if (selectPreference6 == null) {
                kotlin.jvm.internal.o.o("selectNobody");
                throw null;
            }
            selectPreference6.P = false;
        } else {
            com.tencent.mm.ui.base.preference.SelectPreference selectPreference7 = this.f109601e;
            if (selectPreference7 == null) {
                kotlin.jvm.internal.o.o("selectEveryBody");
                throw null;
            }
            selectPreference7.P = false;
            com.tencent.mm.ui.base.preference.SelectPreference selectPreference8 = this.f109602f;
            if (selectPreference8 == null) {
                kotlin.jvm.internal.o.o("selectNeedFollow");
                throw null;
            }
            selectPreference8.P = false;
            com.tencent.mm.ui.base.preference.SelectPreference selectPreference9 = this.f109603g;
            if (selectPreference9 == null) {
                kotlin.jvm.internal.o.o("selectNobody");
                throw null;
            }
            selectPreference9.P = true;
        }
        V6();
        if (rVar != null) {
            ((com.tencent.mm.ui.base.preference.h0) rVar).notifyDataSetChanged();
        }
        return false;
    }
}
