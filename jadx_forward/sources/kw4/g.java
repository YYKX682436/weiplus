package kw4;

/* loaded from: classes8.dex */
public class g implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.fts.ui.C19252xb5f78ab1 f394709d;

    public g(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.fts.ui.C19252xb5f78ab1 c19252xb5f78ab1) {
        this.f394709d = c19252xb5f78ab1;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/webview/fts/ui/FtsWebVideoView$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.fts.ui.C19252xb5f78ab1 c19252xb5f78ab1 = this.f394709d;
        boolean z17 = !c19252xb5f78ab1.f263599J;
        c19252xb5f78ab1.f263599J = z17;
        c19252xb5f78ab1.f263601e.mo61536x764d819b(z17);
        if (c19252xb5f78ab1.f263599J) {
            c19252xb5f78ab1.f263603g.F.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.c6f);
        } else {
            c19252xb5f78ab1.f263603g.F.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.c6c);
        }
        c19252xb5f78ab1.f263603g.x();
        yj0.a.h(this, "com/tencent/mm/plugin/webview/fts/ui/FtsWebVideoView$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
