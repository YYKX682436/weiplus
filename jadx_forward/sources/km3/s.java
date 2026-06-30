package km3;

/* loaded from: classes10.dex */
public final class s implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ km3.t f390792d;

    public s(km3.t tVar) {
        this.f390792d = tVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.Boolean bool;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/mv/ui/adapter/MusicMvAlbumAdapter$selectListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Object tag = view.getTag(com.p314xaae8f345.mm.R.id.f566922hj2);
        if (tag == null || !(tag instanceof java.lang.Integer)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Music.MusicMvAlbumAdapter", "error tag");
            yj0.a.h(this, "com/tencent/mm/plugin/mv/ui/adapter/MusicMvAlbumAdapter$selectListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        java.lang.Number number = (java.lang.Number) tag;
        int intValue = number.intValue();
        km3.t tVar = this.f390792d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 x17 = tVar.x(intValue);
        if (x17 == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(x17.f219963e)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Music.MusicMvAlbumAdapter", "[onClick] null == item!");
            tVar.m8147xed6e4d18(number.intValue());
            yj0.a.h(this, "com/tencent/mm/plugin/mv/ui/adapter/MusicMvAlbumAdapter$selectListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Music.MusicMvAlbumAdapter", "click image path:" + x17.f219963e);
        boolean z17 = true;
        boolean z18 = x17.f219975t ^ true;
        x17.f219975t = z18;
        km3.k kVar = tVar.f390801o;
        if (kVar != null) {
            int i17 = com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16687xe732929a.B1;
            com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16687xe732929a c16687xe732929a = ((com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.r0) kVar).f233465a;
            if (c16687xe732929a.h()) {
                com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.b0 b0Var = c16687xe732929a.G;
                if (b0Var != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.ActivityC16653xffd2636a activityC16653xffd2636a = (com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.ActivityC16653xffd2636a) b0Var;
                    java.lang.String str3 = "local_" + x17.f219967i;
                    boolean z19 = x17 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15635xf0ea441b;
                    int i18 = z19 ? 3 : 1;
                    int i19 = z19 ? ((com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15635xf0ea441b) x17).f219979x : 0;
                    p012xc85e97e9.p093xedfae76a.c1 a17 = pf5.z.f435481a.a(activityC16653xffd2636a).a(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.v4.class);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
                    com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.v4 v4Var = (com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.v4) a17;
                    v4Var.f233032s = true;
                    com.p314xaae8f345.mm.p1006xc5476f33.mv.p1915x633fb29.p1916x2ffff9.C16646x38766471 c16646x38766471 = v4Var.f233024h;
                    if (!z18) {
                        activityC16653xffd2636a.f232412r -= i18;
                        c16646x38766471.s(str3);
                        c16646x38766471.D();
                        str = "(Landroid/view/View;)V";
                        str2 = "onClick";
                    } else if (activityC16653xffd2636a.W6(i19, i18, z19)) {
                        fm3.q qVar = new fm3.q();
                        qVar.f345642g = 1;
                        qVar.f345645m = new fm3.m(x17);
                        if (z19) {
                            java.lang.String n17 = x17.n();
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(n17, "uniqueValue(...)");
                            com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15635xf0ea441b c15635xf0ea441b = (com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15635xf0ea441b) x17;
                            java.lang.String str4 = c15635xf0ea441b.f219963e;
                            str = "(Landroid/view/View;)V";
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str4, "getOriginalPath(...)");
                            str2 = "onClick";
                            fm3.p pVar = new fm3.p(n17, str4, c15635xf0ea441b.f219979x, 0, 0, 24, null);
                            pVar.f345631d = c15635xf0ea441b.f219981z;
                            pVar.f345632e = c15635xf0ea441b.f219980y;
                            qVar.f345646n = pVar;
                        } else {
                            str = "(Landroid/view/View;)V";
                            str2 = "onClick";
                        }
                        fm3.g0 g0Var = fm3.g0.f345603a;
                        fm3.g0.f345605c = 2;
                        g0Var.b(c16646x38766471.f233598o.size(), qVar);
                        gm3.c cVar = new gm3.c(str3, 1, java.lang.System.currentTimeMillis(), 0);
                        gm3.a aVar = new gm3.a(0L, 0L, null, null, 0, 0, 63, null);
                        cVar.f355080h = aVar;
                        aVar.f355070c = x17.o();
                        gm3.a aVar2 = cVar.f355080h;
                        if (aVar2 != null) {
                            aVar2.f355068a = x17.f219967i;
                        }
                        if (aVar2 != null) {
                            aVar2.f355069b = x17.f219968m;
                        }
                        if (aVar2 != null) {
                            aVar2.f355071d = x17;
                        }
                        if (z19) {
                            cVar.f355082m = ((com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15635xf0ea441b) x17).f219979x;
                        } else {
                            cVar.f355082m = 0;
                            android.graphics.Point q07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.q0(x17.o());
                            gm3.a aVar3 = cVar.f355080h;
                            if (aVar3 != null) {
                                aVar3.f355072e = q07 != null ? q07.x : 0;
                            }
                            if (aVar3 != null) {
                                aVar3.f355073f = q07 != null ? q07.y : 0;
                            }
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe.q(c16646x38766471, cVar, false, 2, null);
                        c16646x38766471.D();
                    }
                    z17 = true;
                }
                str = "(Landroid/view/View;)V";
                str2 = "onClick";
                z17 = false;
            } else {
                str = "(Landroid/view/View;)V";
                str2 = "onClick";
            }
            bool = java.lang.Boolean.valueOf(z17);
        } else {
            str = "(Landroid/view/View;)V";
            str2 = "onClick";
            bool = null;
        }
        if (bool != null && !bool.booleanValue()) {
            x17.f219975t = false;
        }
        tVar.m8147xed6e4d18(number.intValue());
        yj0.a.h(this, "com/tencent/mm/plugin/mv/ui/adapter/MusicMvAlbumAdapter$selectListener$1", "android/view/View$OnClickListener", str2, str);
    }
}
