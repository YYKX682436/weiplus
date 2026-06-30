package ky2;

/* loaded from: classes.dex */
public final class i implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f395083d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ky2.w f395084e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 f395085f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f395086g;

    public i(int i17, ky2.w wVar, p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a787, android.widget.TextView textView) {
        this.f395083d = i17;
        this.f395084e = wVar;
        this.f395085f = c1073x7e08a787;
        this.f395086g = textView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        boolean z17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/vote/adapter/FinderLiveAnchorVoteAdapter$VoteAddViewHolder$_onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ky2.w wVar = this.f395084e;
        int size = wVar.f395118e.size() - 1;
        int i17 = this.f395083d;
        if (i17 == size) {
            ((ky2.r) wVar.f395118e.get(i17)).f395110c = 2;
            ky2.r rVar = (ky2.r) wVar.f395118e.get(i17);
            rVar.getClass();
            rVar.f395108a = "";
            wVar.f395126p = i17;
            wVar.m8147xed6e4d18(i17);
            int i18 = wVar.f395119f;
            android.widget.TextView textView = this.f395086g;
            p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a787 = this.f395085f;
            if (i17 < i18) {
                java.util.List list = wVar.f395118e;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list, "access$getDataList$p(...)");
                if (!list.isEmpty()) {
                    java.util.Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (((ky2.r) it.next()).f395110c == 1) {
                            z17 = true;
                            break;
                        }
                    }
                }
                z17 = false;
                if (z17) {
                    yj0.a.h(this, "com/tencent/mm/plugin/finder/vote/adapter/FinderLiveAnchorVoteAdapter$VoteAddViewHolder$_onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    return;
                }
                wVar.f395118e.add(new ky2.r("", new ky2.s(false, 0, null, 7, null), 1));
                wVar.m8149x8b456734(wVar.mo1894x7e414b06());
                wVar.m8147xed6e4d18(wVar.mo1894x7e414b06());
                c1073x7e08a787.setVisibility(0);
                textView.setVisibility(8);
            } else {
                c1073x7e08a787.setVisibility(4);
                textView.setVisibility(0);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/vote/adapter/FinderLiveAnchorVoteAdapter$VoteAddViewHolder$_onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
