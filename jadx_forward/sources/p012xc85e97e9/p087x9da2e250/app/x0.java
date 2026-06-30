package p012xc85e97e9.p087x9da2e250.app;

/* loaded from: classes14.dex */
public class x0 implements android.view.LayoutInflater.Factory2 {

    /* renamed from: d, reason: collision with root package name */
    public final p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d f93045d;

    public x0(p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d abstractC1104xc1ad431d) {
        this.f93045d = abstractC1104xc1ad431d;
    }

    @Override // android.view.LayoutInflater.Factory
    public android.view.View onCreateView(java.lang.String str, android.content.Context context, android.util.AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory2
    public android.view.View onCreateView(android.view.View view, java.lang.String str, android.content.Context context, android.util.AttributeSet attributeSet) {
        boolean z17;
        p012xc85e97e9.p087x9da2e250.app.d2 m7635xc28835c3;
        boolean equals = p012xc85e97e9.p087x9da2e250.app.C1103x8ca9b236.class.getName().equals(str);
        p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d abstractC1104xc1ad431d = this.f93045d;
        if (equals) {
            return new p012xc85e97e9.p087x9da2e250.app.C1103x8ca9b236(context, attributeSet, abstractC1104xc1ad431d);
        }
        if (!"fragment".equals(str)) {
            return null;
        }
        java.lang.String attributeValue = attributeSet.getAttributeValue(null, "class");
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, v3.a.f514613a);
        if (attributeValue == null) {
            attributeValue = obtainStyledAttributes.getString(0);
        }
        int resourceId = obtainStyledAttributes.getResourceId(1, -1);
        java.lang.String string = obtainStyledAttributes.getString(2);
        obtainStyledAttributes.recycle();
        if (attributeValue != null) {
            try {
                z17 = p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670.class.isAssignableFrom(p012xc85e97e9.p087x9da2e250.app.u0.b(context.getClassLoader(), attributeValue));
            } catch (java.lang.ClassNotFoundException unused) {
                z17 = false;
            }
            if (z17) {
                int id6 = view != null ? view.getId() : 0;
                if (id6 == -1 && resourceId == -1 && string == null) {
                    throw new java.lang.IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                }
                p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 m7664x6f4c869b = resourceId != -1 ? abstractC1104xc1ad431d.m7664x6f4c869b(resourceId) : null;
                if (m7664x6f4c869b == null && string != null) {
                    m7664x6f4c869b = abstractC1104xc1ad431d.m7665x7a44761a(string);
                }
                if (m7664x6f4c869b == null && id6 != -1) {
                    m7664x6f4c869b = abstractC1104xc1ad431d.m7664x6f4c869b(id6);
                }
                if (m7664x6f4c869b == null) {
                    m7664x6f4c869b = abstractC1104xc1ad431d.m7673x6e9e7e64().a(context.getClassLoader(), attributeValue);
                    m7664x6f4c869b.f3428x4fd80fc1 = true;
                    m7664x6f4c869b.f3426x9ca58fd8 = resourceId != 0 ? resourceId : id6;
                    m7664x6f4c869b.f3421xb66d4acf = id6;
                    m7664x6f4c869b.f3457x32d3ed = string;
                    m7664x6f4c869b.f3433x2866c3c = true;
                    m7664x6f4c869b.f3427xccc8bb10 = abstractC1104xc1ad431d;
                    m7664x6f4c869b.f3432x6226bb5 = abstractC1104xc1ad431d.m7676xfb805e1e();
                    m7664x6f4c869b.m7508xc3995328(abstractC1104xc1ad431d.m7676xfb805e1e().f93027e, attributeSet, m7664x6f4c869b.f3451x806a1427);
                    m7635xc28835c3 = abstractC1104xc1ad431d.m7623x63908e11(m7664x6f4c869b);
                    if (p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d.m7619x11f226ac(2)) {
                        m7664x6f4c869b.mo7591x9616526c();
                        java.lang.Integer.toHexString(resourceId);
                    }
                } else if (!m7664x6f4c869b.f3433x2866c3c) {
                    m7664x6f4c869b.f3433x2866c3c = true;
                    m7664x6f4c869b.f3427xccc8bb10 = abstractC1104xc1ad431d;
                    m7664x6f4c869b.f3432x6226bb5 = abstractC1104xc1ad431d.m7676xfb805e1e();
                    m7664x6f4c869b.m7508xc3995328(abstractC1104xc1ad431d.m7676xfb805e1e().f93027e, attributeSet, m7664x6f4c869b.f3451x806a1427);
                    m7635xc28835c3 = abstractC1104xc1ad431d.m7635xc28835c3(m7664x6f4c869b);
                    if (p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d.m7619x11f226ac(2)) {
                        m7664x6f4c869b.mo7591x9616526c();
                        java.lang.Integer.toHexString(resourceId);
                    }
                } else {
                    throw new java.lang.IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + java.lang.Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + java.lang.Integer.toHexString(id6) + " with another fragment for " + attributeValue);
                }
                m7664x6f4c869b.f3420x62389694 = (android.view.ViewGroup) view;
                m7635xc28835c3.j();
                m7635xc28835c3.i();
                android.view.View view2 = m7664x6f4c869b.f3462x628b0b2;
                if (view2 != null) {
                    if (resourceId != 0) {
                        view2.setId(resourceId);
                    }
                    if (m7664x6f4c869b.f3462x628b0b2.getTag() == null) {
                        m7664x6f4c869b.f3462x628b0b2.setTag(string);
                    }
                    m7664x6f4c869b.f3462x628b0b2.addOnAttachStateChangeListener(new p012xc85e97e9.p087x9da2e250.app.w0(this, m7635xc28835c3));
                    return m7664x6f4c869b.f3462x628b0b2;
                }
                throw new java.lang.IllegalStateException("Fragment " + attributeValue + " did not create a view.");
            }
        }
        return null;
    }
}
