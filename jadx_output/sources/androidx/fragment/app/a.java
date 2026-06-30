package androidx.fragment.app;

/* loaded from: classes14.dex */
public final class a extends androidx.fragment.app.i2 implements androidx.fragment.app.k1, androidx.fragment.app.q1 {

    /* renamed from: r, reason: collision with root package name */
    public final androidx.fragment.app.FragmentManager f11249r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f11250s;

    /* renamed from: t, reason: collision with root package name */
    public int f11251t;

    public a(androidx.fragment.app.FragmentManager fragmentManager) {
        super(fragmentManager.getFragmentFactory(), fragmentManager.getHost() != null ? fragmentManager.getHost().f11494e.getClassLoader() : null);
        this.f11251t = -1;
        this.f11249r = fragmentManager;
    }

    public static boolean v(androidx.fragment.app.h2 h2Var) {
        androidx.fragment.app.Fragment fragment = h2Var.f11329b;
        return (fragment == null || !fragment.mAdded || fragment.mView == null || fragment.mDetached || fragment.mHidden || !fragment.isPostponed()) ? false : true;
    }

    @Override // androidx.fragment.app.q1
    public boolean a(java.util.ArrayList arrayList, java.util.ArrayList arrayList2) {
        if (androidx.fragment.app.FragmentManager.isLoggingEnabled(2)) {
            toString();
        }
        arrayList.add(this);
        arrayList2.add(java.lang.Boolean.FALSE);
        if (!this.f11350g) {
            return true;
        }
        this.f11249r.addBackStackState(this);
        return true;
    }

    @Override // androidx.fragment.app.i2
    public int d() {
        return p(false);
    }

    @Override // androidx.fragment.app.i2
    public int e() {
        return p(true);
    }

    @Override // androidx.fragment.app.i2
    public void f() {
        if (this.f11350g) {
            throw new java.lang.IllegalStateException("This transaction is already being added to the back stack");
        }
        this.f11351h = false;
        this.f11249r.execSingleAction(this, false);
    }

    @Override // androidx.fragment.app.i2
    public void g() {
        if (this.f11350g) {
            throw new java.lang.IllegalStateException("This transaction is already being added to the back stack");
        }
        this.f11351h = false;
        this.f11249r.execSingleAction(this, true);
    }

    @Override // androidx.fragment.app.i2
    public void h(int i17, androidx.fragment.app.Fragment fragment, java.lang.String str, int i18) {
        java.lang.Class<?> cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !java.lang.reflect.Modifier.isPublic(modifiers) || (cls.isMemberClass() && !java.lang.reflect.Modifier.isStatic(modifiers))) {
            throw new java.lang.IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            java.lang.String str2 = fragment.mTag;
            if (str2 != null && !str.equals(str2)) {
                throw new java.lang.IllegalStateException("Can't change tag of fragment " + fragment + ": was " + fragment.mTag + " now " + str);
            }
            fragment.mTag = str;
        }
        if (i17 != 0) {
            if (i17 == -1) {
                throw new java.lang.IllegalArgumentException("Can't add fragment " + fragment + " with tag " + str + " to container view with no id");
            }
            int i19 = fragment.mFragmentId;
            if (i19 != 0 && i19 != i17) {
                throw new java.lang.IllegalStateException("Can't change container ID of fragment " + fragment + ": was " + fragment.mFragmentId + " now " + i17);
            }
            fragment.mFragmentId = i17;
            fragment.mContainerId = i17;
        }
        b(new androidx.fragment.app.h2(i18, fragment));
        fragment.mFragmentManager = this.f11249r;
    }

    @Override // androidx.fragment.app.i2
    public androidx.fragment.app.i2 i(androidx.fragment.app.Fragment fragment) {
        androidx.fragment.app.FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager == null || fragmentManager == this.f11249r) {
            b(new androidx.fragment.app.h2(4, fragment));
            return this;
        }
        throw new java.lang.IllegalStateException("Cannot hide Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    @Override // androidx.fragment.app.i2
    public androidx.fragment.app.i2 j(androidx.fragment.app.Fragment fragment) {
        androidx.fragment.app.FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager == null || fragmentManager == this.f11249r) {
            b(new androidx.fragment.app.h2(3, fragment));
            return this;
        }
        throw new java.lang.IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    @Override // androidx.fragment.app.i2
    public androidx.fragment.app.i2 m(androidx.fragment.app.Fragment fragment, androidx.lifecycle.n nVar) {
        androidx.fragment.app.FragmentManager fragmentManager = fragment.mFragmentManager;
        androidx.fragment.app.FragmentManager fragmentManager2 = this.f11249r;
        if (fragmentManager != fragmentManager2) {
            throw new java.lang.IllegalArgumentException("Cannot setMaxLifecycle for Fragment not attached to FragmentManager " + fragmentManager2);
        }
        if (nVar == androidx.lifecycle.n.INITIALIZED && fragment.mState > -1) {
            throw new java.lang.IllegalArgumentException("Cannot set maximum Lifecycle to " + nVar + " after the Fragment has been created");
        }
        if (nVar != androidx.lifecycle.n.DESTROYED) {
            b(new androidx.fragment.app.h2(10, fragment, nVar));
            return this;
        }
        throw new java.lang.IllegalArgumentException("Cannot set maximum Lifecycle to " + nVar + ". Use remove() to remove the fragment from the FragmentManager and trigger its destruction.");
    }

    @Override // androidx.fragment.app.i2
    public androidx.fragment.app.i2 n(androidx.fragment.app.Fragment fragment) {
        androidx.fragment.app.FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager == null || fragmentManager == this.f11249r) {
            b(new androidx.fragment.app.h2(5, fragment));
            return this;
        }
        throw new java.lang.IllegalStateException("Cannot show Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    public void o(int i17) {
        if (this.f11350g) {
            if (androidx.fragment.app.FragmentManager.isLoggingEnabled(2)) {
                toString();
            }
            java.util.ArrayList arrayList = this.f11344a;
            int size = arrayList.size();
            for (int i18 = 0; i18 < size; i18++) {
                androidx.fragment.app.h2 h2Var = (androidx.fragment.app.h2) arrayList.get(i18);
                androidx.fragment.app.Fragment fragment = h2Var.f11329b;
                if (fragment != null) {
                    fragment.mBackStackNesting += i17;
                    if (androidx.fragment.app.FragmentManager.isLoggingEnabled(2)) {
                        java.util.Objects.toString(h2Var.f11329b);
                        int i19 = h2Var.f11329b.mBackStackNesting;
                    }
                }
            }
        }
    }

    public int p(boolean z17) {
        if (this.f11250s) {
            throw new java.lang.IllegalStateException("commit already called");
        }
        if (androidx.fragment.app.FragmentManager.isLoggingEnabled(2)) {
            toString();
            java.io.PrintWriter printWriter = new java.io.PrintWriter(new androidx.fragment.app.f3("FragmentManager"));
            q("  ", printWriter, true);
            printWriter.close();
        }
        this.f11250s = true;
        boolean z18 = this.f11350g;
        androidx.fragment.app.FragmentManager fragmentManager = this.f11249r;
        if (z18) {
            this.f11251t = fragmentManager.allocBackStackIndex();
        } else {
            this.f11251t = -1;
        }
        fragmentManager.enqueueAction(this, z17);
        return this.f11251t;
    }

    public void q(java.lang.String str, java.io.PrintWriter printWriter, boolean z17) {
        java.lang.String str2;
        if (z17) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f11352i);
            printWriter.print(" mIndex=");
            printWriter.print(this.f11251t);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f11250s);
            if (this.f11349f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(java.lang.Integer.toHexString(this.f11349f));
            }
            if (this.f11345b != 0 || this.f11346c != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(java.lang.Integer.toHexString(this.f11345b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(java.lang.Integer.toHexString(this.f11346c));
            }
            if (this.f11347d != 0 || this.f11348e != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(java.lang.Integer.toHexString(this.f11347d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(java.lang.Integer.toHexString(this.f11348e));
            }
            if (this.f11353j != 0 || this.f11354k != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(java.lang.Integer.toHexString(this.f11353j));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f11354k);
            }
            if (this.f11355l != 0 || this.f11356m != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(java.lang.Integer.toHexString(this.f11355l));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f11356m);
            }
        }
        java.util.ArrayList arrayList = this.f11344a;
        if (arrayList.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = arrayList.size();
        for (int i17 = 0; i17 < size; i17++) {
            androidx.fragment.app.h2 h2Var = (androidx.fragment.app.h2) arrayList.get(i17);
            switch (h2Var.f11328a) {
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
                    str2 = "cmd=" + h2Var.f11328a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i17);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(h2Var.f11329b);
            if (z17) {
                if (h2Var.f11330c != 0 || h2Var.f11331d != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(java.lang.Integer.toHexString(h2Var.f11330c));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(java.lang.Integer.toHexString(h2Var.f11331d));
                }
                if (h2Var.f11332e != 0 || h2Var.f11333f != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(java.lang.Integer.toHexString(h2Var.f11332e));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(java.lang.Integer.toHexString(h2Var.f11333f));
                }
            }
        }
    }

    public void r() {
        java.util.ArrayList arrayList = this.f11344a;
        int size = arrayList.size();
        int i17 = 0;
        while (true) {
            androidx.fragment.app.FragmentManager fragmentManager = this.f11249r;
            if (i17 >= size) {
                if (this.f11359p || androidx.fragment.app.FragmentManager.USE_STATE_MANAGER) {
                    return;
                }
                fragmentManager.moveToState(fragmentManager.mCurState, true);
                return;
            }
            androidx.fragment.app.h2 h2Var = (androidx.fragment.app.h2) arrayList.get(i17);
            androidx.fragment.app.Fragment fragment = h2Var.f11329b;
            if (fragment != null) {
                fragment.setPopDirection(false);
                fragment.setAnimations(h2Var.f11330c, h2Var.f11331d, h2Var.f11332e, h2Var.f11333f);
                fragment.setNextTransition(this.f11349f);
                fragment.setSharedElementNames(this.f11357n, this.f11358o);
            }
            switch (h2Var.f11328a) {
                case 1:
                    fragmentManager.setExitAnimationOrder(fragment, false);
                    fragmentManager.addFragment(fragment);
                    break;
                case 2:
                default:
                    throw new java.lang.IllegalArgumentException("Unknown cmd: " + h2Var.f11328a);
                case 3:
                    fragmentManager.removeFragment(fragment);
                    break;
                case 4:
                    fragmentManager.hideFragment(fragment);
                    break;
                case 5:
                    fragmentManager.setExitAnimationOrder(fragment, false);
                    fragmentManager.showFragment(fragment);
                    break;
                case 6:
                    fragmentManager.detachFragment(fragment);
                    break;
                case 7:
                    fragmentManager.setExitAnimationOrder(fragment, false);
                    fragmentManager.attachFragment(fragment);
                    break;
                case 8:
                    fragmentManager.setPrimaryNavigationFragment(fragment);
                    break;
                case 9:
                    fragmentManager.setPrimaryNavigationFragment(null);
                    break;
                case 10:
                    fragmentManager.setMaxLifecycle(fragment, h2Var.f11335h);
                    break;
            }
            if (!this.f11359p && h2Var.f11328a != 1 && fragment != null && !androidx.fragment.app.FragmentManager.USE_STATE_MANAGER) {
                fragmentManager.moveFragmentToExpectedState(fragment);
            }
            i17++;
        }
    }

    public void s(boolean z17) {
        java.util.ArrayList arrayList = this.f11344a;
        int size = arrayList.size() - 1;
        while (true) {
            androidx.fragment.app.FragmentManager fragmentManager = this.f11249r;
            if (size < 0) {
                if (this.f11359p || !z17 || androidx.fragment.app.FragmentManager.USE_STATE_MANAGER) {
                    return;
                }
                fragmentManager.moveToState(fragmentManager.mCurState, true);
                return;
            }
            androidx.fragment.app.h2 h2Var = (androidx.fragment.app.h2) arrayList.get(size);
            androidx.fragment.app.Fragment fragment = h2Var.f11329b;
            if (fragment != null) {
                fragment.setPopDirection(true);
                fragment.setAnimations(h2Var.f11330c, h2Var.f11331d, h2Var.f11332e, h2Var.f11333f);
                fragment.setNextTransition(androidx.fragment.app.FragmentManager.reverseTransit(this.f11349f));
                fragment.setSharedElementNames(this.f11358o, this.f11357n);
            }
            switch (h2Var.f11328a) {
                case 1:
                    fragmentManager.setExitAnimationOrder(fragment, true);
                    fragmentManager.removeFragment(fragment);
                    break;
                case 2:
                default:
                    throw new java.lang.IllegalArgumentException("Unknown cmd: " + h2Var.f11328a);
                case 3:
                    fragmentManager.addFragment(fragment);
                    break;
                case 4:
                    fragmentManager.showFragment(fragment);
                    break;
                case 5:
                    fragmentManager.setExitAnimationOrder(fragment, true);
                    fragmentManager.hideFragment(fragment);
                    break;
                case 6:
                    fragmentManager.attachFragment(fragment);
                    break;
                case 7:
                    fragmentManager.setExitAnimationOrder(fragment, true);
                    fragmentManager.detachFragment(fragment);
                    break;
                case 8:
                    fragmentManager.setPrimaryNavigationFragment(null);
                    break;
                case 9:
                    fragmentManager.setPrimaryNavigationFragment(fragment);
                    break;
                case 10:
                    fragmentManager.setMaxLifecycle(fragment, h2Var.f11334g);
                    break;
            }
            if (!this.f11359p && h2Var.f11328a != 3 && fragment != null && !androidx.fragment.app.FragmentManager.USE_STATE_MANAGER) {
                fragmentManager.moveFragmentToExpectedState(fragment);
            }
            size--;
        }
    }

    public boolean t(int i17) {
        java.util.ArrayList arrayList = this.f11344a;
        int size = arrayList.size();
        for (int i18 = 0; i18 < size; i18++) {
            androidx.fragment.app.Fragment fragment = ((androidx.fragment.app.h2) arrayList.get(i18)).f11329b;
            int i19 = fragment != null ? fragment.mContainerId : 0;
            if (i19 != 0 && i19 == i17) {
                return true;
            }
        }
        return false;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(128);
        sb6.append("BackStackEntry{");
        sb6.append(java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)));
        if (this.f11251t >= 0) {
            sb6.append(" #");
            sb6.append(this.f11251t);
        }
        if (this.f11352i != null) {
            sb6.append(" ");
            sb6.append(this.f11352i);
        }
        sb6.append("}");
        return sb6.toString();
    }

    public boolean u(java.util.ArrayList arrayList, int i17, int i18) {
        if (i18 == i17) {
            return false;
        }
        java.util.ArrayList arrayList2 = this.f11344a;
        int size = arrayList2.size();
        int i19 = -1;
        for (int i27 = 0; i27 < size; i27++) {
            androidx.fragment.app.Fragment fragment = ((androidx.fragment.app.h2) arrayList2.get(i27)).f11329b;
            int i28 = fragment != null ? fragment.mContainerId : 0;
            if (i28 != 0 && i28 != i19) {
                for (int i29 = i17; i29 < i18; i29++) {
                    androidx.fragment.app.a aVar = (androidx.fragment.app.a) arrayList.get(i29);
                    int size2 = aVar.f11344a.size();
                    for (int i37 = 0; i37 < size2; i37++) {
                        androidx.fragment.app.Fragment fragment2 = ((androidx.fragment.app.h2) aVar.f11344a.get(i37)).f11329b;
                        if ((fragment2 != null ? fragment2.mContainerId : 0) == i28) {
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
