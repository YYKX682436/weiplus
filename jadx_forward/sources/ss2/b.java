package ss2;

/* loaded from: classes.dex */
public final class b extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f493458d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f493459e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f493460f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        m158359x1e885992().getIntExtra("key_member_qa_type", 0);
        android.view.View mo144222x4ff8c0f0 = mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.pzt);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo144222x4ff8c0f0, "findViewById(...)");
        this.f493460f = mo144222x4ff8c0f0;
        android.view.View mo144222x4ff8c0f02 = mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.q0b);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo144222x4ff8c0f02, "findViewById(...)");
        this.f493458d = mo144222x4ff8c0f02;
        android.view.View mo144222x4ff8c0f03 = mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.q0a);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo144222x4ff8c0f03, "findViewById(...)");
        this.f493459e = mo144222x4ff8c0f03;
        android.view.View mo144222x4ff8c0f04 = mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.q0i);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo144222x4ff8c0f04, "findViewById(...)");
        m80379x76847179().getWindow().getDecorView().setSystemUiVisibility(m80379x76847179().getWindow().getDecorView().getSystemUiVisibility() | 1024 | 256);
        android.view.View decorView = m158354x19263085().getWindow().getDecorView();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(decorView, "getDecorView(...)");
        decorView.setSystemUiVisibility(1280);
        com.p314xaae8f345.mm.ui.r0.a(m158354x19263085(), false);
        p012xc85e97e9.p016x746ad0e3.app.b mo2533x106ab264 = m158354x19263085().mo2533x106ab264();
        if (mo2533x106ab264 != null) {
            mo2533x106ab264.w(new android.graphics.drawable.ColorDrawable(0));
            mo2533x106ab264.o();
        }
        float dimension = m158354x19263085().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561156ay);
        int h17 = com.p314xaae8f345.mm.ui.bl.h(m158354x19263085());
        int b17 = a06.d.b(dimension + h17);
        android.view.View view = this.f493460f;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("postActionaBar");
            throw null;
        }
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = b17;
        view.setLayoutParams(layoutParams);
        view.setPadding(0, h17, 0, 0);
        if (m158354x19263085() instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158354x19263085, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) m158354x19263085).mo78514x143f1b92().W0(m158354x19263085(), m158361x893a2f6f().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw));
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x192630852 = m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158354x192630852, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) m158354x192630852).m78583x85ccfe01(8);
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x192630853 = m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158354x192630853, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) m158354x192630853).m78607xef685e15(com.p314xaae8f345.mm.ui.bk.C());
        }
        if (m80381x45f41879()) {
            android.view.View view2 = this.f493458d;
            if (view2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("closeIv");
                throw null;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/finder/question/QAPostActionBarUIC", "showCustomActionBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/question/QAPostActionBarUIC", "showCustomActionBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view3 = this.f493459e;
            if (view3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("cancelTv");
                throw null;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/finder/question/QAPostActionBarUIC", "showCustomActionBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/finder/question/QAPostActionBarUIC", "showCustomActionBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            android.view.View view4 = this.f493458d;
            if (view4 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("closeIv");
                throw null;
            }
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view4, arrayList3.toArray(), "com/tencent/mm/plugin/finder/question/QAPostActionBarUIC", "showCustomActionBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/finder/question/QAPostActionBarUIC", "showCustomActionBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view5 = this.f493459e;
            if (view5 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("cancelTv");
                throw null;
            }
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(0);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view5, arrayList4.toArray(), "com/tencent/mm/plugin/finder/question/QAPostActionBarUIC", "showCustomActionBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view5, "com/tencent/mm/plugin/finder/question/QAPostActionBarUIC", "showCustomActionBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View view6 = this.f493459e;
        if (view6 != null) {
            view6.setOnClickListener(new ss2.a(this));
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("cancelTv");
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 fragment) {
        super(fragment);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
    }
}
