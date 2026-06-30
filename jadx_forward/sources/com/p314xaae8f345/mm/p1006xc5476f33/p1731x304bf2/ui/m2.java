package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui;

/* loaded from: classes5.dex */
public class m2 implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.C15951xdd35cc04 f223003d;

    public m2(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.C15951xdd35cc04 c15951xdd35cc04) {
        this.f223003d = c15951xdd35cc04;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public boolean mo322xdd48fb9f() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.C15951xdd35cc04 c15951xdd35cc04 = this.f223003d;
        int i17 = c15951xdd35cc04.f222263e;
        java.util.ArrayList arrayList = c15951xdd35cc04.f222262d;
        if (i17 < (arrayList.size() / 2) - 1) {
            c15951xdd35cc04.f222263e++;
        } else {
            c15951xdd35cc04.f222263e = 0;
        }
        java.lang.String str = (java.lang.String) arrayList.get(c15951xdd35cc04.f222263e * 2);
        java.lang.String str2 = (java.lang.String) arrayList.get((c15951xdd35cc04.f222263e * 2) + 1);
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context = c15951xdd35cc04.getContext();
        float textSize = c15951xdd35cc04.f222268m.getTextSize();
        ((ke0.e) xVar).getClass();
        c15951xdd35cc04.f222268m.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(context, str, textSize));
        c15951xdd35cc04.f222269n.setText(str2);
        c15951xdd35cc04.f222264f.startAnimation(c15951xdd35cc04.f222271p);
        c15951xdd35cc04.f222264f.setVisibility(8);
        c15951xdd35cc04.f222267i.startAnimation(c15951xdd35cc04.f222270o);
        c15951xdd35cc04.f222267i.setVisibility(0);
        android.view.ViewGroup viewGroup = c15951xdd35cc04.f222264f;
        c15951xdd35cc04.f222264f = c15951xdd35cc04.f222267i;
        c15951xdd35cc04.f222267i = viewGroup;
        android.widget.TextView textView = c15951xdd35cc04.f222265g;
        c15951xdd35cc04.f222265g = c15951xdd35cc04.f222268m;
        c15951xdd35cc04.f222268m = textView;
        android.widget.TextView textView2 = c15951xdd35cc04.f222266h;
        c15951xdd35cc04.f222266h = c15951xdd35cc04.f222269n;
        c15951xdd35cc04.f222269n = textView2;
        return true;
    }
}
