package ys2;

/* loaded from: classes10.dex */
public final class o extends if2.b {

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f546706m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f546707n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.ImageView f546708o;

    /* renamed from: p, reason: collision with root package name */
    public android.view.ViewGroup f546709p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.TextView f546710q;

    /* renamed from: r, reason: collision with root package name */
    public android.view.TextureView f546711r;

    /* renamed from: s, reason: collision with root package name */
    public kk4.c f546712s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f546713t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e store) {
        super(store);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(store, "store");
        this.f546706m = "ReplayThumbController";
    }

    public static final float Z6(ys2.o oVar, android.widget.SeekBar seekBar) {
        oVar.getClass();
        float intrinsicWidth = pm0.v.t(seekBar)[0] + seekBar.getThumb().getBounds().left + (seekBar.getThumb().getIntrinsicWidth() / 2.0f);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(oVar.f546709p);
        return intrinsicWidth - (r2.getMeasuredWidth() / 2.0f);
    }

    public static final float a7(ys2.o oVar, android.widget.SeekBar seekBar) {
        oVar.getClass();
        int i17 = pm0.v.t(seekBar)[1];
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(oVar.f546707n);
        return (i17 - r1.getMeasuredHeight()) - com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561247d7);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b7(ys2.o oVar, android.widget.SeekBar seekBar) {
        int b17 = a06.d.b((seekBar.getProgress() / seekBar.getMax()) * ((ct2.j) oVar.m56788xbba4bfc0(ct2.j.class)).S6());
        android.widget.TextView textView = oVar.f546710q;
        boolean z17 = false;
        if (textView != null) {
            textView.setVisibility(0);
        }
        android.widget.TextView textView2 = oVar.f546710q;
        if (textView2 != null) {
            no0.l lVar = no0.m.f420263a;
            textView2.setText(b17 >= 3600 ? no0.l.a(lVar, b17, ":", true, false, false, 24, null) : no0.l.a(lVar, b17, ":", false, false, false, 24, null));
        }
        com.p314xaae8f345.mm.p2495xc50a8b8b.e eVar = null;
        if (oVar.f546713t) {
            kk4.c cVar = oVar.f546712s;
            if (cVar != null && ((kk4.f0) cVar).mo100916xb7d72d0e() == 4) {
                kk4.c cVar2 = oVar.f546712s;
                long mo100920x21a0b6d0 = cVar2 != null ? ((kk4.f0) cVar2).mo100920x21a0b6d0() : 0L;
                int i17 = b17 * 1000;
                if (mo100920x21a0b6d0 >= i17) {
                    kk4.c cVar3 = oVar.f546712s;
                    if (cVar3 != null) {
                        android.widget.ImageView imageView = oVar.f546708o;
                        if (imageView != null) {
                            imageView.setVisibility(4);
                        }
                        android.view.TextureView textureView = oVar.f546711r;
                        if (!(textureView instanceof android.view.View)) {
                            textureView = null;
                        }
                        if (textureView != null) {
                            java.util.ArrayList arrayList = new java.util.ArrayList();
                            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                            arrayList.add(0);
                            java.util.Collections.reverse(arrayList);
                            android.view.TextureView textureView2 = textureView;
                            yj0.a.d(textureView2, arrayList.toArray(), "com/tencent/mm/plugin/finder/replay/controller/ReplayThumbController", "updateThumbContent", "(Landroid/widget/SeekBar;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            textureView.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                            yj0.a.f(textureView2, "com/tencent/mm/plugin/finder/replay/controller/ReplayThumbController", "updateThumbContent", "(Landroid/widget/SeekBar;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        }
                        ((kk4.f0) cVar3).mo100936xc9fc1b13(i17);
                        java.util.LinkedList linkedList = ((ct2.o) oVar.m56788xbba4bfc0(ct2.o.class)).f303830h;
                        java.util.ListIterator listIterator = linkedList.listIterator(linkedList.size());
                        while (true) {
                            if (!listIterator.hasPrevious()) {
                                break;
                            }
                            java.lang.Object previous = listIterator.previous();
                            if (((r45.tr5) previous).m75939xb282bd08(1) <= b17) {
                                eVar = previous;
                                break;
                            }
                        }
                        r45.tr5 tr5Var = (r45.tr5) eVar;
                        if (tr5Var != null) {
                            oVar.d7(tr5Var.m75939xb282bd08(2) > tr5Var.m75939xb282bd08(0));
                        }
                        android.view.ViewGroup viewGroup = oVar.f546709p;
                        if (viewGroup != null && viewGroup.isShown()) {
                            kk4.c cVar4 = oVar.f546712s;
                            if (cVar4 != null && ((kk4.f0) cVar4).mo100916xb7d72d0e() == 4) {
                                z17 = true;
                            }
                            if (z17) {
                                android.view.ViewGroup viewGroup2 = oVar.f546709p;
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(viewGroup2);
                                float width = viewGroup2.getWidth();
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(oVar.f546709p);
                                float height = width / r2.getHeight();
                                kk4.c cVar5 = oVar.f546712s;
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(cVar5);
                                float mo100929x8d5c7601 = ((kk4.f0) cVar5).mo100929x8d5c7601();
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(oVar.f546712s);
                                float mo100928x463504c = mo100929x8d5c7601 / ((kk4.f0) r3).mo100928x463504c();
                                if (mo100928x463504c > height) {
                                    android.view.TextureView textureView3 = oVar.f546711r;
                                    if (textureView3 != null) {
                                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(oVar.f546709p);
                                        float height2 = r4.getHeight() * mo100928x463504c;
                                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(oVar.f546709p);
                                        textureView3.setScaleX(height2 / r2.getWidth());
                                    }
                                    android.view.TextureView textureView4 = oVar.f546711r;
                                    if (textureView4 == null) {
                                        return;
                                    }
                                    textureView4.setScaleY(1.0f);
                                    return;
                                }
                                android.view.TextureView textureView5 = oVar.f546711r;
                                if (textureView5 != null) {
                                    textureView5.setScaleX(1.0f);
                                }
                                android.view.TextureView textureView6 = oVar.f546711r;
                                if (textureView6 == null) {
                                    return;
                                }
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(oVar.f546709p);
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(oVar.f546709p);
                                textureView6.setScaleY((r3.getWidth() / mo100928x463504c) / r0.getHeight());
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
        }
        android.view.TextureView textureView7 = oVar.f546711r;
        if (textureView7 != null) {
            textureView7.setVisibility(8);
        }
        ct2.o oVar2 = (ct2.o) oVar.m56788xbba4bfc0(ct2.o.class);
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = oVar2.f303829g;
        if (!copyOnWriteArrayList.isEmpty()) {
            r45.gp5 gp5Var = (r45.gp5) kz5.n0.i0(copyOnWriteArrayList);
            if (b17 > (gp5Var != null ? gp5Var.m75939xb282bd08(0) : 0) && oVar2.f303833n) {
                oVar2.N6(null);
                oVar2.f303833n = false;
            }
            java.util.Iterator it = copyOnWriteArrayList.iterator();
            int i18 = Integer.MAX_VALUE;
            int i19 = 0;
            int i27 = 0;
            while (it.hasNext()) {
                java.lang.Object next = it.next();
                int i28 = i27 + 1;
                if (i27 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                int abs = java.lang.Math.abs(((r45.gp5) next).m75939xb282bd08(0) - b17);
                if (abs < i18) {
                    i19 = i27;
                    i18 = abs;
                }
                i27 = i28;
            }
            eVar = (r45.gp5) copyOnWriteArrayList.get(i19);
        }
        if (eVar != null) {
            android.widget.ImageView imageView2 = oVar.f546708o;
            if (imageView2 != null) {
                imageView2.setVisibility(0);
            }
            wo0.c a17 = new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) pf5.u.f435469a.e(zy2.b6.class).c(mn2.i4.class))).H).mo141623x754a37bb()).a(new mn2.q3(eVar.m75945x2fec8307(1), com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209889f));
            a17.f529406d = new ys2.n(oVar);
            a17.f();
            return;
        }
        android.widget.ImageView imageView3 = oVar.f546708o;
        if (imageView3 != null) {
            imageView3.setVisibility(8);
        }
        android.widget.TextView textView3 = oVar.f546710q;
        if (textView3 == null) {
            return;
        }
        textView3.setVisibility(8);
    }

    public final void c7() {
        android.view.View view = this.f546707n;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/replay/controller/ReplayThumbController", "hideThumb", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/replay/controller/ReplayThumbController", "hideThumb", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.mg mgVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.mg) R6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.mg.class);
        if (mgVar != null) {
            mgVar.K0(0);
        }
    }

    public final void d7(boolean z17) {
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        android.view.ViewGroup viewGroup = this.f546709p;
        android.view.ViewGroup.LayoutParams layoutParams = viewGroup != null ? viewGroup.getLayoutParams() : null;
        if (layoutParams == null) {
            return;
        }
        if (z17 == (layoutParams.width > layoutParams.height)) {
            return;
        }
        if (z17) {
            layoutParams.width = (int) context.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561203c7);
            layoutParams.height = (int) context.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.by);
        } else {
            layoutParams.width = (int) context.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.by);
            layoutParams.height = (int) context.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561203c7);
        }
        android.view.ViewGroup viewGroup2 = this.f546709p;
        if (viewGroup2 == null) {
            return;
        }
        viewGroup2.setLayoutParams(layoutParams);
    }

    public final void e7(boolean z17) {
        this.f546713t = z17;
        android.view.View view = this.f546707n;
        if (view != null) {
            view.measure(0, 0);
        }
        android.view.View view2 = this.f546707n;
        if (view2 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/finder/replay/controller/ReplayThumbController", "showThumb", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/replay/controller/ReplayThumbController", "showThumb", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.mg mgVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.mg) R6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.mg.class);
        if (mgVar != null) {
            mgVar.K0(8);
        }
    }

    public final void f7(float f17, float f18) {
        android.view.View view = this.f546707n;
        if (view != null) {
            view.setX(f17);
        }
        android.view.View view2 = this.f546707n;
        if (view2 == null) {
            return;
        }
        view2.setY(f18);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveActivate */
    public void mo8997x8001c97e() {
        df0.q qVar = (df0.q) i95.n0.c(df0.q.class);
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        this.f546712s = ((cf0.q) qVar).wi(context);
        ((ct2.o) m56788xbba4bfc0(ct2.o.class)).N6(new ys2.k(this));
    }

    @Override // if2.b, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveDeactivate */
    public void mo14860x9606ce3f() {
        super.mo14860x9606ce3f();
        kk4.c cVar = this.f546712s;
        if (cVar != null) {
            cVar.mo100933x41012807();
        }
        this.f546712s = null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onViewMount */
    public void mo8998x9f682d55(android.view.ViewGroup pluginLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginLayout, "pluginLayout");
        super.mo8998x9f682d55(pluginLayout);
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) pluginLayout.findViewById(com.p314xaae8f345.mm.R.id.lyu);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(viewGroup);
        viewGroup.getVisibility();
        this.f546707n = viewGroup.findViewById(com.p314xaae8f345.mm.R.id.o78);
        this.f546708o = (android.widget.ImageView) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.l47);
        this.f546709p = (android.view.ViewGroup) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.o6y);
        this.f546710q = (android.widget.TextView) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.f568009lc3);
        android.view.TextureView textureView = (android.view.TextureView) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.f568832o74);
        this.f546711r = textureView;
        if (textureView != null) {
            textureView.setSurfaceTextureListener(new ys2.j(this));
        }
        at2.y1 y1Var = (at2.y1) R6(at2.y1.class);
        if (y1Var != null) {
            ys2.l lVar = new ys2.l(this);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1617xc84c47e7.p1621xd1075a44.C14938xc9a3f782 c14938xc9a3f782 = y1Var.f95314q;
            c14938xc9a3f782.getClass();
            ((java.util.ArrayList) c14938xc9a3f782.f206461p).add(lVar);
        }
    }

    @Override // if2.b, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onViewUnmount */
    public void mo8999xb1ef75c(android.view.ViewGroup pluginLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginLayout, "pluginLayout");
        this.f372636i = null;
        android.view.View view = this.f546707n;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/replay/controller/ReplayThumbController", "onViewUnmount", "(Landroid/view/ViewGroup;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/replay/controller/ReplayThumbController", "onViewUnmount", "(Landroid/view/ViewGroup;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.widget.ImageView imageView = this.f546708o;
        if (imageView != null) {
            imageView.setImageBitmap(null);
        }
        this.f546707n = null;
        this.f546708o = null;
        this.f546709p = null;
        this.f546710q = null;
        this.f546713t = false;
        this.f546711r = null;
    }
}
