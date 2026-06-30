package wu3;

/* loaded from: classes5.dex */
public final class j implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17039xf3cc6396 f531300a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f531301b;

    public j(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17039xf3cc6396 c17039xf3cc6396, boolean z17) {
        this.f531300a = c17039xf3cc6396;
        this.f531301b = z17;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        java.lang.Object obj2;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        int i17 = fVar.f152148a;
        int i18 = fVar.f152149b;
        java.lang.String str = fVar.f152150c;
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17039xf3cc6396 c17039xf3cc6396 = this.f531300a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c17039xf3cc6396.f237483d, "LogStory: SearchdMusic callback " + i17 + ' ' + i18 + ", " + str);
        if (i17 == 0 && i18 == 0) {
            r45.mh mhVar = (r45.mh) fVar.f152151d;
            c17039xf3cc6396.f237498v = mhVar.f462032d;
            c17039xf3cc6396.f237499w++;
            java.util.LinkedList linkedList = mhVar.f462033e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(linkedList);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            int i19 = 0;
            for (java.lang.Object obj3 : linkedList) {
                int i27 = i19 + 1;
                if (i19 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a c17 = com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a.M.c((r45.mh4) obj3, 3);
                c17.f237252p = 4;
                c17.f237259w = 0;
                c17.f237260x = c17039xf3cc6396.mRelatedRecId;
                arrayList.add(c17);
                i19 = i27;
            }
            if (linkedList.size() == 10) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a c16997xb0aa383a = new com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a();
                c16997xb0aa383a.f237251o = 5;
                arrayList.add(c16997xb0aa383a);
            }
            if (linkedList.isEmpty() && c17039xf3cc6396.f237499w == 1) {
                android.widget.LinearLayout linearLayout = c17039xf3cc6396.f237494r;
                if (linearLayout != null) {
                    linearLayout.setVisibility(8);
                }
                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = c17039xf3cc6396.f237492p;
                if (c1163xf1deaba4 != null) {
                    c1163xf1deaba4.setVisibility(8);
                }
                android.widget.TextView textView = c17039xf3cc6396.f237493q;
                if (textView != null) {
                    textView.setVisibility(0);
                }
            } else {
                android.widget.LinearLayout linearLayout2 = c17039xf3cc6396.f237494r;
                if (linearLayout2 != null) {
                    linearLayout2.setVisibility(8);
                }
                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba42 = c17039xf3cc6396.f237492p;
                if (c1163xf1deaba42 != null) {
                    c1163xf1deaba42.setVisibility(0);
                }
                android.widget.TextView textView2 = c17039xf3cc6396.f237493q;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                }
                if (this.f531301b) {
                    su3.m mVar = c17039xf3cc6396.f237497u;
                    if (mVar != null) {
                        java.util.ArrayList arrayList2 = mVar.f494326d;
                        int size = arrayList2.size();
                        java.util.ListIterator listIterator = arrayList2.listIterator(arrayList2.size());
                        while (true) {
                            if (!listIterator.hasPrevious()) {
                                obj2 = null;
                                break;
                            }
                            obj2 = listIterator.previous();
                            int i28 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a) obj2).f237251o;
                            if (i28 == 4 || i28 == 5 || i28 == 2) {
                                break;
                            }
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a c16997xb0aa383a2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a) obj2;
                        if (c16997xb0aa383a2 != null) {
                            arrayList2.remove(c16997xb0aa383a2);
                        }
                        int size2 = arrayList2.size();
                        if (size == size2) {
                            arrayList2.addAll(arrayList);
                            mVar.m8153xd399a4d9(size, arrayList.size());
                        } else {
                            arrayList2.addAll(arrayList);
                            mVar.m8147xed6e4d18(size2);
                            mVar.m8153xd399a4d9(size, arrayList.size() - 1);
                        }
                    }
                } else {
                    su3.m mVar2 = c17039xf3cc6396.f237497u;
                    if (mVar2 != null) {
                        mVar2.B(arrayList);
                    }
                }
            }
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6995x32f4d2aa c6995x32f4d2aa = wt3.v.f531039j;
            c6995x32f4d2aa.f143088h = c17039xf3cc6396.f237498v;
            c6995x32f4d2aa.f143084d = c6995x32f4d2aa.b("QueryContent", c17039xf3cc6396.f237501y, true);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c17039xf3cc6396.f237483d, "get audio list " + mhVar);
        } else if (c17039xf3cc6396.f237499w == 0) {
            android.widget.LinearLayout linearLayout3 = c17039xf3cc6396.f237494r;
            if (linearLayout3 != null) {
                linearLayout3.setVisibility(8);
            }
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba43 = c17039xf3cc6396.f237492p;
            if (c1163xf1deaba43 != null) {
                c1163xf1deaba43.setVisibility(8);
            }
            android.widget.TextView textView3 = c17039xf3cc6396.f237493q;
            if (textView3 != null) {
                textView3.setVisibility(0);
            }
        }
        return null;
    }
}
