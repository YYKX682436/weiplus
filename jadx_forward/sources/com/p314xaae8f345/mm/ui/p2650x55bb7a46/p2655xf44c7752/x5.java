package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752;

/* loaded from: classes3.dex */
public class x5 implements db5.z7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.view.View f283084a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b f283085b;

    public x5(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b viewOnClickListenerC21748xb3d38e6b, android.view.View view) {
        this.f283085b = viewOnClickListenerC21748xb3d38e6b;
        this.f283084a = view;
    }

    @Override // db5.z7
    public void a(float f17, float f18) {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b viewOnClickListenerC21748xb3d38e6b = this.f283085b;
        float height = 1.0f - (f18 / viewOnClickListenerC21748xb3d38e6b.f282170n.getHeight());
        float f19 = height <= 1.0f ? height : 1.0f;
        viewOnClickListenerC21748xb3d38e6b.f282217z3 = f19;
        viewOnClickListenerC21748xb3d38e6b.C3 = viewOnClickListenerC21748xb3d38e6b.K7(viewOnClickListenerC21748xb3d38e6b.f282144g, viewOnClickListenerC21748xb3d38e6b.f282170n);
        if (viewOnClickListenerC21748xb3d38e6b.C3 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ImageGalleryUI", "runDragAnimation contentView is null !!");
            return;
        }
        boolean z17 = false;
        if (f17 == 0.0f && f18 == 0.0f) {
            if (viewOnClickListenerC21748xb3d38e6b.o8() && viewOnClickListenerC21748xb3d38e6b.f282161k4) {
                try {
                    com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ta v17 = viewOnClickListenerC21748xb3d38e6b.f282144g.v();
                    v17.d();
                    if (v17.f282970o.getVisibility() == 8) {
                        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ta v18 = viewOnClickListenerC21748xb3d38e6b.f282144g.v();
                        v18.d();
                        v18.f282970o.setVisibility(0);
                        viewOnClickListenerC21748xb3d38e6b.f282161k4 = false;
                        ((vf0.c) i95.n0.c(vf0.c.class)).getClass();
                        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ta v19 = viewOnClickListenerC21748xb3d38e6b.f282144g.v();
                        v19.d();
                        v19.f282970o.setVisibility(8);
                    }
                } catch (java.lang.Exception unused) {
                }
            }
            if (viewOnClickListenerC21748xb3d38e6b.f282165l4) {
                viewOnClickListenerC21748xb3d38e6b.o9(false);
                viewOnClickListenerC21748xb3d38e6b.f282165l4 = false;
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.q3.a(viewOnClickListenerC21748xb3d38e6b.f282138e3, new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.C21770x69515290());
            }
            android.view.View view = this.f283084a;
            if (view != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI$35", "onGalleryScale", "(FF)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI$35", "onGalleryScale", "(FF)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        } else {
            if (java.lang.Math.abs(f17) > 10.0f || java.lang.Math.abs(f18) > 10.0f) {
                if (viewOnClickListenerC21748xb3d38e6b.o8()) {
                    try {
                        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ta v27 = viewOnClickListenerC21748xb3d38e6b.f282144g.v();
                        v27.d();
                        if (v27.f282970o.getVisibility() == 0) {
                            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ta v28 = viewOnClickListenerC21748xb3d38e6b.f282144g.v();
                            v28.d();
                            v28.f282970o.setVisibility(8);
                            viewOnClickListenerC21748xb3d38e6b.f282161k4 = true;
                        }
                    } catch (java.lang.Exception unused2) {
                    }
                }
                if (viewOnClickListenerC21748xb3d38e6b.f282183q.getVisibility() == 0) {
                    viewOnClickListenerC21748xb3d38e6b.k8();
                }
                viewOnClickListenerC21748xb3d38e6b.f282165l4 = true;
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.q3.a(viewOnClickListenerC21748xb3d38e6b.f282138e3, new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.C21755x980ae199());
                android.view.View view2 = this.f283084a;
                if (view2 != null) {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                    arrayList2.add(4);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI$35", "onGalleryScale", "(FF)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(view2, "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI$35", "onGalleryScale", "(FF)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
            z17 = true;
        }
        viewOnClickListenerC21748xb3d38e6b.C3.setPivotX(viewOnClickListenerC21748xb3d38e6b.f282170n.getWidth() / 2);
        viewOnClickListenerC21748xb3d38e6b.C3.setPivotY(viewOnClickListenerC21748xb3d38e6b.f282170n.getHeight() / 2);
        viewOnClickListenerC21748xb3d38e6b.C3.setScaleX(f19);
        viewOnClickListenerC21748xb3d38e6b.C3.setScaleY(f19);
        viewOnClickListenerC21748xb3d38e6b.C3.setTranslationX(f17);
        viewOnClickListenerC21748xb3d38e6b.C3.setTranslationY(f18);
        viewOnClickListenerC21748xb3d38e6b.W1.setAlpha(f19);
        android.view.View view3 = viewOnClickListenerC21748xb3d38e6b.C3;
        if (view3 instanceof com.p314xaae8f345.mm.ui.p2642x2e06d1.C21537x5f41189f) {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.C21537x5f41189f) view3).m45737x3a5986f(z17);
        }
    }

    @Override // db5.z7
    public void b(float f17, float f18) {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b viewOnClickListenerC21748xb3d38e6b = this.f283085b;
        viewOnClickListenerC21748xb3d38e6b.A3 = (int) f17;
        viewOnClickListenerC21748xb3d38e6b.B3 = (int) f18;
    }
}
