package p012xc85e97e9.p087x9da2e250.app;

/* loaded from: classes14.dex */
public class d2 {

    /* renamed from: a, reason: collision with root package name */
    public final p012xc85e97e9.p087x9da2e250.app.z0 f92835a;

    /* renamed from: b, reason: collision with root package name */
    public final p012xc85e97e9.p087x9da2e250.app.f2 f92836b;

    /* renamed from: c, reason: collision with root package name */
    public final p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 f92837c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f92838d = false;

    /* renamed from: e, reason: collision with root package name */
    public int f92839e = -1;

    public d2(p012xc85e97e9.p087x9da2e250.app.z0 z0Var, p012xc85e97e9.p087x9da2e250.app.f2 f2Var, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670) {
        this.f92835a = z0Var;
        this.f92836b = f2Var;
        this.f92837c = componentCallbacksC1101xa17d4670;
    }

    public void a() {
        android.view.View view;
        android.view.View view2;
        p012xc85e97e9.p087x9da2e250.app.f2 f2Var = this.f92836b;
        f2Var.getClass();
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670 = this.f92837c;
        android.view.ViewGroup viewGroup = componentCallbacksC1101xa17d4670.f3420x62389694;
        int i17 = -1;
        if (viewGroup != null) {
            java.util.ArrayList arrayList = f2Var.f92845a;
            int indexOf = arrayList.indexOf(componentCallbacksC1101xa17d4670);
            int i18 = indexOf - 1;
            while (true) {
                if (i18 < 0) {
                    while (true) {
                        indexOf++;
                        if (indexOf >= arrayList.size()) {
                            break;
                        }
                        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d46702 = (p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670) arrayList.get(indexOf);
                        if (componentCallbacksC1101xa17d46702.f3420x62389694 == viewGroup && (view = componentCallbacksC1101xa17d46702.f3462x628b0b2) != null) {
                            i17 = viewGroup.indexOfChild(view);
                            break;
                        }
                    }
                } else {
                    p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d46703 = (p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670) arrayList.get(i18);
                    if (componentCallbacksC1101xa17d46703.f3420x62389694 == viewGroup && (view2 = componentCallbacksC1101xa17d46703.f3462x628b0b2) != null) {
                        i17 = viewGroup.indexOfChild(view2) + 1;
                        break;
                    }
                    i18--;
                }
            }
        }
        componentCallbacksC1101xa17d4670.f3420x62389694.addView(componentCallbacksC1101xa17d4670.f3462x628b0b2, i17);
    }

    public void b() {
        boolean m7619x11f226ac = p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d.m7619x11f226ac(3);
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670 = this.f92837c;
        if (m7619x11f226ac) {
            java.util.Objects.toString(componentCallbacksC1101xa17d4670);
        }
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d46702 = componentCallbacksC1101xa17d4670.f3458x1aea985e;
        p012xc85e97e9.p087x9da2e250.app.d2 d2Var = null;
        p012xc85e97e9.p087x9da2e250.app.f2 f2Var = this.f92836b;
        if (componentCallbacksC1101xa17d46702 != null) {
            p012xc85e97e9.p087x9da2e250.app.d2 d2Var2 = (p012xc85e97e9.p087x9da2e250.app.d2) f2Var.f92846b.get(componentCallbacksC1101xa17d46702.f3465x32e011);
            if (d2Var2 == null) {
                throw new java.lang.IllegalStateException("Fragment " + componentCallbacksC1101xa17d4670 + " declared target fragment " + componentCallbacksC1101xa17d4670.f3458x1aea985e + " that does not belong to this FragmentManager!");
            }
            componentCallbacksC1101xa17d4670.f3460x4a1a7680 = componentCallbacksC1101xa17d4670.f3458x1aea985e.f3465x32e011;
            componentCallbacksC1101xa17d4670.f3458x1aea985e = null;
            d2Var = d2Var2;
        } else {
            java.lang.String str = componentCallbacksC1101xa17d4670.f3460x4a1a7680;
            if (str != null && (d2Var = (p012xc85e97e9.p087x9da2e250.app.d2) f2Var.f92846b.get(str)) == null) {
                throw new java.lang.IllegalStateException("Fragment " + componentCallbacksC1101xa17d4670 + " declared target fragment " + componentCallbacksC1101xa17d4670.f3460x4a1a7680 + " that does not belong to this FragmentManager!");
            }
        }
        if (d2Var != null && (p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d.f3476xa4a928e7 || d2Var.f92837c.f3456xbec81024 < 1)) {
            d2Var.j();
        }
        componentCallbacksC1101xa17d4670.f3432x6226bb5 = componentCallbacksC1101xa17d4670.f3427xccc8bb10.m7676xfb805e1e();
        componentCallbacksC1101xa17d4670.f3443x2ac50ee7 = componentCallbacksC1101xa17d4670.f3427xccc8bb10.m7679x29c22ba0();
        p012xc85e97e9.p087x9da2e250.app.z0 z0Var = this.f92835a;
        z0Var.g(componentCallbacksC1101xa17d4670, false);
        componentCallbacksC1101xa17d4670.m7520x8d00f506();
        z0Var.b(componentCallbacksC1101xa17d4670, false);
    }

    public int c() {
        android.view.ViewGroup viewGroup;
        p012xc85e97e9.p087x9da2e250.app.m3 m3Var;
        p012xc85e97e9.p087x9da2e250.app.k3 k3Var;
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670 = this.f92837c;
        if (componentCallbacksC1101xa17d4670.f3427xccc8bb10 == null) {
            return componentCallbacksC1101xa17d4670.f3456xbec81024;
        }
        int i17 = this.f92839e;
        int i18 = p012xc85e97e9.p087x9da2e250.app.c2.f92803a[componentCallbacksC1101xa17d4670.f3439x3ca7951a.ordinal()];
        if (i18 != 1) {
            i17 = i18 != 2 ? i18 != 3 ? i18 != 4 ? java.lang.Math.min(i17, -1) : java.lang.Math.min(i17, 0) : java.lang.Math.min(i17, 1) : java.lang.Math.min(i17, 5);
        }
        if (componentCallbacksC1101xa17d4670.f3428x4fd80fc1) {
            if (componentCallbacksC1101xa17d4670.f3433x2866c3c) {
                i17 = java.lang.Math.max(this.f92839e, 2);
                android.view.View view = componentCallbacksC1101xa17d4670.f3462x628b0b2;
                if (view != null && view.getParent() == null) {
                    i17 = java.lang.Math.min(i17, 2);
                }
            } else {
                i17 = this.f92839e < 4 ? java.lang.Math.min(i17, componentCallbacksC1101xa17d4670.f3456xbec81024) : java.lang.Math.min(i17, 1);
            }
        }
        if (!componentCallbacksC1101xa17d4670.f3414xbdc32c93) {
            i17 = java.lang.Math.min(i17, 1);
        }
        p012xc85e97e9.p087x9da2e250.app.k3 k3Var2 = null;
        if (p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d.f3476xa4a928e7 && (viewGroup = componentCallbacksC1101xa17d4670.f3420x62389694) != null) {
            p012xc85e97e9.p087x9da2e250.app.n3 f17 = p012xc85e97e9.p087x9da2e250.app.n3.f(viewGroup, componentCallbacksC1101xa17d4670.m7454x171a637d());
            f17.getClass();
            p012xc85e97e9.p087x9da2e250.app.m3 d17 = f17.d(componentCallbacksC1101xa17d4670);
            if (d17 != null) {
                k3Var = d17.f92934b;
            } else {
                java.util.Iterator it = f17.f92955c.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        m3Var = null;
                        break;
                    }
                    m3Var = (p012xc85e97e9.p087x9da2e250.app.m3) it.next();
                    if (m3Var.f92935c.m7427xb2c87fbf(componentCallbacksC1101xa17d4670) && !m3Var.f92938f) {
                        break;
                    }
                }
                if (m3Var != null) {
                    k3Var = m3Var.f92934b;
                }
            }
            k3Var2 = k3Var;
        }
        if (k3Var2 == p012xc85e97e9.p087x9da2e250.app.k3.ADDING) {
            i17 = java.lang.Math.min(i17, 6);
        } else if (k3Var2 == p012xc85e97e9.p087x9da2e250.app.k3.REMOVING) {
            i17 = java.lang.Math.max(i17, 3);
        } else if (componentCallbacksC1101xa17d4670.f3447x66cabce) {
            i17 = componentCallbacksC1101xa17d4670.m7485x7bae6eb2() ? java.lang.Math.min(i17, 1) : java.lang.Math.min(i17, -1);
        }
        if (componentCallbacksC1101xa17d4670.f3424xd1bf805d && componentCallbacksC1101xa17d4670.f3456xbec81024 < 5) {
            i17 = java.lang.Math.min(i17, 4);
        }
        if (p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d.m7619x11f226ac(2)) {
            java.util.Objects.toString(componentCallbacksC1101xa17d4670);
        }
        return i17;
    }

    public void d() {
        boolean m7619x11f226ac = p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d.m7619x11f226ac(3);
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670 = this.f92837c;
        if (m7619x11f226ac) {
            java.util.Objects.toString(componentCallbacksC1101xa17d4670);
        }
        if (componentCallbacksC1101xa17d4670.f3434x95771071) {
            componentCallbacksC1101xa17d4670.m7555x2e999393(componentCallbacksC1101xa17d4670.f3451x806a1427);
            componentCallbacksC1101xa17d4670.f3456xbec81024 = 1;
            return;
        }
        android.os.Bundle bundle = componentCallbacksC1101xa17d4670.f3451x806a1427;
        p012xc85e97e9.p087x9da2e250.app.z0 z0Var = this.f92835a;
        z0Var.h(componentCallbacksC1101xa17d4670, bundle, false);
        componentCallbacksC1101xa17d4670.m7523x9047a7bd(componentCallbacksC1101xa17d4670.f3451x806a1427);
        z0Var.c(componentCallbacksC1101xa17d4670, componentCallbacksC1101xa17d4670.f3451x806a1427, false);
    }

    public void e() {
        java.lang.String str;
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670 = this.f92837c;
        if (componentCallbacksC1101xa17d4670.f3428x4fd80fc1) {
            return;
        }
        if (p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d.m7619x11f226ac(3)) {
            java.util.Objects.toString(componentCallbacksC1101xa17d4670);
        }
        android.view.LayoutInflater m7528xc17f382a = componentCallbacksC1101xa17d4670.m7528xc17f382a(componentCallbacksC1101xa17d4670.f3451x806a1427);
        android.view.ViewGroup viewGroup = componentCallbacksC1101xa17d4670.f3420x62389694;
        if (viewGroup == null) {
            int i17 = componentCallbacksC1101xa17d4670.f3421xb66d4acf;
            if (i17 == 0) {
                viewGroup = null;
            } else {
                if (i17 == -1) {
                    throw new java.lang.IllegalArgumentException("Cannot create fragment " + componentCallbacksC1101xa17d4670 + " for a container view with no id");
                }
                viewGroup = (android.view.ViewGroup) componentCallbacksC1101xa17d4670.f3427xccc8bb10.m7671xe6eebdcb().b(componentCallbacksC1101xa17d4670.f3421xb66d4acf);
                if (viewGroup == null && !componentCallbacksC1101xa17d4670.f3448x10ed2723) {
                    try {
                        str = componentCallbacksC1101xa17d4670.m7460x893a2f6f().getResourceName(componentCallbacksC1101xa17d4670.f3421xb66d4acf);
                    } catch (android.content.res.Resources.NotFoundException unused) {
                        str = com.p159x477cd522.p160x333422.C1461x7397cc93.f4739x19d1382a;
                    }
                    throw new java.lang.IllegalArgumentException("No view found for id 0x" + java.lang.Integer.toHexString(componentCallbacksC1101xa17d4670.f3421xb66d4acf) + " (" + str + ") for fragment " + componentCallbacksC1101xa17d4670);
                }
            }
        }
        componentCallbacksC1101xa17d4670.f3420x62389694 = viewGroup;
        componentCallbacksC1101xa17d4670.mo7408x50ac3002(m7528xc17f382a, viewGroup, componentCallbacksC1101xa17d4670.f3451x806a1427);
        android.view.View view = componentCallbacksC1101xa17d4670.f3462x628b0b2;
        if (view != null) {
            boolean z17 = false;
            view.setSaveFromParentEnabled(false);
            componentCallbacksC1101xa17d4670.f3462x628b0b2.setTag(com.p314xaae8f345.mm.R.id.gd_, componentCallbacksC1101xa17d4670);
            if (viewGroup != null) {
                a();
            }
            if (componentCallbacksC1101xa17d4670.f3430x6dac477) {
                android.view.View view2 = componentCallbacksC1101xa17d4670.f3462x628b0b2;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view2, arrayList.toArray(), "androidx/fragment/app/FragmentStateManager", "createView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view2, "androidx/fragment/app/FragmentStateManager", "createView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View view3 = componentCallbacksC1101xa17d4670.f3462x628b0b2;
            java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
            if (n3.x0.b(view3)) {
                n3.y0.c(componentCallbacksC1101xa17d4670.f3462x628b0b2);
            } else {
                android.view.View view4 = componentCallbacksC1101xa17d4670.f3462x628b0b2;
                view4.addOnAttachStateChangeListener(new p012xc85e97e9.p087x9da2e250.app.b2(this, view4));
            }
            componentCallbacksC1101xa17d4670.m7541x1f859262();
            this.f92835a.m(componentCallbacksC1101xa17d4670, componentCallbacksC1101xa17d4670.f3462x628b0b2, componentCallbacksC1101xa17d4670.f3451x806a1427, false);
            int visibility = componentCallbacksC1101xa17d4670.f3462x628b0b2.getVisibility();
            float alpha = componentCallbacksC1101xa17d4670.f3462x628b0b2.getAlpha();
            if (p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d.f3476xa4a928e7) {
                componentCallbacksC1101xa17d4670.m7575x9abe465c(alpha);
                if (componentCallbacksC1101xa17d4670.f3420x62389694 != null && visibility == 0) {
                    android.view.View findFocus = componentCallbacksC1101xa17d4670.f3462x628b0b2.findFocus();
                    if (findFocus != null) {
                        componentCallbacksC1101xa17d4670.m7567xf50360fa(findFocus);
                        if (p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d.m7619x11f226ac(2)) {
                            findFocus.toString();
                            java.util.Objects.toString(componentCallbacksC1101xa17d4670);
                        }
                    }
                    android.view.View view5 = componentCallbacksC1101xa17d4670.f3462x628b0b2;
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                    arrayList2.add(java.lang.Float.valueOf(0.0f));
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(view5, arrayList2.toArray(), "androidx/fragment/app/FragmentStateManager", "createView", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    view5.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
                    yj0.a.f(view5, "androidx/fragment/app/FragmentStateManager", "createView", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                }
            } else {
                if (visibility == 0 && componentCallbacksC1101xa17d4670.f3420x62389694 != null) {
                    z17 = true;
                }
                componentCallbacksC1101xa17d4670.f3435xfc98abaa = z17;
            }
        }
        componentCallbacksC1101xa17d4670.f3456xbec81024 = 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void f() {
        /*
            Method dump skipped, instructions count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p012xc85e97e9.p087x9da2e250.app.d2.f():void");
    }

    public void g() {
        android.view.View view;
        boolean m7619x11f226ac = p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d.m7619x11f226ac(3);
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670 = this.f92837c;
        if (m7619x11f226ac) {
            java.util.Objects.toString(componentCallbacksC1101xa17d4670);
        }
        android.view.ViewGroup viewGroup = componentCallbacksC1101xa17d4670.f3420x62389694;
        if (viewGroup != null && (view = componentCallbacksC1101xa17d4670.f3462x628b0b2) != null) {
            viewGroup.removeView(view);
        }
        componentCallbacksC1101xa17d4670.m7526x6ca0cb9e();
        this.f92835a.n(componentCallbacksC1101xa17d4670, false);
        componentCallbacksC1101xa17d4670.f3420x62389694 = null;
        componentCallbacksC1101xa17d4670.f3462x628b0b2 = null;
        componentCallbacksC1101xa17d4670.f3463xdf3b8abb = null;
        componentCallbacksC1101xa17d4670.f3464xfe61c291.mo523x53d8522f(null);
        componentCallbacksC1101xa17d4670.f3433x2866c3c = false;
    }

    public void h() {
        boolean m7619x11f226ac = p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d.m7619x11f226ac(3);
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670 = this.f92837c;
        if (m7619x11f226ac) {
            java.util.Objects.toString(componentCallbacksC1101xa17d4670);
        }
        componentCallbacksC1101xa17d4670.m7527x914c1e54();
        boolean z17 = false;
        this.f92835a.e(componentCallbacksC1101xa17d4670, false);
        componentCallbacksC1101xa17d4670.f3456xbec81024 = -1;
        componentCallbacksC1101xa17d4670.f3432x6226bb5 = null;
        componentCallbacksC1101xa17d4670.f3443x2ac50ee7 = null;
        componentCallbacksC1101xa17d4670.f3427xccc8bb10 = null;
        if (componentCallbacksC1101xa17d4670.f3447x66cabce && !componentCallbacksC1101xa17d4670.m7485x7bae6eb2()) {
            z17 = true;
        }
        if (!z17) {
            p012xc85e97e9.p087x9da2e250.app.w1 w1Var = this.f92836b.f92847c;
            if (!(w1Var.f93035d.containsKey(componentCallbacksC1101xa17d4670.f3465x32e011) ? w1Var.f93038g ? w1Var.f93039h : true ^ w1Var.f93040i : true)) {
                return;
            }
        }
        if (p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d.m7619x11f226ac(3)) {
            java.util.Objects.toString(componentCallbacksC1101xa17d4670);
        }
        componentCallbacksC1101xa17d4670.m7480xeffb1961();
    }

    public void i() {
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670 = this.f92837c;
        if (componentCallbacksC1101xa17d4670.f3428x4fd80fc1 && componentCallbacksC1101xa17d4670.f3433x2866c3c && !componentCallbacksC1101xa17d4670.f3444x52044bf4) {
            if (p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d.m7619x11f226ac(3)) {
                java.util.Objects.toString(componentCallbacksC1101xa17d4670);
            }
            componentCallbacksC1101xa17d4670.mo7408x50ac3002(componentCallbacksC1101xa17d4670.m7528xc17f382a(componentCallbacksC1101xa17d4670.f3451x806a1427), null, componentCallbacksC1101xa17d4670.f3451x806a1427);
            android.view.View view = componentCallbacksC1101xa17d4670.f3462x628b0b2;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                componentCallbacksC1101xa17d4670.f3462x628b0b2.setTag(com.p314xaae8f345.mm.R.id.gd_, componentCallbacksC1101xa17d4670);
                if (componentCallbacksC1101xa17d4670.f3430x6dac477) {
                    android.view.View view2 = componentCallbacksC1101xa17d4670.f3462x628b0b2;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList.add(8);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(view2, arrayList.toArray(), "androidx/fragment/app/FragmentStateManager", "ensureInflatedView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(view2, "androidx/fragment/app/FragmentStateManager", "ensureInflatedView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                componentCallbacksC1101xa17d4670.m7541x1f859262();
                this.f92835a.m(componentCallbacksC1101xa17d4670, componentCallbacksC1101xa17d4670.f3462x628b0b2, componentCallbacksC1101xa17d4670.f3451x806a1427, false);
                componentCallbacksC1101xa17d4670.f3456xbec81024 = 2;
            }
        }
    }

    public void j() {
        android.view.ViewGroup viewGroup;
        android.view.ViewGroup viewGroup2;
        android.view.ViewGroup viewGroup3;
        boolean z17 = this.f92838d;
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670 = this.f92837c;
        if (z17) {
            if (p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d.m7619x11f226ac(2)) {
                java.util.Objects.toString(componentCallbacksC1101xa17d4670);
                return;
            }
            return;
        }
        try {
            this.f92838d = true;
            while (true) {
                int c17 = c();
                int i17 = componentCallbacksC1101xa17d4670.f3456xbec81024;
                if (c17 == i17) {
                    if (p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d.f3476xa4a928e7 && componentCallbacksC1101xa17d4670.f3431xaf30923d) {
                        if (componentCallbacksC1101xa17d4670.f3462x628b0b2 != null && (viewGroup = componentCallbacksC1101xa17d4670.f3420x62389694) != null) {
                            p012xc85e97e9.p087x9da2e250.app.n3 f17 = p012xc85e97e9.p087x9da2e250.app.n3.f(viewGroup, componentCallbacksC1101xa17d4670.m7454x171a637d());
                            boolean z18 = componentCallbacksC1101xa17d4670.f3430x6dac477;
                            p012xc85e97e9.p087x9da2e250.app.k3 k3Var = p012xc85e97e9.p087x9da2e250.app.k3.NONE;
                            if (z18) {
                                f17.getClass();
                                if (p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d.m7619x11f226ac(2)) {
                                    java.util.Objects.toString(componentCallbacksC1101xa17d4670);
                                }
                                f17.a(p012xc85e97e9.p087x9da2e250.app.l3.GONE, k3Var, this);
                            } else {
                                f17.getClass();
                                if (p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d.m7619x11f226ac(2)) {
                                    java.util.Objects.toString(componentCallbacksC1101xa17d4670);
                                }
                                f17.a(p012xc85e97e9.p087x9da2e250.app.l3.VISIBLE, k3Var, this);
                            }
                        }
                        p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d abstractC1104xc1ad431d = componentCallbacksC1101xa17d4670.f3427xccc8bb10;
                        if (abstractC1104xc1ad431d != null) {
                            abstractC1104xc1ad431d.m7685xc99a549f(componentCallbacksC1101xa17d4670);
                        }
                        componentCallbacksC1101xa17d4670.f3431xaf30923d = false;
                        componentCallbacksC1101xa17d4670.mo7506x87316e0b(componentCallbacksC1101xa17d4670.f3430x6dac477);
                    }
                    return;
                }
                p012xc85e97e9.p087x9da2e250.app.z0 z0Var = this.f92835a;
                if (c17 <= i17) {
                    switch (i17 - 1) {
                        case -1:
                            h();
                            break;
                        case 0:
                            f();
                            break;
                        case 1:
                            g();
                            componentCallbacksC1101xa17d4670.f3456xbec81024 = 1;
                            break;
                        case 2:
                            componentCallbacksC1101xa17d4670.f3433x2866c3c = false;
                            componentCallbacksC1101xa17d4670.f3456xbec81024 = 2;
                            break;
                        case 3:
                            if (p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d.m7619x11f226ac(3)) {
                                java.util.Objects.toString(componentCallbacksC1101xa17d4670);
                            }
                            if (componentCallbacksC1101xa17d4670.f3462x628b0b2 != null && componentCallbacksC1101xa17d4670.f3455xaccd9bf2 == null) {
                                n();
                            }
                            if (componentCallbacksC1101xa17d4670.f3462x628b0b2 != null && (viewGroup3 = componentCallbacksC1101xa17d4670.f3420x62389694) != null) {
                                p012xc85e97e9.p087x9da2e250.app.n3 f18 = p012xc85e97e9.p087x9da2e250.app.n3.f(viewGroup3, componentCallbacksC1101xa17d4670.m7454x171a637d());
                                f18.getClass();
                                if (p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d.m7619x11f226ac(2)) {
                                    java.util.Objects.toString(componentCallbacksC1101xa17d4670);
                                }
                                f18.a(p012xc85e97e9.p087x9da2e250.app.l3.REMOVED, p012xc85e97e9.p087x9da2e250.app.k3.REMOVING, this);
                            }
                            componentCallbacksC1101xa17d4670.f3456xbec81024 = 3;
                            break;
                        case 4:
                            if (p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d.m7619x11f226ac(3)) {
                                java.util.Objects.toString(componentCallbacksC1101xa17d4670);
                            }
                            componentCallbacksC1101xa17d4670.m7540xa7bccb03();
                            z0Var.l(componentCallbacksC1101xa17d4670, false);
                            break;
                        case 5:
                            componentCallbacksC1101xa17d4670.f3456xbec81024 = 5;
                            break;
                        case 6:
                            if (p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d.m7619x11f226ac(3)) {
                                java.util.Objects.toString(componentCallbacksC1101xa17d4670);
                            }
                            componentCallbacksC1101xa17d4670.m7533x4fa9c315();
                            z0Var.f(componentCallbacksC1101xa17d4670, false);
                            break;
                    }
                } else {
                    switch (i17 + 1) {
                        case 0:
                            b();
                            break;
                        case 1:
                            d();
                            break;
                        case 2:
                            i();
                            e();
                            break;
                        case 3:
                            if (p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d.m7619x11f226ac(3)) {
                                java.util.Objects.toString(componentCallbacksC1101xa17d4670);
                            }
                            componentCallbacksC1101xa17d4670.m7519x3e086738(componentCallbacksC1101xa17d4670.f3451x806a1427);
                            z0Var.a(componentCallbacksC1101xa17d4670, componentCallbacksC1101xa17d4670.f3451x806a1427, false);
                            break;
                        case 4:
                            if (componentCallbacksC1101xa17d4670.f3462x628b0b2 != null && (viewGroup2 = componentCallbacksC1101xa17d4670.f3420x62389694) != null) {
                                p012xc85e97e9.p087x9da2e250.app.n3 f19 = p012xc85e97e9.p087x9da2e250.app.n3.f(viewGroup2, componentCallbacksC1101xa17d4670.m7454x171a637d());
                                p012xc85e97e9.p087x9da2e250.app.l3 b17 = p012xc85e97e9.p087x9da2e250.app.l3.b(componentCallbacksC1101xa17d4670.f3462x628b0b2.getVisibility());
                                f19.getClass();
                                if (p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d.m7619x11f226ac(2)) {
                                    java.util.Objects.toString(componentCallbacksC1101xa17d4670);
                                }
                                f19.a(b17, p012xc85e97e9.p087x9da2e250.app.k3.ADDING, this);
                            }
                            componentCallbacksC1101xa17d4670.f3456xbec81024 = 4;
                            break;
                        case 5:
                            if (p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d.m7619x11f226ac(3)) {
                                java.util.Objects.toString(componentCallbacksC1101xa17d4670);
                            }
                            componentCallbacksC1101xa17d4670.m7539x4fdc6181();
                            z0Var.k(componentCallbacksC1101xa17d4670, false);
                            break;
                        case 6:
                            componentCallbacksC1101xa17d4670.f3456xbec81024 = 6;
                            break;
                        case 7:
                            l();
                            break;
                    }
                }
            }
        } finally {
            this.f92838d = false;
        }
    }

    public void k(java.lang.ClassLoader classLoader) {
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670 = this.f92837c;
        android.os.Bundle bundle = componentCallbacksC1101xa17d4670.f3451x806a1427;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        componentCallbacksC1101xa17d4670.f3455xaccd9bf2 = componentCallbacksC1101xa17d4670.f3451x806a1427.getSparseParcelableArray("android:view_state");
        componentCallbacksC1101xa17d4670.f3454x538b28b5 = componentCallbacksC1101xa17d4670.f3451x806a1427.getBundle("android:view_registry_state");
        componentCallbacksC1101xa17d4670.f3460x4a1a7680 = componentCallbacksC1101xa17d4670.f3451x806a1427.getString("android:target_state");
        if (componentCallbacksC1101xa17d4670.f3460x4a1a7680 != null) {
            componentCallbacksC1101xa17d4670.f3459xc42ffdde = componentCallbacksC1101xa17d4670.f3451x806a1427.getInt("android:target_req_state", 0);
        }
        java.lang.Boolean bool = componentCallbacksC1101xa17d4670.f3453x2ddaffd4;
        if (bool != null) {
            componentCallbacksC1101xa17d4670.f3461x4990e921 = bool.booleanValue();
            componentCallbacksC1101xa17d4670.f3453x2ddaffd4 = null;
        } else {
            componentCallbacksC1101xa17d4670.f3461x4990e921 = componentCallbacksC1101xa17d4670.f3451x806a1427.getBoolean("android:user_visible_hint", true);
        }
        if (componentCallbacksC1101xa17d4670.f3461x4990e921) {
            return;
        }
        componentCallbacksC1101xa17d4670.f3424xd1bf805d = true;
    }

    public void l() {
        boolean m7619x11f226ac = p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d.m7619x11f226ac(3);
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670 = this.f92837c;
        if (m7619x11f226ac) {
            java.util.Objects.toString(componentCallbacksC1101xa17d4670);
        }
        android.view.View m7445x5e9ded86 = componentCallbacksC1101xa17d4670.m7445x5e9ded86();
        if (m7445x5e9ded86 != null) {
            boolean z17 = true;
            if (m7445x5e9ded86 != componentCallbacksC1101xa17d4670.f3462x628b0b2) {
                android.view.ViewParent parent = m7445x5e9ded86.getParent();
                while (true) {
                    if (parent == null) {
                        z17 = false;
                        break;
                    } else if (parent == componentCallbacksC1101xa17d4670.f3462x628b0b2) {
                        break;
                    } else {
                        parent = parent.getParent();
                    }
                }
            }
            if (z17) {
                m7445x5e9ded86.requestFocus();
                if (p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d.m7619x11f226ac(2)) {
                    m7445x5e9ded86.toString();
                    java.util.Objects.toString(componentCallbacksC1101xa17d4670);
                    java.util.Objects.toString(componentCallbacksC1101xa17d4670.f3462x628b0b2.findFocus());
                }
            }
        }
        componentCallbacksC1101xa17d4670.m7567xf50360fa(null);
        componentCallbacksC1101xa17d4670.m7537xa92fceee();
        this.f92835a.i(componentCallbacksC1101xa17d4670, false);
        componentCallbacksC1101xa17d4670.f3451x806a1427 = null;
        componentCallbacksC1101xa17d4670.f3455xaccd9bf2 = null;
        componentCallbacksC1101xa17d4670.f3454x538b28b5 = null;
    }

    public final android.os.Bundle m() {
        android.os.Bundle bundle = new android.os.Bundle();
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670 = this.f92837c;
        componentCallbacksC1101xa17d4670.m7538x2d723d1e(bundle);
        this.f92835a.j(componentCallbacksC1101xa17d4670, bundle, false);
        if (bundle.isEmpty()) {
            bundle = null;
        }
        if (componentCallbacksC1101xa17d4670.f3462x628b0b2 != null) {
            n();
        }
        if (componentCallbacksC1101xa17d4670.f3455xaccd9bf2 != null) {
            if (bundle == null) {
                bundle = new android.os.Bundle();
            }
            bundle.putSparseParcelableArray("android:view_state", componentCallbacksC1101xa17d4670.f3455xaccd9bf2);
        }
        if (componentCallbacksC1101xa17d4670.f3454x538b28b5 != null) {
            if (bundle == null) {
                bundle = new android.os.Bundle();
            }
            bundle.putBundle("android:view_registry_state", componentCallbacksC1101xa17d4670.f3454x538b28b5);
        }
        if (!componentCallbacksC1101xa17d4670.f3461x4990e921) {
            if (bundle == null) {
                bundle = new android.os.Bundle();
            }
            bundle.putBoolean("android:user_visible_hint", componentCallbacksC1101xa17d4670.f3461x4990e921);
        }
        return bundle;
    }

    public void n() {
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670 = this.f92837c;
        if (componentCallbacksC1101xa17d4670.f3462x628b0b2 == null) {
            return;
        }
        android.util.SparseArray<android.os.Parcelable> sparseArray = new android.util.SparseArray<>();
        componentCallbacksC1101xa17d4670.f3462x628b0b2.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            componentCallbacksC1101xa17d4670.f3455xaccd9bf2 = sparseArray;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        componentCallbacksC1101xa17d4670.f3463xdf3b8abb.f92805e.b(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        componentCallbacksC1101xa17d4670.f3454x538b28b5 = bundle;
    }

    public d2(p012xc85e97e9.p087x9da2e250.app.z0 z0Var, p012xc85e97e9.p087x9da2e250.app.f2 f2Var, java.lang.ClassLoader classLoader, p012xc85e97e9.p087x9da2e250.app.u0 u0Var, p012xc85e97e9.p087x9da2e250.app.C1107xfbc51401 c1107xfbc51401) {
        this.f92835a = z0Var;
        this.f92836b = f2Var;
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 a17 = u0Var.a(classLoader, c1107xfbc51401.f92756d);
        this.f92837c = a17;
        android.os.Bundle bundle = c1107xfbc51401.f92765p;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        a17.mo7562xe26dab14(bundle);
        a17.f3465x32e011 = c1107xfbc51401.f92757e;
        a17.f3428x4fd80fc1 = c1107xfbc51401.f92758f;
        a17.f3448x10ed2723 = true;
        a17.f3426x9ca58fd8 = c1107xfbc51401.f92759g;
        a17.f3421xb66d4acf = c1107xfbc51401.f92760h;
        a17.f3457x32d3ed = c1107xfbc51401.f92761i;
        a17.f3449xa8c71e87 = c1107xfbc51401.f92762m;
        a17.f3447x66cabce = c1107xfbc51401.f92763n;
        a17.f3425x634032ff = c1107xfbc51401.f92764o;
        a17.f3430x6dac477 = c1107xfbc51401.f92766q;
        a17.f3439x3ca7951a = p012xc85e97e9.p093xedfae76a.n.m7819xcee59d22()[c1107xfbc51401.f92767r];
        android.os.Bundle bundle2 = c1107xfbc51401.f92768s;
        if (bundle2 != null) {
            a17.f3451x806a1427 = bundle2;
        } else {
            a17.f3451x806a1427 = new android.os.Bundle();
        }
        if (p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d.m7619x11f226ac(2)) {
            java.util.Objects.toString(a17);
        }
    }

    public d2(p012xc85e97e9.p087x9da2e250.app.z0 z0Var, p012xc85e97e9.p087x9da2e250.app.f2 f2Var, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670, p012xc85e97e9.p087x9da2e250.app.C1107xfbc51401 c1107xfbc51401) {
        this.f92835a = z0Var;
        this.f92836b = f2Var;
        this.f92837c = componentCallbacksC1101xa17d4670;
        componentCallbacksC1101xa17d4670.f3455xaccd9bf2 = null;
        componentCallbacksC1101xa17d4670.f3454x538b28b5 = null;
        componentCallbacksC1101xa17d4670.f3417xae473bf6 = 0;
        componentCallbacksC1101xa17d4670.f3433x2866c3c = false;
        componentCallbacksC1101xa17d4670.f3414xbdc32c93 = false;
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d46702 = componentCallbacksC1101xa17d4670.f3458x1aea985e;
        componentCallbacksC1101xa17d4670.f3460x4a1a7680 = componentCallbacksC1101xa17d46702 != null ? componentCallbacksC1101xa17d46702.f3465x32e011 : null;
        componentCallbacksC1101xa17d4670.f3458x1aea985e = null;
        android.os.Bundle bundle = c1107xfbc51401.f92768s;
        if (bundle != null) {
            componentCallbacksC1101xa17d4670.f3451x806a1427 = bundle;
        } else {
            componentCallbacksC1101xa17d4670.f3451x806a1427 = new android.os.Bundle();
        }
    }
}
