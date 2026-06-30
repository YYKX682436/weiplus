package sr;

/* loaded from: classes5.dex */
public class g implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p679x5c28046.p684x373aa5.C10449x84ee1171 f492926d;

    public g(com.p314xaae8f345.mm.p679x5c28046.p684x373aa5.C10449x84ee1171 c10449x84ee1171) {
        this.f492926d = c10449x84ee1171;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/emoji/view/EmojiPanelInputComponent$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p679x5c28046.p684x373aa5.C10449x84ee1171 c10449x84ee1171 = this.f492926d;
        if ("keyboard".equals(c10449x84ee1171.f146473i.getTag())) {
            sr.k kVar = c10449x84ee1171.f146478q;
            if (kVar != null) {
                kVar.mo158845x36654fab();
            }
            c10449x84ee1171.f146471g.i();
            c10449x84ee1171.m43722x39b81cde(c10449x84ee1171.f146476o);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.d2.j(c10449x84ee1171.getContext())) {
                int j17 = com.p314xaae8f345.mm.ui.bk.j(c10449x84ee1171.getContext());
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiPanelInputComponent", "is show key board %d, %d, %d", java.lang.Integer.valueOf(c10449x84ee1171.f146475n), java.lang.Integer.valueOf(c10449x84ee1171.f146474m), java.lang.Integer.valueOf(j17));
                int i17 = c10449x84ee1171.f146475n;
                if ((i17 > 0 && i17 < c10449x84ee1171.f146474m - j17) || c10449x84ee1171.f146477p) {
                    c10449x84ee1171.f146477p = false;
                    c10449x84ee1171.m81273xb2a7481e().e(new sr.j(c10449x84ee1171));
                    c10449x84ee1171.f146472h.k();
                    c10449x84ee1171.f146473i.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562769o2);
                    c10449x84ee1171.f146473i.setTag("emoji");
                }
            }
            c10449x84ee1171.f146471g.setVisibility(0);
            c10449x84ee1171.f146472h.k();
            c10449x84ee1171.f146473i.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562769o2);
            c10449x84ee1171.f146473i.setTag("emoji");
        } else {
            c10449x84ee1171.f146472h.k();
            c10449x84ee1171.g();
            sr.k kVar2 = c10449x84ee1171.f146478q;
            if (kVar2 != null) {
                kVar2.mo158846x7b383410();
            }
            c10449x84ee1171.f146473i.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562768o1);
            c10449x84ee1171.f146473i.setTag("keyboard");
        }
        yj0.a.h(this, "com/tencent/mm/emoji/view/EmojiPanelInputComponent$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
