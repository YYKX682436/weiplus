package com.tencent.mm.plugin.finder.feed.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderLiveSelectRoomForLuckMoneyUI;", "Lcom/tencent/mm/ui/contact/MMBaseSelectContactUI;", "<init>", "()V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class FinderLiveSelectRoomForLuckMoneyUI extends com.tencent.mm.ui.contact.MMBaseSelectContactUI {
    public static final /* synthetic */ int F = 0;
    public com.tencent.mm.pluginsdk.ui.MultiSelectContactView C;
    public final java.util.HashSet D = new java.util.HashSet();
    public int E;

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI, com.tencent.mm.pluginsdk.ui.a2
    public void M3(int i17, java.lang.String str) {
        if (i17 == 1) {
            kotlin.jvm.internal.m0.a(this.D).remove(str);
            b7().notifyDataSetChanged();
            x7();
        }
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public com.tencent.mm.ui.contact.a5 Z6() {
        bm2.o7 o7Var = new bm2.o7(this, null, true, false);
        o7Var.f207078f = true;
        return o7Var;
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public com.tencent.mm.ui.contact.o4 a7() {
        return new bm2.p7(this, null, true);
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public int[] d7() {
        return new int[]{131075};
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public java.lang.String g7() {
        java.lang.String string = getContext().getString(com.tencent.mm.R.string.ecg);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        return string;
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI, com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.ayw;
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public void h7(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        com.tencent.mm.ui.contact.item.a aVar;
        com.tencent.mm.storage.z3 z3Var;
        int headerViewsCount = i17 - this.f206446d.getHeaderViewsCount();
        if (headerViewsCount < 0) {
            com.tencent.mars.xlog.Log.i("Finder.FinderLiveSelectRoomForLuckMoneyUI", "offsetPosition is Smaller than 0, offsetPosition=%d | position=%s", java.lang.Integer.valueOf(headerViewsCount), java.lang.Integer.valueOf(i17));
            return;
        }
        com.tencent.mm.ui.contact.item.d item = b7().getItem(headerViewsCount);
        if (item == null || !(item instanceof com.tencent.mm.ui.contact.item.a) || (z3Var = (aVar = (com.tencent.mm.ui.contact.item.a) item).B) == null || z3Var.F0() == 1) {
            return;
        }
        com.tencent.mm.storage.z3 z3Var2 = aVar.B;
        kotlin.jvm.internal.o.d(z3Var2);
        java.lang.String d17 = z3Var2.d1();
        if (d17 == null) {
            d17 = "";
        }
        Y6();
        java.util.HashSet hashSet = this.D;
        if (hashSet.contains(d17)) {
            hashSet.remove(d17);
            this.f206450h.d(d17);
        } else if (hashSet.size() < this.E) {
            hashSet.add(d17);
            this.f206450h.d(d17);
        }
        Y6();
        this.f206448f.notifyDataSetChanged();
        x7();
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public void j7() {
        super.j7();
        this.E = getIntent().getIntExtra("KEY_LUCKY_MONEY_CHAT_ROOM_MAX_COUNT", 0);
        java.util.ArrayList<java.lang.String> stringArrayListExtra = getIntent().getStringArrayListExtra("KEY_LUCKY_MONEY_CHAT_ROOM_USERNAME");
        java.util.HashSet hashSet = this.D;
        hashSet.clear();
        if (stringArrayListExtra != null) {
            for (java.lang.String str : stringArrayListExtra) {
                if (!(str == null || str.length() == 0)) {
                    hashSet.add(str);
                }
            }
        }
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveSelectRoomForLuckMoneyUI", "initData maxRoomCount:" + this.E + ",selectUserSet size:" + hashSet.size());
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public boolean l7() {
        return false;
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public boolean m7() {
        return false;
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        addTextOptionMenu(1, getString(com.tencent.mm.R.string.eh7), new com.tencent.mm.plugin.finder.feed.ui.qc(this), null, com.tencent.mm.ui.fb.FINDER_LIVE);
        x7();
        this.C = (com.tencent.mm.pluginsdk.ui.MultiSelectContactView) findViewById(com.tencent.mm.R.id.cek);
        this.f206450h.e(new java.util.ArrayList(this.D));
        if (getMMSubTitle() != null) {
            setMMSubTitle(getString(com.tencent.mm.R.string.ecf));
        }
        com.tencent.mm.pluginsdk.ui.MultiSelectContactView multiSelectContactView = this.C;
        if (multiSelectContactView != null) {
            multiSelectContactView.post(new com.tencent.mm.plugin.finder.feed.ui.rc(this));
        }
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI, com.tencent.mm.ui.contact.l4
    public boolean t4(com.tencent.mm.ui.contact.item.d dVar) {
        if (dVar == null || !dVar.d() || dVar.f206850s == null) {
            return false;
        }
        java.util.HashSet hashSet = this.D;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : hashSet) {
            if (com.tencent.mm.sdk.platformtools.t8.D0((java.lang.String) obj, dVar.f206850s)) {
                arrayList.add(obj);
            }
        }
        return !arrayList.isEmpty();
    }

    public final void x7() {
        java.util.HashSet hashSet = this.D;
        if (hashSet == null || hashSet.isEmpty()) {
            updateOptionMenuText(1, getString(com.tencent.mm.R.string.eh7));
        } else {
            updateOptionMenuText(1, getContext().getResources().getString(com.tencent.mm.R.string.eh8, java.lang.Integer.valueOf(hashSet.size())));
        }
    }
}
