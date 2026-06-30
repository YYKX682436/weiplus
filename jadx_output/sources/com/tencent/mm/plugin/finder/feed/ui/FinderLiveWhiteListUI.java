package com.tencent.mm.plugin.finder.feed.ui;

@db5.a(32)
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016¨\u0006\t"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderLiveWhiteListUI;", "Lcom/tencent/mm/plugin/finder/ui/MMLiveFinderUI;", "Landroid/view/View$OnClickListener;", "Landroid/view/View;", org.chromium.base.BaseSwitches.V, "Ljz5/f0;", "onClick", "<init>", "()V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class FinderLiveWhiteListUI extends com.tencent.mm.plugin.finder.ui.MMLiveFinderUI implements android.view.View.OnClickListener {
    public static final /* synthetic */ int F = 0;
    public final java.util.LinkedList A = new java.util.LinkedList();
    public final java.util.LinkedList B = new java.util.LinkedList();
    public final java.util.LinkedList C = new java.util.LinkedList();
    public final java.util.LinkedList D = new java.util.LinkedList();
    public final java.util.LinkedList E = new java.util.LinkedList();

    /* renamed from: v, reason: collision with root package name */
    public android.view.View f109452v;

    /* renamed from: w, reason: collision with root package name */
    public android.widget.TextView f109453w;

    /* renamed from: x, reason: collision with root package name */
    public android.widget.TextView f109454x;

    /* renamed from: y, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f109455y;

    /* renamed from: z, reason: collision with root package name */
    public bm2.v8 f109456z;

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI
    /* renamed from: X6 */
    public java.lang.String getF109420v() {
        return "Finder.FinderLiveWhiteListUI";
    }

    public final void d7(java.lang.String str, java.util.LinkedList linkedList) {
        java.io.Serializable serializableExtra = getIntent().getSerializableExtra(str);
        java.util.List list = serializableExtra instanceof java.util.List ? (java.util.List) serializableExtra : null;
        if (list != null) {
            zl2.r4.f473950a.G2(list, linkedList);
        }
    }

    public final void e7() {
        java.util.LinkedList linkedList = this.B;
        if (linkedList.size() == 0) {
            android.widget.TextView textView = this.f109454x;
            if (textView != null) {
                textView.setText(getContext().getString(com.tencent.mm.R.string.nwk));
                return;
            }
            return;
        }
        android.widget.TextView textView2 = this.f109454x;
        if (textView2 != null) {
            textView2.setText(getContext().getString(com.tencent.mm.R.string.nwj, java.lang.Integer.valueOf(linkedList.size())));
        }
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f489022b22;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/ui/FinderLiveWhiteListUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Integer valueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        if (valueOf != null && valueOf.intValue() == com.tencent.mm.R.id.g6h) {
            android.content.Intent intent = new android.content.Intent();
            java.util.LinkedList linkedList = this.B;
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(linkedList, 10));
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((r45.il1) it.next()).toByteArray());
            }
            intent.putExtra("KEY_PARAMS_CHOOSE_WHITE_LIST", arrayList2);
            setResult(-1, intent);
            finish();
        } else if (valueOf != null && valueOf.intValue() == com.tencent.mm.R.id.b5w) {
            setResult(0);
            finish();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/ui/FinderLiveWhiteListUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMLiveFinderUI, com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        java.lang.Object obj;
        java.lang.Object obj2;
        boolean z17;
        java.lang.Object obj3;
        android.view.View view;
        supportRequestWindowFeature(1);
        super.onCreate(bundle);
        getContext().getWindow().addFlags(2097280);
        getContext().getWindow().addFlags(67108864);
        getContext().getWindow().clearFlags(67108864);
        getContext().getWindow().getDecorView().setSystemUiVisibility(1792);
        getContext().getWindow().addFlags(Integer.MIN_VALUE);
        getContext().getWindow().setStatusBarColor(0);
        getContext().getWindow().setNavigationBarColor(0);
        getContext().getWindow().setFormat(-3);
        getContext().getWindow().setSoftInputMode(51);
        getController().O0(com.tencent.mm.ui.bk.C());
        this.f109452v = findViewById(com.tencent.mm.R.id.oca);
        if (!lk5.s.b(this) && (view = this.f109452v) != null) {
            view.post(new com.tencent.mm.plugin.finder.feed.ui.ff(this));
        }
        this.f109453w = (android.widget.TextView) findViewById(com.tencent.mm.R.id.b5w);
        this.f109454x = (android.widget.TextView) findViewById(com.tencent.mm.R.id.g6h);
        this.f109455y = (androidx.recyclerview.widget.RecyclerView) findViewById(com.tencent.mm.R.id.plz);
        android.widget.TextView textView = this.f109454x;
        if (textView != null) {
            textView.setOnClickListener(this);
        }
        android.widget.TextView textView2 = this.f109453w;
        if (textView2 != null) {
            textView2.setOnClickListener(this);
        }
        bm2.v8 v8Var = new bm2.v8();
        v8Var.f22391d = new com.tencent.mm.plugin.finder.feed.ui.gf(this);
        this.f109456z = v8Var;
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f109455y;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(recyclerView.getContext(), 1, false));
            recyclerView.setAdapter(this.f109456z);
            android.view.ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams != null) {
                marginLayoutParams.bottomMargin = com.tencent.mm.ui.bl.c(recyclerView.getContext());
            }
        }
        java.util.LinkedList<r45.il1> linkedList = this.A;
        d7("KEY_PARAMS_WHITE_LIST", linkedList);
        java.util.LinkedList linkedList2 = this.B;
        d7("KEY_PARAMS_CHOOSE_WHITE_LIST", linkedList2);
        java.util.LinkedList linkedList3 = this.C;
        d7("KEY_PARAMS_FORBID_SELECT_WHITE_LIST", linkedList3);
        java.util.LinkedList linkedList4 = this.D;
        d7("KEY_PARAMS_FORBID_UNSELECT_WHITE_LIST", linkedList4);
        java.util.LinkedList linkedList5 = this.E;
        linkedList5.clear();
        for (r45.il1 il1Var : linkedList) {
            java.util.Iterator it = linkedList2.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (kotlin.jvm.internal.o.b(((r45.il1) obj).getString(0), il1Var.getString(0))) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            boolean z18 = obj != null;
            java.util.Iterator it6 = linkedList3.iterator();
            while (true) {
                if (it6.hasNext()) {
                    obj2 = it6.next();
                    if (kotlin.jvm.internal.o.b(((r45.il1) obj2).getString(0), il1Var.getString(0))) {
                        break;
                    }
                } else {
                    obj2 = null;
                    break;
                }
            }
            if (obj2 == null) {
                java.util.Iterator it7 = linkedList4.iterator();
                while (true) {
                    if (it7.hasNext()) {
                        obj3 = it7.next();
                        if (kotlin.jvm.internal.o.b(((r45.il1) obj3).getString(0), il1Var.getString(0))) {
                            break;
                        }
                    } else {
                        obj3 = null;
                        break;
                    }
                }
                if (obj3 == null) {
                    z17 = true;
                    linkedList5.add(new bm2.r8(z18, il1Var, 0, z17, 4, null));
                }
            }
            z17 = false;
            linkedList5.add(new bm2.r8(z18, il1Var, 0, z17, 4, null));
        }
        bm2.v8 v8Var2 = this.f109456z;
        if (v8Var2 != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateWhiteList,ori size:");
            java.util.LinkedList linkedList6 = v8Var2.f22392e;
            sb6.append(linkedList6.size());
            sb6.append(",new size:");
            sb6.append(java.lang.Integer.valueOf(linkedList5.size()));
            com.tencent.mars.xlog.Log.i("FinderLiveWhiteListAdapter", sb6.toString());
            linkedList6.clear();
            linkedList6.addAll(linkedList5);
        }
        bm2.v8 v8Var3 = this.f109456z;
        if (v8Var3 != null) {
            v8Var3.notifyDataSetChanged();
        }
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveWhiteListUI", "initLogic visitorWhiteList size:" + linkedList.size() + ",chooseWhiteList size:" + linkedList2.size() + ",forbidSelectWhiteList size:" + linkedList3.size() + ",forbidUnSelectWhiteList size:" + linkedList4.size());
        e7();
    }
}
