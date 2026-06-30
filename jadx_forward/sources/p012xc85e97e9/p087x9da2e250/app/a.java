package p012xc85e97e9.p087x9da2e250.app;

/* loaded from: classes14.dex */
public final class a extends p012xc85e97e9.p087x9da2e250.app.i2 implements p012xc85e97e9.p087x9da2e250.app.k1, p012xc85e97e9.p087x9da2e250.app.q1 {

    /* renamed from: r, reason: collision with root package name */
    public final p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d f92782r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f92783s;

    /* renamed from: t, reason: collision with root package name */
    public int f92784t;

    public a(p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d abstractC1104xc1ad431d) {
        super(abstractC1104xc1ad431d.m7673x6e9e7e64(), abstractC1104xc1ad431d.m7676xfb805e1e() != null ? abstractC1104xc1ad431d.m7676xfb805e1e().f93027e.getClassLoader() : null);
        this.f92784t = -1;
        this.f92782r = abstractC1104xc1ad431d;
    }

    public static boolean v(p012xc85e97e9.p087x9da2e250.app.h2 h2Var) {
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670 = h2Var.f92862b;
        return (componentCallbacksC1101xa17d4670 == null || !componentCallbacksC1101xa17d4670.f3414xbdc32c93 || componentCallbacksC1101xa17d4670.f3462x628b0b2 == null || componentCallbacksC1101xa17d4670.f3425x634032ff || componentCallbacksC1101xa17d4670.f3430x6dac477 || !componentCallbacksC1101xa17d4670.m7488xbe8d7484()) ? false : true;
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.q1
    public boolean a(java.util.ArrayList arrayList, java.util.ArrayList arrayList2) {
        if (p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d.m7619x11f226ac(2)) {
            m7738x9616526c();
        }
        arrayList.add(this);
        arrayList2.add(java.lang.Boolean.FALSE);
        if (!this.f92883g) {
            return true;
        }
        this.f92782r.m7621x86b5aa31(this);
        return true;
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.i2
    public int d() {
        return p(false);
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.i2
    public int e() {
        return p(true);
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.i2
    public void f() {
        if (this.f92883g) {
            throw new java.lang.IllegalStateException("This transaction is already being added to the back stack");
        }
        this.f92884h = false;
        this.f92782r.m7661xcc7853cf(this, false);
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.i2
    public void g() {
        if (this.f92883g) {
            throw new java.lang.IllegalStateException("This transaction is already being added to the back stack");
        }
        this.f92884h = false;
        this.f92782r.m7661xcc7853cf(this, true);
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.i2
    public void h(int i17, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670, java.lang.String str, int i18) {
        java.lang.Class<?> cls = componentCallbacksC1101xa17d4670.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !java.lang.reflect.Modifier.isPublic(modifiers) || (cls.isMemberClass() && !java.lang.reflect.Modifier.isStatic(modifiers))) {
            throw new java.lang.IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            java.lang.String str2 = componentCallbacksC1101xa17d4670.f3457x32d3ed;
            if (str2 != null && !str.equals(str2)) {
                throw new java.lang.IllegalStateException("Can't change tag of fragment " + componentCallbacksC1101xa17d4670 + ": was " + componentCallbacksC1101xa17d4670.f3457x32d3ed + " now " + str);
            }
            componentCallbacksC1101xa17d4670.f3457x32d3ed = str;
        }
        if (i17 != 0) {
            if (i17 == -1) {
                throw new java.lang.IllegalArgumentException("Can't add fragment " + componentCallbacksC1101xa17d4670 + " with tag " + str + " to container view with no id");
            }
            int i19 = componentCallbacksC1101xa17d4670.f3426x9ca58fd8;
            if (i19 != 0 && i19 != i17) {
                throw new java.lang.IllegalStateException("Can't change container ID of fragment " + componentCallbacksC1101xa17d4670 + ": was " + componentCallbacksC1101xa17d4670.f3426x9ca58fd8 + " now " + i17);
            }
            componentCallbacksC1101xa17d4670.f3426x9ca58fd8 = i17;
            componentCallbacksC1101xa17d4670.f3421xb66d4acf = i17;
        }
        b(new p012xc85e97e9.p087x9da2e250.app.h2(i18, componentCallbacksC1101xa17d4670));
        componentCallbacksC1101xa17d4670.f3427xccc8bb10 = this.f92782r;
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.i2
    public p012xc85e97e9.p087x9da2e250.app.i2 i(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670) {
        p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d abstractC1104xc1ad431d = componentCallbacksC1101xa17d4670.f3427xccc8bb10;
        if (abstractC1104xc1ad431d == null || abstractC1104xc1ad431d == this.f92782r) {
            b(new p012xc85e97e9.p087x9da2e250.app.h2(4, componentCallbacksC1101xa17d4670));
            return this;
        }
        throw new java.lang.IllegalStateException("Cannot hide Fragment attached to a different FragmentManager. Fragment " + componentCallbacksC1101xa17d4670.mo7591x9616526c() + " is already attached to a FragmentManager.");
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.i2
    public p012xc85e97e9.p087x9da2e250.app.i2 j(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670) {
        p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d abstractC1104xc1ad431d = componentCallbacksC1101xa17d4670.f3427xccc8bb10;
        if (abstractC1104xc1ad431d == null || abstractC1104xc1ad431d == this.f92782r) {
            b(new p012xc85e97e9.p087x9da2e250.app.h2(3, componentCallbacksC1101xa17d4670));
            return this;
        }
        throw new java.lang.IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + componentCallbacksC1101xa17d4670.mo7591x9616526c() + " is already attached to a FragmentManager.");
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.i2
    public p012xc85e97e9.p087x9da2e250.app.i2 m(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670, p012xc85e97e9.p093xedfae76a.n nVar) {
        p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d abstractC1104xc1ad431d = componentCallbacksC1101xa17d4670.f3427xccc8bb10;
        p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d abstractC1104xc1ad431d2 = this.f92782r;
        if (abstractC1104xc1ad431d != abstractC1104xc1ad431d2) {
            throw new java.lang.IllegalArgumentException("Cannot setMaxLifecycle for Fragment not attached to FragmentManager " + abstractC1104xc1ad431d2);
        }
        if (nVar == p012xc85e97e9.p093xedfae76a.n.INITIALIZED && componentCallbacksC1101xa17d4670.f3456xbec81024 > -1) {
            throw new java.lang.IllegalArgumentException("Cannot set maximum Lifecycle to " + nVar + " after the Fragment has been created");
        }
        if (nVar != p012xc85e97e9.p093xedfae76a.n.DESTROYED) {
            b(new p012xc85e97e9.p087x9da2e250.app.h2(10, componentCallbacksC1101xa17d4670, nVar));
            return this;
        }
        throw new java.lang.IllegalArgumentException("Cannot set maximum Lifecycle to " + nVar + ". Use remove() to remove the fragment from the FragmentManager and trigger its destruction.");
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.i2
    public p012xc85e97e9.p087x9da2e250.app.i2 n(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670) {
        p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d abstractC1104xc1ad431d = componentCallbacksC1101xa17d4670.f3427xccc8bb10;
        if (abstractC1104xc1ad431d == null || abstractC1104xc1ad431d == this.f92782r) {
            b(new p012xc85e97e9.p087x9da2e250.app.h2(5, componentCallbacksC1101xa17d4670));
            return this;
        }
        throw new java.lang.IllegalStateException("Cannot show Fragment attached to a different FragmentManager. Fragment " + componentCallbacksC1101xa17d4670.mo7591x9616526c() + " is already attached to a FragmentManager.");
    }

    public void o(int i17) {
        if (this.f92883g) {
            if (p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d.m7619x11f226ac(2)) {
                m7738x9616526c();
            }
            java.util.ArrayList arrayList = this.f92877a;
            int size = arrayList.size();
            for (int i18 = 0; i18 < size; i18++) {
                p012xc85e97e9.p087x9da2e250.app.h2 h2Var = (p012xc85e97e9.p087x9da2e250.app.h2) arrayList.get(i18);
                p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670 = h2Var.f92862b;
                if (componentCallbacksC1101xa17d4670 != null) {
                    componentCallbacksC1101xa17d4670.f3417xae473bf6 += i17;
                    if (p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d.m7619x11f226ac(2)) {
                        java.util.Objects.toString(h2Var.f92862b);
                        int i19 = h2Var.f92862b.f3417xae473bf6;
                    }
                }
            }
        }
    }

    public int p(boolean z17) {
        if (this.f92783s) {
            throw new java.lang.IllegalStateException("commit already called");
        }
        if (p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d.m7619x11f226ac(2)) {
            m7738x9616526c();
            java.io.PrintWriter printWriter = new java.io.PrintWriter(new p012xc85e97e9.p087x9da2e250.app.f3("FragmentManager"));
            q("  ", printWriter, true);
            printWriter.close();
        }
        this.f92783s = true;
        boolean z18 = this.f92883g;
        p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d abstractC1104xc1ad431d = this.f92782r;
        if (z18) {
            this.f92784t = abstractC1104xc1ad431d.m7627x2ff62606();
        } else {
            this.f92784t = -1;
        }
        abstractC1104xc1ad431d.m7659x12dd525e(this, z17);
        return this.f92784t;
    }

    public void q(java.lang.String str, java.io.PrintWriter printWriter, boolean z17) {
        java.lang.String str2;
        if (z17) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f92885i);
            printWriter.print(" mIndex=");
            printWriter.print(this.f92784t);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f92783s);
            if (this.f92882f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(java.lang.Integer.toHexString(this.f92882f));
            }
            if (this.f92878b != 0 || this.f92879c != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(java.lang.Integer.toHexString(this.f92878b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(java.lang.Integer.toHexString(this.f92879c));
            }
            if (this.f92880d != 0 || this.f92881e != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(java.lang.Integer.toHexString(this.f92880d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(java.lang.Integer.toHexString(this.f92881e));
            }
            if (this.f92886j != 0 || this.f92887k != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(java.lang.Integer.toHexString(this.f92886j));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f92887k);
            }
            if (this.f92888l != 0 || this.f92889m != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(java.lang.Integer.toHexString(this.f92888l));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f92889m);
            }
        }
        java.util.ArrayList arrayList = this.f92877a;
        if (arrayList.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = arrayList.size();
        for (int i17 = 0; i17 < size; i17++) {
            p012xc85e97e9.p087x9da2e250.app.h2 h2Var = (p012xc85e97e9.p087x9da2e250.app.h2) arrayList.get(i17);
            switch (h2Var.f92861a) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + h2Var.f92861a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i17);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(h2Var.f92862b);
            if (z17) {
                if (h2Var.f92863c != 0 || h2Var.f92864d != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(java.lang.Integer.toHexString(h2Var.f92863c));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(java.lang.Integer.toHexString(h2Var.f92864d));
                }
                if (h2Var.f92865e != 0 || h2Var.f92866f != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(java.lang.Integer.toHexString(h2Var.f92865e));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(java.lang.Integer.toHexString(h2Var.f92866f));
                }
            }
        }
    }

    public void r() {
        java.util.ArrayList arrayList = this.f92877a;
        int size = arrayList.size();
        int i17 = 0;
        while (true) {
            p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d abstractC1104xc1ad431d = this.f92782r;
            if (i17 >= size) {
                if (this.f92892p || p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d.f3476xa4a928e7) {
                    return;
                }
                abstractC1104xc1ad431d.m7695xc25739c5(abstractC1104xc1ad431d.f3483x459b61be, true);
                return;
            }
            p012xc85e97e9.p087x9da2e250.app.h2 h2Var = (p012xc85e97e9.p087x9da2e250.app.h2) arrayList.get(i17);
            p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670 = h2Var.f92862b;
            if (componentCallbacksC1101xa17d4670 != null) {
                componentCallbacksC1101xa17d4670.m7574xa2510db0(false);
                componentCallbacksC1101xa17d4670.m7560x2f1d5b71(h2Var.f92863c, h2Var.f92864d, h2Var.f92865e, h2Var.f92866f);
                componentCallbacksC1101xa17d4670.m7572x8035aa(this.f92882f);
                componentCallbacksC1101xa17d4670.m7580x67653ab3(this.f92890n, this.f92891o);
            }
            switch (h2Var.f92861a) {
                case 1:
                    abstractC1104xc1ad431d.m7722xb1192aea(componentCallbacksC1101xa17d4670, false);
                    abstractC1104xc1ad431d.m7623x63908e11(componentCallbacksC1101xa17d4670);
                    break;
                case 2:
                default:
                    throw new java.lang.IllegalArgumentException("Unknown cmd: " + h2Var.f92861a);
                case 3:
                    abstractC1104xc1ad431d.m7712x3e997af4(componentCallbacksC1101xa17d4670);
                    break;
                case 4:
                    abstractC1104xc1ad431d.m7684xbf25c1b2(componentCallbacksC1101xa17d4670);
                    break;
                case 5:
                    abstractC1104xc1ad431d.m7722xb1192aea(componentCallbacksC1101xa17d4670, false);
                    abstractC1104xc1ad431d.m7729x6adad46d(componentCallbacksC1101xa17d4670);
                    break;
                case 6:
                    abstractC1104xc1ad431d.m7636x912c1b03(componentCallbacksC1101xa17d4670);
                    break;
                case 7:
                    abstractC1104xc1ad431d.m7722xb1192aea(componentCallbacksC1101xa17d4670, false);
                    abstractC1104xc1ad431d.m7629xe5401fb5(componentCallbacksC1101xa17d4670);
                    break;
                case 8:
                    abstractC1104xc1ad431d.m7727x59f1ffe4(componentCallbacksC1101xa17d4670);
                    break;
                case 9:
                    abstractC1104xc1ad431d.m7727x59f1ffe4(null);
                    break;
                case 10:
                    abstractC1104xc1ad431d.m7726x3060bfe8(componentCallbacksC1101xa17d4670, h2Var.f92868h);
                    break;
            }
            if (!this.f92892p && h2Var.f92861a != 1 && componentCallbacksC1101xa17d4670 != null && !p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d.f3476xa4a928e7) {
                abstractC1104xc1ad431d.m7694x82878e7d(componentCallbacksC1101xa17d4670);
            }
            i17++;
        }
    }

    public void s(boolean z17) {
        java.util.ArrayList arrayList = this.f92877a;
        int size = arrayList.size() - 1;
        while (true) {
            p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d abstractC1104xc1ad431d = this.f92782r;
            if (size < 0) {
                if (this.f92892p || !z17 || p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d.f3476xa4a928e7) {
                    return;
                }
                abstractC1104xc1ad431d.m7695xc25739c5(abstractC1104xc1ad431d.f3483x459b61be, true);
                return;
            }
            p012xc85e97e9.p087x9da2e250.app.h2 h2Var = (p012xc85e97e9.p087x9da2e250.app.h2) arrayList.get(size);
            p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670 = h2Var.f92862b;
            if (componentCallbacksC1101xa17d4670 != null) {
                componentCallbacksC1101xa17d4670.m7574xa2510db0(true);
                componentCallbacksC1101xa17d4670.m7560x2f1d5b71(h2Var.f92863c, h2Var.f92864d, h2Var.f92865e, h2Var.f92866f);
                componentCallbacksC1101xa17d4670.m7572x8035aa(p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d.m7620x7b799891(this.f92882f));
                componentCallbacksC1101xa17d4670.m7580x67653ab3(this.f92891o, this.f92890n);
            }
            switch (h2Var.f92861a) {
                case 1:
                    abstractC1104xc1ad431d.m7722xb1192aea(componentCallbacksC1101xa17d4670, true);
                    abstractC1104xc1ad431d.m7712x3e997af4(componentCallbacksC1101xa17d4670);
                    break;
                case 2:
                default:
                    throw new java.lang.IllegalArgumentException("Unknown cmd: " + h2Var.f92861a);
                case 3:
                    abstractC1104xc1ad431d.m7623x63908e11(componentCallbacksC1101xa17d4670);
                    break;
                case 4:
                    abstractC1104xc1ad431d.m7729x6adad46d(componentCallbacksC1101xa17d4670);
                    break;
                case 5:
                    abstractC1104xc1ad431d.m7722xb1192aea(componentCallbacksC1101xa17d4670, true);
                    abstractC1104xc1ad431d.m7684xbf25c1b2(componentCallbacksC1101xa17d4670);
                    break;
                case 6:
                    abstractC1104xc1ad431d.m7629xe5401fb5(componentCallbacksC1101xa17d4670);
                    break;
                case 7:
                    abstractC1104xc1ad431d.m7722xb1192aea(componentCallbacksC1101xa17d4670, true);
                    abstractC1104xc1ad431d.m7636x912c1b03(componentCallbacksC1101xa17d4670);
                    break;
                case 8:
                    abstractC1104xc1ad431d.m7727x59f1ffe4(null);
                    break;
                case 9:
                    abstractC1104xc1ad431d.m7727x59f1ffe4(componentCallbacksC1101xa17d4670);
                    break;
                case 10:
                    abstractC1104xc1ad431d.m7726x3060bfe8(componentCallbacksC1101xa17d4670, h2Var.f92867g);
                    break;
            }
            if (!this.f92892p && h2Var.f92861a != 3 && componentCallbacksC1101xa17d4670 != null && !p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d.f3476xa4a928e7) {
                abstractC1104xc1ad431d.m7694x82878e7d(componentCallbacksC1101xa17d4670);
            }
            size--;
        }
    }

    public boolean t(int i17) {
        java.util.ArrayList arrayList = this.f92877a;
        int size = arrayList.size();
        for (int i18 = 0; i18 < size; i18++) {
            p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670 = ((p012xc85e97e9.p087x9da2e250.app.h2) arrayList.get(i18)).f92862b;
            int i19 = componentCallbacksC1101xa17d4670 != null ? componentCallbacksC1101xa17d4670.f3421xb66d4acf : 0;
            if (i19 != 0 && i19 == i17) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: toString */
    public java.lang.String m7738x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(128);
        sb6.append("BackStackEntry{");
        sb6.append(java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)));
        if (this.f92784t >= 0) {
            sb6.append(" #");
            sb6.append(this.f92784t);
        }
        if (this.f92885i != null) {
            sb6.append(" ");
            sb6.append(this.f92885i);
        }
        sb6.append("}");
        return sb6.toString();
    }

    public boolean u(java.util.ArrayList arrayList, int i17, int i18) {
        if (i18 == i17) {
            return false;
        }
        java.util.ArrayList arrayList2 = this.f92877a;
        int size = arrayList2.size();
        int i19 = -1;
        for (int i27 = 0; i27 < size; i27++) {
            p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670 = ((p012xc85e97e9.p087x9da2e250.app.h2) arrayList2.get(i27)).f92862b;
            int i28 = componentCallbacksC1101xa17d4670 != null ? componentCallbacksC1101xa17d4670.f3421xb66d4acf : 0;
            if (i28 != 0 && i28 != i19) {
                for (int i29 = i17; i29 < i18; i29++) {
                    p012xc85e97e9.p087x9da2e250.app.a aVar = (p012xc85e97e9.p087x9da2e250.app.a) arrayList.get(i29);
                    int size2 = aVar.f92877a.size();
                    for (int i37 = 0; i37 < size2; i37++) {
                        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d46702 = ((p012xc85e97e9.p087x9da2e250.app.h2) aVar.f92877a.get(i37)).f92862b;
                        if ((componentCallbacksC1101xa17d46702 != null ? componentCallbacksC1101xa17d46702.f3421xb66d4acf : 0) == i28) {
                            return true;
                        }
                    }
                }
                i19 = i28;
            }
        }
        return false;
    }
}
