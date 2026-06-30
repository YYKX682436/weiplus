package com.p314xaae8f345.mm.ui.p2747xd1075a44.p2755x2eaded;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003R0\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0015"}, d2 = {"Lcom/tencent/mm/ui/widget/code/CodeItemView;", "Lcom/tencent/mm/mvvm/MvvmView;", "Lll5/a;", "Landroid/view/View;", "view", "Ljz5/f0;", "setBottomView", "Lkotlin/Function1;", "h", "Lyz5/l;", "getItemClickListener", "()Lyz5/l;", "setItemClickListener", "(Lyz5/l;)V", "itemClickListener", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "libmmui_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.ui.widget.code.CodeItemView */
/* loaded from: classes5.dex */
public final class C22675xc8629185 extends com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905<ll5.a> {

    /* renamed from: f, reason: collision with root package name */
    public em.b0 f293161f;

    /* renamed from: g, reason: collision with root package name */
    public android.animation.ValueAnimator f293162g;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public yz5.l itemClickListener;

    /* renamed from: i, reason: collision with root package name */
    public boolean f293164i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f293165m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f293166n;

    public /* synthetic */ C22675xc8629185(android.content.Context context, android.util.AttributeSet attributeSet, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(context, (i17 & 2) != 0 ? null : attributeSet);
    }

    @Override // com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905
    public android.view.View c(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570159e30, (android.view.ViewGroup) null);
        this.f293161f = new em.b0(inflate);
        return inflate;
    }

    @Override // com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905
    public void e(q31.p pVar, q31.p pVar2) {
        ll5.a aVar = (ll5.a) pVar2;
        if (aVar != null) {
            em.b0 b0Var = this.f293161f;
            if (b0Var == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("holder");
                throw null;
            }
            if (b0Var.f335637e == null) {
                b0Var.f335637e = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) b0Var.f335633a.findViewById(com.p314xaae8f345.mm.R.id.u7b);
            }
            b0Var.f335637e.setImageResource(aVar.f400799d);
            if (aVar.f400800e != 0) {
                em.b0 b0Var2 = this.f293161f;
                if (b0Var2 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("holder");
                    throw null;
                }
                if (b0Var2.f335637e == null) {
                    b0Var2.f335637e = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) b0Var2.f335633a.findViewById(com.p314xaae8f345.mm.R.id.u7b);
                }
                b0Var2.f335637e.m82040x7541828(aVar.f400800e);
            }
            em.b0 b0Var3 = this.f293161f;
            if (b0Var3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("holder");
                throw null;
            }
            if (b0Var3.f335634b == null) {
                b0Var3.f335634b = (android.widget.TextView) b0Var3.f335633a.findViewById(com.p314xaae8f345.mm.R.id.vir);
            }
            b0Var3.f335634b.setText(aVar.f400801f);
            em.b0 b0Var4 = this.f293161f;
            if (b0Var4 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("holder");
                throw null;
            }
            b0Var4.e().setText(aVar.f400802g);
            ll5.e eVar = new ll5.e(this, aVar);
            em.b0 b0Var5 = this.f293161f;
            if (b0Var5 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("holder");
                throw null;
            }
            if (b0Var5.f335643k == null) {
                b0Var5.f335643k = (android.widget.LinearLayout) b0Var5.f335633a.findViewById(com.p314xaae8f345.mm.R.id.f565288st2);
            }
            b0Var5.f335643k.setOnClickListener(eVar);
            em.b0 b0Var6 = this.f293161f;
            if (b0Var6 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("holder");
                throw null;
            }
            if (b0Var6.f335638f == null) {
                b0Var6.f335638f = (android.widget.FrameLayout) b0Var6.f335633a.findViewById(com.p314xaae8f345.mm.R.id.vao);
            }
            b0Var6.f335638f.setOnClickListener(eVar);
            boolean z17 = this.f293165m;
            boolean z18 = aVar.f400803h;
            if (z17 != z18) {
                this.f293165m = z18;
                yz5.p pVar3 = aVar.f400804i;
                if (pVar3 != null) {
                    java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z18);
                    em.b0 b0Var7 = this.f293161f;
                    if (b0Var7 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("holder");
                        throw null;
                    }
                    android.widget.FrameLayout c17 = b0Var7.c();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getExpandContentContainer(...)");
                    pVar3.mo149xb9724478(valueOf, c17);
                }
                if (this.f293164i) {
                    h(aVar.f400803h, false);
                } else {
                    h(aVar.f400803h, true);
                }
            } else if (this.f293164i) {
                h(z18, false);
            }
            em.b0 b0Var8 = this.f293161f;
            if (b0Var8 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("holder");
                throw null;
            }
            if (b0Var8.f335635c == null) {
                b0Var8.f335635c = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) b0Var8.f335633a.findViewById(com.p314xaae8f345.mm.R.id.u7c);
            }
            b0Var8.f335635c.setVisibility(aVar.f400805m ? 0 : 8);
            em.b0 b0Var9 = this.f293161f;
            if (b0Var9 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("holder");
                throw null;
            }
            if (b0Var9.f335635c == null) {
                b0Var9.f335635c = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) b0Var9.f335633a.findViewById(com.p314xaae8f345.mm.R.id.u7c);
            }
            b0Var9.f335635c.setOnClickListener(new ll5.d(aVar));
            this.f293164i = false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0136  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(android.view.View r20, android.view.View r21, boolean r22, yz5.a r23) {
        /*
            Method dump skipped, instructions count: 816
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2747xd1075a44.p2755x2eaded.C22675xc8629185.g(android.view.View, android.view.View, boolean, yz5.a):void");
    }

    public final yz5.l getItemClickListener() {
        return this.itemClickListener;
    }

    public final void h(boolean z17, boolean z18) {
        if (!z18 || this.f293166n) {
            em.b0 b0Var = this.f293161f;
            if (b0Var == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("holder");
                throw null;
            }
            b0Var.e().setVisibility(z17 ? 8 : 0);
            em.b0 b0Var2 = this.f293161f;
            if (b0Var2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("holder");
                throw null;
            }
            b0Var2.c().setVisibility(z17 ? 0 : 8);
            em.b0 b0Var3 = this.f293161f;
            if (b0Var3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("holder");
                throw null;
            }
            b0Var3.d().setRotation(z17 ? 270.0f : 90.0f);
            if (z17) {
                em.b0 b0Var4 = this.f293161f;
                if (b0Var4 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("holder");
                    throw null;
                }
                b0Var4.c().getLayoutParams().height = -2;
            } else {
                em.b0 b0Var5 = this.f293161f;
                if (b0Var5 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("holder");
                    throw null;
                }
                b0Var5.e().getLayoutParams().height = -2;
            }
            em.b0 b0Var6 = this.f293161f;
            if (b0Var6 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("holder");
                throw null;
            }
            if (b0Var6.a().getVisibility() == 0) {
                em.b0 b0Var7 = this.f293161f;
                if (b0Var7 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("holder");
                    throw null;
                }
                b0Var7.b().setVisibility(z17 ? 0 : 8);
                em.b0 b0Var8 = this.f293161f;
                if (b0Var8 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("holder");
                    throw null;
                }
                b0Var8.b().getLayoutParams().height = -2;
                em.b0 b0Var9 = this.f293161f;
                if (b0Var9 != null) {
                    b0Var9.b().setAlpha(1.0f);
                    return;
                } else {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("holder");
                    throw null;
                }
            }
            return;
        }
        if (z17) {
            android.animation.ValueAnimator valueAnimator = this.f293162g;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.f293162g = null;
            this.f293166n = true;
            em.b0 b0Var10 = this.f293161f;
            if (b0Var10 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("holder");
                throw null;
            }
            b0Var10.d().animate().rotation(270.0f).setDuration(200L).start();
            em.b0 b0Var11 = this.f293161f;
            if (b0Var11 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("holder");
                throw null;
            }
            android.widget.FrameLayout c17 = b0Var11.c();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getExpandContentContainer(...)");
            em.b0 b0Var12 = this.f293161f;
            if (b0Var12 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("holder");
                throw null;
            }
            android.widget.TextView e17 = b0Var12.e();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(e17, "getTvItemSubTitle(...)");
            g(c17, e17, true, new ll5.c(this));
            return;
        }
        android.animation.ValueAnimator valueAnimator2 = this.f293162g;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        this.f293162g = null;
        this.f293166n = true;
        em.b0 b0Var13 = this.f293161f;
        if (b0Var13 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("holder");
            throw null;
        }
        b0Var13.d().animate().rotation(90.0f).setDuration(200L).start();
        em.b0 b0Var14 = this.f293161f;
        if (b0Var14 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("holder");
            throw null;
        }
        android.widget.TextView e18 = b0Var14.e();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(e18, "getTvItemSubTitle(...)");
        em.b0 b0Var15 = this.f293161f;
        if (b0Var15 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("holder");
            throw null;
        }
        android.widget.FrameLayout c18 = b0Var15.c();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getExpandContentContainer(...)");
        g(e18, c18, false, new ll5.b(this));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        android.animation.ValueAnimator valueAnimator = this.f293162g;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f293162g = null;
        em.b0 b0Var = this.f293161f;
        if (b0Var != null) {
            b0Var.d().clearAnimation();
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("holder");
            throw null;
        }
    }

    /* renamed from: setBottomView */
    public final void m81865xb81c4172(android.view.View view) {
        em.b0 b0Var = this.f293161f;
        if (b0Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("holder");
            throw null;
        }
        b0Var.a().removeAllViews();
        if (view == null) {
            em.b0 b0Var2 = this.f293161f;
            if (b0Var2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("holder");
                throw null;
            }
            if (b0Var2.f335642j == null) {
                b0Var2.f335642j = b0Var2.f335633a.findViewById(com.p314xaae8f345.mm.R.id.au8);
            }
            android.view.View view2 = b0Var2.f335642j;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/ui/widget/code/CodeItemView", "setBottomView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/ui/widget/code/CodeItemView", "setBottomView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            em.b0 b0Var3 = this.f293161f;
            if (b0Var3 != null) {
                b0Var3.a().setVisibility(8);
                return;
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("holder");
                throw null;
            }
        }
        android.view.ViewParent parent = view.getParent();
        android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        em.b0 b0Var4 = this.f293161f;
        if (b0Var4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("holder");
            throw null;
        }
        b0Var4.a().addView(view);
        em.b0 b0Var5 = this.f293161f;
        if (b0Var5 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("holder");
            throw null;
        }
        if (b0Var5.f335642j == null) {
            b0Var5.f335642j = b0Var5.f335633a.findViewById(com.p314xaae8f345.mm.R.id.au8);
        }
        android.view.View view3 = b0Var5.f335642j;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/ui/widget/code/CodeItemView", "setBottomView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/ui/widget/code/CodeItemView", "setBottomView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        em.b0 b0Var6 = this.f293161f;
        if (b0Var6 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("holder");
            throw null;
        }
        b0Var6.a().setVisibility(0);
        em.b0 b0Var7 = this.f293161f;
        if (b0Var7 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("holder");
            throw null;
        }
        b0Var7.b().setVisibility(this.f293165m ? 0 : 8);
        em.b0 b0Var8 = this.f293161f;
        if (b0Var8 != null) {
            b0Var8.b().setAlpha(1.0f);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("holder");
            throw null;
        }
    }

    /* renamed from: setItemClickListener */
    public final void m81866x9bb105c7(yz5.l lVar) {
        this.itemClickListener = lVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22675xc8629185(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet, 0, 4, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f293164i = true;
    }
}
