package com.tencent.mm.plugin.emoji.ui;

/* loaded from: classes15.dex */
public class EmojiSortFragment extends com.tencent.mm.ui.MMFragment implements l75.q0, com.tencent.mm.modelbase.u0 {

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ int f97828q = 0;

    /* renamed from: d, reason: collision with root package name */
    public i12.k f97829d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.widget.sortlist.DragSortListView f97830e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.emoji.model.e0 f97831f;

    /* renamed from: g, reason: collision with root package name */
    public z12.z f97832g;

    /* renamed from: h, reason: collision with root package name */
    public android.os.Vibrator f97833h;

    /* renamed from: i, reason: collision with root package name */
    public int f97834i;

    /* renamed from: m, reason: collision with root package name */
    public android.app.ProgressDialog f97835m;

    /* renamed from: n, reason: collision with root package name */
    public final vl5.o f97836n;

    /* renamed from: o, reason: collision with root package name */
    public final vl5.i f97837o;

    /* renamed from: p, reason: collision with root package name */
    public final vl5.s f97838p;

    public EmojiSortFragment(com.tencent.mm.plugin.emoji.model.e0 e0Var) {
        super(true);
        this.f97836n = new com.tencent.mm.plugin.emoji.ui.g3(this);
        this.f97837o = new com.tencent.mm.plugin.emoji.ui.h3(this);
        this.f97838p = new com.tencent.mm.plugin.emoji.ui.i3(this);
        this.f97831f = e0Var;
    }

    @Override // com.tencent.mm.ui.MMFragment
    /* renamed from: getLayoutId */
    public int getF72225d() {
        return com.tencent.mm.R.layout.a7f;
    }

    @Override // com.tencent.mm.ui.MMFragment, com.tencent.mm.ui.FragmentActivitySupport, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        ((com.tencent.mm.feature.emoji.b0) i95.n0.c(com.tencent.mm.feature.emoji.b0.class)).getClass();
        com.tencent.mm.storage.n5.f().b().add(this);
        gm0.j1.n().f273288b.a(717, this);
    }

    @Override // com.tencent.mm.ui.MMFragment, com.tencent.mm.ui.FragmentActivitySupport, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        ((com.tencent.mm.feature.emoji.b0) i95.n0.c(com.tencent.mm.feature.emoji.b0.class)).getClass();
        com.tencent.mm.storage.n5.f().b().remove(this);
        gm0.j1.n().f273288b.q(717, this);
        super.onDestroy();
    }

    @Override // l75.q0
    public void onNotifyChange(java.lang.String str, l75.w0 w0Var) {
        i12.k kVar;
        if (str == null || !str.equals("event_update_group") || (kVar = this.f97829d) == null) {
            return;
        }
        kVar.f287222f.reset();
        kVar.notifyDataSetChanged();
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (m1Var != this.f97832g) {
            return;
        }
        android.app.ProgressDialog progressDialog = this.f97835m;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        if (i17 != 0 || i18 != 0) {
            db5.e1.t(getContext(), getString(com.tencent.mm.R.string.by9), "", new com.tencent.mm.plugin.emoji.ui.j3(this));
            return;
        }
        this.f97831f.d();
        if (getActivity() != null) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("sortRet", 0);
            getActivity().setResult(-1, intent);
        }
        finish();
    }

    @Override // com.tencent.mm.ui.MMFragment, androidx.fragment.app.Fragment
    public void onViewCreated(android.view.View view, android.os.Bundle bundle) {
        super.onViewCreated(view, bundle);
        setBackBtn(new com.tencent.mm.plugin.emoji.ui.d3(this));
        setMMTitle(getString(com.tencent.mm.R.string.iql));
        addTextOptionMenu(0, getString(com.tencent.mm.R.string.f490441v5), new com.tencent.mm.plugin.emoji.ui.e3(this));
        ((android.widget.TextView) findViewById(com.tencent.mm.R.id.ddw)).setText(com.tencent.mm.R.string.byy);
        this.f97833h = (android.os.Vibrator) getContext().getSystemService("vibrator");
        com.tencent.mm.ui.widget.sortlist.DragSortListView dragSortListView = (com.tencent.mm.ui.widget.sortlist.DragSortListView) findViewById(android.R.id.list);
        this.f97830e = dragSortListView;
        dragSortListView.setDropListener(this.f97836n);
        this.f97830e.setRemoveListener(this.f97838p);
        this.f97830e.setDragListener(this.f97837o);
        i12.k kVar = new i12.k(getContext(), this.f97831f);
        this.f97829d = kVar;
        this.f97830e.setAdapter((android.widget.ListAdapter) kVar);
    }
}
