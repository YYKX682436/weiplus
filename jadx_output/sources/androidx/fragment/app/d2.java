package androidx.fragment.app;

/* loaded from: classes14.dex */
public class d2 {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.fragment.app.z0 f11302a;

    /* renamed from: b, reason: collision with root package name */
    public final androidx.fragment.app.f2 f11303b;

    /* renamed from: c, reason: collision with root package name */
    public final androidx.fragment.app.Fragment f11304c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f11305d = false;

    /* renamed from: e, reason: collision with root package name */
    public int f11306e = -1;

    public d2(androidx.fragment.app.z0 z0Var, androidx.fragment.app.f2 f2Var, androidx.fragment.app.Fragment fragment) {
        this.f11302a = z0Var;
        this.f11303b = f2Var;
        this.f11304c = fragment;
    }

    public void a() {
        android.view.View view;
        android.view.View view2;
        androidx.fragment.app.f2 f2Var = this.f11303b;
        f2Var.getClass();
        androidx.fragment.app.Fragment fragment = this.f11304c;
        android.view.ViewGroup viewGroup = fragment.mContainer;
        int i17 = -1;
        if (viewGroup != null) {
            java.util.ArrayList arrayList = f2Var.f11312a;
            int indexOf = arrayList.indexOf(fragment);
            int i18 = indexOf - 1;
            while (true) {
                if (i18 < 0) {
                    while (true) {
                        indexOf++;
                        if (indexOf >= arrayList.size()) {
                            break;
                        }
                        androidx.fragment.app.Fragment fragment2 = (androidx.fragment.app.Fragment) arrayList.get(indexOf);
                        if (fragment2.mContainer == viewGroup && (view = fragment2.mView) != null) {
                            i17 = viewGroup.indexOfChild(view);
                            break;
                        }
                    }
                } else {
                    androidx.fragment.app.Fragment fragment3 = (androidx.fragment.app.Fragment) arrayList.get(i18);
                    if (fragment3.mContainer == viewGroup && (view2 = fragment3.mView) != null) {
                        i17 = viewGroup.indexOfChild(view2) + 1;
                        break;
                    }
                    i18--;
                }
            }
        }
        fragment.mContainer.addView(fragment.mView, i17);
    }

    public void b() {
        boolean isLoggingEnabled = androidx.fragment.app.FragmentManager.isLoggingEnabled(3);
        androidx.fragment.app.Fragment fragment = this.f11304c;
        if (isLoggingEnabled) {
            java.util.Objects.toString(fragment);
        }
        androidx.fragment.app.Fragment fragment2 = fragment.mTarget;
        androidx.fragment.app.d2 d2Var = null;
        androidx.fragment.app.f2 f2Var = this.f11303b;
        if (fragment2 != null) {
            androidx.fragment.app.d2 d2Var2 = (androidx.fragment.app.d2) f2Var.f11313b.get(fragment2.mWho);
            if (d2Var2 == null) {
                throw new java.lang.IllegalStateException("Fragment " + fragment + " declared target fragment " + fragment.mTarget + " that does not belong to this FragmentManager!");
            }
            fragment.mTargetWho = fragment.mTarget.mWho;
            fragment.mTarget = null;
            d2Var = d2Var2;
        } else {
            java.lang.String str = fragment.mTargetWho;
            if (str != null && (d2Var = (androidx.fragment.app.d2) f2Var.f11313b.get(str)) == null) {
                throw new java.lang.IllegalStateException("Fragment " + fragment + " declared target fragment " + fragment.mTargetWho + " that does not belong to this FragmentManager!");
            }
        }
        if (d2Var != null && (androidx.fragment.app.FragmentManager.USE_STATE_MANAGER || d2Var.f11304c.mState < 1)) {
            d2Var.j();
        }
        fragment.mHost = fragment.mFragmentManager.getHost();
        fragment.mParentFragment = fragment.mFragmentManager.getParent();
        androidx.fragment.app.z0 z0Var = this.f11302a;
        z0Var.g(fragment, false);
        fragment.performAttach();
        z0Var.b(fragment, false);
    }

    public int c() {
        android.view.ViewGroup viewGroup;
        androidx.fragment.app.m3 m3Var;
        androidx.fragment.app.k3 k3Var;
        androidx.fragment.app.Fragment fragment = this.f11304c;
        if (fragment.mFragmentManager == null) {
            return fragment.mState;
        }
        int i17 = this.f11306e;
        int i18 = androidx.fragment.app.c2.f11270a[fragment.mMaxState.ordinal()];
        if (i18 != 1) {
            i17 = i18 != 2 ? i18 != 3 ? i18 != 4 ? java.lang.Math.min(i17, -1) : java.lang.Math.min(i17, 0) : java.lang.Math.min(i17, 1) : java.lang.Math.min(i17, 5);
        }
        if (fragment.mFromLayout) {
            if (fragment.mInLayout) {
                i17 = java.lang.Math.max(this.f11306e, 2);
                android.view.View view = fragment.mView;
                if (view != null && view.getParent() == null) {
                    i17 = java.lang.Math.min(i17, 2);
                }
            } else {
                i17 = this.f11306e < 4 ? java.lang.Math.min(i17, fragment.mState) : java.lang.Math.min(i17, 1);
            }
        }
        if (!fragment.mAdded) {
            i17 = java.lang.Math.min(i17, 1);
        }
        androidx.fragment.app.k3 k3Var2 = null;
        if (androidx.fragment.app.FragmentManager.USE_STATE_MANAGER && (viewGroup = fragment.mContainer) != null) {
            androidx.fragment.app.n3 f17 = androidx.fragment.app.n3.f(viewGroup, fragment.getParentFragmentManager());
            f17.getClass();
            androidx.fragment.app.m3 d17 = f17.d(fragment);
            if (d17 != null) {
                k3Var = d17.f11401b;
            } else {
                java.util.Iterator it = f17.f11422c.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        m3Var = null;
                        break;
                    }
                    m3Var = (androidx.fragment.app.m3) it.next();
                    if (m3Var.f11402c.equals(fragment) && !m3Var.f11405f) {
                        break;
                    }
                }
                if (m3Var != null) {
                    k3Var = m3Var.f11401b;
                }
            }
            k3Var2 = k3Var;
        }
        if (k3Var2 == androidx.fragment.app.k3.ADDING) {
            i17 = java.lang.Math.min(i17, 6);
        } else if (k3Var2 == androidx.fragment.app.k3.REMOVING) {
            i17 = java.lang.Math.max(i17, 3);
        } else if (fragment.mRemoving) {
            i17 = fragment.isInBackStack() ? java.lang.Math.min(i17, 1) : java.lang.Math.min(i17, -1);
        }
        if (fragment.mDeferStart && fragment.mState < 5) {
            i17 = java.lang.Math.min(i17, 4);
        }
        if (androidx.fragment.app.FragmentManager.isLoggingEnabled(2)) {
            java.util.Objects.toString(fragment);
        }
        return i17;
    }

    public void d() {
        boolean isLoggingEnabled = androidx.fragment.app.FragmentManager.isLoggingEnabled(3);
        androidx.fragment.app.Fragment fragment = this.f11304c;
        if (isLoggingEnabled) {
            java.util.Objects.toString(fragment);
        }
        if (fragment.mIsCreated) {
            fragment.restoreChildFragmentState(fragment.mSavedFragmentState);
            fragment.mState = 1;
            return;
        }
        android.os.Bundle bundle = fragment.mSavedFragmentState;
        androidx.fragment.app.z0 z0Var = this.f11302a;
        z0Var.h(fragment, bundle, false);
        fragment.performCreate(fragment.mSavedFragmentState);
        z0Var.c(fragment, fragment.mSavedFragmentState, false);
    }

    public void e() {
        java.lang.String str;
        androidx.fragment.app.Fragment fragment = this.f11304c;
        if (fragment.mFromLayout) {
            return;
        }
        if (androidx.fragment.app.FragmentManager.isLoggingEnabled(3)) {
            java.util.Objects.toString(fragment);
        }
        android.view.LayoutInflater performGetLayoutInflater = fragment.performGetLayoutInflater(fragment.mSavedFragmentState);
        android.view.ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup == null) {
            int i17 = fragment.mContainerId;
            if (i17 == 0) {
                viewGroup = null;
            } else {
                if (i17 == -1) {
                    throw new java.lang.IllegalArgumentException("Cannot create fragment " + fragment + " for a container view with no id");
                }
                viewGroup = (android.view.ViewGroup) fragment.mFragmentManager.getContainer().b(fragment.mContainerId);
                if (viewGroup == null && !fragment.mRestored) {
                    try {
                        str = fragment.getResources().getResourceName(fragment.mContainerId);
                    } catch (android.content.res.Resources.NotFoundException unused) {
                        str = com.eclipsesource.mmv8.Platform.UNKNOWN;
                    }
                    throw new java.lang.IllegalArgumentException("No view found for id 0x" + java.lang.Integer.toHexString(fragment.mContainerId) + " (" + str + ") for fragment " + fragment);
                }
            }
        }
        fragment.mContainer = viewGroup;
        fragment.performCreateView(performGetLayoutInflater, viewGroup, fragment.mSavedFragmentState);
        android.view.View view = fragment.mView;
        if (view != null) {
            boolean z17 = false;
            view.setSaveFromParentEnabled(false);
            fragment.mView.setTag(com.tencent.mm.R.id.gd_, fragment);
            if (viewGroup != null) {
                a();
            }
            if (fragment.mHidden) {
                android.view.View view2 = fragment.mView;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view2, arrayList.toArray(), "androidx/fragment/app/FragmentStateManager", "createView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view2, "androidx/fragment/app/FragmentStateManager", "createView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View view3 = fragment.mView;
            java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
            if (n3.x0.b(view3)) {
                n3.y0.c(fragment.mView);
            } else {
                android.view.View view4 = fragment.mView;
                view4.addOnAttachStateChangeListener(new androidx.fragment.app.b2(this, view4));
            }
            fragment.performViewCreated();
            this.f11302a.m(fragment, fragment.mView, fragment.mSavedFragmentState, false);
            int visibility = fragment.mView.getVisibility();
            float alpha = fragment.mView.getAlpha();
            if (androidx.fragment.app.FragmentManager.USE_STATE_MANAGER) {
                fragment.setPostOnViewCreatedAlpha(alpha);
                if (fragment.mContainer != null && visibility == 0) {
                    android.view.View findFocus = fragment.mView.findFocus();
                    if (findFocus != null) {
                        fragment.setFocusedView(findFocus);
                        if (androidx.fragment.app.FragmentManager.isLoggingEnabled(2)) {
                            findFocus.toString();
                            java.util.Objects.toString(fragment);
                        }
                    }
                    android.view.View view5 = fragment.mView;
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                    arrayList2.add(java.lang.Float.valueOf(0.0f));
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(view5, arrayList2.toArray(), "androidx/fragment/app/FragmentStateManager", "createView", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    view5.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
                    yj0.a.f(view5, "androidx/fragment/app/FragmentStateManager", "createView", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                }
            } else {
                if (visibility == 0 && fragment.mContainer != null) {
                    z17 = true;
                }
                fragment.mIsNewlyAdded = z17;
            }
        }
        fragment.mState = 2;
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.d2.f():void");
    }

    public void g() {
        android.view.View view;
        boolean isLoggingEnabled = androidx.fragment.app.FragmentManager.isLoggingEnabled(3);
        androidx.fragment.app.Fragment fragment = this.f11304c;
        if (isLoggingEnabled) {
            java.util.Objects.toString(fragment);
        }
        android.view.ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null && (view = fragment.mView) != null) {
            viewGroup.removeView(view);
        }
        fragment.performDestroyView();
        this.f11302a.n(fragment, false);
        fragment.mContainer = null;
        fragment.mView = null;
        fragment.mViewLifecycleOwner = null;
        fragment.mViewLifecycleOwnerLiveData.setValue(null);
        fragment.mInLayout = false;
    }

    public void h() {
        boolean isLoggingEnabled = androidx.fragment.app.FragmentManager.isLoggingEnabled(3);
        androidx.fragment.app.Fragment fragment = this.f11304c;
        if (isLoggingEnabled) {
            java.util.Objects.toString(fragment);
        }
        fragment.performDetach();
        boolean z17 = false;
        this.f11302a.e(fragment, false);
        fragment.mState = -1;
        fragment.mHost = null;
        fragment.mParentFragment = null;
        fragment.mFragmentManager = null;
        if (fragment.mRemoving && !fragment.isInBackStack()) {
            z17 = true;
        }
        if (!z17) {
            androidx.fragment.app.w1 w1Var = this.f11303b.f11314c;
            if (!(w1Var.f11502d.containsKey(fragment.mWho) ? w1Var.f11505g ? w1Var.f11506h : true ^ w1Var.f11507i : true)) {
                return;
            }
        }
        if (androidx.fragment.app.FragmentManager.isLoggingEnabled(3)) {
            java.util.Objects.toString(fragment);
        }
        fragment.initState();
    }

    public void i() {
        androidx.fragment.app.Fragment fragment = this.f11304c;
        if (fragment.mFromLayout && fragment.mInLayout && !fragment.mPerformedCreateView) {
            if (androidx.fragment.app.FragmentManager.isLoggingEnabled(3)) {
                java.util.Objects.toString(fragment);
            }
            fragment.performCreateView(fragment.performGetLayoutInflater(fragment.mSavedFragmentState), null, fragment.mSavedFragmentState);
            android.view.View view = fragment.mView;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                fragment.mView.setTag(com.tencent.mm.R.id.gd_, fragment);
                if (fragment.mHidden) {
                    android.view.View view2 = fragment.mView;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(8);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(view2, arrayList.toArray(), "androidx/fragment/app/FragmentStateManager", "ensureInflatedView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(view2, "androidx/fragment/app/FragmentStateManager", "ensureInflatedView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                fragment.performViewCreated();
                this.f11302a.m(fragment, fragment.mView, fragment.mSavedFragmentState, false);
                fragment.mState = 2;
            }
        }
    }

    public void j() {
        android.view.ViewGroup viewGroup;
        android.view.ViewGroup viewGroup2;
        android.view.ViewGroup viewGroup3;
        boolean z17 = this.f11305d;
        androidx.fragment.app.Fragment fragment = this.f11304c;
        if (z17) {
            if (androidx.fragment.app.FragmentManager.isLoggingEnabled(2)) {
                java.util.Objects.toString(fragment);
                return;
            }
            return;
        }
        try {
            this.f11305d = true;
            while (true) {
                int c17 = c();
                int i17 = fragment.mState;
                if (c17 == i17) {
                    if (androidx.fragment.app.FragmentManager.USE_STATE_MANAGER && fragment.mHiddenChanged) {
                        if (fragment.mView != null && (viewGroup = fragment.mContainer) != null) {
                            androidx.fragment.app.n3 f17 = androidx.fragment.app.n3.f(viewGroup, fragment.getParentFragmentManager());
                            boolean z18 = fragment.mHidden;
                            androidx.fragment.app.k3 k3Var = androidx.fragment.app.k3.NONE;
                            if (z18) {
                                f17.getClass();
                                if (androidx.fragment.app.FragmentManager.isLoggingEnabled(2)) {
                                    java.util.Objects.toString(fragment);
                                }
                                f17.a(androidx.fragment.app.l3.GONE, k3Var, this);
                            } else {
                                f17.getClass();
                                if (androidx.fragment.app.FragmentManager.isLoggingEnabled(2)) {
                                    java.util.Objects.toString(fragment);
                                }
                                f17.a(androidx.fragment.app.l3.VISIBLE, k3Var, this);
                            }
                        }
                        androidx.fragment.app.FragmentManager fragmentManager = fragment.mFragmentManager;
                        if (fragmentManager != null) {
                            fragmentManager.invalidateMenuForFragment(fragment);
                        }
                        fragment.mHiddenChanged = false;
                        fragment.onHiddenChanged(fragment.mHidden);
                    }
                    return;
                }
                androidx.fragment.app.z0 z0Var = this.f11302a;
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
                            fragment.mState = 1;
                            break;
                        case 2:
                            fragment.mInLayout = false;
                            fragment.mState = 2;
                            break;
                        case 3:
                            if (androidx.fragment.app.FragmentManager.isLoggingEnabled(3)) {
                                java.util.Objects.toString(fragment);
                            }
                            if (fragment.mView != null && fragment.mSavedViewState == null) {
                                n();
                            }
                            if (fragment.mView != null && (viewGroup3 = fragment.mContainer) != null) {
                                androidx.fragment.app.n3 f18 = androidx.fragment.app.n3.f(viewGroup3, fragment.getParentFragmentManager());
                                f18.getClass();
                                if (androidx.fragment.app.FragmentManager.isLoggingEnabled(2)) {
                                    java.util.Objects.toString(fragment);
                                }
                                f18.a(androidx.fragment.app.l3.REMOVED, androidx.fragment.app.k3.REMOVING, this);
                            }
                            fragment.mState = 3;
                            break;
                        case 4:
                            if (androidx.fragment.app.FragmentManager.isLoggingEnabled(3)) {
                                java.util.Objects.toString(fragment);
                            }
                            fragment.performStop();
                            z0Var.l(fragment, false);
                            break;
                        case 5:
                            fragment.mState = 5;
                            break;
                        case 6:
                            if (androidx.fragment.app.FragmentManager.isLoggingEnabled(3)) {
                                java.util.Objects.toString(fragment);
                            }
                            fragment.performPause();
                            z0Var.f(fragment, false);
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
                            if (androidx.fragment.app.FragmentManager.isLoggingEnabled(3)) {
                                java.util.Objects.toString(fragment);
                            }
                            fragment.performActivityCreated(fragment.mSavedFragmentState);
                            z0Var.a(fragment, fragment.mSavedFragmentState, false);
                            break;
                        case 4:
                            if (fragment.mView != null && (viewGroup2 = fragment.mContainer) != null) {
                                androidx.fragment.app.n3 f19 = androidx.fragment.app.n3.f(viewGroup2, fragment.getParentFragmentManager());
                                androidx.fragment.app.l3 b17 = androidx.fragment.app.l3.b(fragment.mView.getVisibility());
                                f19.getClass();
                                if (androidx.fragment.app.FragmentManager.isLoggingEnabled(2)) {
                                    java.util.Objects.toString(fragment);
                                }
                                f19.a(b17, androidx.fragment.app.k3.ADDING, this);
                            }
                            fragment.mState = 4;
                            break;
                        case 5:
                            if (androidx.fragment.app.FragmentManager.isLoggingEnabled(3)) {
                                java.util.Objects.toString(fragment);
                            }
                            fragment.performStart();
                            z0Var.k(fragment, false);
                            break;
                        case 6:
                            fragment.mState = 6;
                            break;
                        case 7:
                            l();
                            break;
                    }
                }
            }
        } finally {
            this.f11305d = false;
        }
    }

    public void k(java.lang.ClassLoader classLoader) {
        androidx.fragment.app.Fragment fragment = this.f11304c;
        android.os.Bundle bundle = fragment.mSavedFragmentState;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        fragment.mSavedViewState = fragment.mSavedFragmentState.getSparseParcelableArray("android:view_state");
        fragment.mSavedViewRegistryState = fragment.mSavedFragmentState.getBundle("android:view_registry_state");
        fragment.mTargetWho = fragment.mSavedFragmentState.getString("android:target_state");
        if (fragment.mTargetWho != null) {
            fragment.mTargetRequestCode = fragment.mSavedFragmentState.getInt("android:target_req_state", 0);
        }
        java.lang.Boolean bool = fragment.mSavedUserVisibleHint;
        if (bool != null) {
            fragment.mUserVisibleHint = bool.booleanValue();
            fragment.mSavedUserVisibleHint = null;
        } else {
            fragment.mUserVisibleHint = fragment.mSavedFragmentState.getBoolean("android:user_visible_hint", true);
        }
        if (fragment.mUserVisibleHint) {
            return;
        }
        fragment.mDeferStart = true;
    }

    public void l() {
        boolean isLoggingEnabled = androidx.fragment.app.FragmentManager.isLoggingEnabled(3);
        androidx.fragment.app.Fragment fragment = this.f11304c;
        if (isLoggingEnabled) {
            java.util.Objects.toString(fragment);
        }
        android.view.View focusedView = fragment.getFocusedView();
        if (focusedView != null) {
            boolean z17 = true;
            if (focusedView != fragment.mView) {
                android.view.ViewParent parent = focusedView.getParent();
                while (true) {
                    if (parent == null) {
                        z17 = false;
                        break;
                    } else if (parent == fragment.mView) {
                        break;
                    } else {
                        parent = parent.getParent();
                    }
                }
            }
            if (z17) {
                focusedView.requestFocus();
                if (androidx.fragment.app.FragmentManager.isLoggingEnabled(2)) {
                    focusedView.toString();
                    java.util.Objects.toString(fragment);
                    java.util.Objects.toString(fragment.mView.findFocus());
                }
            }
        }
        fragment.setFocusedView(null);
        fragment.performResume();
        this.f11302a.i(fragment, false);
        fragment.mSavedFragmentState = null;
        fragment.mSavedViewState = null;
        fragment.mSavedViewRegistryState = null;
    }

    public final android.os.Bundle m() {
        android.os.Bundle bundle = new android.os.Bundle();
        androidx.fragment.app.Fragment fragment = this.f11304c;
        fragment.performSaveInstanceState(bundle);
        this.f11302a.j(fragment, bundle, false);
        if (bundle.isEmpty()) {
            bundle = null;
        }
        if (fragment.mView != null) {
            n();
        }
        if (fragment.mSavedViewState != null) {
            if (bundle == null) {
                bundle = new android.os.Bundle();
            }
            bundle.putSparseParcelableArray("android:view_state", fragment.mSavedViewState);
        }
        if (fragment.mSavedViewRegistryState != null) {
            if (bundle == null) {
                bundle = new android.os.Bundle();
            }
            bundle.putBundle("android:view_registry_state", fragment.mSavedViewRegistryState);
        }
        if (!fragment.mUserVisibleHint) {
            if (bundle == null) {
                bundle = new android.os.Bundle();
            }
            bundle.putBoolean("android:user_visible_hint", fragment.mUserVisibleHint);
        }
        return bundle;
    }

    public void n() {
        androidx.fragment.app.Fragment fragment = this.f11304c;
        if (fragment.mView == null) {
            return;
        }
        android.util.SparseArray<android.os.Parcelable> sparseArray = new android.util.SparseArray<>();
        fragment.mView.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            fragment.mSavedViewState = sparseArray;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        fragment.mViewLifecycleOwner.f11272e.b(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        fragment.mSavedViewRegistryState = bundle;
    }

    public d2(androidx.fragment.app.z0 z0Var, androidx.fragment.app.f2 f2Var, java.lang.ClassLoader classLoader, androidx.fragment.app.u0 u0Var, androidx.fragment.app.FragmentState fragmentState) {
        this.f11302a = z0Var;
        this.f11303b = f2Var;
        androidx.fragment.app.Fragment a17 = u0Var.a(classLoader, fragmentState.f11223d);
        this.f11304c = a17;
        android.os.Bundle bundle = fragmentState.f11232p;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        a17.setArguments(bundle);
        a17.mWho = fragmentState.f11224e;
        a17.mFromLayout = fragmentState.f11225f;
        a17.mRestored = true;
        a17.mFragmentId = fragmentState.f11226g;
        a17.mContainerId = fragmentState.f11227h;
        a17.mTag = fragmentState.f11228i;
        a17.mRetainInstance = fragmentState.f11229m;
        a17.mRemoving = fragmentState.f11230n;
        a17.mDetached = fragmentState.f11231o;
        a17.mHidden = fragmentState.f11233q;
        a17.mMaxState = androidx.lifecycle.n.values()[fragmentState.f11234r];
        android.os.Bundle bundle2 = fragmentState.f11235s;
        if (bundle2 != null) {
            a17.mSavedFragmentState = bundle2;
        } else {
            a17.mSavedFragmentState = new android.os.Bundle();
        }
        if (androidx.fragment.app.FragmentManager.isLoggingEnabled(2)) {
            java.util.Objects.toString(a17);
        }
    }

    public d2(androidx.fragment.app.z0 z0Var, androidx.fragment.app.f2 f2Var, androidx.fragment.app.Fragment fragment, androidx.fragment.app.FragmentState fragmentState) {
        this.f11302a = z0Var;
        this.f11303b = f2Var;
        this.f11304c = fragment;
        fragment.mSavedViewState = null;
        fragment.mSavedViewRegistryState = null;
        fragment.mBackStackNesting = 0;
        fragment.mInLayout = false;
        fragment.mAdded = false;
        androidx.fragment.app.Fragment fragment2 = fragment.mTarget;
        fragment.mTargetWho = fragment2 != null ? fragment2.mWho : null;
        fragment.mTarget = null;
        android.os.Bundle bundle = fragmentState.f11235s;
        if (bundle != null) {
            fragment.mSavedFragmentState = bundle;
        } else {
            fragment.mSavedFragmentState = new android.os.Bundle();
        }
    }
}
