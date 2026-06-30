package p012xc85e97e9.p016x746ad0e3.p019xd1075a44;

/* loaded from: classes15.dex */
public class x1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0100x4c79dc8d f91268d;

    public x1(p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0100x4c79dc8d c0100x4c79dc8d) {
        this.f91268d = c0100x4c79dc8d;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0100x4c79dc8d c0100x4c79dc8d = this.f91268d;
        android.widget.ImageView imageView = c0100x4c79dc8d.f90982z;
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0100x4c79dc8d.SearchAutoComplete searchAutoComplete = c0100x4c79dc8d.f90974v;
        if (view == imageView) {
            c0100x4c79dc8d.y(false);
            searchAutoComplete.requestFocus();
            searchAutoComplete.m2767x1359fc71(true);
            android.view.View.OnClickListener onClickListener = c0100x4c79dc8d.S;
            if (onClickListener != null) {
                onClickListener.onClick(c0100x4c79dc8d);
                return;
            }
            return;
        }
        if (view == c0100x4c79dc8d.B) {
            c0100x4c79dc8d.n();
            return;
        }
        if (view == c0100x4c79dc8d.A) {
            c0100x4c79dc8d.s();
            return;
        }
        if (view != c0100x4c79dc8d.C) {
            if (view == searchAutoComplete) {
                p012xc85e97e9.p016x746ad0e3.p019xd1075a44.c2 c2Var = p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0100x4c79dc8d.F1;
                java.lang.reflect.Method method = c2Var.f91070a;
                if (method != null) {
                    try {
                        method.invoke(searchAutoComplete, new java.lang.Object[0]);
                    } catch (java.lang.Exception unused) {
                    }
                }
                java.lang.reflect.Method method2 = c2Var.f91071b;
                if (method2 != null) {
                    method2.invoke(searchAutoComplete, new java.lang.Object[0]);
                }
                return;
            }
            return;
        }
        android.app.SearchableInfo searchableInfo = c0100x4c79dc8d.A1;
        if (searchableInfo != null) {
            try {
                if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                    android.content.Intent intent = new android.content.Intent(c0100x4c79dc8d.N);
                    android.content.ComponentName searchActivity = searchableInfo.getSearchActivity();
                    intent.putExtra("calling_package", searchActivity == null ? null : searchActivity.flattenToShortString());
                    android.content.Context context = c0100x4c79dc8d.getContext();
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(intent);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(context, arrayList.toArray(), "androidx/appcompat/widget/SearchView", "onVoiceClicked", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    context.startActivity((android.content.Intent) arrayList.get(0));
                    yj0.a.f(context, "androidx/appcompat/widget/SearchView", "onVoiceClicked", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    return;
                }
                if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                    android.content.Intent l17 = c0100x4c79dc8d.l(c0100x4c79dc8d.P, searchableInfo);
                    android.content.Context context2 = c0100x4c79dc8d.getContext();
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    arrayList2.add(l17);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(context2, arrayList2.toArray(), "androidx/appcompat/widget/SearchView", "onVoiceClicked", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    context2.startActivity((android.content.Intent) arrayList2.get(0));
                    yj0.a.f(context2, "androidx/appcompat/widget/SearchView", "onVoiceClicked", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                }
            } catch (android.content.ActivityNotFoundException | java.lang.Exception unused2) {
            }
        }
    }
}
