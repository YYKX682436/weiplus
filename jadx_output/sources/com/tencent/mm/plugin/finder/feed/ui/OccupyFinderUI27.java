package com.tencent.mm.plugin.finder.feed.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/OccupyFinderUI27;", "Lcom/tencent/mm/plugin/finder/ui/MMLiveFinderUI;", "<init>", "()V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class OccupyFinderUI27 extends com.tencent.mm.plugin.finder.ui.MMLiveFinderUI {

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ int f109598v = 0;

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.b07;
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMLiveFinderUI, com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        ((com.tencent.mm.plugin.finder.view.crit.LivePkCritAnounceView) findViewById(com.tencent.mm.R.id.f483061vk)).d();
        com.tencent.mm.plugin.finder.view.crit.LivePkCritAnounceView livePkCritAnounceView = (com.tencent.mm.plugin.finder.view.crit.LivePkCritAnounceView) findViewById(com.tencent.mm.R.id.f483058vh);
        java.util.LinkedList linkedList = new java.util.LinkedList();
        r45.zh5 zh5Var = new r45.zh5();
        zh5Var.set(1, 10L);
        zh5Var.set(0, 3);
        zh5Var.set(3, "MMFinderLiveGift100001");
        linkedList.add(zh5Var);
        r45.zh5 zh5Var2 = new r45.zh5();
        zh5Var2.set(1, 10L);
        zh5Var2.set(0, 3);
        zh5Var2.set(3, "MMFinderLiveGift100002");
        linkedList.add(zh5Var2);
        livePkCritAnounceView.j(linkedList, 1.5f);
        com.tencent.mm.plugin.finder.view.crit.LivePkCritAnounceView livePkCritAnounceView2 = (com.tencent.mm.plugin.finder.view.crit.LivePkCritAnounceView) findViewById(com.tencent.mm.R.id.f483059vi);
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        r45.zh5 zh5Var3 = new r45.zh5();
        zh5Var3.set(1, 10L);
        zh5Var3.set(0, 2);
        linkedList2.add(zh5Var3);
        livePkCritAnounceView2.j(linkedList2, 3.0f);
        com.tencent.mm.plugin.finder.view.crit.LivePkCritAnounceView livePkCritAnounceView3 = (com.tencent.mm.plugin.finder.view.crit.LivePkCritAnounceView) findViewById(com.tencent.mm.R.id.f483060vj);
        java.util.LinkedList linkedList3 = new java.util.LinkedList();
        r45.zh5 zh5Var4 = new r45.zh5();
        zh5Var4.set(1, 10L);
        zh5Var4.set(0, 1);
        zh5Var4.set(3, "MMFinderLiveGift100001");
        linkedList3.add(zh5Var4);
        r45.zh5 zh5Var5 = new r45.zh5();
        zh5Var5.set(1, 10L);
        zh5Var5.set(0, 1);
        zh5Var5.set(3, "MMFinderLiveGift100002");
        linkedList3.add(zh5Var5);
        livePkCritAnounceView3.j(linkedList3, 2.6f);
        com.tencent.mm.plugin.finder.view.crit.LivePkCritDoingView livePkCritDoingView = (com.tencent.mm.plugin.finder.view.crit.LivePkCritDoingView) findViewById(com.tencent.mm.R.id.nyl);
        livePkCritDoingView.m(30);
        java.util.LinkedList linkedList4 = new java.util.LinkedList();
        r45.zh5 zh5Var6 = new r45.zh5();
        zh5Var6.set(1, 10L);
        zh5Var6.set(2, 3L);
        zh5Var6.set(0, 3);
        zh5Var6.set(3, "MMFinderLiveGift100001");
        linkedList4.add(zh5Var6);
        r45.zh5 zh5Var7 = new r45.zh5();
        zh5Var7.set(1, 10L);
        zh5Var7.set(2, 7L);
        zh5Var7.set(0, 3);
        zh5Var7.set(3, "MMFinderLiveGift100002");
        linkedList4.add(zh5Var7);
        livePkCritDoingView.l(linkedList4, com.tencent.mm.plugin.finder.feed.ui.io.f110163d);
        com.tencent.mm.plugin.finder.view.crit.LivePkCritDoingView livePkCritDoingView2 = (com.tencent.mm.plugin.finder.view.crit.LivePkCritDoingView) findViewById(com.tencent.mm.R.id.nym);
        livePkCritDoingView2.m(30);
        java.util.LinkedList linkedList5 = new java.util.LinkedList();
        r45.zh5 zh5Var8 = new r45.zh5();
        zh5Var8.set(1, 10L);
        zh5Var8.set(2, 2L);
        zh5Var8.set(0, 2);
        linkedList5.add(zh5Var8);
        livePkCritDoingView2.l(linkedList5, com.tencent.mm.plugin.finder.feed.ui.jo.f110203d);
        com.tencent.mm.plugin.finder.view.crit.LivePkCritDoingView livePkCritDoingView3 = (com.tencent.mm.plugin.finder.view.crit.LivePkCritDoingView) findViewById(com.tencent.mm.R.id.nyn);
        livePkCritDoingView3.m(30);
        livePkCritDoingView3.setScope(kotlinx.coroutines.i2.f310477d);
        java.util.LinkedList linkedList6 = new java.util.LinkedList();
        r45.zh5 zh5Var9 = new r45.zh5();
        zh5Var9.set(1, 10L);
        zh5Var9.set(2, 3L);
        zh5Var9.set(0, 1);
        zh5Var9.set(3, "MMFinderLiveGift100001");
        linkedList6.add(zh5Var9);
        r45.zh5 zh5Var10 = new r45.zh5();
        zh5Var10.set(1, 10L);
        zh5Var10.set(2, 7L);
        zh5Var10.set(0, 1);
        zh5Var10.set(3, "MMFinderLiveGift100002");
        linkedList6.add(zh5Var10);
        livePkCritDoingView3.l(linkedList6, com.tencent.mm.plugin.finder.feed.ui.ko.f110246d);
        com.tencent.mm.plugin.finder.view.crit.LivePkCritDoneView livePkCritDoneView = (com.tencent.mm.plugin.finder.view.crit.LivePkCritDoneView) findViewById(com.tencent.mm.R.id.nyo);
        java.util.LinkedList linkedList7 = new java.util.LinkedList();
        r45.zh5 zh5Var11 = new r45.zh5();
        zh5Var11.set(1, 10L);
        zh5Var11.set(2, 3L);
        zh5Var11.set(0, 3);
        zh5Var11.set(3, "MMFinderLiveGift100001");
        linkedList7.add(zh5Var11);
        r45.zh5 zh5Var12 = new r45.zh5();
        zh5Var12.set(1, 10L);
        zh5Var12.set(2, 8L);
        zh5Var12.set(0, 3);
        zh5Var12.set(3, "MMFinderLiveGift100002");
        linkedList7.add(zh5Var12);
        livePkCritDoneView.c(3, linkedList7);
        com.tencent.mm.plugin.finder.view.crit.LivePkCritDoneView livePkCritDoneView2 = (com.tencent.mm.plugin.finder.view.crit.LivePkCritDoneView) findViewById(com.tencent.mm.R.id.nyp);
        java.util.LinkedList linkedList8 = new java.util.LinkedList();
        r45.zh5 zh5Var13 = new r45.zh5();
        zh5Var13.set(1, 10L);
        zh5Var13.set(2, 3L);
        zh5Var13.set(0, 3);
        zh5Var13.set(3, "MMFinderLiveGift100001");
        linkedList8.add(zh5Var13);
        r45.zh5 zh5Var14 = new r45.zh5();
        zh5Var14.set(1, 10L);
        zh5Var14.set(2, 7L);
        zh5Var14.set(0, 3);
        zh5Var14.set(3, "MMFinderLiveGift100002");
        linkedList8.add(zh5Var14);
        livePkCritDoneView2.c(5, linkedList8);
        com.tencent.mm.plugin.finder.view.crit.LivePkCritDoneView livePkCritDoneView3 = (com.tencent.mm.plugin.finder.view.crit.LivePkCritDoneView) findViewById(com.tencent.mm.R.id.nyq);
        java.util.LinkedList linkedList9 = new java.util.LinkedList();
        r45.zh5 zh5Var15 = new r45.zh5();
        zh5Var15.set(1, 10L);
        zh5Var15.set(2, 10L);
        zh5Var15.set(0, 3);
        zh5Var15.set(3, "MMFinderLiveGift100001");
        linkedList9.add(zh5Var15);
        r45.zh5 zh5Var16 = new r45.zh5();
        zh5Var16.set(1, 10L);
        zh5Var16.set(2, 10L);
        zh5Var16.set(0, 3);
        zh5Var16.set(3, "MMFinderLiveGift100002");
        linkedList9.add(zh5Var16);
        livePkCritDoneView3.c(4, linkedList9);
        com.tencent.mm.plugin.finder.view.crit.LivePkCritBuffView livePkCritBuffView = (com.tencent.mm.plugin.finder.view.crit.LivePkCritBuffView) findViewById(com.tencent.mm.R.id.nyu);
        livePkCritBuffView.e(1.5f);
        livePkCritBuffView.f(30);
        ((com.tencent.mm.plugin.finder.view.crit.LivePkCritBuffView) findViewById(com.tencent.mm.R.id.nyv)).g();
        ((com.tencent.mm.plugin.finder.view.crit.LivePkCritBuffView) findViewById(com.tencent.mm.R.id.nyw)).d(7655);
        ((android.widget.Button) findViewById(com.tencent.mm.R.id.b1r)).setOnClickListener(new com.tencent.mm.plugin.finder.feed.ui.ho((com.tencent.mm.plugin.finder.view.crit.LiveCritBuffAnimView) findViewById(com.tencent.mm.R.id.b1s)));
    }
}
