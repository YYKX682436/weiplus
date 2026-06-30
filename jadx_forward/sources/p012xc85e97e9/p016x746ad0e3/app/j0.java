package p012xc85e97e9.p016x746ad0e3.app;

/* loaded from: classes12.dex */
public class j0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f90687d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f90688e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.reflect.Method f90689f;

    /* renamed from: g, reason: collision with root package name */
    public android.content.Context f90690g;

    public j0(android.view.View view, java.lang.String str) {
        this.f90687d = view;
        this.f90688e = str;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.lang.String str;
        java.lang.reflect.Method method;
        if (this.f90689f == null) {
            android.view.View view2 = this.f90687d;
            android.content.Context context = view2.getContext();
            while (true) {
                java.lang.String str2 = this.f90688e;
                if (context == null) {
                    int id6 = view2.getId();
                    if (id6 == -1) {
                        str = "";
                    } else {
                        str = " with id '" + view2.getContext().getResources().getResourceEntryName(id6) + "'";
                    }
                    throw new java.lang.IllegalStateException("Could not find method " + str2 + "(View) in a parent or ancestor Context for android:onClick attribute defined on view " + view2.getClass() + str);
                }
                try {
                    if (!context.isRestricted() && (method = context.getClass().getMethod(str2, android.view.View.class)) != null) {
                        this.f90689f = method;
                        this.f90690g = context;
                    }
                } catch (java.lang.NoSuchMethodException unused) {
                }
                context = context instanceof android.content.ContextWrapper ? ((android.content.ContextWrapper) context).getBaseContext() : null;
            }
        }
        try {
            this.f90689f.invoke(this.f90690g, view);
        } catch (java.lang.IllegalAccessException e17) {
            throw new java.lang.IllegalStateException("Could not execute non-public method for android:onClick", e17);
        } catch (java.lang.reflect.InvocationTargetException e18) {
            throw new java.lang.IllegalStateException("Could not execute method for android:onClick", e18);
        }
    }
}
