package androidx.fragment.app;

/* loaded from: classes14.dex */
public class x0 implements android.view.LayoutInflater.Factory2 {

    /* renamed from: d, reason: collision with root package name */
    public final androidx.fragment.app.FragmentManager f11512d;

    public x0(androidx.fragment.app.FragmentManager fragmentManager) {
        this.f11512d = fragmentManager;
    }

    @Override // android.view.LayoutInflater.Factory
    public android.view.View onCreateView(java.lang.String str, android.content.Context context, android.util.AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory2
    public android.view.View onCreateView(android.view.View view, java.lang.String str, android.content.Context context, android.util.AttributeSet attributeSet) {
        boolean z17;
        androidx.fragment.app.d2 createOrGetFragmentStateManager;
        boolean equals = androidx.fragment.app.FragmentContainerView.class.getName().equals(str);
        androidx.fragment.app.FragmentManager fragmentManager = this.f11512d;
        if (equals) {
            return new androidx.fragment.app.FragmentContainerView(context, attributeSet, fragmentManager);
        }
        if (!"fragment".equals(str)) {
            return null;
        }
        java.lang.String attributeValue = attributeSet.getAttributeValue(null, "class");
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, v3.a.f433080a);
        if (attributeValue == null) {
            attributeValue = obtainStyledAttributes.getString(0);
        }
        int resourceId = obtainStyledAttributes.getResourceId(1, -1);
        java.lang.String string = obtainStyledAttributes.getString(2);
        obtainStyledAttributes.recycle();
        if (attributeValue != null) {
            try {
                z17 = androidx.fragment.app.Fragment.class.isAssignableFrom(androidx.fragment.app.u0.b(context.getClassLoader(), attributeValue));
            } catch (java.lang.ClassNotFoundException unused) {
                z17 = false;
            }
            if (z17) {
                int id6 = view != null ? view.getId() : 0;
                if (id6 == -1 && resourceId == -1 && string == null) {
                    throw new java.lang.IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                }
                androidx.fragment.app.Fragment findFragmentById = resourceId != -1 ? fragmentManager.findFragmentById(resourceId) : null;
                if (findFragmentById == null && string != null) {
                    findFragmentById = fragmentManager.findFragmentByTag(string);
                }
                if (findFragmentById == null && id6 != -1) {
                    findFragmentById = fragmentManager.findFragmentById(id6);
                }
                if (findFragmentById == null) {
                    findFragmentById = fragmentManager.getFragmentFactory().a(context.getClassLoader(), attributeValue);
                    findFragmentById.mFromLayout = true;
                    findFragmentById.mFragmentId = resourceId != 0 ? resourceId : id6;
                    findFragmentById.mContainerId = id6;
                    findFragmentById.mTag = string;
                    findFragmentById.mInLayout = true;
                    findFragmentById.mFragmentManager = fragmentManager;
                    findFragmentById.mHost = fragmentManager.getHost();
                    findFragmentById.onInflate(fragmentManager.getHost().f11494e, attributeSet, findFragmentById.mSavedFragmentState);
                    createOrGetFragmentStateManager = fragmentManager.addFragment(findFragmentById);
                    if (androidx.fragment.app.FragmentManager.isLoggingEnabled(2)) {
                        findFragmentById.toString();
                        java.lang.Integer.toHexString(resourceId);
                    }
                } else if (!findFragmentById.mInLayout) {
                    findFragmentById.mInLayout = true;
                    findFragmentById.mFragmentManager = fragmentManager;
                    findFragmentById.mHost = fragmentManager.getHost();
                    findFragmentById.onInflate(fragmentManager.getHost().f11494e, attributeSet, findFragmentById.mSavedFragmentState);
                    createOrGetFragmentStateManager = fragmentManager.createOrGetFragmentStateManager(findFragmentById);
                    if (androidx.fragment.app.FragmentManager.isLoggingEnabled(2)) {
                        findFragmentById.toString();
                        java.lang.Integer.toHexString(resourceId);
                    }
                } else {
                    throw new java.lang.IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + java.lang.Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + java.lang.Integer.toHexString(id6) + " with another fragment for " + attributeValue);
                }
                findFragmentById.mContainer = (android.view.ViewGroup) view;
                createOrGetFragmentStateManager.j();
                createOrGetFragmentStateManager.i();
                android.view.View view2 = findFragmentById.mView;
                if (view2 != null) {
                    if (resourceId != 0) {
                        view2.setId(resourceId);
                    }
                    if (findFragmentById.mView.getTag() == null) {
                        findFragmentById.mView.setTag(string);
                    }
                    findFragmentById.mView.addOnAttachStateChangeListener(new androidx.fragment.app.w0(this, createOrGetFragmentStateManager));
                    return findFragmentById.mView;
                }
                throw new java.lang.IllegalStateException("Fragment " + attributeValue + " did not create a view.");
            }
        }
        return null;
    }
}
