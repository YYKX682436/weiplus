package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

/* loaded from: classes2.dex */
public final class zh extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.C14067x53338e9a f192338d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zh(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.C14067x53338e9a c14067x53338e9a) {
        super(0);
        this.f192338d = c14067x53338e9a;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.C14067x53338e9a c14067x53338e9a = this.f192338d;
        if (c14067x53338e9a.f191024u == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderPostPlaySquareContainerFragment", "reloadData: viewCallback not initialized yet");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderPostPlaySquareContainerFragment", "reloadData: clearing data and reloading... hasLoadedData=" + c14067x53338e9a.f191028y);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13883xc81866dd c13883xc81866dd = c14067x53338e9a.f191025v;
            if (c13883xc81866dd == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("feedLoader");
                throw null;
            }
            c13883xc81866dd.m56387xe6796cde().clear();
            c13883xc81866dd.m56377x73095078(null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c13883xc81866dd.getF204960d(), "clearData: data cleared, isRequesting reset to false");
            c14067x53338e9a.f191028y = false;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.to toVar = c14067x53338e9a.f191024u;
            if (toVar == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallback");
                throw null;
            }
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = toVar.f190630n;
            if (c22848x6ddd90cf == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("adapter");
                throw null;
            }
            c22848x6ddd90cf.m8146xced61ae5();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.to toVar2 = c14067x53338e9a.f191024u;
            if (toVar2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallback");
                throw null;
            }
            android.view.View a17 = toVar2.a();
            if (a17 != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(a17, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderPostPlaySquareContainerFragment$reloadData$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                a17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(a17, "com/tencent/mm/plugin/finder/feed/ui/FinderPostPlaySquareContainerFragment$reloadData$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.to toVar3 = c14067x53338e9a.f191024u;
                if (toVar3 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallback");
                    throw null;
                }
                toVar3.g().setVisibility(8);
                android.view.View findViewById = a17.findViewById(com.p314xaae8f345.mm.R.id.lbi);
                if (findViewById != null) {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    arrayList2.add(0);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderPostPlaySquareContainerFragment$reloadData$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/feed/ui/FinderPostPlaySquareContainerFragment$reloadData$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                android.view.View findViewById2 = a17.findViewById(com.p314xaae8f345.mm.R.id.dft);
                if (findViewById2 != null) {
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    arrayList3.add(8);
                    java.util.Collections.reverse(arrayList3);
                    yj0.a.d(findViewById2, arrayList3.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderPostPlaySquareContainerFragment$reloadData$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                    yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/feed/ui/FinderPostPlaySquareContainerFragment$reloadData$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                android.view.View findViewById3 = a17.findViewById(com.p314xaae8f345.mm.R.id.m2g);
                if (findViewById3 != null) {
                    java.util.ArrayList arrayList4 = new java.util.ArrayList();
                    arrayList4.add(8);
                    java.util.Collections.reverse(arrayList4);
                    yj0.a.d(findViewById3, arrayList4.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderPostPlaySquareContainerFragment$reloadData$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById3.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                    yj0.a.f(findViewById3, "com/tencent/mm/plugin/finder/feed/ui/FinderPostPlaySquareContainerFragment$reloadData$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.to toVar4 = c14067x53338e9a.f191024u;
            if (toVar4 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallback");
                throw null;
            }
            android.view.View view = toVar4.f190631o;
            if (view != null) {
                android.view.View findViewById4 = view.findViewById(com.p314xaae8f345.mm.R.id.ilg);
                if (findViewById4 != null) {
                    java.util.ArrayList arrayList5 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                    arrayList5.add(8);
                    java.util.Collections.reverse(arrayList5);
                    yj0.a.d(findViewById4, arrayList5.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderPostPlaySquareContainerFragment$reloadData$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById4.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                    yj0.a.f(findViewById4, "com/tencent/mm/plugin/finder/feed/ui/FinderPostPlaySquareContainerFragment$reloadData$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                android.view.View findViewById5 = view.findViewById(com.p314xaae8f345.mm.R.id.ilh);
                if (findViewById5 != null) {
                    java.util.ArrayList arrayList6 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
                    arrayList6.add(8);
                    java.util.Collections.reverse(arrayList6);
                    yj0.a.d(findViewById5, arrayList6.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderPostPlaySquareContainerFragment$reloadData$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById5.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
                    yj0.a.f(findViewById5, "com/tencent/mm/plugin/finder/feed/ui/FinderPostPlaySquareContainerFragment$reloadData$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.no noVar = c14067x53338e9a.f191023t;
            if (noVar == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("presenter");
                throw null;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122.m56345x587162dc(noVar.f190120d, false, 1, null);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.to toVar5 = c14067x53338e9a.f191024u;
            if (toVar5 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallback");
                throw null;
            }
            com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00.T(toVar5.g(), 0, false, null, 7, null);
            c14067x53338e9a.f191028y = true;
        }
        return jz5.f0.f384359a;
    }
}
