package gd2;

/* loaded from: classes3.dex */
public final class d implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gd2.i f352059d;

    public d(gd2.i iVar) {
        this.f352059d = iVar;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        gd2.i iVar = this.f352059d;
        if (itemId == 2) {
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = iVar.f352065a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 a17 = tm3.a.a(abstractActivityC21394xb3d2c0cf);
            java.lang.String str = iVar.f352066b;
            if (r26.n0.N(str) || a17 == null) {
                return;
            }
            if (!gm0.j1.u().l()) {
                db5.t7.k(a17, null);
                return;
            }
            i95.m c17 = i95.n0.c(vb0.o.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.l7.a(str, abstractActivityC21394xb3d2c0cf, null);
            return;
        }
        if (itemId != 4) {
            if (itemId != 12) {
                return;
            }
            gd2.x xVar = iVar.f352068d;
            com.p314xaae8f345.mm.ui.p2740x696c9db.C22506x89e75b89 c22506x89e75b89 = iVar.f352067c;
            android.view.View selectedView = c22506x89e75b89.getSelectedView();
            if (xVar.f352112p == null) {
                i95.m c18 = i95.n0.c(ry3.j.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
                xVar.f352112p = ((yz3.w) ((ry3.j) c18)).Ai(xVar.f352097a, 1);
            }
            sy3.c cVar = xVar.f352112p;
            if (cVar == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("imageOCRHelper");
                throw null;
            }
            ((kz3.l) cVar).f395420e = c22506x89e75b89;
            ry3.p pVar = new ry3.p();
            pVar.f483066g = 12;
            pVar.f483060a = java.lang.System.currentTimeMillis();
            pVar.f483061b = 3;
            pVar.f483071l = false;
            pVar.f483072m = true;
            pVar.f483073n = 204;
            pVar.f483064e = iVar.f352066b;
            android.widget.ImageView imageView = xVar.f352106j;
            if (imageView == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("scanLine");
                throw null;
            }
            imageView.setVisibility(0);
            android.widget.ImageView imageView2 = xVar.f352107k;
            if (imageView2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("scanTransLayer");
                throw null;
            }
            imageView2.setVisibility(0);
            android.widget.ImageView imageView3 = xVar.f352108l;
            if (imageView3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("cancelTranslationBtn");
                throw null;
            }
            imageView3.setVisibility(0);
            android.animation.ValueAnimator valueAnimator = xVar.f352109m;
            valueAnimator.setRepeatMode(1);
            valueAnimator.setRepeatCount(-1);
            valueAnimator.start();
            sy3.c cVar2 = xVar.f352112p;
            if (cVar2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("imageOCRHelper");
                throw null;
            }
            ((kz3.l) cVar2).a(selectedView);
            ry3.m mVar = new ry3.m();
            mVar.f483058b = true;
            sy3.c cVar3 = xVar.f352112p;
            if (cVar3 != null) {
                xVar.f352113q = ((kz3.l) cVar3).i(pVar, mVar, xVar.f352114r);
                return;
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("imageOCRHelper");
                throw null;
            }
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.f9.ContextTranslate.k(iVar.f352065a, null)) {
            gd2.x xVar2 = iVar.f352068d;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.p1439x38a5ee5f.C13709xbc18ee15 c13709xbc18ee15 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.p1439x38a5ee5f.C13709xbc18ee15) ((gd2.l) xVar2.f352098b).f352076a.f352079b.mo152xb9724478();
            java.lang.String m55652x596791eb = c13709xbc18ee15 != null ? c13709xbc18ee15.m55652x596791eb() : null;
            int i18 = xVar2.f352105i;
            if (i18 == 0 || i18 == 2) {
                if (m55652x596791eb == null || r26.n0.N(m55652x596791eb)) {
                    return;
                }
                xVar2.f352104h = m55652x596791eb;
                int i19 = xVar2.f352101e ? 6 : 5;
                i95.m c19 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.z.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c19, "getService(...)");
                dm.aa bj6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.q0) ((com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.z) c19)).bj(m55652x596791eb);
                com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf2 = xVar2.f352097a;
                if (bj6 != null && com.p314xaae8f345.mm.vfs.w6.j(bj6.f65916x970b0f9e)) {
                    android.content.Intent intent = new android.content.Intent();
                    intent.putExtra("original_file_path", m55652x596791eb);
                    intent.putExtra("translate_source", i19);
                    intent.setClassName(abstractActivityC21394xb3d2c0cf2, "com.tencent.mm.plugin.scanner.ui.TranslationResultUI");
                    com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf3 = xVar2.f352097a;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(intent);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(abstractActivityC21394xb3d2c0cf3, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/ui/commentimage/menu/FinderCommentImageTransAndOcrLogic", "doTransPhoto", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    abstractActivityC21394xb3d2c0cf3.startActivity((android.content.Intent) arrayList.get(0));
                    yj0.a.f(abstractActivityC21394xb3d2c0cf3, "com/tencent/mm/plugin/finder/feed/ui/commentimage/menu/FinderCommentImageTransAndOcrLogic", "doTransPhoto", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    return;
                }
                xVar2.f352103g = (int) (c01.z1.r().hashCode() + java.lang.System.currentTimeMillis());
                int n17 = gm0.j1.d().n();
                if (n17 == 6 || n17 == 4) {
                    xVar2.f352105i = 1;
                    android.widget.ImageView imageView4 = xVar2.f352106j;
                    if (imageView4 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("scanLine");
                        throw null;
                    }
                    imageView4.setVisibility(0);
                    android.widget.ImageView imageView5 = xVar2.f352107k;
                    if (imageView5 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("scanTransLayer");
                        throw null;
                    }
                    imageView5.setVisibility(0);
                    android.widget.ImageView imageView6 = xVar2.f352108l;
                    if (imageView6 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("cancelTranslationBtn");
                        throw null;
                    }
                    imageView6.setVisibility(0);
                    android.animation.ValueAnimator valueAnimator2 = xVar2.f352109m;
                    valueAnimator2.setRepeatMode(1);
                    valueAnimator2.setRepeatCount(-1);
                    valueAnimator2.start();
                } else {
                    db5.e1.s(abstractActivityC21394xb3d2c0cf2, abstractActivityC21394xb3d2c0cf2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572033wu), "");
                    xVar2.c();
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderCommentImageTransAndOcrLogic", "try to translate img " + m55652x596791eb + ", sessionId " + xVar2.f352103g);
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5973x2e8f3b26 c5973x2e8f3b26 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5973x2e8f3b26();
                am.bt btVar = c5973x2e8f3b26.f136271g;
                btVar.f87815a = i19;
                btVar.f87817c = m55652x596791eb;
                btVar.f87816b = xVar2.f352103g;
                c5973x2e8f3b26.e();
            }
        }
    }
}
