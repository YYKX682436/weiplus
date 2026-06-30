package com.tencent.mm.plugin.finder.feed.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderLiveVoteHistoryUI;", "Lcom/tencent/mm/plugin/finder/ui/MMLiveFinderUI;", "<init>", "()V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class FinderLiveVoteHistoryUI extends com.tencent.mm.plugin.finder.ui.MMLiveFinderUI {
    public r45.ke2 A;

    /* renamed from: v, reason: collision with root package name */
    public ky2.z f109444v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f109445w;

    /* renamed from: x, reason: collision with root package name */
    public long f109446x;

    /* renamed from: y, reason: collision with root package name */
    public int f109447y;

    /* renamed from: z, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f109448z;

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.ank;
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMLiveFinderUI, com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        java.util.LinkedList list;
        super.onCreate(bundle);
        int color = getResources().getColor(com.tencent.mm.R.color.f478491c);
        setNavigationbarColor(color);
        setActionbarColor(color);
        getWindow().setStatusBarColor(color);
        setMMTitle(getResources().getString(com.tencent.mm.R.string.ejp));
        setMMTitleColor(getResources().getColor(com.tencent.mm.R.color.FG_0));
        hideActionbarLine();
        setActionbarColor(getResources().getColor(com.tencent.mm.R.color.f478489a));
        setBackBtn(new com.tencent.mm.plugin.finder.feed.ui.ef(this));
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = (com.tencent.mm.view.recyclerview.WxRecyclerView) findViewById(com.tencent.mm.R.id.p9r);
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.p9b);
        wxRecyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(getContext()));
        ky2.z zVar = new ky2.z();
        this.f109444v = zVar;
        wxRecyclerView.setAdapter(zVar);
        java.lang.String stringExtra = getIntent().getStringExtra("finderlivedetailparamusername");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f109445w = stringExtra;
        this.f109446x = getIntent().getLongExtra("finderlivehistoryparamobjectid", 0L);
        byte[] byteArrayExtra = getIntent().getByteArrayExtra("finderlivehistoryparamvotinginfo");
        if (byteArrayExtra != null) {
            r45.ke2 ke2Var = new r45.ke2();
            try {
                ke2Var.parseFrom(byteArrayExtra);
            } catch (java.lang.Exception e17) {
                com.tencent.mm.sdk.platformtools.Log.a("safeParser", "", e17);
                ke2Var = null;
            }
            this.A = ke2Var;
            this.f109448z = ke2Var != null ? ke2Var.getByteString(1) : null;
            r45.ke2 ke2Var2 = this.A;
            this.f109447y = ke2Var2 != null ? ke2Var2.getInteger(2) : 0;
            r45.ke2 ke2Var3 = this.A;
            if (((ke2Var3 == null || (list = ke2Var3.getList(0)) == null) ? 0 : list.size()) <= 0) {
                wxRecyclerView.setVisibility(8);
                textView.setVisibility(0);
            } else {
                ky2.z zVar2 = this.f109444v;
                if (zVar2 != null) {
                    r45.ke2 ke2Var4 = this.A;
                    r4 = ke2Var4 != null ? ke2Var4.getList(0) : null;
                    java.util.ArrayList arrayList = zVar2.f313603d;
                    arrayList.clear();
                    if (r4 != null) {
                        arrayList.addAll(r4);
                        zVar2.notifyDataSetChanged();
                    }
                }
                ky2.z zVar3 = this.f109444v;
                if (zVar3 != null) {
                    zVar3.f313604e = new com.tencent.mm.plugin.finder.feed.ui.bf(this);
                }
                wxRecyclerView.i(new com.tencent.mm.plugin.finder.feed.ui.df(this));
            }
            r4 = jz5.f0.f302826a;
        }
        if (r4 == null) {
            wxRecyclerView.setVisibility(8);
            textView.setVisibility(0);
        }
    }
}
