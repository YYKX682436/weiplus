package com.tencent.mm.plugin.finder.feed.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/OccupyFinderUI39;", "Lcom/tencent/mm/plugin/finder/ui/MMLiveFinderUI;", "<init>", "()V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class OccupyFinderUI39 extends com.tencent.mm.plugin.finder.ui.MMLiveFinderUI {
    public static final /* synthetic */ int C = 0;
    public com.tencent.mm.ui.tools.f5 A;
    public boolean B;

    /* renamed from: v, reason: collision with root package name */
    public final jz5.g f109615v = jz5.h.b(new com.tencent.mm.plugin.finder.feed.ui.op(this));

    /* renamed from: w, reason: collision with root package name */
    public final jz5.g f109616w = jz5.h.b(new com.tencent.mm.plugin.finder.feed.ui.hp(this));

    /* renamed from: x, reason: collision with root package name */
    public final jz5.g f109617x = jz5.h.b(new com.tencent.mm.plugin.finder.feed.ui.ep(this));

    /* renamed from: y, reason: collision with root package name */
    public java.util.LinkedList f109618y = new java.util.LinkedList();

    /* renamed from: z, reason: collision with root package name */
    public final bm2.w7 f109619z;

    public OccupyFinderUI39() {
        bm2.w7 w7Var = new bm2.w7(this);
        w7Var.f22419g = new com.tencent.mm.plugin.finder.feed.ui.cp(this);
        this.f109619z = w7Var;
    }

    public final java.lang.Object d7(int i17, java.util.LinkedList linkedList, kotlin.coroutines.Continuation continuation) {
        oz5.n nVar = new oz5.n(pz5.f.b(continuation));
        new db2.a2(i17, xy2.c.e(this), linkedList).l().K(new com.tencent.mm.plugin.finder.feed.ui.gp(nVar, this, i17));
        java.lang.Object a17 = nVar.a();
        pz5.a aVar = pz5.a.f359186d;
        return a17;
    }

    public final com.tencent.mm.ui.widget.MMEditText e7() {
        java.lang.Object value = ((jz5.n) this.f109616w).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (com.tencent.mm.ui.widget.MMEditText) value;
    }

    public final void f7(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        ((ml2.j0) i95.n0.c(ml2.j0.class)).Nj(str, str2, kz5.b1.e(new jz5.l("sensitive_word", str3)));
    }

    public final void g7(int i17) {
        jz5.g gVar = this.f109617x;
        if (i17 <= 0) {
            java.lang.Object value = ((jz5.n) gVar).getValue();
            kotlin.jvm.internal.o.f(value, "getValue(...)");
            ((android.widget.TextView) value).setVisibility(4);
        } else {
            java.lang.Object value2 = ((jz5.n) gVar).getValue();
            kotlin.jvm.internal.o.f(value2, "getValue(...)");
            ((android.widget.TextView) value2).setVisibility(0);
            java.lang.Object value3 = ((jz5.n) gVar).getValue();
            kotlin.jvm.internal.o.f(value3, "getValue(...)");
            ((android.widget.TextView) value3).setText(getResources().getString(com.tencent.mm.R.string.eck, java.lang.String.valueOf(i17)));
        }
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f488977az1;
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMLiveFinderUI, com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        jz5.g gVar = this.f109615v;
        java.lang.Object value = ((jz5.n) gVar).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        ((androidx.recyclerview.widget.RecyclerView) value).setAdapter(this.f109619z);
        java.lang.Object value2 = ((jz5.n) gVar).getValue();
        kotlin.jvm.internal.o.f(value2, "getValue(...)");
        ((androidx.recyclerview.widget.RecyclerView) value2).setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(this));
        java.lang.Object m17 = gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_SENSITIVE_WORDS_LIMIT_INT, null);
        zl2.r4.f473950a.Z2(e7(), null, 20, 10, (r17 & 16) != 0 ? true : true, (r17 & 32) != 0 ? com.tencent.mm.ui.tools.t4.MODE_CHINESE_AS_2 : null, null);
        e7().setHint(getResources().getString(com.tencent.mm.R.string.ecm, m17));
        e7().setInputType(1);
        e7().setImeOptions(6);
        e7().setOnEditorActionListener(new com.tencent.mm.plugin.finder.feed.ui.ip(this));
        addIconOptionMenu(0, com.tencent.mm.R.raw.icons_outlined_search, new com.tencent.mm.plugin.finder.feed.ui.jp(this));
        f7("live_sensitive_word_search", "view_exp", "");
        setMMTitle(getResources().getString(com.tencent.mm.R.string.ecn));
        setBackBtn(new com.tencent.mm.plugin.finder.feed.ui.kp(this));
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMLiveFinderUI, com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        kotlinx.coroutines.l.d(v65.m.b(this), null, null, new com.tencent.mm.plugin.finder.feed.ui.lp(this, null), 3, null);
        getWindow().getDecorView().post(new com.tencent.mm.plugin.finder.feed.ui.np(this));
    }
}
