package sf4;

/* loaded from: classes4.dex */
public final class a1 implements lf4.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.p2242xf44c7752.C18497x85806502 f488944a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f488945b;

    public a1(com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.p2242xf44c7752.C18497x85806502 c18497x85806502, android.content.Context context) {
        this.f488944a = c18497x85806502;
        this.f488945b = context;
    }

    public void a(int i17) {
        boolean z17;
        int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.p2242xf44c7752.C18497x85806502.f253618l1;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("deleteGroup: exitCheck ");
        com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.p2242xf44c7752.C18497x85806502 c18497x85806502 = this.f488944a;
        sb6.append(c18497x85806502.getDeleteWhenFirstEmpty());
        sb6.append(' ');
        sb6.append(i17);
        sb6.append(' ');
        sb6.append(c18497x85806502.f253635u);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StoryGalleryView", sb6.toString());
        if (c18497x85806502.getDeleteWhenFirstEmpty() && i17 == 0 && c18497x85806502.f253635u <= 0) {
            ze4.h hVar = c18497x85806502.C;
            if (hVar != null) {
                hVar.Y0();
                return;
            }
            return;
        }
        java.util.ArrayList items = c18497x85806502.f253642z;
        if (i17 >= 0 && i17 < items.size()) {
            items.remove(i17);
            sf4.k kVar = c18497x85806502.f253638x;
            kVar.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(items, "items");
            java.util.ArrayList arrayList = kVar.f489045d;
            arrayList.clear();
            arrayList.addAll(items);
            kVar.m8155x27702c4(i17);
            pf4.h hVar2 = c18497x85806502.L.f253598s;
            if (hVar2 != null && i17 >= 0) {
                java.util.ArrayList arrayList2 = hVar2.f435402d;
                if (i17 < arrayList2.size() - 2) {
                    int i19 = i17 + 1;
                    arrayList2.remove(i19);
                    hVar2.m8155x27702c4(i19);
                }
            }
        }
        if (items.size() <= 1) {
            sf4.p pVar = c18497x85806502.Q;
            pVar.getClass();
            pm0.v.X(new sf4.n(pVar));
        }
        if (items.isEmpty()) {
            ze4.h hVar3 = c18497x85806502.C;
            if (hVar3 != null) {
                hVar3.c2();
            }
            android.view.View view = c18497x85806502.F;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view, arrayList3.toArray(), "com/tencent/mm/plugin/story/ui/view/gallery/StoryGalleryView$galleryGroupUpdateCallback$1", "deleteGroup", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/story/ui/view/gallery/StoryGalleryView$galleryGroupUpdateCallback$1", "deleteGroup", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        ze4.h hVar4 = c18497x85806502.C;
        if (hVar4 != null) {
            hVar4.H2();
        }
        z17 = c18497x85806502.mIsActive;
        if (z17) {
            return;
        }
        android.view.View view2 = c18497x85806502.F;
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList4.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(view2, arrayList4.toArray(), "com/tencent/mm/plugin/story/ui/view/gallery/StoryGalleryView$galleryGroupUpdateCallback$1", "deleteGroup", "(I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view2.setAlpha(((java.lang.Float) arrayList4.get(0)).floatValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/story/ui/view/gallery/StoryGalleryView$galleryGroupUpdateCallback$1", "deleteGroup", "(I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        android.view.View view3 = c18497x85806502.F;
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        arrayList5.add(0);
        java.util.Collections.reverse(arrayList5);
        yj0.a.d(view3, arrayList5.toArray(), "com/tencent/mm/plugin/story/ui/view/gallery/StoryGalleryView$galleryGroupUpdateCallback$1", "deleteGroup", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/story/ui/view/gallery/StoryGalleryView$galleryGroupUpdateCallback$1", "deleteGroup", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public void b(boolean z17) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f488944a.N;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        if (!z17) {
            android.content.Context context = this.f488945b;
            db5.t7.m123883x26a183b(context, context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.jlw), 0).show();
            return;
        }
        int i17 = ef4.k.f333991a;
        com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
        com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var2 = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_STORY_ONE_DAY_POST_COUNT_INT_SYNC;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(c17.m(u3Var2, 0), "null cannot be cast to non-null type kotlin.Int");
        gm0.j1.u().c().x(u3Var2, java.lang.Integer.valueOf(java.lang.Math.max(0, ((java.lang.Integer) r4).intValue() - 1)));
    }

    public void c(int i17) {
        int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.p2242xf44c7752.C18497x85806502.f253618l1;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("notifyGroup, groupIndex:");
        sb6.append(i17);
        sb6.append(", selectedRow:");
        com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.p2242xf44c7752.C18497x85806502 c18497x85806502 = this.f488944a;
        sb6.append(c18497x85806502.f253635u);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.StoryGalleryView", sb6.toString(), new java.lang.Object[0]);
        if (c18497x85806502.f253635u != i17) {
            c18497x85806502.f253640y.post(new sf4.v0(c18497x85806502, i17));
            return;
        }
        pf4.x xVar = c18497x85806502.f253632r;
        if (xVar != null) {
            xVar.m8146xced61ae5();
        }
    }

    public void d() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.p2242xf44c7752.C18492x194e0ecc c18492x194e0ecc;
        com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.p2242xf44c7752.C18497x85806502 c18497x85806502 = this.f488944a;
        int size = c18497x85806502.f253642z.size();
        int i17 = c18497x85806502.f253635u;
        boolean z17 = false;
        if (i17 >= 0 && i17 < size) {
            z17 = true;
        }
        if (!z17 || (c18492x194e0ecc = c18497x85806502.f253631q) == null) {
            return;
        }
        java.lang.Object obj = c18497x85806502.f253642z.get(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
        c18492x194e0ecc.a((java.util.List) obj);
    }

    public void e(int i17, int i18, int i19) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.p2242xf44c7752.C18497x85806502 c18497x85806502 = this.f488944a;
        if (c18497x85806502.f253635u != i17) {
            c18497x85806502.f253640y.post(new sf4.w0(c18497x85806502, i17));
            return;
        }
        pf4.x xVar = c18497x85806502.f253632r;
        if (xVar != null) {
            xVar.m8151xc67946d3(i18, i19);
        }
    }

    public void f(int i17, int i18, int i19) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.p2242xf44c7752.C18497x85806502 c18497x85806502 = this.f488944a;
        if (c18497x85806502.f253635u != i17) {
            c18497x85806502.f253640y.post(new sf4.y0(c18497x85806502, i17));
            return;
        }
        pf4.x xVar = c18497x85806502.f253632r;
        if (xVar != null) {
            xVar.m8154xdb81fc7f(i18, i19);
        }
    }

    public void g(boolean z17, boolean z18) {
        if (!z18) {
            if (z17) {
                android.content.Context context = this.f488945b;
                db5.e1.s(context, "", context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.jmi));
                return;
            }
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.p2242xf44c7752.C18494xf7976fba c18494xf7976fba = this.f488944a.L;
        if (z17) {
            c18494xf7976fba.getClass();
        }
        c18494xf7976fba.f253588f.setVisibility(8);
    }

    public void h(int i17, java.util.List items) {
        boolean z17;
        com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.p2242xf44c7752.C18491x1e73db43 c18491x1e73db43;
        boolean z18;
        boolean z19;
        com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.p2242xf44c7752.C18491x1e73db43 c18491x1e73db432;
        com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.p2242xf44c7752.C18491x1e73db43 c18491x1e73db433;
        pf4.x xVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(items, "items");
        int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.p2242xf44c7752.C18497x85806502.f253618l1;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateGroup, groupIndex:");
        sb6.append(i17);
        sb6.append(", items:");
        sb6.append(items.size());
        sb6.append(", active:");
        com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.p2242xf44c7752.C18497x85806502 c18497x85806502 = this.f488944a;
        z17 = c18497x85806502.mIsActive;
        sb6.append(z17);
        sb6.append(", galleryType:");
        sb6.append(c18497x85806502.getGalleryType());
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.StoryGalleryView", sb6.toString(), new java.lang.Object[0]);
        java.util.ArrayList items2 = c18497x85806502.f253642z;
        if (i17 >= items2.size()) {
            return;
        }
        ((java.util.ArrayList) items2.get(i17)).clear();
        ((java.util.ArrayList) items2.get(i17)).addAll(items);
        sf4.k kVar = c18497x85806502.f253638x;
        kVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(items2, "items");
        java.util.ArrayList arrayList = kVar.f489045d;
        arrayList.clear();
        arrayList.addAll(items2);
        if (c18497x85806502.f253635u == i17 && (xVar = c18497x85806502.f253632r) != null) {
            java.util.ArrayList arrayList2 = xVar.f435441f;
            arrayList2.clear();
            arrayList2.addAll(items);
        }
        if (items2.size() == 1 && items.isEmpty()) {
            ze4.h hVar = c18497x85806502.C;
            if (hVar != null) {
                hVar.c2();
            }
            android.view.View view = c18497x85806502.F;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view, arrayList3.toArray(), "com/tencent/mm/plugin/story/ui/view/gallery/StoryGalleryView$galleryGroupUpdateCallback$1", "updateGroup", "(ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/story/ui/view/gallery/StoryGalleryView$galleryGroupUpdateCallback$1", "updateGroup", "(ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (c18497x85806502.getGalleryType() == ze4.k.SelfTabGallery) {
                c18491x1e73db433 = c18497x85806502.holderView;
                c18491x1e73db433.setVisibility(0);
                mf4.d dVar = mf4.d.f407693a;
                mf4.d.f407694b.f142449d = 1L;
                dVar.b();
            } else {
                c18491x1e73db432 = c18497x85806502.holderView;
                c18491x1e73db432.setVisibility(8);
            }
        } else {
            c18497x85806502.post(new sf4.z0(c18497x85806502));
            ze4.h hVar2 = c18497x85806502.C;
            if (hVar2 != null) {
                hVar2.H2();
            }
            c18491x1e73db43 = c18497x85806502.holderView;
            c18491x1e73db43.setVisibility(8);
            z18 = c18497x85806502.mIsActive;
            if (!z18) {
                android.view.View view2 = c18497x85806502.F;
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList4.add(java.lang.Float.valueOf(1.0f));
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(view2, arrayList4.toArray(), "com/tencent/mm/plugin/story/ui/view/gallery/StoryGalleryView$galleryGroupUpdateCallback$1", "updateGroup", "(ILjava/util/List;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view2.setAlpha(((java.lang.Float) arrayList4.get(0)).floatValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/story/ui/view/gallery/StoryGalleryView$galleryGroupUpdateCallback$1", "updateGroup", "(ILjava/util/List;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                android.view.View view3 = c18497x85806502.F;
                java.util.ArrayList arrayList5 = new java.util.ArrayList();
                arrayList5.add(0);
                java.util.Collections.reverse(arrayList5);
                yj0.a.d(view3, arrayList5.toArray(), "com/tencent/mm/plugin/story/ui/view/gallery/StoryGalleryView$galleryGroupUpdateCallback$1", "updateGroup", "(ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                yj0.a.f(view3, "com/tencent/mm/plugin/story/ui/view/gallery/StoryGalleryView$galleryGroupUpdateCallback$1", "updateGroup", "(ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        if (i17 == 0) {
            z19 = c18497x85806502.mIsActive;
            if (!z19 && c18497x85806502.getGalleryType() != ze4.k.HistoryGallery && c18497x85806502.getGalleryType() != ze4.k.MultiUserGallery) {
                c18497x85806502.v(0, 0);
                return;
            }
        }
        if (i17 == 1) {
            c18497x85806502.getGalleryType();
        }
    }

    public void i(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.p2242xf44c7752.C18497x85806502 c18497x85806502 = this.f488944a;
        if (i17 <= 1) {
            sf4.p pVar = c18497x85806502.Q;
            pVar.getClass();
            pm0.v.X(new sf4.n(pVar));
        }
        c18497x85806502.f253642z.clear();
        for (int i18 = 0; i18 < i17; i18++) {
            c18497x85806502.f253642z.add(new java.util.ArrayList());
        }
    }
}
