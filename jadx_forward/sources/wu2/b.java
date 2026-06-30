package wu2;

/* loaded from: classes2.dex */
public final class b extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.C15115xd2dec60f f531207d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.C15115xd2dec60f c15115xd2dec60f) {
        super(0);
        this.f531207d = c15115xd2dec60f;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.widget.TextView textView;
        android.widget.TextView textView2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.C15115xd2dec60f c15115xd2dec60f = this.f531207d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.d dVar = c15115xd2dec60f.f210783x;
        java.lang.String str = null;
        if (dVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallback");
            throw null;
        }
        dVar.f187713m.m82688x390c1d00(c15115xd2dec60f.G0().m56393xfb854877() > 10);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.d dVar2 = c15115xd2dec60f.f210783x;
        if (dVar2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallback");
            throw null;
        }
        android.view.View f294968x = dVar2.f187713m.getF294968x();
        android.view.View findViewById = f294968x != null ? f294968x.findViewById(com.p314xaae8f345.mm.R.id.ilg) : null;
        if (findViewById != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            android.view.View view = findViewById;
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/ui/fragment/FinderAllFeedGridFragment$initOnCreate$1$2$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/ui/fragment/FinderAllFeedGridFragment$initOnCreate$1$2$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.d dVar3 = c15115xd2dec60f.f210783x;
        if (dVar3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallback");
            throw null;
        }
        android.view.View f294968x2 = dVar3.f187713m.getF294968x();
        android.widget.TextView textView3 = f294968x2 != null ? (android.widget.TextView) f294968x2.findViewById(com.p314xaae8f345.mm.R.id.ili) : null;
        if (textView3 != null) {
            textView3.setVisibility(8);
        }
        int i17 = c15115xd2dec60f.f210798p;
        if (i17 == 102) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.d dVar4 = c15115xd2dec60f.f210783x;
            if (dVar4 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallback");
                throw null;
            }
            android.view.View f294968x3 = dVar4.f187713m.getF294968x();
            if (f294968x3 != null && (textView2 = (android.widget.TextView) f294968x3.findViewById(com.p314xaae8f345.mm.R.id.ili)) != null) {
                textView2.setVisibility(0);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a aVar = c15115xd2dec60f.f210782w;
                if (aVar == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("presenter");
                    throw null;
                }
                java.util.ArrayList m56387xe6796cde = aVar.f188689e.m56387xe6796cde();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.util.Iterator it = m56387xe6796cde.iterator();
                while (it.hasNext()) {
                    java.lang.Object next = it.next();
                    if (next instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) {
                        arrayList2.add(next);
                    }
                }
                textView2.setText(textView2.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f1d, java.lang.Integer.valueOf(arrayList2.size())));
            }
        } else {
            if (i17 == 100) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.d dVar5 = c15115xd2dec60f.f210783x;
                if (dVar5 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallback");
                    throw null;
                }
                android.view.View f294968x4 = dVar5.f187713m.getF294968x();
                if (f294968x4 != null && (textView = (android.widget.TextView) f294968x4.findViewById(com.p314xaae8f345.mm.R.id.ili)) != null) {
                    textView.setVisibility(0);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a aVar2 = c15115xd2dec60f.f210782w;
                    if (aVar2 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("presenter");
                        throw null;
                    }
                    java.util.ArrayList m56387xe6796cde2 = aVar2.f188689e.m56387xe6796cde();
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    java.util.Iterator it6 = m56387xe6796cde2.iterator();
                    while (it6.hasNext()) {
                        java.lang.Object next2 = it6.next();
                        if (next2 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) {
                            arrayList3.add(next2);
                        }
                    }
                    int size = arrayList3.size();
                    java.lang.String d17 = cu2.f0.f303924a.d("FinderObjectDynamicItemKey_FinderFavFeedFooterHint");
                    if (d17 != null) {
                        str = java.lang.String.format(d17, java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(size)}, 1));
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "format(...)");
                    }
                    if (str == null) {
                        str = textView.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.cun, java.lang.Integer.valueOf(size));
                    }
                    textView.setText(str);
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
