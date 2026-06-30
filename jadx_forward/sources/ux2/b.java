package ux2;

/* loaded from: classes5.dex */
public final class b extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ux2.f f513380d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ux2.f fVar) {
        super(0);
        this.f513380d = fVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.graphics.Bitmap bitmap;
        android.view.View view;
        ux2.f fVar = this.f513380d;
        yw2.t tVar = (yw2.t) fVar.f513386c;
        yw2.a0 a0Var = tVar.f548203a;
        if (a0Var.k().getShowFooter() && !a0Var.k().getCloseComment()) {
            boolean z17 = fVar.f513389f;
            android.content.Context context = fVar.f513384a;
            if (!z17 && !z17) {
                fVar.f513389f = true;
                android.view.View inflate = android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.f570322e65, null);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
                fVar.f513392i = inflate;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.d2.f206527a.n(inflate, "you_might_want_to_send_picture", (r20 & 4) != 0 ? 40 : 0, (r20 & 8) != 0 ? 25496 : 0, (r20 & 16) != 0 ? false : false, (r20 & 32) != 0 ? false : false, (r20 & 64) != 0 ? null : kz5.b1.e(new jz5.l("feed_id", pm0.v.u(((java.lang.Number) fVar.f513388e.mo152xb9724478()).longValue()))), (r20 & 128) != 0 ? null : null);
                android.view.View view2 = fVar.f513392i;
                if (view2 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("contentView");
                    throw null;
                }
                android.view.View findViewById = view2.findViewById(com.p314xaae8f345.mm.R.id.f568069ux0);
                fVar.f513393j = findViewById;
                if (findViewById != null) {
                    android.content.Context context2 = fVar.f513384a;
                    findViewById.setBackground(new ux2.g(context2, b3.l.m9702x7444d5ad(context2, com.p314xaae8f345.mm.ui.bk.C() ? com.p314xaae8f345.mm.R.C30859x5a72f63.f560050z : com.p314xaae8f345.mm.R.C30859x5a72f63.f560024c), context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561205c9), 0.0f, 4.0f, b3.l.m9702x7444d5ad(context, com.p314xaae8f345.mm.R.C30859x5a72f63.f77908xe61cad8f), ((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209233fe).mo141623x754a37bb()).r()).floatValue()));
                }
                android.view.View view3 = fVar.f513392i;
                if (view3 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("contentView");
                    throw null;
                }
                fVar.f513394k = (android.widget.ImageView) view3.findViewById(com.p314xaae8f345.mm.R.id.llu);
                android.view.View view4 = fVar.f513392i;
                if (view4 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("contentView");
                    throw null;
                }
                android.view.View view5 = fVar.f513392i;
                if (view5 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("contentView");
                    throw null;
                }
                db5.d5 d5Var = new db5.d5(view5, context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.amf), -2, false);
                fVar.f513396m = d5Var;
                d5Var.setBackgroundDrawable(new android.graphics.drawable.ColorDrawable(0));
                db5.d5 d5Var2 = fVar.f513396m;
                if (d5Var2 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("bubble");
                    throw null;
                }
                d5Var2.setOutsideTouchable(true);
                android.view.View view6 = fVar.f513392i;
                if (view6 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("contentView");
                    throw null;
                }
                view6.setOnClickListener(new ux2.e(fVar));
            }
            android.widget.ImageView imageView = fVar.f513394k;
            if (imageView != null && fVar.f513391h != null && (bitmap = fVar.f513395l) != null && (view = fVar.f513385b) != null) {
                imageView.setImageBitmap(bitmap);
                yw2.a0 a0Var2 = tVar.f548203a;
                int height = ((a0Var2.k().getHeight() - pm0.v.r(a0Var2.n()).top) - i65.a.h(a0Var2.l(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561204c8)) - i65.a.h(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561181bn);
                if (context instanceof android.app.Activity) {
                    android.app.Activity activity = (android.app.Activity) context;
                    if (!activity.isFinishing() && !activity.isDestroyed()) {
                        try {
                            db5.d5 d5Var3 = fVar.f513396m;
                            if (d5Var3 == null) {
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("bubble");
                                throw null;
                            }
                            if (height < 0) {
                                height = 0;
                            }
                            d5Var3.showAtLocation(view, 85, 0, height);
                        } catch (java.lang.NullPointerException e17) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("FinderCommentRecentImageBubble", e17, "", new java.lang.Object[0]);
                        }
                    }
                }
                pm0.v.U(com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d, fVar.f513397n);
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("FinderCommentRecentImageBubble", "isSupportRecentImageHelper is false");
        }
        return jz5.f0.f384359a;
    }
}
