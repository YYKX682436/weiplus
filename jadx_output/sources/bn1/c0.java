package bn1;

/* loaded from: classes14.dex */
public final class c0 extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.vas.VASCommonFragment f22789d;

    /* renamed from: e, reason: collision with root package name */
    public int f22790e;

    /* renamed from: f, reason: collision with root package name */
    public bn1.v f22791f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.FrameLayout f22792g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f22793h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f22794i;

    /* renamed from: m, reason: collision with root package name */
    public int f22795m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f22796n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArrayList f22797o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f22793h = true;
        this.f22794i = "";
        this.f22796n = "MicroMsg.BizAudioPlayerDrawerUIC";
        this.f22797o = new java.util.concurrent.CopyOnWriteArrayList();
    }

    public final void O6(android.content.Intent intent, int i17, bn1.w tingPlayerDrawerType) {
        java.lang.String stringExtra;
        java.lang.String stringExtra2;
        boolean z17;
        bn1.v vVar;
        android.view.View view;
        kotlin.jvm.internal.o.g(intent, "intent");
        kotlin.jvm.internal.o.g(tingPlayerDrawerType, "tingPlayerDrawerType");
        bn1.w wVar = bn1.w.f22834d;
        java.lang.String str = "";
        if (tingPlayerDrawerType != wVar ? (stringExtra = intent.getStringExtra("Contact_User")) == null : (stringExtra = intent.getStringExtra("finder_username")) == null) {
            stringExtra = "";
        }
        this.f22794i = stringExtra;
        if (tingPlayerDrawerType != wVar ? (stringExtra2 = intent.getStringExtra("Contact_Scene_Note")) != null : (stringExtra2 = intent.getStringExtra("key_extra_info")) != null) {
            str = stringExtra2;
        }
        int hashCode = (this.f22794i + tingPlayerDrawerType + str).hashCode();
        int i18 = this.f22790e;
        r8 = null;
        com.google.android.material.appbar.AppBarLayout appBarLayout = null;
        int i19 = com.tencent.mm.R.color.f478491c;
        if (i18 == hashCode) {
            if (tingPlayerDrawerType != bn1.w.f22835e) {
                i19 = com.tencent.mm.R.color.f478494f;
            }
            bn1.v vVar2 = this.f22791f;
            java.lang.Object headerComponent = vVar2 != null ? vVar2.getHeaderComponent() : null;
            cn1.e eVar = headerComponent instanceof cn1.e ? (cn1.e) headerComponent : null;
            if (eVar != null) {
                eVar.f(i19);
            }
            bn1.v vVar3 = this.f22791f;
            if (vVar3 != null) {
                vVar3.j(-vVar3.edgeAttached, false);
                return;
            }
            return;
        }
        bn1.w wVar2 = bn1.w.f22835e;
        int i27 = tingPlayerDrawerType == wVar2 ? com.tencent.mm.R.color.f478491c : com.tencent.mm.R.color.f478494f;
        bn1.v vVar4 = this.f22791f;
        if (vVar4 == null) {
            android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(getContext());
            frameLayout.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
            frameLayout.setId(com.tencent.mm.R.id.sib);
            frameLayout.setBackgroundColor(frameLayout.getContext().getResources().getColor(com.tencent.mm.R.color.a9e));
            this.f22792g = frameLayout;
            float n17 = i17 > 0 ? i17 : (float) (com.tencent.mm.ui.bk.n(1.0f) * 0.7d);
            bn1.f fVar = new bn1.f();
            fVar.f22801a = n17;
            z17 = true;
            fVar.f22802b = new cn1.e(getContext(), i27, 0, 0, false, 28, null);
            android.widget.FrameLayout frameLayout2 = this.f22792g;
            kotlin.jvm.internal.o.d(frameLayout2);
            fVar.f22803c = new cn1.a(frameLayout2);
            ((java.util.HashSet) fVar.f22804d).add(new bn1.x(this));
            android.view.View findViewById = findViewById(android.R.id.content);
            kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) findViewById;
            android.content.Context context = viewGroup.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            if (fVar.f22801a == 0.0f) {
                throw new java.lang.IllegalStateException("expandHeight should not be zero");
            }
            bn1.v vVar5 = new bn1.v(context, fVar);
            viewGroup.removeView(vVar5);
            viewGroup.addView(vVar5);
            this.f22791f = vVar5;
            vVar5.setOnDrawerDetach(new bn1.y(this));
        } else {
            z17 = true;
            cn1.g headerComponent2 = vVar4.getHeaderComponent();
            cn1.e eVar2 = headerComponent2 instanceof cn1.e ? (cn1.e) headerComponent2 : null;
            if (eVar2 != null) {
                eVar2.f(i27);
            }
            if (i17 > 0 && (vVar = this.f22791f) != null) {
                vVar.setExpandHeight(i17);
            }
        }
        intent.putExtra("key_is_auto_report", false);
        intent.putExtra("key_enter_dialog", z17);
        androidx.fragment.app.i2 beginTransaction = getActivity().getSupportFragmentManager().beginTransaction();
        kotlin.jvm.internal.o.f(beginTransaction, "beginTransaction(...)");
        android.widget.FrameLayout frameLayout3 = this.f22792g;
        if (frameLayout3 != null) {
            frameLayout3.removeAllViews();
        }
        com.tencent.mm.ui.vas.VASCommonFragment b17 = lk5.q0.b(tingPlayerDrawerType == wVar ? "com.tencent.mm.plugin.finder.feed.ui.FinderProfileUI" : "com.tencent.mm.plugin.profile.ui.DialogContactInfoUI", intent, false, 4, null);
        this.f22789d = b17;
        b17.q0(new bn1.z(this));
        bn1.v vVar6 = this.f22791f;
        if (vVar6 != null) {
            vVar6.setContentReachTop(new bn1.a0(tingPlayerDrawerType, this));
        }
        com.tencent.mm.ui.vas.VASCommonFragment vASCommonFragment = this.f22789d;
        kotlin.jvm.internal.o.d(vASCommonFragment);
        beginTransaction.k(com.tencent.mm.R.id.sib, vASCommonFragment, null);
        beginTransaction.f();
        this.f22790e = hashCode;
        if (tingPlayerDrawerType == wVar2) {
            com.tencent.mm.ui.vas.VASCommonFragment vASCommonFragment2 = this.f22789d;
            if (vASCommonFragment2 != null && (view = vASCommonFragment2.f211137i) != null) {
                appBarLayout = (com.google.android.material.appbar.AppBarLayout) view.findViewWithTag("com.tencent.mm.plugin.profile.ui.DialogContactInfoUI#AppBarLayout");
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("appBarLayout is null? ");
            sb6.append(appBarLayout == null ? z17 : false);
            com.tencent.mars.xlog.Log.i(this.f22796n, sb6.toString());
            if (appBarLayout != null) {
                appBarLayout.a(new bn1.b0(this));
            }
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public boolean onBackPressed() {
        bn1.v vVar = this.f22791f;
        if (!(vVar != null ? vVar.isDrawerOpen : false)) {
            return super.onBackPressed();
        }
        if (vVar != null) {
            int i17 = com.tencent.mm.plugin.audio.view.BizAudioPlayerDraggableLayout.f92492u;
            vVar.j(vVar.edgeAttached, true);
        }
        return true;
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        this.f22791f = null;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onPause() {
        super.onPause();
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        if (this.f22793h) {
            this.f22793h = false;
            return;
        }
        bn1.v vVar = this.f22791f;
        if (vVar != null) {
            int i17 = com.tencent.mm.plugin.audio.view.BizAudioPlayerDraggableLayout.f92492u;
            vVar.j(0, false);
        }
    }
}
