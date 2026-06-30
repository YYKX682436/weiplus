package b33;

/* loaded from: classes8.dex */
public final class f extends b33.i implements oa.c, xg5.a, androidx.viewpager.widget.ViewPager.OnPageChangeListener {

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f17663f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f17664g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f17665h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f17663f = jz5.h.b(new b33.a(this));
        this.f17664g = jz5.h.b(new b33.e(this));
        this.f17665h = jz5.h.b(new b33.c(this));
    }

    public void V6() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MPFooterUIC", "hideFooter: ");
        W6(true);
        ((android.widget.FrameLayout) ((jz5.n) this.f17665h).getValue()).setVisibility(8);
    }

    public final void W6(boolean z17) {
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        ((b33.o) pf5.z.f353948a.a(activity).a(b33.o.class)).U6().setCanSlide(z17);
    }

    public void X6() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MPFooterUIC", "showFooter: ");
        W6(false);
        ((android.widget.FrameLayout) ((jz5.n) this.f17665h).getValue()).setVisibility(0);
    }

    @Override // oa.c
    public void h0(oa.i iVar) {
        java.lang.Object obj;
        if (iVar == null || (obj = iVar.f343778a) == null || !(obj instanceof b33.p)) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MPFooterUIC", "onTabReselected " + obj);
    }

    @Override // oa.c
    public void l4(oa.i iVar) {
        java.lang.Object obj;
        if (iVar == null || (obj = iVar.f343778a) == null || !(obj instanceof b33.p)) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MPFooterUIC", "onTabUnselected " + obj);
        ((b33.p) obj).a(false);
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        java.lang.String string;
        com.tencent.mars.xlog.Log.i("MicroMsg.MPFooterUIC", "onCreate");
        int[] intArrayExtra = getActivity().getIntent().getIntArrayExtra("MediaTabTypeList");
        kotlin.jvm.internal.o.e(intArrayExtra, "null cannot be cast to non-null type kotlin.IntArray");
        int length = intArrayExtra.length;
        int i17 = 0;
        int i18 = 0;
        while (true) {
            jz5.g gVar = this.f17664g;
            if (i17 >= length) {
                ((com.google.android.material.tabs.TabLayout) ((jz5.n) gVar).getValue()).a(this);
                U6().addOnPageChangeListener(this);
                return;
            }
            int i19 = intArrayExtra[i17];
            int i27 = i18 + 1;
            androidx.appcompat.app.AppCompatActivity activity = getActivity();
            oa.i l17 = ((com.google.android.material.tabs.TabLayout) ((jz5.n) gVar).getValue()).l();
            android.app.Activity context = getContext();
            kotlin.jvm.internal.o.g(context, "context");
            if (i19 == 1) {
                string = context.getString(com.tencent.mm.R.string.f489984hg);
                kotlin.jvm.internal.o.f(string, "getString(...)");
            } else if (i19 == 2) {
                string = context.getString(com.tencent.mm.R.string.f490407u4);
                kotlin.jvm.internal.o.f(string, "getString(...)");
            } else if (i19 == 3) {
                string = context.getString(com.tencent.mm.R.string.f490417ue);
                kotlin.jvm.internal.o.f(string, "getString(...)");
            } else if (i19 != 4) {
                string = "";
            } else {
                string = context.getString(com.tencent.mm.R.string.ng9);
                kotlin.jvm.internal.o.f(string, "getString(...)");
            }
            b33.p pVar = new b33.p(activity, l17, i19, i18, string);
            ((com.google.android.material.tabs.TabLayout) ((jz5.n) gVar).getValue()).d(pVar.f17679a, false);
            if (i18 == T6()) {
                pVar.a(true);
            }
            i17++;
            i18 = i27;
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int i17) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrolled(int i17, float f17, int i18) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageSelected(int i17) {
        oa.i k17;
        com.tencent.mars.xlog.Log.i("MicroMsg.MPFooterUIC", "onPageSelected position = " + i17);
        com.google.android.material.tabs.TabLayout tabLayout = (com.google.android.material.tabs.TabLayout) ((jz5.n) this.f17664g).getValue();
        if (tabLayout == null || (k17 = tabLayout.k(i17)) == null || k17.a()) {
            return;
        }
        k17.b();
    }

    @Override // oa.c
    public void u1(oa.i iVar) {
        java.lang.Object obj;
        if (iVar == null || (obj = iVar.f343778a) == null || !(obj instanceof b33.p)) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MPFooterUIC", "onTabSelected " + obj);
        b33.p pVar = (b33.p) obj;
        pVar.a(true);
        U6().setCurrentItem(pVar.f17681c, false);
        ((android.widget.FrameLayout) ((jz5.n) this.f17665h).getValue()).removeAllViews();
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        androidx.lifecycle.c1 a17 = pf5.z.f353948a.a(activity).a(b33.o.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        ((b33.o) a17).V6(pVar.f17680b, new b33.d(this));
    }
}
