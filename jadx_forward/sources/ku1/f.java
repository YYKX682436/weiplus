package ku1;

/* loaded from: classes15.dex */
public class f extends ku1.m {

    /* renamed from: b, reason: collision with root package name */
    public android.view.View f393610b;

    @Override // ku1.m
    public void c() {
    }

    @Override // ku1.m
    public void d(int i17) {
        android.view.View view = this.f393610b;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/card/ui/view/CardAnnoucementView", "setVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/card/ui/view/CardAnnoucementView", "setVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    @Override // ku1.m
    public void e() {
        tt1.j jVar = ((com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.b0) this.f393665a).E;
        r45.ju juVar = jVar.s0().I;
        if (juVar != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardAnnoucementView", "card tp annoucement  endtime: " + juVar.f459639g);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardAnnoucementView", "card tp annoucement  text: " + juVar.f459637e);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardAnnoucementView", "card tp annoucement  thumb_url: " + juVar.f459641i);
        }
        if (juVar != null && !android.text.TextUtils.isEmpty(juVar.f459637e) && jVar.n()) {
            if (this.f393610b == null) {
                this.f393610b = ((android.view.ViewStub) b(com.p314xaae8f345.mm.R.id.b7r)).inflate();
            }
            ((android.widget.TextView) this.f393610b.findViewById(com.p314xaae8f345.mm.R.id.lcr)).setText(juVar.f459637e);
            this.f393610b.setOnClickListener(((com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.b0) this.f393665a).X);
            return;
        }
        android.view.View view = this.f393610b;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/card/ui/view/CardAnnoucementView", "update", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/card/ui/view/CardAnnoucementView", "update", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }
}
