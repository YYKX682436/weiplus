package com.tencent.mm.plugin.finder.account.component;

/* loaded from: classes2.dex */
public final class l extends com.tencent.mm.ui.component.UIComponent implements zy2.o5 {

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f101709d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.account.api.component.FinderAccountSwitchDrawer f101710e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.List f101711f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.ArrayList f101712g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.view.recyclerview.WxRecyclerAdapter f101713h;

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.account.component.g f101714i;

    /* renamed from: m, reason: collision with root package name */
    public r45.zn5 f101715m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f101716n;

    /* renamed from: o, reason: collision with root package name */
    public int f101717o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f101718p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f101719q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f101714i = new com.tencent.mm.plugin.finder.account.component.g();
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ec, code lost:
    
        if (r1 >= 1) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x013a, code lost:
    
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0138, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0136, code lost:
    
        if (r1 >= 2) goto L60;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void O6(r45.lk2 r26) {
        /*
            Method dump skipped, instructions count: 579
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.account.component.l.O6(r45.lk2):void");
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        com.tencent.mars.xlog.Log.i("FinderAccountSwitchUIC", "onActivityResult, requestCode:" + i17 + ", resultCode:" + i18);
        if (i17 == 702) {
            if (i18 == -1) {
                ((com.tencent.mm.plugin.finder.assist.i0) ((c61.ub) i95.n0.c(c61.ub.class))).hj(getActivity(), intent, 11103);
                return;
            }
            return;
        }
        if (i17 == 11103 || i17 == 11104) {
            androidx.appcompat.app.AppCompatActivity activity = getActivity();
            kotlin.jvm.internal.o.g(activity, "activity");
            ((com.tencent.mm.plugin.finder.viewmodel.component.f50) ((zy2.xa) pf5.z.f353948a.a(activity).c(zy2.xa.class))).X6();
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        this.f101709d = findViewById(com.tencent.mm.R.id.e7x);
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.e7z);
        com.tencent.mm.ui.bk.s0(textView != null ? textView.getPaint() : null);
        android.view.View view = this.f101709d;
        if (view != null) {
            view.setOnClickListener(new com.tencent.mm.plugin.finder.account.component.j(this));
        }
        O6(null);
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onStop() {
        super.onStop();
        if (getActivity().isFinishing()) {
            g92.b.f269769e.P0("", "selfCenterClear");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(androidx.fragment.app.Fragment fragment) {
        super(fragment);
        kotlin.jvm.internal.o.g(fragment, "fragment");
        this.f101714i = new com.tencent.mm.plugin.finder.account.component.g();
    }
}
