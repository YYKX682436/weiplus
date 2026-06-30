package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic;

/* loaded from: classes2.dex */
public final class ug extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.C14901x16d3f6f2 f205803d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ug(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.C14901x16d3f6f2 c14901x16d3f6f2) {
        super(0);
        this.f205803d = c14901x16d3f6f2;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.view.View findViewById;
        android.view.View findViewById2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.C14901x16d3f6f2 c14901x16d3f6f2 = this.f205803d;
        c14901x16d3f6f2.Q6().m82693x1501d518(false);
        android.view.View f294968x = c14901x16d3f6f2.Q6().getF294968x();
        if (f294968x != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(f294968x, arrayList.toArray(), "com/tencent/mm/plugin/finder/profile/uic/FinderProfileTemplateUIC", "onFetchEnd", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            f294968x.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(f294968x, "com/tencent/mm/plugin/finder/profile/uic/FinderProfileTemplateUIC", "onFetchEnd", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View f294968x2 = c14901x16d3f6f2.Q6().getF294968x();
        android.widget.TextView textView = f294968x2 != null ? (android.widget.TextView) f294968x2.findViewById(com.p314xaae8f345.mm.R.id.ili) : null;
        if (textView != null) {
            textView.setVisibility(8);
        }
        android.view.View f294968x3 = c14901x16d3f6f2.Q6().getF294968x();
        android.view.View findViewById3 = f294968x3 != null ? f294968x3.findViewById(com.p314xaae8f345.mm.R.id.ilg) : null;
        if (findViewById3 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            android.view.View view = findViewById3;
            yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/finder/profile/uic/FinderProfileTemplateUIC", "onFetchEnd", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/profile/uic/FinderProfileTemplateUIC", "onFetchEnd", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.app.Activity context = c14901x16d3f6f2.m80379x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        if (((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.C14917xdd637675) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.C14917xdd637675.class)).a2()) {
            android.view.View f294968x4 = c14901x16d3f6f2.Q6().getF294968x();
            if (f294968x4 != null && (findViewById2 = f294968x4.findViewById(com.p314xaae8f345.mm.R.id.ilg)) != null) {
                findViewById2.setBackgroundColor(c14901x16d3f6f2.m158361x893a2f6f().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e));
            }
        } else {
            android.view.View f294968x5 = c14901x16d3f6f2.Q6().getF294968x();
            if (f294968x5 != null && (findViewById = f294968x5.findViewById(com.p314xaae8f345.mm.R.id.ilg)) != null) {
                findViewById.setBackgroundColor(c14901x16d3f6f2.m158361x893a2f6f().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw));
            }
        }
        return jz5.f0.f384359a;
    }
}
