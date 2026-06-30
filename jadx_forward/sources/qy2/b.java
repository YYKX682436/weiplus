package qy2;

/* loaded from: classes5.dex */
public final class b implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1684xd1075a44.p1685x2f6e0a.C15504xec43012b f449314d;

    public b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1684xd1075a44.p1685x2f6e0a.C15504xec43012b c15504xec43012b) {
        this.f449314d = c15504xec43012b;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/widget/edit/FinderEditFooter$init$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1684xd1075a44.p1685x2f6e0a.C15504xec43012b c15504xec43012b = this.f449314d;
        int i17 = c15504xec43012b.f218479o;
        int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1684xd1075a44.p1685x2f6e0a.C15504xec43012b.f218473p;
        if (i17 == 202) {
            android.widget.ImageButton imageButton = c15504xec43012b.f218474g;
            if (imageButton == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("emojiBtn");
                throw null;
            }
            imageButton.setImageResource(com.p314xaae8f345.mm.R.raw.f80094x8ea8d5ee);
            com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291 abstractC19636xc6b37291 = c15504xec43012b.f218476i;
            if (abstractC19636xc6b37291 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("smileyPanel");
                throw null;
            }
            abstractC19636xc6b37291.h();
            android.content.Context context = c15504xec43012b.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context).mo26063x7b383410();
            c15504xec43012b.f218479o = 201;
        } else {
            android.content.Context context2 = c15504xec43012b.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context2, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context2).mo48674x36654fab();
            android.widget.ImageButton imageButton2 = c15504xec43012b.f218474g;
            if (imageButton2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("emojiBtn");
                throw null;
            }
            imageButton2.setImageResource(com.p314xaae8f345.mm.R.raw.f80142x4a505d3f);
            com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291 abstractC19636xc6b372912 = c15504xec43012b.f218476i;
            if (abstractC19636xc6b372912 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("smileyPanel");
                throw null;
            }
            abstractC19636xc6b372912.setVisibility(0);
            com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291 abstractC19636xc6b372913 = c15504xec43012b.f218476i;
            if (abstractC19636xc6b372913 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("smileyPanel");
                throw null;
            }
            abstractC19636xc6b372913.i();
            c15504xec43012b.f218479o = 202;
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/widget/edit/FinderEditFooter$init$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
